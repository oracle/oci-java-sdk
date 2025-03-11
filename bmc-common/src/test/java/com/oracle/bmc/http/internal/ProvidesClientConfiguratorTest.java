/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesClientConfigurators;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.*;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.util.CircuitBreakerUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    HttpProvider.class,
    InternalBuilderAccess.class,
    LoggerFactory.class,
    Logger.class,
    BaseClient.class
})
public class ProvidesClientConfiguratorTest {

    // Mocking client configurator provider
    private class AuthClientConfiguratorProvider
            implements ProvidesClientConfigurators, AuthenticationDetailsProvider {
        private ClientConfigurator clientConfigurator;

        public AuthClientConfiguratorProvider(ClientConfigurator clientConfigurator) {
            this.clientConfigurator = clientConfigurator;
        }

        @Override
        public List<ClientConfigurator> getClientConfigurators() {
            return Collections.singletonList(this.clientConfigurator);
        };

        @Override
        public String getFingerprint() {
            return "null";
        }

        @Override
        public String getTenantId() {
            return "null";
        }

        @Override
        public String getUserId() {
            return "null";
        }

        @Override
        public char[] getPassphraseCharacters() {
            char[] chars = new char[4];
            return chars;
        }

        @Override
        public String getKeyId() {
            return "null";
        }

        @Override
        public InputStream getPrivateKey() {
            return null;
        }

        @Override
        public String getPassPhrase() {
            return "";
        }

        public Region getRegion() {
            return Region.US_PHOENIX_1;
        }
    }

    private static class TestBaseClient extends BaseClient {
        public static final com.oracle.bmc.Service SERVICE =
                com.oracle.bmc.Services.serviceBuilder()
                        .serviceName("TEST")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("https://test.{region}.{secondLevelDomain}")
                        .endpointServiceName("test")
                        .build();

        private TestBaseClient(
                com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
                AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
                java.util.concurrent.ExecutorService executorService) {
            super(
                    builder,
                    authenticationDetailsProvider,
                    CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
        }

        public static ProvidesClientConfiguratorTest.TestBaseClient.Builder builder() {
            return new ProvidesClientConfiguratorTest.TestBaseClient.Builder(SERVICE);
        }

        public static class Builder
                extends com.oracle.bmc.common.RegionalClientBuilder<
                        ProvidesClientConfiguratorTest.TestBaseClient.Builder,
                        ProvidesClientConfiguratorTest.TestBaseClient> {
            private java.util.concurrent.ExecutorService executorService;

            private Builder(com.oracle.bmc.Service service) {
                super(service);
                final String packageName = "testservice";
                com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(
                        packageName);
                requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                SigningStrategy.STANDARD);
            }

            /**
             * Set the ExecutorService for the client to be created.
             *
             * @param executorService executorService
             * @return this builder
             */
            public ProvidesClientConfiguratorTest.TestBaseClient.Builder executorService(
                    java.util.concurrent.ExecutorService executorService) {
                this.executorService = executorService;
                return this;
            }

            /**
             * Build the client.
             *
             * @param authenticationDetailsProvider authentication details provider
             * @return the client
             */
            public ProvidesClientConfiguratorTest.TestBaseClient build(
                    @jakarta.annotation.Nonnull
                            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
                return new ProvidesClientConfiguratorTest.TestBaseClient(
                        this, authenticationDetailsProvider, executorService);
            }
        }

        @Override
        public void setRegion(com.oracle.bmc.Region region) {
            super.setRegion(region);
        }

        @Override
        public void setRegion(String regionId) {
            super.setRegion(regionId);
        }
    }

