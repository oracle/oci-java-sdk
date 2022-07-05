/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import com.oracle.bmc.io.internal.WrappedByteArrayInputStream;
import com.oracle.bmc.io.internal.WrappedFileInputStream;
import org.slf4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Utility methods to work with streams.
 */
public class StreamUtils {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(StreamUtils.class);

    private StreamUtils() {}

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

    /**
     * Convert the input stream to a string.
     * @param is input stream
     * @param charset charset to use
     * @return string
     */
    public static String toString(InputStream is, Charset charset) {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(is, charset))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        return sb.toString();
    }

    /**
     * Convert the input stream to a byte array.
     * @param inputStream input stream
     * @return byte array
     */
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        int ch;
        while (-1 != (ch = inputStream.read())) {
            baos.write(ch);
        }
        return baos.toByteArray();
    }

    /**
     * Return {@link Optional#empty()} if the content of the two input streams is the same. Otherwise,
     * it returns a description of the first difference.
     * @param input1 first input stream
     * @param input2 second input stream
     * @return description of the first difference, or {@link Optional#empty()} if the contents are the same
     * @throws IOException
     */
    public static Optional<String> contentDiffers(InputStream input1, InputStream input2)
            throws IOException {
        if (!(input1 instanceof BufferedInputStream)) {
            input1 = new BufferedInputStream(input1);
        }
        if (!(input2 instanceof BufferedInputStream)) {
            input2 = new BufferedInputStream(input2);
        }

        long offset = 0;
        int ch;
        while (-1 != (ch = input1.read())) {
            int ch2 = input2.read();
            if (ch != ch2) {
                return Optional.of(String.format("At offset %d: %d != %d", offset, ch, ch2));
            }
            ++offset;
        }

        int ch2 = input2.read();
        if (ch != ch2) {
            return Optional.of(String.format("At offset %d: %d != %d", offset, ch, ch2));
        }
        return Optional.empty();
    }
}
