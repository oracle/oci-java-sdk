/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import java.util.Locale;
import com.oracle.bmc.dns.internal.http.*;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.extern.slf4j.Slf4j
public class DnsClient implements Dns {
    /**
     * Service instance for Dns.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("DNS", "dns");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final DnsWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DnsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DnsClient(
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
    public DnsClient(
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
    public DnsClient(
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
                                .setNameFormat("Dns-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new DnsWaiters(executorService, this);

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
    public CreateZoneResponse createZone(CreateZoneRequest request) {
        LOG.trace("Called createZone");
        request = CreateZoneConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateZoneConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateZoneResponse> transformer =
                CreateZoneConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateZoneDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.post(ib, request.getCreateZoneDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.post(ib, request.getCreateZoneDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public DeleteDomainRecordsResponse deleteDomainRecords(DeleteDomainRecordsRequest request) {
        LOG.trace("Called deleteDomainRecords");
        request = DeleteDomainRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDomainRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDomainRecordsResponse>
                transformer = DeleteDomainRecordsConverter.fromResponse();

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
    public DeleteRRSetResponse deleteRRSet(DeleteRRSetRequest request) {
        LOG.trace("Called deleteRRSet");
        request = DeleteRRSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRRSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteRRSetResponse>
                transformer = DeleteRRSetConverter.fromResponse();

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
    public DeleteZoneResponse deleteZone(DeleteZoneRequest request) {
        LOG.trace("Called deleteZone");
        request = DeleteZoneConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteZoneConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteZoneResponse> transformer =
                DeleteZoneConverter.fromResponse();

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
    public GetDomainRecordsResponse getDomainRecords(GetDomainRecordsRequest request) {
        LOG.trace("Called getDomainRecords");
        request = GetDomainRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDomainRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDomainRecordsResponse>
                transformer = GetDomainRecordsConverter.fromResponse();

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
    public GetRRSetResponse getRRSet(GetRRSetRequest request) {
        LOG.trace("Called getRRSet");
        request = GetRRSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRRSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetRRSetResponse> transformer =
                GetRRSetConverter.fromResponse();

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
    public GetZoneResponse getZone(GetZoneRequest request) {
        LOG.trace("Called getZone");
        request = GetZoneConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetZoneConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetZoneResponse> transformer =
                GetZoneConverter.fromResponse();

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
    public GetZoneRecordsResponse getZoneRecords(GetZoneRecordsRequest request) {
        LOG.trace("Called getZoneRecords");
        request = GetZoneRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetZoneRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetZoneRecordsResponse>
                transformer = GetZoneRecordsConverter.fromResponse();

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
    public ListZonesResponse listZones(ListZonesRequest request) {
        LOG.trace("Called listZones");
        request = ListZonesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListZonesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListZonesResponse> transformer =
                ListZonesConverter.fromResponse();

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
    public PatchDomainRecordsResponse patchDomainRecords(PatchDomainRecordsRequest request) {
        LOG.trace("Called patchDomainRecords");
        request = PatchDomainRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDomainRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchDomainRecordsResponse>
                transformer = PatchDomainRecordsConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.patch(ib, request.getPatchDomainRecordsDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.patch(ib, request.getPatchDomainRecordsDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.patch(ib, request.getPatchDomainRecordsDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public PatchRRSetResponse patchRRSet(PatchRRSetRequest request) {
        LOG.trace("Called patchRRSet");
        request = PatchRRSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchRRSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchRRSetResponse> transformer =
                PatchRRSetConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.patch(ib, request.getPatchRRSetDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.patch(ib, request.getPatchRRSetDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.patch(ib, request.getPatchRRSetDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public PatchZoneRecordsResponse patchZoneRecords(PatchZoneRecordsRequest request) {
        LOG.trace("Called patchZoneRecords");
        request = PatchZoneRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchZoneRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchZoneRecordsResponse>
                transformer = PatchZoneRecordsConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.patch(ib, request.getPatchZoneRecordsDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.patch(ib, request.getPatchZoneRecordsDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.patch(ib, request.getPatchZoneRecordsDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateDomainRecordsResponse updateDomainRecords(UpdateDomainRecordsRequest request) {
        LOG.trace("Called updateDomainRecords");
        request = UpdateDomainRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDomainRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDomainRecordsResponse>
                transformer = UpdateDomainRecordsConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateDomainRecordsDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateDomainRecordsDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateDomainRecordsDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateRRSetResponse updateRRSet(UpdateRRSetRequest request) {
        LOG.trace("Called updateRRSet");
        request = UpdateRRSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRRSetConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateRRSetResponse>
                transformer = UpdateRRSetConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateRRSetDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateRRSetDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateRRSetDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateZoneResponse updateZone(UpdateZoneRequest request) {
        LOG.trace("Called updateZone");
        request = UpdateZoneConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateZoneConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateZoneResponse> transformer =
                UpdateZoneConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateZoneDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateZoneDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateZoneDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public UpdateZoneRecordsResponse updateZoneRecords(UpdateZoneRecordsRequest request) {
        LOG.trace("Called updateZoneRecords");
        request = UpdateZoneRecordsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateZoneRecordsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateZoneRecordsResponse>
                transformer = UpdateZoneRecordsConverter.fromResponse();

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateZoneRecordsDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (e.getStatusCode() == 401) {
                    ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider)
                            .refreshSecurityToken();
                    javax.ws.rs.core.Response response =
                            client.put(ib, request.getUpdateZoneRecordsDetails(), request);
                    return transformer.apply(response);
                } else {
                    throw e;
                }
            }
        } else {
            javax.ws.rs.core.Response response =
                    client.put(ib, request.getUpdateZoneRecordsDetails(), request);
            return transformer.apply(response);
        }
    }

    @Override
    public DnsWaiters getWaiters() {
        return waiters;
    }
}
