/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;

import java.time.Duration;

/**
 * The CircuitBreakerEventListener interface provides a way to listen to events emitted by a Circuit Breaker.
 * Implementations of this interface can be used to react to various events, such as successful calls, errors,
 * state transitions, and more.
 */
public interface CircuitBreakerEventListener {

    /**
     * Called when a call is successful.
     *
     * @param duration the duration of the successful call
     */
    void onSuccess(Duration duration);

    /**
     * Called when a call fails with an error.
     *
     * @param throwable the error that occurred
     */
    void onError(Throwable throwable);

    /**
     * Called when the Circuit Breaker transitions to a new state.
     *
     * @param stateTransition the state transition that occurred
     */
    void onStateTransition(CircuitBreaker.StateTransition stateTransition);

    /**
     * Called when the Circuit Breaker is reset.
     */
    void onReset();

    /**
     * Called when a call is not permitted because the Circuit Breaker is in an open state.
     */
    void onCallNotPermitted();

    /**
     * Called when the failure rate exceeds the configured threshold.
     */
    void onFailureRateExceeded();
}
