/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.slf4j.Logger;

import java.time.Duration;

/**
 * The default class that implements the {@link CircuitBreakerEventListener} interface.
 * This class provides a basic implementation of the listener methods, logging events at the DEBUG level.
 * It can be extended to provide custom implementations for specific events.
 */
public class DefaultCircuitBreakerEventListener implements CircuitBreakerEventListener {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DefaultCircuitBreakerEventListener.class);

    /**
     * Called when a circuit breaker call is successful.
     * Logs the duration of the call at the DEBUG level.
     *
     * @param duration the duration of the successful call
     */
    @Override
    public void onSuccess(Duration duration) {
        LOG.debug("Success: {}ms", duration.toMillis());
    }

    /**
     * Called when a circuit breaker call results in an error.
     * Logs the error message and the throwable at the DEBUG level.
     *
     * @param throwable the throwable that caused the error
     */
    @Override
    public void onError(Throwable throwable) {
        LOG.debug("Error: {}", throwable.getMessage(), throwable);
    }

    /**
     * Called when the circuit breaker state changes.
     * Logs the state transition at the DEBUG level.
     *
     * @param stateTransition the state transition that occurred
     */
    @Override
    public void onStateTransition(CircuitBreaker.StateTransition stateTransition) {
        LOG.debug(
                "State transition: {} -> {}",
                stateTransition.getFromState(),
                stateTransition.getToState());
    }

    /**
     * Called when a call is not permitted due to the circuit breaker being open or half-open.
     * Logs a message at the DEBUG level.
     */
    @Override
    public void onCallNotPermitted() {
        LOG.debug("Call not permitted");
    }

    /**
     * Called when the circuit breaker is reset.
     * Logs a message at the DEBUG level.
     */
    @Override
    public void onReset() {
        LOG.debug("Circuit breaker reset");
    }

    /**
     * Called when the failure rate exceeds the configured threshold.
     * Logs a message at the DEBUG level.
     */
    @Override
    public void onFailureRateExceeded() {
        LOG.debug("Failure rate exceeded");
    }
}
