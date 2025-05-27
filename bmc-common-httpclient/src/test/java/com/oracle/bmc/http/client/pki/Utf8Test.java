/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Unit tests for {@link Utf8} */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Utf8Test {

    @Before
    public void setUp() {
        Utf8Utils.setExecutor(Utf8Utils.buildDefaultExecutorService());
    }

    @Test
    public void testTrim() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        assertEquals("Hello World", Text.of(utf8.trim()));
    }

    @Test
    public void testContains() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final boolean actual = utf8.contains("Hello");
        assertTrue(actual);
    }

    @Test
    public void testIndexOfNotFound() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final int actual = utf8.indexOf("Hallo");
        assertEquals(-1, actual);
    }

    @Test
    public void testRemoveWhitespace() {
        final String input = " Hello World\nAgain\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final Utf8 actual = utf8.removeWhitespace();
        assertEquals("HelloWorldAgain", Text.of(actual));
    }

    @Test
    public void testWithChannel() throws IOException {
        ReadableByteChannel channel =
                Channels.newChannel(new ByteArrayInputStream("Hello world!".getBytes()));
        Utf8 utf8 = Utf8.of(channel);
        assertEquals("Hello world!", Text.of(utf8));
    }

    @Test(timeout = 5_000)
    public void testWithChannel_Interrupted() throws IOException, InterruptedException {
        AtomicBoolean shouldStop = new AtomicBoolean(false);

        InputStream infiniteStream =
                new InputStream() {
                    @Override
                    public int read() throws IOException {
                        if (shouldStop.get()) {
                            return -1;
                        }
                        return 'A';
                    }
                };

        final AtomicBoolean threwClosedByInterruptException = new AtomicBoolean(false);

        Thread t =
                new Thread(
                        () -> {
                            ReadableByteChannel channel = Channels.newChannel(infiniteStream);
                            try {
                                Utf8 utf8 = Utf8.of(channel);
                            } catch (ClosedByInterruptException cbie) {
                                threwClosedByInterruptException.set(true);
                                throw new RuntimeException(cbie);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
        t.start();

        Thread.sleep(500);
        t.interrupt();

        Thread.sleep(500);

        shouldStop.set(true);

        Thread.sleep(500);

        assertFalse(threwClosedByInterruptException.get());
    }

    /** * "zzz" to have this run last. It can otherwise mess up the other tests. */
    @Test(timeout = 15_000)
    public void zzz_testWithChannel_Blocked() {
        int size = Math.max(1, Runtime.getRuntime().availableProcessors() - 1) + 1;

        final Object lock = new Object();
        final AtomicInteger tasksLaunched = new AtomicInteger(0);

        List<Integer> taskNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            taskNumbers.add(i);
        }

        taskNumbers
                .parallelStream()
                .forEach(
                        taskNumber -> {
                            tasksLaunched.incrementAndGet();
                            synchronized (lock) {
                                while (tasksLaunched.get() < size) {
                                    try {
                                        // not all tasks launched, waiting for more...
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                }

                                // All tasks launched, but only one thread can have the lock; now
                                // all the other threads are waiting for
                                // the lock, this one is running, but it's about to enqueue another
                                // task in the Utf8.of() call.
                                // If Utf8.of() enqueues that task in the same pool, then it will
                                // wait forever and deadlock.
                                try {
                                    ReadableByteChannel channel =
                                            Channels.newChannel(
                                                    new ByteArrayInputStream(
                                                            "Hello world!".getBytes()));
                                    Utf8 utf8 = Utf8.of(channel);
                                    assertEquals("Hello world!", Text.of(utf8));
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
    }
}
