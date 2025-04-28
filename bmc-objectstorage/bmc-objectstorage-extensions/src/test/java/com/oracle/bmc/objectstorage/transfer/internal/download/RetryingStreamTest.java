/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Predicate;

import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.DownloadConfiguration;
import com.oracle.bmc.objectstorage.transfer.internal.download.chaos.IOExceptionThrowingObjectStorageClient;
import com.oracle.bmc.util.StreamUtils;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;

public class RetryingStreamTest {

    private IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream createChaosStream(
            InputStream inputStream, Long throwsAtByteRead) {
        return new IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream(
                inputStream,
                new Predicate<Long>() {
                    private volatile Long throwAtBytesRead = throwsAtByteRead;

                    @Override
                    public boolean test(Long bytesRead) {
                        if (throwAtBytesRead.equals(bytesRead)) {
                            throwAtBytesRead = -1L;
                            return true;
                        }
                        return false;
                    }
                });
    }

    private void assertAndVerify(
            InputStream expStream,
            ByteArrayOutputStream baos,
            ObjectStorage mockClient,
            Long startRange,
            Long endRange)
            throws IOException {
        Optional<String> contentDiffers =
                StreamUtils.contentDiffers(expStream, new ByteArrayInputStream(baos.toByteArray()));
        assertFalse(contentDiffers.orElse(""), contentDiffers.isPresent());

        ArgumentCaptor<GetObjectRequest> argCaptor =
                ArgumentCaptor.forClass(GetObjectRequest.class);

        verify(mockClient).getObject(argCaptor.capture());
        verifyNoMoreInteractions(mockClient);

        Long startByteArg = argCaptor.getValue().getRange().getStartByte();
        Long endByteArg = argCaptor.getValue().getRange().getEndByte();

        if (startRange == null) {
            assertNull(startByteArg);
        } else {
            assertEquals(startRange.longValue(), startByteArg.longValue());
        }

        if (endRange == null) {
            assertNull(endByteArg);
        } else {
            assertEquals(endRange.longValue(), endByteArg.longValue());
        }
    }

