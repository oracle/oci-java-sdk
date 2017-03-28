/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

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

import com.oracle.bmc.identity.internal.http.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class IdentityAsyncClient implements IdentityAsync {
    /**
     * Service instance for Identity.
     */
    public static final Service SERVICE = Services.create("IDENTITY", "identity");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityAsyncClient(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse> handler) {
        LOG.trace("Called async addUserToGroup");
        request = AddUserToGroupConverter.interceptRequest(request);
        Invocation.Builder ib = AddUserToGroupConverter.fromRequest(client, request);
        Function<Response, AddUserToGroupResponse> transformer =
                AddUserToGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getAddUserToGroupDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            AsyncHandler<CreateCompartmentRequest, CreateCompartmentResponse> handler) {
        LOG.trace("Called async createCompartment");
        request = CreateCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = CreateCompartmentConverter.fromRequest(client, request);
        Function<Response, CreateCompartmentResponse> transformer =
                CreateCompartmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateCompartmentDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            AsyncHandler<CreateGroupRequest, CreateGroupResponse> handler) {
        LOG.trace("Called async createGroup");
        request = CreateGroupConverter.interceptRequest(request);
        Invocation.Builder ib = CreateGroupConverter.fromRequest(client, request);
        Function<Response, CreateGroupResponse> transformer = CreateGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateGroupDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            AsyncHandler<CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse> handler) {
        LOG.trace("Called async createOrResetUIPassword");
        request = CreateOrResetUIPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = CreateOrResetUIPasswordConverter.fromRequest(client, request);
        Function<Response, CreateOrResetUIPasswordResponse> transformer =
                CreateOrResetUIPasswordConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.post(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            AsyncHandler<CreatePolicyRequest, CreatePolicyResponse> handler) {
        LOG.trace("Called async createPolicy");
        request = CreatePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = CreatePolicyConverter.fromRequest(client, request);
        Function<Response, CreatePolicyResponse> transformer = CreatePolicyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreatePolicyDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            AsyncHandler<CreateSwiftPasswordRequest, CreateSwiftPasswordResponse> handler) {
        LOG.trace("Called async createSwiftPassword");
        request = CreateSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = CreateSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, CreateSwiftPasswordResponse> transformer =
                CreateSwiftPasswordConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateSwiftPasswordDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            AsyncHandler<CreateUserRequest, CreateUserResponse> handler) {
        LOG.trace("Called async createUser");
        request = CreateUserConverter.interceptRequest(request);
        Invocation.Builder ib = CreateUserConverter.fromRequest(client, request);
        Function<Response, CreateUserResponse> transformer = CreateUserConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateUserDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse> handler) {
        LOG.trace("Called async deleteApiKey");
        request = DeleteApiKeyConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteApiKeyConverter.fromRequest(client, request);
        Function<Response, DeleteApiKeyResponse> transformer = DeleteApiKeyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            AsyncHandler<DeleteGroupRequest, DeleteGroupResponse> handler) {
        LOG.trace("Called async deleteGroup");
        request = DeleteGroupConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteGroupConverter.fromRequest(client, request);
        Function<Response, DeleteGroupResponse> transformer = DeleteGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            AsyncHandler<DeletePolicyRequest, DeletePolicyResponse> handler) {
        LOG.trace("Called async deletePolicy");
        request = DeletePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = DeletePolicyConverter.fromRequest(client, request);
        Function<Response, DeletePolicyResponse> transformer = DeletePolicyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            AsyncHandler<DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse> handler) {
        LOG.trace("Called async deleteSwiftPassword");
        request = DeleteSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, DeleteSwiftPasswordResponse> transformer =
                DeleteSwiftPasswordConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            AsyncHandler<DeleteUserRequest, DeleteUserResponse> handler) {
        LOG.trace("Called async deleteUser");
        request = DeleteUserConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteUserConverter.fromRequest(client, request);
        Function<Response, DeleteUserResponse> transformer = DeleteUserConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            AsyncHandler<GetCompartmentRequest, GetCompartmentResponse> handler) {
        LOG.trace("Called async getCompartment");
        request = GetCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = GetCompartmentConverter.fromRequest(client, request);
        Function<Response, GetCompartmentResponse> transformer =
                GetCompartmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetGroupResponse> getGroup(
            GetGroupRequest request, AsyncHandler<GetGroupRequest, GetGroupResponse> handler) {
        LOG.trace("Called async getGroup");
        request = GetGroupConverter.interceptRequest(request);
        Invocation.Builder ib = GetGroupConverter.fromRequest(client, request);
        Function<Response, GetGroupResponse> transformer = GetGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request, AsyncHandler<GetPolicyRequest, GetPolicyResponse> handler) {
        LOG.trace("Called async getPolicy");
        request = GetPolicyConverter.interceptRequest(request);
        Invocation.Builder ib = GetPolicyConverter.fromRequest(client, request);
        Function<Response, GetPolicyResponse> transformer = GetPolicyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetUserResponse> getUser(
            GetUserRequest request, AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        request = GetUserConverter.interceptRequest(request);
        Invocation.Builder ib = GetUserConverter.fromRequest(client, request);
        Function<Response, GetUserResponse> transformer = GetUserConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            AsyncHandler<GetUserGroupMembershipRequest, GetUserGroupMembershipResponse> handler) {
        LOG.trace("Called async getUserGroupMembership");
        request = GetUserGroupMembershipConverter.interceptRequest(request);
        Invocation.Builder ib = GetUserGroupMembershipConverter.fromRequest(client, request);
        Function<Response, GetUserGroupMembershipResponse> transformer =
                GetUserGroupMembershipConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            AsyncHandler<ListApiKeysRequest, ListApiKeysResponse> handler) {
        LOG.trace("Called async listApiKeys");
        request = ListApiKeysConverter.interceptRequest(request);
        Invocation.Builder ib = ListApiKeysConverter.fromRequest(client, request);
        Function<Response, ListApiKeysResponse> transformer = ListApiKeysConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            AsyncHandler<ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse> handler) {
        LOG.trace("Called async listAvailabilityDomains");
        request = ListAvailabilityDomainsConverter.interceptRequest(request);
        Invocation.Builder ib = ListAvailabilityDomainsConverter.fromRequest(client, request);
        Function<Response, ListAvailabilityDomainsResponse> transformer =
                ListAvailabilityDomainsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse> handler) {
        LOG.trace("Called async listCompartments");
        request = ListCompartmentsConverter.interceptRequest(request);
        Invocation.Builder ib = ListCompartmentsConverter.fromRequest(client, request);
        Function<Response, ListCompartmentsResponse> transformer =
                ListCompartmentsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            AsyncHandler<ListGroupsRequest, ListGroupsResponse> handler) {
        LOG.trace("Called async listGroups");
        request = ListGroupsConverter.interceptRequest(request);
        Invocation.Builder ib = ListGroupsConverter.fromRequest(client, request);
        Function<Response, ListGroupsResponse> transformer = ListGroupsConverter.fromResponse();

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
    public Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            AsyncHandler<ListSwiftPasswordsRequest, ListSwiftPasswordsResponse> handler) {
        LOG.trace("Called async listSwiftPasswords");
        request = ListSwiftPasswordsConverter.interceptRequest(request);
        Invocation.Builder ib = ListSwiftPasswordsConverter.fromRequest(client, request);
        Function<Response, ListSwiftPasswordsResponse> transformer =
                ListSwiftPasswordsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            AsyncHandler<ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler) {
        LOG.trace("Called async listUserGroupMemberships");
        request = ListUserGroupMembershipsConverter.interceptRequest(request);
        Invocation.Builder ib = ListUserGroupMembershipsConverter.fromRequest(client, request);
        Function<Response, ListUserGroupMembershipsResponse> transformer =
                ListUserGroupMembershipsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListUsersResponse> listUsers(
            ListUsersRequest request, AsyncHandler<ListUsersRequest, ListUsersResponse> handler) {
        LOG.trace("Called async listUsers");
        request = ListUsersConverter.interceptRequest(request);
        Invocation.Builder ib = ListUsersConverter.fromRequest(client, request);
        Function<Response, ListUsersResponse> transformer = ListUsersConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            AsyncHandler<RemoveUserFromGroupRequest, RemoveUserFromGroupResponse> handler) {
        LOG.trace("Called async removeUserFromGroup");
        request = RemoveUserFromGroupConverter.interceptRequest(request);
        Invocation.Builder ib = RemoveUserFromGroupConverter.fromRequest(client, request);
        Function<Response, RemoveUserFromGroupResponse> transformer =
                RemoveUserFromGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            AsyncHandler<UpdateCompartmentRequest, UpdateCompartmentResponse> handler) {
        LOG.trace("Called async updateCompartment");
        request = UpdateCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateCompartmentConverter.fromRequest(client, request);
        Function<Response, UpdateCompartmentResponse> transformer =
                UpdateCompartmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateCompartmentDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            AsyncHandler<UpdateGroupRequest, UpdateGroupResponse> handler) {
        LOG.trace("Called async updateGroup");
        request = UpdateGroupConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateGroupConverter.fromRequest(client, request);
        Function<Response, UpdateGroupResponse> transformer = UpdateGroupConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateGroupDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse> handler) {
        LOG.trace("Called async updatePolicy");
        request = UpdatePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = UpdatePolicyConverter.fromRequest(client, request);
        Function<Response, UpdatePolicyResponse> transformer = UpdatePolicyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdatePolicyDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            AsyncHandler<UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse> handler) {
        LOG.trace("Called async updateSwiftPassword");
        request = UpdateSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, UpdateSwiftPasswordResponse> transformer =
                UpdateSwiftPasswordConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(
                        ib, request.getUpdateSwiftPasswordDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            AsyncHandler<UpdateUserRequest, UpdateUserResponse> handler) {
        LOG.trace("Called async updateUser");
        request = UpdateUserConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateUserConverter.fromRequest(client, request);
        Function<Response, UpdateUserResponse> transformer = UpdateUserConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateUserDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse> handler) {
        LOG.trace("Called async updateUserState");
        request = UpdateUserStateConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateUserStateConverter.fromRequest(client, request);
        Function<Response, UpdateUserStateResponse> transformer =
                UpdateUserStateConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateStateDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse> handler) {
        LOG.trace("Called async uploadApiKey");
        request = UploadApiKeyConverter.interceptRequest(request);
        Invocation.Builder ib = UploadApiKeyConverter.fromRequest(client, request);
        Function<Response, UploadApiKeyResponse> transformer = UploadApiKeyConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateApiKeyDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }
}
