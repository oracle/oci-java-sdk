/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.DeleteObjectRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.DeleteObjectResponse;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.transfer.DownloadConfiguration;
import com.oracle.bmc.objectstorage.transfer.DownloadManager;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@Disabled("Disabled since it needs environment variables to be set")
public class DownloadManagerTest extends BaseObjectStorageTest {
    public static final int TEST_FILE_LENGTH = 20 * 1024 * 1024;
    private static File TEST_FILE = null;
    public static final int SHORT_TEST_FILE_LENGTH = 100;
    private static String namespace;

    // setup + test for getting namesapce
    @BeforeAll
    public static void getNamespace() {
        try {
            GetNamespaceResponse response =
                    CLIENT.getNamespace(GetNamespaceRequest.builder().build());

            assertNotNull(response);
            assertNotNull(response.getValue());
            namespace = response.getValue();
        } catch (RuntimeException e) {
            // get better debug output
            e.printStackTrace();
            throw e;
        }
    }

    @BeforeAll
    public static void setupTestDataFile() throws IOException {
        TEST_FILE = generateTestFile(TEST_FILE_LENGTH);
        System.out.println("Generated test file " + TEST_FILE);
    }

    @AfterEach
    public void tearDown() {
        tryCleanup(namespace);
    }

    @Test
    public void crudObject() throws IOException {
        String bucketName = createCrudName();
        this.createBucketAndVerifyResponse(namespace, bucketName, new HashMap<>());

        // if-none-match is set to '*' to ensure it's a new object
        String objectName = createCrudName();
        PutObjectResponse putResponse =
                CLIENT.putObject(
                        PutObjectRequest.builder()
                                .bucketName(bucketName)
                                .namespaceName(namespace)
                                .objectName(objectName)
                                .putObjectBody(new FileInputStream(TEST_FILE))
                                .ifNoneMatch("*")
                                .contentLength(TEST_FILE.length())
                                .build());

        assertNotNull(putResponse);
        assertNotNull(putResponse.getETag());
        String originalEtag = putResponse.getETag();

        try {
            DownloadManager downloadManager = buildDownloadManager();

            GetObjectResponse getResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(getResponse);
            assertFalse(getResponse.isNotModified());
            assertNotNull(getResponse.getInputStream());
            assertTrue(
                    FileUtils.contentEquals(
                            new FileInputStream(TEST_FILE), getResponse.getInputStream()));
            assertEquals(originalEtag, getResponse.getETag());
            assertEquals(MediaType.APPLICATION_OCTET_STREAM, getResponse.getContentType());
            assertNull(getResponse.getContentEncoding());
            assertNull(getResponse.getContentLanguage());

            GetObjectResponse getResponseIfNoneMatch =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .ifNoneMatch(originalEtag)
                                    .build());
            assertNotNull(getResponseIfNoneMatch);
            assertTrue(getResponseIfNoneMatch.isNotModified());
            assertNull(getResponseIfNoneMatch.getInputStream());

            GetObjectResponse getResponseIfMatchMatches =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .ifMatch(originalEtag)
                                    .build());
            assertNotNull(getResponseIfMatchMatches);
            assertFalse(getResponseIfMatchMatches.isNotModified());
            assertNotNull(getResponseIfMatchMatches.getInputStream());
            assertTrue(
                    FileUtils.contentEquals(
                            new FileInputStream(TEST_FILE),
                            getResponseIfMatchMatches.getInputStream()));

