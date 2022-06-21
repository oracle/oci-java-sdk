/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;

public class RetryingStreamTest {
    @Test
    public void testCloseTwice() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("foo".getBytes());
        GetObjectResponse response =
                GetObjectResponse.builder().inputStream(inputStream).contentLength(3L).build();
        RetryingStream rs = new RetryingStream(null, null, response, null);
        rs.close();
        rs.close();
    }

    @Test
    public void testEndOnlyRange() throws IOException {
        ObjectStorage mockClient = mock(ObjectStorage.class);

        String data = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(data.substring(1).getBytes());
        GetObjectRequest request = GetObjectRequest.builder().range(new Range(null, 9L)).build();

        IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream chaosInputStream =
                new IOExceptionThrowingObjectStorageClient.IOExceptionThrowingInputStream(
                        inputStream,
                        new Predicate<Long>() {
                            private volatile Long throwAtBytesRead = 2L;

                            @Override
                            public boolean test(Long bytesRead) {
                                if (throwAtBytesRead.equals(bytesRead)) {
                                    throwAtBytesRead = -1L;
                                    return true;
                                }
                                return false;
                            }
                        });

        when(mockClient.getObject(any(GetObjectRequest.class)))
                .thenReturn(
                        GetObjectResponse.builder()
                                // it'll read 2 bytes, then fail, so 7 bytes remaining
                                .contentLength(7L)
                                .inputStream(new ByteArrayInputStream(data.substring(3).getBytes()))
                                .build());

        GetObjectResponse response =
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

        Optional<String> contentDiffers =
                StreamUtils.contentDiffers(
                        expectedStream, new ByteArrayInputStream(baos.toByteArray()));
        assertFalse(contentDiffers.orElse(""), contentDiffers.isPresent());

        ArgumentCaptor<GetObjectRequest> argCaptor =
                ArgumentCaptor.forClass(GetObjectRequest.class);

        verify(mockClient).getObject(argCaptor.capture());
        verifyNoMoreInteractions(mockClient);

        assertNull(argCaptor.getValue().getRange().getStartByte());
        // last 7 bytes
        assertEquals(7L, argCaptor.getValue().getRange().getEndByte().longValue());

        rs.close();
    }
}
