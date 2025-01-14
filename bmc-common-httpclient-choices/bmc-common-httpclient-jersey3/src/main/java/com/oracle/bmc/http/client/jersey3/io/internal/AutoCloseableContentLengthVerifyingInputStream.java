/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.io.internal;

import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper over an {@link java.io.InputStream} whose length is known, which verifies that the
 * length of the wrapped stream matches its known length and auto-closes the stream once the content
 * length bytes of the stream have been read. This auto-close feature has been added to release the
 * connection from the Apache connection pool which can otherwise lead to indefinite hangs
 *
 * <p>NOTE: This implementation of auto closesable content length verification does not support
 * {@link InputStream#reset()} and throws an IOException when reset is called
 */
public class AutoCloseableContentLengthVerifyingInputStream
        extends ContentLengthVerifyingInputStream {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutoCloseableContentLengthVerifyingInputStream.class);
    private boolean isStreamClosed = false;

    public AutoCloseableContentLengthVerifyingInputStream(
            InputStream delegate, long contentLength) {
        super(delegate, contentLength);
    }

    @Override
    public int read() throws IOException {
        // if stream has been closed, return -1
        if (isStreamClosed) return -1;
        final int byteRead = super.read();
        autoCloseStream();
        return byteRead;
    }

    @Override
    public int read(byte[] b) throws IOException {
        // if stream has been closed, return -1
        if (isStreamClosed) return -1;
        final int bytesRead = super.read(b);
        autoCloseStream();
        return bytesRead;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        // if stream has been closed, return -1
        if (isStreamClosed) return -1;
        final int bytesRead = super.read(b, off, len);
        autoCloseStream();
        return bytesRead;
    }

    @Override
    public long skip(long n) throws IOException {
        // if stream has been closed, return -1
        if (isStreamClosed) return -1;
        final long bytesSkipped = super.skip(n);
        autoCloseStream();
        return bytesSkipped;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public synchronized void mark(int readlimit) {
        super.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        throw new IOException(
                "Reset not supported for AutoCloseableContentLengthVerifyingInputStream, to support"
                        + "reset, please "
                        + "disable auto-close by calling Options.shouldAutoCloseResponseInputStream(false)");
    }

    private void autoCloseStream() throws IOException {
        // Check if the total bytes processed is equal to or more than the content length and
        // auto-close the stream
        if (totalBytesProcessed >= contentLength) {
            close();
        }
    }

    @Override
    public int available() throws IOException {
        // If the stream has already been auto-closed, return 0 as the number of bytes available
        // since end of stream
        // has already been reached
        if (isStreamClosed) return 0;
        return delegate.available();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
        isStreamClosed = true;
    }
}
