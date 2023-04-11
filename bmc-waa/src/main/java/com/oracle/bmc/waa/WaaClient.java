/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class WaaClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Waa {
    /** Service instance for Waa. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAA")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://waa.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WaaClient.class);

    private final WaaWaiters waiters;

    private final WaaPaginators paginators;

    WaaClient(
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
                                    .nameFormat("Waa-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WaaWaiters(executorService, this);

        this.paginators = new WaaPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaaClient> {
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
        public WaaClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new WaaClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeWebAppAccelerationCompartmentResponse changeWebAppAccelerationCompartment(
            ChangeWebAppAccelerationCompartmentRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppAccelerationCompartmentDetails(),
                "changeWebAppAccelerationCompartmentDetails is required");

        return clientCall(request, ChangeWebAppAccelerationCompartmentResponse::builder)
                .logger(LOG, "changeWebAppAccelerationCompartment")
                .serviceDetails(
                        "Waa",
                        "ChangeWebAppAccelerationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/ChangeWebAppAccelerationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppAccelerationCompartmentRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppAccelerationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppAccelerationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeWebAppAccelerationPolicyCompartmentResponse
            changeWebAppAccelerationPolicyCompartment(
                    ChangeWebAppAccelerationPolicyCompartmentRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeWebAppAccelerationPolicyCompartmentDetails(),
                "changeWebAppAccelerationPolicyCompartmentDetails is required");

        return clientCall(request, ChangeWebAppAccelerationPolicyCompartmentResponse::builder)
                .logger(LOG, "changeWebAppAccelerationPolicyCompartment")
                .serviceDetails(
                        "Waa",
                        "ChangeWebAppAccelerationPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/ChangeWebAppAccelerationPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeWebAppAccelerationPolicyCompartmentRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeWebAppAccelerationPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeWebAppAccelerationPolicyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateWebAppAccelerationResponse createWebAppAcceleration(
            CreateWebAppAccelerationRequest request) {
        Objects.requireNonNull(
                request.getCreateWebAppAccelerationDetails(),
                "createWebAppAccelerationDetails is required");

        return clientCall(request, CreateWebAppAccelerationResponse::builder)
                .logger(LOG, "createWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "CreateWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/CreateWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAcceleration.class,
                        CreateWebAppAccelerationResponse.Builder::webAppAcceleration)
                .handleResponseHeaderString("etag", CreateWebAppAccelerationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWebAppAccelerationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppAccelerationResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateWebAppAccelerationResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public CreateWebAppAccelerationPolicyResponse createWebAppAccelerationPolicy(
            CreateWebAppAccelerationPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateWebAppAccelerationPolicyDetails(),
                "createWebAppAccelerationPolicyDetails is required");

        return clientCall(request, CreateWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "createWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "CreateWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/CreateWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicy.class,
                        CreateWebAppAccelerationPolicyResponse.Builder::webAppAccelerationPolicy)
                .handleResponseHeaderString(
                        "etag", CreateWebAppAccelerationPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateWebAppAccelerationPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateWebAppAccelerationPolicyResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public DeleteWebAppAccelerationResponse deleteWebAppAcceleration(
            DeleteWebAppAccelerationRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");

        return clientCall(request, DeleteWebAppAccelerationResponse::builder)
                .logger(LOG, "deleteWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "DeleteWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/DeleteWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWebAppAccelerationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWebAppAccelerationPolicyResponse deleteWebAppAccelerationPolicy(
            DeleteWebAppAccelerationPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");

        return clientCall(request, DeleteWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "deleteWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "DeleteWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/DeleteWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWebAppAccelerationResponse getWebAppAcceleration(
            GetWebAppAccelerationRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");

        return clientCall(request, GetWebAppAccelerationResponse::builder)
                .logger(LOG, "getWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "GetWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/GetWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAcceleration.class,
                        GetWebAppAccelerationResponse.Builder::webAppAcceleration)
                .handleResponseHeaderString("etag", GetWebAppAccelerationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppAccelerationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWebAppAccelerationPolicyResponse getWebAppAccelerationPolicy(
            GetWebAppAccelerationPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");

        return clientCall(request, GetWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "getWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "GetWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/GetWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicy.class,
                        GetWebAppAccelerationPolicyResponse.Builder::webAppAccelerationPolicy)
                .handleResponseHeaderString(
                        "etag", GetWebAppAccelerationPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWebAppAccelerationPoliciesResponse listWebAppAccelerationPolicies(
            ListWebAppAccelerationPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppAccelerationPoliciesResponse::builder)
                .logger(LOG, "listWebAppAccelerationPolicies")
                .serviceDetails(
                        "Waa",
                        "ListWebAppAccelerationPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/ListWebAppAccelerationPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppAccelerationPoliciesRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection.class,
                        ListWebAppAccelerationPoliciesResponse.Builder
                                ::webAppAccelerationPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListWebAppAccelerationPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListWebAppAccelerationPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWebAppAccelerationsResponse listWebAppAccelerations(
            ListWebAppAccelerationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWebAppAccelerationsResponse::builder)
                .logger(LOG, "listWebAppAccelerations")
                .serviceDetails(
                        "Waa",
                        "ListWebAppAccelerations",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/ListWebAppAccelerations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWebAppAccelerationsRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "webAppAccelerationPolicyId", request.getWebAppAccelerationPolicyId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waa.model.WebAppAccelerationCollection.class,
                        ListWebAppAccelerationsResponse.Builder::webAppAccelerationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWebAppAccelerationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWebAppAccelerationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PurgeWebAppAccelerationCacheResponse purgeWebAppAccelerationCache(
            PurgeWebAppAccelerationCacheRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getPurgeWebAppAccelerationCacheDetails(),
                "purgeWebAppAccelerationCacheDetails is required");

        return clientCall(request, PurgeWebAppAccelerationCacheResponse::builder)
                .logger(LOG, "purgeWebAppAccelerationCache")
                .serviceDetails(
                        "Waa",
                        "PurgeWebAppAccelerationCache",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/PurgeWebAppAccelerationCache")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeWebAppAccelerationCacheRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .appendPathParam("actions")
                .appendPathParam("purgeCache")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PurgeWebAppAccelerationCacheResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PurgeWebAppAccelerationCacheResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWebAppAccelerationResponse updateWebAppAcceleration(
            UpdateWebAppAccelerationRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationId(), "webAppAccelerationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppAccelerationDetails(),
                "updateWebAppAccelerationDetails is required");

        return clientCall(request, UpdateWebAppAccelerationResponse::builder)
                .logger(LOG, "updateWebAppAcceleration")
                .serviceDetails(
                        "Waa",
                        "UpdateWebAppAcceleration",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAcceleration/UpdateWebAppAcceleration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppAccelerationRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerations")
                .appendPathParam(request.getWebAppAccelerationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppAccelerationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWebAppAccelerationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWebAppAccelerationPolicyResponse updateWebAppAccelerationPolicy(
            UpdateWebAppAccelerationPolicyRequest request) {

        Validate.notBlank(
                request.getWebAppAccelerationPolicyId(),
                "webAppAccelerationPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWebAppAccelerationPolicyDetails(),
                "updateWebAppAccelerationPolicyDetails is required");

        return clientCall(request, UpdateWebAppAccelerationPolicyResponse::builder)
                .logger(LOG, "updateWebAppAccelerationPolicy")
                .serviceDetails(
                        "Waa",
                        "UpdateWebAppAccelerationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/waa/20211230/WebAppAccelerationPolicy/UpdateWebAppAccelerationPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWebAppAccelerationPolicyRequest::builder)
                .basePath("/20211230")
                .appendPathParam("webAppAccelerationPolicies")
                .appendPathParam(request.getWebAppAccelerationPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateWebAppAccelerationPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateWebAppAccelerationPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public WaaWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WaaPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
    public WaaClient(
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
