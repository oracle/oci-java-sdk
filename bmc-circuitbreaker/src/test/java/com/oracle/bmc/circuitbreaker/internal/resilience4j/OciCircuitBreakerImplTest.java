/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal.resilience4j;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerEventListener;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;

public class OciCircuitBreakerImplTest {
    @Test
    public void listenerReceivesSuccessDurationAndOriginalRecordedError() {
        RecordingListener listener = new RecordingListener();
        OciCircuitBreakerImpl breaker =
                createBreaker(
                        CircuitBreakerConfiguration.builder()
                                .circuitBreakerEventListener(listener)
                                .build());
        RuntimeException failure = new IllegalStateException("recorded failure");

        breaker.onSuccess(1234, TimeUnit.MICROSECONDS);
        breaker.onError(9, TimeUnit.MILLISECONDS, failure);

        assertEquals(Collections.singletonList(Duration.ofNanos(1_234_000)), listener.successes);
        assertEquals(1, listener.errors.size());
        assertSame(failure, listener.errors.get(0));
        assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
    }

    @Test
    public void listenerReceivesThresholdStateDeniedCallAndResetEvents() {
        RecordingListener listener = new RecordingListener();
        OciCircuitBreakerImpl breaker =
                createBreaker(
                        CircuitBreakerConfiguration.builder()
                                .minimumNumberOfCalls(2)
                                .failureRateThreshold(50)
                                .waitDurationInOpenState(Duration.ofSeconds(30))
                                .circuitBreakerEventListener(listener)
                                .build());
        try {
            breaker.onSuccess(1, TimeUnit.MILLISECONDS);
            breaker.onError(2, TimeUnit.MILLISECONDS, new IllegalStateException("failed"));

            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertEquals(1, listener.failureRates.get());
            assertEquals(
                    Collections.singletonList(CircuitBreaker.StateTransition.CLOSED_TO_OPEN),
                    listener.transitions);
            assertFalse(breaker.tryAcquirePermission());
            assertEquals(1, listener.deniedCalls.get());
            assertThrows(CallNotPermittedException.class, breaker::acquirePermission);
            assertEquals(2, listener.deniedCalls.get());

            breaker.getR4jCircuitBreaker().reset();

            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
            assertEquals(1, listener.resets.get());
            assertEquals(
                    Arrays.asList(
                            CircuitBreaker.StateTransition.CLOSED_TO_OPEN,
                            CircuitBreaker.StateTransition.OPEN_TO_CLOSED),
                    listener.transitions);
            assertTrue(breaker.tryAcquirePermission());
            assertEquals(2, listener.deniedCalls.get());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void nullListenerRetainsBreakerBehaviorAndStateBookkeeping() {
        CircuitBreakerConfiguration configuration =
                CircuitBreakerConfiguration.builder()
                        .minimumNumberOfCalls(1)
                        .circuitBreakerEventListener(null)
                        .build();
        OciCircuitBreakerImpl breaker = createBreaker(configuration);
        try {
            long beforeOpening = System.currentTimeMillis();
            breaker.onError(1, TimeUnit.MILLISECONDS, new IllegalStateException("failed"));
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertFalse(breaker.tryAcquirePermission());
            String message = breaker.circuitBreakerCallNotPermittedErrorMessage(null);
            double openSeconds =
                    Double.parseDouble(
                            message.substring(
                                    "CircuitBreaker has been OPEN for ".length(),
                                    message.indexOf(" seconds")));
            assertTrue(openSeconds >= 0);
            assertTrue(openSeconds <= (System.currentTimeMillis() - beforeOpening) / 1000.0);
            breaker.getR4jCircuitBreaker().reset();
            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void rawConstructorKeepsSuppliedBreakerAndItsEventConsumers() {
        CircuitBreaker raw = CircuitBreaker.ofDefaults("raw");
        AtomicInteger successes = new AtomicInteger();
        raw.getEventPublisher().onSuccess(event -> successes.incrementAndGet());
        OciCircuitBreakerImpl breaker = new OciCircuitBreakerImpl(raw, 3);

        breaker.onSuccess(1, TimeUnit.MILLISECONDS);

        assertSame(raw, breaker.getR4jCircuitBreaker());
        assertEquals(1, successes.get());
    }

    @Test
    public void defaultHalfOpenStateRequiresTenSuccessfulProbes() {
        OciCircuitBreakerImpl breaker =
                createBreaker(CircuitBreakerConfiguration.builder().build());
        try {
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            for (int i = 0; i < 10; i++) {
                assertTrue(
                        "The default ten HALF_OPEN probes should be permitted",
                        breaker.tryAcquirePermission());
            }
            assertFalse("An eleventh probe must be rejected", breaker.tryAcquirePermission());

            for (int i = 0; i < 9; i++) {
                breaker.onSuccess(1, TimeUnit.MILLISECONDS);
            }
            assertEquals(CircuitBreaker.State.HALF_OPEN, breaker.getState());
            breaker.onSuccess(1, TimeUnit.MILLISECONDS);
            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void halfOpenWithoutProbesAutomaticallyReopensBreaker() throws InterruptedException {
        RecordingListener listener = new RecordingListener();
        OciCircuitBreakerImpl breaker =
                createBreaker(
                        CircuitBreakerConfiguration.builder()
                                .maxWaitDurationInHalfOpenState(Duration.ofMillis(500))
                                .waitDurationInOpenState(Duration.ofSeconds(30))
                                .circuitBreakerEventListener(listener)
                                .build());
        CountDownLatch reopened = new CountDownLatch(1);
        try {
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onStateTransition(
                            event -> {
                                if (event.getStateTransition()
                                        == CircuitBreaker.StateTransition.HALF_OPEN_TO_OPEN) {
                                    reopened.countDown();
                                }
                            });
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            assertEquals(CircuitBreaker.State.HALF_OPEN, breaker.getState());

            assertTrue(
                    "HALF_OPEN should time out even without submitted probes",
                    reopened.await(5, TimeUnit.SECONDS));
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertEquals(
                    Arrays.asList(
                            CircuitBreaker.StateTransition.CLOSED_TO_OPEN,
                            CircuitBreaker.StateTransition.OPEN_TO_HALF_OPEN,
                            CircuitBreaker.StateTransition.HALF_OPEN_TO_OPEN),
                    listener.transitions);
            assertFalse(breaker.tryAcquirePermission());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void oneOfFourSuccessfulHalfOpenProbesTimesOut() throws InterruptedException {
        OciCircuitBreakerImpl breaker =
                createBreaker(
                        CircuitBreakerConfiguration.builder()
                                .permittedNumberOfCallsInHalfOpenState(4)
                                .maxWaitDurationInHalfOpenState(Duration.ofMillis(500))
                                .waitDurationInOpenState(Duration.ofSeconds(30))
                                .build());
        CountDownLatch reopened = new CountDownLatch(1);
        try {
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onStateTransition(
                            event -> {
                                if (event.getStateTransition()
                                        == CircuitBreaker.StateTransition.HALF_OPEN_TO_OPEN) {
                                    reopened.countDown();
                                }
                            });
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            assertTrue(breaker.tryAcquirePermission());
            breaker.onSuccess(1, TimeUnit.MILLISECONDS);

            assertEquals(CircuitBreaker.State.HALF_OPEN, breaker.getState());
            assertTrue(
                    "One completed probe must not cancel the HALF_OPEN timeout",
                    reopened.await(5, TimeUnit.SECONDS));
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertFalse(breaker.tryAcquirePermission());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void failedHalfOpenProbesStayOpenAfterOriginalTimeout() throws InterruptedException {
        OciCircuitBreakerImpl breaker =
                createBreaker(
                        CircuitBreakerConfiguration.builder()
                                .failureRateThreshold(50)
                                .permittedNumberOfCallsInHalfOpenState(4)
                                .maxWaitDurationInHalfOpenState(Duration.ofSeconds(2))
                                .waitDurationInOpenState(Duration.ofSeconds(30))
                                .build());
        AtomicInteger transitions = new AtomicInteger();
        CountDownLatch unexpectedTransition = new CountDownLatch(1);
        try {
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onStateTransition(
                            event -> {
                                if (transitions.incrementAndGet() > 3) {
                                    unexpectedTransition.countDown();
                                }
                            });
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            long halfOpenDeadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            for (int i = 0; i < 3; i++) {
                assertTrue(breaker.tryAcquirePermission());
                breaker.onError(
                        1, TimeUnit.MILLISECONDS, new IllegalStateException("probe failed"));
            }
            assertEquals(CircuitBreaker.State.HALF_OPEN, breaker.getState());
            assertTrue(breaker.tryAcquirePermission());
            breaker.onSuccess(1, TimeUnit.MILLISECONDS);

            assertTrue(
                    "Completed probes should reopen the breaker before the timeout",
                    System.nanoTime() < halfOpenDeadline);
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertEquals(3, transitions.get());
            // Observe past the original deadline to catch stale timeout-driven transitions.
            assertFalse(unexpectedTransition.await(2500, TimeUnit.MILLISECONDS));
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertEquals(3, transitions.get());
            assertFalse(breaker.tryAcquirePermission());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void successfulHalfOpenProbeStaysClosedAfterTimeout() throws InterruptedException {
        CircuitBreakerConfiguration configuration =
                CircuitBreakerConfiguration.builder()
                        .permittedNumberOfCallsInHalfOpenState(1)
                        .maxWaitDurationInHalfOpenState(Duration.ofMillis(500))
                        .waitDurationInOpenState(Duration.ofSeconds(30))
                        .build();
        OciCircuitBreakerImpl breaker = createBreaker(configuration);
        CountDownLatch reopened = new CountDownLatch(1);

        try {
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onStateTransition(
                            event -> {
                                if (event.getStateTransition()
                                        == CircuitBreaker.StateTransition.HALF_OPEN_TO_OPEN) {
                                    reopened.countDown();
                                }
                            });
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            assertTrue("The HALF_OPEN probe should be permitted", breaker.tryAcquirePermission());
            breaker.onSuccess(1, TimeUnit.MILLISECONDS);

            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
            assertFalse(
                    "The completed probe's timeout must not reopen the breaker",
                    reopened.await(1, TimeUnit.SECONDS));
            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void incompleteHalfOpenProbeAutomaticallyReopensBreaker() throws InterruptedException {
        CircuitBreakerConfiguration configuration =
                CircuitBreakerConfiguration.builder()
                        .maxWaitDurationInHalfOpenState(Duration.ofMillis(500))
                        .waitDurationInOpenState(Duration.ofSeconds(30))
                        .build();
        OciCircuitBreakerImpl breaker = createBreaker(configuration);
        CountDownLatch reopened = new CountDownLatch(1);

        try {
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onStateTransition(
                            event -> {
                                if (event.getStateTransition()
                                        == CircuitBreaker.StateTransition.HALF_OPEN_TO_OPEN) {
                                    reopened.countDown();
                                }
                            });
            breaker.getR4jCircuitBreaker().transitionToOpenState();
            breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
            assertTrue("The HALF_OPEN probe should be permitted", breaker.tryAcquirePermission());

            assertTrue("The incomplete probe should time out", reopened.await(5, TimeUnit.SECONDS));
            assertEquals(CircuitBreaker.State.OPEN, breaker.getState());
            assertFalse(
                    "The reopened breaker should deny permission", breaker.tryAcquirePermission());
        } finally {
            breaker.getR4jCircuitBreaker().transitionToDisabledState();
        }
    }

    @Test
    public void customHalfOpenWaitDurationIsPropagatedToResilience4j() {
        Duration customDuration = Duration.ofSeconds(47);
        CircuitBreakerConfiguration configuration =
                CircuitBreakerConfiguration.builder()
                        .maxWaitDurationInHalfOpenState(customDuration)
                        .build();

        OciCircuitBreakerImpl breaker = createBreaker(configuration);

        assertEquals(
                customDuration,
                breaker.getR4jCircuitBreaker()
                        .getCircuitBreakerConfig()
                        .getMaxWaitDurationInHalfOpenState());
    }

    @Test
    public void defaultHalfOpenWaitDurationIsThirtySeconds() {
        OciCircuitBreakerImpl breaker =
                createBreaker(CircuitBreakerConfiguration.builder().build());

        assertEquals(
                Duration.ofSeconds(30),
                breaker.getR4jCircuitBreaker()
                        .getCircuitBreakerConfig()
                        .getMaxWaitDurationInHalfOpenState());
    }

    @Test
    public void halfOpenWaitDurationIsValidatedWhenBreakerIsCreated() {
        CircuitBreakerConfiguration minimumConfiguration =
                CircuitBreakerConfiguration.builder()
                        .maxWaitDurationInHalfOpenState(Duration.ofMillis(1))
                        .build();
        OciCircuitBreakerImpl breaker = createBreaker(minimumConfiguration);

        assertEquals(
                Duration.ofMillis(1),
                breaker.getR4jCircuitBreaker()
                        .getCircuitBreakerConfig()
                        .getMaxWaitDurationInHalfOpenState());

        CircuitBreakerConfiguration nullConfiguration =
                CircuitBreakerConfiguration.builder().maxWaitDurationInHalfOpenState(null).build();
        assertNull(nullConfiguration.getMaxWaitDurationInHalfOpenState());
        assertThrows(NullPointerException.class, () -> createBreaker(nullConfiguration));
        assertInvalidHalfOpenWaitDuration(Duration.ZERO);
        assertInvalidHalfOpenWaitDuration(Duration.ofMillis(-1));
        assertInvalidHalfOpenWaitDuration(Duration.ofNanos(999_999));
    }

    private static void assertInvalidHalfOpenWaitDuration(Duration duration) {
        CircuitBreakerConfiguration configuration =
                CircuitBreakerConfiguration.builder()
                        .maxWaitDurationInHalfOpenState(duration)
                        .build();

        assertEquals(duration, configuration.getMaxWaitDurationInHalfOpenState());
        assertThrows(IllegalArgumentException.class, () -> createBreaker(configuration));
    }

    private static OciCircuitBreakerImpl createBreaker(CircuitBreakerConfiguration configuration) {
        return new OciCircuitBreakerImpl(configuration, throwable -> true);
    }

    private static final class RecordingListener implements CircuitBreakerEventListener {
        private final List<Duration> successes = new CopyOnWriteArrayList<>();
        private final List<Throwable> errors = new CopyOnWriteArrayList<>();
        private final List<CircuitBreaker.StateTransition> transitions =
                new CopyOnWriteArrayList<>();
        private final AtomicInteger deniedCalls = new AtomicInteger();
        private final AtomicInteger resets = new AtomicInteger();
        private final AtomicInteger failureRates = new AtomicInteger();

        @Override
        public void onSuccess(Duration duration) {
            successes.add(duration);
        }

        @Override
        public void onError(Throwable throwable) {
            errors.add(throwable);
        }

        @Override
        public void onStateTransition(CircuitBreaker.StateTransition transition) {
            transitions.add(transition);
        }

        @Override
        public void onReset() {
            resets.incrementAndGet();
        }

        @Override
        public void onCallNotPermitted() {
            deniedCalls.incrementAndGet();
        }

        @Override
        public void onFailureRateExceeded() {
            failureRates.incrementAndGet();
        }
    }
}
