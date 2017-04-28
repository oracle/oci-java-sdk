/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.*;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;
import com.oracle.bmc.http.signing.*;
import com.oracle.bmc.http.signing.internal.*;
import com.oracle.bmc.responses.*;
import com.oracle.bmc.util.internal.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.Future;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.loadbalancer.internal.http.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Slf4j
public class LoadBalancerAsyncClient implements LoadBalancerAsync {
    /**
     * Service instance for LoadBalancer.
     */
    public static final Service SERVICE = Services.create("LOADBALANCER", "iaas");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public LoadBalancerAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LoadBalancerAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration) {
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
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new DefaultRequestSignerFactory(SigningStrategy.STANDARD));
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
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator,
            RequestSignerFactory requestSignerFactory) {
        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(Region region) {
        Optional<String> endpoint = region.getEndpoint(SERVICE);
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
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            AsyncHandler<CreateBackendRequest, CreateBackendResponse> handler) {
        LOG.trace("Called async createBackend");
        request = CreateBackendConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBackendConverter.fromRequest(client, request);
        Function<Response, CreateBackendResponse> transformer =
                CreateBackendConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateBackendDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            AsyncHandler<CreateBackendSetRequest, CreateBackendSetResponse> handler) {
        LOG.trace("Called async createBackendSet");
        request = CreateBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBackendSetConverter.fromRequest(client, request);
        Function<Response, CreateBackendSetResponse> transformer =
                CreateBackendSetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateBackendSetDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            AsyncHandler<CreateCertificateRequest, CreateCertificateResponse> handler) {
        LOG.trace("Called async createCertificate");
        request = CreateCertificateConverter.interceptRequest(request);
        Invocation.Builder ib = CreateCertificateConverter.fromRequest(client, request);
        Function<Response, CreateCertificateResponse> transformer =
                CreateCertificateConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateCertificateDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            AsyncHandler<CreateListenerRequest, CreateListenerResponse> handler) {
        LOG.trace("Called async createListener");
        request = CreateListenerConverter.interceptRequest(request);
        Invocation.Builder ib = CreateListenerConverter.fromRequest(client, request);
        Function<Response, CreateListenerResponse> transformer =
                CreateListenerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateListenerDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResponse> handler) {
        LOG.trace("Called async createLoadBalancer");
        request = CreateLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = CreateLoadBalancerConverter.fromRequest(client, request);
        Function<Response, CreateLoadBalancerResponse> transformer =
                CreateLoadBalancerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateLoadBalancerDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            AsyncHandler<DeleteBackendRequest, DeleteBackendResponse> handler) {
        LOG.trace("Called async deleteBackend");
        request = DeleteBackendConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBackendConverter.fromRequest(client, request);
        Function<Response, DeleteBackendResponse> transformer =
                DeleteBackendConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            AsyncHandler<DeleteBackendSetRequest, DeleteBackendSetResponse> handler) {
        LOG.trace("Called async deleteBackendSet");
        request = DeleteBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBackendSetConverter.fromRequest(client, request);
        Function<Response, DeleteBackendSetResponse> transformer =
                DeleteBackendSetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            AsyncHandler<DeleteCertificateRequest, DeleteCertificateResponse> handler) {
        LOG.trace("Called async deleteCertificate");
        request = DeleteCertificateConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteCertificateConverter.fromRequest(client, request);
        Function<Response, DeleteCertificateResponse> transformer =
                DeleteCertificateConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            AsyncHandler<DeleteListenerRequest, DeleteListenerResponse> handler) {
        LOG.trace("Called async deleteListener");
        request = DeleteListenerConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteListenerConverter.fromRequest(client, request);
        Function<Response, DeleteListenerResponse> transformer =
                DeleteListenerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> handler) {
        LOG.trace("Called async deleteLoadBalancer");
        request = DeleteLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteLoadBalancerConverter.fromRequest(client, request);
        Function<Response, DeleteLoadBalancerResponse> transformer =
                DeleteLoadBalancerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            AsyncHandler<GetBackendRequest, GetBackendResponse> handler) {
        LOG.trace("Called async getBackend");
        request = GetBackendConverter.interceptRequest(request);
        Invocation.Builder ib = GetBackendConverter.fromRequest(client, request);
        Function<Response, GetBackendResponse> transformer = GetBackendConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            AsyncHandler<GetBackendSetRequest, GetBackendSetResponse> handler) {
        LOG.trace("Called async getBackendSet");
        request = GetBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = GetBackendSetConverter.fromRequest(client, request);
        Function<Response, GetBackendSetResponse> transformer =
                GetBackendSetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            AsyncHandler<GetHealthCheckerRequest, GetHealthCheckerResponse> handler) {
        LOG.trace("Called async getHealthChecker");
        request = GetHealthCheckerConverter.interceptRequest(request);
        Invocation.Builder ib = GetHealthCheckerConverter.fromRequest(client, request);
        Function<Response, GetHealthCheckerResponse> transformer =
                GetHealthCheckerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetLoadBalancerResponse> getLoadBalancer(
            GetLoadBalancerRequest request,
            AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResponse> handler) {
        LOG.trace("Called async getLoadBalancer");
        request = GetLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = GetLoadBalancerConverter.fromRequest(client, request);
        Function<Response, GetLoadBalancerResponse> transformer =
                GetLoadBalancerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse> handler) {
        LOG.trace("Called async getWorkRequest");
        request = GetWorkRequestConverter.interceptRequest(request);
        Invocation.Builder ib = GetWorkRequestConverter.fromRequest(client, request);
        Function<Response, GetWorkRequestResponse> transformer =
                GetWorkRequestConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            AsyncHandler<ListBackendSetsRequest, ListBackendSetsResponse> handler) {
        LOG.trace("Called async listBackendSets");
        request = ListBackendSetsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBackendSetsConverter.fromRequest(client, request);
        Function<Response, ListBackendSetsResponse> transformer =
                ListBackendSetsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            AsyncHandler<ListBackendsRequest, ListBackendsResponse> handler) {
        LOG.trace("Called async listBackends");
        request = ListBackendsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBackendsConverter.fromRequest(client, request);
        Function<Response, ListBackendsResponse> transformer = ListBackendsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            AsyncHandler<ListCertificatesRequest, ListCertificatesResponse> handler) {
        LOG.trace("Called async listCertificates");
        request = ListCertificatesConverter.interceptRequest(request);
        Invocation.Builder ib = ListCertificatesConverter.fromRequest(client, request);
        Function<Response, ListCertificatesResponse> transformer =
                ListCertificatesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            AsyncHandler<ListLoadBalancersRequest, ListLoadBalancersResponse> handler) {
        LOG.trace("Called async listLoadBalancers");
        request = ListLoadBalancersConverter.interceptRequest(request);
        Invocation.Builder ib = ListLoadBalancersConverter.fromRequest(client, request);
        Function<Response, ListLoadBalancersResponse> transformer =
                ListLoadBalancersConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            AsyncHandler<ListPoliciesRequest, ListPoliciesResponse> handler) {
        LOG.trace("Called async listPolicies");
        request = ListPoliciesConverter.interceptRequest(request);
        Invocation.Builder ib = ListPoliciesConverter.fromRequest(client, request);
        Function<Response, ListPoliciesResponse> transformer = ListPoliciesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            AsyncHandler<ListProtocolsRequest, ListProtocolsResponse> handler) {
        LOG.trace("Called async listProtocols");
        request = ListProtocolsConverter.interceptRequest(request);
        Invocation.Builder ib = ListProtocolsConverter.fromRequest(client, request);
        Function<Response, ListProtocolsResponse> transformer =
                ListProtocolsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            AsyncHandler<ListShapesRequest, ListShapesResponse> handler) {
        LOG.trace("Called async listShapes");
        request = ListShapesConverter.interceptRequest(request);
        Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        Function<Response, ListShapesResponse> transformer = ListShapesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse> handler) {
        LOG.trace("Called async listWorkRequests");
        request = ListWorkRequestsConverter.interceptRequest(request);
        Invocation.Builder ib = ListWorkRequestsConverter.fromRequest(client, request);
        Function<Response, ListWorkRequestsResponse> transformer =
                ListWorkRequestsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateBackendResponse> updateBackend(
            UpdateBackendRequest request,
            AsyncHandler<UpdateBackendRequest, UpdateBackendResponse> handler) {
        LOG.trace("Called async updateBackend");
        request = UpdateBackendConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBackendConverter.fromRequest(client, request);
        Function<Response, UpdateBackendResponse> transformer =
                UpdateBackendConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateBackendDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateBackendSetResponse> updateBackendSet(
            UpdateBackendSetRequest request,
            AsyncHandler<UpdateBackendSetRequest, UpdateBackendSetResponse> handler) {
        LOG.trace("Called async updateBackendSet");
        request = UpdateBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBackendSetConverter.fromRequest(client, request);
        Function<Response, UpdateBackendSetResponse> transformer =
                UpdateBackendSetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateBackendSetDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            AsyncHandler<UpdateHealthCheckerRequest, UpdateHealthCheckerResponse> handler) {
        LOG.trace("Called async updateHealthChecker");
        request = UpdateHealthCheckerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateHealthCheckerConverter.fromRequest(client, request);
        Function<Response, UpdateHealthCheckerResponse> transformer =
                UpdateHealthCheckerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getHealthChecker(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            AsyncHandler<UpdateListenerRequest, UpdateListenerResponse> handler) {
        LOG.trace("Called async updateListener");
        request = UpdateListenerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateListenerConverter.fromRequest(client, request);
        Function<Response, UpdateListenerResponse> transformer =
                UpdateListenerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateListenerDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            AsyncHandler<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> handler) {
        LOG.trace("Called async updateLoadBalancer");
        request = UpdateLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateLoadBalancerConverter.fromRequest(client, request);
        Function<Response, UpdateLoadBalancerResponse> transformer =
                UpdateLoadBalancerConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateLoadBalancerDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }
}
