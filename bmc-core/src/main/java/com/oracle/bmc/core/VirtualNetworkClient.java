/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class VirtualNetworkClient implements VirtualNetwork {
    /**
     * Service instance for VirtualNetwork.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("VIRTUALNETWORK", "iaas");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final VirtualNetworkWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public VirtualNetworkClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
        // up to 50 (core) threads, time out after 60s idle, all daemon
        java.util.concurrent.ThreadPoolExecutor executorService =
                new java.util.concurrent.ThreadPoolExecutor(
                        50,
                        50,
                        60L,
                        java.util.concurrent.TimeUnit.SECONDS,
                        new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                        new com.google.common.util.concurrent.ThreadFactoryBuilder()
                                .setDaemon(false)
                                .setNameFormat("VirtualNetwork-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new VirtualNetworkWaiters(executorService, this);
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
    public CreateCpeResponse createCpe(CreateCpeRequest request) {
        LOG.trace("Called createCpe");
        request = CreateCpeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCpeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCpeResponse> transformer =
                CreateCpeConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateCpeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCrossConnectResponse createCrossConnect(CreateCrossConnectRequest request) {
        LOG.trace("Called createCrossConnect");
        request = CreateCrossConnectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCrossConnectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCrossConnectResponse>
                transformer = CreateCrossConnectConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateCrossConnectDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCrossConnectGroupResponse createCrossConnectGroup(
            CreateCrossConnectGroupRequest request) {
        LOG.trace("Called createCrossConnectGroup");
        request = CreateCrossConnectGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCrossConnectGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCrossConnectGroupResponse>
                transformer = CreateCrossConnectGroupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateCrossConnectGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateDhcpOptionsResponse createDhcpOptions(CreateDhcpOptionsRequest request) {
        LOG.trace("Called createDhcpOptions");
        request = CreateDhcpOptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDhcpOptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDhcpOptionsResponse>
                transformer = CreateDhcpOptionsConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateDhcpDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateDrgResponse createDrg(CreateDrgRequest request) {
        LOG.trace("Called createDrg");
        request = CreateDrgConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDrgResponse> transformer =
                CreateDrgConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateDrgDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateDrgAttachmentResponse createDrgAttachment(CreateDrgAttachmentRequest request) {
        LOG.trace("Called createDrgAttachment");
        request = CreateDrgAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDrgAttachmentResponse>
                transformer = CreateDrgAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateDrgAttachmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateIPSecConnectionResponse createIPSecConnection(
            CreateIPSecConnectionRequest request) {
        LOG.trace("Called createIPSecConnection");
        request = CreateIPSecConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIPSecConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateIPSecConnectionResponse>
                transformer = CreateIPSecConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateIPSecConnectionDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateInternetGatewayResponse createInternetGateway(
            CreateInternetGatewayRequest request) {
        LOG.trace("Called createInternetGateway");
        request = CreateInternetGatewayConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInternetGatewayConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateInternetGatewayResponse>
                transformer = CreateInternetGatewayConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateInternetGatewayDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreatePrivateIpResponse createPrivateIp(CreatePrivateIpRequest request) {
        LOG.trace("Called createPrivateIp");
        request = CreatePrivateIpConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePrivateIpConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePrivateIpResponse>
                transformer = CreatePrivateIpConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreatePrivateIpDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        LOG.trace("Called createRouteTable");
        request = CreateRouteTableConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRouteTableConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateRouteTableResponse>
                transformer = CreateRouteTableConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateRouteTableDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateSecurityListResponse createSecurityList(CreateSecurityListRequest request) {
        LOG.trace("Called createSecurityList");
        request = CreateSecurityListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityListConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSecurityListResponse>
                transformer = CreateSecurityListConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateSecurityListDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        LOG.trace("Called createSubnet");
        request = CreateSubnetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSubnetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSubnetResponse>
                transformer = CreateSubnetConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateSubnetDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateVcnResponse createVcn(CreateVcnRequest request) {
        LOG.trace("Called createVcn");
        request = CreateVcnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVcnConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateVcnResponse> transformer =
                CreateVcnConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateVcnDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateVirtualCircuitResponse createVirtualCircuit(CreateVirtualCircuitRequest request) {
        LOG.trace("Called createVirtualCircuit");
        request = CreateVirtualCircuitConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVirtualCircuitConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateVirtualCircuitResponse>
                transformer = CreateVirtualCircuitConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateVirtualCircuitDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteCpeResponse deleteCpe(DeleteCpeRequest request) {
        LOG.trace("Called deleteCpe");
        request = DeleteCpeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCpeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCpeResponse> transformer =
                DeleteCpeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteCrossConnectResponse deleteCrossConnect(DeleteCrossConnectRequest request) {
        LOG.trace("Called deleteCrossConnect");
        request = DeleteCrossConnectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCrossConnectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCrossConnectResponse>
                transformer = DeleteCrossConnectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteCrossConnectGroupResponse deleteCrossConnectGroup(
            DeleteCrossConnectGroupRequest request) {
        LOG.trace("Called deleteCrossConnectGroup");
        request = DeleteCrossConnectGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCrossConnectGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCrossConnectGroupResponse>
                transformer = DeleteCrossConnectGroupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteDhcpOptionsResponse deleteDhcpOptions(DeleteDhcpOptionsRequest request) {
        LOG.trace("Called deleteDhcpOptions");
        request = DeleteDhcpOptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDhcpOptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDhcpOptionsResponse>
                transformer = DeleteDhcpOptionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteDrgResponse deleteDrg(DeleteDrgRequest request) {
        LOG.trace("Called deleteDrg");
        request = DeleteDrgConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDrgResponse> transformer =
                DeleteDrgConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteDrgAttachmentResponse deleteDrgAttachment(DeleteDrgAttachmentRequest request) {
        LOG.trace("Called deleteDrgAttachment");
        request = DeleteDrgAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDrgAttachmentResponse>
                transformer = DeleteDrgAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteIPSecConnectionResponse deleteIPSecConnection(
            DeleteIPSecConnectionRequest request) {
        LOG.trace("Called deleteIPSecConnection");
        request = DeleteIPSecConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIPSecConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteIPSecConnectionResponse>
                transformer = DeleteIPSecConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteInternetGatewayResponse deleteInternetGateway(
            DeleteInternetGatewayRequest request) {
        LOG.trace("Called deleteInternetGateway");
        request = DeleteInternetGatewayConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInternetGatewayConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteInternetGatewayResponse>
                transformer = DeleteInternetGatewayConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeletePrivateIpResponse deletePrivateIp(DeletePrivateIpRequest request) {
        LOG.trace("Called deletePrivateIp");
        request = DeletePrivateIpConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePrivateIpConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePrivateIpResponse>
                transformer = DeletePrivateIpConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        LOG.trace("Called deleteRouteTable");
        request = DeleteRouteTableConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRouteTableConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteRouteTableResponse>
                transformer = DeleteRouteTableConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteSecurityListResponse deleteSecurityList(DeleteSecurityListRequest request) {
        LOG.trace("Called deleteSecurityList");
        request = DeleteSecurityListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityListConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSecurityListResponse>
                transformer = DeleteSecurityListConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        LOG.trace("Called deleteSubnet");
        request = DeleteSubnetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSubnetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSubnetResponse>
                transformer = DeleteSubnetConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteVcnResponse deleteVcn(DeleteVcnRequest request) {
        LOG.trace("Called deleteVcn");
        request = DeleteVcnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVcnConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVcnResponse> transformer =
                DeleteVcnConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteVirtualCircuitResponse deleteVirtualCircuit(DeleteVirtualCircuitRequest request) {
        LOG.trace("Called deleteVirtualCircuit");
        request = DeleteVirtualCircuitConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVirtualCircuitConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVirtualCircuitResponse>
                transformer = DeleteVirtualCircuitConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCpeResponse getCpe(GetCpeRequest request) {
        LOG.trace("Called getCpe");
        request = GetCpeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCpeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCpeResponse> transformer =
                GetCpeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCrossConnectResponse getCrossConnect(GetCrossConnectRequest request) {
        LOG.trace("Called getCrossConnect");
        request = GetCrossConnectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCrossConnectResponse>
                transformer = GetCrossConnectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCrossConnectGroupResponse getCrossConnectGroup(GetCrossConnectGroupRequest request) {
        LOG.trace("Called getCrossConnectGroup");
        request = GetCrossConnectGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCrossConnectGroupResponse>
                transformer = GetCrossConnectGroupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCrossConnectLetterOfAuthorityResponse getCrossConnectLetterOfAuthority(
            GetCrossConnectLetterOfAuthorityRequest request) {
        LOG.trace("Called getCrossConnectLetterOfAuthority");
        request = GetCrossConnectLetterOfAuthorityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectLetterOfAuthorityConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCrossConnectLetterOfAuthorityResponse>
                transformer = GetCrossConnectLetterOfAuthorityConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCrossConnectStatusResponse getCrossConnectStatus(
            GetCrossConnectStatusRequest request) {
        LOG.trace("Called getCrossConnectStatus");
        request = GetCrossConnectStatusConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectStatusConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCrossConnectStatusResponse>
                transformer = GetCrossConnectStatusConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDhcpOptionsResponse getDhcpOptions(GetDhcpOptionsRequest request) {
        LOG.trace("Called getDhcpOptions");
        request = GetDhcpOptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDhcpOptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDhcpOptionsResponse>
                transformer = GetDhcpOptionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDrgResponse getDrg(GetDrgRequest request) {
        LOG.trace("Called getDrg");
        request = GetDrgConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDrgResponse> transformer =
                GetDrgConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDrgAttachmentResponse getDrgAttachment(GetDrgAttachmentRequest request) {
        LOG.trace("Called getDrgAttachment");
        request = GetDrgAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDrgAttachmentResponse>
                transformer = GetDrgAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetIPSecConnectionResponse getIPSecConnection(GetIPSecConnectionRequest request) {
        LOG.trace("Called getIPSecConnection");
        request = GetIPSecConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIPSecConnectionResponse>
                transformer = GetIPSecConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetIPSecConnectionDeviceConfigResponse getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request) {
        LOG.trace("Called getIPSecConnectionDeviceConfig");
        request = GetIPSecConnectionDeviceConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionDeviceConfigConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionDeviceConfigResponse>
                transformer = GetIPSecConnectionDeviceConfigConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetIPSecConnectionDeviceStatusResponse getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request) {
        LOG.trace("Called getIPSecConnectionDeviceStatus");
        request = GetIPSecConnectionDeviceStatusConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionDeviceStatusConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionDeviceStatusResponse>
                transformer = GetIPSecConnectionDeviceStatusConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetInternetGatewayResponse getInternetGateway(GetInternetGatewayRequest request) {
        LOG.trace("Called getInternetGateway");
        request = GetInternetGatewayConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInternetGatewayConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInternetGatewayResponse>
                transformer = GetInternetGatewayConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetPrivateIpResponse getPrivateIp(GetPrivateIpRequest request) {
        LOG.trace("Called getPrivateIp");
        request = GetPrivateIpConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPrivateIpConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPrivateIpResponse>
                transformer = GetPrivateIpConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetRouteTableResponse getRouteTable(GetRouteTableRequest request) {
        LOG.trace("Called getRouteTable");
        request = GetRouteTableConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRouteTableConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetRouteTableResponse>
                transformer = GetRouteTableConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetSecurityListResponse getSecurityList(GetSecurityListRequest request) {
        LOG.trace("Called getSecurityList");
        request = GetSecurityListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityListConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSecurityListResponse>
                transformer = GetSecurityListConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetSubnetResponse getSubnet(GetSubnetRequest request) {
        LOG.trace("Called getSubnet");
        request = GetSubnetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSubnetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSubnetResponse> transformer =
                GetSubnetConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVcnResponse getVcn(GetVcnRequest request) {
        LOG.trace("Called getVcn");
        request = GetVcnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVcnConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVcnResponse> transformer =
                GetVcnConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVirtualCircuitResponse getVirtualCircuit(GetVirtualCircuitRequest request) {
        LOG.trace("Called getVirtualCircuit");
        request = GetVirtualCircuitConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVirtualCircuitConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVirtualCircuitResponse>
                transformer = GetVirtualCircuitConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVnicResponse getVnic(GetVnicRequest request) {
        LOG.trace("Called getVnic");
        request = GetVnicConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVnicResponse> transformer =
                GetVnicConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCpesResponse listCpes(ListCpesRequest request) {
        LOG.trace("Called listCpes");
        request = ListCpesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCpesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCpesResponse> transformer =
                ListCpesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCrossConnectGroupsResponse listCrossConnectGroups(
            ListCrossConnectGroupsRequest request) {
        LOG.trace("Called listCrossConnectGroups");
        request = ListCrossConnectGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCrossConnectGroupsResponse>
                transformer = ListCrossConnectGroupsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCrossConnectLocationsResponse listCrossConnectLocations(
            ListCrossConnectLocationsRequest request) {
        LOG.trace("Called listCrossConnectLocations");
        request = ListCrossConnectLocationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectLocationsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCrossConnectLocationsResponse>
                transformer = ListCrossConnectLocationsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCrossConnectsResponse listCrossConnects(ListCrossConnectsRequest request) {
        LOG.trace("Called listCrossConnects");
        request = ListCrossConnectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCrossConnectsResponse>
                transformer = ListCrossConnectsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCrossconnectPortSpeedShapesResponse listCrossconnectPortSpeedShapes(
            ListCrossconnectPortSpeedShapesRequest request) {
        LOG.trace("Called listCrossconnectPortSpeedShapes");
        request = ListCrossconnectPortSpeedShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossconnectPortSpeedShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCrossconnectPortSpeedShapesResponse>
                transformer = ListCrossconnectPortSpeedShapesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDhcpOptionsResponse listDhcpOptions(ListDhcpOptionsRequest request) {
        LOG.trace("Called listDhcpOptions");
        request = ListDhcpOptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDhcpOptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDhcpOptionsResponse>
                transformer = ListDhcpOptionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDrgAttachmentsResponse listDrgAttachments(ListDrgAttachmentsRequest request) {
        LOG.trace("Called listDrgAttachments");
        request = ListDrgAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDrgAttachmentsResponse>
                transformer = ListDrgAttachmentsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDrgsResponse listDrgs(ListDrgsRequest request) {
        LOG.trace("Called listDrgs");
        request = ListDrgsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDrgsResponse> transformer =
                ListDrgsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListFastConnectProviderServicesResponse listFastConnectProviderServices(
            ListFastConnectProviderServicesRequest request) {
        LOG.trace("Called listFastConnectProviderServices");
        request = ListFastConnectProviderServicesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFastConnectProviderServicesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListFastConnectProviderServicesResponse>
                transformer = ListFastConnectProviderServicesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListIPSecConnectionsResponse listIPSecConnections(ListIPSecConnectionsRequest request) {
        LOG.trace("Called listIPSecConnections");
        request = ListIPSecConnectionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIPSecConnectionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIPSecConnectionsResponse>
                transformer = ListIPSecConnectionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListInternetGatewaysResponse listInternetGateways(ListInternetGatewaysRequest request) {
        LOG.trace("Called listInternetGateways");
        request = ListInternetGatewaysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInternetGatewaysConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListInternetGatewaysResponse>
                transformer = ListInternetGatewaysConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListPrivateIpsResponse listPrivateIps(ListPrivateIpsRequest request) {
        LOG.trace("Called listPrivateIps");
        request = ListPrivateIpsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPrivateIpsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPrivateIpsResponse>
                transformer = ListPrivateIpsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        LOG.trace("Called listRouteTables");
        request = ListRouteTablesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRouteTablesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRouteTablesResponse>
                transformer = ListRouteTablesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListSecurityListsResponse listSecurityLists(ListSecurityListsRequest request) {
        LOG.trace("Called listSecurityLists");
        request = ListSecurityListsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityListsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSecurityListsResponse>
                transformer = ListSecurityListsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        LOG.trace("Called listSubnets");
        request = ListSubnetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSubnetsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSubnetsResponse>
                transformer = ListSubnetsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVcnsResponse listVcns(ListVcnsRequest request) {
        LOG.trace("Called listVcns");
        request = ListVcnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVcnsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVcnsResponse> transformer =
                ListVcnsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVirtualCircuitBandwidthShapesResponse listVirtualCircuitBandwidthShapes(
            ListVirtualCircuitBandwidthShapesRequest request) {
        LOG.trace("Called listVirtualCircuitBandwidthShapes");
        request = ListVirtualCircuitBandwidthShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitBandwidthShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVirtualCircuitBandwidthShapesResponse>
                transformer = ListVirtualCircuitBandwidthShapesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVirtualCircuitsResponse listVirtualCircuits(ListVirtualCircuitsRequest request) {
        LOG.trace("Called listVirtualCircuits");
        request = ListVirtualCircuitsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVirtualCircuitsResponse>
                transformer = ListVirtualCircuitsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCpeResponse updateCpe(UpdateCpeRequest request) {
        LOG.trace("Called updateCpe");
        request = UpdateCpeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCpeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCpeResponse> transformer =
                UpdateCpeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.put(ib, request.getUpdateCpeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCrossConnectResponse updateCrossConnect(UpdateCrossConnectRequest request) {
        LOG.trace("Called updateCrossConnect");
        request = UpdateCrossConnectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCrossConnectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCrossConnectResponse>
                transformer = UpdateCrossConnectConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateCrossConnectDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCrossConnectGroupResponse updateCrossConnectGroup(
            UpdateCrossConnectGroupRequest request) {
        LOG.trace("Called updateCrossConnectGroup");
        request = UpdateCrossConnectGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCrossConnectGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCrossConnectGroupResponse>
                transformer = UpdateCrossConnectGroupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateCrossConnectGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDhcpOptionsResponse updateDhcpOptions(UpdateDhcpOptionsRequest request) {
        LOG.trace("Called updateDhcpOptions");
        request = UpdateDhcpOptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDhcpOptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDhcpOptionsResponse>
                transformer = UpdateDhcpOptionsConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateDhcpDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDrgResponse updateDrg(UpdateDrgRequest request) {
        LOG.trace("Called updateDrg");
        request = UpdateDrgConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDrgResponse> transformer =
                UpdateDrgConverter.fromResponse();

        javax.ws.rs.core.Response response = client.put(ib, request.getUpdateDrgDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDrgAttachmentResponse updateDrgAttachment(UpdateDrgAttachmentRequest request) {
        LOG.trace("Called updateDrgAttachment");
        request = UpdateDrgAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDrgAttachmentResponse>
                transformer = UpdateDrgAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateDrgAttachmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateIPSecConnectionResponse updateIPSecConnection(
            UpdateIPSecConnectionRequest request) {
        LOG.trace("Called updateIPSecConnection");
        request = UpdateIPSecConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIPSecConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateIPSecConnectionResponse>
                transformer = UpdateIPSecConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateIPSecConnectionDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateInternetGatewayResponse updateInternetGateway(
            UpdateInternetGatewayRequest request) {
        LOG.trace("Called updateInternetGateway");
        request = UpdateInternetGatewayConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInternetGatewayConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInternetGatewayResponse>
                transformer = UpdateInternetGatewayConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateInternetGatewayDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdatePrivateIpResponse updatePrivateIp(UpdatePrivateIpRequest request) {
        LOG.trace("Called updatePrivateIp");
        request = UpdatePrivateIpConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePrivateIpConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePrivateIpResponse>
                transformer = UpdatePrivateIpConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdatePrivateIpDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        LOG.trace("Called updateRouteTable");
        request = UpdateRouteTableConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRouteTableConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateRouteTableResponse>
                transformer = UpdateRouteTableConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateRouteTableDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateSecurityListResponse updateSecurityList(UpdateSecurityListRequest request) {
        LOG.trace("Called updateSecurityList");
        request = UpdateSecurityListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityListConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSecurityListResponse>
                transformer = UpdateSecurityListConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateSecurityListDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        LOG.trace("Called updateSubnet");
        request = UpdateSubnetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSubnetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSubnetResponse>
                transformer = UpdateSubnetConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateSubnetDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateVcnResponse updateVcn(UpdateVcnRequest request) {
        LOG.trace("Called updateVcn");
        request = UpdateVcnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVcnConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVcnResponse> transformer =
                UpdateVcnConverter.fromResponse();

        javax.ws.rs.core.Response response = client.put(ib, request.getUpdateVcnDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateVirtualCircuitResponse updateVirtualCircuit(UpdateVirtualCircuitRequest request) {
        LOG.trace("Called updateVirtualCircuit");
        request = UpdateVirtualCircuitConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVirtualCircuitConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVirtualCircuitResponse>
                transformer = UpdateVirtualCircuitConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateVirtualCircuitDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateVnicResponse updateVnic(UpdateVnicRequest request) {
        LOG.trace("Called updateVnic");
        request = UpdateVnicConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVnicResponse> transformer =
                UpdateVnicConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateVnicDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public VirtualNetworkWaiters getWaiters() {
        return waiters;
    }
}
