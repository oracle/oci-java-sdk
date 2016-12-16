/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import javax.annotation.Nonnull;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.client.ClientProperties;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;

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
    private static final RequestIdFilter REQUEST_ID_FILTER = new RequestIdFilter();
    private static final LogHeadersFilter LOG_HEADERS_FILTER = new LogHeadersFilter();

    static {
        // Our default object mapper will ignore unknown properties when
        // deserializing results
        DEFAULT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private final RequestSignerFactory requestSignerFactory;
    private final ClientConfigurator clientConfigurator;

    /**
     * Creates a new REST client factor that allow the given configurator to
     * register any additional handlers it wants to the underlying REST client.
     *
     * @param clientConfigurator
     *            The configurator to customize the REST client.
     * @param requestSignerFactory
     *            The factory used to generate request signers.
     */
    public RestClientFactory(
            @Nonnull ClientConfigurator clientConfigurator,
            @Nonnull RequestSignerFactory requestSignerFactory) {
        this.clientConfigurator = clientConfigurator;
        this.requestSignerFactory = requestSignerFactory;
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider}.
     *
     * @param service The service type.
     * @param authProvider
     *            The auth provider to use.
     * @return A new RestClient instance.
     */
    public RestClient create(Service service, AuthenticationDetailsProvider authProvider) {
        return this.create(service, authProvider, ClientConfiguration.builder().build());
    }

    /**
     * Creates a new client that will use the given
     * {@link AuthenticationDetailsProvider} and {@link ClientConfiguration}.
     *
     * @param service The service type.
     * @param authProvider
     *            The auth provider to use.
     * @param configuration
     *            The client configuration to use, or null for default
     *            configuration.
     * @return A new RestClient instance.
     */
    public RestClient create(
            Service service,
            AuthenticationDetailsProvider authProvider,
            ClientConfiguration configuration) {
        ClientConfiguration clientConfigurationToUse =
                configuration != null ? configuration : ClientConfiguration.builder().build();
        RequestSigner requestSigner = this.createRequestSigner(service, authProvider);
        Client client =
                createClient(requestSigner, clientConfigurationToUse, this.clientConfigurator);
        return new RestClient(client, new EntityFactory());
    }

    private static Client createClient(
            RequestSigner requestSigner,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        ClientBuilder builder = ClientBuilder.newBuilder();
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

        client.register(new AuthnClientFilter(requestSigner));
        client.register(CLIENT_ID_FILTER);
        client.register(REQUEST_ID_FILTER);
        client.register(LOG_HEADERS_FILTER);

        clientConfigurator.customizeClient(client);
        return client;
    }

    private RequestSigner createRequestSigner(
            Service service, AuthenticationDetailsProvider authProvider) {
        return this.requestSignerFactory.createRequestSigner(service, authProvider);
    }
}
