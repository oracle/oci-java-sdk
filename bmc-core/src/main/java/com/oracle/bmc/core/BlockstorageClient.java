/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import java.util.Locale;
import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class BlockstorageClient implements Blockstorage {
    /**
     * Service instance for Blockstorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("BLOCKSTORAGE", "iaas");
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final BlockstorageWaiters waiters;
    private final BlockstoragePaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public BlockstorageClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BlockstorageClient(
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
    public BlockstorageClient(
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
    public BlockstorageClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
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
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public BlockstorageClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
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
                                .setNameFormat("Blockstorage-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new BlockstorageWaiters(executorService, this);

        this.paginators = new BlockstoragePaginators(this);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
            }
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder {
        protected com.oracle.bmc.ClientConfiguration configuration;
        protected com.oracle.bmc.http.ClientConfigurator clientConfigurator;
        protected java.util.List<com.oracle.bmc.http.ClientConfigurator>
                additionalClientConfigurators = new java.util.ArrayList<>();
        protected com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory =
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD);

        private Builder() {}

        private Builder(
                com.oracle.bmc.ClientConfiguration configuration,
                com.oracle.bmc.http.ClientConfigurator clientConfigurator,
                java.util.List<com.oracle.bmc.http.ClientConfigurator>
                        additionalClientConfigurators,
                com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
            this.configuration = configuration;
            this.clientConfigurator = clientConfigurator;
            this.additionalClientConfigurators = additionalClientConfigurators;
        }

        /**
         * Set the configuration. May be null.
         * @param configuration configuration. May be null.
         * @return this builder
         */
        public Builder configuration(com.oracle.bmc.ClientConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Set the client configurator. May be null.
         * @param clientConfigurator client configurator. May be null.
         * @return this builder
         */
        public Builder clientConfigurator(
                com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
            this.clientConfigurator = clientConfigurator;
            return this;
        }

        /**
         * Add an additional client configurator to be run after the primary configurator.
         * @param additionalClientConfigurator the additional client configurator
         * @return this builder
         */
        public Builder additionalClientConfigurator(
                @lombok.NonNull
                com.oracle.bmc.http.ClientConfigurator additionalClientConfigurator) {
            this.additionalClientConfigurators.add(additionalClientConfigurator);
            return this;
        }

        /**
         * Set the request signer factory. May be null.
         * @param requestSignerFactory request signer factory. May be null.
         * @return this builder
         */
        public Builder requestSignerFactory(
                com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
            if (requestSignerFactory == null) {
                this.requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
            } else {
                this.requestSignerFactory = requestSignerFactory;
            }
            return this;
        }

        /**
         * Set the authentication details provider. Once this is called, the builder can build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return a builder that can build the client
         */
        public BlockstorageClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new BlockstorageClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    additionalClientConfigurators);
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
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        LOG.trace("Called createVolume");
        request = CreateVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeResponse>
                transformer = CreateVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateVolumeDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateVolumeBackupResponse createVolumeBackup(CreateVolumeBackupRequest request) {
        LOG.trace("Called createVolumeBackup");
        request = CreateVolumeBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeBackupResponse>
                transformer = CreateVolumeBackupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateVolumeBackupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateVolumeBackupPolicyAssignmentResponse createVolumeBackupPolicyAssignment(
            CreateVolumeBackupPolicyAssignmentRequest request) {
        LOG.trace("Called createVolumeBackupPolicyAssignment");
        request = CreateVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupPolicyAssignmentConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVolumeBackupPolicyAssignmentResponse>
                transformer = CreateVolumeBackupPolicyAssignmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(
                                ib,
                                request.getCreateVolumeBackupPolicyAssignmentDetails(),
                                request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteBootVolumeResponse deleteBootVolume(DeleteBootVolumeRequest request) {
        LOG.trace("Called deleteBootVolume");
        request = DeleteBootVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBootVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBootVolumeResponse>
                transformer = DeleteBootVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        LOG.trace("Called deleteVolume");
        request = DeleteVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeResponse>
                transformer = DeleteVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteVolumeBackupResponse deleteVolumeBackup(DeleteVolumeBackupRequest request) {
        LOG.trace("Called deleteVolumeBackup");
        request = DeleteVolumeBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeBackupResponse>
                transformer = DeleteVolumeBackupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteVolumeBackupPolicyAssignmentResponse deleteVolumeBackupPolicyAssignment(
            DeleteVolumeBackupPolicyAssignmentRequest request) {
        LOG.trace("Called deleteVolumeBackupPolicyAssignment");
        request = DeleteVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupPolicyAssignmentConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVolumeBackupPolicyAssignmentResponse>
                transformer = DeleteVolumeBackupPolicyAssignmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetBootVolumeResponse getBootVolume(GetBootVolumeRequest request) {
        LOG.trace("Called getBootVolume");
        request = GetBootVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBootVolumeResponse>
                transformer = GetBootVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetVolumeResponse getVolume(GetVolumeRequest request) {
        LOG.trace("Called getVolume");
        request = GetVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeResponse> transformer =
                GetVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetVolumeBackupResponse getVolumeBackup(GetVolumeBackupRequest request) {
        LOG.trace("Called getVolumeBackup");
        request = GetVolumeBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeBackupResponse>
                transformer = GetVolumeBackupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetVolumeBackupPolicyResponse getVolumeBackupPolicy(
            GetVolumeBackupPolicyRequest request) {
        LOG.trace("Called getVolumeBackupPolicy");
        request = GetVolumeBackupPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeBackupPolicyResponse>
                transformer = GetVolumeBackupPolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetVolumeBackupPolicyAssetAssignmentResponse getVolumeBackupPolicyAssetAssignment(
            GetVolumeBackupPolicyAssetAssignmentRequest request) {
        LOG.trace("Called getVolumeBackupPolicyAssetAssignment");
        request = GetVolumeBackupPolicyAssetAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyAssetAssignmentConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeBackupPolicyAssetAssignmentResponse>
                transformer = GetVolumeBackupPolicyAssetAssignmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetVolumeBackupPolicyAssignmentResponse getVolumeBackupPolicyAssignment(
            GetVolumeBackupPolicyAssignmentRequest request) {
        LOG.trace("Called getVolumeBackupPolicyAssignment");
        request = GetVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyAssignmentConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeBackupPolicyAssignmentResponse>
                transformer = GetVolumeBackupPolicyAssignmentConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListBootVolumesResponse listBootVolumes(ListBootVolumesRequest request) {
        LOG.trace("Called listBootVolumes");
        request = ListBootVolumesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBootVolumesResponse>
                transformer = ListBootVolumesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListVolumeBackupPoliciesResponse listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request) {
        LOG.trace("Called listVolumeBackupPolicies");
        request = ListVolumeBackupPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeBackupPoliciesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeBackupPoliciesResponse>
                transformer = ListVolumeBackupPoliciesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListVolumeBackupsResponse listVolumeBackups(ListVolumeBackupsRequest request) {
        LOG.trace("Called listVolumeBackups");
        request = ListVolumeBackupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeBackupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeBackupsResponse>
                transformer = ListVolumeBackupsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        LOG.trace("Called listVolumes");
        request = ListVolumesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumesResponse>
                transformer = ListVolumesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateBootVolumeResponse updateBootVolume(UpdateBootVolumeRequest request) {
        LOG.trace("Called updateBootVolume");
        request = UpdateBootVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBootVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBootVolumeResponse>
                transformer = UpdateBootVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateBootVolumeDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        LOG.trace("Called updateVolume");
        request = UpdateVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeResponse>
                transformer = UpdateVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateVolumeDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateVolumeBackupResponse updateVolumeBackup(UpdateVolumeBackupRequest request) {
        LOG.trace("Called updateVolumeBackup");
        request = UpdateVolumeBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeBackupResponse>
                transformer = UpdateVolumeBackupConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateVolumeBackupDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfInstancePrincipalsUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    private boolean canRetryRequestIfInstancePrincipalsUsed(com.oracle.bmc.model.BmcException e) {
        if (e.getStatusCode() == 401
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            ((com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider)
                    .refreshSecurityToken();
            return true;
        }
        return false;
    }

    @Override
    public BlockstorageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BlockstoragePaginators getPaginators() {
        return paginators;
    }
}
