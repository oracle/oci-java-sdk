/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.internal.http.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class IdentityClient implements Identity {
    /**
     * Service instance for Identity.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("IDENTITY", "identity");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final IdentityWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityClient(
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
    public IdentityClient(
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
    public IdentityClient(
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
                                .setNameFormat("Identity-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new IdentityWaiters(executorService, this);
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
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) {
        LOG.trace("Called addUserToGroup");
        request = AddUserToGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddUserToGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AddUserToGroupResponse>
                transformer = AddUserToGroupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getAddUserToGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCompartmentResponse createCompartment(CreateCompartmentRequest request) {
        LOG.trace("Called createCompartment");
        request = CreateCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCompartmentResponse>
                transformer = CreateCompartmentConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateCompartmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateCustomerSecretKeyResponse createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request) {
        LOG.trace("Called createCustomerSecretKey");
        request = CreateCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomerSecretKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>
                transformer = CreateCustomerSecretKeyConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateCustomerSecretKeyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        LOG.trace("Called createGroup");
        request = CreateGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer = CreateGroupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateIdentityProviderResponse createIdentityProvider(
            CreateIdentityProviderRequest request) {
        LOG.trace("Called createIdentityProvider");
        request = CreateIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer = CreateIdentityProviderConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateIdentityProviderDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateIdpGroupMappingResponse createIdpGroupMapping(
            CreateIdpGroupMappingRequest request) {
        LOG.trace("Called createIdpGroupMapping");
        request = CreateIdpGroupMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateIdpGroupMappingResponse>
                transformer = CreateIdpGroupMappingConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateIdpGroupMappingDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateOrResetUIPasswordResponse createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request) {
        LOG.trace("Called createOrResetUIPassword");
        request = CreateOrResetUIPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOrResetUIPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateOrResetUIPasswordResponse>
                transformer = CreateOrResetUIPasswordConverter.fromResponse();

        javax.ws.rs.core.Response response = client.post(ib, request);
        return transformer.apply(response);
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        LOG.trace("Called createPolicy");
        request = CreatePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer = CreatePolicyConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreatePolicyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateRegionSubscriptionResponse createRegionSubscription(
            CreateRegionSubscriptionRequest request) {
        LOG.trace("Called createRegionSubscription");
        request = CreateRegionSubscriptionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRegionSubscriptionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateRegionSubscriptionResponse>
                transformer = CreateRegionSubscriptionConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateRegionSubscriptionDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateSwiftPasswordResponse createSwiftPassword(CreateSwiftPasswordRequest request) {
        LOG.trace("Called createSwiftPassword");
        request = CreateSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer = CreateSwiftPasswordConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateSwiftPasswordDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        LOG.trace("Called createUser");
        request = CreateUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserResponse> transformer =
                CreateUserConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateUserDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {
        LOG.trace("Called deleteApiKey");
        request = DeleteApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer = DeleteApiKeyConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request) {
        LOG.trace("Called deleteCustomerSecretKey");
        request = DeleteCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomerSecretKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>
                transformer = DeleteCustomerSecretKeyConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        LOG.trace("Called deleteGroup");
        request = DeleteGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer = DeleteGroupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteIdentityProviderResponse deleteIdentityProvider(
            DeleteIdentityProviderRequest request) {
        LOG.trace("Called deleteIdentityProvider");
        request = DeleteIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer = DeleteIdentityProviderConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteIdpGroupMappingResponse deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request) {
        LOG.trace("Called deleteIdpGroupMapping");
        request = DeleteIdpGroupMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteIdpGroupMappingResponse>
                transformer = DeleteIdpGroupMappingConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        LOG.trace("Called deletePolicy");
        request = DeletePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer = DeletePolicyConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteSwiftPasswordResponse deleteSwiftPassword(DeleteSwiftPasswordRequest request) {
        LOG.trace("Called deleteSwiftPassword");
        request = DeleteSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>
                transformer = DeleteSwiftPasswordConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        LOG.trace("Called deleteUser");
        request = DeleteUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserResponse> transformer =
                DeleteUserConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetCompartmentResponse getCompartment(GetCompartmentRequest request) {
        LOG.trace("Called getCompartment");
        request = GetCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCompartmentResponse>
                transformer = GetCompartmentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetGroupResponse getGroup(GetGroupRequest request) {
        LOG.trace("Called getGroup");
        request = GetGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetGroupResponse> transformer =
                GetGroupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) {
        LOG.trace("Called getIdentityProvider");
        request = GetIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer = GetIdentityProviderConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetIdpGroupMappingResponse getIdpGroupMapping(GetIdpGroupMappingRequest request) {
        LOG.trace("Called getIdpGroupMapping");
        request = GetIdpGroupMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer = GetIdpGroupMappingConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetPolicyResponse getPolicy(GetPolicyRequest request) {
        LOG.trace("Called getPolicy");
        request = GetPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyResponse> transformer =
                GetPolicyConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetTenancyResponse getTenancy(GetTenancyRequest request) {
        LOG.trace("Called getTenancy");
        request = GetTenancyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTenancyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTenancyResponse> transformer =
                GetTenancyConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {
        LOG.trace("Called getUser");
        request = GetUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetUserGroupMembershipResponse getUserGroupMembership(
            GetUserGroupMembershipRequest request) {
        LOG.trace("Called getUserGroupMembership");
        request = GetUserGroupMembershipConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserGroupMembershipConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserGroupMembershipResponse>
                transformer = GetUserGroupMembershipConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {
        LOG.trace("Called listApiKeys");
        request = ListApiKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer = ListApiKeysConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListAvailabilityDomainsResponse listAvailabilityDomains(
            ListAvailabilityDomainsRequest request) {
        LOG.trace("Called listAvailabilityDomains");
        request = ListAvailabilityDomainsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailabilityDomainsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAvailabilityDomainsResponse>
                transformer = ListAvailabilityDomainsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCompartmentsResponse listCompartments(ListCompartmentsRequest request) {
        LOG.trace("Called listCompartments");
        request = ListCompartmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompartmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCompartmentsResponse>
                transformer = ListCompartmentsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListCustomerSecretKeysResponse listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request) {
        LOG.trace("Called listCustomerSecretKeys");
        request = ListCustomerSecretKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomerSecretKeysConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>
                transformer = ListCustomerSecretKeysConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        LOG.trace("Called listGroups");
        request = ListGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGroupsResponse> transformer =
                ListGroupsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListIdentityProvidersResponse listIdentityProviders(
            ListIdentityProvidersRequest request) {
        LOG.trace("Called listIdentityProviders");
        request = ListIdentityProvidersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProvidersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer = ListIdentityProvidersConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListIdpGroupMappingsResponse listIdpGroupMappings(ListIdpGroupMappingsRequest request) {
        LOG.trace("Called listIdpGroupMappings");
        request = ListIdpGroupMappingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdpGroupMappingsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>
                transformer = ListIdpGroupMappingsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        LOG.trace("Called listPolicies");
        request = ListPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer = ListPoliciesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListRegionSubscriptionsResponse listRegionSubscriptions(
            ListRegionSubscriptionsRequest request) {
        LOG.trace("Called listRegionSubscriptions");
        request = ListRegionSubscriptionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionSubscriptionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionSubscriptionsResponse>
                transformer = ListRegionSubscriptionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        LOG.trace("Called listRegions");
        request = ListRegionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer = ListRegionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request) {
        LOG.trace("Called listSwiftPasswords");
        request = ListSwiftPasswordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSwiftPasswordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSwiftPasswordsResponse>
                transformer = ListSwiftPasswordsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListUserGroupMembershipsResponse listUserGroupMemberships(
            ListUserGroupMembershipsRequest request) {
        LOG.trace("Called listUserGroupMemberships");
        request = ListUserGroupMembershipsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserGroupMembershipsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
                transformer = ListUserGroupMembershipsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {
        LOG.trace("Called listUsers");
        request = ListUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
                ListUsersConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) {
        LOG.trace("Called removeUserFromGroup");
        request = RemoveUserFromGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveUserFromGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RemoveUserFromGroupResponse>
                transformer = RemoveUserFromGroupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request) {
        LOG.trace("Called updateCompartment");
        request = UpdateCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCompartmentResponse>
                transformer = UpdateCompartmentConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateCompartmentDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateCustomerSecretKeyResponse updateCustomerSecretKey(
            UpdateCustomerSecretKeyRequest request) {
        LOG.trace("Called updateCustomerSecretKey");
        request = UpdateCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomerSecretKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCustomerSecretKeyResponse>
                transformer = UpdateCustomerSecretKeyConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateCustomerSecretKeyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {
        LOG.trace("Called updateGroup");
        request = UpdateGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer = UpdateGroupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateGroupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateIdentityProviderResponse updateIdentityProvider(
            UpdateIdentityProviderRequest request) {
        LOG.trace("Called updateIdentityProvider");
        request = UpdateIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateIdentityProviderResponse>
                transformer = UpdateIdentityProviderConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateIdentityProviderDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateIdpGroupMappingResponse updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request) {
        LOG.trace("Called updateIdpGroupMapping");
        request = UpdateIdpGroupMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateIdpGroupMappingResponse>
                transformer = UpdateIdpGroupMappingConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateIdpGroupMappingDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        LOG.trace("Called updatePolicy");
        request = UpdatePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyResponse>
                transformer = UpdatePolicyConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdatePolicyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateSwiftPasswordResponse updateSwiftPassword(UpdateSwiftPasswordRequest request) {
        LOG.trace("Called updateSwiftPassword");
        request = UpdateSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>
                transformer = UpdateSwiftPasswordConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        LOG.trace("Called updateUser");
        request = UpdateUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserResponse> transformer =
                UpdateUserConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateUserDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateUserStateResponse updateUserState(UpdateUserStateRequest request) {
        LOG.trace("Called updateUserState");
        request = UpdateUserStateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserStateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserStateResponse>
                transformer = UpdateUserStateConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateStateDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UploadApiKeyResponse uploadApiKey(UploadApiKeyRequest request) {
        LOG.trace("Called uploadApiKey");
        request = UploadApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UploadApiKeyResponse>
                transformer = UploadApiKeyConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateApiKeyDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public IdentityWaiters getWaiters() {
        return waiters;
    }
}
