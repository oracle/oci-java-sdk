/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

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
import com.oracle.bmc.http.client.StandardHttpProviderCapability;
import com.oracle.bmc.http.client.internal.parameterizedendpoints.ParameterizedEndpointUtil;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.internal.EndpointBuilder;
import com.oracle.bmc.internal.SpiClientConfigurator;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.util.internal.EndpointTemplateForOptionsUtils;
import com.oracle.bmc.util.internal.ClientCompatibilityChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

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
    private final Map<String, Boolean> optionsMap = new HashMap<>();

    /** Compatible SDK version, provided by the codegen. */
    public final String clientCommonLibraryVersion;

    /** Minimum compatible SDK version, maybe provided by the codegen. */
    public final Optional<String> minimumClientCommonLibraryVersionFromClient;

    private static final String JAVASDK_DISABLED_SPI_CLASSES_PROPERTY =
            "oci.javasdk.disabled.spi.classes";

    private static final String DISABLED_SPI_CLASSES_STRING;

    static {
        DISABLED_SPI_CLASSES_STRING = System.getProperty(JAVASDK_DISABLED_SPI_CLASSES_PROPERTY, "");
    }

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
        // Adding all default Client configurators
        additionalClientConfigurators.addAll(authenticationDetailsConfigurators);
        List<SpiClientConfigurator> additionalSpiClientConfigurator =
                SpiClientConfigurator.getSpiClientConfigurators();
        HashSet<String> disabledSpiClasses =
                new HashSet<>(Arrays.asList(DISABLED_SPI_CLASSES_STRING.split(",")));
        for (SpiClientConfigurator spiClientConfigurator : additionalSpiClientConfigurator) {
            if (!disabledSpiClasses.contains(spiClientConfigurator.getClass().getName())) {
                additionalClientConfigurators.add(spiClientConfigurator);
                logger.info(
                        "Additional client configurator loaded using SPI: {}",
                        spiClientConfigurator.getClass());
            } else {
                logger.info(
                        "Did not load additional client configurator using SPI since it was disabled using the oci.javasdk.disabled.spi.classes system property: {}",
                        spiClientConfigurator.getClass());
            }
        }

        if (!additionalClientConfigurators.isEmpty()) {
            List<ClientConfigurator> composedList =
                    new ArrayList<>(additionalClientConfigurators.size() + 1);
            composedList.add(preferredClientConfigurator);
            composedList.addAll(additionalClientConfigurators);
            this.clientConfigurator = new CompositeClientConfigurator(composedList);
        } else {
            this.clientConfigurator = preferredClientConfigurator;
        }

        enableDualStackEndpoints(
                EndpointTemplateForOptionsUtils.isDualStackEnabledForClientDefault(service));

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
     * This method should be used to enable or disable the use of dual-stack endpoints. The default
     * value is false i.e. dual-stack endpoints are disabled by default.
     *
     * @param enableDualStackEndpoints This flag can be set to true or false to enable or disable
     *     the use of dual-stack endpoints respectively
     */
    public synchronized void enableDualStackEndpoints(boolean enableDualStackEndpoints) {
        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, enableDualStackEndpoints);
    }

    /**
     * Return an immutable snapshot representing the current options set for this client.
     *
     * @return immutable snapshot representing the current options set for this client
     */
    public synchronized Map<String, Boolean> getOptionsMap() {
        return Collections.unmodifiableMap(new HashMap<>(optionsMap));
    }

    /**
     * Returns the endpoint after filling in the current options, as determined by {@link
     * BaseClient#getOptionsMap()}, and then filling in the required parameters in {@code
     * requiredParametersMap} into the placeholders in the endpoint.
     *
     * @param requiredParametersMap the map from required parameter name to their values
     * @return resolved endpoint, with all options and placeholders filled in
     */
    public synchronized String getResolvedEndpoint(Map<String, Object> requiredParametersMap) {
        return ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                this.getEndpoint(), requiredParametersMap, this.optionsMap);
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

    public final synchronized void setEndpoint(String endpoint) {
        if (ParameterizedEndpointUtil.INSTANCE.isEndpointParameterized(endpoint)) {
            if (!httpProvider.hasCapability(
                    StandardHttpProviderCapability.PARAMETERIZED_ENDPOINTS)) {
                String unparameterizedEndpoint =
                        ParameterizedEndpointUtil.INSTANCE.removeAllParametersFromEndpoint(
                                endpoint);
                logger.info(
                        "HTTP client provider '{}' does not support '{}' capability, changing parameterized endpoint '{}' to unparameterized endpoint '{}'",
                        httpProvider.getClass().getName(),
                        StandardHttpProviderCapability.PARAMETERIZED_ENDPOINTS,
                        endpoint,
                        unparameterizedEndpoint);
                endpoint = unparameterizedEndpoint;
            }
        }

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

    /**
     * Get the endpoint of the client.
     *
     * <p>Note that the endpoint may be parameterized and contain placeholders and options. The
     * region subdomain and realm domain will have been properly replaced already if the endpoint
     * was selected using a {@link Region}.
     *
     * <p>Examples of endpoints this may return:
     *
     * <ul>
     *   <li>Unparameterized endpoints
     *       <pre>
     *             https://identity.us-phoenix-1.oci.oraclecloud.com
     *             https://identity.us-ashburn-1.oci.oraclecloud.com
     *             https://test-namespace.objectstorage.us-ashburn-1.oci.customer-oci.com
     *         </pre>
     *   <li>Parameterized endpoints with placeholders
     *       <pre>
     *             https://{namespaceName+Dot}objectstorage.us-phoenix-1.oci.customer-oci.com
     *             https://{namespaceName+Dot}objectstorage.us-ashburn-1.oci.customer-oci.com
     *         </pre>
     *   <li>Parameterized endpoints with options
     *       <pre>
     *             https://{dualStack?ds.:}identity.us-phoenix-1.oci.oraclecloud.com
     *             https://{dualStack?ds.:}identity.us-ashburn-1.oci.oraclecloud.com
     *         </pre>
     *   <li>Parameterized endpoints with placeholders and options
     *       <pre>
     *             https://{namespaceName+Dot}{dualStack?ds.:}objectstorage.us-phoenix-1.oci.customer-oci.com
     *             https://{namespaceName+Dot}{dualStack?ds.:}objectstorage.us-ashburn-1.oci.customer-oci.com
     *         </pre>
     * </ul>
     *
     * To get the actual endpoint for a parameterized request, you can use {@link
     * BaseClient#getResolvedEndpoint(Map)} or {@link
     * ParameterizedEndpointUtil#getEndpointWithPopulatedServiceParameters(String, Map, Map)}.
     *
     * @return the endpoint being used by the client
     */
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
        Optional<String> endpoint = region.getEndpoint(service, httpProvider::hasCapability);
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
                .circuitBreaker(circuitBreaker)
                .optionsMap(optionsMap);
    }
}
