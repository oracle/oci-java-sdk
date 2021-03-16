/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ThreadLocalRandom;

public class FailingInputStreamTest {

    /**
     * Used by all tests in the class. Individual tests should not modify this.
     */
    private static byte[] data;

    /**
     * New one created for each test.
     */
    private InputStream wrappedStream;

    @BeforeClass
    public static void setupClass() {
        data = new byte[100];
        ThreadLocalRandom.current().nextBytes(data);
    }

    @Before
    public void setup() {
        wrappedStream = new ByteArrayInputStream(data);
    }

    @Test
    public void read() throws Exception {
        final InputStream s = new FailingInputStream(NoFailureInjector.INSTANCE, wrappedStream);
        Assert.assertEquals(s.read(), Byte.toUnsignedInt(data[0]));
    }

    @Test
    public void readBytes() throws Exception {
        final InputStream s = new FailingInputStream(NoFailureInjector.INSTANCE, wrappedStream);

        final byte[] buffer = new byte[data.length];
        s.read(buffer);
        Assert.assertArrayEquals(buffer, data);
    }

    @Test
    public void readBytes2() throws Exception {
        final InputStream s = new FailingInputStream(NoFailureInjector.INSTANCE, wrappedStream);

        final byte[] buffer = new byte[data.length];
        s.read(buffer, 0, buffer.length);
        Assert.assertArrayEquals(buffer, data);
    }

    @Test
    public void readFails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, 1);
        final InputStream s = new FailingInputStream(failureInjector, wrappedStream);
        try {
            s.read();
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }

        // read should work now
        Assert.assertEquals(s.read(), Byte.toUnsignedInt(data[0]));
    }

    @Test
    public void readBytesFails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, 1);
        final InputStream s = new FailingInputStream(failureInjector, wrappedStream);
        final byte[] buffer = new byte[data.length];
        try {
            s.read(buffer);
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }

        // read should work now
        s.read(buffer);
        Assert.assertArrayEquals(buffer, data);
    }

    @Test
    public void readBytes2Fails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, 1);
        final InputStream s = new FailingInputStream(failureInjector, wrappedStream);
        final byte[] buffer = new byte[data.length];
        try {
            s.read(buffer, 0, buffer.length);
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }

        // read should work now
        s.read(buffer, 0, buffer.length);
        Assert.assertArrayEquals(buffer, data);
    }
}
