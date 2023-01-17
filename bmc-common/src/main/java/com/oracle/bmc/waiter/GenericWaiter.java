/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Provides a basic waiter that will periodically poll for an update until a desired condition is
 * met.
 */
public class GenericWaiter {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenericWaiter.class);
    private final WaiterConfiguration waiterConfiguration;

    /**
     * Blocks until a specific condition is met.
     *
     * @param requestSupplier Supplier that provides a new request instance to fetch the current
     *     state.
     * @param functionCall Function that will be invoked to fetch the current state. It will be
     *     provided the request instance given by the requestSupplier.
     * @param terminationPredicate The termination predicate that will inspect the current state
     *     (returned response instance) to determine if it is done waiting.
     * @param <REQUEST> Request object class
     * @param <RESPONSE> Response object class
     * @return The last response object that was received and was accepted by the termination
     *     predicate, or empty if the waiter reached the max timeout.
     */
    public <REQUEST, RESPONSE> Optional<RESPONSE> execute(
            Supplier<REQUEST> requestSupplier,
            Function<REQUEST, RESPONSE> functionCall,
            Predicate<RESPONSE> terminationPredicate) {
        WaitContext context = new WaitContext(System.currentTimeMillis());
        RESPONSE r = null;
        while (true) {
            LOG.debug("Invoking function call");
            r = functionCall.apply(requestSupplier.get());
            if (terminationPredicate.test(r)) {
                LOG.debug(
                        "Total Latency for this API call is: {}ms",
                        (context.getCurrentTime() - context.getStartTime()));
                return Optional.of(r);
            }
            context.incrementAttempts();
            context.setCurrentTime(System.currentTimeMillis());

            LOG.debug("Retry attempt: {}", context.getAttemptsMade());
            if (waiterConfiguration.getTerminationStrategy().shouldTerminate(context)) {
                LOG.debug("Termination strategy decided to terminate with context at: {}", context);
                break;
            }

            try {
                long sleepTime = waiterConfiguration.getDelayStrategy().nextDelay(context);
                LOG.debug("Sleeping for {}ms, context at: {}", sleepTime, context);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                LOG.info("Waiter interrupted");
                Thread.currentThread().interrupt();
                return Optional.empty();
            }
        }
        LOG.debug(
                "Total Latency for this API call is: {}ms",
                (context.getCurrentTime() - context.getStartTime()));
        return Optional.empty();
    }

    @java.beans.ConstructorProperties({"waiterConfiguration"})
    public GenericWaiter(final WaiterConfiguration waiterConfiguration) {
        this.waiterConfiguration = waiterConfiguration;
    }

    public WaiterConfiguration getWaiterConfiguration() {
        return this.waiterConfiguration;
    }

    public <T> CompletionStage<java.util.Optional<T>> executeAsync(
            WaiterScheduler runner,
            java.util.function.Supplier<CompletionStage<T>> downstream,
            java.util.function.Predicate<T> terminationPredicate) {
        WaitContext context = new WaitContext(System.currentTimeMillis());
        return executeAsync(runner, downstream, terminationPredicate, context);
    }

    private <T> CompletionStage<java.util.Optional<T>> executeAsync(
            WaiterScheduler runner,
            java.util.function.Supplier<CompletionStage<T>> upstream,
            java.util.function.Predicate<T> terminationPredicate,
            WaitContext context) {
        LOG.debug("Invoking function call");
        CompletionStage<T> stage;
        try {
            stage = upstream.get();
        } catch (Exception e) {
            return failedFuture(e);
        }
        return stage.thenCompose(
                result -> {
                    if (terminationPredicate.test(result)) {
                        return CompletableFuture.completedFuture(java.util.Optional.of(result));
                    }
                    context.incrementAttempts();
                    context.setCurrentTime(System.currentTimeMillis());
                    if (waiterConfiguration.getTerminationStrategy().shouldTerminate(context)) {
                        LOG.debug(
                                "Termination strategy decided to terminate with context at: {}",
                                context);
                        return CompletableFuture.completedFuture(java.util.Optional.empty());
                    }
                    long sleepTime = waiterConfiguration.getDelayStrategy().nextDelay(context);
                    if (sleepTime == 0) {
                        LOG.debug(
                                "Retrying immediately (sleep time 0ms), context at: {}",
                                sleepTime,
                                context);
                        return executeAsync(runner, upstream, terminationPredicate, context);
                    } else {
                        LOG.debug("Sleeping for {}ms, context at: {}", sleepTime, context);
                        CancellableCompletableFuture<java.util.Optional<T>> delayedFuture =
                                new CancellableCompletableFuture<>();
                        delayedFuture.upstreamFuture =
                                runner.schedule(
                                        () -> {
                                            if (delayedFuture.isCancelled()) {
                                                return;
                                            }
                                            executeAsync(
                                                            runner,
                                                            upstream,
                                                            terminationPredicate,
                                                            context)
                                                    .whenComplete(
                                                            (r, t) -> {
                                                                if (t == null) {
                                                                    delayedFuture.complete(r);
                                                                } else {
                                                                    delayedFuture
                                                                            .completeExceptionally(
                                                                                    t);
                                                                }
                                                            });
                                        },
                                        sleepTime,
                                        TimeUnit.MILLISECONDS);
                        return delayedFuture;
                    }
                });
    }

    private static <T> CompletionStage<T> failedFuture(Throwable t) {
        CompletableFuture<T> res = new CompletableFuture<>();
        res.completeExceptionally(t);
        return res;
    }

    private static class CancellableCompletableFuture<T> extends CompletableFuture<T> {
        volatile Future<?> upstreamFuture;

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled) {
                Future<?> upstreamFuture = this.upstreamFuture;
                if (upstreamFuture != null) {
                    upstreamFuture.cancel(mayInterruptIfRunning);
                }
            }
            return cancelled;
        }
    }
}