            GetObjectResponse getResponseIfNoneMatchModified =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .ifNoneMatch("randomEtag")
                                    .build());
            assertNotNull(getResponseIfNoneMatchModified);
            assertFalse(getResponseIfNoneMatchModified.isNotModified());
            assertNotNull(getResponseIfNoneMatchModified.getInputStream());
            assertTrue(
                    FileUtils.contentEquals(
                            new FileInputStream(TEST_FILE),
                            getResponseIfNoneMatchModified.getInputStream()));

            try {
                downloadManager.getObject(
                        GetObjectRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .objectName(objectName)
                                .ifMatch("foobar")
                                .build());
                fail("Should have thrown exception");
            } catch (BmcException e) {
                // expected
            }
        } finally {
            DeleteObjectResponse deleteResponse =
                    CLIENT.deleteObject(
                            DeleteObjectRequest.builder()
                                    .bucketName(bucketName)
                                    .namespaceName(namespace)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(deleteResponse);
        }
    }

    protected DownloadManager buildDownloadManager() {
        return buildDownloadManager(CLIENT);
    }

    protected DownloadManager buildDownloadManager(ObjectStorage client) {
        DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .parallelDownloads(3)
                        .multipartDownloadThresholdInBytes(6 * 1024 * 1024)
                        .build();
        return new DownloadManager(client, config);
    }

    @Test
    public void getObject_withRange() throws IOException {
        String bucketName = createCrudName();
        this.createBucketAndVerifyResponse(namespace, bucketName, new HashMap<>());

        String objectName = createCrudName();
        this.createObjectAndVerifyResponse(bucketName, objectName);

        try {

            DownloadManager downloadManager = buildDownloadManager();

            // the end of the range is inclusive; if the file is 100 bytes, the last byte is 99
            // we want to request everything except the first and the last byte, so the start is 1
            // (skipping byte 0), and the end is TEST_FILE_LENGTH - 2 (minus 1, because the last byte
            // is not the length, but one less than the length; and minus 1 again to skip the last byte)
            Range range = new Range(1L, TEST_FILE.length() - 1 - 1);
            GetObjectResponse startAndEndResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(startAndEndResponse);
            assertNotNull(startAndEndResponse.getInputStream());

            InputStream expectedStream = getExpectedInputStream(range);
            assertTrue(
                    FileUtils.contentEquals(expectedStream, startAndEndResponse.getInputStream()));

            range = new Range(1L, null);
            GetObjectResponse startOnlyResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(startOnlyResponse);
            assertNotNull(startOnlyResponse.getInputStream());

            expectedStream = getExpectedInputStream(range);
            assertTrue(FileUtils.contentEquals(expectedStream, startOnlyResponse.getInputStream()));

            // on a 100 byte object, the range "-99" actually means "the last 99 bytes"
            range = new Range(null, TEST_FILE.length() - 1);
            GetObjectResponse endOnlyResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            // just as a sanity check, also download this with straight Object Storage, no download manager
            GetObjectResponse endOnlyResponseNoManager =
                    CLIENT.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(endOnlyResponseNoManager);
            assertNotNull(endOnlyResponseNoManager.getInputStream());
            expectedStream = getExpectedInputStream(range);
            assertTrue(
                    FileUtils.contentEquals(
                            expectedStream, endOnlyResponseNoManager.getInputStream()));

            assertNotNull(endOnlyResponse);
            assertNotNull(endOnlyResponse.getInputStream());
            expectedStream = getExpectedInputStream(range);
            assertTrue(FileUtils.contentEquals(expectedStream, endOnlyResponse.getInputStream()));

            assertTrue(FileUtils.contentEquals(expectedStream, endOnlyResponse.getInputStream()));
        } finally {
            DeleteObjectResponse deleteResponse =
                    CLIENT.deleteObject(
                            DeleteObjectRequest.builder()
                                    .bucketName(bucketName)
                                    .namespaceName(namespace)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(deleteResponse);
        }
    }

    @Test
    public void getObject_withRange_endOnly() throws IOException {
        String bucketName = createCrudName();
        this.createBucketAndVerifyResponse(namespace, bucketName, new HashMap<>());

        String objectName = createCrudName();
        this.createObjectAndVerifyResponse(bucketName, objectName);

        try {
            DownloadManager downloadManager = buildDownloadManager();

            // on a 100 byte object, the range "-99" actually means "the last 99 bytes"
            Range range = new Range(null, TEST_FILE.length() - 1);
            System.out.println(range);
            GetObjectResponse endOnlyResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(endOnlyResponse);
            assertNotNull(endOnlyResponse.getInputStream());
            InputStream expectedStream = getExpectedInputStream(range);

            assertTrue(FileUtils.contentEquals(expectedStream, endOnlyResponse.getInputStream()));
        } finally {
            DeleteObjectResponse deleteResponse =
                    CLIENT.deleteObject(
                            DeleteObjectRequest.builder()
                                    .bucketName(bucketName)
                                    .namespaceName(namespace)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(deleteResponse);
        }
    }

    @Test
    public void getObject_withRange_endOnly_full() throws IOException {
        String bucketName = createCrudName();
        this.createBucketAndVerifyResponse(namespace, bucketName, new HashMap<>());

        String objectName = createCrudName();
        this.createObjectAndVerifyResponse(bucketName, objectName);

        try {
            DownloadManager downloadManager = buildDownloadManager();

            // on a 100 byte object, the range "-99" actually means "the last 99 bytes"
            Range range =
                    new Range(
                            null, TEST_FILE.length()); // this is the same as requesting everything
            System.out.println(range);
            GetObjectResponse endOnlyResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            // just as a sanity check, also download this with straight Object Storage, no download manager
            GetObjectResponse endOnlyResponseNoManager =
                    CLIENT.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(endOnlyResponseNoManager);
            assertNotNull(endOnlyResponseNoManager.getInputStream());
            InputStream expectedStream = getExpectedInputStream(range);
            assertTrue(
                    FileUtils.contentEquals(
                            expectedStream, endOnlyResponseNoManager.getInputStream()));

            assertNotNull(endOnlyResponse);
            assertNotNull(endOnlyResponse.getInputStream());
            expectedStream = getExpectedInputStream(range);

            assertTrue(FileUtils.contentEquals(expectedStream, endOnlyResponse.getInputStream()));
        } finally {
            DeleteObjectResponse deleteResponse =
                    CLIENT.deleteObject(
                            DeleteObjectRequest.builder()
                                    .bucketName(bucketName)
                                    .namespaceName(namespace)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(deleteResponse);
        }
    }

    @Test
    public void getObject_withRange_endOnly_tooMuch() throws IOException {
        String bucketName = createCrudName();
        this.createBucketAndVerifyResponse(namespace, bucketName, new HashMap<>());

        String objectName = createCrudName();
        this.createObjectAndVerifyResponse(bucketName, objectName);

        try {
            DownloadManager downloadManager = buildDownloadManager();

            // on a 100 byte object, the range "-99" actually means "the last 99 bytes"
            // this actually requests more than the file length, so it also returns the entire file
            Range range = new Range(null, TEST_FILE.length() + 1);
            System.out.println(range);
            GetObjectResponse endOnlyResponse =
                    downloadManager.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            // just as a sanity check, also download this with straight Object Storage, no download manager
            GetObjectResponse endOnlyResponseNoManager =
                    CLIENT.getObject(
                            GetObjectRequest.builder()
                                    .namespaceName(namespace)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .range(range)
                                    .build());

            assertNotNull(endOnlyResponseNoManager);
            assertNotNull(endOnlyResponseNoManager.getInputStream());
            InputStream expectedStream = getExpectedInputStream(range);
            assertTrue(
                    FileUtils.contentEquals(
                            expectedStream, endOnlyResponseNoManager.getInputStream()));

            assertNotNull(endOnlyResponse);
            assertNotNull(endOnlyResponse.getInputStream());
            expectedStream = getExpectedInputStream(range);

            assertTrue(FileUtils.contentEquals(expectedStream, endOnlyResponse.getInputStream()));
        } finally {
            DeleteObjectResponse deleteResponse =
                    CLIENT.deleteObject(
                            DeleteObjectRequest.builder()
                                    .bucketName(bucketName)
                                    .namespaceName(namespace)
                                    .objectName(objectName)
                                    .build());

            assertNotNull(deleteResponse);
        }
    }

    protected InputStream getExpectedInputStream(Range range) throws IOException {
        return getExpectedInputStream(range, TEST_FILE);
    }

    protected InputStream getExpectedInputStream(Range range, File testFile) throws IOException {
        long startByte;
        long endByte;
        if (range.getStartByte() != null) {
            startByte = range.getStartByte();
            endByte = range.getEndByte() != null ? range.getEndByte() : testFile.length();
        } else {
            // this means "the last range.getEndByte() bytes"
            startByte = Math.max(testFile.length() - range.getEndByte(), 0);
            endByte = testFile.length() - 1; // inclusive
        }

        InputStream expectedStream = new FileInputStream(testFile);
        StreamUtils.skipBytesInStream(expectedStream, startByte);

        // assume file length is 100; start of range is 1, end of range is 98 (but both are inclusive)
        // so we are allowed to read 98 - 1 + 1 = 98 bytes (just not the first byte and the last byte)
        expectedStream =
                StreamUtils.limitRemainingStreamLength(expectedStream, endByte - startByte + 1);

        return expectedStream;
    }

    private PutObjectResponse createObjectAndVerifyResponse(String bucketName, String objectName)
            throws FileNotFoundException {
        return createObjectAndVerifyResponse(bucketName, objectName, TEST_FILE);
    }

    private PutObjectResponse createObjectAndVerifyResponse(
            String bucketName, String objectName, File testFile) throws FileNotFoundException {
        final PutObjectRequest request =
                PutObjectRequest.builder()
                        .bucketName(bucketName)
                        .namespaceName(namespace)
                        .objectName(objectName)
                        .opcMeta(TEST_OBJECT_METADATA)
                        .putObjectBody(new FileInputStream(testFile))
                        .contentLength(testFile.length())
                        .contentLanguage("en-US")
                        .build();

        final PutObjectResponse response = CLIENT.putObject(request);

        assertTrue(StringUtils.isNotBlank(response.getETag()), "ETag should not be blank");
        assertNotNull(response.getLastModified(), "Last modified should not be null");
        assertTrue(
                StringUtils.isBlank(response.getOpcClientRequestId()),
                "OpcClientRequestId should be blank");
        assertTrue(
                StringUtils.isNotBlank(response.getOpcContentMd5()),
                "OpcContentMd5 should not be blank");
        assertTrue(
                StringUtils.isNotBlank(response.getOpcRequestId()),
                "OpcRequestId should not be blank");

        return response;
    }

    private static File generateTestFile(int length) throws IOException {
        File f =
                File.createTempFile(
                        DownloadManagerTest.class.getSimpleName() + "-", ".original.dat");
        f.deleteOnExit();

        Random r = new Random();
        byte[] bytes = new byte[1];

        try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(f))) {
            for (int i = 0; i < length; ++i) {
                r.nextBytes(bytes);
                os.write(bytes[0]);
            }
        }

        return f;
    }
}
