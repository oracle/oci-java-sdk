/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas;

import java.util.Locale;
import com.oracle.bmc.waas.internal.http.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.extern.slf4j.Slf4j
public class WaasClient implements Waas {
    /**
     * Service instance for Waas.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAAS")
                    .serviceEndpointPrefix("waas")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final WaasWaiters waiters;
    private final WaasPaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public WaasClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
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
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     */
    public WaasClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
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
        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            new com.google.common.util.concurrent.ThreadFactoryBuilder()
                                    .setDaemon(true)
                                    .setNameFormat("Waas-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }

        this.waiters = new WaasWaiters(executorService, this);

        this.paginators = new WaasPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaasClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public WaasClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new WaasClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    executorService);
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
    public AcceptRecommendationsResponse acceptRecommendations(
            AcceptRecommendationsRequest request) {
        LOG.trace("Called acceptRecommendations");
        request = AcceptRecommendationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AcceptRecommendationsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AcceptRecommendationsResponse>
                transformer = AcceptRecommendationsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getProtectionRuleKeys(), request);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {
        LOG.trace("Called cancelWorkRequest");
        request = CancelWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer = CancelWorkRequestConverter.fromResponse();

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
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        LOG.trace("Called createCertificate");
        request = CreateCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer = CreateCertificateConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateCertificateDetails(), request);
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
    public CreateWaasPolicyResponse createWaasPolicy(CreateWaasPolicyRequest request) {
        LOG.trace("Called createWaasPolicy");
        request = CreateWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWaasPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateWaasPolicyResponse>
                transformer = CreateWaasPolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateWaasPolicyDetails(), request);
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
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        LOG.trace("Called deleteCertificate");
        request = DeleteCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer = DeleteCertificateConverter.fromResponse();

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
    public DeleteWaasPolicyResponse deleteWaasPolicy(DeleteWaasPolicyRequest request) {
        LOG.trace("Called deleteWaasPolicy");
        request = DeleteWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWaasPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteWaasPolicyResponse>
                transformer = DeleteWaasPolicyConverter.fromResponse();

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
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {
        LOG.trace("Called getCertificate");
        request = GetCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCertificateResponse>
                transformer = GetCertificateConverter.fromResponse();

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
    public GetDeviceFingerprintChallengeResponse getDeviceFingerprintChallenge(
            GetDeviceFingerprintChallengeRequest request) {
        LOG.trace("Called getDeviceFingerprintChallenge");
        request = GetDeviceFingerprintChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeviceFingerprintChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDeviceFingerprintChallengeResponse>
                transformer = GetDeviceFingerprintChallengeConverter.fromResponse();

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
    public GetHumanInteractionChallengeResponse getHumanInteractionChallenge(
            GetHumanInteractionChallengeRequest request) {
        LOG.trace("Called getHumanInteractionChallenge");
        request = GetHumanInteractionChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHumanInteractionChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetHumanInteractionChallengeResponse>
                transformer = GetHumanInteractionChallengeConverter.fromResponse();

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
    public GetJsChallengeResponse getJsChallenge(GetJsChallengeRequest request) {
        LOG.trace("Called getJsChallenge");
        request = GetJsChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJsChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetJsChallengeResponse>
                transformer = GetJsChallengeConverter.fromResponse();

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
    public GetPolicyConfigResponse getPolicyConfig(GetPolicyConfigRequest request) {
        LOG.trace("Called getPolicyConfig");
        request = GetPolicyConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConfigConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyConfigResponse>
                transformer = GetPolicyConfigConverter.fromResponse();

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
    public GetProtectionRuleResponse getProtectionRule(GetProtectionRuleRequest request) {
        LOG.trace("Called getProtectionRule");
        request = GetProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionRuleConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetProtectionRuleResponse>
                transformer = GetProtectionRuleConverter.fromResponse();

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
    public GetProtectionSettingsResponse getProtectionSettings(
            GetProtectionSettingsRequest request) {
        LOG.trace("Called getProtectionSettings");
        request = GetProtectionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionSettingsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetProtectionSettingsResponse>
                transformer = GetProtectionSettingsConverter.fromResponse();

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
    public GetWaasPolicyResponse getWaasPolicy(GetWaasPolicyRequest request) {
        LOG.trace("Called getWaasPolicy");
        request = GetWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWaasPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWaasPolicyResponse>
                transformer = GetWaasPolicyConverter.fromResponse();

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
    public GetWafAddressRateLimitingResponse getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request) {
        LOG.trace("Called getWafAddressRateLimiting");
        request = GetWafAddressRateLimitingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafAddressRateLimitingConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWafAddressRateLimitingResponse>
                transformer = GetWafAddressRateLimitingConverter.fromResponse();

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
    public GetWafConfigResponse getWafConfig(GetWafConfigRequest request) {
        LOG.trace("Called getWafConfig");
        request = GetWafConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafConfigConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWafConfigResponse>
                transformer = GetWafConfigConverter.fromResponse();

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
    public ListAccessRulesResponse listAccessRules(ListAccessRulesRequest request) {
        LOG.trace("Called listAccessRules");
        request = ListAccessRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccessRulesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAccessRulesResponse>
                transformer = ListAccessRulesConverter.fromResponse();

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
    public ListCaptchasResponse listCaptchas(ListCaptchasRequest request) {
        LOG.trace("Called listCaptchas");
        request = ListCaptchasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCaptchasConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCaptchasResponse>
                transformer = ListCaptchasConverter.fromResponse();

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
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        LOG.trace("Called listCertificates");
        request = ListCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer = ListCertificatesConverter.fromResponse();

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
    public ListEdgeSubnetsResponse listEdgeSubnets(ListEdgeSubnetsRequest request) {
        LOG.trace("Called listEdgeSubnets");
        request = ListEdgeSubnetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEdgeSubnetsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListEdgeSubnetsResponse>
                transformer = ListEdgeSubnetsConverter.fromResponse();

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
    public ListGoodBotsResponse listGoodBots(ListGoodBotsRequest request) {
        LOG.trace("Called listGoodBots");
        request = ListGoodBotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGoodBotsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGoodBotsResponse>
                transformer = ListGoodBotsConverter.fromResponse();

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
    public ListProtectionRulesResponse listProtectionRules(ListProtectionRulesRequest request) {
        LOG.trace("Called listProtectionRules");
        request = ListProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProtectionRulesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListProtectionRulesResponse>
                transformer = ListProtectionRulesConverter.fromResponse();

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
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {
        LOG.trace("Called listRecommendations");
        request = ListRecommendationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecommendationsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRecommendationsResponse>
                transformer = ListRecommendationsConverter.fromResponse();

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
    public ListThreatFeedsResponse listThreatFeeds(ListThreatFeedsRequest request) {
        LOG.trace("Called listThreatFeeds");
        request = ListThreatFeedsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListThreatFeedsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListThreatFeedsResponse>
                transformer = ListThreatFeedsConverter.fromResponse();

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
    public ListWaasPoliciesResponse listWaasPolicies(ListWaasPoliciesRequest request) {
        LOG.trace("Called listWaasPolicies");
        request = ListWaasPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWaasPoliciesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWaasPoliciesResponse>
                transformer = ListWaasPoliciesConverter.fromResponse();

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
    public ListWafBlockedRequestsResponse listWafBlockedRequests(
            ListWafBlockedRequestsRequest request) {
        LOG.trace("Called listWafBlockedRequests");
        request = ListWafBlockedRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafBlockedRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafBlockedRequestsResponse>
                transformer = ListWafBlockedRequestsConverter.fromResponse();

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
    public ListWafLogsResponse listWafLogs(ListWafLogsRequest request) {
        LOG.trace("Called listWafLogs");
        request = ListWafLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafLogsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafLogsResponse>
                transformer = ListWafLogsConverter.fromResponse();

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
    public ListWafRequestsResponse listWafRequests(ListWafRequestsRequest request) {
        LOG.trace("Called listWafRequests");
        request = ListWafRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafRequestsResponse>
                transformer = ListWafRequestsConverter.fromResponse();

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
    public ListWafTrafficResponse listWafTraffic(ListWafTrafficRequest request) {
        LOG.trace("Called listWafTraffic");
        request = ListWafTrafficConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafTrafficConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafTrafficResponse>
                transformer = ListWafTrafficConverter.fromResponse();

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
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {
        LOG.trace("Called listWhitelists");
        request = ListWhitelistsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWhitelistsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWhitelistsResponse>
                transformer = ListWhitelistsConverter.fromResponse();

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
    public UpdateAccessRulesResponse updateAccessRules(UpdateAccessRulesRequest request) {
        LOG.trace("Called updateAccessRules");
        request = UpdateAccessRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAccessRulesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAccessRulesResponse>
                transformer = UpdateAccessRulesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getAccessRules(), request);
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
    public UpdateCaptchasResponse updateCaptchas(UpdateCaptchasRequest request) {
        LOG.trace("Called updateCaptchas");
        request = UpdateCaptchasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCaptchasConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCaptchasResponse>
                transformer = UpdateCaptchasConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.put(ib, request.getCaptchas(), request);
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
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        LOG.trace("Called updateCertificate");
        request = UpdateCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCertificateConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCertificateResponse>
                transformer = UpdateCertificateConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateCertificateDetails(), request);
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
    public UpdateDeviceFingerprintChallengeResponse updateDeviceFingerprintChallenge(
            UpdateDeviceFingerprintChallengeRequest request) {
        LOG.trace("Called updateDeviceFingerprintChallenge");
        request = UpdateDeviceFingerprintChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeviceFingerprintChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDeviceFingerprintChallengeResponse>
                transformer = UpdateDeviceFingerprintChallengeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(
                                ib, request.getUpdateDeviceFingerprintChallengeDetails(), request);
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
    public UpdateGoodBotsResponse updateGoodBots(UpdateGoodBotsRequest request) {
        LOG.trace("Called updateGoodBots");
        request = UpdateGoodBotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGoodBotsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGoodBotsResponse>
                transformer = UpdateGoodBotsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.put(ib, request.getGoodBots(), request);
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
    public UpdateHumanInteractionChallengeResponse updateHumanInteractionChallenge(
            UpdateHumanInteractionChallengeRequest request) {
        LOG.trace("Called updateHumanInteractionChallenge");
        request = UpdateHumanInteractionChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHumanInteractionChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateHumanInteractionChallengeResponse>
                transformer = UpdateHumanInteractionChallengeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(
                                ib, request.getUpdateHumanInteractionChallengeDetails(), request);
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
    public UpdateJsChallengeResponse updateJsChallenge(UpdateJsChallengeRequest request) {
        LOG.trace("Called updateJsChallenge");
        request = UpdateJsChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJsChallengeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJsChallengeResponse>
                transformer = UpdateJsChallengeConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateJsChallengeDetails(), request);
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
    public UpdatePolicyConfigResponse updatePolicyConfig(UpdatePolicyConfigRequest request) {
        LOG.trace("Called updatePolicyConfig");
        request = UpdatePolicyConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConfigConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyConfigResponse>
                transformer = UpdatePolicyConfigConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdatePolicyConfigDetails(), request);
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
    public UpdateProtectionRulesResponse updateProtectionRules(
            UpdateProtectionRulesRequest request) {
        LOG.trace("Called updateProtectionRules");
        request = UpdateProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionRulesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProtectionRulesResponse>
                transformer = UpdateProtectionRulesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getProtectionRules(), request);
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
    public UpdateProtectionSettingsResponse updateProtectionSettings(
            UpdateProtectionSettingsRequest request) {
        LOG.trace("Called updateProtectionSettings");
        request = UpdateProtectionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionSettingsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProtectionSettingsResponse>
                transformer = UpdateProtectionSettingsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateProtectionSettingsDetails(), request);
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
    public UpdateThreatFeedsResponse updateThreatFeeds(UpdateThreatFeedsRequest request) {
        LOG.trace("Called updateThreatFeeds");
        request = UpdateThreatFeedsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateThreatFeedsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateThreatFeedsResponse>
                transformer = UpdateThreatFeedsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getThreatFeeds(), request);
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
    public UpdateWaasPolicyResponse updateWaasPolicy(UpdateWaasPolicyRequest request) {
        LOG.trace("Called updateWaasPolicy");
        request = UpdateWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWaasPolicyConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWaasPolicyResponse>
                transformer = UpdateWaasPolicyConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateWaasPolicyDetails(), request);
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
    public UpdateWafAddressRateLimitingResponse updateWafAddressRateLimiting(
            UpdateWafAddressRateLimitingRequest request) {
        LOG.trace("Called updateWafAddressRateLimiting");
        request = UpdateWafAddressRateLimitingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafAddressRateLimitingConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateWafAddressRateLimitingResponse>
                transformer = UpdateWafAddressRateLimitingConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateWafAddressRateLimitingDetails(), request);
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
    public UpdateWafConfigResponse updateWafConfig(UpdateWafConfigRequest request) {
        LOG.trace("Called updateWafConfig");
        request = UpdateWafConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafConfigConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWafConfigResponse>
                transformer = UpdateWafConfigConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateWafConfigDetails(), request);
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
    public UpdateWhitelistsResponse updateWhitelists(UpdateWhitelistsRequest request) {
        LOG.trace("Called updateWhitelists");
        request = UpdateWhitelistsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWhitelistsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWhitelistsResponse>
                transformer = UpdateWhitelistsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getWhitelists(), request);
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
    public WaasWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WaasPaginators getPaginators() {
        return paginators;
    }
}
