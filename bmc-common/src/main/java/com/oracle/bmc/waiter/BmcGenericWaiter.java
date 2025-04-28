/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.oracle.bmc.model.BmcException;

/**
 * BmcGenericWaiter is a Waiter that provides a generic foundation to build more custom waiters for
 * specific types of calls.
 */
public class BmcGenericWaiter {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BmcGenericWaiter.class);
    private final GenericWaiter waiter;

    /**
     * Creates a new waiter with the given strategies.
     *
     * @param terminationStrategy The termination strategy to use.
     * @param delayStrategy The delay strategy to use.
     */
    public BmcGenericWaiter(TerminationStrategy terminationStrategy, DelayStrategy delayStrategy) {
        WaiterConfiguration waiterConfig =
                new WaiterConfiguration(terminationStrategy, delayStrategy);
        this.waiter = new GenericWaiter(waiterConfig);
    }

    /**
     * Blocks until a specific condition is met.
     *
     * <p>If the <code>allow404</code> param is set to true, the waiter will return null if the
     * request fails with a 404 exception.
     *
     * @param requestSupplier Supplier that provides a new request instance to fetch the current
     *     state.
     * @param functionCall Function that will be invoked to fetch the current state. It will be
     *     provided the request instance given by the requestSupplier.
     * @param terminationPredicate The termination predicate that will inspect the current state
     *     (returned response instance) to determine if it is done waiting.
     * @param allow404 True to allow 404 responses to be accepted (ex, for termination conditions).
     * @param <REQUEST> Request object class
     * @param <RESPONSE> Response object class
     * @return The last response object that was received and was accepted by the termination
     *     predicate (or null if 404 was allowed).
     * @throws WaitConditionFailedException If the termination condition was not met.
     */
    public <REQUEST, RESPONSE> RESPONSE execute(
            Supplier<REQUEST> requestSupplier,
            Function<REQUEST, RESPONSE> functionCall,
            Predicate<RESPONSE> terminationPredicate,
            boolean allow404)
            throws WaitConditionFailedException {
        LOG.debug("Invoking waiter with 404 allowed set to {}", allow404);
        try {
            Optional<RESPONSE> response =
                    waiter.execute(requestSupplier, functionCall, terminationPredicate);
            if (response.isPresent()) {
                return response.get();
            }
        } catch (BmcException e) {
            if (e.getStatusCode() == 404) {
                if (allow404) {
                    LOG.debug("Allowing 404 response");
                    return null;
                }
                LOG.debug("Received 404, waiter configured not to allow it");
            }
            throw e;
        }

        throw new WaitConditionFailedException("Failed to reach desired condition");
    }

    /**
     * Same as {@link #execute(Supplier, Function, Predicate, boolean)} except it returns a {@link
     * Callable} that can be invoked later.
     *
     * @param requestSupplier Supplier that provides a new request instance to fetch the current
     *     state.
     * @param functionCall Function that will be invoked to fetch the current state. It will be
     *     provided the request instance given by the requestSupplier.
     * @param terminationPredicate The termination predicate that will inspect the current state
     *     (returned response instance) to determine if it is done waiting.
     * @param allow404 True to allow 404 responses to be accepted (ex, for termination conditions).
     * @param <REQUEST> Request object class
     * @param <RESPONSE> Response object class
     * @return The last response object that was received and was accepted by the termination
     *     predicate (or null if 404 was allowed).
     * @return A new Callable instance.
     */
    public <REQUEST, RESPONSE> Callable<RESPONSE> toCallable(
            final Supplier<REQUEST> requestSupplier,
            final Function<REQUEST, RESPONSE> functionCall,
            final Predicate<RESPONSE> terminationPredicate,
            final boolean allow404) {
        return () -> execute(requestSupplier, functionCall, terminationPredicate, allow404);
    }

    /**
     * Exception indicating the the condition being waited on was not met before the termination
     * condition was satisfied.
     */
    public static final class WaitConditionFailedException extends Exception {
        private WaitConditionFailedException(String message) {
            super(message);
        }
    }
}
