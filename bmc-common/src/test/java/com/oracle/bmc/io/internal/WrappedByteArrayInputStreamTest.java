/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

@SuppressWarnings("resource") // no need to close any streams here
public class WrappedByteArrayInputStreamTest {

    @Test
    public void length() {
        byte[] buffer = new byte[35];

        WrappedByteArrayInputStream stream = new WrappedByteArrayInputStream(buffer);
        assertEquals(35, stream.length());
    }

    @Test
    public void duplicate() throws IOException {
        byte[] buffer = new byte[35];
        buffer[5] = 'c';
        buffer[8] = 'd';

        WrappedByteArrayInputStream stream1 = new WrappedByteArrayInputStream(buffer);
        byte[] stream1buffer = new byte[10];
        int read1 = stream1.read(stream1buffer);
        assertEquals(10, read1);

        WrappedByteArrayInputStream stream2 = (WrappedByteArrayInputStream) stream1.duplicate();
        byte[] stream2buffer = new byte[10];
        int read2 = stream2.read(stream2buffer);
        assertEquals(10, read2);

        for (int i = 0; i < 10; i++) {
            assertEquals(buffer[i], stream1buffer[i]);
            assertEquals(buffer[i], stream2buffer[i]);
        }
    }
}
