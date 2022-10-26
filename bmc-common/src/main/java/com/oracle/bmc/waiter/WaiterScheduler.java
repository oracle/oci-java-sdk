/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Abstraction for {@link GenericWaiter} to implement the "schedule" functionality to implement
 * asynchronous waiting. Basically a cut down version of {@link ScheduledExecutorService}, with only
 * the {@link ScheduledExecutorService#schedule(Runnable, long, TimeUnit)} method.
 */
public interface WaiterScheduler {
    /**
     * A {@link WaiterScheduler} where waiting is not supported. Always throws an exception. {@link
     * GenericWaiter} will still succeed if the wait delay is configured as 0, but not if it's
     * positive.
     */
    WaiterScheduler UNSUPPORTED =
            new WaiterScheduler() {
                @Override
                public Future<?> schedule(Runnable command, long time, TimeUnit unit) {
                    throw new UnsupportedOperationException(
                            "Delays not supported for async waiter (no scheduler given)");
                }
            };
    /**
     * Scheduler implementation that blocks in the {@link #schedule} method for the given time to
     * pass. This removes the need for a separate threaded scheduler. {@link GenericWaiter} can
     * handle the case where {@link #schedule} blocks, so this will not deadlock or anything.
     */
    WaiterScheduler SYNC =
            new WaiterScheduler() {
                private final Future<?> completed = CompletableFuture.completedFuture(null);

                @Override
                public Future<?> schedule(Runnable command, long time, TimeUnit unit) {
                    try {
                        unit.sleep(time);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    command.run();
                    return completed;
                }
            };

    /**
     * Create a new instance from the given {@link ScheduledExecutorService}. Tasks will be run on
     * that executor.
     */
    static WaiterScheduler fromService(ScheduledExecutorService service) {
        return service::schedule;
    }

    Future<?> schedule(Runnable command, long time, TimeUnit unit);
}
