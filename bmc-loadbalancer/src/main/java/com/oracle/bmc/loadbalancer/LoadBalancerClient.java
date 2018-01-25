/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import java.util.Locale;
import com.oracle.bmc.loadbalancer.internal.http.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.extern.slf4j.Slf4j
public class LoadBalancerClient implements LoadBalancer {
    /**
     * Service instance for LoadBalancer.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("LOADBALANCER", "iaas");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final LoadBalancerWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public LoadBalancerClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
    public LoadBalancerClient(
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
                                .setNameFormat("LoadBalancer-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new LoadBalancerWaiters(executorService, this);

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
    public CreateBackendResponse createBackend(CreateBackendRequest request) {
        LOG.trace("Called createBackend");
        request = CreateBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendResponse>
                transformer = CreateBackendConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateBackendDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateBackendDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateBackendDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request) {
        LOG.trace("Called createBackendSet");
        request = CreateBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendSetResponse>
                transformer = CreateBackendSetConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateBackendSetDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateBackendSetDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateBackendSetDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        LOG.trace("Called createCertificate");
        request = CreateCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer = CreateCertificateConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCertificateDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateCertificateDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateCertificateDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        LOG.trace("Called createListener");
        request = CreateListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateListenerResponse>
                transformer = CreateListenerConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateListenerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateListenerDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateListenerDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        LOG.trace("Called createLoadBalancer");
        request = CreateLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateLoadBalancerResponse>
                transformer = CreateLoadBalancerConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateLoadBalancerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateLoadBalancerDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateLoadBalancerDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) {
        LOG.trace("Called deleteBackend");
        request = DeleteBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendResponse>
                transformer = DeleteBackendConverter.fromResponse();

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
    public DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request) {
        LOG.trace("Called deleteBackendSet");
        request = DeleteBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendSetResponse>
                transformer = DeleteBackendSetConverter.fromResponse();

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
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        LOG.trace("Called deleteCertificate");
        request = DeleteCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer = DeleteCertificateConverter.fromResponse();

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
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        LOG.trace("Called deleteListener");
        request = DeleteListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteListenerResponse>
                transformer = DeleteListenerConverter.fromResponse();

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
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        LOG.trace("Called deleteLoadBalancer");
        request = DeleteLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteLoadBalancerResponse>
                transformer = DeleteLoadBalancerConverter.fromResponse();

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
    public GetBackendResponse getBackend(GetBackendRequest request) {
        LOG.trace("Called getBackend");
        request = GetBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendResponse> transformer =
                GetBackendConverter.fromResponse();

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
    public GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request) {
        LOG.trace("Called getBackendHealth");
        request = GetBackendHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendHealthConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendHealthResponse>
                transformer = GetBackendHealthConverter.fromResponse();

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
    public GetBackendSetResponse getBackendSet(GetBackendSetRequest request) {
        LOG.trace("Called getBackendSet");
        request = GetBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendSetResponse>
                transformer = GetBackendSetConverter.fromResponse();

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
    public GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request) {
        LOG.trace("Called getBackendSetHealth");
        request = GetBackendSetHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetHealthConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendSetHealthResponse>
                transformer = GetBackendSetHealthConverter.fromResponse();

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
    public GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request) {
        LOG.trace("Called getHealthChecker");
        request = GetHealthCheckerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHealthCheckerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetHealthCheckerResponse>
                transformer = GetHealthCheckerConverter.fromResponse();

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
    public GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request) {
        LOG.trace("Called getLoadBalancer");
        request = GetLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetLoadBalancerResponse>
                transformer = GetLoadBalancerConverter.fromResponse();

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
    public GetLoadBalancerHealthResponse getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request) {
        LOG.trace("Called getLoadBalancerHealth");
        request = GetLoadBalancerHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLoadBalancerHealthConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetLoadBalancerHealthResponse>
                transformer = GetLoadBalancerHealthConverter.fromResponse();

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
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        request = GetWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

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
    public ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request) {
        LOG.trace("Called listBackendSets");
        request = ListBackendSetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendSetsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendSetsResponse>
                transformer = ListBackendSetsConverter.fromResponse();

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
    public ListBackendsResponse listBackends(ListBackendsRequest request) {
        LOG.trace("Called listBackends");
        request = ListBackendsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendsResponse>
                transformer = ListBackendsConverter.fromResponse();

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
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        LOG.trace("Called listCertificates");
        request = ListCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer = ListCertificatesConverter.fromResponse();

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
    public ListLoadBalancerHealthsResponse listLoadBalancerHealths(
            ListLoadBalancerHealthsRequest request) {
        LOG.trace("Called listLoadBalancerHealths");
        request = ListLoadBalancerHealthsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLoadBalancerHealthsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListLoadBalancerHealthsResponse>
                transformer = ListLoadBalancerHealthsConverter.fromResponse();

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
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        LOG.trace("Called listLoadBalancers");
        request = ListLoadBalancersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLoadBalancersConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListLoadBalancersResponse>
                transformer = ListLoadBalancersConverter.fromResponse();

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
    public ListProtocolsResponse listProtocols(ListProtocolsRequest request) {
        LOG.trace("Called listProtocols");
        request = ListProtocolsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProtocolsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListProtocolsResponse>
                transformer = ListProtocolsConverter.fromResponse();

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
    public ListShapesResponse listShapes(ListShapesRequest request) {
        LOG.trace("Called listShapes");
        request = ListShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse> transformer =
                ListShapesConverter.fromResponse();

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
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        request = ListWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

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
    public UpdateBackendResponse updateBackend(UpdateBackendRequest request) {
        LOG.trace("Called updateBackend");
        request = UpdateBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendResponse>
                transformer = UpdateBackendConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateBackendDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateBackendDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateBackendDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request) {
        LOG.trace("Called updateBackendSet");
        request = UpdateBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendSetResponse>
                transformer = UpdateBackendSetConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateBackendSetDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateBackendSetDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateBackendSetDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request) {
        LOG.trace("Called updateHealthChecker");
        request = UpdateHealthCheckerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHealthCheckerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateHealthCheckerResponse>
                transformer = UpdateHealthCheckerConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getHealthChecker(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getHealthChecker(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getHealthChecker(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        LOG.trace("Called updateListener");
        request = UpdateListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListenerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateListenerResponse>
                transformer = UpdateListenerConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateListenerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateListenerDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateListenerDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        LOG.trace("Called updateLoadBalancer");
        request = UpdateLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateLoadBalancerResponse>
                transformer = UpdateLoadBalancerConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateLoadBalancerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateLoadBalancerDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateLoadBalancerDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public LoadBalancerWaiters getWaiters() {
        return waiters;
    }
}
