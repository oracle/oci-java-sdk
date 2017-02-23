/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;
import com.oracle.bmc.responses.*;
import com.oracle.bmc.util.internal.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.Future;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class VirtualNetworkAsyncClient implements VirtualNetworkAsync {
    /**
     * Service instance for VirtualNetwork.
     */
    public static final Service SERVICE = Services.create("VIRTUALNETWORK", "iaas");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationProvider The authentication details provider, required.
     */
    public VirtualNetworkAsyncClient(AuthenticationDetailsProvider authenticationProvider) {
        this.client = newClientBuilder().build().create(SERVICE, authenticationProvider);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public VirtualNetworkAsyncClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration) {
        this.client =
                newClientBuilder().build().create(SERVICE, authenticationProvider, configuration);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public VirtualNetworkAsyncClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this.client =
                newClientBuilder()
                        .clientConfigurator(clientConfigurator)
                        .build()
                        .create(SERVICE, authenticationProvider, configuration);
    }

    private static RestClientFactoryBuilder newClientBuilder() {
        RestClientFactoryBuilder builder = RestClientFactoryBuilder.builder();

        return builder;
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
    public Future<CreateCpeResponse> createCpe(
            CreateCpeRequest request, AsyncHandler<CreateCpeRequest, CreateCpeResponse> handler) {
        LOG.trace("Called async createCpe");
        Invocation.Builder ib = CreateCpeConverter.fromRequest(client, request);
        Function<Response, CreateCpeResponse> transformer = CreateCpeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateCpeDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateDhcpOptionsResponse> createDhcpOptions(
            CreateDhcpOptionsRequest request,
            AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResponse> handler) {
        LOG.trace("Called async createDhcpOptions");
        Invocation.Builder ib = CreateDhcpOptionsConverter.fromRequest(client, request);
        Function<Response, CreateDhcpOptionsResponse> transformer =
                CreateDhcpOptionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateDhcpDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateDrgResponse> createDrg(
            CreateDrgRequest request, AsyncHandler<CreateDrgRequest, CreateDrgResponse> handler) {
        LOG.trace("Called async createDrg");
        Invocation.Builder ib = CreateDrgConverter.fromRequest(client, request);
        Function<Response, CreateDrgResponse> transformer = CreateDrgConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateDrgDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateDrgAttachmentResponse> createDrgAttachment(
            CreateDrgAttachmentRequest request,
            AsyncHandler<CreateDrgAttachmentRequest, CreateDrgAttachmentResponse> handler) {
        LOG.trace("Called async createDrgAttachment");
        Invocation.Builder ib = CreateDrgAttachmentConverter.fromRequest(client, request);
        Function<Response, CreateDrgAttachmentResponse> transformer =
                CreateDrgAttachmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateDrgAttachmentDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateIPSecConnectionResponse> createIPSecConnection(
            CreateIPSecConnectionRequest request,
            AsyncHandler<CreateIPSecConnectionRequest, CreateIPSecConnectionResponse> handler) {
        LOG.trace("Called async createIPSecConnection");
        Invocation.Builder ib = CreateIPSecConnectionConverter.fromRequest(client, request);
        Function<Response, CreateIPSecConnectionResponse> transformer =
                CreateIPSecConnectionConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateIPSecConnectionDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateInternetGatewayResponse> createInternetGateway(
            CreateInternetGatewayRequest request,
            AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResponse> handler) {
        LOG.trace("Called async createInternetGateway");
        Invocation.Builder ib = CreateInternetGatewayConverter.fromRequest(client, request);
        Function<Response, CreateInternetGatewayResponse> transformer =
                CreateInternetGatewayConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateInternetGatewayDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateRouteTableResponse> createRouteTable(
            CreateRouteTableRequest request,
            AsyncHandler<CreateRouteTableRequest, CreateRouteTableResponse> handler) {
        LOG.trace("Called async createRouteTable");
        Invocation.Builder ib = CreateRouteTableConverter.fromRequest(client, request);
        Function<Response, CreateRouteTableResponse> transformer =
                CreateRouteTableConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateRouteTableDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateSecurityListResponse> createSecurityList(
            CreateSecurityListRequest request,
            AsyncHandler<CreateSecurityListRequest, CreateSecurityListResponse> handler) {
        LOG.trace("Called async createSecurityList");
        Invocation.Builder ib = CreateSecurityListConverter.fromRequest(client, request);
        Function<Response, CreateSecurityListResponse> transformer =
                CreateSecurityListConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateSecurityListDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateSubnetResponse> createSubnet(
            CreateSubnetRequest request,
            AsyncHandler<CreateSubnetRequest, CreateSubnetResponse> handler) {
        LOG.trace("Called async createSubnet");
        Invocation.Builder ib = CreateSubnetConverter.fromRequest(client, request);
        Function<Response, CreateSubnetResponse> transformer = CreateSubnetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateSubnetDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateVcnResponse> createVcn(
            CreateVcnRequest request, AsyncHandler<CreateVcnRequest, CreateVcnResponse> handler) {
        LOG.trace("Called async createVcn");
        Invocation.Builder ib = CreateVcnConverter.fromRequest(client, request);
        Function<Response, CreateVcnResponse> transformer = CreateVcnConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateVcnDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteCpeResponse> deleteCpe(
            DeleteCpeRequest request, AsyncHandler<DeleteCpeRequest, DeleteCpeResponse> handler) {
        LOG.trace("Called async deleteCpe");
        Invocation.Builder ib = DeleteCpeConverter.fromRequest(client, request);
        Function<Response, DeleteCpeResponse> transformer = DeleteCpeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteDhcpOptionsResponse> deleteDhcpOptions(
            DeleteDhcpOptionsRequest request,
            AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse> handler) {
        LOG.trace("Called async deleteDhcpOptions");
        Invocation.Builder ib = DeleteDhcpOptionsConverter.fromRequest(client, request);
        Function<Response, DeleteDhcpOptionsResponse> transformer =
                DeleteDhcpOptionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteDrgResponse> deleteDrg(
            DeleteDrgRequest request, AsyncHandler<DeleteDrgRequest, DeleteDrgResponse> handler) {
        LOG.trace("Called async deleteDrg");
        Invocation.Builder ib = DeleteDrgConverter.fromRequest(client, request);
        Function<Response, DeleteDrgResponse> transformer = DeleteDrgConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteDrgAttachmentResponse> deleteDrgAttachment(
            DeleteDrgAttachmentRequest request,
            AsyncHandler<DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse> handler) {
        LOG.trace("Called async deleteDrgAttachment");
        Invocation.Builder ib = DeleteDrgAttachmentConverter.fromRequest(client, request);
        Function<Response, DeleteDrgAttachmentResponse> transformer =
                DeleteDrgAttachmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteIPSecConnectionResponse> deleteIPSecConnection(
            DeleteIPSecConnectionRequest request,
            AsyncHandler<DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse> handler) {
        LOG.trace("Called async deleteIPSecConnection");
        Invocation.Builder ib = DeleteIPSecConnectionConverter.fromRequest(client, request);
        Function<Response, DeleteIPSecConnectionResponse> transformer =
                DeleteIPSecConnectionConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteInternetGatewayResponse> deleteInternetGateway(
            DeleteInternetGatewayRequest request,
            AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResponse> handler) {
        LOG.trace("Called async deleteInternetGateway");
        Invocation.Builder ib = DeleteInternetGatewayConverter.fromRequest(client, request);
        Function<Response, DeleteInternetGatewayResponse> transformer =
                DeleteInternetGatewayConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteRouteTableResponse> deleteRouteTable(
            DeleteRouteTableRequest request,
            AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResponse> handler) {
        LOG.trace("Called async deleteRouteTable");
        Invocation.Builder ib = DeleteRouteTableConverter.fromRequest(client, request);
        Function<Response, DeleteRouteTableResponse> transformer =
                DeleteRouteTableConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteSecurityListResponse> deleteSecurityList(
            DeleteSecurityListRequest request,
            AsyncHandler<DeleteSecurityListRequest, DeleteSecurityListResponse> handler) {
        LOG.trace("Called async deleteSecurityList");
        Invocation.Builder ib = DeleteSecurityListConverter.fromRequest(client, request);
        Function<Response, DeleteSecurityListResponse> transformer =
                DeleteSecurityListConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteSubnetResponse> deleteSubnet(
            DeleteSubnetRequest request,
            AsyncHandler<DeleteSubnetRequest, DeleteSubnetResponse> handler) {
        LOG.trace("Called async deleteSubnet");
        Invocation.Builder ib = DeleteSubnetConverter.fromRequest(client, request);
        Function<Response, DeleteSubnetResponse> transformer = DeleteSubnetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteVcnResponse> deleteVcn(
            DeleteVcnRequest request, AsyncHandler<DeleteVcnRequest, DeleteVcnResponse> handler) {
        LOG.trace("Called async deleteVcn");
        Invocation.Builder ib = DeleteVcnConverter.fromRequest(client, request);
        Function<Response, DeleteVcnResponse> transformer = DeleteVcnConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetCpeResponse> getCpe(
            GetCpeRequest request, AsyncHandler<GetCpeRequest, GetCpeResponse> handler) {
        LOG.trace("Called async getCpe");
        Invocation.Builder ib = GetCpeConverter.fromRequest(client, request);
        Function<Response, GetCpeResponse> transformer = GetCpeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetDhcpOptionsResponse> getDhcpOptions(
            GetDhcpOptionsRequest request,
            AsyncHandler<GetDhcpOptionsRequest, GetDhcpOptionsResponse> handler) {
        LOG.trace("Called async getDhcpOptions");
        Invocation.Builder ib = GetDhcpOptionsConverter.fromRequest(client, request);
        Function<Response, GetDhcpOptionsResponse> transformer =
                GetDhcpOptionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetDrgResponse> getDrg(
            GetDrgRequest request, AsyncHandler<GetDrgRequest, GetDrgResponse> handler) {
        LOG.trace("Called async getDrg");
        Invocation.Builder ib = GetDrgConverter.fromRequest(client, request);
        Function<Response, GetDrgResponse> transformer = GetDrgConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetDrgAttachmentResponse> getDrgAttachment(
            GetDrgAttachmentRequest request,
            AsyncHandler<GetDrgAttachmentRequest, GetDrgAttachmentResponse> handler) {
        LOG.trace("Called async getDrgAttachment");
        Invocation.Builder ib = GetDrgAttachmentConverter.fromRequest(client, request);
        Function<Response, GetDrgAttachmentResponse> transformer =
                GetDrgAttachmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetIPSecConnectionResponse> getIPSecConnection(
            GetIPSecConnectionRequest request,
            AsyncHandler<GetIPSecConnectionRequest, GetIPSecConnectionResponse> handler) {
        LOG.trace("Called async getIPSecConnection");
        Invocation.Builder ib = GetIPSecConnectionConverter.fromRequest(client, request);
        Function<Response, GetIPSecConnectionResponse> transformer =
                GetIPSecConnectionConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetIPSecConnectionDeviceConfigResponse> getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request,
            AsyncHandler<
                            GetIPSecConnectionDeviceConfigRequest,
                            GetIPSecConnectionDeviceConfigResponse>
                    handler) {
        LOG.trace("Called async getIPSecConnectionDeviceConfig");
        Invocation.Builder ib =
                GetIPSecConnectionDeviceConfigConverter.fromRequest(client, request);
        Function<Response, GetIPSecConnectionDeviceConfigResponse> transformer =
                GetIPSecConnectionDeviceConfigConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetIPSecConnectionDeviceStatusResponse> getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request,
            AsyncHandler<
                            GetIPSecConnectionDeviceStatusRequest,
                            GetIPSecConnectionDeviceStatusResponse>
                    handler) {
        LOG.trace("Called async getIPSecConnectionDeviceStatus");
        Invocation.Builder ib =
                GetIPSecConnectionDeviceStatusConverter.fromRequest(client, request);
        Function<Response, GetIPSecConnectionDeviceStatusResponse> transformer =
                GetIPSecConnectionDeviceStatusConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetInternetGatewayResponse> getInternetGateway(
            GetInternetGatewayRequest request,
            AsyncHandler<GetInternetGatewayRequest, GetInternetGatewayResponse> handler) {
        LOG.trace("Called async getInternetGateway");
        Invocation.Builder ib = GetInternetGatewayConverter.fromRequest(client, request);
        Function<Response, GetInternetGatewayResponse> transformer =
                GetInternetGatewayConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetRouteTableResponse> getRouteTable(
            GetRouteTableRequest request,
            AsyncHandler<GetRouteTableRequest, GetRouteTableResponse> handler) {
        LOG.trace("Called async getRouteTable");
        Invocation.Builder ib = GetRouteTableConverter.fromRequest(client, request);
        Function<Response, GetRouteTableResponse> transformer =
                GetRouteTableConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetSecurityListResponse> getSecurityList(
            GetSecurityListRequest request,
            AsyncHandler<GetSecurityListRequest, GetSecurityListResponse> handler) {
        LOG.trace("Called async getSecurityList");
        Invocation.Builder ib = GetSecurityListConverter.fromRequest(client, request);
        Function<Response, GetSecurityListResponse> transformer =
                GetSecurityListConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetSubnetResponse> getSubnet(
            GetSubnetRequest request, AsyncHandler<GetSubnetRequest, GetSubnetResponse> handler) {
        LOG.trace("Called async getSubnet");
        Invocation.Builder ib = GetSubnetConverter.fromRequest(client, request);
        Function<Response, GetSubnetResponse> transformer = GetSubnetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetVcnResponse> getVcn(
            GetVcnRequest request, AsyncHandler<GetVcnRequest, GetVcnResponse> handler) {
        LOG.trace("Called async getVcn");
        Invocation.Builder ib = GetVcnConverter.fromRequest(client, request);
        Function<Response, GetVcnResponse> transformer = GetVcnConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetVnicResponse> getVnic(
            GetVnicRequest request, AsyncHandler<GetVnicRequest, GetVnicResponse> handler) {
        LOG.trace("Called async getVnic");
        Invocation.Builder ib = GetVnicConverter.fromRequest(client, request);
        Function<Response, GetVnicResponse> transformer = GetVnicConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListCpesResponse> listCpes(
            ListCpesRequest request, AsyncHandler<ListCpesRequest, ListCpesResponse> handler) {
        LOG.trace("Called async listCpes");
        Invocation.Builder ib = ListCpesConverter.fromRequest(client, request);
        Function<Response, ListCpesResponse> transformer = ListCpesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListDhcpOptionsResponse> listDhcpOptions(
            ListDhcpOptionsRequest request,
            AsyncHandler<ListDhcpOptionsRequest, ListDhcpOptionsResponse> handler) {
        LOG.trace("Called async listDhcpOptions");
        Invocation.Builder ib = ListDhcpOptionsConverter.fromRequest(client, request);
        Function<Response, ListDhcpOptionsResponse> transformer =
                ListDhcpOptionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListDrgAttachmentsResponse> listDrgAttachments(
            ListDrgAttachmentsRequest request,
            AsyncHandler<ListDrgAttachmentsRequest, ListDrgAttachmentsResponse> handler) {
        LOG.trace("Called async listDrgAttachments");
        Invocation.Builder ib = ListDrgAttachmentsConverter.fromRequest(client, request);
        Function<Response, ListDrgAttachmentsResponse> transformer =
                ListDrgAttachmentsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListDrgsResponse> listDrgs(
            ListDrgsRequest request, AsyncHandler<ListDrgsRequest, ListDrgsResponse> handler) {
        LOG.trace("Called async listDrgs");
        Invocation.Builder ib = ListDrgsConverter.fromRequest(client, request);
        Function<Response, ListDrgsResponse> transformer = ListDrgsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListIPSecConnectionsResponse> listIPSecConnections(
            ListIPSecConnectionsRequest request,
            AsyncHandler<ListIPSecConnectionsRequest, ListIPSecConnectionsResponse> handler) {
        LOG.trace("Called async listIPSecConnections");
        Invocation.Builder ib = ListIPSecConnectionsConverter.fromRequest(client, request);
        Function<Response, ListIPSecConnectionsResponse> transformer =
                ListIPSecConnectionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListInternetGatewaysResponse> listInternetGateways(
            ListInternetGatewaysRequest request,
            AsyncHandler<ListInternetGatewaysRequest, ListInternetGatewaysResponse> handler) {
        LOG.trace("Called async listInternetGateways");
        Invocation.Builder ib = ListInternetGatewaysConverter.fromRequest(client, request);
        Function<Response, ListInternetGatewaysResponse> transformer =
                ListInternetGatewaysConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListRouteTablesResponse> listRouteTables(
            ListRouteTablesRequest request,
            AsyncHandler<ListRouteTablesRequest, ListRouteTablesResponse> handler) {
        LOG.trace("Called async listRouteTables");
        Invocation.Builder ib = ListRouteTablesConverter.fromRequest(client, request);
        Function<Response, ListRouteTablesResponse> transformer =
                ListRouteTablesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListSecurityListsResponse> listSecurityLists(
            ListSecurityListsRequest request,
            AsyncHandler<ListSecurityListsRequest, ListSecurityListsResponse> handler) {
        LOG.trace("Called async listSecurityLists");
        Invocation.Builder ib = ListSecurityListsConverter.fromRequest(client, request);
        Function<Response, ListSecurityListsResponse> transformer =
                ListSecurityListsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListSubnetsResponse> listSubnets(
            ListSubnetsRequest request,
            AsyncHandler<ListSubnetsRequest, ListSubnetsResponse> handler) {
        LOG.trace("Called async listSubnets");
        Invocation.Builder ib = ListSubnetsConverter.fromRequest(client, request);
        Function<Response, ListSubnetsResponse> transformer = ListSubnetsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListVcnsResponse> listVcns(
            ListVcnsRequest request, AsyncHandler<ListVcnsRequest, ListVcnsResponse> handler) {
        LOG.trace("Called async listVcns");
        Invocation.Builder ib = ListVcnsConverter.fromRequest(client, request);
        Function<Response, ListVcnsResponse> transformer = ListVcnsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateCpeResponse> updateCpe(
            UpdateCpeRequest request, AsyncHandler<UpdateCpeRequest, UpdateCpeResponse> handler) {
        LOG.trace("Called async updateCpe");
        Invocation.Builder ib = UpdateCpeConverter.fromRequest(client, request);
        Function<Response, UpdateCpeResponse> transformer = UpdateCpeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateCpeDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateDhcpOptionsResponse> updateDhcpOptions(
            UpdateDhcpOptionsRequest request,
            AsyncHandler<UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse> handler) {
        LOG.trace("Called async updateDhcpOptions");
        Invocation.Builder ib = UpdateDhcpOptionsConverter.fromRequest(client, request);
        Function<Response, UpdateDhcpOptionsResponse> transformer =
                UpdateDhcpOptionsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateDhcpDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateDrgResponse> updateDrg(
            UpdateDrgRequest request, AsyncHandler<UpdateDrgRequest, UpdateDrgResponse> handler) {
        LOG.trace("Called async updateDrg");
        Invocation.Builder ib = UpdateDrgConverter.fromRequest(client, request);
        Function<Response, UpdateDrgResponse> transformer = UpdateDrgConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateDrgDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateDrgAttachmentResponse> updateDrgAttachment(
            UpdateDrgAttachmentRequest request,
            AsyncHandler<UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse> handler) {
        LOG.trace("Called async updateDrgAttachment");
        Invocation.Builder ib = UpdateDrgAttachmentConverter.fromRequest(client, request);
        Function<Response, UpdateDrgAttachmentResponse> transformer =
                UpdateDrgAttachmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(
                        ib, request.getUpdateDrgAttachmentDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateIPSecConnectionResponse> updateIPSecConnection(
            UpdateIPSecConnectionRequest request,
            AsyncHandler<UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse> handler) {
        LOG.trace("Called async updateIPSecConnection");
        Invocation.Builder ib = UpdateIPSecConnectionConverter.fromRequest(client, request);
        Function<Response, UpdateIPSecConnectionResponse> transformer =
                UpdateIPSecConnectionConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(
                        ib, request.getUpdateIPSecConnectionDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateInternetGatewayResponse> updateInternetGateway(
            UpdateInternetGatewayRequest request,
            AsyncHandler<UpdateInternetGatewayRequest, UpdateInternetGatewayResponse> handler) {
        LOG.trace("Called async updateInternetGateway");
        Invocation.Builder ib = UpdateInternetGatewayConverter.fromRequest(client, request);
        Function<Response, UpdateInternetGatewayResponse> transformer =
                UpdateInternetGatewayConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(
                        ib, request.getUpdateInternetGatewayDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateRouteTableResponse> updateRouteTable(
            UpdateRouteTableRequest request,
            AsyncHandler<UpdateRouteTableRequest, UpdateRouteTableResponse> handler) {
        LOG.trace("Called async updateRouteTable");
        Invocation.Builder ib = UpdateRouteTableConverter.fromRequest(client, request);
        Function<Response, UpdateRouteTableResponse> transformer =
                UpdateRouteTableConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateRouteTableDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateSecurityListResponse> updateSecurityList(
            UpdateSecurityListRequest request,
            AsyncHandler<UpdateSecurityListRequest, UpdateSecurityListResponse> handler) {
        LOG.trace("Called async updateSecurityList");
        Invocation.Builder ib = UpdateSecurityListConverter.fromRequest(client, request);
        Function<Response, UpdateSecurityListResponse> transformer =
                UpdateSecurityListConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateSecurityListDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateSubnetResponse> updateSubnet(
            UpdateSubnetRequest request,
            AsyncHandler<UpdateSubnetRequest, UpdateSubnetResponse> handler) {
        LOG.trace("Called async updateSubnet");
        Invocation.Builder ib = UpdateSubnetConverter.fromRequest(client, request);
        Function<Response, UpdateSubnetResponse> transformer = UpdateSubnetConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateSubnetDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateVcnResponse> updateVcn(
            UpdateVcnRequest request, AsyncHandler<UpdateVcnRequest, UpdateVcnResponse> handler) {
        LOG.trace("Called async updateVcn");
        Invocation.Builder ib = UpdateVcnConverter.fromRequest(client, request);
        Function<Response, UpdateVcnResponse> transformer = UpdateVcnConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateVcnDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }
}
