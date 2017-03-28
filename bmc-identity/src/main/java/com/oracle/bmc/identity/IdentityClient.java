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

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class IdentityClient implements Identity {
    /**
     * Service instance for Identity.
     */
    public static final Service SERVICE = Services.create("IDENTITY", "identity");

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);
    private final IdentityWaiters waiters;

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityClient(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityClient(
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
    public IdentityClient(
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
    public IdentityClient(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator,
            RequestSignerFactory requestSignerFactory) {
        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);

        this.waiters = new IdentityWaiters(executorService, this);
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
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) {
        LOG.trace("Called addUserToGroup");
        request = AddUserToGroupConverter.interceptRequest(request);
        Invocation.Builder ib = AddUserToGroupConverter.fromRequest(client, request);
        Function<Response, AddUserToGroupResponse> transformer =
                AddUserToGroupConverter.fromResponse();

        Response response = client.post(ib, request.getAddUserToGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCompartmentResponse createCompartment(CreateCompartmentRequest request) {
        LOG.trace("Called createCompartment");
        request = CreateCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = CreateCompartmentConverter.fromRequest(client, request);
        Function<Response, CreateCompartmentResponse> transformer =
                CreateCompartmentConverter.fromResponse();

        Response response = client.post(ib, request.getCreateCompartmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        LOG.trace("Called createGroup");
        request = CreateGroupConverter.interceptRequest(request);
        Invocation.Builder ib = CreateGroupConverter.fromRequest(client, request);
        Function<Response, CreateGroupResponse> transformer = CreateGroupConverter.fromResponse();

        Response response = client.post(ib, request.getCreateGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateOrResetUIPasswordResponse createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request) {
        LOG.trace("Called createOrResetUIPassword");
        request = CreateOrResetUIPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = CreateOrResetUIPasswordConverter.fromRequest(client, request);
        Function<Response, CreateOrResetUIPasswordResponse> transformer =
                CreateOrResetUIPasswordConverter.fromResponse();

        Response response = client.post(ib, request);
        return transformer.apply(response);
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        LOG.trace("Called createPolicy");
        request = CreatePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = CreatePolicyConverter.fromRequest(client, request);
        Function<Response, CreatePolicyResponse> transformer = CreatePolicyConverter.fromResponse();

        Response response = client.post(ib, request.getCreatePolicyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateSwiftPasswordResponse createSwiftPassword(CreateSwiftPasswordRequest request) {
        LOG.trace("Called createSwiftPassword");
        request = CreateSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = CreateSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, CreateSwiftPasswordResponse> transformer =
                CreateSwiftPasswordConverter.fromResponse();

        Response response = client.post(ib, request.getCreateSwiftPasswordDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        LOG.trace("Called createUser");
        request = CreateUserConverter.interceptRequest(request);
        Invocation.Builder ib = CreateUserConverter.fromRequest(client, request);
        Function<Response, CreateUserResponse> transformer = CreateUserConverter.fromResponse();

        Response response = client.post(ib, request.getCreateUserDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {
        LOG.trace("Called deleteApiKey");
        request = DeleteApiKeyConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteApiKeyConverter.fromRequest(client, request);
        Function<Response, DeleteApiKeyResponse> transformer = DeleteApiKeyConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        LOG.trace("Called deleteGroup");
        request = DeleteGroupConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteGroupConverter.fromRequest(client, request);
        Function<Response, DeleteGroupResponse> transformer = DeleteGroupConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        LOG.trace("Called deletePolicy");
        request = DeletePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = DeletePolicyConverter.fromRequest(client, request);
        Function<Response, DeletePolicyResponse> transformer = DeletePolicyConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteSwiftPasswordResponse deleteSwiftPassword(DeleteSwiftPasswordRequest request) {
        LOG.trace("Called deleteSwiftPassword");
        request = DeleteSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, DeleteSwiftPasswordResponse> transformer =
                DeleteSwiftPasswordConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        LOG.trace("Called deleteUser");
        request = DeleteUserConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteUserConverter.fromRequest(client, request);
        Function<Response, DeleteUserResponse> transformer = DeleteUserConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCompartmentResponse getCompartment(GetCompartmentRequest request) {
        LOG.trace("Called getCompartment");
        request = GetCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = GetCompartmentConverter.fromRequest(client, request);
        Function<Response, GetCompartmentResponse> transformer =
                GetCompartmentConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetGroupResponse getGroup(GetGroupRequest request) {
        LOG.trace("Called getGroup");
        request = GetGroupConverter.interceptRequest(request);
        Invocation.Builder ib = GetGroupConverter.fromRequest(client, request);
        Function<Response, GetGroupResponse> transformer = GetGroupConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetPolicyResponse getPolicy(GetPolicyRequest request) {
        LOG.trace("Called getPolicy");
        request = GetPolicyConverter.interceptRequest(request);
        Invocation.Builder ib = GetPolicyConverter.fromRequest(client, request);
        Function<Response, GetPolicyResponse> transformer = GetPolicyConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {
        LOG.trace("Called getUser");
        request = GetUserConverter.interceptRequest(request);
        Invocation.Builder ib = GetUserConverter.fromRequest(client, request);
        Function<Response, GetUserResponse> transformer = GetUserConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetUserGroupMembershipResponse getUserGroupMembership(
            GetUserGroupMembershipRequest request) {
        LOG.trace("Called getUserGroupMembership");
        request = GetUserGroupMembershipConverter.interceptRequest(request);
        Invocation.Builder ib = GetUserGroupMembershipConverter.fromRequest(client, request);
        Function<Response, GetUserGroupMembershipResponse> transformer =
                GetUserGroupMembershipConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {
        LOG.trace("Called listApiKeys");
        request = ListApiKeysConverter.interceptRequest(request);
        Invocation.Builder ib = ListApiKeysConverter.fromRequest(client, request);
        Function<Response, ListApiKeysResponse> transformer = ListApiKeysConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListAvailabilityDomainsResponse listAvailabilityDomains(
            ListAvailabilityDomainsRequest request) {
        LOG.trace("Called listAvailabilityDomains");
        request = ListAvailabilityDomainsConverter.interceptRequest(request);
        Invocation.Builder ib = ListAvailabilityDomainsConverter.fromRequest(client, request);
        Function<Response, ListAvailabilityDomainsResponse> transformer =
                ListAvailabilityDomainsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCompartmentsResponse listCompartments(ListCompartmentsRequest request) {
        LOG.trace("Called listCompartments");
        request = ListCompartmentsConverter.interceptRequest(request);
        Invocation.Builder ib = ListCompartmentsConverter.fromRequest(client, request);
        Function<Response, ListCompartmentsResponse> transformer =
                ListCompartmentsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        LOG.trace("Called listGroups");
        request = ListGroupsConverter.interceptRequest(request);
        Invocation.Builder ib = ListGroupsConverter.fromRequest(client, request);
        Function<Response, ListGroupsResponse> transformer = ListGroupsConverter.fromResponse();

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
    public ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request) {
        LOG.trace("Called listSwiftPasswords");
        request = ListSwiftPasswordsConverter.interceptRequest(request);
        Invocation.Builder ib = ListSwiftPasswordsConverter.fromRequest(client, request);
        Function<Response, ListSwiftPasswordsResponse> transformer =
                ListSwiftPasswordsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListUserGroupMembershipsResponse listUserGroupMemberships(
            ListUserGroupMembershipsRequest request) {
        LOG.trace("Called listUserGroupMemberships");
        request = ListUserGroupMembershipsConverter.interceptRequest(request);
        Invocation.Builder ib = ListUserGroupMembershipsConverter.fromRequest(client, request);
        Function<Response, ListUserGroupMembershipsResponse> transformer =
                ListUserGroupMembershipsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {
        LOG.trace("Called listUsers");
        request = ListUsersConverter.interceptRequest(request);
        Invocation.Builder ib = ListUsersConverter.fromRequest(client, request);
        Function<Response, ListUsersResponse> transformer = ListUsersConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) {
        LOG.trace("Called removeUserFromGroup");
        request = RemoveUserFromGroupConverter.interceptRequest(request);
        Invocation.Builder ib = RemoveUserFromGroupConverter.fromRequest(client, request);
        Function<Response, RemoveUserFromGroupResponse> transformer =
                RemoveUserFromGroupConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request) {
        LOG.trace("Called updateCompartment");
        request = UpdateCompartmentConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateCompartmentConverter.fromRequest(client, request);
        Function<Response, UpdateCompartmentResponse> transformer =
                UpdateCompartmentConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateCompartmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {
        LOG.trace("Called updateGroup");
        request = UpdateGroupConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateGroupConverter.fromRequest(client, request);
        Function<Response, UpdateGroupResponse> transformer = UpdateGroupConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        LOG.trace("Called updatePolicy");
        request = UpdatePolicyConverter.interceptRequest(request);
        Invocation.Builder ib = UpdatePolicyConverter.fromRequest(client, request);
        Function<Response, UpdatePolicyResponse> transformer = UpdatePolicyConverter.fromResponse();

        Response response = client.put(ib, request.getUpdatePolicyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateSwiftPasswordResponse updateSwiftPassword(UpdateSwiftPasswordRequest request) {
        LOG.trace("Called updateSwiftPassword");
        request = UpdateSwiftPasswordConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateSwiftPasswordConverter.fromRequest(client, request);
        Function<Response, UpdateSwiftPasswordResponse> transformer =
                UpdateSwiftPasswordConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        LOG.trace("Called updateUser");
        request = UpdateUserConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateUserConverter.fromRequest(client, request);
        Function<Response, UpdateUserResponse> transformer = UpdateUserConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateUserDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateUserStateResponse updateUserState(UpdateUserStateRequest request) {
        LOG.trace("Called updateUserState");
        request = UpdateUserStateConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateUserStateConverter.fromRequest(client, request);
        Function<Response, UpdateUserStateResponse> transformer =
                UpdateUserStateConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateStateDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UploadApiKeyResponse uploadApiKey(UploadApiKeyRequest request) {
        LOG.trace("Called uploadApiKey");
        request = UploadApiKeyConverter.interceptRequest(request);
        Invocation.Builder ib = UploadApiKeyConverter.fromRequest(client, request);
        Function<Response, UploadApiKeyResponse> transformer = UploadApiKeyConverter.fromResponse();

        Response response = client.post(ib, request.getCreateApiKeyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public IdentityWaiters getWaiters() {
        return waiters;
    }
}
