/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.internal;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

import static java.lang.String.format;

/** A thread factory for use in clients. */
public class ClientThreadFactory implements ThreadFactory {
    private final String nameFormat;
    private final Boolean isDaemon;
    private final AtomicLong count = new AtomicLong(0);

    private ClientThreadFactory(String nameFormat, Boolean isDaemon) {
        Objects.requireNonNull(nameFormat, "nameFormat cannot be null");
        this.nameFormat = nameFormat;
        this.isDaemon = isDaemon;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = Executors.defaultThreadFactory().newThread(runnable);
        if (nameFormat != null) {
            thread.setName(format(nameFormat, count.getAndIncrement()));
        }
        if (isDaemon != null) {
            thread.setDaemon(isDaemon);
        }
        return thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nameFormat;
        private Boolean isDaemon;

        public Builder isDaemon(boolean isDaemon) {
            this.isDaemon = isDaemon;
            return this;
        }

        public Builder nameFormat(String nameFormat) {
            this.nameFormat = nameFormat;
            return this;
        }

        public ClientThreadFactory build() {
            if (nameFormat.isEmpty()) {
                throw new NullPointerException("nameFormat must not be blank");
            }
            return new ClientThreadFactory(nameFormat, isDaemon);
        }
    }
}
