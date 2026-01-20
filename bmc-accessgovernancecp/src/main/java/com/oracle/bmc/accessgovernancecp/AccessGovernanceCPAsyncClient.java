/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.accessgovernancecp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.accessgovernancecp.requests.*;
import com.oracle.bmc.accessgovernancecp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AccessGovernanceCP service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220518")
public class AccessGovernanceCPAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AccessGovernanceCPAsync {
    /** Service instance for AccessGovernanceCP. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(AccessGovernanceCPClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cp-prod.access-governance.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AccessGovernanceCPAsyncClient.class);

    AccessGovernanceCPAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, AccessGovernanceCPAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "accessgovernancecp";
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
        public AccessGovernanceCPAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AccessGovernanceCPAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeGovernanceInstanceCompartmentResponse>
            changeGovernanceInstanceCompartment(
                    ChangeGovernanceInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGovernanceInstanceCompartmentRequest,
                                    ChangeGovernanceInstanceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeGovernanceInstanceCompartmentDetails(),
                "changeGovernanceInstanceCompartmentDetails is required");

        return clientCall(request, ChangeGovernanceInstanceCompartmentResponse::builder)
                .logger(LOG, "changeGovernanceInstanceCompartment")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "ChangeGovernanceInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/ChangeGovernanceInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGovernanceInstanceCompartmentRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeGovernanceInstanceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGovernanceInstanceResponse> createGovernanceInstance(
            CreateGovernanceInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGovernanceInstanceRequest, CreateGovernanceInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateGovernanceInstanceDetails(),
                "createGovernanceInstanceDetails is required");

        return clientCall(request, CreateGovernanceInstanceResponse::builder)
                .logger(LOG, "createGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "CreateGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/CreateGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        CreateGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", CreateGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGovernanceInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGovernanceInstanceResponse> deleteGovernanceInstance(
            DeleteGovernanceInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGovernanceInstanceRequest, DeleteGovernanceInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, DeleteGovernanceInstanceResponse::builder)
                .logger(LOG, "deleteGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "DeleteGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/DeleteGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGovernanceInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGovernanceInstanceResponse> getGovernanceInstance(
            GetGovernanceInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGovernanceInstanceRequest, GetGovernanceInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, GetGovernanceInstanceResponse::builder)
                .logger(LOG, "getGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "GetGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/GetGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        GetGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", GetGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGovernanceInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGovernanceInstanceConfigurationResponse>
            getGovernanceInstanceConfiguration(
                    GetGovernanceInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetGovernanceInstanceConfigurationRequest,
                                    GetGovernanceInstanceConfigurationResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetGovernanceInstanceConfigurationResponse::builder)
                .logger(LOG, "getGovernanceInstanceConfiguration")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "GetGovernanceInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstanceConfiguration/GetGovernanceInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceInstanceConfigurationRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceConfiguration
                                .class,
                        GetGovernanceInstanceConfigurationResponse.Builder
                                ::governanceInstanceConfiguration)
                .handleResponseHeaderString(
                        "etag", GetGovernanceInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetGovernanceInstanceConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGovernanceInstancesResponse> listGovernanceInstances(
            ListGovernanceInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGovernanceInstancesRequest, ListGovernanceInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGovernanceInstancesResponse::builder)
                .logger(LOG, "listGovernanceInstances")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "ListGovernanceInstances",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstanceCollection/ListGovernanceInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGovernanceInstancesRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceCollection.class,
                        ListGovernanceInstancesResponse.Builder::governanceInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGovernanceInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGovernanceInstancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGovernanceInstanceResponse> updateGovernanceInstance(
            UpdateGovernanceInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGovernanceInstanceRequest, UpdateGovernanceInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateGovernanceInstanceDetails(),
                "updateGovernanceInstanceDetails is required");

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, UpdateGovernanceInstanceResponse::builder)
                .logger(LOG, "updateGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "UpdateGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/UpdateGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        UpdateGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", UpdateGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGovernanceInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGovernanceInstanceConfigurationResponse>
            updateGovernanceInstanceConfiguration(
                    UpdateGovernanceInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateGovernanceInstanceConfigurationRequest,
                                    UpdateGovernanceInstanceConfigurationResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateGovernanceInstanceConfigurationDetails(),
                "updateGovernanceInstanceConfigurationDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UpdateGovernanceInstanceConfigurationResponse::builder)
                .logger(LOG, "updateGovernanceInstanceConfiguration")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "UpdateGovernanceInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/UpdateGovernanceInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceInstanceConfigurationRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceConfiguration
                                .class,
                        UpdateGovernanceInstanceConfigurationResponse.Builder
                                ::governanceInstanceConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateGovernanceInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceInstanceConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateGovernanceInstanceConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
    public AccessGovernanceCPAsyncClient(
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
