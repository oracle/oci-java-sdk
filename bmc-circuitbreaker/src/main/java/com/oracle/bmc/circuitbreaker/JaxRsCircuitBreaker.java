/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

/**
 * JaxRsCircuitBreaker is a specialized CircuitBreaker for JaxRs client
 */
public interface JaxRsCircuitBreaker {

    /**
     * Returns a supplier which is decorated by the JaxRsCircuitBreaker.
     *
     * @param supplier the original supplier
     * @return a supplier which is decorated by the JaxRsCircuitBreaker.
     */
    Supplier<Response> decorateSupplier(Supplier<Response> supplier);

    /**
     * Returns a function which is decorated by the JaxRsCircuitBreaker.
     *
     * @param function the original function
     * @return a function which is decorated by the JaxRsCircuitBreaker.
     */
    Function<Invocation, Response> decorateFunction(Function<Invocation, Response> function);

    /**
     * Returns a supplier of type Future which is decorated by the JaxRsCircuitBreaker. The elapsed time
     * includes {@link Future#get()} evaluation time even if the underlying call took less time to
     * return. Any delays in evaluating Future by caller will add towards total time.
     *
     * @param supplier the original supplier
     * @return a supplier which is decorated by the JaxRsCircuitBreaker.
     */
    Supplier<Future<Response>> decorateFuture(Supplier<Future<Response>> supplier);

    /**
     * Returns the state of this CircuitBreaker.
     *
     * @return the state of this CircuitBreaker
     */
    CircuitBreakerState getState();

    /**
     * Returns the default configuration of the CircuitBreaker
     *
     * @return the internal configuration of the CircuitBreaker
     */
    CircuitBreakerConfig getInternalCircuitBreakerConfig();

    /**
     * Returns the error history of CircuitBreaker which caused the change in state.
     *
     * @return the error history as a concatenated string
     */
    String getHistory();
}
