/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class LifecycleEnvironmentClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LifecycleEnvironment {
    /** Service instance for LifecycleEnvironment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LIFECYCLEENVIRONMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LifecycleEnvironmentClient.class);

    private final LifecycleEnvironmentWaiters waiters;

    private final LifecycleEnvironmentPaginators paginators;

    LifecycleEnvironmentClient(
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
                                    .nameFormat("LifecycleEnvironment-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LifecycleEnvironmentWaiters(executorService, this);

        this.paginators = new LifecycleEnvironmentPaginators(this);
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
                    Builder, LifecycleEnvironmentClient> {
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
        public LifecycleEnvironmentClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LifecycleEnvironmentClient(
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
    public AttachManagedInstancesToLifecycleStageResponse attachManagedInstancesToLifecycleStage(
            AttachManagedInstancesToLifecycleStageRequest request) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getAttachManagedInstancesToLifecycleStageDetails(),
                "attachManagedInstancesToLifecycleStageDetails is required");

        return clientCall(request, AttachManagedInstancesToLifecycleStageResponse::builder)
                .logger(LOG, "attachManagedInstancesToLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment", "AttachManagedInstancesToLifecycleStage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachManagedInstancesToLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("attachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachManagedInstancesToLifecycleStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachManagedInstancesToLifecycleStageResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLifecycleEnvironmentResponse createLifecycleEnvironment(
            CreateLifecycleEnvironmentRequest request) {
        Objects.requireNonNull(
                request.getCreateLifecycleEnvironmentDetails(),
                "createLifecycleEnvironmentDetails is required");

        return clientCall(request, CreateLifecycleEnvironmentResponse::builder)
                .logger(LOG, "createLifecycleEnvironment")
                .serviceDetails("LifecycleEnvironment", "CreateLifecycleEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        CreateLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString(
                        "etag", CreateLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLifecycleEnvironmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteLifecycleEnvironmentResponse deleteLifecycleEnvironment(
            DeleteLifecycleEnvironmentRequest request) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");

        return clientCall(request, DeleteLifecycleEnvironmentResponse::builder)
                .logger(LOG, "deleteLifecycleEnvironment")
                .serviceDetails("LifecycleEnvironment", "DeleteLifecycleEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLifecycleEnvironmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DetachManagedInstancesFromLifecycleStageResponse
            detachManagedInstancesFromLifecycleStage(
                    DetachManagedInstancesFromLifecycleStageRequest request) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getDetachManagedInstancesFromLifecycleStageDetails(),
                "detachManagedInstancesFromLifecycleStageDetails is required");

        return clientCall(request, DetachManagedInstancesFromLifecycleStageResponse::builder)
                .logger(LOG, "detachManagedInstancesFromLifecycleStage")
                .serviceDetails(
                        "LifecycleEnvironment", "DetachManagedInstancesFromLifecycleStage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachManagedInstancesFromLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("detachManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachManagedInstancesFromLifecycleStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachManagedInstancesFromLifecycleStageResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLifecycleEnvironmentResponse getLifecycleEnvironment(
            GetLifecycleEnvironmentRequest request) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");

        return clientCall(request, GetLifecycleEnvironmentResponse::builder)
                .logger(LOG, "getLifecycleEnvironment")
                .serviceDetails("LifecycleEnvironment", "GetLifecycleEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        GetLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString("etag", GetLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLifecycleEnvironmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLifecycleStageResponse getLifecycleStage(GetLifecycleStageRequest request) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");

        return clientCall(request, GetLifecycleStageResponse::builder)
                .logger(LOG, "getLifecycleStage")
                .serviceDetails("LifecycleEnvironment", "GetLifecycleStage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleStage.class,
                        GetLifecycleStageResponse.Builder::lifecycleStage)
                .handleResponseHeaderString("etag", GetLifecycleStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLifecycleStageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLifecycleEnvironmentsResponse listLifecycleEnvironments(
            ListLifecycleEnvironmentsRequest request) {

        return clientCall(request, ListLifecycleEnvironmentsResponse::builder)
                .logger(LOG, "listLifecycleEnvironments")
                .serviceDetails("LifecycleEnvironment", "ListLifecycleEnvironments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleEnvironmentsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("lifecycleEnvironmentId", request.getLifecycleEnvironmentId())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentCollection.class,
                        ListLifecycleEnvironmentsResponse.Builder::lifecycleEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLifecycleEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLifecycleEnvironmentsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLifecycleStageInstalledPackagesResponse listLifecycleStageInstalledPackages(
            ListLifecycleStageInstalledPackagesRequest request) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");

        return clientCall(request, ListLifecycleStageInstalledPackagesResponse::builder)
                .logger(LOG, "listLifecycleStageInstalledPackages")
                .serviceDetails("LifecycleEnvironment", "ListLifecycleStageInstalledPackages", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleStageInstalledPackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("installedPackages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.InstalledPackageCollection.class,
                        ListLifecycleStageInstalledPackagesResponse.Builder
                                ::installedPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLifecycleStageInstalledPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLifecycleStageInstalledPackagesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLifecycleStagesResponse listLifecycleStages(ListLifecycleStagesRequest request) {

        return clientCall(request, ListLifecycleStagesResponse::builder)
                .logger(LOG, "listLifecycleStages")
                .serviceDetails("LifecycleEnvironment", "ListLifecycleStages", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLifecycleStagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("lifecycleStageId", request.getLifecycleStageId())
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .appendEnumQueryParam("archType", request.getArchType())
                .appendEnumQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleStageCollection.class,
                        ListLifecycleStagesResponse.Builder::lifecycleStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLifecycleStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLifecycleStagesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PromoteSoftwareSourceToLifecycleStageResponse promoteSoftwareSourceToLifecycleStage(
            PromoteSoftwareSourceToLifecycleStageRequest request) {

        Validate.notBlank(request.getLifecycleStageId(), "lifecycleStageId must not be blank");
        Objects.requireNonNull(
                request.getPromoteSoftwareSourceToLifecycleStageDetails(),
                "promoteSoftwareSourceToLifecycleStageDetails is required");

        return clientCall(request, PromoteSoftwareSourceToLifecycleStageResponse::builder)
                .logger(LOG, "promoteSoftwareSourceToLifecycleStage")
                .serviceDetails("LifecycleEnvironment", "PromoteSoftwareSourceToLifecycleStage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PromoteSoftwareSourceToLifecycleStageRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleStages")
                .appendPathParam(request.getLifecycleStageId())
                .appendPathParam("actions")
                .appendPathParam("promoteSoftwareSource")
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PromoteSoftwareSourceToLifecycleStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PromoteSoftwareSourceToLifecycleStageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateLifecycleEnvironmentResponse updateLifecycleEnvironment(
            UpdateLifecycleEnvironmentRequest request) {

        Validate.notBlank(
                request.getLifecycleEnvironmentId(), "lifecycleEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLifecycleEnvironmentDetails(),
                "updateLifecycleEnvironmentDetails is required");

        return clientCall(request, UpdateLifecycleEnvironmentResponse::builder)
                .logger(LOG, "updateLifecycleEnvironment")
                .serviceDetails("LifecycleEnvironment", "UpdateLifecycleEnvironment", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLifecycleEnvironmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("lifecycleEnvironments")
                .appendPathParam(request.getLifecycleEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.class,
                        UpdateLifecycleEnvironmentResponse.Builder::lifecycleEnvironment)
                .handleResponseHeaderString(
                        "etag", UpdateLifecycleEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLifecycleEnvironmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public LifecycleEnvironmentWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LifecycleEnvironmentPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
    public LifecycleEnvironmentClient(
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
