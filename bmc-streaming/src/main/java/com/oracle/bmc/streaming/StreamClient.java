/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming;

import java.util.Locale;
import com.oracle.bmc.streaming.internal.http.*;
import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.extern.slf4j.Slf4j
public class StreamClient implements Stream {
    /**
     * Service instance for Stream.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STREAM")
                    .serviceEndpointPrefix("streams")
                    .serviceEndpointTemplate(
                            "https://streams.{region}.streaming.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public StreamClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, StreamClient> {
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
        public StreamClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new StreamClient(
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
    public ConsumerCommitResponse consumerCommit(ConsumerCommitRequest request) {
        LOG.trace("Called consumerCommit");
        request = ConsumerCommitConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConsumerCommitConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ConsumerCommitResponse>
                transformer = ConsumerCommitConverter.fromResponse();

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
    public ConsumerHeartbeatResponse consumerHeartbeat(ConsumerHeartbeatRequest request) {
        LOG.trace("Called consumerHeartbeat");
        request = ConsumerHeartbeatConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConsumerHeartbeatConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ConsumerHeartbeatResponse>
                transformer = ConsumerHeartbeatConverter.fromResponse();

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
    public CreateCursorResponse createCursor(CreateCursorRequest request) {
        LOG.trace("Called createCursor");
        request = CreateCursorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCursorConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCursorResponse>
                transformer = CreateCursorConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCursorDetails(), request);
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
    public CreateGroupCursorResponse createGroupCursor(CreateGroupCursorRequest request) {
        LOG.trace("Called createGroupCursor");
        request = CreateGroupCursorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupCursorConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupCursorResponse>
                transformer = CreateGroupCursorConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateGroupCursorDetails(), request);
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
    public GetMessagesResponse getMessages(GetMessagesRequest request) {
        LOG.trace("Called getMessages");
        request = GetMessagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMessagesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetMessagesResponse>
                transformer = GetMessagesConverter.fromResponse();

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
    public PutMessagesResponse putMessages(PutMessagesRequest request) {
        LOG.trace("Called putMessages");
        request = PutMessagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMessagesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PutMessagesResponse>
                transformer = PutMessagesConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getPutMessagesDetails(), request);
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
}
