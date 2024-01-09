/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.util.internal.ClientCompatibilityChecker;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesClientConfigurators;
import com.oracle.bmc.auth.RegionProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.common.ClientBuilderBase;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.common.RegionalClientBuilder;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.http.DefaultConfigurator;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.internal.EndpointBuilder;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class BaseClient implements AutoCloseable {
    private static final ClientConfigurator DEFAULT_CONFIGURATOR = new DefaultConfigurator();
    private static final ClientIdFilter CLIENT_ID_FILTER = new ClientIdFilter();
    private static final LogHeadersFilter LOG_HEADERS_FILTER = new LogHeadersFilter();
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Service service;
    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final CircuitBreakerConfiguration circuitBreakerConfiguration;
    final ClientConfiguration clientConfigurationToUse;
    private final RequestSigner defaultRequestSigner;
    private final Map<SigningStrategy, RequestSigner> requestSigners;
    private final ClientConfigurator clientConfigurator;
    private OciCircuitBreaker circuitBreaker;
    private final HttpProvider httpProvider;

    private volatile String endpoint;
    private volatile HttpClient httpClient;
    private volatile Region region;

    /** Compatible SDK version, provided by the codegen. */
    public final String clientCommonLibraryVersion;

    /** Minimum compatible SDK version, maybe provided by the codegen. */
    public final Optional<String> minimumClientCommonLibraryVersionFromClient;

    protected BaseClient(
            ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.service = InternalBuilderAccess.getService(builder);
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        HttpProvider httpProvider = InternalBuilderAccess.getHttpProvider(builder);
        if (httpProvider == null) {
            httpProvider = HttpProvider.getDefault();
        }
        this.httpProvider = httpProvider;

        List<ClientConfigurator> authenticationDetailsConfigurators = new ArrayList<>();
        if (this.authenticationDetailsProvider instanceof ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((ProvidesClientConfigurators) this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }

        ClientConfiguration configuration = InternalBuilderAccess.getConfiguration(builder);
        this.clientConfigurationToUse =
                configuration != null ? configuration : ClientConfiguration.builder().build();

        this.defaultRequestSigner =
                InternalBuilderAccess.getRequestSignerFactory(builder)
                        .createRequestSigner(service, this.authenticationDetailsProvider);

        this.requestSigners = new EnumMap<>(SigningStrategy.class);
        if (this.authenticationDetailsProvider instanceof BasicAuthenticationDetailsProvider) {
            for (SigningStrategy s : SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        InternalBuilderAccess.getSigningStrategyRequestSignerFactories(builder)
                                .get(s)
                                .createRequestSigner(service, authenticationDetailsProvider));
            }
        }

        ClientConfigurator preferredClientConfigurator =
                InternalBuilderAccess.getClientConfigurator(builder);
        if (preferredClientConfigurator == null) {
            preferredClientConfigurator = getDefaultConfigurator();
        }
        List<ClientConfigurator> additionalClientConfigurators =
                InternalBuilderAccess.getAdditionalClientConfigurators(builder);
        if (!additionalClientConfigurators.isEmpty()) {
            List<ClientConfigurator> composedList =
                    new ArrayList<>(additionalClientConfigurators.size() + 1);
            composedList.add(preferredClientConfigurator);
            composedList.addAll(additionalClientConfigurators);
            this.clientConfigurator = new CompositeClientConfigurator(composedList);
        } else {
            this.clientConfigurator = preferredClientConfigurator;
        }

        String endpoint = InternalBuilderAccess.getEndpoint(builder);
        if (this.authenticationDetailsProvider instanceof RegionProvider) {
            RegionProvider provider = (RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                region = provider.getRegion();
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    logger.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            } else {
                logger.warn(
                        "Region not specified for the provider. Proceeding without setting a region. "
                                + "Please make sure to set a region before making an API call. Failure to do so will result in endpoint being null.");
            }
        }

        if (endpoint != null) {
            setEndpoint(endpoint);
        }
        if (builder instanceof RegionalClientBuilder) {
            Region regionFromBuilder =
                    InternalBuilderAccess.getRegion((RegionalClientBuilder) builder);
            if (regionFromBuilder != null) {
                setRegion(regionFromBuilder);
            }
        }

        // setting version information for the client
        String version = null;
        String minVersion = null;

        try (java.io.InputStream propertyStream =
                this.getClass()
                        .getClassLoader()
                        .getResourceAsStream(
                                this.getClass().getPackage().getName().replace('.', '/')
                                        + "/client.properties")) {
            if (propertyStream != null) {
                java.util.Properties properties = new java.util.Properties();
                properties.load(propertyStream);
                version =
                        properties.getProperty(
                                ClientCompatibilityChecker
                                        .JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME);
                minVersion =
                        properties.getProperty(
                                ClientCompatibilityChecker
                                        .JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_FROM_CLIENT_PROPERTY_NAME);
            } else {
                logger.warn("Failed to load client.properties for {}", this.getClass().getName());
            }
        } catch (Exception e) {
            logger.warn("Failed to load client.properties for " + this.getClass().getName(), e);
        } finally {
            clientCommonLibraryVersion = version;
            minimumClientCommonLibraryVersionFromClient = Optional.ofNullable(minVersion);
        }

        ClientRuntime.getRuntime()
                .getClientCompatibilityChecker()
                .isClientCodegenVersionCompatible(
                        this.getClass().getName(),
                        clientCommonLibraryVersion,
                        minimumClientCommonLibraryVersionFromClient,
                        logger);
    }

    protected ClientConfigurator getDefaultConfigurator() {
        return DEFAULT_CONFIGURATOR;
    }

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     *     enable or disable the use of realm-specific endpoint template respectively
     */
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        if (region == null) {
            throw new java.lang.NullPointerException(
                    "Cannot determine the realm since region is null or blank. useRealmSpecificEndpointTemplate() can only be used if region is set.");
        }
        String regionId = region.getRegionId();
        try {
            Realm realm = Region.fromRegionId(regionId).getRealm();

            if (useOfRealmSpecificEndpointTemplateEnabled
                    && (service.getServiceEndpointTemplateForRealmMap() == null)) {
                useOfRealmSpecificEndpointTemplateEnabled = false;
                logger.debug(
                        "Realm-specific endpoint template not defined for realm {}, using non-realm-specific endpoint template instead.",
                        realm.getRealmId().toLowerCase(Locale.ROOT));
            }

            String endpointTemplateToUse;
            if (useOfRealmSpecificEndpointTemplateEnabled) {
                endpointTemplateToUse =
                        EndpointBuilder.getRealmSpecificEndpointTemplate(regionId, service, realm);
            } else {
                endpointTemplateToUse =
                        EndpointBuilder.getServiceEndpointTemplateToUse(regionId, service, realm);
            }
            logger.debug("Setting endpoint template to: {}", endpointTemplateToUse);
            setEndpoint(endpointTemplateToUse);
        } catch (IllegalArgumentException e) {
            logger.info(
                    "Cannot determine the realm for unknown regionId '{}', falling back to default endpoint format `{}`",
                    regionId,
                    Region.formatDefaultRegionEndpoint(service, regionId));
        }
    }

    /**
     * Populate the parameters in the endpoint with its corresponding value and update the base
     * endpoint. The value will be populated iff the parameter in endpoint is a required request
     * path parameter or a required request query parameter. If not, the parameter in the endpoint
     * will be ignored and left blank.
     *
     * @param endpoint The endpoint template in use
     * @param requiredParametersMap Map of parameter name as key and value set in request path or
     *     query parameter as value
     */
    public final void populateServiceParametersInEndpoint(
            String endpoint, Map<String, Object> requiredParametersMap) {
        if (!endpoint.contains("{")) {
            return;
        }

        List<String> parameters = parseEndpointForParams(endpoint);
        String updatedEndpoint = endpoint;
        if (parameters != null && parameters.size() > 0 && requiredParametersMap.isEmpty()) {
            updatedEndpoint = updatedEndpoint.replaceAll("\\{.*?\\}", "");
            updateBaseEndpoint(updatedEndpoint);
            return;
        }

        for (String parameter : parameters) {
            boolean appendDot = false;
            String paramName;

            // If the parameter is defined with a "+Dot" string, it means we need to append a "."
            // after populating the paramName value
            if (parameter.endsWith("+Dot}")) {
                appendDot = true;
                paramName = parameter.substring(1, parameter.indexOf("+"));
            } else {
                paramName = parameter.substring(1, parameter.length() - 1);
            }

            if (requiredParametersMap.containsKey(paramName)) {
                if (!(requiredParametersMap.get(paramName) instanceof String)) {
                    logger.debug(
                            "The parameter for {} cannot be populated since the value is not of type String",
                            paramName);
                    updatedEndpoint = updatedEndpoint.replace(parameter, "");
                    updateBaseEndpoint(updatedEndpoint);
                    continue;
                }
                if (appendDot) {
                    updatedEndpoint =
                            updatedEndpoint.replace(
                                    parameter, requiredParametersMap.get(paramName) + ".");
                } else {
                    updatedEndpoint =
                            updatedEndpoint.replace(
                                    parameter, requiredParametersMap.get(paramName).toString());
                }
            } else {
                updatedEndpoint = updatedEndpoint.replace(parameter, "");
            }
        }
        updateBaseEndpoint(updatedEndpoint);
    }

    private List<String> parseEndpointForParams(String endpointTemplate) {
        List<String> parsedParams = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(endpointTemplate);
        while (matcher.find()) {
            parsedParams.add(matcher.group());
        }
        return parsedParams;
    }

    /**
     * This method should be used for parameterized endpoint templates only. This does not include
     * {region} and {secondLevelDomain} parameters.
     *
     * @param endpoint The updated endpoint to use
     */
    public final synchronized void updateBaseEndpoint(String endpoint) {
        logger.info("Updating endpoint to {}", endpoint);

        HttpClientBuilder builder =
                httpProvider
                        .newBuilder()
                        .baseUri(endpoint)
                        .property(
                                StandardClientProperties.CONNECT_TIMEOUT,
                                Duration.ofMillis(
                                        clientConfigurationToUse.getConnectionTimeoutMillis()))
                        .property(
                                StandardClientProperties.READ_TIMEOUT,
                                Duration.ofMillis(clientConfigurationToUse.getReadTimeoutMillis()))
                        .property(
                                StandardClientProperties.ASYNC_POOL_SIZE,
                                clientConfigurationToUse.getMaxAsyncThreads())
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(defaultRequestSigner, requestSigners))
                        .registerRequestInterceptor(Priorities.HEADER_DECORATOR, CLIENT_ID_FILTER)
                        .registerRequestInterceptor(Priorities.USER, LOG_HEADERS_FILTER);
        clientConfigurator.customizeClient(builder);
        HttpClient oldClient = this.httpClient;
        if (oldClient != null) {
            oldClient.close();
        }
        this.httpClient = builder.build();

        circuitBreaker =
                CircuitBreakerHelper.makeCircuitBreaker(httpClient, circuitBreakerConfiguration);
    }

    public final synchronized void setEndpoint(String endpoint) {
        logger.info("Setting endpoint to {}", endpoint);

        this.endpoint = endpoint;

        HttpClientBuilder builder =
                httpProvider
                        .newBuilder()
                        .baseUri(endpoint)
                        .property(
                                StandardClientProperties.CONNECT_TIMEOUT,
                                Duration.ofMillis(
                                        clientConfigurationToUse.getConnectionTimeoutMillis()))
                        .property(
                                StandardClientProperties.READ_TIMEOUT,
                                Duration.ofMillis(clientConfigurationToUse.getReadTimeoutMillis()))
                        .property(
                                StandardClientProperties.ASYNC_POOL_SIZE,
                                clientConfigurationToUse.getMaxAsyncThreads())
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(defaultRequestSigner, requestSigners))
                        .registerRequestInterceptor(Priorities.HEADER_DECORATOR, CLIENT_ID_FILTER)
                        .registerRequestInterceptor(Priorities.USER, LOG_HEADERS_FILTER);
        clientConfigurator.customizeClient(builder);
        HttpClient oldClient = this.httpClient;
        if (oldClient != null) {
            oldClient.close();
        }
        this.httpClient = builder.build();

        OciCircuitBreaker userDefinedCircuitBreaker = clientConfigurationToUse.getCircuitBreaker();
        circuitBreaker =
                userDefinedCircuitBreaker != null
                        ? userDefinedCircuitBreaker
                        : CircuitBreakerHelper.makeCircuitBreaker(
                                httpClient, circuitBreakerConfiguration);
    }

    public final String getEndpoint() {
        return endpoint;
    }

    /**
     * Rebuild the backing {@link HttpClient}. This will call {@link ClientConfigurator}s again, and
     * can be used to e.g. refresh the SSL certificate.
     */
    public final synchronized void refreshClient() {
        setEndpoint(endpoint);
    }

    // the setRegion methods are exposed by overrides for those clients that are region-specific

    protected void setRegion(com.oracle.bmc.Region region) {
        this.region = region;
        if (Alloy.shouldUseOnlyAlloyRegions()) {
            try {
                Region.valueOf(region.getRegionId());
            } catch (IllegalArgumentException e) {
                Alloy.throwUnknownAlloyRegionIfAppropriate(region.getRegionId(), e);
            }
        }
        Optional<String> endpoint = region.getEndpoint(service);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + service + " is not known in region " + region);
        }
    }

    protected void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        try {
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            Alloy.throwUnknownAlloyRegionIfAppropriate(regionId, e);
            logger.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(service, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public final void close() {
        if (httpClient != null) {
            httpClient.close();
        }
    }

    public String getClientCommonLibraryVersion() {
        return clientCommonLibraryVersion;
    }

    public Optional<String> getMinimumClientCommonLibraryVersionFromClient() {
        return minimumClientCommonLibraryVersionFromClient;
    }

    protected <
                    REQ extends BmcRequest<?>,
                    RESP extends BmcResponse,
                    RESP_BUILDER extends BmcResponse.Builder<RESP>>
            ClientCall<REQ, RESP, RESP_BUILDER> clientCall(
                    // for inference, supply these directly
                    REQ request, Supplier<RESP_BUILDER> responseBuilder) {
        return ClientCall.builder(httpClient, request, responseBuilder)
                .clientConfigurator(clientConfigurator)
                .authenticationDetailsProvider(authenticationDetailsProvider)
                .circuitBreaker(circuitBreaker);
    }
}
