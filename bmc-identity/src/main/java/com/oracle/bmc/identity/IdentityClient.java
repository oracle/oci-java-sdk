/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import java.util.Locale;
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
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITY")
                    .serviceEndpointPrefix("identity")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final IdentityWaiters waiters;
    private final IdentityPaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

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
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public IdentityClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public IdentityClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public IdentityClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public IdentityClient(
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
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client = restClientFactory.create(defaultRequestSigner, requestSigners, configuration);
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

        this.paginators = new IdentityPaginators(this);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IdentityClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public IdentityClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new IdentityClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
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
        regionId = regionId.toLowerCase(Locale.ENGLISH);
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAddUserToGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request) {
        LOG.trace("Called createAuthToken");
        request = CreateAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthTokenConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateAuthTokenResponse>
                transformer = CreateAuthTokenConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateAuthTokenDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateCompartmentResponse createCompartment(CreateCompartmentRequest request) {
        LOG.trace("Called createCompartment");
        request = CreateCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCompartmentResponse>
                transformer = CreateCompartmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCompartmentDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCustomerSecretKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateDynamicGroupResponse createDynamicGroup(CreateDynamicGroupRequest request) {
        LOG.trace("Called createDynamicGroup");
        request = CreateDynamicGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDynamicGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDynamicGroupResponse>
                transformer = CreateDynamicGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateDynamicGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        LOG.trace("Called createGroup");
        request = CreateGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer = CreateGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateIdentityProviderDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateIdpGroupMappingDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        LOG.trace("Called createPolicy");
        request = CreatePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer = CreatePolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreatePolicyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateRegionSubscriptionDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request) {
        LOG.trace("Called createSmtpCredential");
        request = CreateSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSmtpCredentialConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSmtpCredentialResponse>
                transformer = CreateSmtpCredentialConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateSmtpCredentialDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateSwiftPasswordResponse createSwiftPassword(CreateSwiftPasswordRequest request) {
        LOG.trace("Called createSwiftPassword");
        request = CreateSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer = CreateSwiftPasswordConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateSwiftPasswordDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateTagResponse createTag(CreateTagRequest request) {
        LOG.trace("Called createTag");
        request = CreateTagConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagResponse> transformer =
                CreateTagConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateTagDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateTagNamespaceResponse createTagNamespace(CreateTagNamespaceRequest request) {
        LOG.trace("Called createTagNamespace");
        request = CreateTagNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagNamespaceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagNamespaceResponse>
                transformer = CreateTagNamespaceConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateTagNamespaceDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        LOG.trace("Called createUser");
        request = CreateUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserResponse> transformer =
                CreateUserConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateUserDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {
        LOG.trace("Called deleteApiKey");
        request = DeleteApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer = DeleteApiKeyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request) {
        LOG.trace("Called deleteAuthToken");
        request = DeleteAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthTokenConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAuthTokenResponse>
                transformer = DeleteAuthTokenConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteCompartmentResponse deleteCompartment(DeleteCompartmentRequest request) {
        LOG.trace("Called deleteCompartment");
        request = DeleteCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCompartmentResponse>
                transformer = DeleteCompartmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteDynamicGroupResponse deleteDynamicGroup(DeleteDynamicGroupRequest request) {
        LOG.trace("Called deleteDynamicGroup");
        request = DeleteDynamicGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDynamicGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDynamicGroupResponse>
                transformer = DeleteDynamicGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        LOG.trace("Called deleteGroup");
        request = DeleteGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer = DeleteGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        LOG.trace("Called deletePolicy");
        request = DeletePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer = DeletePolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request) {
        LOG.trace("Called deleteSmtpCredential");
        request = DeleteSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSmtpCredentialConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>
                transformer = DeleteSmtpCredentialConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteSwiftPasswordResponse deleteSwiftPassword(DeleteSwiftPasswordRequest request) {
        LOG.trace("Called deleteSwiftPassword");
        request = DeleteSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>
                transformer = DeleteSwiftPasswordConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        LOG.trace("Called deleteUser");
        request = DeleteUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserResponse> transformer =
                DeleteUserConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetCompartmentResponse getCompartment(GetCompartmentRequest request) {
        LOG.trace("Called getCompartment");
        request = GetCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCompartmentResponse>
                transformer = GetCompartmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetDynamicGroupResponse getDynamicGroup(GetDynamicGroupRequest request) {
        LOG.trace("Called getDynamicGroup");
        request = GetDynamicGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDynamicGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDynamicGroupResponse>
                transformer = GetDynamicGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetGroupResponse getGroup(GetGroupRequest request) {
        LOG.trace("Called getGroup");
        request = GetGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetGroupResponse> transformer =
                GetGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) {
        LOG.trace("Called getIdentityProvider");
        request = GetIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer = GetIdentityProviderConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetIdpGroupMappingResponse getIdpGroupMapping(GetIdpGroupMappingRequest request) {
        LOG.trace("Called getIdpGroupMapping");
        request = GetIdpGroupMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdpGroupMappingConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer = GetIdpGroupMappingConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetPolicyResponse getPolicy(GetPolicyRequest request) {
        LOG.trace("Called getPolicy");
        request = GetPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyResponse> transformer =
                GetPolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetTagResponse getTag(GetTagRequest request) {
        LOG.trace("Called getTag");
        request = GetTagConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTagResponse> transformer =
                GetTagConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetTagNamespaceResponse getTagNamespace(GetTagNamespaceRequest request) {
        LOG.trace("Called getTagNamespace");
        request = GetTagNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagNamespaceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTagNamespaceResponse>
                transformer = GetTagNamespaceConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetTenancyResponse getTenancy(GetTenancyRequest request) {
        LOG.trace("Called getTenancy");
        request = GetTenancyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTenancyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTenancyResponse> transformer =
                GetTenancyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {
        LOG.trace("Called getUser");
        request = GetUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        request = GetWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {
        LOG.trace("Called listApiKeys");
        request = ListApiKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer = ListApiKeysConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request) {
        LOG.trace("Called listAuthTokens");
        request = ListAuthTokensConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthTokensConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuthTokensResponse>
                transformer = ListAuthTokensConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListCompartmentsResponse listCompartments(ListCompartmentsRequest request) {
        LOG.trace("Called listCompartments");
        request = ListCompartmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompartmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCompartmentsResponse>
                transformer = ListCompartmentsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListCostTrackingTagsResponse listCostTrackingTags(ListCostTrackingTagsRequest request) {
        LOG.trace("Called listCostTrackingTags");
        request = ListCostTrackingTagsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCostTrackingTagsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCostTrackingTagsResponse>
                transformer = ListCostTrackingTagsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListDynamicGroupsResponse listDynamicGroups(ListDynamicGroupsRequest request) {
        LOG.trace("Called listDynamicGroups");
        request = ListDynamicGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDynamicGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDynamicGroupsResponse>
                transformer = ListDynamicGroupsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListFaultDomainsResponse listFaultDomains(ListFaultDomainsRequest request) {
        LOG.trace("Called listFaultDomains");
        request = ListFaultDomainsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFaultDomainsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListFaultDomainsResponse>
                transformer = ListFaultDomainsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        LOG.trace("Called listGroups");
        request = ListGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGroupsResponse> transformer =
                ListGroupsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListIdentityProviderGroupsResponse listIdentityProviderGroups(
            ListIdentityProviderGroupsRequest request) {
        LOG.trace("Called listIdentityProviderGroups");
        request = ListIdentityProviderGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProviderGroupsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdentityProviderGroupsResponse>
                transformer = ListIdentityProviderGroupsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListIdpGroupMappingsResponse listIdpGroupMappings(ListIdpGroupMappingsRequest request) {
        LOG.trace("Called listIdpGroupMappings");
        request = ListIdpGroupMappingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdpGroupMappingsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>
                transformer = ListIdpGroupMappingsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        LOG.trace("Called listPolicies");
        request = ListPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer = ListPoliciesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        LOG.trace("Called listRegions");
        request = ListRegionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer = ListRegionsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request) {
        LOG.trace("Called listSmtpCredentials");
        request = ListSmtpCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSmtpCredentialsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSmtpCredentialsResponse>
                transformer = ListSmtpCredentialsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListSwiftPasswordsResponse listSwiftPasswords(ListSwiftPasswordsRequest request) {
        LOG.trace("Called listSwiftPasswords");
        request = ListSwiftPasswordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSwiftPasswordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSwiftPasswordsResponse>
                transformer = ListSwiftPasswordsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListTagNamespacesResponse listTagNamespaces(ListTagNamespacesRequest request) {
        LOG.trace("Called listTagNamespaces");
        request = ListTagNamespacesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagNamespacesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTagNamespacesResponse>
                transformer = ListTagNamespacesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListTagsResponse listTags(ListTagsRequest request) {
        LOG.trace("Called listTags");
        request = ListTagsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTagsResponse> transformer =
                ListTagsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {
        LOG.trace("Called listUsers");
        request = ListUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
                ListUsersConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        request = ListWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) {
        LOG.trace("Called removeUserFromGroup");
        request = RemoveUserFromGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveUserFromGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RemoveUserFromGroupResponse>
                transformer = RemoveUserFromGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ResetIdpScimClientResponse resetIdpScimClient(ResetIdpScimClientRequest request) {
        LOG.trace("Called resetIdpScimClient");
        request = ResetIdpScimClientConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetIdpScimClientConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ResetIdpScimClientResponse>
                transformer = ResetIdpScimClientConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateAuthTokenResponse updateAuthToken(UpdateAuthTokenRequest request) {
        LOG.trace("Called updateAuthToken");
        request = UpdateAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuthTokenConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuthTokenResponse>
                transformer = UpdateAuthTokenConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateAuthTokenDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateCompartmentResponse updateCompartment(UpdateCompartmentRequest request) {
        LOG.trace("Called updateCompartment");
        request = UpdateCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCompartmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCompartmentResponse>
                transformer = UpdateCompartmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateCompartmentDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateCustomerSecretKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateDynamicGroupResponse updateDynamicGroup(UpdateDynamicGroupRequest request) {
        LOG.trace("Called updateDynamicGroup");
        request = UpdateDynamicGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDynamicGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDynamicGroupResponse>
                transformer = UpdateDynamicGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateDynamicGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {
        LOG.trace("Called updateGroup");
        request = UpdateGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGroupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer = UpdateGroupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateIdentityProviderDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
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

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateIdpGroupMappingDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        LOG.trace("Called updatePolicy");
        request = UpdatePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyResponse>
                transformer = UpdatePolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdatePolicyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateSmtpCredentialResponse updateSmtpCredential(UpdateSmtpCredentialRequest request) {
        LOG.trace("Called updateSmtpCredential");
        request = UpdateSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSmtpCredentialConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSmtpCredentialResponse>
                transformer = UpdateSmtpCredentialConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateSmtpCredentialDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateSwiftPasswordResponse updateSwiftPassword(UpdateSwiftPasswordRequest request) {
        LOG.trace("Called updateSwiftPassword");
        request = UpdateSwiftPasswordConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSwiftPasswordConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>
                transformer = UpdateSwiftPasswordConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateTagResponse updateTag(UpdateTagRequest request) {
        LOG.trace("Called updateTag");
        request = UpdateTagConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagResponse> transformer =
                UpdateTagConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateTagDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateTagNamespaceResponse updateTagNamespace(UpdateTagNamespaceRequest request) {
        LOG.trace("Called updateTagNamespace");
        request = UpdateTagNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagNamespaceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagNamespaceResponse>
                transformer = UpdateTagNamespaceConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateTagNamespaceDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        LOG.trace("Called updateUser");
        request = UpdateUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserResponse> transformer =
                UpdateUserConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateUserDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateUserCapabilitiesResponse updateUserCapabilities(
            UpdateUserCapabilitiesRequest request) {
        LOG.trace("Called updateUserCapabilities");
        request = UpdateUserCapabilitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserCapabilitiesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserCapabilitiesResponse>
                transformer = UpdateUserCapabilitiesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateUserCapabilitiesDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateUserStateResponse updateUserState(UpdateUserStateRequest request) {
        LOG.trace("Called updateUserState");
        request = UpdateUserStateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserStateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserStateResponse>
                transformer = UpdateUserStateConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateStateDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UploadApiKeyResponse uploadApiKey(UploadApiKeyRequest request) {
        LOG.trace("Called uploadApiKey");
        request = UploadApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadApiKeyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UploadApiKeyResponse>
                transformer = UploadApiKeyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateApiKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    private boolean canRetryRequestIfRefreshableAuthTokenUsed(com.oracle.bmc.model.BmcException e) {
        if (e.getStatusCode() == 401
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            ((com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider)
                    .refresh();
            return true;
        }
        return false;
    }

    @Override
    public IdentityWaiters getWaiters() {
        return waiters;
    }

    @Override
    public IdentityPaginators getPaginators() {
        return paginators;
    }
}
