/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerOpenEvent;
import com.oracle.bmc.circuitbreaker.CircuitBreakerOpenEvent.FailureCategory;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.retrier.RetryConfiguration;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.internal.CircuitBreakerStateMachine;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.net.URI;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.net.ssl.SSLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class JavaCircuitBreakerDiagnosticsTest {
    private String previousSummaryProperty;

    @Before
    public void enableSummaryPrinting() {
        previousSummaryProperty =
                System.getProperty(CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY);
        System.setProperty(CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY, "true");
    }

    @After
    public void restoreSummaryPrintingProperty() {
        if (previousSummaryProperty == null) {
            System.clearProperty(CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY);
        } else {
            System.setProperty(
                    CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY,
                    previousSummaryProperty);
        }
    }

    @Test
    public void summaryPrintingIsDisabledByDefaultAndPreservesHistory() {
        assertSummaryPrintingPreservesSnapshotAndHistory(null, false);
    }

    @Test
    public void summaryPrintingIsDisabledWhenFalseAndPreservesHistory() {
        assertSummaryPrintingPreservesSnapshotAndHistory("false", false);
    }

    @Test
    public void summaryPrintingIsEnabledWhenTrueAndPreservesHistory() {
        assertSummaryPrintingPreservesSnapshotAndHistory("true", true);
    }

    private void assertSummaryPrintingPreservesSnapshotAndHistory(String setting, boolean enabled) {
        if (setting == null) {
            System.clearProperty(CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY);
        } else {
            System.setProperty(
                    CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY, setting);
        }
        OciCircuitBreaker breaker = breaker(1, 2);
        failWith(breaker, http(503));
        CircuitBreakerOpenEvent event = breaker.getOpenEvent();
        assertNotNull(event);
        assertEquals(1, event.getFailedCalls());
        assertFalse(breaker.tryAcquirePermission());
        CallNotAllowedException rejection = breaker.createCallNotAllowedException();
        assertSame(event, rejection.getOpenEvent());
        assertFalse(rejection.getMessage().contains("Diagnostic summary"));
        for (String message :
                new String[] {
                    breaker.circuitBreakerCallNotPermittedErrorMessage(null, rejection),
                    breaker.circuitBreakerCallNotPermittedErrorMessage(null)
                }) {
            assertEquals(enabled, message.contains("Diagnostic summary"));
            assertEquals(enabled ? 1 : 0, occurrences(message, event.toString()));
            assertTrue(message.contains("CircuitBreaker has been OPEN"));
            assertTrue(message.contains("Recent failure history since last close:\n"));
            assertTrue(message.contains(breaker.getHistoryAsString()));
        }
        assertEquals(1, breaker.getHistory().size());
    }

    private OciCircuitBreaker breaker(int minimumCalls, int historyLimit) {
        HttpClient client = mock(HttpClient.class);
        when(client.isProcessingException(any()))
                .thenAnswer(invocation -> !(invocation.getArgument(0) instanceof BmcException));
        return CircuitBreakerHelper.makeCircuitBreaker(
                client,
                CircuitBreakerConfiguration.builder()
                        .minimumNumberOfCalls(minimumCalls)
                        .failureRateThreshold(60)
                        .permittedNumberOfCallsInHalfOpenState(1)
                        .numberOfRecordedHistoryResponses(historyLimit)
                        .waitDurationInOpenState(Duration.ofHours(1))
                        .build());
    }

    private void failWith(OciCircuitBreaker breaker, Throwable error) {
        assertTrue(breaker.tryAcquirePermission());
        Integer status =
                error instanceof BmcException ? ((BmcException) error).getStatusCode() : null;
        breaker.addToHistory(error, status, Collections.singletonMap("message", "failure"));
        breaker.onError(1, TimeUnit.MILLISECONDS, error);
    }

    private void succeed(OciCircuitBreaker breaker) {
        assertTrue(breaker.tryAcquirePermission());
        breaker.onSuccess(1, TimeUnit.MILLISECONDS);
    }

    private BmcException http(int status) {
        return new BmcException(status, "ServiceError", "failure", "request-id");
    }

    @Test
    public void existingConstructorsClassifyHttpFailuresWithoutHistoryOrStatusExtractor() {
        OciCircuitBreaker[] breakers = {
            new OciCircuitBreakerImpl(
                    CircuitBreakerConfiguration.builder()
                            .minimumNumberOfCalls(2)
                            .numberOfRecordedHistoryResponses(0)
                            .build(),
                    error -> true),
            new OciCircuitBreakerImpl(
                    CircuitBreaker.of(
                            "direct",
                            CircuitBreakerConfig.custom().minimumNumberOfCalls(2).build()),
                    0)
        };
        for (OciCircuitBreaker breaker : breakers) {
            // Exercise the existing onError API directly, without feeding status through history.
            breaker.acquirePermission();
            breaker.onError(1, TimeUnit.MILLISECONDS, http(500));
            breaker.acquirePermission();
            breaker.onError(1, TimeUnit.MILLISECONDS, new RuntimeException(http(429)));
            CircuitBreakerOpenEvent event = breaker.getOpenEvent();
            assertNotNull(event);
            assertEquals(
                    Collections.singletonMap(FailureCategory.REMOTE_HTTP, 2L),
                    event.getFailureCounts());
            Map<Integer, Long> expected = new HashMap<>();
            expected.put(500, 1L);
            expected.put(429, 1L);
            assertEquals(expected, event.getHttpStatusCounts());
            assertEquals(2, event.getFailedCalls());
            breaker.addToHistory(http(503), 503, Collections.emptyMap());
            assertTrue(breaker.getHistory().isEmpty());
            assertTrue(
                    breaker.circuitBreakerCallNotPermittedErrorMessage(null)
                            .contains("Diagnostic summary for this opening:\n" + event));
        }
    }

    @Test
    public void clientSideBmcExceptionUsesUnderlyingFailureCategory() {
        OciCircuitBreaker breaker =
                new OciCircuitBreakerImpl(
                        CircuitBreakerConfiguration.builder().minimumNumberOfCalls(1).build(),
                        error -> true);
        breaker.acquirePermission();
        breaker.onError(
                1,
                TimeUnit.MILLISECONDS,
                new BmcException(false, "DNS failure", new UnknownHostException(), null));
        assertEquals(
                Collections.singletonMap(FailureCategory.DNS, 1L),
                breaker.getOpenEvent().getFailureCounts());
        assertTrue(breaker.getOpenEvent().getHttpStatusCounts().isEmpty());
    }

    @Test
    public void mixedFailuresProduceCompleteOpeningSnapshotAndRejectionSummary() {
        OciCircuitBreaker breaker = breaker(10, 10);
        for (int i = 0; i < 3; i++) succeed(breaker);
        failWith(breaker, http(500));
        failWith(breaker, http(429));
        failWith(breaker, new RuntimeException(new UnknownHostException()));
        failWith(breaker, new RuntimeException(new ConnectException()));
        failWith(breaker, new RuntimeException(new SSLException("")));
        failWith(breaker, new RuntimeException(new InterruptedIOException()));
        assertNull(breaker.getOpenEvent());
        failWith(breaker, new IllegalStateException());
        CircuitBreakerOpenEvent event = breaker.getOpenEvent();
        assertNotNull(event);
        assertEquals("CLOSED", event.getPreviousState());
        assertEquals("OPEN", event.getState());
        assertEquals(10, event.getTotalCalls());
        assertEquals(7, event.getFailedCalls());
        Map<FailureCategory, Long> categories = new EnumMap<>(FailureCategory.class);
        for (FailureCategory category : FailureCategory.values()) categories.put(category, 1L);
        categories.put(FailureCategory.REMOTE_HTTP, 2L);
        assertEquals(categories, event.getFailureCounts());
        Map<Integer, Long> statuses = new HashMap<>();
        statuses.put(500, 1L);
        statuses.put(429, 1L);
        assertEquals(statuses, event.getHttpStatusCounts());
        for (int i = 0; i < 2; i++) {
            assertFalse(breaker.tryAcquirePermission());
            CallNotAllowedException rejection = breaker.createCallNotAllowedException();
            assertSame(event, rejection.getOpenEvent());
            assertEquals(event.getCorrelationId(), rejection.getCorrelationId());
            assertFalse(rejection.getMessage().contains("Diagnostic summary"));
            String message = breaker.circuitBreakerCallNotPermittedErrorMessage(null, rejection);
            assertTrue(message.contains("ObservedFailures - 7"));
            assertTrue(message.contains("HttpStatusCounts - {429=1, 500=1}"));
            assertTrue(
                    message.indexOf("Diagnostic summary")
                            < message.indexOf("Recent failure history since last close:"));
        }
    }

    @Test
    public void reopeningCountsOnlyHalfOpenProbesAndCloseClearsHistory() {
        OciCircuitBreaker breaker = breaker(2, 5);
        failWith(breaker, http(500));
        failWith(breaker, http(429));
        CircuitBreakerOpenEvent first = breaker.getOpenEvent();
        breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
        failWith(breaker, http(503));
        CircuitBreakerOpenEvent second = breaker.getOpenEvent();
        assertEquals("HALF_OPEN", second.getPreviousState());
        assertEquals(1, second.getTotalCalls());
        assertEquals(1, second.getFailedCalls());
        assertEquals(
                Collections.singletonMap(FailureCategory.REMOTE_HTTP, 1L),
                second.getFailureCounts());
        assertEquals(Collections.singletonMap(503, 1L), second.getHttpStatusCounts());
        assertNotEquals(first.getCorrelationId(), second.getCorrelationId());
        assertEquals(3, breaker.getHistory().size());
        breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
        succeed(breaker);
        assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
        assertNull(breaker.getOpenEvent());
        assertTrue(breaker.getHistory().isEmpty());
        failWith(breaker, http(500));
        assertFalse(breaker.getHistory().isEmpty());
        breaker.getR4jCircuitBreaker().reset();
        assertTrue(breaker.getHistory().isEmpty());
        assertNull(breaker.getOpenEvent());
    }

    @Test
    public void historyRetainsObservationTimestampAndEvictsOldestEntry() {
        OciCircuitBreaker breaker = breaker(10, 2);
        Instant before = Instant.now().truncatedTo(ChronoUnit.MILLIS);
        failWith(breaker, http(500));
        OciCircuitBreaker.ErrorHistoryItem item = breaker.getHistory().get(0);
        Instant observed = item.getObservedAt().truncatedTo(ChronoUnit.MILLIS);
        assertFalse(observed.isBefore(before));
        assertFalse(observed.isAfter(Instant.now()));
        failWith(breaker, http(429));
        assertSame(item, breaker.getHistory().get(0));
        String entry = item.toString();
        assertEquals(
                observed,
                Instant.parse(entry.substring("Timestamp: ".length(), entry.indexOf(';'))));
        failWith(breaker, http(503));
        assertEquals(2, breaker.getHistory().size());
        assertEquals(429, breaker.getHistory().get(0).getStatus());
        assertEquals(503, breaker.getHistory().get(1).getStatus());
    }

    @Test
    public void ignoredFailuresDoNotEnterTheDiagnosticCounts() {
        OciCircuitBreaker breaker = breaker(3, 4);
        failWith(breaker, http(400));
        failWith(breaker, http(500));
        failWith(breaker, http(429));
        assertEquals(3, breaker.getOpenEvent().getTotalCalls());
        assertEquals(2, breaker.getOpenEvent().getFailedCalls());
        assertEquals(
                Collections.singletonMap(FailureCategory.REMOTE_HTTP, 2L),
                breaker.getOpenEvent().getFailureCounts());
        assertFalse(breaker.getOpenEvent().getHttpStatusCounts().containsKey(400));
    }

    @Test
    public void countBasedWindowEvictsFailuresWhenSuccessesArrive() {
        OciCircuitBreaker breaker =
                new OciCircuitBreakerImpl(
                        CircuitBreaker.of(
                                "count-based",
                                CircuitBreakerConfig.custom()
                                        .slidingWindowSize(3)
                                        .minimumNumberOfCalls(3)
                                        .failureRateThreshold(60)
                                        .waitDurationInOpenState(Duration.ofHours(1))
                                        .build()),
                        3);
        failWith(breaker, new RuntimeException(new UnknownHostException()));
        succeed(breaker);
        succeed(breaker);
        succeed(breaker);
        failWith(breaker, new RuntimeException(new ConnectException()));
        failWith(breaker, new RuntimeException(new ConnectException()));
        assertEquals(3, breaker.getOpenEvent().getTotalCalls());
        assertEquals(2, breaker.getOpenEvent().getFailedCalls());
        assertEquals(
                Collections.singletonMap(FailureCategory.CONNECTION, 2L),
                breaker.getOpenEvent().getFailureCounts());
    }

    @Test
    public void directPermissionRejectionDoesNotLeakToReusedThread() throws Exception {
        OciCircuitBreaker breaker = breaker(1, 0);
        failWith(breaker, http(500));
        assertNotNull(breaker.getOpenEvent());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            // A direct permission check ends without building an SDK rejection exception.
            executor.submit(
                            () -> {
                                assertFalse(breaker.tryAcquirePermission());
                                assertThrows(
                                        CallNotPermittedException.class,
                                        breaker::acquirePermission);
                            })
                    .get(5, TimeUnit.SECONDS);
            breaker.getR4jCircuitBreaker().reset();
            assertNull(breaker.getOpenEvent());

            // Reuse the same worker: its next exception must not retain the old opening.
            CallNotAllowedException rejection =
                    executor.submit(breaker::createCallNotAllowedException)
                            .get(5, TimeUnit.SECONDS);
            assertNull(
                    "A direct permission check must not leave an opening exception on the thread",
                    rejection.getOpenEvent());
            assertNull(rejection.getCorrelationId());
        } finally {
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    public void sdkPermissionCaptureIsClearedOnSuccessAndRejection() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            for (boolean rejected : new boolean[] {false, true}) {
                OciCircuitBreaker breaker = breaker(1, 0);
                if (rejected) failWith(breaker, http(500));
                executor.submit(
                                () -> {
                                    if (rejected) {
                                        assertThrows(
                                                CallNotAllowedException.class,
                                                breaker::acquirePermissionOrThrow);
                                    } else {
                                        breaker.acquirePermissionOrThrow();
                                        breaker.onSuccess(1, TimeUnit.MILLISECONDS);
                                    }
                                })
                        .get(5, TimeUnit.SECONDS);
                breaker.getR4jCircuitBreaker().reset();
                assertNull(
                        executor.submit(breaker::createCallNotAllowedException)
                                .get(5, TimeUnit.SECONDS)
                                .getOpenEvent());
            }
        } finally {
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    public void sdkPermissionCapturePreservesPermissionAndExceptionFactoryOverrides() {
        CallNotAllowedException customRejection =
                CallNotAllowedException.createCallNotAllowedException("custom rejection", false);
        OciCircuitBreaker breaker =
                new OciCircuitBreakerImpl(diagnosticRaceBreaker("custom-permission"), 0) {
                    @Override
                    public boolean tryAcquirePermission() {
                        return false;
                    }

                    @Override
                    public CallNotAllowedException createCallNotAllowedException() {
                        return customRejection;
                    }
                };
        assertSame(
                customRejection,
                assertThrows(CallNotAllowedException.class, breaker::acquirePermissionOrThrow));
    }

    @Test
    public void concurrentFailuresContributeToOneOpening() throws Exception {
        OciCircuitBreaker breaker = breaker(2, 2);
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<?> dns =
                    executor.submit(
                            () -> {
                                await(start);
                                failWith(breaker, new RuntimeException(new UnknownHostException()));
                            });
            Future<?> connection =
                    executor.submit(
                            () -> {
                                await(start);
                                failWith(breaker, new RuntimeException(new ConnectException()));
                            });
            start.countDown();
            dns.get(5, TimeUnit.SECONDS);
            connection.get(5, TimeUnit.SECONDS);
            assertEquals(2, breaker.getOpenEvent().getFailedCalls());
            Map<FailureCategory, Long> expected = new EnumMap<>(FailureCategory.class);
            expected.put(FailureCategory.DNS, 1L);
            expected.put(FailureCategory.CONNECTION, 1L);
            assertEquals(expected, breaker.getOpenEvent().getFailureCounts());
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void concurrentOpeningUsesBestEffortCountsWithoutSerializingReports() throws Exception {
        OciCircuitBreaker breaker = breaker(1, 0);
        assertConcurrentOpening(
                breaker,
                breaker::tryAcquirePermission,
                error -> breaker.onError(1, TimeUnit.MILLISECONDS, error));
    }

    private void assertConcurrentOpening(
            OciCircuitBreaker breaker,
            BooleanSupplier acquirePermission,
            Consumer<Throwable> reportFailure)
            throws Exception {
        CountDownLatch dnsRecorded = new CountDownLatch(1);
        CountDownLatch resumeDns = new CountDownLatch(1);
        // This listener runs after diagnostic observation but before resilience4j updates metrics.
        breaker.getR4jCircuitBreaker()
                .getEventPublisher()
                .onError(
                        event -> {
                            if (event.getThrowable() instanceof UnknownHostException) {
                                dnsRecorded.countDown();
                                await(resumeDns);
                            }
                        });
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTask<Void> connection =
                new FutureTask<>(
                        () -> {
                            reportFailure.accept(new ConnectException());
                            return null;
                        });
        Thread connectionThread = new Thread(connection, "concurrent-opening-connection");
        try {
            // Both calls start while CLOSED, before either failure can open the breaker.
            assertTrue(acquirePermission.getAsBoolean());
            assertTrue(acquirePermission.getAsBoolean());
            Future<?> dns = executor.submit(() -> reportFailure.accept(new UnknownHostException()));
            await(dnsRecorded);
            connectionThread.start();
            // Diagnostic collection must not serialize protected result reporting.
            connection.get(5, TimeUnit.SECONDS);
            resumeDns.countDown();
            dns.get(5, TimeUnit.SECONDS);
            CircuitBreakerOpenEvent opening = breaker.getOpenEvent();

            assertNotNull(opening);
            assertEquals(1, opening.getFailedCalls());
            Map<FailureCategory, Long> observed = new EnumMap<>(FailureCategory.class);
            observed.put(FailureCategory.DNS, 1L);
            observed.put(FailureCategory.CONNECTION, 1L);
            assertEquals(observed, opening.getFailureCounts());
            assertTrue(opening.toString().contains("ObservedFailures - 2"));
            assertSame(opening, breaker.getOpenEvent());
        } finally {
            resumeDns.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
            connectionThread.join(TimeUnit.SECONDS.toMillis(5));
            assertFalse(connectionThread.isAlive());
        }
    }

    private void await(CountDownLatch latch) {
        try {
            assertTrue(latch.await(5, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
    }

    @Test
    public void rejectionDuringOpeningPublicationKeepsOpeningCorrelation() throws Exception {
        CircuitBreaker raw = diagnosticRaceBreaker("opening-publication");
        CountDownLatch opened = new CountDownLatch(1);
        CountDownLatch publishOpening = new CountDownLatch(1);
        // Pause after Resilience4j changes state, before the SDK publishes its opening snapshot.
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.OPEN) {
                                opened.countDown();
                                await(publishOpening);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTask<CallNotAllowedException> rejected =
                new FutureTask<>(
                        () ->
                                assertThrows(
                                        CallNotAllowedException.class,
                                        breaker::acquirePermissionOrThrow));
        Thread rejectionThread = new Thread(rejected, "opening-publication-rejection");
        try {
            breaker.acquirePermissionOrThrow();
            Future<?> opening =
                    executor.submit(
                            () ->
                                    breaker.onError(
                                            1, TimeUnit.MILLISECONDS, new UnknownHostException()));
            await(opened);
            rejectionThread.start();
            awaitCompletionOrBlocking(rejected, rejectionThread);
            publishOpening.countDown();
            opening.get(5, TimeUnit.SECONDS);
            CallNotAllowedException rejection = rejected.get(5, TimeUnit.SECONDS);

            CircuitBreakerOpenEvent event = breaker.getOpenEvent();
            assertNotNull(event);
            assertSame(
                    "The rejection must capture the opening that denied it",
                    event,
                    rejection.getOpenEvent());
            assertEquals(event.getCorrelationId(), rejection.getCorrelationId());
            assertTrue(
                    breaker.circuitBreakerCallNotPermittedErrorMessage(null, rejection)
                            .contains(event.toString()));
        } finally {
            publishOpening.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
            rejectionThread.join(TimeUnit.SECONDS.toMillis(5));
            assertFalse(rejectionThread.isAlive());
        }
    }

    @Test
    public void probeDuringHalfOpenPublicationExcludesPreviousWindow() throws Exception {
        CircuitBreaker raw = diagnosticRaceBreaker("half-open-publication");
        CountDownLatch halfOpened = new CountDownLatch(1);
        CountDownLatch publishHalfOpen = new CountDownLatch(1);
        // A probe can acquire permission before the transition's diagnostic window reset runs.
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.HALF_OPEN) {
                                halfOpened.countDown();
                                await(publishHalfOpen);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        breaker.acquirePermissionOrThrow();
        breaker.onError(1, TimeUnit.MILLISECONDS, new UnknownHostException());
        CircuitBreakerOpenEvent firstOpening = breaker.getOpenEvent();
        assertNotNull(firstOpening);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTask<Void> probe =
                new FutureTask<>(
                        () -> {
                            breaker.acquirePermissionOrThrow();
                            breaker.onError(1, TimeUnit.MILLISECONDS, new ConnectException());
                            return null;
                        });
        Thread probeThread = new Thread(probe, "half-open-publication-probe");
        try {
            Future<?> transition = executor.submit(raw::transitionToHalfOpenState);
            await(halfOpened);
            probeThread.start();
            awaitCompletionOrBlocking(probe, probeThread);
            publishHalfOpen.countDown();
            transition.get(5, TimeUnit.SECONDS);
            probe.get(5, TimeUnit.SECONDS);

            CircuitBreakerOpenEvent reopening = breaker.getOpenEvent();
            assertNotNull(reopening);
            assertEquals("HALF_OPEN", reopening.getPreviousState());
            assertNotEquals(firstOpening.getCorrelationId(), reopening.getCorrelationId());
            assertEquals(1, reopening.getTotalCalls());
            assertEquals(1, reopening.getFailedCalls());
            assertEquals(
                    "Only the new probe belongs to the HALF_OPEN evaluation window",
                    Collections.singletonMap(FailureCategory.CONNECTION, 1L),
                    reopening.getFailureCounts());
        } finally {
            publishHalfOpen.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
            probeThread.join(TimeUnit.SECONDS.toMillis(5));
            assertFalse(probeThread.isAlive());
        }
    }

    @Test
    public void diagnosticsDoNotReadPrivateEvaluationClock() {
        Clock clock = mock(Clock.class);
        Instant initialTime = Instant.now();
        when(clock.instant()).thenReturn(initialTime);
        CircuitBreaker raw =
                new CircuitBreakerStateMachine(
                        "time-window-clock",
                        CircuitBreakerConfig.custom()
                                .slidingWindowType(
                                        CircuitBreakerConfig.SlidingWindowType.TIME_BASED)
                                .slidingWindowSize(60)
                                .minimumNumberOfCalls(2)
                                .failureRateThreshold(100)
                                .waitDurationInOpenState(Duration.ofHours(1))
                                .build(),
                        clock);
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        failWith(breaker, new UnknownHostException());
        assertNull(breaker.getOpenEvent());

        // Advance the evaluation window deterministically, without sleeping or changing production
        // code.
        when(clock.instant()).thenReturn(initialTime.plusSeconds(61));
        failWith(breaker, new ConnectException());
        assertNull(breaker.getOpenEvent());
        failWith(breaker, new SSLException("test TLS failure"));

        CircuitBreakerOpenEvent opening = breaker.getOpenEvent();
        assertNotNull(opening);
        assertEquals(2, opening.getTotalCalls());
        assertEquals(2, opening.getFailedCalls());
        Map<FailureCategory, Long> expected = new EnumMap<>(FailureCategory.class);
        expected.put(FailureCategory.DNS, 1L);
        expected.put(FailureCategory.CONNECTION, 1L);
        expected.put(FailureCategory.TLS, 1L);
        assertEquals(
                "Observation counts use wall time while native metrics retain their own clock",
                expected,
                opening.getFailureCounts());
    }

    @Test
    public void openingMayExcludeObservationExpiredBeforeMetricUpdate() {
        Clock clock = mock(Clock.class);
        when(clock.instant()).thenReturn(Instant.now());
        CircuitBreaker raw =
                new CircuitBreakerStateMachine(
                        "error-callback-boundary",
                        CircuitBreakerConfig.custom()
                                .slidingWindowType(
                                        CircuitBreakerConfig.SlidingWindowType.TIME_BASED)
                                .slidingWindowSize(1)
                                .minimumNumberOfCalls(1)
                                .waitDurationInOpenState(Duration.ofHours(1))
                                .build(),
                        clock);
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        raw.getEventPublisher()
                .onError(
                        event -> {
                            // Diagnostics have observed this failure; metrics are updated next.
                            Instant metricTime = awaitNextSecond();
                            // Hold metric time steady so assertions cannot expire its bucket.
                            when(clock.instant()).thenReturn(metricTime);
                        });
        failWith(breaker, new UnknownHostException());

        CircuitBreakerOpenEvent opening = breaker.getOpenEvent();
        assertNotNull(opening);
        assertEquals(1, opening.getTotalCalls());
        assertEquals(1, opening.getFailedCalls());
        // Observation time and native metric-update time can fall in different one-second windows.
        assertTrue(opening.getFailureCounts().isEmpty());
        assertTrue(opening.getHttpStatusCounts().isEmpty());
        assertTrue(opening.toString().contains("ObservedFailures - 0"));
    }

    @Test
    public void delayedCloseCallbackDoesNotEraseNewClosedWindowObservations() throws Exception {
        CircuitBreaker raw =
                CircuitBreaker.of(
                        "delayed-close",
                        CircuitBreakerConfig.custom()
                                .minimumNumberOfCalls(2)
                                .waitDurationInOpenState(Duration.ofHours(1))
                                .build());
        CountDownLatch closed = new CountDownLatch(1);
        CountDownLatch publishClose = new CountDownLatch(1);
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.CLOSED) {
                                closed.countDown();
                                await(publishClose);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        failWith(breaker, new UnknownHostException());
        failWith(breaker, new UnknownHostException());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<?> closing = executor.submit(raw::transitionToClosedState);
            await(closed);
            failWith(breaker, new ConnectException());
            publishClose.countDown();
            closing.get(5, TimeUnit.SECONDS);
            failWith(breaker, new SSLException("new CLOSED window"));
            Map<FailureCategory, Long> expected = new EnumMap<>(FailureCategory.class);
            expected.put(FailureCategory.CONNECTION, 1L);
            expected.put(FailureCategory.TLS, 1L);
            assertEquals(expected, breaker.getOpenEvent().getFailureCounts());
        } finally {
            publishClose.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    public void failedClosingProbeDoesNotEnterNewClosedWindow() {
        OciCircuitBreaker breaker =
                new OciCircuitBreakerImpl(
                        CircuitBreaker.of(
                                "closing-probe",
                                CircuitBreakerConfig.custom()
                                        .slidingWindowSize(10)
                                        .minimumNumberOfCalls(3)
                                        .failureRateThreshold(60)
                                        .permittedNumberOfCallsInHalfOpenState(3)
                                        .waitDurationInOpenState(Duration.ofHours(1))
                                        .build()),
                        5);
        failWith(breaker, new UnknownHostException());
        failWith(breaker, new UnknownHostException());
        failWith(breaker, new UnknownHostException());
        breaker.getR4jCircuitBreaker().transitionToHalfOpenState();
        succeed(breaker);
        succeed(breaker);
        failWith(breaker, new ConnectException());
        assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
        assertNull(breaker.getOpenEvent());
        assertTrue(breaker.getHistory().isEmpty());

        succeed(breaker);
        failWith(breaker, new SSLException("new CLOSED window"));
        failWith(breaker, new SSLException("new CLOSED window"));
        CircuitBreakerOpenEvent opening = breaker.getOpenEvent();
        assertNotNull(opening);
        assertEquals(2, opening.getFailedCalls());
        assertEquals(Collections.singletonMap(FailureCategory.TLS, 2L), opening.getFailureCounts());
    }

    @Test
    public void permissionAcquisitionDoesNotDeadlockAutomaticHalfOpen() throws Exception {
        Clock clock = mock(Clock.class);
        Instant initial = Instant.now();
        CountDownLatch permissionInOpen = new CountDownLatch(1);
        CountDownLatch resumePermission = new CountDownLatch(1);
        CountDownLatch timerInHalfOpen = new CountDownLatch(1);
        CountDownLatch resumeTimer = new CountDownLatch(1);
        when(clock.instant())
                .thenAnswer(
                        ignored -> {
                            if (Thread.currentThread().getName().equals("automatic-permission")) {
                                permissionInOpen.countDown();
                                await(resumePermission);
                                return initial.plusSeconds(2);
                            }
                            return initial;
                        });
        CircuitBreaker raw =
                new CircuitBreakerStateMachine(
                        "automatic-recovery",
                        CircuitBreakerConfig.custom()
                                .minimumNumberOfCalls(1)
                                .permittedNumberOfCallsInHalfOpenState(1)
                                .automaticTransitionFromOpenToHalfOpenEnabled(true)
                                .waitDurationInOpenState(Duration.ofSeconds(1))
                                .build(),
                        clock);
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.HALF_OPEN) {
                                timerInHalfOpen.countDown();
                                await(resumeTimer);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        FutureTask<Void> permission =
                new FutureTask<>(
                        () -> {
                            breaker.acquirePermissionOrThrow();
                            return null;
                        });
        Thread worker = new Thread(permission, "automatic-permission");
        worker.setDaemon(true);
        try {
            failWith(breaker, new UnknownHostException());
            worker.start();
            await(permissionInOpen);
            await(timerInHalfOpen);
            resumeTimer.countDown();
            resumePermission.countDown();
            permission.get(5, TimeUnit.SECONDS);
            assertEquals(CircuitBreaker.State.HALF_OPEN, breaker.getState());
        } finally {
            resumeTimer.countDown();
            resumePermission.countDown();
            worker.join(TimeUnit.SECONDS.toMillis(5));
            assertFalse(
                    "Permission acquisition must finish during automatic recovery",
                    worker.isAlive());
        }
    }

    @Test
    public void transitionDuringErrorReportingDoesNotCarryPreviousWindowFailures()
            throws Exception {
        CircuitBreaker raw = diagnosticRaceBreaker("transition-during-report");
        CountDownLatch halfOpen = new CountDownLatch(1);
        CountDownLatch publishHalfOpen = new CountDownLatch(1);
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.HALF_OPEN) {
                                halfOpen.countDown();
                                await(publishHalfOpen);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        failWith(breaker, new UnknownHostException());
        FutureTask<Void> transition =
                new FutureTask<>(
                        () -> {
                            raw.transitionToHalfOpenState();
                            return null;
                        });
        Thread timer = new Thread(transition, "transition-during-report");
        timer.setDaemon(true);
        raw.getEventPublisher()
                .onError(
                        event -> {
                            if (event.getThrowable() instanceof ConnectException) {
                                timer.start();
                                await(halfOpen);
                            }
                        });
        try {
            // An already in-flight result can arrive while OPEN, then be counted in HALF_OPEN.
            breaker.onError(1, TimeUnit.MILLISECONDS, new ConnectException());
            CircuitBreakerOpenEvent opening = breaker.getOpenEvent();
            assertNotNull(opening);
            assertEquals("HALF_OPEN", opening.getPreviousState());
            assertEquals(1, opening.getFailedCalls());
            // The event preceded the window replacement; its category may be unavailable.
            assertFalse(opening.getFailureCounts().containsKey(FailureCategory.DNS));
        } finally {
            publishHalfOpen.countDown();
            transition.get(5, TimeUnit.SECONDS);
            timer.join(TimeUnit.SECONDS.toMillis(5));
        }
    }

    @Test
    @SuppressWarnings("removal")
    public void constructionDoesNotRequireDeepReflectionPermission() {
        CircuitBreaker raw = diagnosticRaceBreaker("restricted-construction");
        // Initialize constructor lambdas before installing the restrictive policy.
        new OciCircuitBreakerImpl(diagnosticRaceBreaker("warm-construction"), 0);
        System.clearProperty(CircuitBreakerConfiguration.DIAGNOSTIC_SUMMARY_ENABLED_PROPERTY);
        SecurityManager previous = System.getSecurityManager();
        SecurityManager restricted =
                new SecurityManager() {
                    @Override
                    public void checkPermission(java.security.Permission permission) {
                        if (permission instanceof java.lang.reflect.ReflectPermission
                                && permission.getName().equals("suppressAccessChecks")) {
                            throw new SecurityException("Deep reflection is denied");
                        }
                    }
                };
        try {
            try {
                System.setSecurityManager(restricted);
            } catch (UnsupportedOperationException unsupported) {
                org.junit.Assume.assumeNoException(unsupported);
            }
            assertNotNull(new OciCircuitBreakerImpl(raw, 0));
        } finally {
            if (System.getSecurityManager() == restricted) {
                System.setSecurityManager(previous);
            }
        }
    }

    @Test
    public void directResilience4jReportsKeepOriginalBehaviorWithBestEffortCounts()
            throws Exception {
        CircuitBreaker raw = diagnosticRaceBreaker("direct-reporting");
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 0);
        CircuitBreaker exposed = breaker.getR4jCircuitBreaker();
        assertSame("The SDK must return the supplied Resilience4j breaker", raw, exposed);
        assertConcurrentOpening(
                breaker,
                exposed::tryAcquirePermission,
                error -> exposed.onError(1, TimeUnit.MILLISECONDS, error));
    }

    private CircuitBreaker diagnosticRaceBreaker(String name) {
        return CircuitBreaker.of(
                name,
                CircuitBreakerConfig.custom()
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(1)
                        .permittedNumberOfCallsInHalfOpenState(1)
                        .waitDurationInOpenState(Duration.ofHours(1))
                        .build());
    }

    private void awaitCompletionOrBlocking(Future<?> result, Thread thread) {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5);
        while (!result.isDone()) {
            Thread.State state = thread.getState();
            if (state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                return;
            }
            assertTrue("Competing call did not complete or block", System.nanoTime() < deadline);
            Thread.yield();
        }
    }

    private Instant awaitNextSecond() {
        long second = Instant.now().getEpochSecond();
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5);
        Instant current = Instant.now();
        while (current.getEpochSecond() <= second) {
            assertTrue("Clock did not cross the second boundary", System.nanoTime() < deadline);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new AssertionError(e);
            }
            current = Instant.now();
        }
        return current;
    }

    @Test
    public void rejectionWithoutSnapshotDoesNotUseAnotherOpening() {
        OciCircuitBreaker breaker = breaker(1, 1);
        failWith(breaker, http(500));
        CallNotAllowedException rejection =
                CallNotAllowedException.createCallNotAllowedException("open", false);
        assertFalse(
                breaker.circuitBreakerCallNotPermittedErrorMessage(null, rejection)
                        .contains("Diagnostic summary"));
    }

    @Test
    public void forcedOpenHasNoFailureSummary() {
        OciCircuitBreaker breaker = breaker(1, 1);
        breaker.getR4jCircuitBreaker().transitionToForcedOpenState();
        assertNull(breaker.getOpenEvent());
        assertFalse(
                breaker.circuitBreakerCallNotPermittedErrorMessage(null)
                        .contains("Diagnostic summary"));
    }

    @Test
    public void customBreakerWithoutSnapshotKeepsItsMessage() {
        OciCircuitBreaker custom = mock(LegacyBreaker.class, CALLS_REAL_METHODS);
        doReturn("legacy rejection").when(custom).circuitBreakerCallNotPermittedErrorMessage(any());
        assertNull(custom.getOpenEvent());
        assertEquals(
                "legacy rejection",
                custom.circuitBreakerCallNotPermittedErrorMessage(
                        null,
                        CallNotAllowedException.createCallNotAllowedException("open", false)));
    }

    @Test
    public void clientCallIncludesSnapshotInSyncAndAsyncRejections() throws Exception {
        assertClientCallRejections(breaker -> {}, 503);
    }

    @Test
    public void clientCallPreservesSnapshotWhenResetDuringRejection() throws Exception {
        assertClientCallRejections(breaker -> breaker.getR4jCircuitBreaker().reset(), null);
    }

    @Test
    public void clientCallPreservesSnapshotWhenReopenedDuringRejection() throws Exception {
        assertClientCallRejections(
                breaker -> {
                    breaker.getR4jCircuitBreaker().reset();
                    failWith(breaker, http(429));
                },
                429);
    }

    private void assertClientCallRejections(
            Consumer<OciCircuitBreaker> onRejection, Integer expectedCurrentStatus)
            throws Exception {
        for (boolean synchronous : new boolean[] {true, false}) {
            OciCircuitBreaker breaker = breaker(1, 2);
            failWith(breaker, http(503));
            CircuitBreakerOpenEvent original = breaker.getOpenEvent();
            assertNotNull(original);
            AtomicBoolean firstRejection = new AtomicBoolean(true);
            breaker.getR4jCircuitBreaker()
                    .getEventPublisher()
                    .onCallNotPermitted(
                            ignored -> {
                                if (firstRejection.compareAndSet(true, false)) {
                                    onRejection.accept(breaker);
                                }
                            });
            HttpClient client = mock(HttpClient.class);
            HttpRequest request = mock(HttpRequest.class);
            when(client.createRequest(any())).thenReturn(request);
            when(request.copy()).thenReturn(request);
            when(request.offloadExecutor(any())).thenReturn(request);
            when(request.uri()).thenReturn(URI.create("https://localhost"));
            ClientCall<
                            ClientCallTest.TestRequest,
                            ClientCallTest.TestResponse,
                            ClientCallTest.TestResponse.Builder>
                    call =
                            ClientCall.builder(
                                            client,
                                            new ClientCallTest.TestRequest(),
                                            ClientCallTest.TestResponse::builder)
                                    .circuitBreaker(breaker)
                                    .retryConfiguration(RetryConfiguration.NO_RETRY_CONFIGURATION)
                                    .serviceDetails(
                                            "Diagnostics", "TestOperation", "https://localhost/api")
                                    .logger(LoggerFactory.getLogger(getClass()), "diagnostics-test")
                                    .method(Method.GET);
            BmcException rejection;
            if (synchronous) {
                rejection = assertThrows(BmcException.class, call::callSync);
            } else {
                Future<ClientCallTest.TestResponse> result = call.callAsync(null);
                ExecutionException failure =
                        assertThrows(
                                ExecutionException.class, () -> result.get(5, TimeUnit.SECONDS));
                assertTrue(failure.getCause() instanceof BmcException);
                rejection = (BmcException) failure.getCause();
            }
            assertFalse("Rejection listener was not invoked", firstRejection.get());
            assertRejection(rejection, original);
            assertTrue(rejection.isClientSide());
            assertEquals("Diagnostics", rejection.getServiceDetails().getServiceName());
            assertEquals("TestOperation", rejection.getServiceDetails().getOperationName());
            assertEquals("https://localhost", rejection.getServiceDetails().getRequestEndpoint());
            assertEquals(
                    "https://localhost/api", rejection.getServiceDetails().getApiReferenceLink());
            assertTrue(
                    rejection
                            .getMessage()
                            .contains("URL which CircuitBreaker rejected is - https://localhost"));
            CircuitBreakerOpenEvent current = breaker.getOpenEvent();
            if (expectedCurrentStatus == null) {
                assertNull(current);
            } else {
                assertNotNull(current);
                assertEquals(
                        Collections.singletonMap(expectedCurrentStatus, 1L),
                        current.getHttpStatusCounts());
            }
            if (current != null && current != original) {
                assertNotEquals(original.getCorrelationId(), current.getCorrelationId());
                assertFalse(rejection.getMessage().contains(current.toString()));
            }
            verify(request, never()).execute();
        }
    }

    @Test
    public void rejectionFactoryPreservesMessageAndCapturedSnapshot() {
        OciCircuitBreaker breaker = breaker(1, 0);
        failWith(breaker, http(503));
        CircuitBreakerOpenEvent event = breaker.getOpenEvent();
        CallNotAllowedException rejection =
                CallNotAllowedException.createCallNotAllowedException(
                        "original reason", false, event);
        assertEquals("original reason", rejection.getMessage());
        assertSame(event, rejection.getOpenEvent());
        assertEquals(event.getCorrelationId(), rejection.getCorrelationId());
        assertEquals(0, rejection.getStackTrace().length);
    }

    @Test
    public void capturedRejectionKeepsItsSummaryAfterReopening() {
        OciCircuitBreaker breaker = breaker(1, 0);
        failWith(breaker, http(500));
        CircuitBreakerOpenEvent original = breaker.getOpenEvent();
        AtomicBoolean reopen = new AtomicBoolean(true);
        breaker.getR4jCircuitBreaker()
                .getEventPublisher()
                .onCallNotPermitted(
                        ignored -> {
                            if (reopen.compareAndSet(true, false)) {
                                breaker.getR4jCircuitBreaker().reset();
                                failWith(breaker, http(429));
                                // A later direct rejection must not replace the SDK call's
                                // snapshot.
                                assertFalse(breaker.tryAcquirePermission());
                            }
                        });
        CallNotAllowedException rejection =
                assertThrows(CallNotAllowedException.class, breaker::acquirePermissionOrThrow);
        CircuitBreakerOpenEvent current = breaker.getOpenEvent();
        assertNotEquals(original.getCorrelationId(), current.getCorrelationId());
        assertSame(original, rejection.getOpenEvent());
        String message = breaker.circuitBreakerCallNotPermittedErrorMessage(null, rejection);
        assertEquals(1, occurrences(message, original.toString()));
        assertFalse(message.contains(current.toString()));
    }

    @Test
    public void delayedHistoryCleanupPreservesFreshClosedWindow() throws Exception {
        assertDelayedHistoryCleanup(2);
    }

    @Test
    public void delayedHistoryCleanupPreservesFreshOpening() throws Exception {
        assertDelayedHistoryCleanup(1);
    }

    @Test
    public void delayedClosedCleanupClearsHistoryBeforeDirectReopening() throws Exception {
        CircuitBreaker raw = diagnosticRaceBreaker("direct-reopening-history");
        CountDownLatch closed = new CountDownLatch(1);
        CountDownLatch publishClose = new CountDownLatch(1);
        raw.getEventPublisher()
                .onStateTransition(
                        event -> {
                            if (event.getStateTransition().getToState()
                                    == CircuitBreaker.State.CLOSED) {
                                closed.countDown();
                                await(publishClose);
                            }
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 4);
        failWith(breaker, http(500));
        assertEquals(1, breaker.getHistory().size());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<?> closing = executor.submit(raw::transitionToClosedState);
            await(closed);
            assertEquals(CircuitBreaker.State.CLOSED, raw.getState());
            // Direct reporting bypasses addToHistory(), so the error listener must clear history.
            raw.acquirePermission();
            raw.onError(1, TimeUnit.MILLISECONDS, new ConnectException());
            assertEquals(CircuitBreaker.State.OPEN, raw.getState());
            assertTrue(
                    "Previous window history survived reopening", breaker.getHistory().isEmpty());
            publishClose.countDown();
            closing.get(5, TimeUnit.SECONDS);

            assertTrue(breaker.getHistory().isEmpty());
            assertEquals(
                    Collections.singletonMap(FailureCategory.CONNECTION, 1L),
                    breaker.getOpenEvent().getFailureCounts());
        } finally {
            publishClose.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    public void delayedResetWhileAlreadyClosedPreservesNewObservations() throws Exception {
        CircuitBreaker raw =
                CircuitBreaker.of(
                        "delayed-reset-while-closed",
                        CircuitBreakerConfig.custom()
                                .minimumNumberOfCalls(2)
                                .failureRateThreshold(100)
                                .waitDurationInOpenState(Duration.ofHours(1))
                                .build());
        CountDownLatch resetStarted = new CountDownLatch(1);
        CountDownLatch publishReset = new CountDownLatch(1);
        // Resetting CLOSED replaces its metrics without publishing another CLOSED transition.
        raw.getEventPublisher()
                .onReset(
                        event -> {
                            resetStarted.countDown();
                            await(publishReset);
                        });
        OciCircuitBreaker breaker = new OciCircuitBreakerImpl(raw, 4);
        failWith(breaker, http(500));
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<?> resetting = executor.submit(raw::reset);
            await(resetStarted);
            assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
            failWith(breaker, http(503));
            publishReset.countDown();
            resetting.get(5, TimeUnit.SECONDS);
            failWith(breaker, http(429));

            CircuitBreakerOpenEvent event = breaker.getOpenEvent();
            assertNotNull(event);
            assertEquals(2, event.getFailedCalls());
            assertEquals(
                    Collections.singletonMap(FailureCategory.REMOTE_HTTP, 2L),
                    event.getFailureCounts());
            Map<Integer, Long> expectedStatuses = new HashMap<>();
            expectedStatuses.put(503, 1L);
            expectedStatuses.put(429, 1L);
            assertEquals(expectedStatuses, event.getHttpStatusCounts());
        } finally {
            publishReset.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    private void assertDelayedHistoryCleanup(int minimumCalls) throws Exception {
        for (boolean reset : new boolean[] {false, true}) {
            OciCircuitBreaker breaker = breaker(minimumCalls, 4);
            for (int call = 0; call < minimumCalls; call++) {
                failWith(breaker, http(500));
            }
            CircuitBreaker raw = breaker.getR4jCircuitBreaker();
            FutureTask<Void> cleanup =
                    new FutureTask<>(
                            () -> {
                                if (reset) raw.reset();
                                else raw.transitionToClosedState();
                                return null;
                            });
            Thread worker = new Thread(cleanup, "delayed-history-cleanup");
            try {
                String freshHistory;
                synchronized (breaker) {
                    worker.start();
                    long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5);
                    while (worker.getState() != Thread.State.BLOCKED) {
                        assertTrue(
                                "History cleanup did not reach its monitor",
                                System.nanoTime() < deadline);
                        Thread.yield();
                    }
                    assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
                    failWith(breaker, http(503));
                    freshHistory = breaker.getHistoryAsString();
                    assertTrue(freshHistory.contains("status: 503"));
                    assertFalse(freshHistory.contains("status: 500"));
                }
                cleanup.get(5, TimeUnit.SECONDS);
                assertEquals(freshHistory, breaker.getHistoryAsString());
                assertEquals(1, breaker.getHistory().size());
                if (minimumCalls == 2) {
                    assertEquals(CircuitBreaker.State.CLOSED, breaker.getState());
                    failWith(breaker, http(429));
                }
                CircuitBreakerOpenEvent event = breaker.getOpenEvent();
                assertEquals(minimumCalls, event.getFailedCalls());
                assertEquals(
                        Collections.singletonMap(FailureCategory.REMOTE_HTTP, (long) minimumCalls),
                        event.getFailureCounts());
                assertEquals(Long.valueOf(1), event.getHttpStatusCounts().get(503));
            } finally {
                worker.join(TimeUnit.SECONDS.toMillis(5));
                assertFalse("History cleanup did not finish", worker.isAlive());
            }
        }
    }

    // Concrete bridges allow this repository's Mockito version to invoke interface defaults.
    private abstract static class LegacyBreaker implements OciCircuitBreaker {
        @Override
        public CircuitBreakerOpenEvent getOpenEvent() {
            return OciCircuitBreaker.super.getOpenEvent();
        }

        @Override
        public String circuitBreakerCallNotPermittedErrorMessage(
                String uri, CallNotAllowedException rejection) {
            return OciCircuitBreaker.super.circuitBreakerCallNotPermittedErrorMessage(
                    uri, rejection);
        }
    }

    private void assertRejection(BmcException rejection, CircuitBreakerOpenEvent event) {
        assertTrue(rejection.getCause() instanceof CallNotAllowedException);
        CallNotAllowedException cause = (CallNotAllowedException) rejection.getCause();
        assertSame(event, cause.getOpenEvent());
        assertEquals(event.getCorrelationId(), cause.getCorrelationId());
        assertTrue(
                rejection.getMessage().contains("Diagnostic summary for this opening:\n" + event));
        assertEquals(1, occurrences(rejection.getMessage(), event.toString()));
        StringWriter chain = new StringWriter();
        rejection.printStackTrace(new PrintWriter(chain));
        assertEquals(1, occurrences(chain.toString(), event.toString()));
    }

    private int occurrences(String text, String fragment) {
        return (text.length() - text.replace(fragment, "").length()) / fragment.length();
    }
}
