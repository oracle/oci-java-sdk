/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.WaiterScheduler;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BmcGenericRetrierTest {

    private static final RetryConfiguration CUSTOM_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(2))
                    .delayStrategy(new FixedTimeDelayStrategy(0L))
                    .build();

    private static final RetryConfiguration DELAY_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(2))
                    .delayStrategy(new FixedTimeDelayStrategy(50L))
                    .build();

    private Supplier<String> setupMockRequest(int httpStatusCode, final String serviceCode) {
        // First invocation throws exception
        // Second invocation returns success
        final Supplier<String> request = mock(Supplier.class);
        doThrow(new BmcException(httpStatusCode, serviceCode, "bar", "baz"))
                .doReturn("success")
                .when(request)
                .get();
        return request;
    }

    private Supplier<String> setupMockCallNotAllowedRequest() {
        // First invocation throws exception
        // Second invocation returns success
        final Supplier<String> request = mock(Supplier.class);
        doThrow(
                        new BmcException(
                                false,
                                "CircuitBreaker Open",
                                CallNotAllowedException.createCallNotAllowedException(
                                        "CircuitBreaker 'default' is OPEN and does not permit further calls",
                                        false),
                                null))
                .doReturn("success")
                .when(request)
                .get();
        return request;
    }

    @Test
    public void defaultRetrierFailure() {
        final Supplier<String> request = setupMockRequest(500, "InternalServerError");

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        try {
            defaultRetrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(500, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }

    @Test
    public void defaultRetrierSuccess() {
        final Supplier<String> request = mock(Supplier.class);
        doReturn("success").when(request).get();

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        defaultRetrier.execute(request, Supplier::get);

        verify(request, times(1)).get();
    }

    @Test
    public void retryForInternalServerError() {
        final Supplier<String> request = setupMockRequest(500, "InternalServerError");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void retryForProcessingException() {
        final Supplier<String> request =
                setupMockRequest(-1, "Processing Exception while communicating to");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void noRetryForInvalidParameter() {
        final Supplier<String> request = setupMockRequest(400, "InvalidParameter");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(400, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }

    @Test
    public void retryForIncorrectState() {
        final Supplier<String> request = setupMockRequest(409, "IncorrectState");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void noRetryForNotAuthorizedOrResourceAlreadyExists() {
        final Supplier<String> request =
                setupMockRequest(409, "NotAuthorizedOrResourceAlreadyExists");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(409, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }

    @Test
    public void defaultRetrierFailureAsync() throws Exception {
        MockRequest request =
                new MockRequest(new BmcException(500, "InternalServerError", "bar", "baz"));

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(WaiterScheduler.UNSUPPORTED, request, Supplier::get)
                        .toCompletableFuture();
        // no delay, we have no retry config so we will fail immediately
        assertTrue(future.isDone());
        assertTrue(future.isCompletedExceptionally());
        try {
            future.get();
            fail("Should have thrown");
        } catch (ExecutionException e) {
            assertEquals(500, ((BmcException) e.getCause()).getStatusCode());
        }

        assertEquals(1, request.numberOfCalls);
    }

    @Test
    public void defaultRetrierSuccessAsync() throws Exception {
        MockRequest request = new MockRequest(null);

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(WaiterScheduler.UNSUPPORTED, request, Supplier::get)
                        .toCompletableFuture();
        assertTrue(future.isDone());
        assertFalse(future.isCompletedExceptionally());
        assertEquals("success: 1", future.get());
        assertEquals(1, request.numberOfCalls);
    }

    @Test
    public void retryForInternalServerErrorAsync() throws Exception {
        MockRequest request =
                new MockRequest(new BmcException(500, "InternalServerError", "bar", "baz"));

        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(WaiterScheduler.UNSUPPORTED, request, Supplier::get)
                        .toCompletableFuture();
        // still immediate completion, our retry config has delay 0
        assertTrue(future.isDone());
        assertFalse(future.isCompletedExceptionally());
        assertEquals("success: 2", future.get());
        assertEquals(2, request.numberOfCalls);
    }

    @Test
    public void noRetryForInvalidParameterAsync() throws Exception {
        MockRequest request =
                new MockRequest(new BmcException(400, "InvalidParameter", "bar", "baz"));

        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        EmbeddedChannel embeddedChannel = new EmbeddedChannel();
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(WaiterScheduler.UNSUPPORTED, request, Supplier::get)
                        .toCompletableFuture();
        // no delay, we have no retry config so we will fail immediately
        assertTrue(future.isDone());
        assertTrue(future.isCompletedExceptionally());
        try {
            future.get();
            fail("Should have thrown");
        } catch (ExecutionException e) {
            assertEquals(400, ((BmcException) e.getCause()).getStatusCode());
        }

        assertEquals(1, request.numberOfCalls);
    }

    @Test
    public void retryDelayAsync() throws Exception {
        MockRequest request =
                new MockRequest(new BmcException(500, "InternalServerError", "bar", "baz"));

        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(DELAY_RETRY_CONFIGURATION);
        EmbeddedChannel embeddedChannel = new EmbeddedChannel();
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(
                                WaiterScheduler.fromService(embeddedChannel.eventLoop()),
                                request,
                                Supplier::get)
                        .toCompletableFuture();
        // we have a delay here!
        assertFalse(future.isDone());
        runAllScheduled(embeddedChannel);
        assertTrue(future.isDone());
        assertFalse(future.isCompletedExceptionally());
        assertEquals("success: 2", future.get());
        assertEquals(2, request.numberOfCalls);
    }

    @Test
    public void retryDelayAsyncWithSyncWaiter() throws Exception {
        MockRequest request =
                new MockRequest(new BmcException(500, "InternalServerError", "bar", "baz"));

        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(DELAY_RETRY_CONFIGURATION);
        CompletableFuture<String> future =
                defaultRetrier
                        .executeAsync(WaiterScheduler.SYNC, request, Supplier::get)
                        .toCompletableFuture();
        // we have a delay here, but it's done synchronously
        assertTrue(future.isDone());
        assertFalse(future.isCompletedExceptionally());
        assertEquals("success: 2", future.get());
        assertEquals(2, request.numberOfCalls);
    }

    private void runAllScheduled(EmbeddedChannel ch) throws InterruptedException {
        while (true) {
            long next = ch.runScheduledPendingTasks();
            if (next < 0) {
                break;
            }
            Thread.sleep(TimeUnit.NANOSECONDS.toMillis(next) + 50);
        }
    }

    @Test
    public void noRetryForCircuitBreakerException() {
        final Supplier<String> request = setupMockCallNotAllowedRequest();
        final BmcGenericRetrier retrier =
                new BmcGenericRetrier(
                        RetryConfiguration
                                .SDK_FAIL_FAST_CIRCUIT_BREAKER_DEFAULT_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
        } catch (BmcException e) {
            assertTrue(e.getCause() instanceof CallNotAllowedException);
        }

        verify(request, times(1)).get();
    }

    @Test
    public void retryForCircuitBreakerException() {
        final Supplier<String> request = setupMockCallNotAllowedRequest();
        final BmcGenericRetrier retrier =
                new BmcGenericRetrier(
                        RetryConfiguration
                                .SDK_RETRY_ON_OPEN_CIRCUIT_BREAKER_DEFAULT_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
        } catch (BmcException e) {
            assertTrue(e.getCause() instanceof CallNotAllowedException);
        }

        verify(request, times(2)).get();
    }

    private static class MockRequest implements Supplier<CompletionStage<String>> {
        final Throwable failure;
        int numberOfCalls = 0;

        private MockRequest(Throwable failure) {
            this.failure = failure;
        }

        @Override
        public CompletionStage<String> get() {
            CompletableFuture<String> future = new CompletableFuture<>();
            if (numberOfCalls++ == 0 && failure != null) {
                future.completeExceptionally(failure);
            } else {
                future.complete("success: " + numberOfCalls);
            }
            return future;
        }
    }
}
