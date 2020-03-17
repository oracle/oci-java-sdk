/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import com.oracle.bmc.io.internal.WrappedFileInputStream;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Tests for {@link ResettableFileInputStream}.
 */
public class ResettableFileInputStreamTest {
    @Test
    public void testAlreadyWrapped() throws IOException {
        FileInputStream alreadyWrapped = mock(WrappedFileInputStream.class);
        FileChannel mockFileChannel = mock(FileChannel.class);
        when(alreadyWrapped.getChannel()).thenReturn(mockFileChannel);
        when(mockFileChannel.position()).thenReturn(0L);

        ResettableFileInputStream rfis = new ResettableFileInputStream(alreadyWrapped);

        rfis.mark(Integer.MAX_VALUE);
        rfis.reset();

        verify(alreadyWrapped).mark(Integer.MAX_VALUE);
        verify(alreadyWrapped).reset();
        verifyNoMoreInteractions(alreadyWrapped);
    }

    @Test
    public void testNotWrappable() throws IOException {
        try {
            FileInputStream notWrappable = mock(FileInputStream.class);
            FileChannel mockFileChannel = mock(FileChannel.class);
            when(notWrappable.getChannel()).thenReturn(mockFileChannel);
            when(mockFileChannel.position()).thenThrow(new IOException());
            new ResettableFileInputStream(notWrappable);
            fail("Should have thrown an IOException");
        } catch (IllegalArgumentException iae) {
            // expected
        }
    }

    @Test
    public void testNeedsToBeWrapped() throws IOException {
        Path tempFile = Files.createTempFile(this.getClass().getSimpleName() + "-", ".tmp");
        tempFile.toFile().deleteOnExit();

        Files.write(tempFile, new byte[] {0, 1, 2, 3, 4});

        FileInputStream fis = new FileInputStream(tempFile.toFile());
        ResettableFileInputStream rfis = new ResettableFileInputStream(fis);

        rfis.mark(Integer.MAX_VALUE);
        assertEquals(0, rfis.read());
        assertEquals(1, rfis.read());

        rfis.reset();
        assertEquals(0, rfis.read());
        assertEquals(1, rfis.read());

        rfis.mark(Integer.MAX_VALUE);
        assertEquals(2, rfis.read());
        assertEquals(3, rfis.read());

        rfis.reset();
        assertEquals(2, rfis.read());
        assertEquals(3, rfis.read());
        assertEquals(4, rfis.read());
        assertEquals(-1, rfis.read());
    }
}
