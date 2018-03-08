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
public class ComputeClient implements Compute {
    /**
     * Service instance for Compute.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("COMPUTE", "iaas");
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final ComputeWaiters waiters;
    private final ComputePaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
                                .setNameFormat("Compute-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new ComputeWaiters(executorService, this);

        this.paginators = new ComputePaginators(this);

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
        public ComputeClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new ComputeClient(
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
    public AttachBootVolumeResponse attachBootVolume(AttachBootVolumeRequest request) {
        LOG.trace("Called attachBootVolume");
        request = AttachBootVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachBootVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachBootVolumeResponse>
                transformer = AttachBootVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAttachBootVolumeDetails(), request);
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
    public AttachVnicResponse attachVnic(AttachVnicRequest request) {
        LOG.trace("Called attachVnic");
        request = AttachVnicConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVnicResponse> transformer =
                AttachVnicConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAttachVnicDetails(), request);
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
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        LOG.trace("Called attachVolume");
        request = AttachVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVolumeResponse>
                transformer = AttachVolumeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAttachVolumeDetails(), request);
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
    public CaptureConsoleHistoryResponse captureConsoleHistory(
            CaptureConsoleHistoryRequest request) {
        LOG.trace("Called captureConsoleHistory");
        request = CaptureConsoleHistoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CaptureConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CaptureConsoleHistoryResponse>
                transformer = CaptureConsoleHistoryConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCaptureConsoleHistoryDetails(), request);
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
    public CreateImageResponse createImage(CreateImageRequest request) {
        LOG.trace("Called createImage");
        request = CreateImageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateImageResponse>
                transformer = CreateImageConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateImageDetails(), request);
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
    public CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request) {
        LOG.trace("Called createInstanceConsoleConnection");
        request = CreateInstanceConsoleConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateInstanceConsoleConnectionResponse>
                transformer = CreateInstanceConsoleConnectionConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(
                                ib, request.getCreateInstanceConsoleConnectionDetails(), request);
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
    public DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request) {
        LOG.trace("Called deleteConsoleHistory");
        request = DeleteConsoleHistoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteConsoleHistoryResponse>
                transformer = DeleteConsoleHistoryConverter.fromResponse();

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
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        LOG.trace("Called deleteImage");
        request = DeleteImageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteImageResponse>
                transformer = DeleteImageConverter.fromResponse();

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
    public DeleteInstanceConsoleConnectionResponse deleteInstanceConsoleConnection(
            DeleteInstanceConsoleConnectionRequest request) {
        LOG.trace("Called deleteInstanceConsoleConnection");
        request = DeleteInstanceConsoleConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConsoleConnectionResponse>
                transformer = DeleteInstanceConsoleConnectionConverter.fromResponse();

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
    public DetachBootVolumeResponse detachBootVolume(DetachBootVolumeRequest request) {
        LOG.trace("Called detachBootVolume");
        request = DetachBootVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachBootVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachBootVolumeResponse>
                transformer = DetachBootVolumeConverter.fromResponse();

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
    public DetachVnicResponse detachVnic(DetachVnicRequest request) {
        LOG.trace("Called detachVnic");
        request = DetachVnicConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVnicResponse> transformer =
                DetachVnicConverter.fromResponse();

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
    public DetachVolumeResponse detachVolume(DetachVolumeRequest request) {
        LOG.trace("Called detachVolume");
        request = DetachVolumeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVolumeResponse>
                transformer = DetachVolumeConverter.fromResponse();

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
    public ExportImageResponse exportImage(ExportImageRequest request) {
        LOG.trace("Called exportImage");
        request = ExportImageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ExportImageResponse>
                transformer = ExportImageConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getExportImageDetails(), request);
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
    public GetBootVolumeAttachmentResponse getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request) {
        LOG.trace("Called getBootVolumeAttachment");
        request = GetBootVolumeAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBootVolumeAttachmentResponse>
                transformer = GetBootVolumeAttachmentConverter.fromResponse();

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
    public GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request) {
        LOG.trace("Called getConsoleHistory");
        request = GetConsoleHistoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryResponse>
                transformer = GetConsoleHistoryConverter.fromResponse();

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
    public GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request) {
        LOG.trace("Called getConsoleHistoryContent");
        request = GetConsoleHistoryContentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryContentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer = GetConsoleHistoryContentConverter.fromResponse();

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
    public GetImageResponse getImage(GetImageRequest request) {
        LOG.trace("Called getImage");
        request = GetImageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetImageResponse> transformer =
                GetImageConverter.fromResponse();

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
    public GetInstanceResponse getInstance(GetInstanceRequest request) {
        LOG.trace("Called getInstance");
        request = GetInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInstanceResponse>
                transformer = GetInstanceConverter.fromResponse();

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
    public GetInstanceConsoleConnectionResponse getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request) {
        LOG.trace("Called getInstanceConsoleConnection");
        request = GetInstanceConsoleConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetInstanceConsoleConnectionResponse>
                transformer = GetInstanceConsoleConnectionConverter.fromResponse();

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
    public GetVnicAttachmentResponse getVnicAttachment(GetVnicAttachmentRequest request) {
        LOG.trace("Called getVnicAttachment");
        request = GetVnicAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVnicAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVnicAttachmentResponse>
                transformer = GetVnicAttachmentConverter.fromResponse();

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
    public GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request) {
        LOG.trace("Called getVolumeAttachment");
        request = GetVolumeAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeAttachmentResponse>
                transformer = GetVolumeAttachmentConverter.fromResponse();

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
    public GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request) {
        LOG.trace("Called getWindowsInstanceInitialCredentials");
        request = GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWindowsInstanceInitialCredentialsResponse>
                transformer = GetWindowsInstanceInitialCredentialsConverter.fromResponse();

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
    public InstanceActionResponse instanceAction(InstanceActionRequest request) {
        LOG.trace("Called instanceAction");
        request = InstanceActionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstanceActionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, InstanceActionResponse>
                transformer = InstanceActionConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
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
    public LaunchInstanceResponse launchInstance(LaunchInstanceRequest request) {
        LOG.trace("Called launchInstance");
        request = LaunchInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, LaunchInstanceResponse>
                transformer = LaunchInstanceConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getLaunchInstanceDetails(), request);
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
    public ListBootVolumeAttachmentsResponse listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request) {
        LOG.trace("Called listBootVolumeAttachments");
        request = ListBootVolumeAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumeAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBootVolumeAttachmentsResponse>
                transformer = ListBootVolumeAttachmentsConverter.fromResponse();

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
    public ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request) {
        LOG.trace("Called listConsoleHistories");
        request = ListConsoleHistoriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsoleHistoriesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListConsoleHistoriesResponse>
                transformer = ListConsoleHistoriesConverter.fromResponse();

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
    public ListImagesResponse listImages(ListImagesRequest request) {
        LOG.trace("Called listImages");
        request = ListImagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImagesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListImagesResponse> transformer =
                ListImagesConverter.fromResponse();

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
    public ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request) {
        LOG.trace("Called listInstanceConsoleConnections");
        request = ListInstanceConsoleConnectionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConsoleConnectionsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceConsoleConnectionsResponse>
                transformer = ListInstanceConsoleConnectionsConverter.fromResponse();

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
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        LOG.trace("Called listInstances");
        request = ListInstancesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancesResponse>
                transformer = ListInstancesConverter.fromResponse();

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
    public ListShapesResponse listShapes(ListShapesRequest request) {
        LOG.trace("Called listShapes");
        request = ListShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse> transformer =
                ListShapesConverter.fromResponse();

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
    public ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request) {
        LOG.trace("Called listVnicAttachments");
        request = ListVnicAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVnicAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVnicAttachmentsResponse>
                transformer = ListVnicAttachmentsConverter.fromResponse();

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
    public ListVolumeAttachmentsResponse listVolumeAttachments(
            ListVolumeAttachmentsRequest request) {
        LOG.trace("Called listVolumeAttachments");
        request = ListVolumeAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeAttachmentsResponse>
                transformer = ListVolumeAttachmentsConverter.fromResponse();

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
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {
        LOG.trace("Called terminateInstance");
        request = TerminateInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateInstanceResponse>
                transformer = TerminateInstanceConverter.fromResponse();

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
    public UpdateConsoleHistoryResponse updateConsoleHistory(UpdateConsoleHistoryRequest request) {
        LOG.trace("Called updateConsoleHistory");
        request = UpdateConsoleHistoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateConsoleHistoryResponse>
                transformer = UpdateConsoleHistoryConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateConsoleHistoryDetails(), request);
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
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        LOG.trace("Called updateImage");
        request = UpdateImageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateImageResponse>
                transformer = UpdateImageConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateImageDetails(), request);
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
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        LOG.trace("Called updateInstance");
        request = UpdateInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstanceResponse>
                transformer = UpdateInstanceConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateInstanceDetails(), request);
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
    public ComputeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ComputePaginators getPaginators() {
        return paginators;
    }
}
