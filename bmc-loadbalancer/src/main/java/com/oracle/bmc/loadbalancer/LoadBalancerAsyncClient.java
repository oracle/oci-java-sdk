/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LoadBalancer service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class LoadBalancerAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LoadBalancerAsync {
    /** Service instance for LoadBalancer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOADBALANCER")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LoadBalancerAsyncClient.class);

    LoadBalancerAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LoadBalancerAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "loadbalancer";
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
        public LoadBalancerAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LoadBalancerAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeLoadBalancerCompartmentResponse>
            changeLoadBalancerCompartment(
                    ChangeLoadBalancerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLoadBalancerCompartmentRequest,
                                    ChangeLoadBalancerCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBackendSetRequest, CreateBackendSetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateHostnameResponse> createHostname(
            CreateHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostnameRequest, CreateHostnameResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateListenerRequest, CreateListenerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePathRouteSetResponse> createPathRouteSet(
            CreatePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePathRouteSetRequest, CreatePathRouteSetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingPolicyResponse> createRoutingPolicy(
            CreateRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleSetResponse> createRuleSet(
            CreateRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSSLCipherSuiteResponse> createSSLCipherSuite(
            CreateSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBackendSetRequest, DeleteBackendSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostnameResponse> deleteHostname(
            DeleteHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostnameRequest, DeleteHostnameResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteListenerRequest, DeleteListenerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePathRouteSetResponse> deletePathRouteSet(
            DeletePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePathRouteSetRequest, DeletePathRouteSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoutingPolicyResponse> deleteRoutingPolicy(
            DeleteRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleSetResponse> deleteRuleSet(
            DeleteRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSSLCipherSuiteResponse> deleteSSLCipherSuite(
            DeleteSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendHealthResponse> getBackendHealth(
            GetBackendHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendHealthRequest, GetBackendHealthResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetHealthResponse> getBackendSetHealth(
            GetBackendSetHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendSetHealthRequest, GetBackendSetHealthResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHostnameResponse> getHostname(
            GetHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetHostnameRequest, GetHostnameResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerResponse> getLoadBalancer(
            GetLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerRequest, GetLoadBalancerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerHealthResponse> getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPathRouteSetResponse> getPathRouteSet(
            GetPathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPathRouteSetRequest, GetPathRouteSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoutingPolicyResponse> getRoutingPolicy(
            GetRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoutingPolicyRequest, GetRoutingPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRuleSetResponse> getRuleSet(
            GetRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRuleSetRequest, GetRuleSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSSLCipherSuiteResponse> getSSLCipherSuite(
            GetSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBackendSetsRequest, ListBackendSetsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHostnamesResponse> listHostnames(
            ListHostnamesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListHostnamesRequest, ListHostnamesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListListenerRulesResponse> listListenerRules(
            ListListenerRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListListenerRulesRequest, ListListenerRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLoadBalancerHealthsResponse> listLoadBalancerHealths(
            ListLoadBalancerHealthsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancersRequest, ListLoadBalancersResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPathRouteSetsResponse> listPathRouteSets(
            ListPathRouteSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPathRouteSetsRequest, ListPathRouteSetsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingPoliciesResponse> listRoutingPolicies(
            ListRoutingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRuleSetsResponse> listRuleSets(
            ListRuleSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSSLCipherSuitesResponse> listSSLCipherSuites(
            ListSSLCipherSuitesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendResponse> updateBackend(
            UpdateBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBackendRequest, UpdateBackendResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendSetResponse> updateBackendSet(
            UpdateBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBackendSetRequest, UpdateBackendSetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostnameResponse> updateHostname(
            UpdateHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostnameRequest, UpdateHostnameResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateListenerRequest, UpdateListenerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoadBalancerShapeResponse> updateLoadBalancerShape(
            UpdateLoadBalancerShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSecurityGroupsResponse>
            updateNetworkSecurityGroups(
                    UpdateNetworkSecurityGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkSecurityGroupsRequest,
                                    UpdateNetworkSecurityGroupsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePathRouteSetResponse> updatePathRouteSet(
            UpdatePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingPolicyResponse> updateRoutingPolicy(
            UpdateRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleSetResponse> updateRuleSet(
            UpdateRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSSLCipherSuiteResponse> updateSSLCipherSuite(
            UpdateSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>
                    handler) {
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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