    @Test
    public void testCloseTwice() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("foo".getBytes());
        GetObjectResponse response =
                GetObjectResponse.builder().inputStream(inputStream).contentLength(3L).build();
        RetryingStream rs = new RetryingStream(null, null, response, null);
        rs.close();
        rs.close();
    }

    /** Tests for requests without range */
    @Test
    public void testWithoutRequestRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(1).getBytes());
        GetObjectRequest request = GetObjectRequest.builder().build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                createChaosStream(inputStream, 2L);

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 7 bytes remaining
                                .contentLength(7L)
                                .inputStream(new ByteArrayInputStream(data.substring(3).getBytes()))
                                .contentRange(new Range(2L, 8L))
                                .build());

        GetObjectResponse response =
                GetObjectResponse.builder().inputStream(chaosInputStream).contentLength(9L).build();
        GetObjectResponse.builder().inputStream(chaosInputStream).contentLength(9L).build();

        RetryingStream rs =
                new RetryingStream(
                        mockClient,
                        request,
                        response,
                        DownloadExecution.fromConfig(DownloadConfiguration.builder().build()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read;
        while ((read = rs.read()) != -1) {
            baos.write(read);
        }

        InputStream expectedStream = new ByteArrayInputStream(data.substring(1).getBytes());
        assertAndVerify(expectedStream, baos, mockClient, 2L, null);
        rs.close();
    }

    /** Tests for requests with bounded range i.e within (0, object-content-length) */
    @Test
    public void testWithRequestRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(3, 8).getBytes());
        GetObjectRequest request = GetObjectRequest.builder().range(new Range(3L, 7L)).build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                createChaosStream(inputStream, 2L);

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 3 bytes remaining
                                .contentLength(3L)
                                .inputStream(
                                        new ByteArrayInputStream(data.substring(5, 8).getBytes()))
                                .contentRange(new Range(5L, 7L))
                                .build());

        GetObjectResponse response =
                GetObjectResponse.builder()
                        .inputStream(chaosInputStream)
                        .contentLength(5L)
                        .contentRange(new Range(3L, 7L))
                        .build();

        RetryingStream rs =
                new RetryingStream(
                        mockClient,
                        request,
                        response,
                        DownloadExecution.fromConfig(DownloadConfiguration.builder().build()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read;
        while ((read = rs.read()) != -1) {
            baos.write(read);
        }

        InputStream expectedStream = new ByteArrayInputStream(data.substring(3, 8).getBytes());
        assertAndVerify(expectedStream, baos, mockClient, 5L, 7L);
        rs.close();
    }

    /** Tests for requests with endOnly range <= object-content-length */
    @Test
    public void testEndOnlyRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(1).getBytes());
        GetObjectRequest request = GetObjectRequest.builder().range(new Range(null, 9L)).build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                createChaosStream(inputStream, 2L);

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 7 bytes remaining
                                .contentLength(7L)
                                .inputStream(new ByteArrayInputStream(data.substring(3).getBytes()))
                                .contentRange(new Range(2L, 8L))
                                .build());

        GetObjectResponse response =
                GetObjectResponse.builder()
                        .inputStream(chaosInputStream)
                        .contentLength(9L)
                        .contentRange(new Range(0L, 8L))
                        .build();

        RetryingStream rs =
                new RetryingStream(
                        mockClient,
                        request,
                        response,
                        DownloadExecution.fromConfig(DownloadConfiguration.builder().build()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read;
        while ((read = rs.read()) != -1) {
            baos.write(read);
        }

        InputStream expectedStream = new ByteArrayInputStream(data.substring(1).getBytes());
        assertAndVerify(expectedStream, baos, mockClient, 2L, 8L);
        rs.close();
    }

    /** Tests for requests with endOnly range > object-content-length */
    @Test
    public void testEndOnlyLargeRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(1).getBytes());
        GetObjectRequest request =
                GetObjectRequest.builder().range(new Range(null, Long.MAX_VALUE)).build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                createChaosStream(inputStream, 2L);

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 7 bytes remaining
                                .contentLength(7L)
                                .contentRange(new Range(2L, 8L))
                                .inputStream(new ByteArrayInputStream(data.substring(3).getBytes()))
                                .build());

        GetObjectResponse response =
                GetObjectResponse.builder()
                        .inputStream(chaosInputStream)
                        .contentLength(9L)
                        .contentRange(new Range(0L, 8L))
                        .build();

        RetryingStream rs =
                new RetryingStream(
                        mockClient,
                        request,
                        response,
                        DownloadExecution.fromConfig(DownloadConfiguration.builder().build()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read;
        while ((read = rs.read()) != -1) {
            baos.write(read);
        }

        InputStream expectedStream = new ByteArrayInputStream(data.substring(1).getBytes());
        assertAndVerify(expectedStream, baos, mockClient, 2L, 8L);
        rs.close();
    }

    /** Tests for requests with End range > object-content-length */
    @Test
    public void testLargeEndRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(2).getBytes());
        GetObjectRequest request =
                GetObjectRequest.builder().range(new Range(2L, Long.MAX_VALUE)).build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                createChaosStream(inputStream, 2L);

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 5 bytes remaining
                                .contentLength(5L)
                                .inputStream(new ByteArrayInputStream(data.substring(4).getBytes()))
                                .contentRange(new Range(4L, 8L))
                                .build());

        GetObjectResponse response =
                GetObjectResponse.builder()
                        .inputStream(chaosInputStream)
                        .contentLength(7L)
                        .contentRange(new Range(2L, 8L))
                        .build();

        RetryingStream rs =
                new RetryingStream(
                        mockClient,
                        request,
                        response,
                        DownloadExecution.fromConfig(DownloadConfiguration.builder().build()));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read;
        while ((read = rs.read()) != -1) {
            baos.write(read);
        }
        InputStream expectedStream = new ByteArrayInputStream(data.substring(2, 9).getBytes());
        assertAndVerify(expectedStream, baos, mockClient, 4L, 8L);
        rs.close();
    }
}
