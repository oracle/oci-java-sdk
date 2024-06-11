/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmconfig.requests.*;
import com.oracle.bmc.apmconfig.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Config service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class ConfigAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ConfigAsync {
    /** Service instance for Config. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CONFIG")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-config.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigAsyncClient.class);

    ConfigAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ConfigAsyncClient> {
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
        public ConfigAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ConfigAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateConfigResponse> createConfig(
            CreateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateConfigRequest, CreateConfigResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        CreateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", CreateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResponse> deleteConfig(
            DeleteConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteConfigRequest, DeleteConfigResponse>
                    handler) {
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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResponse> getConfig(
            GetConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        GetConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", GetConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResponse> listConfigs(
            ListConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListConfigsRequest, ListConfigsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.apmconfig.model.ConfigCollection.class,
                        ListConfigsResponse.Builder::configCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveNamespaceMetricsResponse> retrieveNamespaceMetrics(
            RetrieveNamespaceMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveNamespaceMetricsRequest, RetrieveNamespaceMetricsResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.NamespaceMetricCollection.class,
                        RetrieveNamespaceMetricsResponse.Builder::namespaceMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveNamespaceMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RetrieveNamespaceMetricsResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveNamespacesResponse> retrieveNamespaces(
            RetrieveNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveNamespacesRequest, RetrieveNamespacesResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.apmconfig.model.NamespaceCollection.class,
                        RetrieveNamespacesResponse.Builder::namespaceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RetrieveNamespacesResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestResponse> test(
            TestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<TestRequest, TestResponse> handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.TestOutput.class,
                        TestResponse.Builder::testOutput)
                .handleResponseHeaderString("opc-request-id", TestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", TestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResponse> updateConfig(
            UpdateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateConfigRequest, UpdateConfigResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmconfig.model.Config.class,
                        UpdateConfigResponse.Builder::config)
                .handleResponseHeaderString("etag", UpdateConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateSpanFilterPatternResponse> validateSpanFilterPattern(
            ValidateSpanFilterPatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateSpanFilterPatternRequest, ValidateSpanFilterPatternResponse>
                    handler) {
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ValidateSpanFilterPatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
    public ConfigAsyncClient(
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
