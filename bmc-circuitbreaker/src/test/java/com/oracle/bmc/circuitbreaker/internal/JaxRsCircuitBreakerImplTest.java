/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerState;
import com.oracle.bmc.circuitbreaker.CircuitBreakerEventListener;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

public class JaxRsCircuitBreakerImplTest {

    private JaxRsCircuitBreakerImpl circuitBreaker;

    private Invocation invocation503;
    private Invocation invocation200;
    private Invocation invocation409;

    private Invocation invocationUnavailable;
    private Invocation invocationClientError;

    @SuppressWarnings("unchecked")
    Future<Response> responseFuture200 = (Future<Response>) mock(Future.class);

    @SuppressWarnings("unchecked")
    Future<Response> responseFuture503 = (Future<Response>) mock(Future.class);

    @SuppressWarnings("unchecked")
    Future<Response> responseFutureUnavailable = (Future<Response>) mock(Future.class);

    @SuppressWarnings("unchecked")
    Future<Response> responseFuture409 = (Future<Response>) mock(Future.class);

    private final int MIN_NUM_CALLS = 4;
    private final int SLIDING_WINDOW_SIZE = 40;

    private CircuitBreakerEventListener eventListener;
    private CircuitBreakerConfiguration circuitBreakerConfiguration;

    @Before
    public void setup() throws ExecutionException, InterruptedException {

        eventListener = mock(CircuitBreakerEventListener.class);

        circuitBreakerConfiguration =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .permittedNumberOfCallsInHalfOpenState(4)
                        .slidingWindowSize(SLIDING_WINDOW_SIZE)
                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .circuitBreakerEventListener(eventListener)
                        .build();

        circuitBreaker = new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);

        Response response503 = mock(Response.class);
        Mockito.when(response503.getStatus()).thenReturn(503);
        Mockito.when(response503.getStatusInfo()).thenReturn(Response.Status.BAD_GATEWAY);
        invocation503 = mock(Invocation.class);
        Mockito.when(invocation503.invoke()).thenReturn(response503);
        Mockito.when(responseFuture503.get()).thenReturn(response503);

        Response response200 = mock(Response.class);
        Mockito.when(response200.getStatus()).thenReturn(200);
        Mockito.when(response200.getStatusInfo()).thenReturn(Response.Status.OK);
        invocation200 = mock(Invocation.class);
        Mockito.when(invocation200.invoke()).thenReturn(response200);
        Mockito.when(responseFuture200.get()).thenReturn(response200);

        invocationUnavailable = mock(Invocation.class);
        Mockito.when(invocationUnavailable.invoke()).thenThrow(new ServiceUnavailableException());
        invocationClientError = mock(Invocation.class);
        Mockito.when(invocationClientError.invoke())
                .thenThrow(new ClientErrorException(Response.Status.NOT_ACCEPTABLE));

        Mockito.when(responseFuture200.get()).thenReturn(response200);
        Mockito.when(responseFuture503.get()).thenReturn(response503);
        Mockito.when(responseFutureUnavailable.get()).thenThrow(new ServiceUnavailableException());

