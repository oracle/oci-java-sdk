/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import com.oracle.bmc.util.StreamUtils;

/**
 * Temporary helper class that should be moved into the common library later.
 */
public class StreamHelper {
    private static final int BUFFER_SIZE = 8 * 1024;

    /**
     * Copy contents from the input stream into the output stream. The input
     * stream will be closed in both successful or failure cases.
     *
     * @param in
     *            The stream to copy.
     * @param out
     *            The stream to write to.
     * @return the number of bytes copied.
     * @throws IOException
     *             if there were any issues
     */
    public static long copy(InputStream in, OutputStream out) throws IOException {
        try {
            byte[] buffer = new byte[BUFFER_SIZE];
            long bytesWritten = 0;
            int bytesRead = 0;
            while (-1 != (bytesRead = in.read(buffer))) {
                out.write(buffer, 0, bytesRead);
                bytesWritten += bytesRead;
            }

            return bytesWritten;
        } finally {
            StreamUtils.closeQuietly(in);
        }
    }

    /**
     * Base64 encodes the given byte array after computing its MD5 digest.
     * @param buffer The buffer to encode
     * @return The base64-encoded MD5 digest
     */
    public static String base64EncodeMd5Digest(byte[] buffer) {
        return toBase64(DigestUtils.md5(buffer));
    }

    /**
     * Creates a DigestOutputStream where the digest uses MD5.
     * @param stream The output stream to write to.
     * @return A new DigestOutputStream
     */
    public static DigestOutputStream createMd5MessageOutputStream(OutputStream stream) {
        return new DigestOutputStream(stream, DigestUtils.getDigest(MessageDigestAlgorithms.MD5));
    }

    /**
     * Base64 encodes the digest (resets the digest).
     *
     * @param messageDigest The digest
     * @return The base64 encoded value
     */
    public static String base64Encode(MessageDigest messageDigest) {
        return toBase64(messageDigest.digest());
    }

    private static String toBase64(byte[] bytes) {
        return new String(Base64.encodeBase64(bytes, false));
    }

    // no-op output stream
    public static class NullOutputStream extends OutputStream {
        @Override
        public void write(final byte[] b, final int off, final int len) {}

        @Override
        public void write(final int b) {}

        @Override
        public void write(final byte[] b) throws IOException {}
    }
}
