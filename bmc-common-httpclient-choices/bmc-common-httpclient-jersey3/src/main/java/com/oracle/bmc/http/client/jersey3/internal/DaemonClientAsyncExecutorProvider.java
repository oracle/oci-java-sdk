/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.internal;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.glassfish.jersey.client.ClientAsyncExecutor;
import org.glassfish.jersey.client.internal.LocalizationMessages;
import org.glassfish.jersey.internal.util.collection.LazyValue;
import org.glassfish.jersey.internal.util.collection.Value;
import org.glassfish.jersey.internal.util.collection.Values;
import org.glassfish.jersey.spi.ThreadPoolExecutorProvider;

import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

/** Mostly copied from jersey DefaultClientAsyncExecutorProvider, but with daemon threads */
@ClientAsyncExecutor
public class DaemonClientAsyncExecutorProvider extends ThreadPoolExecutorProvider {
    private static final Logger LOGGER =
            Logger.getLogger(DaemonClientAsyncExecutorProvider.class.getName());

    private final LazyValue<Integer> asyncThreadPoolSize;

    @Inject
    public DaemonClientAsyncExecutorProvider(
            @Named("ClientAsyncThreadPoolSize") final int poolSize) {
        super("jersey-client-async-executor");

        this.asyncThreadPoolSize =
                Values.lazy(
                        new Value<Integer>() {
                            @Override
                            public Integer get() {
                                if (poolSize <= 0) {
                                    LOGGER.config(
                                            LocalizationMessages.IGNORED_ASYNC_THREADPOOL_SIZE(
                                                    poolSize));
                                    // using default
                                    return Integer.MAX_VALUE;
                                } else {
                                    LOGGER.config(
                                            LocalizationMessages.USING_FIXED_ASYNC_THREADPOOL(
                                                    poolSize));
                                    return poolSize;
                                }
                            }
                        });
    }

    @Override
    protected int getMaximumPoolSize() {
        return asyncThreadPoolSize.get();
    }

    @Override
    protected int getCorePoolSize() {
        // Mimicking the Executors.newCachedThreadPool and newFixedThreadPool configuration values.
        final Integer maximumPoolSize = getMaximumPoolSize();
        if (maximumPoolSize != Integer.MAX_VALUE) {
            return maximumPoolSize;
        } else {
            return 0;
        }
    }

    @Override
    protected ThreadFactory getBackingThreadFactory() {
        return task -> {
            Thread thread = new Thread(task);
            thread.setDaemon(true);
            return thread;
        };
    }
}
