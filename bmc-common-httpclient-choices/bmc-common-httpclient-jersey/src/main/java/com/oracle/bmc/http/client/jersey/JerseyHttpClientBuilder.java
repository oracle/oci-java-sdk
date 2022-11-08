/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.Serialization;
import com.oracle.bmc.http.client.ClientProperty;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.KeyStoreWithPassword;
import com.oracle.bmc.http.client.ProxyConfiguration;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.StandardClientProperties;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
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

final class JerseyHttpClientBuilder implements HttpClientBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(JerseyHttpClientBuilder.class);

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
    private boolean isApacheNonBufferingClient = false;
    private KeyStoreWithPassword keyStore;
    private KeyStore trustStore;
    private HostnameVerifier hostnameVerifier;
    private SSLContext sslContext;
    private boolean useApacheConnector = true;

    JerseyHttpClientBuilder() {
        // buffer by default, for signing and better error messages.
        properties.put(
                ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.BUFFERED);
        if (JerseyHttpProvider.isApacheDependencyPresent) {
            properties.put(
                    ApacheClientProperties.REQUEST_CONFIG,
                    RequestConfig.custom()
                            .setContentCompressionEnabled(false)
                            .setExpectContinueEnabled(false)
                            .build());
            properties.put(
                    ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                    new ApacheConnectionClosingStrategy.ImmediateClosingStrategy());
            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
            cm.setMaxTotal(50);
            cm.setDefaultMaxPerRoute(50);
            properties.put(ApacheClientProperties.CONNECTION_MANAGER, cm);
            property(
                    com.oracle.bmc.http.client.jersey.ApacheClientProperties
                            .CONNECTION_MANAGER_SHARED,
                    false);
            property(
                    com.oracle.bmc.http.client.jersey.ApacheClientProperties.RETRY_HANDLER,
                    DEFAULT_REQUEST_RETRY_HANDLER);
            property(
                    com.oracle.bmc.http.client.jersey.ApacheClientProperties.REUSE_STRATEGY,
                    DEFAULT_CONNECTION_REUSE_STRATEGY);
        }
    }

    @Override
    public HttpClientBuilder baseUri(URI uri) {
        this.baseUri = uri;
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
                if (JerseyHttpProvider.isApacheDependencyPresent) {
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
                                null,
                                address.getHostString(),
                                address.getPort(),
                                null,
                                null,
                                null));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(e);
            }
            if (proxy.getUsername() != null) {
                properties.put(ClientProperties.PROXY_USERNAME, proxy.getUsername());
            }
            if (proxy.getPassword() != null) {
                properties.put(
                        ClientProperties.PROXY_PASSWORD, String.valueOf(proxy.getPassword()));
            }
        } else if (key == JerseyClientProperties.USE_APACHE_CONNECTOR) {
            useApacheConnector = (Boolean) value;
        } else if (key instanceof JerseyClientProperty) {
            properties.put(((JerseyClientProperty<T>) key).jerseyProperty, value);
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
        ClientBuilder clientBuilder = ClientBuilder.newBuilder();
        ClientConfig clientConfig = new ClientConfig();
        if (JerseyHttpProvider.isApacheDependencyPresent && useApacheConnector) {
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
        for (Map.Entry<String, Object> prop : properties.entrySet()) {
            clientBuilder.property(prop.getKey(), prop.getValue());
        }
        clientBuilder.property(InternalProperties.JSON_FEATURE, "JacksonFeature");
        if (keyStore != null) {
            clientBuilder.keyStore(keyStore.getKeyStore(), keyStore.getPassword());
        }
        if (sslContext == null) {
            if (trustStore != null) {
                clientBuilder.trustStore(trustStore);
            }
            if (hostnameVerifier != null) {
                clientBuilder.hostnameVerifier(hostnameVerifier);
            }
        } else {
            if (trustStore != null || hostnameVerifier != null) {
                throw new IllegalStateException(
                        "Cannot set trust store or hostname verifier when SSL context is also set");
            }
            clientBuilder.sslContext(sslContext);
        }

        Client client = clientBuilder.build();

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

        return new JerseyHttpClient(
                client,
                client.target(baseUri),
                requestInterceptors.stream()
                        .sorted(Comparator.comparingInt(p -> p.priority))
                        .map(p -> p.value)
                        .collect(Collectors.toList()),
                isApacheNonBufferingClient);
    }

    private static class PrioritizedValue<T> {
        final int priority;
        final T value;

        PrioritizedValue(int priority, T value) {
            this.priority = priority;
            this.value = value;
        }
    }
}
