/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ChecksumInputStreamTest {

    private static final String TEST_DATA = "123456789";
    private InputStream inputStream;

    @Before
    public void setUp() {
        inputStream = new ByteArrayInputStream(TEST_DATA.getBytes());
    }

    @Test
    public void testCrc32cChecksumVerificationSuccess()
            throws IOException, NoSuchAlgorithmException {
        String expectedChecksum = ChecksumUtils.calculateCrc32cChecksum(TEST_DATA.getBytes());
        try (ChecksumInputStream checksumStream =
                new ChecksumInputStream(
                        inputStream,
                        ChecksumAlgorithm.Crc32C,
                        expectedChecksum,
                        TEST_DATA.length())) {
            while (checksumStream.read() != -1) {
                // Read all data
            }
            // If no exception thrown, verification is successful
        }
    }

    @Test
    public void testCrc32cChecksumVerificationFailure() {
        String incorrectChecksum =
                ChecksumUtils.calculateCrc32cChecksum("12345678".getBytes(StandardCharsets.UTF_8));

        IOException thrown =
                Assert.assertThrows(
                        IOException.class,
                        () -> {
                            try (ChecksumInputStream checksumStream =
                                    new ChecksumInputStream(
                                            inputStream,
                                            ChecksumAlgorithm.Crc32C,
                                            incorrectChecksum,
                                            TEST_DATA.length())) {
                                while (checksumStream.read() != -1) {
                                    // Read all data
                                }
                            }
                        });

        Assert.assertTrue(thrown.getMessage().contains("Checksum mismatch"));
    }

    @Test
    public void testSha256ChecksumVerificationSuccess()
            throws IOException, NoSuchAlgorithmException {
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        sha256.update(TEST_DATA.getBytes());
        String expectedChecksum = Base64.getEncoder().encodeToString(sha256.digest());

        try (ChecksumInputStream checksumStream =
                new ChecksumInputStream(
                        inputStream,
                        ChecksumAlgorithm.Sha256,
                        expectedChecksum,
                        TEST_DATA.length())) {
            while (checksumStream.read() != -1) {
                // Read all data
            }
            // If no exception thrown, verification is successful
        }
    }

    @Test
    public void testSha256ChecksumVerificationFailure() {
        String incorrectChecksum = Base64.getEncoder().encodeToString(new byte[] {1, 2, 3, 4});

        IOException thrown =
                Assert.assertThrows(
                        IOException.class,
                        () -> {
                            try (ChecksumInputStream checksumStream =
                                    new ChecksumInputStream(
                                            inputStream,
                                            ChecksumAlgorithm.Sha256,
                                            incorrectChecksum,
                                            TEST_DATA.length())) {
                                while (checksumStream.read() != -1) {
                                    // Read all data
                                }
                            }
                        });

        Assert.assertTrue(thrown.getMessage().contains("Checksum mismatch"));
    }

    @Test
    public void testSha384ChecksumVerificationSuccess()
            throws IOException, NoSuchAlgorithmException {
        MessageDigest sha384 = MessageDigest.getInstance("SHA-384");
        sha384.update(TEST_DATA.getBytes());
        String expectedChecksum = Base64.getEncoder().encodeToString(sha384.digest());

        try (ChecksumInputStream checksumStream =
                new ChecksumInputStream(
                        inputStream,
                        ChecksumAlgorithm.Sha384,
                        expectedChecksum,
                        TEST_DATA.length())) {
            while (checksumStream.read() != -1) {
                // Read all data
            }
            // If no exception thrown, verification is successful
        }
    }

    @Test
    public void testSha384ChecksumVerificationFailure() {
        String incorrectChecksum =
                Base64.getEncoder().encodeToString(new byte[] {1, 2, 3, 4, 5, 6});

        IOException thrown =
                Assert.assertThrows(
                        IOException.class,
                        () -> {
                            try (ChecksumInputStream checksumStream =
                                    new ChecksumInputStream(
                                            inputStream,
                                            ChecksumAlgorithm.Sha384,
                                            incorrectChecksum,
                                            TEST_DATA.length())) {
                                while (checksumStream.read() != -1) {
                                    // Read all data
                                }
                            }
                        });

        Assert.assertTrue(thrown.getMessage().contains("Checksum mismatch"));
    }

    @Test
    public void testLargeDataChecksumVerificationSuccess()
            throws IOException, NoSuchAlgorithmException {
        String largeData = new String(new char[1000000]).replace("\0", "A");
        InputStream largeInputStream = new ByteArrayInputStream(largeData.getBytes());
        String expectedChecksum = ChecksumUtils.calculateCrc32cChecksum(largeData.getBytes());

        try (ChecksumInputStream checksumStream =
                new ChecksumInputStream(
                        largeInputStream,
                        ChecksumAlgorithm.Crc32C,
                        expectedChecksum,
                        largeData.length())) {
            while (checksumStream.read() != -1) {
                // Read all data
            }
            // If no exception thrown, verification is successful
        }
    }

    @Test
    public void testMd5ChecksumVerificationSuccess() throws IOException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(TEST_DATA.getBytes());
        String expectedChecksum = Base64.getEncoder().encodeToString(md5.digest());

        try (ChecksumInputStream checksumStream =
                new ChecksumInputStream(inputStream, null, expectedChecksum, TEST_DATA.length())) {
            while (checksumStream.read() != -1) {
                // Read all data
            }
            // If no exception thrown, verification is successful
        }
    }

    @Test
    public void testMd5ChecksumVerificationFailure() {
        String incorrectChecksum =
                Base64.getEncoder().encodeToString("12345678".getBytes(StandardCharsets.UTF_8));

        IOException thrown =
                Assert.assertThrows(
                        IOException.class,
                        () -> {
                            try (ChecksumInputStream checksumStream =
                                    new ChecksumInputStream(
                                            inputStream,
                                            null,
                                            incorrectChecksum,
                                            TEST_DATA.length())) {
                                while (checksumStream.read() != -1) {
                                    // Read all data
                                }
                            }
                        });

        Assert.assertTrue(thrown.getMessage().contains("Checksum mismatch"));
    }
}
