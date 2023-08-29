/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class LoadBalancerClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LoadBalancer {
    /** Service instance for LoadBalancer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOADBALANCER")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LoadBalancerClient.class);

    private final LoadBalancerWaiters waiters;

    private final LoadBalancerPaginators paginators;

    LoadBalancerClient(
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
                                    .nameFormat("LoadBalancer-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LoadBalancerWaiters(executorService, this);

        this.paginators = new LoadBalancerPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LoadBalancerClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "loadbalancer";
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
        public LoadBalancerClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LoadBalancerClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeLoadBalancerCompartmentResponse changeLoadBalancerCompartment(
            ChangeLoadBalancerCompartmentRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getChangeLoadBalancerCompartmentDetails(),
                "changeLoadBalancerCompartmentDetails is required");

        return clientCall(request, ChangeLoadBalancerCompartmentResponse::builder)
                .logger(LOG, "changeLoadBalancerCompartment")
                .serviceDetails(
                        "LoadBalancer",
                        "ChangeLoadBalancerCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/ChangeLoadBalancerCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLoadBalancerCompartmentRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeLoadBalancerCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLoadBalancerCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackendResponse createBackend(CreateBackendRequest request) {
        Objects.requireNonNull(
                request.getCreateBackendDetails(), "createBackendDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, CreateBackendResponse::builder)
                .logger(LOG, "createBackend")
                .serviceDetails("LoadBalancer", "CreateBackend", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackendRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request) {
        Objects.requireNonNull(
                request.getCreateBackendSetDetails(), "createBackendSetDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateBackendSetResponse::builder)
                .logger(LOG, "createBackendSet")
                .serviceDetails("LoadBalancer", "CreateBackendSet", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackendSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        Objects.requireNonNull(
                request.getCreateCertificateDetails(), "createCertificateDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateCertificateResponse::builder)
                .logger(LOG, "createCertificate")
                .serviceDetails("LoadBalancer", "CreateCertificate", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("certificates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHostnameResponse createHostname(CreateHostnameRequest request) {
        Objects.requireNonNull(
                request.getCreateHostnameDetails(), "createHostnameDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateHostnameResponse::builder)
                .logger(LOG, "createHostname")
                .serviceDetails("LoadBalancer", "CreateHostname", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostnameRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("hostnames")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateHostnameResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHostnameResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        Objects.requireNonNull(
                request.getCreateListenerDetails(), "createListenerDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateListenerResponse::builder)
                .logger(LOG, "createListener")
                .serviceDetails("LoadBalancer", "CreateListener", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateListenerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("listeners")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListenerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        Objects.requireNonNull(
                request.getCreateLoadBalancerDetails(), "createLoadBalancerDetails is required");

        return clientCall(request, CreateLoadBalancerResponse::builder)
                .logger(LOG, "createLoadBalancer")
                .serviceDetails("LoadBalancer", "CreateLoadBalancer", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLoadBalancerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePathRouteSetResponse createPathRouteSet(CreatePathRouteSetRequest request) {
        Objects.requireNonNull(
                request.getCreatePathRouteSetDetails(), "createPathRouteSetDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreatePathRouteSetResponse::builder)
                .logger(LOG, "createPathRouteSet")
                .serviceDetails("LoadBalancer", "CreatePathRouteSet", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePathRouteSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("pathRouteSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreatePathRouteSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePathRouteSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRoutingPolicyResponse createRoutingPolicy(CreateRoutingPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateRoutingPolicyDetails(), "createRoutingPolicyDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateRoutingPolicyResponse::builder)
                .logger(LOG, "createRoutingPolicy")
                .serviceDetails("LoadBalancer", "CreateRoutingPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRoutingPolicyRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("routingPolicies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRoutingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRoutingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRuleSetResponse createRuleSet(CreateRuleSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getCreateRuleSetDetails(), "createRuleSetDetails is required");

        return clientCall(request, CreateRuleSetResponse::builder)
                .logger(LOG, "createRuleSet")
                .serviceDetails("LoadBalancer", "CreateRuleSet", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRuleSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("ruleSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateRuleSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRuleSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSSLCipherSuiteResponse createSSLCipherSuite(CreateSSLCipherSuiteRequest request) {
        Objects.requireNonNull(
                request.getCreateSSLCipherSuiteDetails(),
                "createSSLCipherSuiteDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, CreateSSLCipherSuiteResponse::builder)
                .logger(LOG, "createSSLCipherSuite")
                .serviceDetails("LoadBalancer", "CreateSSLCipherSuite", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSSLCipherSuiteRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("sslCipherSuites")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSSLCipherSuiteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSSLCipherSuiteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, DeleteBackendResponse::builder)
                .logger(LOG, "deleteBackend")
                .serviceDetails("LoadBalancer", "DeleteBackend", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackendRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, DeleteBackendSetResponse::builder)
                .logger(LOG, "deleteBackendSet")
                .serviceDetails("LoadBalancer", "DeleteBackendSet", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackendSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getCertificateName(), "certificateName must not be blank");

        return clientCall(request, DeleteCertificateResponse::builder)
                .logger(LOG, "deleteCertificate")
                .serviceDetails("LoadBalancer", "DeleteCertificate", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCertificateRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostnameResponse deleteHostname(DeleteHostnameRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, DeleteHostnameResponse::builder)
                .logger(LOG, "deleteHostname")
                .serviceDetails("LoadBalancer", "DeleteHostname", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostnameRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("hostnames")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteHostnameResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHostnameResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, DeleteListenerResponse::builder)
                .logger(LOG, "deleteListener")
                .serviceDetails("LoadBalancer", "DeleteListener", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteListenerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListenerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, DeleteLoadBalancerResponse::builder)
                .logger(LOG, "deleteLoadBalancer")
                .serviceDetails("LoadBalancer", "DeleteLoadBalancer", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLoadBalancerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePathRouteSetResponse deletePathRouteSet(DeletePathRouteSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getPathRouteSetName(), "pathRouteSetName must not be blank");

        return clientCall(request, DeletePathRouteSetResponse::builder)
                .logger(LOG, "deletePathRouteSet")
                .serviceDetails("LoadBalancer", "DeletePathRouteSet", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePathRouteSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("pathRouteSets")
                .appendPathParam(request.getPathRouteSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeletePathRouteSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePathRouteSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRoutingPolicyResponse deleteRoutingPolicy(DeleteRoutingPolicyRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRoutingPolicyName(), "routingPolicyName must not be blank");

        return clientCall(request, DeleteRoutingPolicyResponse::builder)
                .logger(LOG, "deleteRoutingPolicy")
                .serviceDetails("LoadBalancer", "DeleteRoutingPolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRoutingPolicyRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("routingPolicies")
                .appendPathParam(request.getRoutingPolicyName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRoutingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRoutingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRuleSetResponse deleteRuleSet(DeleteRuleSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRuleSetName(), "ruleSetName must not be blank");

        return clientCall(request, DeleteRuleSetResponse::builder)
                .logger(LOG, "deleteRuleSet")
                .serviceDetails("LoadBalancer", "DeleteRuleSet", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRuleSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("ruleSets")
                .appendPathParam(request.getRuleSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRuleSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRuleSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSSLCipherSuiteResponse deleteSSLCipherSuite(DeleteSSLCipherSuiteRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, DeleteSSLCipherSuiteResponse::builder)
                .logger(LOG, "deleteSSLCipherSuite")
                .serviceDetails("LoadBalancer", "DeleteSSLCipherSuite", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSSLCipherSuiteRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("sslCipherSuites")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSSLCipherSuiteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSSLCipherSuiteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackendResponse getBackend(GetBackendRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, GetBackendResponse::builder)
                .logger(LOG, "getBackend")
                .serviceDetails(
                        "LoadBalancer",
                        "GetBackend",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Backend/GetBackend")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.Backend.class,
                        GetBackendResponse.Builder::backend)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetBackendResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, GetBackendHealthResponse::builder)
                .logger(LOG, "getBackendHealth")
                .serviceDetails(
                        "LoadBalancer",
                        "GetBackendHealth",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendHealth/GetBackendHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendHealthRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.BackendHealth.class,
                        GetBackendHealthResponse.Builder::backendHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendHealthResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetBackendHealthResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetBackendSetResponse getBackendSet(GetBackendSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetBackendSetResponse::builder)
                .logger(LOG, "getBackendSet")
                .serviceDetails(
                        "LoadBalancer",
                        "GetBackendSet",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSet/GetBackendSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.BackendSet.class,
                        GetBackendSetResponse.Builder::backendSet)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetBackendSetResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetBackendSetHealthResponse::builder)
                .logger(LOG, "getBackendSetHealth")
                .serviceDetails(
                        "LoadBalancer",
                        "GetBackendSetHealth",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSetHealth/GetBackendSetHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackendSetHealthRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.BackendSetHealth.class,
                        GetBackendSetHealthResponse.Builder::backendSetHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetHealthResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetBackendSetHealthResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, GetHealthCheckerResponse::builder)
                .logger(LOG, "getHealthChecker")
                .serviceDetails(
                        "LoadBalancer",
                        "GetHealthChecker",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/HealthChecker/GetHealthChecker")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHealthCheckerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("healthChecker")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.HealthChecker.class,
                        GetHealthCheckerResponse.Builder::healthChecker)
                .handleResponseHeaderString(
                        "opc-request-id", GetHealthCheckerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetHealthCheckerResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetHostnameResponse getHostname(GetHostnameRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, GetHostnameResponse::builder)
                .logger(LOG, "getHostname")
                .serviceDetails(
                        "LoadBalancer",
                        "GetHostname",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Hostname/GetHostname")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostnameRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("hostnames")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.Hostname.class,
                        GetHostnameResponse.Builder::hostname)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostnameResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetHostnameResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, GetLoadBalancerResponse::builder)
                .logger(LOG, "getLoadBalancer")
                .serviceDetails(
                        "LoadBalancer",
                        "GetLoadBalancer",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/GetLoadBalancer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLoadBalancerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.LoadBalancer.class,
                        GetLoadBalancerResponse.Builder::loadBalancer)
                .handleResponseHeaderString(
                        "opc-request-id", GetLoadBalancerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetLoadBalancerResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetLoadBalancerHealthResponse getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, GetLoadBalancerHealthResponse::builder)
                .logger(LOG, "getLoadBalancerHealth")
                .serviceDetails(
                        "LoadBalancer",
                        "GetLoadBalancerHealth",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerHealth/GetLoadBalancerHealth")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLoadBalancerHealthRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("health")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.LoadBalancerHealth.class,
                        GetLoadBalancerHealthResponse.Builder::loadBalancerHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetLoadBalancerHealthResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetLoadBalancerHealthResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetPathRouteSetResponse getPathRouteSet(GetPathRouteSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getPathRouteSetName(), "pathRouteSetName must not be blank");

        return clientCall(request, GetPathRouteSetResponse::builder)
                .logger(LOG, "getPathRouteSet")
                .serviceDetails(
                        "LoadBalancer",
                        "GetPathRouteSet",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/PathRouteSet/GetPathRouteSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPathRouteSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("pathRouteSets")
                .appendPathParam(request.getPathRouteSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.PathRouteSet.class,
                        GetPathRouteSetResponse.Builder::pathRouteSet)
                .handleResponseHeaderString(
                        "opc-request-id", GetPathRouteSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetPathRouteSetResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetRoutingPolicyResponse getRoutingPolicy(GetRoutingPolicyRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRoutingPolicyName(), "routingPolicyName must not be blank");

        return clientCall(request, GetRoutingPolicyResponse::builder)
                .logger(LOG, "getRoutingPolicy")
                .serviceDetails(
                        "LoadBalancer",
                        "GetRoutingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RoutingPolicy/GetRoutingPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoutingPolicyRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("routingPolicies")
                .appendPathParam(request.getRoutingPolicyName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.RoutingPolicy.class,
                        GetRoutingPolicyResponse.Builder::routingPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoutingPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetRoutingPolicyResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetRuleSetResponse getRuleSet(GetRuleSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRuleSetName(), "ruleSetName must not be blank");

        return clientCall(request, GetRuleSetResponse::builder)
                .logger(LOG, "getRuleSet")
                .serviceDetails(
                        "LoadBalancer",
                        "GetRuleSet",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/GetRuleSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRuleSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("ruleSets")
                .appendPathParam(request.getRuleSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.RuleSet.class,
                        GetRuleSetResponse.Builder::ruleSet)
                .handleResponseHeaderString(
                        "opc-request-id", GetRuleSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetRuleSetResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetSSLCipherSuiteResponse getSSLCipherSuite(GetSSLCipherSuiteRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, GetSSLCipherSuiteResponse::builder)
                .logger(LOG, "getSSLCipherSuite")
                .serviceDetails(
                        "LoadBalancer",
                        "GetSSLCipherSuite",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/SSLCipherSuite/GetSSLCipherSuite")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSSLCipherSuiteRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("sslCipherSuites")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.SSLCipherSuite.class,
                        GetSSLCipherSuiteResponse.Builder::sSLCipherSuite)
                .handleResponseHeaderString(
                        "opc-request-id", GetSSLCipherSuiteResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetSSLCipherSuiteResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "LoadBalancer",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancerWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loadbalancer.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListBackendSetsResponse::builder)
                .logger(LOG, "listBackendSets")
                .serviceDetails(
                        "LoadBalancer",
                        "ListBackendSets",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSet/ListBackendSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackendSetsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.BackendSet.class,
                        ListBackendSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListBackendSetsResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListBackendsResponse listBackends(ListBackendsRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, ListBackendsResponse::builder)
                .logger(LOG, "listBackends")
                .serviceDetails(
                        "LoadBalancer",
                        "ListBackends",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Backend/ListBackends")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackendsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.Backend.class,
                        ListBackendsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListBackendsResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListCertificatesResponse::builder)
                .logger(LOG, "listCertificates")
                .serviceDetails(
                        "LoadBalancer",
                        "ListCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Certificate/ListCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificatesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("certificates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.Certificate.class,
                        ListCertificatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListCertificatesResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListHostnamesResponse listHostnames(ListHostnamesRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListHostnamesResponse::builder)
                .logger(LOG, "listHostnames")
                .serviceDetails(
                        "LoadBalancer",
                        "ListHostnames",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Hostname/ListHostnames")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostnamesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("hostnames")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.Hostname.class,
                        ListHostnamesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostnamesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListHostnamesResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListListenerRulesResponse listListenerRules(ListListenerRulesRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, ListListenerRulesResponse::builder)
                .logger(LOG, "listListenerRules")
                .serviceDetails(
                        "LoadBalancer",
                        "ListListenerRules",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/ListenerRuleSummary/ListListenerRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListenerRulesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .appendPathParam("rules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.ListenerRuleSummary.class,
                        ListListenerRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListListenerRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListListenerRulesResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListLoadBalancerHealthsResponse listLoadBalancerHealths(
            ListLoadBalancerHealthsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLoadBalancerHealthsResponse::builder)
                .logger(LOG, "listLoadBalancerHealths")
                .serviceDetails(
                        "LoadBalancer",
                        "ListLoadBalancerHealths",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerHealthSummary/ListLoadBalancerHealths")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLoadBalancerHealthsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancerHealths")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary.class,
                        ListLoadBalancerHealthsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLoadBalancerHealthsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLoadBalancerHealthsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLoadBalancersResponse::builder)
                .logger(LOG, "listLoadBalancers")
                .serviceDetails(
                        "LoadBalancer",
                        "ListLoadBalancers",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/ListLoadBalancers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLoadBalancersRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("detail", request.getDetail())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.LoadBalancer.class,
                        ListLoadBalancersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLoadBalancersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLoadBalancersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPathRouteSetsResponse listPathRouteSets(ListPathRouteSetsRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListPathRouteSetsResponse::builder)
                .logger(LOG, "listPathRouteSets")
                .serviceDetails(
                        "LoadBalancer",
                        "ListPathRouteSets",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/PathRouteSet/ListPathRouteSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPathRouteSetsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("pathRouteSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.PathRouteSet.class,
                        ListPathRouteSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPathRouteSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListPathRouteSetsResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPoliciesResponse::builder)
                .logger(LOG, "listPolicies")
                .serviceDetails(
                        "LoadBalancer",
                        "ListPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerPolicy/ListPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPoliciesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancerPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy.class,
                        ListPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPoliciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListProtocolsResponse listProtocols(ListProtocolsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProtocolsResponse::builder)
                .logger(LOG, "listProtocols")
                .serviceDetails(
                        "LoadBalancer",
                        "ListProtocols",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerProtocol/ListProtocols")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtocolsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancerProtocols")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol.class,
                        ListProtocolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtocolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtocolsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListRoutingPoliciesResponse listRoutingPolicies(ListRoutingPoliciesRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListRoutingPoliciesResponse::builder)
                .logger(LOG, "listRoutingPolicies")
                .serviceDetails(
                        "LoadBalancer",
                        "ListRoutingPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RoutingPolicy/ListRoutingPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoutingPoliciesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("routingPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.RoutingPolicy.class,
                        ListRoutingPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoutingPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoutingPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString("eTag", ListRoutingPoliciesResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListRuleSetsResponse listRuleSets(ListRuleSetsRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListRuleSetsResponse::builder)
                .logger(LOG, "listRuleSets")
                .serviceDetails(
                        "LoadBalancer",
                        "ListRuleSets",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/ListRuleSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRuleSetsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("ruleSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.RuleSet.class,
                        ListRuleSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRuleSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListRuleSetsResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListSSLCipherSuitesResponse listSSLCipherSuites(ListSSLCipherSuitesRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListSSLCipherSuitesResponse::builder)
                .logger(LOG, "listSSLCipherSuites")
                .serviceDetails(
                        "LoadBalancer",
                        "ListSSLCipherSuites",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/SSLCipherSuite/ListSSLCipherSuites")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSSLCipherSuitesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("sslCipherSuites")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.SSLCipherSuite.class,
                        ListSSLCipherSuitesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSSLCipherSuitesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", ListSSLCipherSuitesResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ListShapesResponse listShapes(ListShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListShapesResponse::builder)
                .logger(LOG, "listShapes")
                .serviceDetails(
                        "LoadBalancer",
                        "ListShapes",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListShapesRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancerShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.LoadBalancerShape.class,
                        ListShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "LoadBalancer",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("workRequests")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.loadbalancer.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBackendResponse updateBackend(UpdateBackendRequest request) {
        Objects.requireNonNull(
                request.getUpdateBackendDetails(), "updateBackendDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        Validate.notBlank(request.getBackendName(), "backendName must not be blank");

        return clientCall(request, UpdateBackendResponse::builder)
                .logger(LOG, "updateBackend")
                .serviceDetails("LoadBalancer", "UpdateBackend", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackendRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("backends")
                .appendPathParam(request.getBackendName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBackendResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackendResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request) {
        Objects.requireNonNull(
                request.getUpdateBackendSetDetails(), "updateBackendSetDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, UpdateBackendSetResponse::builder)
                .logger(LOG, "updateBackendSet")
                .serviceDetails("LoadBalancer", "UpdateBackendSet", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackendSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackendSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request) {
        Objects.requireNonNull(request.getHealthChecker(), "healthChecker is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getBackendSetName(), "backendSetName must not be blank");

        return clientCall(request, UpdateHealthCheckerResponse::builder)
                .logger(LOG, "updateHealthChecker")
                .serviceDetails("LoadBalancer", "UpdateHealthChecker", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHealthCheckerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("backendSets")
                .appendPathParam(request.getBackendSetName())
                .appendPathParam("healthChecker")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHealthCheckerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHealthCheckerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateHostnameResponse updateHostname(UpdateHostnameRequest request) {
        Objects.requireNonNull(
                request.getUpdateHostnameDetails(), "updateHostnameDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, UpdateHostnameResponse::builder)
                .logger(LOG, "updateHostname")
                .serviceDetails("LoadBalancer", "UpdateHostname", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHostnameRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("hostnames")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateHostnameResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHostnameResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        Objects.requireNonNull(
                request.getUpdateListenerDetails(), "updateListenerDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getListenerName(), "listenerName must not be blank");

        return clientCall(request, UpdateListenerResponse::builder)
                .logger(LOG, "updateListener")
                .serviceDetails("LoadBalancer", "UpdateListener", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateListenerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("listeners")
                .appendPathParam(request.getListenerName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListenerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        Objects.requireNonNull(
                request.getUpdateLoadBalancerDetails(), "updateLoadBalancerDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, UpdateLoadBalancerResponse::builder)
                .logger(LOG, "updateLoadBalancer")
                .serviceDetails("LoadBalancer", "UpdateLoadBalancer", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLoadBalancerRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLoadBalancerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLoadBalancerShapeResponse updateLoadBalancerShape(
            UpdateLoadBalancerShapeRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLoadBalancerShapeDetails(),
                "updateLoadBalancerShapeDetails is required");

        return clientCall(request, UpdateLoadBalancerShapeResponse::builder)
                .logger(LOG, "updateLoadBalancerShape")
                .serviceDetails(
                        "LoadBalancer",
                        "UpdateLoadBalancerShape",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/UpdateLoadBalancerShape")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLoadBalancerShapeRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("updateShape")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateLoadBalancerShapeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLoadBalancerShapeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNetworkSecurityGroupsResponse updateNetworkSecurityGroups(
            UpdateNetworkSecurityGroupsRequest request) {
        Objects.requireNonNull(
                request.getUpdateNetworkSecurityGroupsDetails(),
                "updateNetworkSecurityGroupsDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        return clientCall(request, UpdateNetworkSecurityGroupsResponse::builder)
                .logger(LOG, "updateNetworkSecurityGroups")
                .serviceDetails(
                        "LoadBalancer",
                        "UpdateNetworkSecurityGroups",
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/NetworkSecurityGroups/UpdateNetworkSecurityGroups")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkSecurityGroupsRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("networkSecurityGroups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkSecurityGroupsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkSecurityGroupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePathRouteSetResponse updatePathRouteSet(UpdatePathRouteSetRequest request) {
        Objects.requireNonNull(
                request.getUpdatePathRouteSetDetails(), "updatePathRouteSetDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getPathRouteSetName(), "pathRouteSetName must not be blank");

        return clientCall(request, UpdatePathRouteSetResponse::builder)
                .logger(LOG, "updatePathRouteSet")
                .serviceDetails("LoadBalancer", "UpdatePathRouteSet", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePathRouteSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("pathRouteSets")
                .appendPathParam(request.getPathRouteSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePathRouteSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePathRouteSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRoutingPolicyResponse updateRoutingPolicy(UpdateRoutingPolicyRequest request) {
        Objects.requireNonNull(
                request.getUpdateRoutingPolicyDetails(), "updateRoutingPolicyDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRoutingPolicyName(), "routingPolicyName must not be blank");

        return clientCall(request, UpdateRoutingPolicyResponse::builder)
                .logger(LOG, "updateRoutingPolicy")
                .serviceDetails("LoadBalancer", "UpdateRoutingPolicy", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRoutingPolicyRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("routingPolicies")
                .appendPathParam(request.getRoutingPolicyName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateRoutingPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRoutingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getRuleSetName(), "ruleSetName must not be blank");
        Objects.requireNonNull(
                request.getUpdateRuleSetDetails(), "updateRuleSetDetails is required");

        return clientCall(request, UpdateRuleSetResponse::builder)
                .logger(LOG, "updateRuleSet")
                .serviceDetails("LoadBalancer", "UpdateRuleSet", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRuleSetRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("ruleSets")
                .appendPathParam(request.getRuleSetName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRuleSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRuleSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSSLCipherSuiteResponse updateSSLCipherSuite(UpdateSSLCipherSuiteRequest request) {
        Objects.requireNonNull(
                request.getUpdateSSLCipherSuiteDetails(),
                "updateSSLCipherSuiteDetails is required");

        Validate.notBlank(request.getLoadBalancerId(), "loadBalancerId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, UpdateSSLCipherSuiteResponse::builder)
                .logger(LOG, "updateSSLCipherSuite")
                .serviceDetails("LoadBalancer", "UpdateSSLCipherSuite", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSSLCipherSuiteRequest::builder)
                .basePath("/20170115")
                .appendPathParam("loadBalancers")
                .appendPathParam(request.getLoadBalancerId())
                .appendPathParam("sslCipherSuites")
                .appendPathParam(request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateSSLCipherSuiteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSSLCipherSuiteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LoadBalancerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LoadBalancerPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
