/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AutoCloseableContentLengthVerifyingInputStreamTest {
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
    public void readBuffer_inputStreamShorterThanExpectedLength_shouldFail() throws IOException {
        final InputStream inputStream = createInputStream(TEST_BUFFER, 2000);
        byte[] buffer = new byte[10];
        while (inputStream.read(buffer) != -1) {}
    }

    @Test(expected = IOException.class)
    public void readSkipMarkReset_inputStreamShorterThanExpectedLength_shouldFail()
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

    @Test
    public void readContentLengthBytes_shouldAutoCloseStream() throws IOException {
        // The stream should be auto-closed when after reading content length bytes of the stream
        // This test has been added to verify the behavior to release the connection from the Apache connection pool,
        // when the stream has been read
        final InputStream inputStream = createInputStream(TEST_BUFFER, TEST_BUFFER.length);
        final InputStream spiedInputStream = Mockito.spy(inputStream);
        byte[] buffer = new byte[TEST_BUFFER.length];
        for (int i = 0; i < TEST_BUFFER.length; i++) {
            buffer[i] = (byte) spiedInputStream.read();
        }
        Mockito.verify(spiedInputStream).close();
        // Should return -1  every time read is called after reading content-length bytes
        Assert.assertEquals(spiedInputStream.read(), -1);
        Assert.assertEquals(spiedInputStream.read(), -1);
    }

    @Test
    public void readContentLengthBytesIntoBuffer_shouldAutoCloseStream() throws IOException {
        // The stream should be auto-closed when after reading content length bytes of the stream
        // This test has been added to verify the behavior to release the connection from the Apache connection pool,
        // when the stream has been read
        final InputStream inputStream = createInputStream(TEST_BUFFER, TEST_BUFFER.length);
        final InputStream spiedInputStream = Mockito.spy(inputStream);
        byte[] buffer = new byte[TEST_BUFFER.length];
        while (spiedInputStream.read(buffer) != -1) {}

        Mockito.verify(spiedInputStream).close();
        // Should return -1  every time read is called after reading content-length bytes
        Assert.assertEquals(spiedInputStream.read(), -1);
        Assert.assertEquals(spiedInputStream.read(), -1);
    }

    @Test
    public void readMoreThanContentLengthBytesIntoBuffer_shouldAutoCloseStream()
            throws IOException {
        // The stream should be auto-closed when after reading content length bytes of the stream
        // This test has been added to verify the behavior to release the connection from the Apache connection pool,
        // when the stream has been read
        final InputStream inputStream = createInputStream(TEST_BUFFER, TEST_BUFFER.length);
        final InputStream spiedInputStream = Mockito.spy(inputStream);
        byte[] buffer = new byte[TEST_BUFFER.length];
        int totalBytes = 0;
        while (totalBytes < TEST_BUFFER.length) {
            totalBytes += spiedInputStream.read(buffer);
        }
        Mockito.verify(spiedInputStream).close();
        // Should return -1  every time read is called after reading content-length bytes
        Assert.assertEquals(spiedInputStream.read(), -1);
        Assert.assertEquals(spiedInputStream.read(), -1);
    }

    @Test
    public void readMoreThanContentLengthBytes_shouldAutoCloseStream() throws IOException {
        // The stream should be auto-closed when the stream has been read till -1
        // This test has been added to verify the behavior to release the connection from the Apache connection pool,
        // when the stream has been read
        final InputStream inputStream = createInputStream(TEST_BUFFER, TEST_BUFFER.length);
        final InputStream spiedInputStream = Mockito.spy(inputStream);
        while (spiedInputStream.read() != -1) {}
        Mockito.verify(spiedInputStream).close();
        // Should return -1  every time read is called after reading content-length bytes
        Assert.assertEquals(spiedInputStream.read(), -1);
        Assert.assertEquals(spiedInputStream.read(), -1);
    }

    private InputStream createInputStream(final byte[] buffer) {
        return createInputStream(buffer, buffer.length);
    }

    private InputStream createInputStream(final byte[] buffer, final long contentLength) {
        return new AutoCloseableContentLengthVerifyingInputStream(
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
