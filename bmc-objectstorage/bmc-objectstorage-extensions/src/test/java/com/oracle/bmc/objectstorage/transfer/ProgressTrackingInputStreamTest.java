/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.InputStream;

public class ProgressTrackingInputStreamTest {
    abstract class DIStream extends InputStream implements DuplicatableInputStream {}

    private static final InputStream inputStream = mock(InputStream.class);
    private static final ProgressTracker progressTracker = mock(ProgressTracker.class);
    private static final DIStream diStream = mock(DIStream.class);
    private static final int READ_CHUNK_SIZE = 8192;

    @Test
    public void nullProgressTracker() {
        final InputStream progressTrackingInputStream =
                ProgressTrackingInputStreamFactory.create(inputStream, null);

        assertSame(inputStream, progressTrackingInputStream);
    }

    @Test
    public void nonDuplicatableStream() {
        final InputStream progressTrackingInputStream =
                ProgressTrackingInputStreamFactory.create(inputStream, progressTracker);

        assertFalse(progressTrackingInputStream instanceof DuplicatableInputStream);
    }

    @Test
    public void duplicatableStream() {
        final InputStream progressTrackingInputStream =
                ProgressTrackingInputStreamFactory.create(diStream, progressTracker);

        assertTrue(progressTrackingInputStream instanceof DuplicatableInputStream);
    }

    @Test
    public void duplicatableStream_duplicate() {
        final InputStream progressTrackingInputStream =
                ProgressTrackingInputStreamFactory.create(diStream, progressTracker);
        doReturn(diStream).when(diStream).duplicate();

        assertTrue(progressTrackingInputStream instanceof DuplicatableInputStream);
        final DuplicatableInputStream duplicatableProgressTrackingInputStream =
                (DuplicatableInputStream) progressTrackingInputStream;

        final InputStream duplicateStream = duplicatableProgressTrackingInputStream.duplicate();
        assertNotNull(duplicateStream);
        assertTrue(duplicateStream instanceof DuplicatableInputStream);

        verify(progressTracker, only()).reset();
    }

    @Test
    public void duplicatableStream_readAndDuplicate() throws IOException {
        final ProgressTracker progressTracker = mock(ProgressTracker.class);
        final InputStream progressTrackingInputStream =
                ProgressTrackingInputStreamFactory.create(diStream, progressTracker);
        when(diStream.read(any(byte[].class))).thenReturn(READ_CHUNK_SIZE);
        when(diStream.read()).thenReturn(1);
        doReturn(diStream).when(diStream).duplicate();

        final InOrder inOrder = Mockito.inOrder(progressTracker);
        final byte[] buffer = new byte[READ_CHUNK_SIZE];
        assertEquals(READ_CHUNK_SIZE, progressTrackingInputStream.read(buffer));
        inOrder.verify(progressTracker).onBytesRead(eq((long) READ_CHUNK_SIZE));

        doReturn(progressTracker).when(progressTracker).reset();
        final InputStream duplicateStream =
                ((DuplicatableInputStream) progressTrackingInputStream).duplicate();
        inOrder.verify(progressTracker).reset();

        assertEquals(1, duplicateStream.read());
        inOrder.verify(progressTracker).onBytesRead(eq(1L));
        assertEquals(READ_CHUNK_SIZE, duplicateStream.read(buffer));
        inOrder.verify(progressTracker).onBytesRead(eq((long) READ_CHUNK_SIZE));
    }
}
