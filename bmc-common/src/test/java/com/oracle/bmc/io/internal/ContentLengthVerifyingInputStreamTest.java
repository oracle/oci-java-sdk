/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ContentLengthVerifyingInputStreamTest {
    private static byte[] TEST_BUFFER = "This is a test string".getBytes();

    @Test
    public void readByte_validInputStream() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER);
        while (inputStream.read() != -1) {}
    }

    @Test
    public void readBuffer_validInputStream() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER);
        byte[] buffer = new byte[8];
        while (inputStream.read(buffer) != -1) {}
    }

    @Test
    public void readOffsetBuffer_validInputStream() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER);
        byte[] buffer = new byte[1000];
        int offset = 0;
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer, offset, 2)) != -1) {
            offset += bytesRead;
        }
    }

    @Test
    public void readSkipMark_validInputStream() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER);
        performReadSkipMark(inputStream);
    }

    @Test(expected = IOException.class)
    public void readSkipMark_inputStreamShorterThanExpectedLength_shouldFail() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER, 2000);
        performReadSkipMark(inputStream);
    }

    @Test(expected = IOException.class)
    public void readBuffer_inputStreamLongerThanExpectedLength_shouldFail() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER, 2);
        byte[] buffer = new byte[10];
        while (inputStream.read(buffer) != -1) {}
    }

    @Test(expected = IOException.class)
    public void readBuffer_inputStreamShorterThanExpectedLength_shouldFail() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER, 2000);
        byte[] buffer = new byte[10];
        while (inputStream.read(buffer) != -1) {}
    }

    @Test
    public void readSkipMarkReset_inputStreamShorterThanExpectedLength_shouldSucceed()
            throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER, 2000);
        byte[] buffer = new byte[6];

        assertNotEquals(-1, inputStream.read());
        assertEquals(6, inputStream.read(buffer));
        inputStream.mark(1);
        assertEquals(3, inputStream.skip(3));
        inputStream.skip(5);
        inputStream.reset();
        while (inputStream.read() != -1) {}
    }

    private InputStream createInputStream(final byte[] buffer) {
        return createInputStream(buffer, buffer.length);
    }

    private InputStream createInputStream(final byte[] buffer, final long contentLength) {
        return new ContentLengthVerifyingInputStream(
                new ByteArrayInputStream(buffer), contentLength);
    }

    private static void performReadSkipMark(final InputStream inputStream) throws IOException {
        byte[] buffer = new byte[6];

        assertNotEquals(-1, inputStream.read());
        assertEquals(6, inputStream.read(buffer));
        inputStream.mark(1);
        assertEquals(3, inputStream.skip(3));
        inputStream.skip(5);
        assertNotEquals(-1, inputStream.read());
        assertEquals(3, inputStream.read(buffer, 2, 3));
        inputStream.mark(2);
        assertEquals(2, inputStream.read(buffer));
        while (inputStream.read() != -1) {}
    }
}