        Response response409 = mock(Response.class);
        Mockito.when(response409.getStatus()).thenReturn(409);
        Mockito.when(response409.getStatusInfo()).thenReturn(buildIncorrectStateResponse());
        invocation409 = mock(Invocation.class);
        Mockito.when(invocation409.invoke()).thenReturn(response409);
        Mockito.when(responseFuture409.get()).thenReturn(response409);
    }

    @Test
    public void validateCircuitBreakerOpensTheCircuitWhenFailsWithSupplier() {
        int callCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                Response response = clientCall.get();
                assertEquals(response.getStatus(), 503);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void
            validateCircuitBreakerOpensTheCircuitWhenFailsWithSupplierForIncorrectStateResponse() {
        int callCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation409::invoke);
            try {
                Response response = clientCall.get();
                assertEquals(response.getStatus(), 409);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerOpensTheCircuitWhenFailsWithFunction() {
        int callCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Function<Invocation, Response> clientCall =
                    circuitBreaker.decorateFunction(Invocation::invoke);
            try {
                Response response = clientCall.apply(invocation503);
                assertEquals(response.getStatus(), 503);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void
            validateDefaultCircuitBreakerOpensTheCircuitWhenFailsWithFunctionForIncorrectStateResponse() {
        int callCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Function<Invocation, Response> clientCall =
                    circuitBreaker.decorateFunction(Invocation::invoke);
            try {
                Response response = clientCall.apply(invocation409);
                assertEquals(response.getStatus(), 409);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerKeepsTheCircuitClosedWithSuccess() {
        int callCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation200::invoke);
            try {
                Response response = clientCall.get();
                assertEquals(response.getStatus(), 200);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.CLOSED, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.CLOSED, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerKeepsTheCircuitClosedWithLowFailureRate() {
        int callCount = 0;

        for (int i = 0; i < SLIDING_WINDOW_SIZE; i++) {
            Function<Invocation, Response> clientCall =
                    circuitBreaker.decorateFunction(Invocation::invoke);
            try {
                Response response = clientCall.apply(invocation200);
                assertEquals(response.getStatus(), 200);
                callCount++;

                response = clientCall.apply(invocation200);
                assertEquals(response.getStatus(), 200);
                callCount++;

                response = clientCall.apply(invocation503);
                assertEquals(response.getStatus(), 503);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertEquals(SLIDING_WINDOW_SIZE * 3, callCount);
        assertEquals(
                CircuitBreaker.State.CLOSED, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.CLOSED, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerOpensTheCircuitWithHighFailureRate() {
        int callCount = 0;

        for (int i = 0; i < SLIDING_WINDOW_SIZE; i++) {
            Function<Invocation, Response> clientCall =
                    circuitBreaker.decorateFunction(Invocation::invoke);
            try {
                Response response = clientCall.apply(invocation200);
                assertEquals(response.getStatus(), 200);
                callCount++;

                response = clientCall.apply(invocation200);
                assertEquals(response.getStatus(), 200);
                callCount++;

                response = clientCall.apply(invocation503);
                assertEquals(response.getStatus(), 503);
                callCount++;

                response = clientCall.apply(invocation503);
                assertEquals(response.getStatus(), 503);
                callCount++;

                response = clientCall.apply(invocation200);
                assertEquals(response.getStatus(), 200);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(SLIDING_WINDOW_SIZE * 3 > callCount);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerOpensTheCircuitWhenServiceUnavailableExceptionIsThrown() {
        int callCount = 0;
        int unavailableCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall =
                    circuitBreaker.decorateSupplier(invocationUnavailable::invoke);
            try {
                callCount++;
                clientCall.get();
            } catch (CallNotAllowedException e) {
                break;
            } catch (ServiceUnavailableException e) {
                unavailableCount++;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertTrue(unavailableCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerKeepsTheCircuitClosedWhenClientErrorExceptionIsThrown() {
        int callCount = 0;
        int unavailableCount = 0;

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall =
                    circuitBreaker.decorateSupplier(invocationClientError::invoke);
            try {
                callCount++;
                clientCall.get();
            } catch (CallNotAllowedException e) {
                break;
            } catch (ClientErrorException e) {
                unavailableCount++;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertTrue(unavailableCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.CLOSED, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.CLOSED, circuitBreaker.getState());
    }

    @Test
    public void validateCircuitBreakerOpensTheCircuitWhenFailsAsync()
            throws ExecutionException, InterruptedException {

        List<Future<Response>> futures = new ArrayList<>();
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Future<Response>> clientCall =
                    circuitBreaker.decorateFuture(
                            () -> {
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    throw new RuntimeException(e);
                                }
                                return responseFuture503;
                            });
            Future<Response> responseFuture = clientCall.get();
            futures.add(responseFuture);
        }

        int callCount = 0;
        for (Future<Response> responseFuture : futures) {
            try {
                Response response = responseFuture.get();
                assertEquals(response.getStatus(), 503);
                callCount++;
            } catch (CallNotAllowedException ex) {
                System.out.println("ex");
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());

        //verify BmcCallNotPermittedException is thrown
        Supplier<Future<Response>> clientCall =
                circuitBreaker.decorateFuture(
                        () -> {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                throw new RuntimeException(e);
                            }
                            return responseFuture503;
                        });
        Future<Response> responseFuture = clientCall.get();
        try {
            responseFuture.get();
            fail("CallNotAllowedException is expected");
        } catch (CallNotAllowedException e) {
            assertEquals(e.getClass(), CallNotAllowedException.class);
        }
    }

    @Test
    public void validateCircuitBreakerKeepsTheCircuitClosedWithSuccessAsync()
            throws ExecutionException, InterruptedException {

        List<Future<Response>> futures = new ArrayList<>();
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Future<Response>> clientCall =
                    circuitBreaker.decorateFuture(
                            () -> {
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    throw new RuntimeException(e);
                                }
                                return responseFuture200;
                            });
            Future<Response> responseFuture = clientCall.get();
            futures.add(responseFuture);
        }

        int callCount = 0;
        for (Future<Response> responseFuture : futures) {
            try {
                Response response = responseFuture.get();
                assertEquals(response.getStatus(), 200);
                callCount++;
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.CLOSED, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.CLOSED, circuitBreaker.getState());
    }

    @Test
    public void
            validateCircuitBreakerOpensTheCircuitWhenServiceUnavailableExceptionIsThrownAsync() {

        List<Future<Response>> futures = new ArrayList<>();
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Future<Response>> clientCall =
                    circuitBreaker.decorateFuture(
                            () -> {
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    throw new RuntimeException(e);
                                }
                                return responseFutureUnavailable;
                            });
            Future<Response> responseFuture = clientCall.get();
            futures.add(responseFuture);
        }

        int callCount = 0;
        int unavailableCount = 0;

        for (Future<Response> responseFuture : futures) {
            try {
                callCount++;
                Response response = responseFuture.get();
                System.out.println(response.getStatus());
            } catch (CallNotAllowedException e) {
                break;
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } catch (ServiceUnavailableException e) {
                unavailableCount++;
            }
        }
        assertTrue(callCount >= MIN_NUM_CALLS);
        assertTrue(unavailableCount >= MIN_NUM_CALLS);
        assertEquals(
                CircuitBreaker.State.OPEN, circuitBreaker.getInternalCircuitBreaker().getState());
        assertEquals(CircuitBreakerState.OPEN, circuitBreaker.getState());
    }

    @Test
    public void testCircuitBreakerEventListenerOnSuccess() {

        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
        Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation200::invoke);
        clientCall.get();
        verify(eventListener, times(1)).onSuccess(any());
    }

    @Test
    public void testCircuitBreakerEventListenerOnError() {
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
        Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
        clientCall.get();
        verify(eventListener, times(1)).onError(any());
    }

    @Test
    public void testCircuitBreakerEventListenerOnStateTransition() {
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                clientCall.get();
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        verify(eventListener, atLeastOnce()).onStateTransition(any());
    }

    @Test
    public void testCircuitBreakerEventListenerOnCallNotPermitted() {
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                clientCall.get();
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
        try {
            clientCall.get();
            fail("CallNotAllowedException is expected");
        } catch (CallNotAllowedException e) {
            verify(eventListener, atLeastOnce()).onCallNotPermitted();
        }
    }

    @Test
    public void testCircuitBreakerEventListenerOnFailureRateExceeded() {
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                clientCall.get();
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        verify(eventListener, atLeastOnce()).onFailureRateExceeded();
    }

    @Test
    public void testAutomaticTransitionToHalfOpenState() throws InterruptedException {
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(
                        CircuitBreakerConfiguration.builder()
                                .failureRateThreshold(50)
                                .permittedNumberOfCallsInHalfOpenState(4)
                                .slidingWindowSize(SLIDING_WINDOW_SIZE)
                                .minimumNumberOfCalls(MIN_NUM_CALLS)
                                .waitDurationInOpenState(Duration.ofSeconds(2))
                                .circuitBreakerEventListener(eventListener)
                                .build());

        openCircuitBreaker(circuitBreaker);

        assertEquals(
                com.oracle.bmc.circuitbreaker.CircuitBreakerState.OPEN, circuitBreaker.getState());
        assertEventuallyState(
                circuitBreaker,
                com.oracle.bmc.circuitbreaker.CircuitBreakerState.HALF_OPEN,
                Duration.ofSeconds(5));
    }

    @Test
    public void testMaxWaitDurationInHalfOpenState() throws InterruptedException {
        Duration maxWaitDurationInHalfOpenState = Duration.ofSeconds(1);
        JaxRsCircuitBreakerImpl circuitBreaker =
                new JaxRsCircuitBreakerImpl(
                        CircuitBreakerConfiguration.builder()
                                .failureRateThreshold(50)
                                .permittedNumberOfCallsInHalfOpenState(4)
                                .slidingWindowSize(SLIDING_WINDOW_SIZE)
                                .minimumNumberOfCalls(MIN_NUM_CALLS)
                                .waitDurationInOpenState(Duration.ofSeconds(2))
                                .circuitBreakerEventListener(eventListener)
                                .maxWaitDurationInHalfOpenState(maxWaitDurationInHalfOpenState)
                                .build());

        circuitBreaker.getInternalCircuitBreaker().transitionToOpenState();
        circuitBreaker.getInternalCircuitBreaker().transitionToHalfOpenState();

        assertEquals(
                com.oracle.bmc.circuitbreaker.CircuitBreakerState.HALF_OPEN,
                circuitBreaker.getState());

        Response response = circuitBreaker.decorateSupplier(invocation200::invoke).get();
        assertEquals(200, response.getStatus());
        assertEquals(
                com.oracle.bmc.circuitbreaker.CircuitBreakerState.HALF_OPEN,
                circuitBreaker.getState());

        assertEventuallyState(
                circuitBreaker,
                com.oracle.bmc.circuitbreaker.CircuitBreakerState.OPEN,
                maxWaitDurationInHalfOpenState.plusSeconds(2));
    }

    private void openCircuitBreaker(JaxRsCircuitBreakerImpl circuitBreaker) {
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                clientCall.get();
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
    }

    private void assertEventuallyState(
            JaxRsCircuitBreakerImpl circuitBreaker,
            com.oracle.bmc.circuitbreaker.CircuitBreakerState expectedState,
            Duration timeout)
            throws InterruptedException {
        long deadline = System.nanoTime() + timeout.toNanos();
        while (System.nanoTime() < deadline) {
            if (circuitBreaker.getState() == expectedState) {
                return;
            }
            Thread.sleep(25);
        }
        assertEquals(expectedState, circuitBreaker.getState());
    }

    @Test
    public void testCircuitBreakerEventListenerOnNull() {
        CircuitBreakerConfiguration config =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .permittedNumberOfCallsInHalfOpenState(4)
                        .slidingWindowSize(SLIDING_WINDOW_SIZE)
                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .circuitBreakerEventListener(null)
                        .build();
        JaxRsCircuitBreakerImpl circuitBreaker = new JaxRsCircuitBreakerImpl(config);
        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            Supplier<Response> clientCall = circuitBreaker.decorateSupplier(invocation503::invoke);
            try {
                clientCall.get();
            } catch (CallNotAllowedException ex) {
                break;
            }
        }
        verify(eventListener, never()).onFailureRateExceeded();
    }

    private static Response.StatusType buildIncorrectStateResponse() {
        return new Response.StatusType() {
            @Override
            public int getStatusCode() {
                return 409;
            }

            @Override
            public String getReasonPhrase() {
                return "IncorrectState";
            }

            @Override
            public Response.Status.Family getFamily() {
                return null;
            }
        };
    }
}
