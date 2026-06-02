/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.http.ConnectionPoolingApacheConfigurator;
import com.oracle.bmc.http.DefaultConfigurator;
import com.oracle.bmc.http.internal.EntityFactory;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import org.junit.After;
import org.junit.Test;
import org.mockito.Mockito;

import javax.ws.rs.client.Client;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class SecretsConnectionPoolingOptionsTest {
    private static final String CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY =
            "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.global";
    private static final String CONNECTION_POOLING_ENABLED_PREFIX =
            "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.";
    private static final String SECRETS_CLIENT_CLASS_NAME = "com.oracle.bmc.secrets.SecretsClient";
    private static final String SECRETS_ASYNC_CLIENT_CLASS_NAME =
            "com.oracle.bmc.secrets.SecretsAsyncClient";

    private final String originalGlobalProperty =
            System.getProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
    private final String originalSecretsClientProperty =
            System.getProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME);
    private final String originalSecretsAsyncClientProperty =
            System.getProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME);

    @After
    public void tearDown() {
        restoreProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, originalGlobalProperty);
        restoreProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME,
                originalSecretsClientProperty);
        restoreProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME,
                originalSecretsAsyncClientProperty);
    }

    @Test
    public void secretsClientUsesConnectionPoolingConfiguratorByDefault() {
        System.clearProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
        System.clearProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME);

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsClient client =
                new SecretsClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(
                getPrimaryConfigurator(restClientFactoryBuilder)
                        instanceof ConnectionPoolingApacheConfigurator);
    }

    @Test
    public void secretsClientFallsBackToDefaultConfiguratorWhenDisabledGlobally() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "false");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME, "true");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsClient client =
                new SecretsClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(getPrimaryConfigurator(restClientFactoryBuilder) instanceof DefaultConfigurator);
    }

    @Test
    public void secretsClientFallsBackToDefaultConfiguratorWhenDisabledForClass() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME, "false");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsClient client =
                new SecretsClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(getPrimaryConfigurator(restClientFactoryBuilder) instanceof DefaultConfigurator);
    }

    @Test
    public void secretsClientUsesConnectionPoolingConfiguratorWhenEnabledGloballyAndForClass() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_CLIENT_CLASS_NAME, "true");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsClient client =
                new SecretsClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(
                getPrimaryConfigurator(restClientFactoryBuilder)
                        instanceof ConnectionPoolingApacheConfigurator);
    }

    @Test
    public void secretsAsyncClientUsesConnectionPoolingConfiguratorByDefault() {
        System.clearProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
        System.clearProperty(CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME);

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsAsyncClient client =
                new SecretsAsyncClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(
                getPrimaryConfigurator(restClientFactoryBuilder)
                        instanceof ConnectionPoolingApacheConfigurator);
    }

    @Test
    public void secretsAsyncClientFallsBackToDefaultConfiguratorWhenDisabledGlobally() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "false");
        System.setProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME, "true");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsAsyncClient client =
                new SecretsAsyncClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(getPrimaryConfigurator(restClientFactoryBuilder) instanceof DefaultConfigurator);
    }

    @Test
    public void
            secretsAsyncClientUsesConnectionPoolingConfiguratorWhenEnabledGloballyAndForClass() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME, "true");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsAsyncClient client =
                new SecretsAsyncClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(
                getPrimaryConfigurator(restClientFactoryBuilder)
                        instanceof ConnectionPoolingApacheConfigurator);
    }

    @Test
    public void secretsAsyncClientFallsBackToDefaultConfiguratorWhenDisabledForClass() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + SECRETS_ASYNC_CLIENT_CLASS_NAME, "false");

        RecordingRestClientFactoryBuilder restClientFactoryBuilder =
                new RecordingRestClientFactoryBuilder();

        SecretsAsyncClient client =
                new SecretsAsyncClient(
                        new TestAuthenticationDetailsProvider(),
                        null,
                        null,
                        TEST_REQUEST_SIGNER_FACTORY,
                        TEST_SIGNING_STRATEGY_FACTORIES,
                        Collections.<ClientConfigurator>emptyList(),
                        null,
                        restClientFactoryBuilder);
        client.close();

        assertTrue(getPrimaryConfigurator(restClientFactoryBuilder) instanceof DefaultConfigurator);
    }

    private static final RequestSigner TEST_REQUEST_SIGNER =
            new RequestSigner() {
                @Override
                public Map<String, String> signRequest(
                        URI uri,
                        String httpMethod,
                        Map<String, List<String>> headers,
                        Object body) {
                    return Collections.emptyMap();
                }
            };

    private static final RequestSignerFactory TEST_REQUEST_SIGNER_FACTORY =
            new RequestSignerFactory() {
                @Override
                public RequestSigner createRequestSigner(
                        com.oracle.bmc.Service service,
                        AbstractAuthenticationDetailsProvider abstractAuthProvider) {
                    return TEST_REQUEST_SIGNER;
                }
            };

    private static final Map<SigningStrategy, RequestSignerFactory>
            TEST_SIGNING_STRATEGY_FACTORIES = createSigningStrategyFactories();

    private static Map<SigningStrategy, RequestSignerFactory> createSigningStrategyFactories() {
        Map<SigningStrategy, RequestSignerFactory> factories = new EnumMap<>(SigningStrategy.class);
        for (SigningStrategy strategy : SigningStrategy.values()) {
            factories.put(strategy, TEST_REQUEST_SIGNER_FACTORY);
        }
        return factories;
    }

    private static ClientConfigurator getPrimaryConfigurator(
            RecordingRestClientFactoryBuilder restClientFactoryBuilder) {
        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) restClientFactoryBuilder.getBuiltClientConfigurator();
        return compositeClientConfigurator.getConfigurators().get(0);
    }

    private static void restoreProperty(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
        } else {
            System.setProperty(key, value);
        }
    }

    private static class TestAuthenticationDetailsProvider
            implements BasicAuthenticationDetailsProvider {
        @Override
        public String getKeyId() {
            return "test-key-id";
        }

        @Override
        public InputStream getPrivateKey() {
            return new ByteArrayInputStream(new byte[0]);
        }

        @Override
        public String getPassPhrase() {
            return null;
        }

        @Override
        public char[] getPassphraseCharacters() {
            return null;
        }
    }

    private static class RecordingRestClientFactoryBuilder extends RestClientFactoryBuilder {
        private ClientConfigurator builtClientConfigurator;

        @Override
        public RestClientFactory build() {
            ArrayList<ClientConfigurator> configurators = new ArrayList<>();
            configurators.add(getClientConfigurator());
            configurators.addAll(getAdditionalClientConfigurators());
            builtClientConfigurator =
                    new CompositeClientConfigurator(Collections.unmodifiableList(configurators));
            return new StubRestClientFactory(builtClientConfigurator);
        }

        ClientConfigurator getBuiltClientConfigurator() {
            return builtClientConfigurator;
        }
    }

    private static class StubRestClientFactory extends RestClientFactory {
        StubRestClientFactory(ClientConfigurator clientConfigurator) {
            super(clientConfigurator);
        }

        @Override
        public RestClient create(
                RequestSigner defaultRequestSigner,
                Map<SigningStrategy, RequestSigner> requestSigners,
                ClientConfiguration configuration,
                boolean isNonBuffering,
                com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker circuitBreaker,
                com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration
                        circuitBreakerConfiguration) {
            Client client = Mockito.mock(Client.class);
            Mockito.when(client.getConfiguration()).thenReturn(null);
            return new RestClient(
                    client, new EntityFactory(), null, isNonBuffering, getClientConfigurator());
        }

        @Override
        public RestClient create(
                RequestSigner defaultRequestSigner,
                Map<SigningStrategy, RequestSigner> requestSigners,
                ClientConfiguration configuration,
                boolean isNonBuffering) {
            return create(
                    defaultRequestSigner,
                    requestSigners,
                    configuration,
                    isNonBuffering,
                    null,
                    null);
        }
    }
}
