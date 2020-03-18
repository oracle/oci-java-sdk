/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import lombok.extern.slf4j.Slf4j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
/**
 * A wrapper around an {@link InputStream} that turns the {@code close} method into a no-op, and requires the calling
 * of the {@code doClose} method instead.
 *
 * This is necessary, because Jersey closes a stream once it has been read, but we may want to reset and read it again
 * for retries.
 */
public final class KeepOpenInputStream extends FilterInputStream {
    public KeepOpenInputStream(InputStream is) {
        super(is);
    }

    @Override
    public void close() throws IOException {
        LOG.debug("Not closing stream yet");
    }

    /**
     * This method actually closes the stream, what {@code close()} is not doing.
     * @throws IOException
     */
    public void doClose() throws IOException {
        super.close();
    }

    /**
     * Close a stream, dealing properly with {@link KeepOpenInputStream}s.
     * @param is input stream to close
     */
    public static void closeStream(InputStream is) {
        try {
            if (is instanceof KeepOpenInputStream) {
                ((KeepOpenInputStream) is).doClose();
            } else {
                is.close();
            }
        } catch (IOException e) {
            LOG.warn("Failed to close input stream", e);
        }
    }
}
