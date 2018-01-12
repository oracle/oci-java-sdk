/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

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

    // Explicit @Builder on constructor so we can enforce default values.
    @Builder
    private ClientConfiguration(
            Integer connectionTimeoutMillis,
            Integer readTimeoutMillis,
            Integer maxAsyncThreads,
            Boolean disableDataBufferingOnUpload) {
        this.connectionTimeoutMillis =
                getOrDefault(connectionTimeoutMillis, CONNECTION_TIMEOUT_MILLIS);
        this.readTimeoutMillis = getOrDefault(readTimeoutMillis, READ_TIMEOUT_MILLIS);
        this.maxAsyncThreads = getOrDefault(maxAsyncThreads, MAX_ASYNC_THREADS);
    }

    private static <T> T getOrDefault(T value, T defaultValue) {
        return (value == null) ? defaultValue : value;
    }
}
