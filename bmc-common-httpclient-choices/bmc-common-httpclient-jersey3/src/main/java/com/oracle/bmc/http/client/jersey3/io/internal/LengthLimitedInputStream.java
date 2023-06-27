/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.io.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper over an {@link java.io.FilterInputStream} which limits the reads of data from the input
 * stream up to a specified length that is shorter than the actual length of the stream.
 */
public class LengthLimitedInputStream extends FilterInputStream {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LengthLimitedInputStream.class);

    private final long length;
    private long remainingBytes;
    private long remainingBytesAtMark;

    public LengthLimitedInputStream(InputStream inputStream, long length) {
        super(inputStream);
        this.length = length;
        this.remainingBytes = length;
        this.remainingBytesAtMark = length;
    }

    @Override
    public synchronized int read() throws IOException {
        if (remainingBytes <= 0) {
            LOG.debug("End of the stream has been reached for InputStream with length {}", length);
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            remainingBytes--;
        }
        return read;
    }

    @Override
    public synchronized int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public synchronized int read(byte[] b, int off, int len) throws IOException {
        if (remainingBytes <= 0) {
            LOG.debug("End of the stream has been reached for InputStream with length {}", length);
            return -1;
        }

        // Do not read more than the length limit allows.
        final int lenToRead = Math.min(len, convertLongToInt(remainingBytes));

        // Perform the read on the wrapped stream.
        final int bytesRead = super.read(b, off, lenToRead);

        // Only update remainingBytes if we some data was read
        if (bytesRead > 0) {
            remainingBytes -= bytesRead;
        }
        return bytesRead;
    }

    @Override
    public long skip(long numberOfBytesToSkip) throws IOException {
        numberOfBytesToSkip = Math.min(numberOfBytesToSkip, remainingBytes);
        long bytesSkipped = super.skip(numberOfBytesToSkip);

        // Eliminate the skipped bytes from remaining bytes to be read
        remainingBytes -= bytesSkipped;
        return bytesSkipped;
    }

    @Override
    public int available() throws IOException {
        int availableBytes = super.available();
        return Math.min(
                availableBytes, Math.min(Integer.MAX_VALUE, convertLongToInt(remainingBytes)));
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

    @Override
    public synchronized void mark(int ignoredReadlimit) {
        // mark() will cause the reset() to change the length to the stream's specified read limit
        // length. Instead, it
        // should be the length of bytes that are yet to be read. The length should therefore match
        // the remainingBytes.
        remainingBytesAtMark = remainingBytes;
    }

    @Override
    public synchronized void reset() throws IOException {
        // Reset remainingBytes to the specified read limit length
        remainingBytes = remainingBytesAtMark;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    private int convertLongToInt(long value) {
        if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else return (int) value;
    }
}
