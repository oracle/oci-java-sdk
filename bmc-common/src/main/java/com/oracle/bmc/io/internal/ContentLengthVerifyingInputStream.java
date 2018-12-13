/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper over an {@link java.io.InputStream} whose length is known, which verifies that
 * the length of the wrapped stream matches its known length.
 *
 * NOTE: This implementation of content length verification does not support {@link InputStream#reset()}
 * and the verification is disabled upon invocation of {@link InputStream#reset()}.
 */
@Slf4j
@RequiredArgsConstructor
public class ContentLengthVerifyingInputStream extends InputStream {
    private final InputStream delegate;
    private final long contentLength;

    private long totalBytesProcessed = 0L;
    private boolean isVerificationEnabled = true;

    @Override
    public int read() throws IOException {
        final int byteRead = delegate.read();
        // Either one byte read or eof
        final int bytesRead = byteRead != -1 ? 1 : -1;
        processBytesRead(bytesRead);
        return byteRead;
    }

    @Override
    public int read(byte b[]) throws IOException {
        final int bytesRead = delegate.read(b);
        processBytesRead(bytesRead);
        return bytesRead;
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        final int bytesRead = delegate.read(b, off, len);
        processBytesRead(bytesRead);
        return bytesRead;
    }

    @Override
    public long skip(long n) throws IOException {
        final long bytesSkipped = delegate.skip(n);
        totalBytesProcessed += bytesSkipped;
        return bytesSkipped;
    }

    @Override
    public synchronized void mark(int readlimit) {
        delegate.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        isVerificationEnabled = false;
        LOG.info("Content length verification disabled");
        delegate.reset();
    }

    @Override
    public int available() throws IOException {
        return delegate.available();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }

    @Override
    public boolean markSupported() {
        return delegate.markSupported();
    }

    private void processBytesRead(final int bytesRead) throws IOException {
        if (!isVerificationEnabled) {
            return;
        }

        if (bytesRead == -1) {
            if (totalBytesProcessed != contentLength) {
                throw new IOException(
                        String.format(
                                "Total bytes processed (%d) does not match content-length (%d)",
                                totalBytesProcessed,
                                contentLength));
            }
        } else {
            totalBytesProcessed += bytesRead;
        }
    }
}
