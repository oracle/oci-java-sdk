/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import com.oracle.bmc.http.client.internal.ClientThreadFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * It seems really unnecessary to spin up a different thread for the conversion; unfortunately,
 * without this, we might see this method throw ClosedByInterruptException. If the conversion gets
 * interrupted, and that is undesirable; by running it in another thread, the conversion doesn't get
 * interrupted.
 *
 * <p>If that is not important to you, the most efficient way would be to run the conversion in the
 * same thread; you can do that by running <code>
 * Utf8Utils.setExecutor(Utf8Utils.buildDirectExecutor());</code>
 */
public enum Utf8Utils {
    ; // no instance

    private static volatile Executor executor = buildDefaultExecutorService();

    /**
     * Build the default executor service for Utf8 conversion.
     *
     * @return thread pool executor
     */
    public static ThreadPoolExecutor buildDefaultExecutorService() {
        return new ThreadPoolExecutor(
                1,
                Math.max(1, Runtime.getRuntime().availableProcessors() - 1),
                1,
                TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(),
                ClientThreadFactory.builder().nameFormat("utf8-utils-%d").isDaemon(true).build());
    }

    /**
     * Build an executor that runs the task in the same thread.
     *
     * @return executor that runs the task in the same thread.
     */
    public static Executor buildDirectExecutor() {
        return r -> r.run();
    }

    /**
     * Set a different executor for the Utf conversion.
     *
     * @param executor
     */
    public static void setExecutor(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("executor cannot be null");
        }
        Utf8Utils.executor = executor;
    }

    /**
     * Buffer the contents of a stream into a Utf8 buffer. The contents will be erased when the
     * buffer is closed.
     *
     * @param content The content to buffer
     * @return Utf8 buffer
     * @throws IOException
     */
    static Utf8 of(ReadableByteChannel content) throws IOException {
        try (final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                final WritableByteChannel sink = Channels.newChannel(bytes)) {
            final ByteBuffer buffer = ByteBuffer.allocate(4096);

            // it seems really unnecessary to spin up a different thread for the conversion;
            // unfortunately, without this, we might see this method throw
            // ClosedByInterruptException
            // if it gets interrupted, and that is undesirable; by running it in another thread,
            // the conversion doesn't get interrupted;
            // if that is not important to you, the most efficient way would be to run the
            // conversion
            // in the same thread; you can do that by running
            //
            // Utf8Utils.setExecutor(Utf8Utils.buildDirectExecutor());
            CompletableFuture<Void> readTask =
                    CompletableFuture.runAsync(
                            () -> {
                                try {
                                    while (true) {
                                        int bytesRead = content.read(buffer);
                                        if (bytesRead == -1) {
                                            break; // End of stream
                                        }
                                        // cast is necessary to avoid NoSuchMethodError in Java 8
                                        // see
                                        // https://stackoverflow.com/questions/48693695/java-nio-buffer-not-loading-clear-method-on-runtime
                                        ((Buffer) buffer).flip();
                                        while (buffer.hasRemaining()) {
                                            sink.write(buffer); // Write to the sink channel
                                        }
                                        // cast is necessary to avoid NoSuchMethodError in Java 8
                                        // see
                                        // https://stackoverflow.com/questions/48693695/java-nio-buffer-not-loading-clear-method-on-runtime
                                        ((Buffer) buffer).clear();
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(
                                            "Error reading ReadableByteChannel content", e);
                                }
                            },
                            executor);

            // Wait for the task to complete
            readTask.join();

            // cast is necessary to avoid NoSuchMethodError in Java 8
            // see
            // https://stackoverflow.com/questions/48693695/java-nio-buffer-not-loading-clear-method-on-runtime
            ((Buffer) buffer).flip();
            while (buffer.hasRemaining()) {
                sink.write(buffer);
            }
            final byte[] buffered = bytes.toByteArray();
            try {
                return Utf8.of(buffered);
            } finally {
                Eraser.erase(buffer);
                Eraser.erase(buffered);
            }
        }
    }
}
