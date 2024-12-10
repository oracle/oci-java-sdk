/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import com.oracle.bmc.objectstorage.transfer.internal.download.MultithreadStream;
import com.oracle.bmc.objectstorage.transfer.internal.download.RetryingStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * A ChecksumInputStream that computes and verifies a checksum for the data read from the stream.
 * Supports CRC32C, SHA-256, SHA-384, and MD5 algorithms.
 *
 * <p>Checksum verification is performed before the last byte is read. If the computed checksum does
 * not match the expected checksum, an IOException is thrown.
 */
public class ChecksumInputStream extends FilterInputStream {
    private static final Logger LOG = LoggerFactory.getLogger(ChecksumInputStream.class);

    private final ChecksumAlgorithm algorithm;
    private final String expectedChecksum;
    private final CRC32C crc32c;
    private final MessageDigest digest;
    private final boolean isMd5;
    private volatile boolean checksumVerified = false;
    private volatile long totalBytesRead = 0;
    private final long contentLength;

    public ChecksumInputStream(
            InputStream in,
            ChecksumAlgorithm algorithm,
            String expectedChecksum,
            long contentLength)
            throws NoSuchAlgorithmException {
        super(in);
        this.isMd5 = algorithm == null;
        this.algorithm = algorithm;
        this.expectedChecksum = expectedChecksum;
        this.crc32c = this.algorithm == ChecksumAlgorithm.Crc32C ? new CRC32C() : null;
        this.digest = selectDigest(this.algorithm, this.isMd5);
        this.contentLength = contentLength;
    }

    @Override
    public int read() throws IOException {
        int byteRead = super.read();
        if (byteRead != -1) {
            totalBytesRead++;
            updateChecksum(byteRead);
            if (totalBytesRead == contentLength) {
                verifyChecksum();
                checksumVerified = true;
            }
        }
        return byteRead;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead != -1) {
            totalBytesRead += bytesRead;
            updateChecksum(b, off, bytesRead);
            if (totalBytesRead == contentLength) {
                verifyChecksum();
                checksumVerified = true;
            }
        }
        return bytesRead;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    /**
     * This method throws an IOException because the underlying stream classes {@link
     * RetryingStream} and {@link MultithreadStream} do not support the skip operation.
     */
    @Override
    public long skip(long n) throws IOException {
        throw new IOException("skip not supported");
    }

    private void updateChecksum(int byteRead) {
        if (algorithm == ChecksumAlgorithm.Crc32C) {
            crc32c.update(byteRead);
        } else {
            digest.update((byte) byteRead);
        }
    }

    private void updateChecksum(byte[] b, int off, int len) {
        if (algorithm == ChecksumAlgorithm.Crc32C) {
            crc32c.update(b, off, len);
        } else {
            digest.update(b, off, len);
        }
    }

    private void verifyChecksum() throws IOException {
        if (expectedChecksum == null) {
            throw new IOException("Expected checksum is null");
        }

        if (algorithm == ChecksumAlgorithm.Crc32C) {
            long calculatedChecksum = crc32c.getValue();
            byte[] expectedChecksumBytes = Base64.getDecoder().decode(expectedChecksum);

            if (expectedChecksumBytes.length != Integer.BYTES) {
                throw new IOException("Expected checksum length is invalid");
            }

            int expectedChecksumValue = ByteBuffer.wrap(expectedChecksumBytes).getInt();

            if (calculatedChecksum != Integer.toUnsignedLong(expectedChecksumValue)) {
                LOG.error(
                        "Checksum mismatch: expected {}, but calculated {}",
                        expectedChecksum,
                        calculatedChecksum);
                throw new IOException(
                        "Checksum mismatch: expected "
                                + expectedChecksum
                                + " but calculated "
                                + calculatedChecksum);
            }
            LOG.debug("CRC32C checksum verified successfully");
        } else {
            byte[] calculatedDigest = digest.digest();
            byte[] expectedDigest = Base64.getDecoder().decode(expectedChecksum);
            if (!MessageDigest.isEqual(calculatedDigest, expectedDigest)) {
                LOG.error("Checksum mismatch");
                throw new IOException("Checksum mismatch");
            }
            LOG.debug("{} checksum verified successfully", isMd5 ? "MD5" : algorithm);
        }
    }

    private static MessageDigest selectDigest(ChecksumAlgorithm algorithm, boolean isMd5)
            throws NoSuchAlgorithmException {
        if (algorithm == ChecksumAlgorithm.Sha256) {
            return MessageDigest.getInstance("SHA-256");
        } else if (algorithm == ChecksumAlgorithm.Sha384) {
            return MessageDigest.getInstance("SHA-384");
        } else if (isMd5) {
            return MessageDigest.getInstance("MD5");
        }
        return null;
    }
}
