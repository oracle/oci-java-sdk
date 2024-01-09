/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.io.internal;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthLimitedInputStreamTest {

    private static final int MiB = 1024 * 1024;
    private static final int GiB = 1024 * 1024 * 1024;
    private static final long TEST_INPUT_STREAM_LENGTH = 7L * GiB;
    private static final long SMALL_INPUT_STREAM_LENGTH_TO_READ = GiB;
    private static final long LARGE_INPUT_STREAM_LENGTH_TO_READ = 3L * GiB;
    private static final int BUFFER_SIZE = 256 * MiB;
    private static final byte[] BUFFER = new byte[BUFFER_SIZE];

    @Test
    public void testLengthLimitedInputStream_WithRead() throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        int noOfReadsPerformed = 0;
        while (inputStream.read() != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(SMALL_INPUT_STREAM_LENGTH_TO_READ, noOfReadsPerformed);
        assertEquals(-1, inputStream.read());
    }

    @Test
    public void testLengthLimitedInputStream_WithRead_LengthToReadGreaterThanIntegerMaxValue()
            throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        LARGE_INPUT_STREAM_LENGTH_TO_READ);

        long noOfReadsPerformed = 0;
        while (inputStream.read() != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(LARGE_INPUT_STREAM_LENGTH_TO_READ, noOfReadsPerformed);
        assertEquals(-1, inputStream.read());
    }

    @Test
    public void testLengthLimitedInputStream_WithRead_LengthToReadGreaterThanTotalStreamLength()
            throws IOException {
        long lengthOfStreamToRead = 16L * GiB;
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH), lengthOfStreamToRead);

        long noOfReadsPerformed = 0;
        while (inputStream.read() != -1) {
            noOfReadsPerformed++;
        }
        assertNotEquals(lengthOfStreamToRead, noOfReadsPerformed);
        assertEquals(TEST_INPUT_STREAM_LENGTH, noOfReadsPerformed);
        assertEquals(-1, inputStream.read());
    }

    @Test
    public void testLengthLimitedInputStream_WithReadBuffer() throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER) != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(
                (int) Math.ceil((double) SMALL_INPUT_STREAM_LENGTH_TO_READ / BUFFER_SIZE),
                noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));

        inputStream.reset();

        // `n` read(buffer) operations, each with buffer size 256 MiB, were performed to read 1 GiB
        // data
        // before reaching the end of stream, where n is the number of reads performed.
        for (int i = 0; i < noOfReadsPerformed; i++) {
            assertEquals(BUFFER_SIZE, inputStream.read(BUFFER));
        }
        assertEquals(-1, inputStream.read(BUFFER));
    }

    @Test
    public void testLengthLimitedInputStream_WithReadBuffer_LengthToReadGreaterThanIntegerMaxValue()
            throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        LARGE_INPUT_STREAM_LENGTH_TO_READ);
        assertEquals(Integer.MAX_VALUE, inputStream.available());

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER) != -1) {
            noOfReadsPerformed++;
        }

        assertEquals(
                (int) Math.ceil((double) LARGE_INPUT_STREAM_LENGTH_TO_READ / BUFFER_SIZE),
                noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));

        inputStream.reset();

        // `n` read(buffer) operations, each with buffer size 256 MiB, were performed to read `x`
        // GiB data
        // before reaching the end of stream, where and `n` is the number of reads performed and
        // `x` is Integer.MAX_VALUE of bytes i.e 2147483647 bytes (~2 GiB data)
        for (int i = 0; i < noOfReadsPerformed; i++) {
            assertEquals(BUFFER_SIZE, inputStream.read(BUFFER));
        }
        assertEquals(-1, inputStream.read(BUFFER));
    }

    @Test
    public void testLengthLimitedInputStream_ReadBufferWithOffset() throws IOException {
        int offset = 0;
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER, offset, BUFFER.length) != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(
                (int) Math.ceil((double) SMALL_INPUT_STREAM_LENGTH_TO_READ / BUFFER_SIZE),
                noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));

        inputStream.reset();

        // `n` read(buffer, offset, length) operations, each with buffer size 256 MiB, were
        // performed
        // to read 1 GiB data before reaching the end of stream, where n is the number of reads
        // performed.
        for (int i = 0; i < noOfReadsPerformed; i++) {
            assertEquals(BUFFER_SIZE, inputStream.read(BUFFER));
        }
        assertEquals(-1, inputStream.read(BUFFER));
    }

    @Test
    public void
            testLengthLimitedInputStream_ReadBufferWithOffset_LengthToReadGreaterThanIntegerMaxValue()
                    throws IOException {
        int offset = 0;
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        LARGE_INPUT_STREAM_LENGTH_TO_READ);
        assertEquals(Integer.MAX_VALUE, inputStream.available());

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER, offset, BUFFER.length) != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(
                (int) Math.ceil((double) LARGE_INPUT_STREAM_LENGTH_TO_READ / BUFFER_SIZE),
                noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));

        inputStream.reset();

        // `n` read(buffer) operations, each with buffer size 256 MiB, were performed to read `x`
        // GiB data
        // before reaching the end of stream, where and `n` is the number of reads performed and
        // `x` is Integer.MAX_VALUE of bytes i.e 2147483647 bytes (~2 GiB data)
        for (int i = 0; i < noOfReadsPerformed; i++) {
            assertEquals(BUFFER_SIZE, inputStream.read(BUFFER));
        }
        assertEquals(-1, inputStream.read(BUFFER));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testLengthLimitedInputStream_InvalidReadBufferWithOffset() throws IOException {
        int offset = 0;
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        // maximum number of bytes to read exceeds buffer size into which the data is read
        // resulting in IndexOutOfBoundsException
        while (inputStream.read(BUFFER, offset, (int) SMALL_INPUT_STREAM_LENGTH_TO_READ) != -1) {}
    }

    @Test
    public void testLengthLimitedInputStream_WithMarkSupported() {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);
        assertEquals(true, inputStream.markSupported());
    }

    @Test
    public void testLengthLimitedInputStream_WithReadAvailableSkip() throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        long skippedBytes = inputStream.skip(256L * MiB); // 256 MiB
        assertEquals(inputStream.available(), SMALL_INPUT_STREAM_LENGTH_TO_READ - skippedBytes);
    }

    @Test
    public void testLengthLimitedInputStream_WithReadAvailableMarkReset() throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        int availableInputStream = inputStream.available();
        inputStream.mark(256 * MiB);
        assertEquals(availableInputStream, inputStream.available());

        inputStream.read(BUFFER);
        int availableInputStreamAfterRead = inputStream.available();
        assertEquals(availableInputStream - BUFFER_SIZE, availableInputStreamAfterRead);

        inputStream.mark(256 * MiB);

        inputStream.read(BUFFER);
        int availableInputStreamAfter2Reads = inputStream.available();
        assertEquals(availableInputStream - (2 * BUFFER_SIZE), availableInputStreamAfter2Reads);

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER) != -1) {
            noOfReadsPerformed++;
        }
        assertEquals(
                (int) Math.ceil((double) availableInputStreamAfter2Reads / BUFFER_SIZE),
                noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));

        inputStream.reset();
        assertEquals(availableInputStreamAfterRead, inputStream.available());

        int noOfReadsPerformedAfterReset = 0;
        while (inputStream.read(BUFFER) != -1) {
            noOfReadsPerformedAfterReset++;
        }
        assertEquals(
                (int) Math.ceil((double) availableInputStreamAfterRead / BUFFER_SIZE),
                noOfReadsPerformedAfterReset);
        assertEquals(-1, inputStream.read(BUFFER));
    }

    @Test
    public void testLengthLimitedInputStream_WithReadAvailableSkipMarkReset() throws IOException {
        final LengthLimitedInputStream inputStream =
                new LengthLimitedInputStream(
                        new TestInputStream(TEST_INPUT_STREAM_LENGTH),
                        SMALL_INPUT_STREAM_LENGTH_TO_READ);

        long skippedBytes = inputStream.skip(512L * MiB);

        int available = inputStream.available();
        assertEquals(available, SMALL_INPUT_STREAM_LENGTH_TO_READ - skippedBytes);

        inputStream.mark(256 * MiB);

        inputStream.read(BUFFER);
        inputStream.read(BUFFER);
        assertEquals(inputStream.available(), available - (2 * BUFFER_SIZE));

        inputStream.reset();

        int noOfReadsPerformed = 0;
        while (inputStream.read(BUFFER) != -1) {
            noOfReadsPerformed++;
        }
        assertEquals((int) Math.ceil((double) available / BUFFER_SIZE), noOfReadsPerformed);
        assertEquals(-1, inputStream.read(BUFFER));
    }

    private static final class TestInputStream extends InputStream {

        /** Size of this input stream. */
        private final long size;

        /** Current offset we are reading from. */
        private long currentOffset;

        private final byte[] random;

        /**
         * Create a random generating input stream of a given size.
         *
         * @param size The size of the input stream in bytes
         */
        public TestInputStream(long size) {
            validate(size >= 0, "required: size >= 0");
            this.size = size;
            this.currentOffset = 0;
            this.random = new byte[3989];

            ThreadLocalRandom.current().nextBytes(this.random);
        }

        /**
         * Reads the next byte of data from the input stream. The value byte is returned as an int
         * in the range 0 to 255. If no byte is available because the end of the stream has been
         * reached, the value -1 is returned.
         *
         * @return the next byte of data, or -1 if the end of the stream is reached.
         * @throws IOException
         */
        @Override
        public synchronized int read() throws IOException {
            if (this.currentOffset >= this.size) {
                return -1;
            }
            return calculateByte(this.currentOffset++) & 0xFF;
        }

        @Override
        public synchronized int available() {
            return Math.toIntExact(
                    Math.min((long) Integer.MAX_VALUE, this.size - this.currentOffset));
        }

        private byte calculateByte(long offset) {
            return this.random[Math.toIntExact(offset % random.length)];
        }

        /**
         * Throw {@link IllegalArgumentException} if the condition is false.
         *
         * @param condition the condition
         * @param reason exception message
         * @throws NullPointerException if the condition is false
         */
        private void validate(boolean condition, String reason) {
            if (!condition) {
                throw new IllegalArgumentException(reason);
            }
        }
    }
}
