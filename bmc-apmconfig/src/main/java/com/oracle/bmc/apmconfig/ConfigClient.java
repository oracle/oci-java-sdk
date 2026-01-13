/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmconfig.requests.*;
import com.oracle.bmc.apmconfig.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class ConfigClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Config {
    /** Service instance for Config. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ConfigClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-config.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigClient.class);

    private final ConfigPaginators paginators;

    ConfigClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ConfigPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ConfigClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmconfig";
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
        public ConfigClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ConfigClient(this, authenticationDetailsProvider);
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
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCopyConfigurationDetails(), "copyConfigurationDetails is required");

        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getApmTargetDomainId(), "apmTargetDomainId is required");

        return clientCall(request, CopyConfigurationResponse::builder)
                .logger(LOG, "copyConfiguration")
                .serviceDetails(
                        "Config",
                        "CopyConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/ExportConfigurationDetails/CopyConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyConfigurationRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("copyConfiguration")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("apmTargetDomainId", request.getApmTargetDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.ImportConfigurationFailedItemsCollection
                                .class,
                        CopyConfigurationResponse.Builder::importConfigurationFailedItemsCollection)
                .handleResponseHeaderString("etag", CopyConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateConfigResponse createConfig(CreateConfigRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getCreateConfigDetails(), "createConfigDetails is required");

        return clientCall(request, CreateConfigResponse::builder)
                .logger(LOG, "createConfig")
                .serviceDetails(
                        "Config",
                        "CreateConfig",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/Config/CreateConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigRequest::builder)
                .basePath("/20210201")
                .appendPathParam("configs")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        CreateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", CreateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConfigResponse deleteConfig(DeleteConfigRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getConfigId(), "configId must not be blank");

        return clientCall(request, DeleteConfigResponse::builder)
                .logger(LOG, "deleteConfig")
                .serviceDetails(
                        "Config",
                        "DeleteConfig",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/Config/DeleteConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConfigRequest::builder)
                .basePath("/20210201")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportConfigurationResponse exportConfiguration(ExportConfigurationRequest request) {
        Objects.requireNonNull(
                request.getExportConfigurationDetails(), "exportConfigurationDetails is required");

        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ExportConfigurationResponse::builder)
                .logger(LOG, "exportConfiguration")
                .serviceDetails(
                        "Config",
                        "ExportConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/ExportConfigurationDetails/ExportConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportConfigurationRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("exportConfiguration")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.ExportConfigurationResponseDetails.class,
                        ExportConfigurationResponse.Builder::exportConfigurationResponseDetails)
                .handleResponseHeaderString("etag", ExportConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConfigResponse getConfig(GetConfigRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getConfigId(), "configId must not be blank");

        return clientCall(request, GetConfigResponse::builder)
                .logger(LOG, "getConfig")
                .serviceDetails(
                        "Config",
                        "GetConfig",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/Config/GetConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigRequest::builder)
                .basePath("/20210201")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        GetConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", GetConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMatchAgentsWithAttributeKeyResponse getMatchAgentsWithAttributeKey(
            GetMatchAgentsWithAttributeKeyRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, GetMatchAgentsWithAttributeKeyResponse::builder)
                .logger(LOG, "getMatchAgentsWithAttributeKey")
                .serviceDetails(
                        "Config",
                        "GetMatchAgentsWithAttributeKey",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/MatchAgentsWithAttributeKey/GetMatchAgentsWithAttributeKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMatchAgentsWithAttributeKeyRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("matchAgentsWithAttributeKey")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.MatchAgentsWithAttributeKey.class,
                        GetMatchAgentsWithAttributeKeyResponse.Builder::matchAgentsWithAttributeKey)
                .handleResponseHeaderString(
                        "etag", GetMatchAgentsWithAttributeKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMatchAgentsWithAttributeKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportConfigurationResponse importConfiguration(ImportConfigurationRequest request) {
        Objects.requireNonNull(
                request.getImportConfigurationDetails(), "importConfigurationDetails is required");

        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ImportConfigurationResponse::builder)
                .logger(LOG, "importConfiguration")
                .serviceDetails(
                        "Config",
                        "ImportConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/ImportConfigurationDetails/ImportConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportConfigurationRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("importConfiguration")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.ImportConfigurationFailedItemsCollection
                                .class,
                        ImportConfigurationResponse.Builder
                                ::importConfigurationFailedItemsCollection)
                .handleResponseHeaderString("etag", ImportConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ImportConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListConfigsResponse listConfigs(ListConfigsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListConfigsResponse::builder)
                .logger(LOG, "listConfigs")
                .serviceDetails(
                        "Config",
                        "ListConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/ConfigCollection/ListConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("configs")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("configType", request.getConfigType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("optionsGroup", request.getOptionsGroup())
                .appendListQueryParam(
                        "definedTagEquals",
                        request.getDefinedTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagEquals",
                        request.getFreeformTagEquals(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "definedTagExists",
                        request.getDefinedTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "freeformTagExists",
                        request.getFreeformTagExists(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.ConfigCollection.class,
                        ListConfigsResponse.Builder::configCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RetrieveNamespaceMetricsResponse retrieveNamespaceMetrics(
            RetrieveNamespaceMetricsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getRetrieveNamespaceMetricsDetails(),
                "retrieveNamespaceMetricsDetails is required");

        return clientCall(request, RetrieveNamespaceMetricsResponse::builder)
                .logger(LOG, "retrieveNamespaceMetrics")
                .serviceDetails(
                        "Config",
                        "RetrieveNamespaceMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/MetricGroup/RetrieveNamespaceMetrics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveNamespaceMetricsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("retrieveNamespaceMetrics")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.NamespaceMetricCollection.class,
                        RetrieveNamespaceMetricsResponse.Builder::namespaceMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveNamespaceMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RetrieveNamespaceMetricsResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RetrieveNamespacesResponse retrieveNamespaces(RetrieveNamespacesRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, RetrieveNamespacesResponse::builder)
                .logger(LOG, "retrieveNamespaces")
                .serviceDetails(
                        "Config",
                        "RetrieveNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/MetricGroup/RetrieveNamespaces")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveNamespacesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("retrieveNamespaces")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.NamespaceCollection.class,
                        RetrieveNamespacesResponse.Builder::namespaceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RetrieveNamespacesResponse.Builder::etag)
                .callSync();
    }

    @Override
    public TestResponse test(TestRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getTestDetails(), "testDetails is required");

        return clientCall(request, TestResponse::builder)
                .logger(LOG, "test")
                .serviceDetails(
                        "Config",
                        "Test",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/TestOutput/Test")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("test")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.TestOutput.class,
                        TestResponse.Builder::testOutput)
                .handleResponseHeaderString("opc-request-id", TestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", TestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getConfigId(), "configId must not be blank");
        Objects.requireNonNull(request.getUpdateConfigDetails(), "updateConfigDetails is required");

        return clientCall(request, UpdateConfigResponse::builder)
                .logger(LOG, "updateConfig")
                .serviceDetails(
                        "Config",
                        "UpdateConfig",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/Config/UpdateConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigRequest::builder)
                .basePath("/20210201")
                .appendPathParam("configs")
                .appendPathParam(request.getConfigId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        UpdateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", UpdateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMatchAgentsWithAttributeKeyResponse updateMatchAgentsWithAttributeKey(
            UpdateMatchAgentsWithAttributeKeyRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getUpdateMatchAgentsWithAttributeKeyDetails(),
                "updateMatchAgentsWithAttributeKeyDetails is required");

        return clientCall(request, UpdateMatchAgentsWithAttributeKeyResponse::builder)
                .logger(LOG, "updateMatchAgentsWithAttributeKey")
                .serviceDetails(
                        "Config",
                        "UpdateMatchAgentsWithAttributeKey",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/MatchAgentsWithAttributeKey/UpdateMatchAgentsWithAttributeKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMatchAgentsWithAttributeKeyRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("matchAgentsWithAttributeKey")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.MatchAgentsWithAttributeKey.class,
                        UpdateMatchAgentsWithAttributeKeyResponse.Builder
                                ::matchAgentsWithAttributeKey)
                .handleResponseHeaderString(
                        "etag", UpdateMatchAgentsWithAttributeKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMatchAgentsWithAttributeKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateSpanFilterPatternResponse validateSpanFilterPattern(
            ValidateSpanFilterPatternRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getValidateSpanFilterPatternDetails(),
                "validateSpanFilterPatternDetails is required");

        return clientCall(request, ValidateSpanFilterPatternResponse::builder)
                .logger(LOG, "validateSpanFilterPattern")
                .serviceDetails(
                        "Config",
                        "ValidateSpanFilterPattern",
                        "https://docs.oracle.com/iaas/api/#/en/apm-config/20210201/SpanFilter/ValidateSpanFilterPattern")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateSpanFilterPatternRequest::builder)
                .basePath("/20210201")
                .appendPathParam("actions")
                .appendPathParam("validateSpanFilterPattern")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ValidateSpanFilterPatternResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ConfigClient(
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
    public ConfigClient(
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
    public ConfigClient(
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
    public ConfigClient(
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
    public ConfigClient(
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
    public ConfigClient(
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
    public ConfigClient(
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
