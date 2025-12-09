/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.networkloadbalancer.requests.*;
import com.oracle.bmc.networkloadbalancer.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class NetworkLoadBalancerClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements NetworkLoadBalancer {
    /** Service instance for NetworkLoadBalancer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(NetworkLoadBalancerClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-load-balancer-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkLoadBalancerClient.class);

    private final NetworkLoadBalancerWaiters waiters;

    private final NetworkLoadBalancerPaginators paginators;

    NetworkLoadBalancerClient(
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
                                    .nameFormat("NetworkLoadBalancer-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NetworkLoadBalancerWaiters(executorService, this);

        this.paginators = new NetworkLoadBalancerPaginators(this);
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
                    Builder, NetworkLoadBalancerClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "networkloadbalancer";
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
        public NetworkLoadBalancerClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NetworkLoadBalancerClient(
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
    public ChangeNetworkLoadBalancerCompartmentResponse changeNetworkLoadBalancerCompartment(
            ChangeNetworkLoadBalancerCompartmentRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkLoadBalancerCompartmentDetails(),
                "changeNetworkLoadBalancerCompartmentDetails is required");

        return clientCall(request, ChangeNetworkLoadBalancerCompartmentResponse::builder)
                .logger(LOG, "changeNetworkLoadBalancerCompartment")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ChangeNetworkLoadBalancerCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ChangeNetworkLoadBalancerCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkLoadBalancerCompartmentRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNetworkLoadBalancerCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkLoadBalancerCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackendResponse createBackend(CreateBackendRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getCreateBackendDetails(), "createBackendDetails is required");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, CreateBackendResponse::builder)
                .logger(LOG, "createBackend")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "CreateBackend",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/CreateBackend")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackendRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getCreateBackendSetDetails(), "createBackendSetDetails is required");

        return clientCall(request, CreateBackendSetResponse::builder)
                .logger(LOG, "createBackendSet")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "CreateBackendSet",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/CreateBackendSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackendSetRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateListenerResponse createListener(CreateListenerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getCreateListenerDetails(), "createListenerDetails is required");

        return clientCall(request, CreateListenerResponse::builder)
                .logger(LOG, "createListener")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "CreateListener",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/CreateListener")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListenerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("listeners")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", CreateListenerResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public CreateNetworkLoadBalancerResponse createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request) {
        Objects.requireNonNull(
                request.getCreateNetworkLoadBalancerDetails(),
                "createNetworkLoadBalancerDetails is required");

        return clientCall(request, CreateNetworkLoadBalancerResponse::builder)
                .logger(LOG, "createNetworkLoadBalancer")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "CreateNetworkLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/CreateNetworkLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkLoadBalancerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancer.class,
                        CreateNetworkLoadBalancerResponse.Builder::networkLoadBalancer)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkLoadBalancerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateNetworkLoadBalancerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, DeleteBackendResponse::builder)
                .logger(LOG, "deleteBackend")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "DeleteBackend",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/DeleteBackend")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackendRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, DeleteBackendSetResponse::builder)
                .logger(LOG, "deleteBackendSet")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "DeleteBackendSet",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/DeleteBackendSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackendSetRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, DeleteListenerResponse::builder)
                .logger(LOG, "deleteListener")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "DeleteListener",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/DeleteListener")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListenerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", DeleteListenerResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public DeleteNetworkLoadBalancerResponse deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        return clientCall(request, DeleteNetworkLoadBalancerResponse::builder)
                .logger(LOG, "deleteNetworkLoadBalancer")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "DeleteNetworkLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/DeleteNetworkLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkLoadBalancerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackendResponse getBackend(GetBackendRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, GetBackendResponse::builder)
                .logger(LOG, "getBackend")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetBackend",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/GetBackend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.Backend.class,
                        GetBackendResponse.Builder::backend)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, GetBackendHealthResponse::builder)
                .logger(LOG, "getBackendHealth")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendHealth",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendHealth/GetBackendHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendHealthRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendHealth.class,
                        GetBackendHealthResponse.Builder::backendHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendHealthResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackendOperationalStatusResponse getBackendOperationalStatus(
            GetBackendOperationalStatusRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, GetBackendOperationalStatusResponse::builder)
                .logger(LOG, "getBackendOperationalStatus")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendOperationalStatus",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendOperationalStatus/GetBackendOperationalStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendOperationalStatusRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .appendPathParam("operationalStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus.class,
                        GetBackendOperationalStatusResponse.Builder::backendOperationalStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendOperationalStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackendSetResponse getBackendSet(GetBackendSetRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetBackendSetResponse::builder)
                .logger(LOG, "getBackendSet")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendSet",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/GetBackendSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendSetRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSet.class,
                        GetBackendSetResponse.Builder::backendSet)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendSetResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetBackendSetHealthResponse::builder)
                .logger(LOG, "getBackendSetHealth")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendSetHealth",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetHealth/GetBackendSetHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendSetHealthRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSetHealth.class,
                        GetBackendSetHealthResponse.Builder::backendSetHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetHealthResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendSetHealthResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetHealthCheckerResponse::builder)
                .logger(LOG, "getHealthChecker")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetHealthChecker",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/GetHealthChecker")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHealthCheckerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("healthChecker")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.HealthChecker.class,
                        GetHealthCheckerResponse.Builder::healthChecker)
                .handleResponseHeaderString(
                        "opc-request-id", GetHealthCheckerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetHealthCheckerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetListenerResponse getListener(GetListenerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, GetListenerResponse::builder)
                .logger(LOG, "getListener")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetListener",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/GetListener")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListenerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.Listener.class,
                        GetListenerResponse.Builder::listener)
                .handleResponseHeaderString(
                        "opc-request-id", GetListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListenerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetNetworkLoadBalancerResponse getNetworkLoadBalancer(
            GetNetworkLoadBalancerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        return clientCall(request, GetNetworkLoadBalancerResponse::builder)
                .logger(LOG, "getNetworkLoadBalancer")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetNetworkLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/GetNetworkLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkLoadBalancerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancer.class,
                        GetNetworkLoadBalancerResponse.Builder::networkLoadBalancer)
                .handleResponseHeaderString("etag", GetNetworkLoadBalancerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNetworkLoadBalancerHealthResponse getNetworkLoadBalancerHealth(
            GetNetworkLoadBalancerHealthRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        return clientCall(request, GetNetworkLoadBalancerHealthResponse::builder)
                .logger(LOG, "getNetworkLoadBalancerHealth")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetNetworkLoadBalancerHealth",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/GetNetworkLoadBalancerHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkLoadBalancerHealthRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth.class,
                        GetNetworkLoadBalancerHealthResponse.Builder::networkLoadBalancerHealth)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetNetworkLoadBalancerHealthResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200501")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        return clientCall(request, ListBackendSetsResponse::builder)
                .logger(LOG, "listBackendSets")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListBackendSets",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetSummary/ListBackendSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackendSetsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSetCollection.class,
                        ListBackendSetsResponse.Builder::backendSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackendSetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBackendsResponse listBackends(ListBackendsRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, ListBackendsResponse::builder)
                .logger(LOG, "listBackends")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListBackends",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSummary/ListBackends")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackendsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendCollection.class,
                        ListBackendsResponse.Builder::backendCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackendsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListListenersResponse listListeners(ListListenersRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");

        return clientCall(request, ListListenersResponse::builder)
                .logger(LOG, "listListeners")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListListeners",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerSummary/ListListeners")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListenersRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("listeners")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.ListenerCollection.class,
                        ListListenersResponse.Builder::listenerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListenersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListenersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNetworkLoadBalancerHealthsResponse listNetworkLoadBalancerHealths(
            ListNetworkLoadBalancerHealthsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkLoadBalancerHealthsResponse::builder)
                .logger(LOG, "listNetworkLoadBalancerHealths")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancerHealths",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/ListNetworkLoadBalancerHealths")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkLoadBalancerHealthsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam("health")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
                                .class,
                        ListNetworkLoadBalancerHealthsResponse.Builder
                                ::networkLoadBalancerHealthCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListNetworkLoadBalancerHealthsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNetworkLoadBalancerHealthsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNetworkLoadBalancersResponse listNetworkLoadBalancers(
            ListNetworkLoadBalancersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkLoadBalancersResponse::builder)
                .logger(LOG, "listNetworkLoadBalancers")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancers",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ListNetworkLoadBalancers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkLoadBalancersRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
                                .class,
                        ListNetworkLoadBalancersResponse.Builder::networkLoadBalancerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkLoadBalancersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkLoadBalancersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNetworkLoadBalancersPoliciesResponse listNetworkLoadBalancersPolicies(
            ListNetworkLoadBalancersPoliciesRequest request) {

        return clientCall(request, ListNetworkLoadBalancersPoliciesResponse::builder)
                .logger(LOG, "listNetworkLoadBalancersPolicies")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancersPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancingPolicy/ListNetworkLoadBalancersPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkLoadBalancersPoliciesRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancersPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model
                                .NetworkLoadBalancersPolicyCollection.class,
                        ListNetworkLoadBalancersPoliciesResponse.Builder
                                ::networkLoadBalancersPolicyCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListNetworkLoadBalancersPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNetworkLoadBalancersPoliciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNetworkLoadBalancersProtocolsResponse listNetworkLoadBalancersProtocols(
            ListNetworkLoadBalancersProtocolsRequest request) {

        return clientCall(request, ListNetworkLoadBalancersProtocolsResponse::builder)
                .logger(LOG, "listNetworkLoadBalancersProtocols")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancersProtocols",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerProtocols/ListNetworkLoadBalancersProtocols")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkLoadBalancersProtocolsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancersProtocols")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model
                                .NetworkLoadBalancersProtocolCollection.class,
                        ListNetworkLoadBalancersProtocolsResponse.Builder
                                ::networkLoadBalancersProtocolCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListNetworkLoadBalancersProtocolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNetworkLoadBalancersProtocolsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBackendResponse updateBackend(UpdateBackendRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBackendDetails(), "updateBackendDetails is required");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, UpdateBackendResponse::builder)
                .logger(LOG, "updateBackend")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateBackend",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/UpdateBackend")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackendRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBackendSetDetails(), "updateBackendSetDetails is required");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, UpdateBackendSetResponse::builder)
                .logger(LOG, "updateBackendSet")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateBackendSet",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/UpdateBackendSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackendSetRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHealthCheckerDetails(), "updateHealthCheckerDetails is required");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, UpdateHealthCheckerResponse::builder)
                .logger(LOG, "updateHealthChecker")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateHealthChecker",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/UpdateHealthChecker")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHealthCheckerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("healthChecker")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHealthCheckerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHealthCheckerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateListenerDetails(), "updateListenerDetails is required");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, UpdateListenerResponse::builder)
                .logger(LOG, "updateListener")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateListener",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/UpdateListener")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListenerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListenerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNetworkLoadBalancerResponse updateNetworkLoadBalancer(
            UpdateNetworkLoadBalancerRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkLoadBalancerDetails(),
                "updateNetworkLoadBalancerDetails is required");

        return clientCall(request, UpdateNetworkLoadBalancerResponse::builder)
                .logger(LOG, "updateNetworkLoadBalancer")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateNetworkLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkLoadBalancerRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNetworkSecurityGroupsResponse updateNetworkSecurityGroups(
            UpdateNetworkSecurityGroupsRequest request) {

        Validate.notBlank(
                request.getNetworkLoadBalancerId(), "networkLoadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkSecurityGroupsDetails(),
                "updateNetworkSecurityGroupsDetails is required");

        return clientCall(request, UpdateNetworkSecurityGroupsResponse::builder)
                .logger(LOG, "updateNetworkSecurityGroups")
                .serviceDetails(
                        "NetworkLoadBalancer",
                        "UpdateNetworkSecurityGroups",
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkSecurityGroups")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkSecurityGroupsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("networkLoadBalancers")
                .appendPathParam(request.getNetworkLoadBalancerId())
                .appendPathParam("networkSecurityGroups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkSecurityGroupsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkSecurityGroupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public NetworkLoadBalancerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public NetworkLoadBalancerPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
