/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.oracle.bmc.io.DuplicatableInputStream;

/**
 * Basic extension to {@link ByteArrayInputStream} that lets you create duplicate
 * streams from the same underlying byte buffer.
 */
public class WrappedByteArrayInputStream extends ByteArrayInputStream
        implements DuplicatableInputStream {

    /**
     * Create a new stream from the given buffer.
     * @param buf The byte buffer.
     */
    public WrappedByteArrayInputStream(byte[] buf) {
        super(buf);
    }

    /**
     * Returns the length of the underlying buffer (ie, the length of this stream).
     *
     * @return The length of the underlying buffer.
     */
    public long length() {
        return buf.length;
    }

    @Override
    public InputStream duplicate() {
        return new WrappedByteArrayInputStream(this.buf);
    }
}
