/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.Serialization;
import com.oracle.bmc.http.client.ClientProperty;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.KeyStoreWithPassword;
import com.oracle.bmc.http.client.ProxyConfiguration;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey3.internal.DaemonClientAsyncExecutorProvider;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.RequestContent;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.apache.connector.ApacheHttpClientBuilderConfigurator;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.client.RequestEntityProcessing;
import org.glassfish.jersey.internal.InternalProperties;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.spi.ExecutorServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyStore;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

final class Jersey3HttpClientBuilder implements HttpClientBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(Jersey3HttpClientBuilder.class);
    private static final int DEFAULT_MAX_ASYNC_THREADS = 50;

    /** The default {@link ClientBuilderDecorator} simply calls {@link ClientBuilder#build()}. */
    private static final ClientBuilderDecorator SIMPLE_DECORATOR =
            clientBuilder -> clientBuilder.build();

    public static ConnectionReuseStrategy DEFAULT_CONNECTION_REUSE_STRATEGY =
            new NoConnectionReuseStrategy();
    public static HttpRequestRetryHandler DEFAULT_REQUEST_RETRY_HANDLER =
            new DefaultHttpRequestRetryHandler(0, false);

    public static final JacksonJsonProvider JACKSON_JSON_PROVIDER =
            new JacksonJaxbJsonProvider(
                    Serialization.getObjectMapper(), JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS);
    private final Collection<PrioritizedValue<RequestInterceptor>> requestInterceptors =
            new ArrayList<>();
    private final Map<String, Object> properties = new HashMap<>();
    private URI baseUri;
    private String baseUriString;
    private boolean isApacheNonBufferingClient = false;
    private KeyStoreWithPassword keyStore;
    private KeyStore trustStore;
    private HostnameVerifier hostnameVerifier;
    private SSLContext sslContext;
    private boolean useApacheConnector = true;
    private ExecutorServiceProvider executorServiceProvider = null;
    private boolean useJerseyDefaultExecutorServiceProvider = false;
    private ClientBuilderDecorator decorator = SIMPLE_DECORATOR;

    private boolean shouldSetDefaultConnectionManagerForApacheConnector = false;

    Jersey3HttpClientBuilder() {
        // buffer by default, for signing and better error messages.
        properties.put(
                ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.BUFFERED);
        if (shouldUseApacheConnector()) {
            properties.put(
                    ApacheClientProperties.REQUEST_CONFIG,
                    RequestConfig.custom()
                            .setContentCompressionEnabled(false)
                            .setExpectContinueEnabled(false)
                            .setConnectionRequestTimeout(1000 * 60)
                            .build());
            properties.put(
                    ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                    new ApacheConnectionClosingStrategy.ImmediateClosingStrategy());

            // later, before constructing the client, we should set the connection manager,
            // unless the user has set a different connection manager already using
            // properties.put(ApacheClientProperties.CONNECTION_MANAGER, cm)
            this.shouldSetDefaultConnectionManagerForApacheConnector = true;

            property(
                    com.oracle.bmc.http.client.jersey3.ApacheClientProperties
                            .CONNECTION_MANAGER_SHARED,
                    false);
            property(
                    com.oracle.bmc.http.client.jersey3.ApacheClientProperties.RETRY_HANDLER,
                    DEFAULT_REQUEST_RETRY_HANDLER);
            property(
                    com.oracle.bmc.http.client.jersey3.ApacheClientProperties.REUSE_STRATEGY,
                    DEFAULT_CONNECTION_REUSE_STRATEGY);
        }
    }

    @Override
    public HttpClientBuilder baseUri(URI uri) {
        this.baseUri = uri;
        return this;
    }

    @Override
    public HttpClientBuilder baseUri(String uri) {
        this.baseUriString = uri;
        return this;
    }

    @Override
    public <T> HttpClientBuilder property(ClientProperty<T> key, T value) {
        if (key == StandardClientProperties.ASYNC_POOL_SIZE) {
            properties.put(ClientProperties.ASYNC_THREADPOOL_SIZE, value);
        } else if (key == StandardClientProperties.READ_TIMEOUT) {
            properties.put(ClientProperties.READ_TIMEOUT, (int) ((Duration) value).toMillis());
        } else if (key == StandardClientProperties.CONNECT_TIMEOUT) {
            properties.put(ClientProperties.CONNECT_TIMEOUT, (int) ((Duration) value).toMillis());
        } else if (key == StandardClientProperties.KEY_STORE) {
            keyStore = (KeyStoreWithPassword) value;
        } else if (key == StandardClientProperties.TRUST_STORE) {
            trustStore = (KeyStore) value;
        } else if (key == StandardClientProperties.HOSTNAME_VERIFIER) {
            hostnameVerifier = (HostnameVerifier) value;
        } else if (key == StandardClientProperties.SSL_CONTEXT) {
            sslContext = (SSLContext) value;
        } else if (key == StandardClientProperties.BUFFER_REQUEST) {
            if ((Boolean) value) {
                properties.put(
                        ClientProperties.REQUEST_ENTITY_PROCESSING,
                        RequestEntityProcessing.BUFFERED);
            } else {
                if (shouldUseApacheConnector()) {
                    isApacheNonBufferingClient = true;
                } else {
                    properties.put(
                            ClientProperties.REQUEST_ENTITY_PROCESSING,
                            RequestEntityProcessing.CHUNKED);
                }
            }
        } else if (key == StandardClientProperties.PROXY) {
            ProxyConfiguration proxy = (ProxyConfiguration) value;
            String scheme;
            switch (proxy.getProxy().type()) {
                case HTTP:
                    scheme = "http";
                    break;
                case SOCKS:
                    scheme = "socks";
                    break;
                default:
                    throw new IllegalArgumentException(
                            "Unsupported proxy type: " + proxy.getProxy().type());
            }
            InetSocketAddress address = (InetSocketAddress) proxy.getProxy().address();
            try {
                properties.put(
                        ClientProperties.PROXY_URI,
                        new URI(
                                scheme,
                                address.getHostString(),
                                Integer.toString(address.getPort()),
                                null));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e);
            }
            if (proxy.getUsername() != null) {
                properties.put(ClientProperties.PROXY_USERNAME, proxy.getUsername());
            }
            if (proxy.getPassword() != null) {
                properties.put(ClientProperties.PROXY_PASSWORD, proxy.getPassword());
            }
        } else if (key == Jersey3ClientProperties.USE_APACHE_CONNECTOR) {
            useApacheConnector = (Boolean) value;
        } else if (key == Jersey3ClientProperties.USE_JERSEY_DEFAULT_EXECUTOR_SERVICE_PROVIDER) {
            useJerseyDefaultExecutorServiceProvider = (((Boolean) value) == Boolean.TRUE);
        } else if (key == Jersey3ClientProperties.EXECUTOR_SERVICE_PROVIDER) {
            executorServiceProvider = (ExecutorServiceProvider) value;
        } else if (key == ClientBuilderDecorator.PROPERTY) {
            decorator = (ClientBuilderDecorator) value;
        } else if (key instanceof Jersey3ClientProperty) {
            String jerseyProperty = ((Jersey3ClientProperty<T>) key).jerseyProperty;
            properties.put(jerseyProperty, value);
            if (com.oracle.bmc.http.client.jersey3.ApacheClientProperties.CONNECTION_MANAGER
                    .jerseyProperty.equals(jerseyProperty)) {
                // user has set connection manager already, don't set default anymore
                shouldSetDefaultConnectionManagerForApacheConnector = false;
            }
        } else {
            throw new IllegalArgumentException(
                    "Unknown or unsupported HTTP client property " + key);
        }
        return this;
    }

    @Override
    public HttpClientBuilder registerRequestInterceptor(
            int priority, RequestInterceptor interceptor) {
        requestInterceptors.add(new PrioritizedValue<>(priority, interceptor));
        return this;
    }

    @Override
    public HttpClient build() {
        if (shouldSetDefaultConnectionManagerForApacheConnector) {
            PoolingHttpClientConnectionManager cm =
                    buildDefaultPoolingHttpClientConnectionManagerForApacheConnector(sslContext);
            properties.put(ApacheClientProperties.CONNECTION_MANAGER, cm);
        }

        ClientBuilder clientBuilder = ClientBuilder.newBuilder();
        ClientConfig clientConfig = new ClientConfig();
        if (shouldUseApacheConnector()) {
            LOG.info("Setting connector provider to ApacheConnectorProvider");
            clientConfig.connectorProvider(new ApacheConnectorProvider());
            // need to configure the client so that it doesn't fail if we provide Content-Length
            // headers etc.
            // this will overwrite them instead
            clientConfig.register(
                    new ApacheHttpClientBuilderConfigurator() {
                        @Override
                        public org.apache.http.impl.client.HttpClientBuilder configure(
                                org.apache.http.impl.client.HttpClientBuilder httpClientBuilder) {
                            return httpClientBuilder.addInterceptorLast(new RequestContent(true));
                        }
                    });
        } else {
            LOG.info("Setting connector provider to HttpUrlConnectorProvider");
            // 1) enable workaround for 'patch' requests
            HttpUrlConnectorProvider provider =
                    new HttpUrlConnectorProvider().useSetMethodWorkaround();
            clientConfig.connectorProvider(provider);
        }
        clientBuilder.withConfig(clientConfig);
        clientBuilder.register(JACKSON_JSON_PROVIDER);

        if (executorServiceProvider == null && !useJerseyDefaultExecutorServiceProvider) {
            // not told to use Jersey's default
            if (!properties.containsKey(ClientProperties.ASYNC_THREADPOOL_SIZE)) {
                // register default async thread pool size
                LOG.info(
                        "Using {} with default async thread pool size {}, since no other executorServiceProvider was given and the async thread pool size had not been set specifically",
                        DaemonClientAsyncExecutorProvider.class.getName(),
                        DEFAULT_MAX_ASYNC_THREADS);
                properties.put(ClientProperties.ASYNC_THREADPOOL_SIZE, DEFAULT_MAX_ASYNC_THREADS);
            }
        }

        for (Map.Entry<String, Object> prop : properties.entrySet()) {
            clientBuilder.property(prop.getKey(), prop.getValue());
        }
        clientBuilder.property(InternalProperties.JSON_FEATURE, "JacksonFeature");
        if (keyStore != null) {
            clientBuilder.keyStore(keyStore.getKeyStore(), keyStore.getPassword());
        }
        if (hostnameVerifier != null) {
            clientBuilder.hostnameVerifier(hostnameVerifier);
        }
        if (sslContext == null) {
            if (trustStore != null) {
                clientBuilder.trustStore(trustStore);
            }
        } else {
            if (trustStore != null) {
                throw new IllegalStateException(
                        "Cannot set trust store when SSL context is also set");
            }
            clientBuilder.sslContext(sslContext);
        }

        // build the client, using the decorator
        Client client = decorator.finish(clientBuilder);

        if (executorServiceProvider != null) {
            client.register(executorServiceProvider);
        } else {
            // no specific ExecutorServiceProvider set
            if (!useJerseyDefaultExecutorServiceProvider) {
                // not told to use Jersey's default
                client.register(DaemonClientAsyncExecutorProvider.class);
            }
        }

        if (LOG.isTraceEnabled()) {
            String collectedProperties = null;
            if (client.getConfiguration() != null
                    && client.getConfiguration().getProperties() != null) {
                collectedProperties =
                        client.getConfiguration().getProperties().entrySet().stream()
                                .sorted(Comparator.comparing(e -> e.getKey()))
                                .map(e -> "['" + e.getKey() + "':'" + e.getValue() + "']")
                                .collect(Collectors.joining(", "));
            }
            LOG.trace(
                    "Creating client '{}' with 'isApacheNonBufferingClient'='{}' and properties: {}",
                    client.getClass().getName(),
                    isApacheNonBufferingClient,
                    collectedProperties);
        }

        WebTarget baseTarget;
        if (baseUri != null) {
            baseTarget = client.target(baseUri);
        } else {
            baseTarget = client.target(baseUriString);
        }

        return new Jersey3HttpClient(
                client,
                baseTarget,
                requestInterceptors.stream()
                        .sorted(Comparator.comparingInt(p -> p.priority))
                        .map(p -> p.value)
                        .collect(Collectors.toList()),
                isApacheNonBufferingClient);
    }

    private boolean shouldUseApacheConnector() {
        return Jersey3HttpProvider.isApacheDependencyPresent && useApacheConnector;
    }

    private static class PrioritizedValue<T> {
        final int priority;
        final T value;

        PrioritizedValue(int priority, T value) {
            this.priority = priority;
            this.value = value;
        }
    }

    /**
     * Build the default {@link PoolingHttpClientConnectionManager} used for the Apache Connector.
     *
     * @param sslContext SSL context, or null if none
     * @return PoolingHttpClientConnectionManager
     */
    public static PoolingHttpClientConnectionManager
            buildDefaultPoolingHttpClientConnectionManagerForApacheConnector(
                    SSLContext sslContext) {
        PoolingHttpClientConnectionManager cm;
        if (sslContext != null) {
            Registry<ConnectionSocketFactory> socketFactoryRegistry =
                    RegistryBuilder.<ConnectionSocketFactory>create()
                            .register("http", PlainConnectionSocketFactory.getSocketFactory())
                            .register("https", new SSLConnectionSocketFactory(sslContext))
                            .build();
            cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        } else {
            cm = new PoolingHttpClientConnectionManager();
        }
        cm.setMaxTotal(50);
        cm.setDefaultMaxPerRoute(50);
        return cm;
    }
}
