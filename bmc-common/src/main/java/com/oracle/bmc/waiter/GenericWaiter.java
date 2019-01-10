/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Provides a basic waiter that will periodically poll for an update until a
 * desired condition is met.
 */
@Slf4j
@RequiredArgsConstructor
public class GenericWaiter {
    private final WaiterConfiguration waiterConfiguration;

    /**
     * Blocks until a specific condition is met.
     *
     * @param requestSupplier
     *            Supplier that provides a new request instance to fetch the
     *            current state.
     * @param functionCall
     *            Function that will be invoked to fetch the current state. It
     *            will be provided the request instance given by the
     *            requestSupplier.
     * @param terminationPredicate
     *            The termination predicate that will inspect the current state
     *            (returned response instance) to determine if it is done
     *            waiting.
     * @param <REQUEST>
     *            Request object class
     * @param <RESPONSE>
     *            Response object class
     * @return The last response object that was received and was accepted by
     *         the termination predicate, or empty if the waiter reached the max
     *         timeout.
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
            if (terminationPredicate.apply(r)) {
                return Optional.of(r);
            }
            context.incrementAttempts();
            context.setCurrentTime(System.currentTimeMillis());

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
                return Optional.absent();
            }
        }

        return Optional.absent();
    }
}
