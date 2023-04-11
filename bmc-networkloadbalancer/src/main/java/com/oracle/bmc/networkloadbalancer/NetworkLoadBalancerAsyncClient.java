/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.networkloadbalancer.requests.*;
import com.oracle.bmc.networkloadbalancer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for NetworkLoadBalancer service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class NetworkLoadBalancerAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements NetworkLoadBalancerAsync {
    /** Service instance for NetworkLoadBalancer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKLOADBALANCER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-load-balancer-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkLoadBalancerAsyncClient.class);

    NetworkLoadBalancerAsyncClient(
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
                    Builder, NetworkLoadBalancerAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public NetworkLoadBalancerAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NetworkLoadBalancerAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeNetworkLoadBalancerCompartmentResponse>
            changeNetworkLoadBalancerCompartment(
                    ChangeNetworkLoadBalancerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkLoadBalancerCompartmentRequest,
                                    ChangeNetworkLoadBalancerCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNetworkLoadBalancerCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkLoadBalancerCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackendSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateListenerRequest, CreateListenerResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", CreateListenerResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkLoadBalancerResponse> createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkLoadBalancerRequest, CreateNetworkLoadBalancerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackendSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackendSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteListenerRequest, DeleteListenerResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", DeleteListenerResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkLoadBalancerResponse> deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkLoadBalancerRequest, DeleteNetworkLoadBalancerResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkLoadBalancerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.Backend.class,
                        GetBackendResponse.Builder::backend)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendHealthResponse> getBackendHealth(
            GetBackendHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendHealthRequest, GetBackendHealthResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendHealth.class,
                        GetBackendHealthResponse.Builder::backendHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendHealthResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSet.class,
                        GetBackendSetResponse.Builder::backendSet)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendSetResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetHealthResponse> getBackendSetHealth(
            GetBackendSetHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendSetHealthRequest, GetBackendSetHealthResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSetHealth.class,
                        GetBackendSetHealthResponse.Builder::backendSetHealth)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackendSetHealthResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBackendSetHealthResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.HealthChecker.class,
                        GetHealthCheckerResponse.Builder::healthChecker)
                .handleResponseHeaderString(
                        "opc-request-id", GetHealthCheckerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetHealthCheckerResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetListenerResponse> getListener(
            GetListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetListenerRequest, GetListenerResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.Listener.class,
                        GetListenerResponse.Builder::listener)
                .handleResponseHeaderString(
                        "opc-request-id", GetListenerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListenerResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkLoadBalancerResponse> getNetworkLoadBalancer(
            GetNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkLoadBalancerRequest, GetNetworkLoadBalancerResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancer.class,
                        GetNetworkLoadBalancerResponse.Builder::networkLoadBalancer)
                .handleResponseHeaderString("etag", GetNetworkLoadBalancerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkLoadBalancerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkLoadBalancerHealthResponse>
            getNetworkLoadBalancerHealth(
                    GetNetworkLoadBalancerHealthRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNetworkLoadBalancerHealthRequest,
                                    GetNetworkLoadBalancerHealthResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth.class,
                        GetNetworkLoadBalancerHealthResponse.Builder::networkLoadBalancerHealth)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetNetworkLoadBalancerHealthResponse.Builder::opcRequestId)
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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBackendSetsRequest, ListBackendSetsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendSetCollection.class,
                        ListBackendSetsResponse.Builder::backendSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackendSetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.BackendCollection.class,
                        ListBackendsResponse.Builder::backendCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackendsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackendsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListListenersResponse> listListeners(
            ListListenersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListListenersRequest, ListListenersResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.ListenerCollection.class,
                        ListListenersResponse.Builder::listenerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListListenersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListenersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancerHealthsResponse>
            listNetworkLoadBalancerHealths(
                    ListNetworkLoadBalancerHealthsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancerHealthsRequest,
                                    ListNetworkLoadBalancerHealthsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersResponse> listNetworkLoadBalancers(
            ListNetworkLoadBalancersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
                                .class,
                        ListNetworkLoadBalancersResponse.Builder::networkLoadBalancerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkLoadBalancersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkLoadBalancersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersPoliciesResponse>
            listNetworkLoadBalancersPolicies(
                    ListNetworkLoadBalancersPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancersPoliciesRequest,
                                    ListNetworkLoadBalancersPoliciesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersProtocolsResponse>
            listNetworkLoadBalancersProtocols(
                    ListNetworkLoadBalancersProtocolsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancersProtocolsRequest,
                                    ListNetworkLoadBalancersProtocolsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.networkloadbalancer.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHealthCheckerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHealthCheckerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateListenerRequest, UpdateListenerResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateListenerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateListenerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkLoadBalancerResponse> updateNetworkLoadBalancer(
            UpdateNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkLoadBalancerRequest, UpdateNetworkLoadBalancerResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkLoadBalancerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkLoadBalancerResponse.Builder::opcRequestId)
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkSecurityGroupsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkSecurityGroupsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
