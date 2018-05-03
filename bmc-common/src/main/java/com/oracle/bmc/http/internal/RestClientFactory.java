/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import lombok.Getter;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.JerseyClientBuilder;

import javax.annotation.Nonnull;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.Collections;
import java.util.Map;

/**
 * RestClientFactory is responsible for creating a new REST client whenever a
 * specific service instance is created. The factory will configure all of the
 * required filters and configuration options.
 */
public class RestClientFactory {
    private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();
    private static final JacksonJsonProvider JACKSON_JSON_PROVIDER =
            new JacksonJaxbJsonProvider(
                    DEFAULT_MAPPER, JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS);
    private static final ClientIdFilter CLIENT_ID_FILTER = new ClientIdFilter();
    private static final LogHeadersFilter LOG_HEADERS_FILTER = new LogHeadersFilter();

    static {
        // Our default object mapper will ignore unknown properties when
        // deserializing results
        DEFAULT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Serialize Date instances using the DateFormat we specify, do not serialize into
        // timestamps.
        DEFAULT_MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // set explicit formatter that will serialize correctly
        DEFAULT_MAPPER.setDateFormat(new RFC3339DateFormat());

        FilterProvider filters =
                new SimpleFilterProvider()
                        .addFilter(ExplicitlySetFilter.NAME, ExplicitlySetFilter.INSTANCE);

        DEFAULT_MAPPER.setFilterProvider(filters);
    }

    @Getter private final ClientConfigurator clientConfigurator;

    /**
     * Creates a new REST client factor that allow the given configurator to
     * register any additional handlers it wants to the underlying REST client.
     *
     * @param clientConfigurator
     *            The configurator to customize the REST client.
     */
    public RestClientFactory(@Nonnull ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider}.
     *
     * @param requestSigner The strategy used to sign requests.
     * @return A new RestClient instance.
     *
     * @deprecated use {@link RestClientFactory#create(RequestSigner, Map)} instead
     */
    @Deprecated
    public RestClient create(RequestSigner requestSigner) {
        return this.create(requestSigner, Collections.<SigningStrategy, RequestSigner>emptyMap());
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider} and {@link ClientConfiguration}.
     *
     * @param requestSigner The strategy used to sign requests.
     * @param configuration
     *            The client configuration to use, or null for default
     *            configuration.
     * @return A new RestClient instance.
     *
     * @deprecated use {@link RestClientFactory#create(RequestSigner, Map, ClientConfiguration)} instead
     */
    @Deprecated
    public RestClient create(RequestSigner requestSigner, ClientConfiguration configuration) {
        return this.create(
                requestSigner,
                Collections.<SigningStrategy, RequestSigner>emptyMap(),
                configuration);
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider}.
     *
     * @param defaultRequestSigner
     *            The default strategy used to sign requests.
     * @param requestSigners
     *            The strategies used to sign requests, per signing strategy.
     * @return A new RestClient instance.
     */
    public RestClient create(
            RequestSigner defaultRequestSigner,
            Map<SigningStrategy, RequestSigner> requestSigners) {
        return this.create(defaultRequestSigner, requestSigners, null);
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider} and {@link ClientConfiguration}.
     *
     * @param defaultRequestSigner
     *            The default strategy used to sign requests.
     * @param requestSigners
     *            The strategies used to sign requests, per signing strategy.
     * @param configuration
     *            The client configuration to use, or null for default
     *            configuration.
     * @return A new RestClient instance.
     */
    public RestClient create(
            RequestSigner defaultRequestSigner,
            Map<SigningStrategy, RequestSigner> requestSigners,
            ClientConfiguration configuration) {
        ClientConfiguration clientConfigurationToUse =
                configuration != null ? configuration : ClientConfiguration.builder().build();
        Client client =
                createClient(
                        defaultRequestSigner,
                        requestSigners,
                        clientConfigurationToUse,
                        this.clientConfigurator);
        return new RestClient(client, new EntityFactory());
    }

    private static Client createClient(
            RequestSigner defaultRequestSigner,
            Map<SigningStrategy, RequestSigner> requestSigners,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        ClientBuilder builder = JerseyClientBuilder.newBuilder();
        clientConfigurator.customizeBuilder(builder);

        Client client =
                builder.build()
                        .register(JACKSON_JSON_PROVIDER)
                        .property(
                                ClientProperties.CONNECT_TIMEOUT,
                                configuration.getConnectionTimeoutMillis())
                        .property(
                                ClientProperties.READ_TIMEOUT, configuration.getReadTimeoutMillis())
                        .property(
                                ClientProperties.ASYNC_THREADPOOL_SIZE,
                                configuration.getMaxAsyncThreads());

        client.register(new AuthnClientFilter(defaultRequestSigner, requestSigners));
        client.register(CLIENT_ID_FILTER);
        client.register(LOG_HEADERS_FILTER);

        clientConfigurator.customizeClient(client);
        return client;
    }

    /**
     * Returns the ObjectMapper used to handle JSON requests.
     * <p>
     * Exposed only for internal use.
     * @return The ObjectMapper used.
     */
    public static ObjectMapper getObjectMapper() {
        return DEFAULT_MAPPER;
    }
}
