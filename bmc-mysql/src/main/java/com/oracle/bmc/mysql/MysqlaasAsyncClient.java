/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Mysqlaas service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class MysqlaasAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MysqlaasAsync {
    /** Service instance for Mysqlaas. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(MysqlaasClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MysqlaasAsyncClient.class);

    MysqlaasAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MysqlaasAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mysql";
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
        public MysqlaasAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MysqlaasAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateConfigurationResponse> createConfiguration(
            CreateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConfigurationRequest, CreateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConfigurationDetails(), "createConfigurationDetails is required");

        return clientCall(request, CreateConfigurationResponse::builder)
                .logger(LOG, "createConfiguration")
                .serviceDetails("Mysqlaas", "CreateConfiguration", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigurationRequest::builder)
                .basePath("/20190415")
                .appendPathParam("configurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Configuration.class,
                        CreateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString(
                        "location", CreateConfigurationResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConfigurationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationResponse> deleteConfiguration(
            DeleteConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConfigurationRequest, DeleteConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");

        return clientCall(request, DeleteConfigurationResponse::builder)
                .logger(LOG, "deleteConfiguration")
                .serviceDetails(
                        "Mysqlaas",
                        "DeleteConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Configuration/DeleteConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConfigurationRequest::builder)
                .basePath("/20190415")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "Mysqlaas",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20190415")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResponse> listConfigurations(
            ListConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConfigurationsRequest, ListConfigurationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConfigurationsResponse::builder)
                .logger(LOG, "listConfigurations")
                .serviceDetails(
                        "Mysqlaas",
                        "ListConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/ConfigurationSummary/ListConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigurationsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("configurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("configurationId", request.getConfigurationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("shapeName", request.getShapeName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.ConfigurationSummary.class,
                        ListConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigurationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListShapesResponse::builder)
                .logger(LOG, "listShapes")
                .serviceDetails(
                        "Mysqlaas",
                        "ListShapes",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/ShapeSummary/ListShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListShapesRequest::builder)
                .basePath("/20190415")
                .appendPathParam("shapes")
                .appendListQueryParam(
                        "isSupportedFor",
                        request.getIsSupportedFor(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.ShapeSummary.class,
                        ListShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListShapesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVersionsResponse> listVersions(
            ListVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVersionsRequest, ListVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVersionsResponse::builder)
                .logger(LOG, "listVersions")
                .serviceDetails(
                        "Mysqlaas",
                        "ListVersions",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/VersionSummary/ListVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVersionsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("versions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.VersionSummary.class,
                        ListVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConfigurationDetails(), "updateConfigurationDetails is required");

        return clientCall(request, UpdateConfigurationResponse::builder)
                .logger(LOG, "updateConfiguration")
                .serviceDetails(
                        "Mysqlaas",
                        "UpdateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Configuration/UpdateConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationRequest::builder)
                .basePath("/20190415")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Configuration.class,
                        UpdateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", UpdateConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
    public MysqlaasAsyncClient(
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
