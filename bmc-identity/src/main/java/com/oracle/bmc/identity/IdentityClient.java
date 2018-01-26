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
            com.oracle.bmc.Services.create("IDENTITY", "identity");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final IdentityWaiters waiters;

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
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public IdentityClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
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

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
            }
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAddUserToGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getAddUserToGroupDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getAddUserToGroupDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCompartmentDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateCompartmentDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateCompartmentDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCustomerSecretKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateCustomerSecretKeyDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateCustomerSecretKeyDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateDynamicGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateDynamicGroupDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateDynamicGroupDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateGroupDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateGroupDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateIdentityProviderDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateIdentityProviderDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateIdentityProviderDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateIdpGroupMappingDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateIdpGroupMappingDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateIdpGroupMappingDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.post(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.post(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreatePolicyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreatePolicyDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreatePolicyDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateRegionSubscriptionDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateRegionSubscriptionDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateRegionSubscriptionDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateSwiftPasswordDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateSwiftPasswordDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateSwiftPasswordDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateTagDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateTagDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateTagDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateTagNamespaceDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateTagNamespaceDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateTagNamespaceDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateUserDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateUserDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateUserDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.get(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.get(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response = client.delete(ib, request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response = client.delete(ib, request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateCompartmentDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateCompartmentDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateCompartmentDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateCustomerSecretKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateCustomerSecretKeyDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateCustomerSecretKeyDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateDynamicGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateDynamicGroupDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateDynamicGroupDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateGroupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateGroupDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateGroupDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateIdentityProviderDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateIdentityProviderDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateIdentityProviderDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateIdpGroupMappingDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateIdpGroupMappingDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateIdpGroupMappingDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdatePolicyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdatePolicyDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdatePolicyDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateSwiftPasswordDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateTagDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateTagDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateTagDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateTagNamespaceDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateTagNamespaceDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateTagNamespaceDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateUserDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateUserDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateUserDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateStateDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateStateDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateStateDetails(), request);
            return transformer.apply(response);
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

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateApiKeyDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateApiKeyDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateApiKeyDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public IdentityWaiters getWaiters() {
        return waiters;
    }
}
