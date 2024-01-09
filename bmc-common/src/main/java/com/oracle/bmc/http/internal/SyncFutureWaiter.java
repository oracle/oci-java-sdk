/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

/**
 * Helper class that can wait for the result of {@link #listenForResult(CompletionStage) some
 * future}, and do some work registered through the {@link Executor} interface while waiting.
 *
 * <p>The purpose of this is to make execution of synchronous methods look more synchronous, e.g.
 * stack traces should actually contain the caller.
 */
public final class SyncFutureWaiter implements Executor {
    private final Queue<Runnable> tasks = new ArrayDeque<>();

    @Override
    public synchronized void execute(Runnable command) {
        tasks.add(command);
        notifyAll();
    }

    public <R> R listenForResult(CompletionStage<R> stage) throws Throwable {
        Waiter<R> waiter = new Waiter<>();
        waiter.listenForResult(stage);
        return waiter.waitAndWork();
    }

    private class Waiter<R> {
        private boolean complete = false;
        private Throwable failure;
        private R result;

        public void listenForResult(CompletionStage<R> stage) {
            stage.whenComplete(
                    (r, t) -> {
                        if (t instanceof CompletionException) {
                            t = t.getCause();
                        }

                        synchronized (SyncFutureWaiter.this) {
                            complete = true;
                            failure = t;
                            result = r;
                            SyncFutureWaiter.this.notifyAll();
                        }
                    });
        }

        public R waitAndWork() throws InterruptedException, Throwable {
            synchronized (SyncFutureWaiter.this) {
                while (!complete) {
                    Runnable task = tasks.poll();
                    if (task == null) {
                        SyncFutureWaiter.this.wait();
                    } else {
                        task.run();
                    }
                }
                if (result == null) {
                    throw failure;
                } else {
                    return result;
                }
            }
        }
    }
}
