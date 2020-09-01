/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * This class provides configuration options for client requests.
 */
@Getter
@ToString
public class ClientConfiguration {
    private static final int CONNECTION_TIMEOUT_MILLIS = 10000;
    private static final int READ_TIMEOUT_MILLIS = 60000;
    private static final int MAX_ASYNC_THREADS = 50;

    /**
     * The max time to wait for a connection, in millis.  Default is 10000.
     */
    private final int connectionTimeoutMillis;
    /**
     * The max time to wait for data, in millis.  Default is 60000;
     */
    private final int readTimeoutMillis;
    /**
     * The max number of async threads to use.  Default is 50;
     */
    private final int maxAsyncThreads;

    /**
     * The retry configuration to use.  Default is no retry.
     */
    private final RetryConfiguration retryConfiguration;

    /**
     * The circuit-breaker configuration to use. Default is no circuit-breaker.
     */
    private final CircuitBreakerConfiguration circuitBreakerConfiguration;

    /**
     * The circuit-breaker to use. Default is no circuit-breaker.
     */
    private final JaxRsCircuitBreaker circuitBreaker;

    // Explicit @Builder on constructor so we can enforce default values.
    @Builder
    private ClientConfiguration(
            Integer connectionTimeoutMillis,
            Integer readTimeoutMillis,
            Integer maxAsyncThreads,
            Boolean disableDataBufferingOnUpload,
            RetryConfiguration retryConfiguration,
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            JaxRsCircuitBreaker circuitBreaker) {

        if (circuitBreakerConfiguration != null && circuitBreaker != null) {
            throw new IllegalArgumentException(
                    "Invalid CircuitBreaker setting. Please provide either CircuitBreaker configuration or CircuitBreaker and not both");
        }

        this.connectionTimeoutMillis =
                getOrDefault(connectionTimeoutMillis, CONNECTION_TIMEOUT_MILLIS);
        this.readTimeoutMillis = getOrDefault(readTimeoutMillis, READ_TIMEOUT_MILLIS);
        this.maxAsyncThreads = getOrDefault(maxAsyncThreads, MAX_ASYNC_THREADS);
        this.retryConfiguration = retryConfiguration;
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        this.circuitBreaker = circuitBreaker;
    }

    private static <T> T getOrDefault(T value, T defaultValue) {
        return (value == null) ? defaultValue : value;
    }
}
