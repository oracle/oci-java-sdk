/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.retrier.RetryConfiguration;

/**
 * This class provides configuration options for client requests.
 */
public class ClientConfiguration {
    private static final int CONNECTION_TIMEOUT_MILLIS = 10000;
    private static final int READ_TIMEOUT_MILLIS = 60000;
    private static final int MAX_ASYNC_THREADS = 50;

    /**
     * The max time to wait for a connection, in millis. Default is 10000.
     */
    private final int connectionTimeoutMillis;
    /**
     * The max time to wait for data, in millis. Default is 60000;
     */
    private final int readTimeoutMillis;
    /**
     * The max number of async threads to use. Default is 50;
     * Note: This property is only supported for Jersey default HttpUrlConnector
     * To configure connection pool for Apache client, use ApacheConnectorProperties
     */
    private final int maxAsyncThreads;

    /**
     * The retry configuration to use. Default is no retry.
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

    public static ClientConfigurationBuilder builder() {
        return new ClientConfigurationBuilder();
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public int getMaxAsyncThreads() {
        return this.maxAsyncThreads;
    }

    public RetryConfiguration getRetryConfiguration() {
        return this.retryConfiguration;
    }

    public CircuitBreakerConfiguration getCircuitBreakerConfiguration() {
        return this.circuitBreakerConfiguration;
    }

    public JaxRsCircuitBreaker getCircuitBreaker() {
        return this.circuitBreaker;
    }

    public String toString() {
        return "ClientConfiguration(connectionTimeoutMillis="
                + this.getConnectionTimeoutMillis()
                + ", readTimeoutMillis="
                + this.getReadTimeoutMillis()
                + ", maxAsyncThreads="
                + this.getMaxAsyncThreads()
                + ", retryConfiguration="
                + this.getRetryConfiguration()
                + ", circuitBreakerConfiguration="
                + this.getCircuitBreakerConfiguration()
                + ", circuitBreaker="
                + this.getCircuitBreaker()
                + ")";
    }

    public static class ClientConfigurationBuilder {
        private Integer connectionTimeoutMillis;
        private Integer readTimeoutMillis;
        private Integer maxAsyncThreads;
        private Boolean disableDataBufferingOnUpload;
        private RetryConfiguration retryConfiguration;
        private CircuitBreakerConfiguration circuitBreakerConfiguration;
        private JaxRsCircuitBreaker circuitBreaker;

        ClientConfigurationBuilder() {}

        public ClientConfigurationBuilder connectionTimeoutMillis(Integer connectionTimeoutMillis) {
            this.connectionTimeoutMillis = connectionTimeoutMillis;
            return this;
        }

        public ClientConfigurationBuilder readTimeoutMillis(Integer readTimeoutMillis) {
            this.readTimeoutMillis = readTimeoutMillis;
            return this;
        }

        public ClientConfigurationBuilder maxAsyncThreads(Integer maxAsyncThreads) {
            this.maxAsyncThreads = maxAsyncThreads;
            return this;
        }

        public ClientConfigurationBuilder disableDataBufferingOnUpload(
                Boolean disableDataBufferingOnUpload) {
            this.disableDataBufferingOnUpload = disableDataBufferingOnUpload;
            return this;
        }

        public ClientConfigurationBuilder retryConfiguration(
                RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        public ClientConfigurationBuilder circuitBreakerConfiguration(
                CircuitBreakerConfiguration circuitBreakerConfiguration) {
            this.circuitBreakerConfiguration = circuitBreakerConfiguration;
            return this;
        }

        public ClientConfigurationBuilder circuitBreaker(JaxRsCircuitBreaker circuitBreaker) {
            this.circuitBreaker = circuitBreaker;
            return this;
        }

        public ClientConfiguration build() {
            return new ClientConfiguration(
                    connectionTimeoutMillis,
                    readTimeoutMillis,
                    maxAsyncThreads,
                    disableDataBufferingOnUpload,
                    retryConfiguration,
                    circuitBreakerConfiguration,
                    circuitBreaker);
        }

        public String toString() {
            return "ClientConfiguration.ClientConfigurationBuilder(connectionTimeoutMillis="
                    + this.connectionTimeoutMillis
                    + ", readTimeoutMillis="
                    + this.readTimeoutMillis
                    + ", maxAsyncThreads="
                    + this.maxAsyncThreads
                    + ", disableDataBufferingOnUpload="
                    + this.disableDataBufferingOnUpload
                    + ", retryConfiguration="
                    + this.retryConfiguration
                    + ", circuitBreakerConfiguration="
                    + this.circuitBreakerConfiguration
                    + ", circuitBreaker="
                    + this.circuitBreaker
                    + ")";
        }
    }
}
