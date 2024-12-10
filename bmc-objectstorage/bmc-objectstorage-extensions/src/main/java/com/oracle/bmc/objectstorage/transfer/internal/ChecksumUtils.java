/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.io.DuplicatableInputStream;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.responses.HeadObjectResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;
import com.oracle.bmc.objectstorage.transfer.UploadManager;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.util.StreamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.util.Arrays;
import java.util.Base64;

public class ChecksumUtils {
    private static final Logger LOG = LoggerFactory.getLogger(ChecksumUtils.class);

    private ChecksumUtils() {}

    /** Calculate the MD5 checksum of the provided input stream. */
    public static MD5Calculation calculateMd5(InputStream stream, Long contentLength) {
        return calculateChecksum(
                stream,
                contentLength,
                StreamHelper::createMd5MessageOutputStream,
                MD5Calculation::new,
                "MD5");
    }

    /** Calculate the SHA-384 checksum of the provided input stream. */
    public static SHA384Calculation calculateSha384(InputStream stream, Long contentLength) {
        return calculateChecksum(
                stream,
                contentLength,
                StreamHelper::createSha384MessageOutputStream,
                SHA384Calculation::new,
                ChecksumAlgorithm.Sha384.getValue());
    }

    /** Calculate the SHA-256 checksum of the provided input stream. */
    public static SHA256Calculation calculateSha256(InputStream stream, Long contentLength) {
        return calculateChecksum(
                stream,
                contentLength,
                StreamHelper::createSha256MessageOutputStream,
                SHA256Calculation::new,
                ChecksumAlgorithm.Sha256.getValue());
    }

    /** Calculate the CRC32C checksum of the provided input stream. */
    public static CRC32CCalculation calculateCrc32c(InputStream stream, Long contentLength) {
        return calculateChecksum(
                stream,
                contentLength,
                StreamHelper::createCrc32cMessageOutputStream,
                CRC32CCalculation::new,
                ChecksumAlgorithm.Crc32C.getValue());
    }

