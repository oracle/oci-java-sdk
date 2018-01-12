/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.oracle.bmc.io.internal.WrappedByteArrayInputStream;
import com.oracle.bmc.io.internal.WrappedFileInputStream;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Utility methods to work with streams.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class StreamUtils {

    /**
     * Close a stream without raising an exception.
     *
     * @param stream
     *            The stream to close.
     */
    public static void closeQuietly(InputStream stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                LOG.debug("Did not close steam successfully", e);
            }
        }
    }

    /**
     * Convert a File to an InputStream. This uses {@link WrappedFileInputStream}
     * so the caller still has access to the original file if needed. If the file
     * is not valid, an IllegalArgumentException will be raised.
     *
     * @param file
     *            The file to convert to a stream.
     * @return A new InputStream instance.
     */
    public static InputStream toInputStream(File file) {
        return WrappedFileInputStream.create(file);
    }

    /**
     * Creates a new {@link ByteArrayInputStream}. This uses
     * {@link WrappedByteArrayInputStream} so the underlying buffer can be
     * reused by multiple copies of the stream if needed.
     *
     * @param buffer
     *            The byte buffer.
     * @return A new ByteArrayInputStream instance.
     */
    public static ByteArrayInputStream createByteArrayInputStream(byte[] buffer) {
        return new WrappedByteArrayInputStream(buffer);
    }
}
