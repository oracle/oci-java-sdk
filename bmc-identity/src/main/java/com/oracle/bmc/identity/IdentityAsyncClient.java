/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.internal.http.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class IdentityAsyncClient implements IdentityAsync {
    /**
     * Service instance for Identity.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("IDENTITY", "identity");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse>
                    handler) {
        LOG.trace("Called async addUserToGroup");
        request = AddUserToGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                AddUserToGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AddUserToGroupResponse>
                transformer = AddUserToGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getAddUserToGroupDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler) {
        LOG.trace("Called async createCompartment");
        request = CreateCompartmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCompartmentResponse>
                transformer = CreateCompartmentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateCompartmentDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {
        LOG.trace("Called async createGroup");
        request = CreateGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer = CreateGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateGroupDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async createIdentityProvider");
        request = CreateIdentityProviderConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer = CreateIdentityProviderConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getCreateIdentityProviderDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            CreateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async createIdpGroupMapping");
        request = CreateIdpGroupMappingConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateIdpGroupMappingResponse>
                transformer = CreateIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCreateIdpGroupMappingDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler) {
        LOG.trace("Called async createOrResetUIPassword");
        request = CreateOrResetUIPasswordConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateOrResetUIPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateOrResetUIPasswordResponse>
                transformer = CreateOrResetUIPasswordConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler) {
        LOG.trace("Called async createPolicy");
        request = CreatePolicyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer = CreatePolicyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreatePolicyDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            CreateRegionSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler) {
        LOG.trace("Called async createRegionSubscription");
        request = CreateRegionSubscriptionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateRegionSubscriptionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateRegionSubscriptionResponse>
                transformer = CreateRegionSubscriptionConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getCreateRegionSubscriptionDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async createSwiftPassword");
        request = CreateSwiftPasswordConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer = CreateSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCreateSwiftPasswordDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handler) {
        LOG.trace("Called async createUser");
        request = CreateUserConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = CreateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserResponse> transformer =
                CreateUserConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateUserDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteApiKey");
        request = DeleteApiKeyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer = DeleteApiKeyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {
        LOG.trace("Called async deleteGroup");
        request = DeleteGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer = DeleteGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async deleteIdentityProvider");
        request = DeleteIdentityProviderConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer = DeleteIdentityProviderConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async deleteIdpGroupMapping");
        request = DeleteIdpGroupMappingConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteIdpGroupMappingResponse>
                transformer = DeleteIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler) {
        LOG.trace("Called async deletePolicy");
        request = DeletePolicyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeletePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer = DeletePolicyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async deleteSwiftPassword");
        request = DeleteSwiftPasswordConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>
                transformer = DeleteSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handler) {
        LOG.trace("Called async deleteUser");
        request = DeleteUserConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = DeleteUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserResponse> transformer =
                DeleteUserConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCompartmentRequest, GetCompartmentResponse>
                    handler) {
        LOG.trace("Called async getCompartment");
        request = GetCompartmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCompartmentResponse>
                transformer = GetCompartmentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handler) {
        LOG.trace("Called async getGroup");
        request = GetGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetGroupResponse> transformer =
                GetGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async getIdentityProvider");
        request = GetIdentityProviderConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer = GetIdentityProviderConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            GetIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async getIdpGroupMapping");
        request = GetIdpGroupMappingConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer = GetIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handler) {
        LOG.trace("Called async getPolicy");
        request = GetPolicyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyResponse> transformer =
                GetPolicyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            GetTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse> handler) {
        LOG.trace("Called async getTenancy");
        request = GetTenancyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetTenancyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTenancyResponse> transformer =
                GetTenancyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        request = GetUserConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler) {
        LOG.trace("Called async getUserGroupMembership");
        request = GetUserGroupMembershipConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetUserGroupMembershipConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserGroupMembershipResponse>
                transformer = GetUserGroupMembershipConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {
        LOG.trace("Called async listApiKeys");
        request = ListApiKeysConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListApiKeysConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer = ListApiKeysConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler) {
        LOG.trace("Called async listAvailabilityDomains");
        request = ListAvailabilityDomainsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListAvailabilityDomainsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAvailabilityDomainsResponse>
                transformer = ListAvailabilityDomainsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse>
                    handler) {
        LOG.trace("Called async listCompartments");
        request = ListCompartmentsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListCompartmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCompartmentsResponse>
                transformer = ListCompartmentsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handler) {
        LOG.trace("Called async listGroups");
        request = ListGroupsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGroupsResponse> transformer =
                ListGroupsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {
        LOG.trace("Called async listIdentityProviders");
        request = ListIdentityProvidersConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListIdentityProvidersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer = ListIdentityProvidersConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            ListIdpGroupMappingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler) {
        LOG.trace("Called async listIdpGroupMappings");
        request = ListIdpGroupMappingsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListIdpGroupMappingsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>
                transformer = ListIdpGroupMappingsConverter.fromResponse();

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
    public java.util.concurrent.Future<ListRegionSubscriptionsResponse> listRegionSubscriptions(
            ListRegionSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                    handler) {
        LOG.trace("Called async listRegionSubscriptions");
        request = ListRegionSubscriptionsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListRegionSubscriptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionSubscriptionsResponse>
                transformer = ListRegionSubscriptionsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResponse> listRegions(
            ListRegionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                    handler) {
        LOG.trace("Called async listRegions");
        request = ListRegionsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListRegionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer = ListRegionsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler) {
        LOG.trace("Called async listSwiftPasswords");
        request = ListSwiftPasswordsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListSwiftPasswordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSwiftPasswordsResponse>
                transformer = ListSwiftPasswordsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler) {
        LOG.trace("Called async listUserGroupMemberships");
        request = ListUserGroupMembershipsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListUserGroupMembershipsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
                transformer = ListUserGroupMembershipsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handler) {
        LOG.trace("Called async listUsers");
        request = ListUsersConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListUsersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
                ListUsersConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler) {
        LOG.trace("Called async removeUserFromGroup");
        request = RemoveUserFromGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                RemoveUserFromGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RemoveUserFromGroupResponse>
                transformer = RemoveUserFromGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler) {
        LOG.trace("Called async updateCompartment");
        request = UpdateCompartmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCompartmentResponse>
                transformer = UpdateCompartmentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateCompartmentDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                    handler) {
        LOG.trace("Called async updateGroup");
        request = UpdateGroupConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer = UpdateGroupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateGroupDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            UpdateIdentityProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async updateIdentityProvider");
        request = UpdateIdentityProviderConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateIdentityProviderResponse>
                transformer = UpdateIdentityProviderConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        request.getUpdateIdentityProviderDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async updateIdpGroupMapping");
        request = UpdateIdpGroupMappingConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateIdpGroupMappingResponse>
                transformer = UpdateIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib, request.getUpdateIdpGroupMappingDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler) {
        LOG.trace("Called async updatePolicy");
        request = UpdatePolicyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyResponse>
                transformer = UpdatePolicyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdatePolicyDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async updateSwiftPassword");
        request = UpdateSwiftPasswordConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>
                transformer = UpdateSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib, request.getUpdateSwiftPasswordDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse> handler) {
        LOG.trace("Called async updateUser");
        request = UpdateUserConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = UpdateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserResponse> transformer =
                UpdateUserConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateUserDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse>
                    handler) {
        LOG.trace("Called async updateUserState");
        request = UpdateUserStateConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateUserStateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserStateResponse>
                transformer = UpdateUserStateConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateStateDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler) {
        LOG.trace("Called async uploadApiKey");
        request = UploadApiKeyConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UploadApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UploadApiKeyResponse>
                transformer = UploadApiKeyConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateApiKeyDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
