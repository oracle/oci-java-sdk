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

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class LoadBalancerClient implements LoadBalancer {
    /**
     * Service instance for LoadBalancer.
     */
    public static final Service SERVICE = Services.create("LOADBALANCER", "iaas");

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);
    private final LoadBalancerWaiters waiters;

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public LoadBalancerClient(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator,
            RequestSignerFactory requestSignerFactory) {
        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);

        this.waiters = new LoadBalancerWaiters(executorService, this);
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
    public CreateBackendResponse createBackend(CreateBackendRequest request) {
        LOG.trace("Called createBackend");
        request = CreateBackendConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBackendConverter.fromRequest(client, request);
        Function<Response, CreateBackendResponse> transformer =
                CreateBackendConverter.fromResponse();

        Response response = client.post(ib, request.getCreateBackendDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request) {
        LOG.trace("Called createBackendSet");
        request = CreateBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBackendSetConverter.fromRequest(client, request);
        Function<Response, CreateBackendSetResponse> transformer =
                CreateBackendSetConverter.fromResponse();

        Response response = client.post(ib, request.getCreateBackendSetDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        LOG.trace("Called createCertificate");
        request = CreateCertificateConverter.interceptRequest(request);
        Invocation.Builder ib = CreateCertificateConverter.fromRequest(client, request);
        Function<Response, CreateCertificateResponse> transformer =
                CreateCertificateConverter.fromResponse();

        Response response = client.post(ib, request.getCreateCertificateDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        LOG.trace("Called createListener");
        request = CreateListenerConverter.interceptRequest(request);
        Invocation.Builder ib = CreateListenerConverter.fromRequest(client, request);
        Function<Response, CreateListenerResponse> transformer =
                CreateListenerConverter.fromResponse();

        Response response = client.post(ib, request.getCreateListenerDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        LOG.trace("Called createLoadBalancer");
        request = CreateLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = CreateLoadBalancerConverter.fromRequest(client, request);
        Function<Response, CreateLoadBalancerResponse> transformer =
                CreateLoadBalancerConverter.fromResponse();

        Response response = client.post(ib, request.getCreateLoadBalancerDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) {
        LOG.trace("Called deleteBackend");
        request = DeleteBackendConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBackendConverter.fromRequest(client, request);
        Function<Response, DeleteBackendResponse> transformer =
                DeleteBackendConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request) {
        LOG.trace("Called deleteBackendSet");
        request = DeleteBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBackendSetConverter.fromRequest(client, request);
        Function<Response, DeleteBackendSetResponse> transformer =
                DeleteBackendSetConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        LOG.trace("Called deleteCertificate");
        request = DeleteCertificateConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteCertificateConverter.fromRequest(client, request);
        Function<Response, DeleteCertificateResponse> transformer =
                DeleteCertificateConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        LOG.trace("Called deleteListener");
        request = DeleteListenerConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteListenerConverter.fromRequest(client, request);
        Function<Response, DeleteListenerResponse> transformer =
                DeleteListenerConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        LOG.trace("Called deleteLoadBalancer");
        request = DeleteLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteLoadBalancerConverter.fromRequest(client, request);
        Function<Response, DeleteLoadBalancerResponse> transformer =
                DeleteLoadBalancerConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetBackendResponse getBackend(GetBackendRequest request) {
        LOG.trace("Called getBackend");
        request = GetBackendConverter.interceptRequest(request);
        Invocation.Builder ib = GetBackendConverter.fromRequest(client, request);
        Function<Response, GetBackendResponse> transformer = GetBackendConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetBackendSetResponse getBackendSet(GetBackendSetRequest request) {
        LOG.trace("Called getBackendSet");
        request = GetBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = GetBackendSetConverter.fromRequest(client, request);
        Function<Response, GetBackendSetResponse> transformer =
                GetBackendSetConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request) {
        LOG.trace("Called getHealthChecker");
        request = GetHealthCheckerConverter.interceptRequest(request);
        Invocation.Builder ib = GetHealthCheckerConverter.fromRequest(client, request);
        Function<Response, GetHealthCheckerResponse> transformer =
                GetHealthCheckerConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request) {
        LOG.trace("Called getLoadBalancer");
        request = GetLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = GetLoadBalancerConverter.fromRequest(client, request);
        Function<Response, GetLoadBalancerResponse> transformer =
                GetLoadBalancerConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        request = GetWorkRequestConverter.interceptRequest(request);
        Invocation.Builder ib = GetWorkRequestConverter.fromRequest(client, request);
        Function<Response, GetWorkRequestResponse> transformer =
                GetWorkRequestConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request) {
        LOG.trace("Called listBackendSets");
        request = ListBackendSetsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBackendSetsConverter.fromRequest(client, request);
        Function<Response, ListBackendSetsResponse> transformer =
                ListBackendSetsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListBackendsResponse listBackends(ListBackendsRequest request) {
        LOG.trace("Called listBackends");
        request = ListBackendsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBackendsConverter.fromRequest(client, request);
        Function<Response, ListBackendsResponse> transformer = ListBackendsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        LOG.trace("Called listCertificates");
        request = ListCertificatesConverter.interceptRequest(request);
        Invocation.Builder ib = ListCertificatesConverter.fromRequest(client, request);
        Function<Response, ListCertificatesResponse> transformer =
                ListCertificatesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        LOG.trace("Called listLoadBalancers");
        request = ListLoadBalancersConverter.interceptRequest(request);
        Invocation.Builder ib = ListLoadBalancersConverter.fromRequest(client, request);
        Function<Response, ListLoadBalancersResponse> transformer =
                ListLoadBalancersConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        LOG.trace("Called listPolicies");
        request = ListPoliciesConverter.interceptRequest(request);
        Invocation.Builder ib = ListPoliciesConverter.fromRequest(client, request);
        Function<Response, ListPoliciesResponse> transformer = ListPoliciesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListProtocolsResponse listProtocols(ListProtocolsRequest request) {
        LOG.trace("Called listProtocols");
        request = ListProtocolsConverter.interceptRequest(request);
        Invocation.Builder ib = ListProtocolsConverter.fromRequest(client, request);
        Function<Response, ListProtocolsResponse> transformer =
                ListProtocolsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListShapesResponse listShapes(ListShapesRequest request) {
        LOG.trace("Called listShapes");
        request = ListShapesConverter.interceptRequest(request);
        Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        Function<Response, ListShapesResponse> transformer = ListShapesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        request = ListWorkRequestsConverter.interceptRequest(request);
        Invocation.Builder ib = ListWorkRequestsConverter.fromRequest(client, request);
        Function<Response, ListWorkRequestsResponse> transformer =
                ListWorkRequestsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateBackendResponse updateBackend(UpdateBackendRequest request) {
        LOG.trace("Called updateBackend");
        request = UpdateBackendConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBackendConverter.fromRequest(client, request);
        Function<Response, UpdateBackendResponse> transformer =
                UpdateBackendConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateBackendDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request) {
        LOG.trace("Called updateBackendSet");
        request = UpdateBackendSetConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBackendSetConverter.fromRequest(client, request);
        Function<Response, UpdateBackendSetResponse> transformer =
                UpdateBackendSetConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateBackendSetDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request) {
        LOG.trace("Called updateHealthChecker");
        request = UpdateHealthCheckerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateHealthCheckerConverter.fromRequest(client, request);
        Function<Response, UpdateHealthCheckerResponse> transformer =
                UpdateHealthCheckerConverter.fromResponse();

        Response response = client.put(ib, request.getHealthChecker(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        LOG.trace("Called updateListener");
        request = UpdateListenerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateListenerConverter.fromRequest(client, request);
        Function<Response, UpdateListenerResponse> transformer =
                UpdateListenerConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateListenerDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        LOG.trace("Called updateLoadBalancer");
        request = UpdateLoadBalancerConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateLoadBalancerConverter.fromRequest(client, request);
        Function<Response, UpdateLoadBalancerResponse> transformer =
                UpdateLoadBalancerConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateLoadBalancerDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public LoadBalancerWaiters getWaiters() {
        return waiters;
    }
}
