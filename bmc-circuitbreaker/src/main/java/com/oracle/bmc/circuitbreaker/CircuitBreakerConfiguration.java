/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.Response;

/**
 * A {@link CircuitBreakerConfiguration} configures a {@link JaxRsCircuitBreakerImpl}
 *
 * Setting an invocation response timeout lower that the slow call threshold will bypass the intended effect of the circuit
 * breaker
 */
@Builder
public class CircuitBreakerConfiguration {

    public static final int DEFAULT_FAILURE_RATE_THRESHOLD = 50; // Percentage
    public static final int DEFAULT_SLOW_CALL_RATE_THRESHOLD = 100; // Percentage
    public static final int DEFAULT_WAIT_DURATION_IN_OPEN_STATE = 60; // Seconds
    public static final int DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE = 10;
    public static final int DEFAULT_MINIMUM_NUMBER_OF_CALLS = 100;
    public static final int DEFAULT_SLIDING_WINDOW_SIZE = 100;
    public static final int DEFAULT_SLOW_CALL_DURATION_THRESHOLD = 60; // Seconds
    public static final boolean DEFAULT_WRITABLE_STACK_TRACE_ENABLED = true;

    public static final int TOO_MANY_REQUESTS = Response.Status.TOO_MANY_REQUESTS.getStatusCode();
    public static final int INTERNAL_SERVER_ERROR =
            Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
    public static final int SERVICE_UNAVAILABLE =
            Response.Status.SERVICE_UNAVAILABLE.getStatusCode();

    @Getter @Builder.Default
    private final int failureRateThreshold = DEFAULT_FAILURE_RATE_THRESHOLD;

    @Getter @Builder.Default
    private final int slowCallRateThreshold = DEFAULT_SLOW_CALL_RATE_THRESHOLD;

    @Getter @Builder.Default
    private final Duration waitDurationInOpenState =
            Duration.ofSeconds(DEFAULT_WAIT_DURATION_IN_OPEN_STATE);

    @Getter @Builder.Default
    private final int permittedNumberOfCallsInHalfOpenState =
            DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE;

    @Getter @Builder.Default
    private final int minimumNumberOfCalls = DEFAULT_MINIMUM_NUMBER_OF_CALLS;

    @Getter @Builder.Default private final int slidingWindowSize = DEFAULT_SLIDING_WINDOW_SIZE;

    @Getter @Builder.Default
    private final Duration slowCallDurationThreshold =
            Duration.ofSeconds(DEFAULT_SLOW_CALL_DURATION_THRESHOLD);

    @Getter @Builder.Default
    private final boolean writableStackTraceEnabled = DEFAULT_WRITABLE_STACK_TRACE_ENABLED;

    /**
     * List of default http error codes to record as circuit breaker failure
     */
    @Getter @Builder.Default
    private final ImmutableSet<Integer> recordHttpStatuses =
            ImmutableSet.of(TOO_MANY_REQUESTS, INTERNAL_SERVER_ERROR, SERVICE_UNAVAILABLE);

    public static final Class<ProcessingException> PROCESSING_EXCEPTION_CLASS =
            ProcessingException.class;
    public static final Class<ServiceUnavailableException> SERVICE_UNAVAILABLE_EXCEPTION_CLASS =
            ServiceUnavailableException.class;
    public static final Class<InternalServerErrorException> INTERNAL_SERVER_ERROR_EXCEPTION_CLASS =
            InternalServerErrorException.class;

    /**
     * List of exceptions for circuitBreaker to consider as failures, we are limiting the list to subclasses of
     * RuntimeException because all JaxRs exceptions inherit from the RuntimeException
     */
    @Getter @Builder.Default
    private ImmutableList<Class<? extends RuntimeException>> recordExceptions =
            ImmutableList.of(
                    PROCESSING_EXCEPTION_CLASS,
                    SERVICE_UNAVAILABLE_EXCEPTION_CLASS,
                    INTERNAL_SERVER_ERROR_EXCEPTION_CLASS);
}
