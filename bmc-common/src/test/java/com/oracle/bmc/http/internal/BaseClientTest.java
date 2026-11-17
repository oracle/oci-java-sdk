/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerFactory;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.util.CircuitBreakerUtils;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.RETURNS_SELF;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpProvider.class, InternalBuilderAccess.class})
public class BaseClientTest {

    private BasicAuthenticationDetailsProvider mockAuthProvider;
    private HttpProvider mockHttpProvider;

    @Before
    public void setup() {
        mockHttpProvider = mock(HttpProvider.class);

        PowerMockito.mockStatic(HttpProvider.class);
        PowerMockito.when(HttpProvider.getDefault()).thenReturn(mockHttpProvider);

        mockAuthProvider = mock(BasicAuthenticationDetailsProvider.class);
        RequestSigner mockRequestSigner = mock(RequestSigner.class);

        RequestSignerFactory mockRequestSignerFactory = mock(RequestSignerFactory.class);
        when(mockRequestSignerFactory.createRequestSigner(any(), any()))
                .thenReturn(mockRequestSigner);

        PowerMockito.mockStatic(InternalBuilderAccess.class);
        PowerMockito.when(InternalBuilderAccess.getService(any()))
                .thenReturn(TestBaseClient.SERVICE);
        PowerMockito.when(InternalBuilderAccess.getRequestSignerFactory(any()))
                .thenReturn(mockRequestSignerFactory);
        Map<SigningStrategy, RequestSignerFactory> factories = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            factories.put(s, mockRequestSignerFactory);
        }
        PowerMockito.when(InternalBuilderAccess.getSigningStrategyRequestSignerFactories(any()))
                .thenReturn(factories);
    }

    @Test
    public void testCloseWithoutEndpoint() {
        TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        client.close();
    }

    @Test
    public void testCloseCancelsSdkCreatedBreakerTimers() {
        for (CircuitBreaker.State state : timerStates()) {
            HttpClient httpClient = configureHttpClient(null);
            TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
            try {
                client.setEndpoint("https://first.example.com");
                OciCircuitBreaker breaker = Whitebox.getInternalState(client, "circuitBreaker");
                Future<?> timer = startTimer(breaker, state);

                client.close();

                assertTrue(
                        "Closing the client must cancel its " + state + " timer",
                        timer.isCancelled());
                assertEquals(CircuitBreaker.State.DISABLED, breaker.getState());
                verify(httpClient).close();
                // Repeated cleanup must remain safe.
                client.close();
            } finally {
                client.close();
            }
        }
    }

    @Test
    public void testChangingEndpointCancelsOldSdkCreatedBreakerTimers() {
        for (CircuitBreaker.State state : timerStates()) {
            HttpClient oldHttpClient = configureHttpClient(null);
            TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
            try {
                client.setEndpoint("https://first.example.com");
                OciCircuitBreaker oldBreaker = Whitebox.getInternalState(client, "circuitBreaker");
                Future<?> timer = startTimer(oldBreaker, state);
                HttpClient newHttpClient = configureHttpClient(null);

                client.setEndpoint("https://second.example.com");

                assertTrue(
                        "Replacing the endpoint must cancel the old " + state + " timer",
                        timer.isCancelled());
                assertEquals(CircuitBreaker.State.DISABLED, oldBreaker.getState());
                OciCircuitBreaker newBreaker = Whitebox.getInternalState(client, "circuitBreaker");
                assertNotSame(oldBreaker, newBreaker);
                assertEquals(CircuitBreaker.State.CLOSED, newBreaker.getState());
                assertSame(newHttpClient, Whitebox.getInternalState(client, "httpClient"));
                verify(oldHttpClient).close();
                // Disposing the old breaker must not stop the shared scheduler.
                Future<?> newTimer = startTimer(newBreaker, state);
                client.close();
                assertTrue(newTimer.isCancelled());
            } finally {
                client.close();
            }
        }
    }

    @Test
    public void testCallerSuppliedBreakerTimersSurviveCloseAndEndpointChange() {
        for (CircuitBreaker.State state : timerStates()) {
            OciCircuitBreaker suppliedBreaker =
                    CircuitBreakerFactory.build(
                            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
            configureHttpClient(suppliedBreaker);
            TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
            try {
                client.setEndpoint("https://first.example.com");
                Future<?> timer = startTimer(suppliedBreaker, state);

                client.setEndpoint("https://second.example.com");

                assertSame(suppliedBreaker, Whitebox.getInternalState(client, "circuitBreaker"));
                assertFalse(timer.isCancelled());
                assertEquals(state, suppliedBreaker.getState());

                client.close();

                assertFalse(timer.isCancelled());
                assertEquals(state, suppliedBreaker.getState());
            } finally {
                client.close();
                suppliedBreaker.getR4jCircuitBreaker().transitionToDisabledState();
            }
        }
    }

    @Test
    public void testCloseCancelsTimerEvenWhenHttpClientCloseFails() {
        HttpClient httpClient = configureHttpClient(null);
        TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        client.setEndpoint("https://first.example.com");
        OciCircuitBreaker breaker = Whitebox.getInternalState(client, "circuitBreaker");
        Future<?> timer = startTimer(breaker, CircuitBreaker.State.HALF_OPEN);
        IllegalStateException failure = new IllegalStateException("HTTP close failed");
        doThrow(failure).when(httpClient).close();
        try {
            assertSame(failure, assertThrows(IllegalStateException.class, client::close));
            assertTrue(timer.isCancelled());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void testEndpointReplacementFailureStillCancelsOldBreakerTimer() {
        configureHttpClient(null);
        TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        try {
            client.setEndpoint("https://first.example.com");
            OciCircuitBreaker breaker = Whitebox.getInternalState(client, "circuitBreaker");
            Future<?> timer = startTimer(breaker, CircuitBreaker.State.HALF_OPEN);
            HttpClientBuilder failingBuilder = mock(HttpClientBuilder.class, RETURNS_SELF);
            IllegalStateException failure = new IllegalStateException("HTTP build failed");
            when(mockHttpProvider.newBuilder()).thenReturn(failingBuilder);
            when(failingBuilder.build()).thenThrow(failure);

            assertSame(
                    failure,
                    assertThrows(
                            IllegalStateException.class,
                            () -> client.setEndpoint("https://second.example.com")));

            assertTrue(timer.isCancelled());
            assertEquals(CircuitBreaker.State.DISABLED, breaker.getState());
        } finally {
            client.close();
        }
    }

    private HttpClient configureHttpClient(OciCircuitBreaker suppliedBreaker) {
        HttpClient httpClient = mock(HttpClient.class);
        HttpClientBuilder builder = mock(HttpClientBuilder.class, RETURNS_SELF);
        when(mockHttpProvider.newBuilder()).thenReturn(builder);
        when(builder.build()).thenReturn(httpClient);
        PowerMockito.when(InternalBuilderAccess.getConfiguration(any()))
                .thenReturn(ClientConfiguration.builder().circuitBreaker(suppliedBreaker).build());
        return httpClient;
    }

    private static List<CircuitBreaker.State> timerStates() {
        return Arrays.asList(CircuitBreaker.State.OPEN, CircuitBreaker.State.HALF_OPEN);
    }

    private static Future<?> startTimer(OciCircuitBreaker breaker, CircuitBreaker.State state) {
        CircuitBreaker raw = breaker.getR4jCircuitBreaker();
        raw.transitionToOpenState();
        if (state == CircuitBreaker.State.HALF_OPEN) {
            raw.transitionToHalfOpenState();
        }
        // Inspect the scheduled task so cancellation is verified without sleeps or GC timing.
        AtomicReference<?> stateReference = Whitebox.getInternalState(raw, "stateReference");
        Future<?> timer =
                Whitebox.getInternalState(
                        stateReference.get(),
                        state == CircuitBreaker.State.OPEN
                                ? "transitionToHalfOpenFuture"
                                : "transitionToOpenFuture");
        assertFalse("The transition timer should be pending", timer.isDone());
        return timer;
    }

    private static class TestBaseClient extends BaseClient {
        /** Service instance for ObjectStorage. */
        public static final com.oracle.bmc.Service SERVICE =
                com.oracle.bmc.Services.serviceBuilder()
                        .serviceName("TEST")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("https://test.{region}.{secondLevelDomain}")
                        .endpointServiceName("test")
                        .build();

        private TestBaseClient(
                com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider,
                java.util.concurrent.ExecutorService executorService) {
            super(
                    builder,
                    authenticationDetailsProvider,
                    CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
        }

        public static Builder builder() {
            return new Builder(SERVICE);
        }

        public static class Builder
                extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TestBaseClient> {
            private java.util.concurrent.ExecutorService executorService;

            private Builder(com.oracle.bmc.Service service) {
                super(service);
                requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
            }

            /**
             * Set the ExecutorService for the client to be created.
             *
             * @param executorService executorService
             * @return this builder
             */
            public Builder executorService(java.util.concurrent.ExecutorService executorService) {
                this.executorService = executorService;
                return this;
            }

            /**
             * Build the client.
             *
             * @param authenticationDetailsProvider authentication details provider
             * @return the client
             */
            public TestBaseClient build(
                    @jakarta.annotation.Nonnull
                            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                    authenticationDetailsProvider) {
                return new TestBaseClient(this, authenticationDetailsProvider, executorService);
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
}
