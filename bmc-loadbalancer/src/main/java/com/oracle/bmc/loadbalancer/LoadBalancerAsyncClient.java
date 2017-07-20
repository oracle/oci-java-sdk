/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.internal.http.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.extern.slf4j.Slf4j
public class LoadBalancerAsyncClient implements LoadBalancerAsync {
    /**
     * Service instance for LoadBalancer.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("LOADBALANCER", "iaas");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public LoadBalancerAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LoadBalancerAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public LoadBalancerAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public LoadBalancerAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                    handler) {
        LOG.trace("Called async createBackend");
        request = CreateBackendConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendResponse>
                transformer = CreateBackendConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateBackendDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackendSetRequest, CreateBackendSetResponse>
                    handler) {
        LOG.trace("Called async createBackendSet");
        request = CreateBackendSetConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendSetResponse>
                transformer = CreateBackendSetConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateBackendSetDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        LOG.trace("Called async createCertificate");
        request = CreateCertificateConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer = CreateCertificateConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateCertificateDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateListenerRequest, CreateListenerResponse>
                    handler) {
        LOG.trace("Called async createListener");
        request = CreateListenerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateListenerResponse>
                transformer = CreateListenerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateListenerDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async createLoadBalancer");
        request = CreateLoadBalancerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateLoadBalancerResponse>
                transformer = CreateLoadBalancerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCreateLoadBalancerDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler) {
        LOG.trace("Called async deleteBackend");
        request = DeleteBackendConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendResponse>
                transformer = DeleteBackendConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendSetRequest, DeleteBackendSetResponse>
                    handler) {
        LOG.trace("Called async deleteBackendSet");
        request = DeleteBackendSetConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendSetResponse>
                transformer = DeleteBackendSetConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler) {
        LOG.trace("Called async deleteCertificate");
        request = DeleteCertificateConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer = DeleteCertificateConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteListenerRequest, DeleteListenerResponse>
                    handler) {
        LOG.trace("Called async deleteListener");
        request = DeleteListenerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteListenerResponse>
                transformer = DeleteListenerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async deleteLoadBalancer");
        request = DeleteLoadBalancerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteLoadBalancerResponse>
                transformer = DeleteLoadBalancerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse> handler) {
        LOG.trace("Called async getBackend");
        request = GetBackendConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendResponse> transformer =
                GetBackendConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                    handler) {
        LOG.trace("Called async getBackendSet");
        request = GetBackendSetConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendSetResponse>
                transformer = GetBackendSetConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler) {
        LOG.trace("Called async getHealthChecker");
        request = GetHealthCheckerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetHealthCheckerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetHealthCheckerResponse>
                transformer = GetHealthCheckerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerResponse> getLoadBalancer(
            GetLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async getLoadBalancer");
        request = GetLoadBalancerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetLoadBalancerResponse>
                transformer = GetLoadBalancerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getWorkRequest");
        request = GetWorkRequestConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetWorkRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackendSetsRequest, ListBackendSetsResponse>
                    handler) {
        LOG.trace("Called async listBackendSets");
        request = ListBackendSetsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListBackendSetsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendSetsResponse>
                transformer = ListBackendSetsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler) {
        LOG.trace("Called async listBackends");
        request = ListBackendsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListBackendsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendsResponse>
                transformer = ListBackendsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                    handler) {
        LOG.trace("Called async listCertificates");
        request = ListCertificatesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListCertificatesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer = ListCertificatesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancersRequest, ListLoadBalancersResponse>
                    handler) {
        LOG.trace("Called async listLoadBalancers");
        request = ListLoadBalancersConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListLoadBalancersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListLoadBalancersResponse>
                transformer = ListLoadBalancersConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        request = ListPoliciesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListPoliciesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer = ListPoliciesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                    handler) {
        LOG.trace("Called async listProtocols");
        request = ListProtocolsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListProtocolsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListProtocolsResponse>
                transformer = ListProtocolsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler) {
        LOG.trace("Called async listShapes");
        request = ListShapesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse> transformer =
                ListShapesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequests");
        request = ListWorkRequestsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListWorkRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendResponse> updateBackend(
            UpdateBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBackendRequest, UpdateBackendResponse>
                    handler) {
        LOG.trace("Called async updateBackend");
        request = UpdateBackendConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendResponse>
                transformer = UpdateBackendConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateBackendDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendSetResponse> updateBackendSet(
            UpdateBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBackendSetRequest, UpdateBackendSetResponse>
                    handler) {
        LOG.trace("Called async updateBackendSet");
        request = UpdateBackendSetConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendSetResponse>
                transformer = UpdateBackendSetConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateBackendSetDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                    handler) {
        LOG.trace("Called async updateHealthChecker");
        request = UpdateHealthCheckerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateHealthCheckerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateHealthCheckerResponse>
                transformer = UpdateHealthCheckerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getHealthChecker(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateListenerRequest, UpdateListenerResponse>
                    handler) {
        LOG.trace("Called async updateListener");
        request = UpdateListenerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateListenerResponse>
                transformer = UpdateListenerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateListenerDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async updateLoadBalancer");
        request = UpdateLoadBalancerConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateLoadBalancerResponse>
                transformer = UpdateLoadBalancerConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateLoadBalancerDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