    @Test
    public void testCustomConfiguratorCustomizeClientIsGettingCalled() {
        // Arrange
        ClientConfigurator clientConfigurator = mock(ClientConfigurator.class);
        // create a mock authClientConfigurator
        AuthClientConfiguratorProvider authClientConfiguratorProvider =
                new AuthClientConfiguratorProvider(clientConfigurator);
        RequestSigner mockRequestSigner = mock(RequestSigner.class);
        RequestSignerFactory mockRequestSignerFactory = mock(RequestSignerFactory.class);
        when(mockRequestSignerFactory.createRequestSigner(any(), any()))
                .thenReturn(mockRequestSigner);

        HttpClientBuilder mockHttpClientBuilder = mock(HttpClientBuilder.class);
        HttpClient mockHttpClient = mock(HttpClient.class);
        when(mockHttpClientBuilder.build()).thenReturn(mockHttpClient);
        when(mockHttpClientBuilder.baseUri(anyString())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.property(any(), any())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.registerRequestInterceptor(anyInt(), any()))
                .thenReturn(mockHttpClientBuilder);

        // Mock the HttpProvider
        HttpProvider mockHttpProvider = mock(HttpProvider.class);
        when(mockHttpProvider.newBuilder()).thenReturn(mockHttpClientBuilder);

        // Mock static methods in InternalBuilderAccess class
        PowerMockito.mockStatic(InternalBuilderAccess.class);
        PowerMockito.when(InternalBuilderAccess.getRequestSignerFactory(any()))
                .thenReturn(mockRequestSignerFactory);

        Map<SigningStrategy, RequestSignerFactory> factories = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            factories.put(s, mockRequestSignerFactory);
        }
        PowerMockito.when(InternalBuilderAccess.getSigningStrategyRequestSignerFactories(any()))
                .thenReturn(factories);
        PowerMockito.when(InternalBuilderAccess.getHttpProvider(any()))
                .thenReturn(mockHttpProvider);
        List<ClientConfigurator> clientConfiguratorList = new ArrayList<>();
        clientConfiguratorList.add(clientConfigurator);

        // passing mocked configurator as part of additional Client configurators
        //
        // PowerMockito.when(InternalBuilderAccess.getAdditionalClientConfigurators(any())).thenReturn(clientConfiguratorList);

        // Mock the logger
        Logger mockLogger = mock(Logger.class);
        PowerMockito.mockStatic(LoggerFactory.class);
        when(LoggerFactory.getLogger(any(Class.class))).thenReturn(mockLogger);

        // Mock the clientConfigurator as a mock

        // Create or spy on the client (TestBaseClient)
        TestBaseClient client =
                spy(
                        new TestBaseClient(
                                mock(com.oracle.bmc.common.ClientBuilderBase.class),
                                authClientConfiguratorProvider,
                                null));

        // Mock getDefaultConfigurator method to return clientConfigurator
        doReturn(clientConfigurator).when(client).getDefaultConfigurator();

        // Act: Call setEndpoint which will internally call the builder's build() method
        client.setEndpoint("https://test.{region}.{secondLevelDomain}");

