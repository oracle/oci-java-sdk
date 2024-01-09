/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import com.oracle.bmc.io.internal.WrappedByteArrayInputStream;
import com.oracle.bmc.io.internal.WrappedFileInputStream;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Optional;

/** Utility methods to work with streams. */
public class StreamUtils {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(StreamUtils.class);

    private static final boolean isExtraStreamLogsEnabled =
            isExtraStreamLogsEnabledViaSystemProperty();

    /**
     * The boolean value indicating if extra logs related to operations that return streams are
     * enabled/disabled. Disabling this will disable warnings to close the streams, logs about
     * wrapping response stream in an auto-closeble stream. Default is true.
     */
    public static boolean isExtraStreamLogsEnabled() {
        return StreamUtils.isExtraStreamLogsEnabled;
    }

    private static boolean isExtraStreamLogsEnabledViaSystemProperty() {
        String streamLogsEnabledString =
                System.getProperty("oci.javasdk.extra.stream.logs.enabled");
        if (streamLogsEnabledString != null && !streamLogsEnabledString.isEmpty()) {
            String trimmedValue = streamLogsEnabledString.trim();
            if (StringUtils.equalsIgnoreCase("false", trimmedValue)) {
                return false;
            }
        }
        return true;
    }

    private StreamUtils() {}

    /**
     * Close a stream without raising an exception.
     *
     * @param stream The stream to close.
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
     * Convert a File to an InputStream. This uses {@link WrappedFileInputStream} so the caller
     * still has access to the original file if needed. If the file is not valid, an
     * IllegalArgumentException will be raised.
     *
     * @param file The file to convert to a stream.
     * @return A new InputStream instance.
     */
    public static InputStream toInputStream(File file) {
        return WrappedFileInputStream.create(file);
    }

    /**
     * Creates a new {@link ByteArrayInputStream}. This uses {@link WrappedByteArrayInputStream} so
     * the underlying buffer can be reused by multiple copies of the stream if needed.
     *
     * @param buffer The byte buffer.
     * @return A new ByteArrayInputStream instance.
     */
    public static ByteArrayInputStream createByteArrayInputStream(byte[] buffer) {
        return new WrappedByteArrayInputStream(buffer);
    }

    /**
     * Convert the input stream to a string.
     *
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
     *
     * @param inputStream input stream
     * @return byte array
     */
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        byte[] buf = new byte[4096];
        int bytesRead = 0;
        while (-1 != (bytesRead = inputStream.read(buf))) {
            baos.write(buf, 0, bytesRead);
        }
        return baos.toByteArray();
    }

    /**
     * Return {@link Optional#empty()} if the content of the two input streams is the same.
     * Otherwise, it returns a description of the first difference.
     *
     * @param input1 first input stream
     * @param input2 second input stream
     * @return description of the first difference, or {@link Optional#empty()} if the contents are
     *     the same
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

    /**
     * Skip the specified number of bytes in the stream.
     *
     * @param is stream
     * @param count number of bytes to skip
     * @return number of bytes that were skipped
     * @throws IOException
     */
    public static long skipBytesInStream(InputStream is, long count) throws IOException {
        // not wrapping in a buffered input stream; that could lead to reading more bytes than we
        // want to skip
        long bytesRead;
        for (bytesRead = 0; bytesRead < count; ++bytesRead) {
            int read = is.read();
            if (read == -1) {
                break;
            }
        }
        return bytesRead;
    }

    /**
     * Limit the number of bytes remaining in the input stream to at most this many bytes. The input
     * stream may reach its end earlier.
     *
     * @param is input stream
     * @param limit upper limit of remaining bytes
     * @return limited stream
     */
    public static InputStream limitRemainingStreamLength(InputStream is, long limit) {
        Validate.notNull(is, "input stream must not be null");
        InputStream limitedStream =
                new InputStream() {
                    private volatile long remainingBytes = limit;

                    @Override
                    public synchronized int read() throws IOException {
                        if (remainingBytes > 0) {
                            --remainingBytes;
                            return is.read();
                        } else {
                            return -1;
                        }
                    }
                };
        return new BufferedInputStream(limitedStream);
    }

    /** Gets the stream warning message to warn the users about closing the stream */
    public static String getStreamWarningMessage(String clientName, String operationNames) {
        final String warningMessage =
                String.format(
                        "Warning for OCI SDK usage "
                                + "with the Apache Connector (the OCI SDK uses the Apache Connector by default, for HTTP calls):"
                                + " the following operations of"
                                + " %s "
                                + "return a stream : [%s]. "
                                + "If using Apache Connector, make sure to close all stream instances returned by the operation(s)"
                                + " mentioned, explicitly, by calling 'close' to release the connection back to the connection pool "
                                + "and avoid any indefinite hangs, or read the stream completely. The stream instances are wrapped in "
                                + "an auto closeable stream, to disable this setting or for guidance on disabling this warning, "
                                + "possible performance "
                                + "optimizations, or disabling use of the Apache Connector in the OCI SDK, "
                                + "please see https://github.com/oracle/oci-java-sdk/blob/master/ApacheConnector-README.md",
                        clientName, operationNames);
        return warningMessage;
    }
}
