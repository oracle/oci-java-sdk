/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.model.BmcException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Tests that reproduce scenarios where ClientCall creates a transient HttpRequest but does not
 * execute it, and verifies that every created HttpRequest instance is either executed exactly once
 * or discarded exactly once.
 */
public class ClientCallTransientRequestLeakTest {

    private static final Logger LOG =
            LoggerFactory.getLogger(ClientCallTransientRequestLeakTest.class);

    private Supplier<ClientCallTest.TestResponse.Builder> responseBuilder() {
        return ClientCallTest.TestResponse::builder;
    }

    @Test
    public void requestsExecutedOrDiscarded_whenInvocationCallbackThrows() throws Exception {
        HttpClient mockClient = mock(HttpClient.class);
        List<HttpRequest> requests = new ArrayList<>();

        HttpRequest main = mock(HttpRequest.class);
        requests.add(main);

        when(mockClient.createRequest(any())).thenReturn(main);
        when(main.offloadExecutor(any())).thenReturn(main);
        when(main.copy())
                .thenAnswer(
                        inv -> {
                            HttpRequest copy = mock(HttpRequest.class);
                            when(copy.headers()).thenReturn(new HashMap<>());
                            requests.add(copy);
                            return copy;
                        });
        when(main.uri()).thenReturn(new URI("https://localhost"));

        // Build a request with an invocation callback that throws
        ClientCallTest.TestRequest req =
                ClientCallTest.TestRequest.builder()
                        .invocationCallback(
                                r -> {
                                    throw new RuntimeException("boom");
                                })
                        .build();

        try {
            ClientCall.builder(mockClient, req, responseBuilder())
                    .logger(LOG, "mockLogger")
                    .method(Method.GET)
                    .callSync();
            fail("Expected to throw");
        } catch (Exception ignored) {
            // expected - ensure we can continue to verify interactions
        }

        // Assert for every created request: exactly one of execute() or discard() was called once.
        assertAllRequestsExecutedOrDiscardedExactlyOnce(requests);
    }

    @Test
    public void requestsExecutedOrDiscarded_whenCircuitBreakerOpen_skipsExecution()
            throws Exception {
        HttpClient mockClient = mock(HttpClient.class);
        List<HttpRequest> requests = new ArrayList<>();

        HttpRequest main = mock(HttpRequest.class);
        requests.add(main);

        when(mockClient.createRequest(any())).thenReturn(main);
        when(main.offloadExecutor(any())).thenReturn(main);
        when(main.copy())
                .thenAnswer(
                        inv -> {
                            HttpRequest copy = mock(HttpRequest.class);
                            when(copy.headers()).thenReturn(new HashMap<>());
                            requests.add(copy);
                            return copy;
                        });
        when(main.uri()).thenReturn(new URI("https://localhost"));

        // Use the real circuit breaker impl and force it OPEN
        OciCircuitBreaker openCb =
                new OciCircuitBreakerImpl(new CircuitBreakerConfiguration(), t -> true);
        ((OciCircuitBreakerImpl) openCb).getR4jCircuitBreaker().transitionToOpenState();

        ClientCallTest.TestRequest req = ClientCallTest.TestRequest.builder().build();

        try {
            ClientCall.builder(mockClient, req, responseBuilder())
                    .circuitBreaker(openCb)
                    .logger(LOG, "mockLogger")
                    .method(Method.GET)
                    .callSync();
            fail("Expected to throw");
        } catch (BmcException ignored) {
            // expected
        }

        assertAllRequestsExecutedOrDiscardedExactlyOnce(requests);
    }

    @Test
    public void requestsExecutedOrDiscarded_whenCircuitBreakerOpen_withDefaultRetries()
            throws Exception {
        HttpClient mockClient = mock(HttpClient.class);
        List<HttpRequest> requests = new ArrayList<>();

        HttpRequest main = mock(HttpRequest.class);
        requests.add(main);

        when(mockClient.createRequest(any())).thenReturn(main);
        when(main.offloadExecutor(any())).thenReturn(main);
        when(main.copy())
                .thenAnswer(
                        inv -> {
                            HttpRequest copy = mock(HttpRequest.class);
                            when(copy.headers()).thenReturn(new HashMap<>());
                            requests.add(copy);
                            return copy;
                        });
        when(main.uri()).thenReturn(new URI("https://localhost"));

        // Use the real circuit breaker impl and force it OPEN
        OciCircuitBreaker openCb =
                new OciCircuitBreakerImpl(new CircuitBreakerConfiguration(), t -> true);
        ((OciCircuitBreakerImpl) openCb).getR4jCircuitBreaker().transitionToOpenState();

        ClientCallTest.TestRequest req = ClientCallTest.TestRequest.builder().build();

        try {
            ClientCall.builder(mockClient, req, responseBuilder())
                    .circuitBreaker(openCb)
                    .logger(LOG, "mockLogger")
                    .operationUsesDefaultRetries()
                    .method(Method.GET)
                    .callSync();
            fail("Expected to throw");
        } catch (BmcException ignored) {
            // expected
        }

        assertAllRequestsExecutedOrDiscardedExactlyOnce(requests);
    }

    private static void assertAllRequestsExecutedOrDiscardedExactlyOnce(
            List<HttpRequest> requests) {
        for (HttpRequest r : requests) {
            // No more than once for either method
            verify(r, atMost(1)).execute();
            verify(r, atMost(1)).discard();

            boolean executedOnce = wasCalledExactlyOnce(() -> verify(r, times(1)).execute());
            boolean discardedOnce = wasCalledExactlyOnce(() -> verify(r, times(1)).discard());

            // Exactly one of them must have been called once
            if (!(executedOnce ^ discardedOnce)) {
                fail("Each HttpRequest must be executed once OR discarded once (exclusively).");
            }
        }
    }

    private static boolean wasCalledExactlyOnce(Runnable verifier) {
        try {
            verifier.run();
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }
}