    /**
     * This method is responsible for calculating the checksum of the provided input stream based on
     * the specified algorithm. The MD5 checksum calculation logic was refactored and relocated from
     * the UploadManager to this utility class, ensuring a consistent approach for calculating
     * checksums for various algorithms.
     */
    private static <T> T calculateChecksum(
            InputStream stream,
            Long contentLength,
            DigestOutputStreamFactory outputStreamFactory,
            ChecksumCalculationFactory<T> calculationFactory,
            String algorithmName) {
        String checksum;
        InputStream streamToReturn;

        if (stream instanceof DuplicatableInputStream) {
            checksum =
                    performChecksumCalculation(
                            ((DuplicatableInputStream) stream).duplicate(),
                            new StreamHelper.NullOutputStream(),
                            contentLength,
                            outputStreamFactory,
                            algorithmName);
            streamToReturn = stream;
        } else {
            LOG.info(
                    "About to copy object into memory to calculate {}, may lead to OutOfMemory exceptions",
                    algorithmName);
            if (contentLength > Integer.MAX_VALUE) {
                throw new BmcException(
                        false,
                        String.format(
                                "Cannot compute %s client-side as content length (%d) is larger than max buffer. Disable %s enforcement or provide a DuplicableInputStream to avoid this problem",
                                algorithmName,
                                contentLength,
                                algorithmName),
                        null,
                        null);
            }
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream(contentLength.intValue());
                checksum =
                        performChecksumCalculation(
                                stream, baos, contentLength, outputStreamFactory, algorithmName);
                streamToReturn = StreamUtils.createByteArrayInputStream(baos.toByteArray());
            } catch (OutOfMemoryError oom) {
                OutOfMemoryError newOom =
                        new OutOfMemoryError(
                                String.format(
                                        "Could not compute %s. Disable %s enforcement or provide a DuplicableInputStream to avoid this problem",
                                        algorithmName,
                                        algorithmName));
                newOom.initCause(oom);
                throw newOom;
            }
        }
        return calculationFactory.create(streamToReturn, checksum);
    }

    private static String performChecksumCalculation(
            InputStream stream,
            OutputStream outputStream,
            long contentLength,
            DigestOutputStreamFactory outputStreamFactory,
            String algorithmName) {
        DigestOutputStream digestOutputStream = outputStreamFactory.create(outputStream);
        long bytesCopied;
        try {
            bytesCopied = StreamHelper.copy(stream, digestOutputStream);
        } catch (IOException e) {
            throw new BmcException(
                    false, "Unable to calculate " + algorithmName + " checksum", e, null);
        }
        if (bytesCopied != contentLength) {
            throw new BmcException(
                    false,
                    String.format(
                            "Failed to read all bytes while calculating %s checksum: %d, %d",
                            algorithmName,
                            bytesCopied,
                            contentLength),
                    null,
                    null);
        }
        return StreamHelper.base64Encode(digestOutputStream.getMessageDigest());
    }

    /** Calculate the CRC32C checksum of the provided byte array. */
    public static String calculateCrc32cChecksum(byte[] data) {
        CRC32C crc32c = new CRC32C();
        crc32c.update(data, 0, data.length);
        long crcValue = crc32c.getValue();
        byte[] crcBytes = ByteBuffer.allocate(Long.BYTES).putLong(crcValue).array();
        crcBytes = Arrays.copyOfRange(crcBytes, 4, Long.BYTES);
        return Base64.getEncoder().encodeToString(crcBytes);
    }

    public static ChecksumInfo getExpectedChecksumAndAlgorithm(GetObjectResponse response) {
        String expectedChecksum;
        ChecksumAlgorithm algorithm;

        if (response.getOpcContentCrc32c() != null) {
            expectedChecksum = response.getOpcContentCrc32c();
            algorithm = ChecksumAlgorithm.Crc32C;
        } else if (response.getOpcContentSha256() != null) {
            expectedChecksum = response.getOpcContentSha256();
            algorithm = ChecksumAlgorithm.Sha256;
        } else if (response.getOpcContentSha384() != null) {
            expectedChecksum = response.getOpcContentSha384();
            algorithm = ChecksumAlgorithm.Sha384;
        } else {
            expectedChecksum = response.getContentMd5();
            algorithm = null;
        }

        return new ChecksumInfo(expectedChecksum, algorithm);
    }

    public static String getChecksumFromUploadResponse(
            UploadManager.UploadResponse uploadResponse,
            ChecksumAlgorithm checksumAlgorithm,
            boolean isMultipart) {
        if (checksumAlgorithm == null) {
            return null;
        }
        switch (checksumAlgorithm) {
            case Crc32C:
                return uploadResponse.getContentCrc32c();
            case Sha256:
                return isMultipart
                        ? uploadResponse.getMultipartSha256()
                        : uploadResponse.getContentSha256();
            case Sha384:
                return isMultipart
                        ? uploadResponse.getMultipartSha384()
                        : uploadResponse.getContentSha384();
            default:
                throw new IllegalArgumentException(
                        "Unsupported checksum algorithm: " + checksumAlgorithm);
        }
    }

    public static String getResponseChecksum(
            BmcResponse response, ChecksumAlgorithm algorithm, boolean isMultipart) {
        if (algorithm == null) {
            return null;
        }

        if (response instanceof GetObjectResponse) {
            return getChecksumForGetObjectResponse(
                    (GetObjectResponse) response, algorithm, isMultipart);
        } else if (response instanceof HeadObjectResponse) {
            return getChecksumForHeadObjectResponse(
                    (HeadObjectResponse) response, algorithm, isMultipart);
        } else if (response instanceof PutObjectResponse) {
            return getChecksumForPutObjectResponse((PutObjectResponse) response, algorithm);
        } else if (response instanceof UploadPartResponse) {
            return getChecksumForUploadPartResponse((UploadPartResponse) response, algorithm);
        } else if (response instanceof CommitMultipartUploadResponse) {
            return getChecksumForCommitMultipartUploadResponse(
                    (CommitMultipartUploadResponse) response, algorithm);
        } else {
            throw new IllegalArgumentException("Unsupported response type");
        }
    }

    private static String getChecksumForGetObjectResponse(
            GetObjectResponse response, ChecksumAlgorithm algorithm, boolean isMultipart) {
        switch (algorithm) {
            case Crc32C:
                return response.getOpcContentCrc32c();
            case Sha256:
                return isMultipart
                        ? response.getOpcMultipartSha256()
                        : response.getOpcContentSha256();
            case Sha384:
                return isMultipart
                        ? response.getOpcMultipartSha384()
                        : response.getOpcContentSha384();
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }
    }

    private static String getChecksumForHeadObjectResponse(
            HeadObjectResponse response, ChecksumAlgorithm algorithm, boolean isMultipart) {
        switch (algorithm) {
            case Crc32C:
                return response.getOpcContentCrc32c();
            case Sha256:
                return isMultipart
                        ? response.getOpcMultipartSha256()
                        : response.getOpcContentSha256();
            case Sha384:
                return isMultipart
                        ? response.getOpcMultipartSha384()
                        : response.getOpcContentSha384();
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }
    }

    private static String getChecksumForPutObjectResponse(
            PutObjectResponse response, ChecksumAlgorithm algorithm) {
        switch (algorithm) {
            case Crc32C:
                return response.getOpcContentCrc32c();
            case Sha256:
                return response.getOpcContentSha256();
            case Sha384:
                return response.getOpcContentSha384();
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }
    }

    private static String getChecksumForUploadPartResponse(
            UploadPartResponse response, ChecksumAlgorithm algorithm) {
        switch (algorithm) {
            case Crc32C:
                return response.getOpcContentCrc32c();
            case Sha256:
                return response.getOpcContentSha256();
            case Sha384:
                return response.getOpcContentSha384();
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }
    }

    private static String getChecksumForCommitMultipartUploadResponse(
            CommitMultipartUploadResponse response, ChecksumAlgorithm algorithm) {
        switch (algorithm) {
            case Crc32C:
                return response.getOpcContentCrc32c();
            case Sha256:
                return response.getOpcMultipartSha256();
            case Sha384:
                return response.getOpcMultipartSha384();
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }
    }

    public static class MD5Calculation {
        private final InputStream streamToUse;
        private final String md5;

        public MD5Calculation(InputStream streamToUse, String md5) {
            this.streamToUse = streamToUse;
            this.md5 = md5;
        }

        public InputStream getStreamToUse() {
            return streamToUse;
        }

        public String getMd5() {
            return md5;
        }
    }

    public static class SHA384Calculation {
        private final InputStream streamToUse;
        private final String sha384;

        public SHA384Calculation(InputStream streamToUse, String sha384) {
            this.streamToUse = streamToUse;
            this.sha384 = sha384;
        }

        public InputStream getStreamToUse() {
            return streamToUse;
        }

        public String getSha384() {
            return sha384;
        }
    }

    public static class SHA256Calculation {
        private final InputStream streamToUse;
        private final String sha256;

        public SHA256Calculation(InputStream streamToUse, String sha256) {
            this.streamToUse = streamToUse;
            this.sha256 = sha256;
        }

        public InputStream getStreamToUse() {
            return streamToUse;
        }

        public String getSha256() {
            return sha256;
        }
    }

    public static class CRC32CCalculation {
        private final InputStream streamToUse;
        private final String crc32c;

        public CRC32CCalculation(InputStream streamToUse, String crc32c) {
            this.streamToUse = streamToUse;
            this.crc32c = crc32c;
        }

        public InputStream getStreamToUse() {
            return streamToUse;
        }

        public String getCrc32c() {
            return crc32c;
        }
    }

    @FunctionalInterface
    private interface DigestOutputStreamFactory {
        DigestOutputStream create(OutputStream outputStream);
    }

    @FunctionalInterface
    private interface ChecksumCalculationFactory<T> {
        T create(InputStream streamToUse, String checksum);
    }
}
