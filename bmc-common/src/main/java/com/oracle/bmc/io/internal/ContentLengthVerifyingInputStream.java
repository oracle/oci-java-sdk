/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper over an {@link java.io.InputStream} whose length is known, which verifies that
 * the length of the wrapped stream matches its known length.
 *
 * NOTE: This implementation of content length verification does not support {@link InputStream#reset()}
 * and the verification is disabled upon invocation of {@link InputStream#reset()}.
 */
public class ContentLengthVerifyingInputStream extends InputStream {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContentLengthVerifyingInputStream.class);
    protected final InputStream delegate;
    protected final long contentLength;

    protected long totalBytesProcessed = 0L;
    protected boolean isVerificationEnabled = true;

    @Override
    public int read() throws IOException {
        final int byteRead = delegate.read();
        // Either one byte read or eof
        final int bytesRead = byteRead != -1 ? 1 : -1;
        processBytesRead(bytesRead);
        return byteRead;
    }

    @Override
    public int read(byte[] b) throws IOException {
        final int bytesRead = delegate.read(b);
        processBytesRead(bytesRead);
        return bytesRead;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
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

    protected void processBytesRead(final int bytesRead) throws IOException {
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

    @java.beans.ConstructorProperties({"delegate", "contentLength"})
    public ContentLengthVerifyingInputStream(final InputStream delegate, final long contentLength) {
        this.delegate = delegate;
        this.contentLength = contentLength;
    }
}
