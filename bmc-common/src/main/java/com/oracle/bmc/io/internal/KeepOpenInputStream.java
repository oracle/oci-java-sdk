/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper around an {@link InputStream} that turns the {@code close} method into a no-op, and requires the calling
 * of the {@code doClose} method instead.
 *
 * This is necessary, because Jersey closes a stream once it has been read, but we may want to reset and read it again
 * for retries.
 */
public class KeepOpenInputStream extends FilterInputStream {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KeepOpenInputStream.class);

    public volatile InputStream innerStream;

    public KeepOpenInputStream(InputStream is) {
        super(is);
        if (!is.markSupported()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Stream '%s' does not support mark/reset, retries won't work",
                            is.getClass().getName()));
        }
        this.innerStream = is;
    }

    @Override
    public final void close() throws IOException {
        LOG.debug("Not closing stream yet");
    }

    /**
     * This method actually closes the stream, what {@code close()} is not doing.
     * @throws IOException
     */
    public final void doClose() throws IOException {
        LOG.debug("Closing stream now");
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
