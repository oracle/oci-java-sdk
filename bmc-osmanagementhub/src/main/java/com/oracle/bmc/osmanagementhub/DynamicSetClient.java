/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
public class DynamicSetClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DynamicSet {
    /** Service instance for DynamicSet. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DynamicSetClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DynamicSetClient.class);

    private final DynamicSetWaiters waiters;

    private final DynamicSetPaginators paginators;

    DynamicSetClient(
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
                                    .nameFormat("DynamicSet-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DynamicSetWaiters(executorService, this);

        this.paginators = new DynamicSetPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DynamicSetClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
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
        public DynamicSetClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DynamicSetClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeDynamicSetCompartmentResponse changeDynamicSetCompartment(
            ChangeDynamicSetCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeDynamicSetCompartmentDetails(),
                "changeDynamicSetCompartmentDetails is required");

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");

        return clientCall(request, ChangeDynamicSetCompartmentResponse::builder)
                .logger(LOG, "changeDynamicSetCompartment")
                .serviceDetails(
                        "DynamicSet",
                        "ChangeDynamicSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/ChangeDynamicSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDynamicSetCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDynamicSetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDynamicSetResponse createDynamicSet(CreateDynamicSetRequest request) {
        Objects.requireNonNull(
                request.getCreateDynamicSetDetails(), "createDynamicSetDetails is required");

        return clientCall(request, CreateDynamicSetResponse::builder)
                .logger(LOG, "createDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "CreateDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/CreateDynamicSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.DynamicSet.class,
                        CreateDynamicSetResponse.Builder::dynamicSet)
                .handleResponseHeaderString("etag", CreateDynamicSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDynamicSetResponse deleteDynamicSet(DeleteDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");

        return clientCall(request, DeleteDynamicSetResponse::builder)
                .logger(LOG, "deleteDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "DeleteDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/DeleteDynamicSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDynamicSetResponse getDynamicSet(GetDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");

        return clientCall(request, GetDynamicSetResponse::builder)
                .logger(LOG, "getDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "GetDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/GetDynamicSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.DynamicSet.class,
                        GetDynamicSetResponse.Builder::dynamicSet)
                .handleResponseHeaderString("etag", GetDynamicSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDynamicSetResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetDynamicSetResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public InstallPackagesOnDynamicSetResponse installPackagesOnDynamicSet(
            InstallPackagesOnDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");
        Objects.requireNonNull(
                request.getInstallPackagesOnDynamicSetDetails(),
                "installPackagesOnDynamicSetDetails is required");

        return clientCall(request, InstallPackagesOnDynamicSetResponse::builder)
                .logger(LOG, "installPackagesOnDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "InstallPackagesOnDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/InstallPackagesOnDynamicSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPackagesOnDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("actions")
                .appendPathParam("installPackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallPackagesOnDynamicSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", InstallPackagesOnDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDynamicSetsResponse listDynamicSets(ListDynamicSetsRequest request) {

        return clientCall(request, ListDynamicSetsResponse::builder)
                .logger(LOG, "listDynamicSets")
                .serviceDetails(
                        "DynamicSet",
                        "ListDynamicSets",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/ListDynamicSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDynamicSetsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("dynamicSetId", request.getDynamicSetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.DynamicSetCollection.class,
                        ListDynamicSetsResponse.Builder::dynamicSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDynamicSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDynamicSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDynamicSetsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListManagedInstancesInDynamicSetResponse listManagedInstancesInDynamicSet(
            ListManagedInstancesInDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");

        return clientCall(request, ListManagedInstancesInDynamicSetResponse::builder)
                .logger(LOG, "listManagedInstancesInDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "ListManagedInstancesInDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/ListManagedInstancesInDynamicSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstancesInDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("managedInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceCollection.class,
                        ListManagedInstancesInDynamicSetResponse.Builder::managedInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstancesInDynamicSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstancesInDynamicSetResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListManagedInstancesInDynamicSetResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public PreviewManagedInstancesResponse previewManagedInstances(
            PreviewManagedInstancesRequest request) {
        Objects.requireNonNull(
                request.getPreviewManagedInstancesDetails(),
                "previewManagedInstancesDetails is required");

        return clientCall(request, PreviewManagedInstancesResponse::builder)
                .logger(LOG, "previewManagedInstances")
                .serviceDetails(
                        "DynamicSet",
                        "PreviewManagedInstances",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/PreviewManagedInstances")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PreviewManagedInstancesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam("actions")
                .appendPathParam("previewManagedInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceCollection.class,
                        PreviewManagedInstancesResponse.Builder::managedInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", PreviewManagedInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", PreviewManagedInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", PreviewManagedInstancesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public RebootDynamicSetResponse rebootDynamicSet(RebootDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");
        Objects.requireNonNull(
                request.getRebootDynamicSetDetails(), "rebootDynamicSetDetails is required");

        return clientCall(request, RebootDynamicSetResponse::builder)
                .logger(LOG, "rebootDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "RebootDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/RebootDynamicSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RebootDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("actions")
                .appendPathParam("reboot")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RebootDynamicSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RebootDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemovePackagesFromDynamicSetResponse removePackagesFromDynamicSet(
            RemovePackagesFromDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");
        Objects.requireNonNull(
                request.getRemovePackagesFromDynamicSetDetails(),
                "removePackagesFromDynamicSetDetails is required");

        return clientCall(request, RemovePackagesFromDynamicSetResponse::builder)
                .logger(LOG, "removePackagesFromDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "RemovePackagesFromDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/RemovePackagesFromDynamicSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackagesFromDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("actions")
                .appendPathParam("removePackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemovePackagesFromDynamicSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackagesFromDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDynamicSetResponse updateDynamicSet(UpdateDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDynamicSetDetails(), "updateDynamicSetDetails is required");

        return clientCall(request, UpdateDynamicSetResponse::builder)
                .logger(LOG, "updateDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "UpdateDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/UpdateDynamicSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.DynamicSet.class,
                        UpdateDynamicSetResponse.Builder::dynamicSet)
                .handleResponseHeaderString("etag", UpdateDynamicSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePackagesOnDynamicSetResponse updatePackagesOnDynamicSet(
            UpdatePackagesOnDynamicSetRequest request) {

        Validate.notBlank(request.getDynamicSetId(), "dynamicSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePackagesOnDynamicSetDetails(),
                "updatePackagesOnDynamicSetDetails is required");

        return clientCall(request, UpdatePackagesOnDynamicSetResponse::builder)
                .logger(LOG, "updatePackagesOnDynamicSet")
                .serviceDetails(
                        "DynamicSet",
                        "UpdatePackagesOnDynamicSet",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/DynamicSet/UpdatePackagesOnDynamicSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdatePackagesOnDynamicSetRequest::builder)
                .basePath("/20220901")
                .appendPathParam("dynamicSets")
                .appendPathParam(request.getDynamicSetId())
                .appendPathParam("actions")
                .appendPathParam("updatePackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePackagesOnDynamicSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePackagesOnDynamicSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DynamicSetWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DynamicSetPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
    public DynamicSetClient(
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