        // Verify: Check interactions with HttpClientBuilder
        verify(mockHttpClientBuilder, times(3))
                .registerRequestInterceptor(
                        anyInt(), any()); // Check if the interceptor was registered
        verify(mockHttpClientBuilder, times(1))
                .build(); // Ensure that the build() method was called
        verify(clientConfigurator, times(1)).customizeClient(mockHttpClientBuilder);
    }

    @Test
    public void
            testCustomConfiguratorCustomizeClientIsGettingCalledWhenPassedAsPrefferedConfigurator() {
        // Arrange
        AbstractAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(BasicAuthenticationDetailsProvider.class);

        ClientConfigurator clientConfigurator = mock(ClientConfigurator.class);
        RequestSigner mockRequestSigner = mock(RequestSigner.class);
        RequestSignerFactory mockRequestSignerFactory = mock(RequestSignerFactory.class);
        when(mockRequestSignerFactory.createRequestSigner(any(), any()))
                .thenReturn(mockRequestSigner);

        HttpClientBuilder mockHttpClientBuilder = mock(HttpClientBuilder.class);
        HttpClient mockHttpClient = mock(HttpClient.class);
        when(mockHttpClientBuilder.build()).thenReturn(mockHttpClient);
        when(mockHttpClientBuilder.baseUri(anyString())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.property(any(), any())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.registerRequestInterceptor(anyInt(), any()))
                .thenReturn(mockHttpClientBuilder);

        // Mock the HttpProvider
        HttpProvider mockHttpProvider = mock(HttpProvider.class);
        when(mockHttpProvider.newBuilder()).thenReturn(mockHttpClientBuilder);

        PowerMockito.mockStatic(InternalBuilderAccess.class);
        PowerMockito.when(InternalBuilderAccess.getRequestSignerFactory(any()))
                .thenReturn(mockRequestSignerFactory);

        Map<SigningStrategy, RequestSignerFactory> factories = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            factories.put(s, mockRequestSignerFactory);
        }
        PowerMockito.when(InternalBuilderAccess.getSigningStrategyRequestSignerFactories(any()))
                .thenReturn(factories);
        PowerMockito.when(InternalBuilderAccess.getHttpProvider(any()))
                .thenReturn(mockHttpProvider);

        // passed as preferred client configurator
        PowerMockito.when(InternalBuilderAccess.getClientConfigurator(any()))
                .thenReturn(clientConfigurator);

        // Mock the logger
        Logger mockLogger = mock(Logger.class);
        PowerMockito.mockStatic(LoggerFactory.class);
        when(LoggerFactory.getLogger(any(Class.class))).thenReturn(mockLogger);

        // Create or spy on the client (TestBaseClient)
        TestBaseClient client =
                spy(
                        new TestBaseClient(
                                mock(com.oracle.bmc.common.ClientBuilderBase.class),
                                authenticationDetailsProvider,
                                null));

        // Mock getDefaultConfigurator method to return clientConfigurator
        doReturn(clientConfigurator).when(client).getDefaultConfigurator();

        // Act: Call setEndpoint which will internally call the builder's build() method
        client.setEndpoint("https://test.{region}.{secondLevelDomain}");

        verify(clientConfigurator, times(1)).customizeClient(mockHttpClientBuilder);
    }

    @Test
    public void testCustomConfiguratorCustomizeClientIsGettingCalledWithAdditionalConfigurator() {
        // Arrange
        AbstractAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(BasicAuthenticationDetailsProvider.class);

        ClientConfigurator clientConfigurator = mock(ClientConfigurator.class);
        RequestSigner mockRequestSigner = mock(RequestSigner.class);
        RequestSignerFactory mockRequestSignerFactory = mock(RequestSignerFactory.class);
        when(mockRequestSignerFactory.createRequestSigner(any(), any()))
                .thenReturn(mockRequestSigner);

        HttpClientBuilder mockHttpClientBuilder = mock(HttpClientBuilder.class);
        HttpClient mockHttpClient = mock(HttpClient.class);
        when(mockHttpClientBuilder.build()).thenReturn(mockHttpClient);
        when(mockHttpClientBuilder.baseUri(anyString())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.property(any(), any())).thenReturn(mockHttpClientBuilder);
        when(mockHttpClientBuilder.registerRequestInterceptor(anyInt(), any()))
                .thenReturn(mockHttpClientBuilder);

        // Mock the HttpProvider
        HttpProvider mockHttpProvider = mock(HttpProvider.class);
        when(mockHttpProvider.newBuilder()).thenReturn(mockHttpClientBuilder);

        // Mock static methods in InternalBuilderAccess class
        PowerMockito.mockStatic(InternalBuilderAccess.class);
        PowerMockito.when(InternalBuilderAccess.getRequestSignerFactory(any()))
                .thenReturn(mockRequestSignerFactory);

        Map<SigningStrategy, RequestSignerFactory> factories = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            factories.put(s, mockRequestSignerFactory);
        }
        PowerMockito.when(InternalBuilderAccess.getSigningStrategyRequestSignerFactories(any()))
                .thenReturn(factories);
        PowerMockito.when(InternalBuilderAccess.getHttpProvider(any()))
                .thenReturn(mockHttpProvider);
        List<ClientConfigurator> clientConfiguratorList = new ArrayList<>();
        clientConfiguratorList.add(clientConfigurator);

        // passing mocked configurator as part of additional Client configurators
        PowerMockito.when(InternalBuilderAccess.getAdditionalClientConfigurators(any()))
                .thenReturn(clientConfiguratorList);

        // Mock the logger
        Logger mockLogger = mock(Logger.class);
        PowerMockito.mockStatic(LoggerFactory.class);
        when(LoggerFactory.getLogger(any(Class.class))).thenReturn(mockLogger);

        // Mock the clientConfigurator as a mock

        // Create or spy on the client (TestBaseClient)
        TestBaseClient client =
                spy(
                        new TestBaseClient(
                                mock(com.oracle.bmc.common.ClientBuilderBase.class),
                                authenticationDetailsProvider,
                                null));

        // Mock getDefaultConfigurator method to return clientConfigurator
        doReturn(clientConfigurator).when(client).getDefaultConfigurator();

        // Act: Call setEndpoint which will internally call the builder's build() method
        client.setEndpoint("https://test.{region}.{secondLevelDomain}");

        // Verify: Check interactions with HttpClientBuilder
        verify(mockHttpClientBuilder, times(3))
                .registerRequestInterceptor(
                        anyInt(), any()); // Check if the interceptor was registered
        verify(mockHttpClientBuilder, times(1))
                .build(); // Ensure that the build() method was called
        verify(clientConfigurator, times(1)).customizeClient(mockHttpClientBuilder);
    }
}
