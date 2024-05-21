/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.InputStream;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Tests for {@link DuplicatableKeepOpenInputStream}. We do not retest the parent class's functionality here since it
 * remains unchanged.
 */
public class DuplicatableKeepOpenInputStreamTest {
    @Mock private InputStream is;

    /**
     * We need a type that is both an InputStream and a DuplicatableInputStream, this serves the purpose
     */
    @Mock private WrappedByteArrayInputStream dis;
    @Mock private WrappedByteArrayInputStream dis2;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreationWithDuplicatableInputStream() {
        when(dis.markSupported()).thenReturn(true);
        DuplicatableKeepOpenInputStream duplicatableKeepOpenInputStream =
                new DuplicatableKeepOpenInputStream(dis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreationWithNonDuplicatableInputStream() {
        when(is.markSupported()).thenReturn(true);
        DuplicatableKeepOpenInputStream duplicatableKeepOpenInputStream =
                new DuplicatableKeepOpenInputStream(is);
    }

    @Test
    public void testDuplicateDuplicates() {
        when(dis.duplicate()).thenReturn(dis2);
        when(dis.markSupported()).thenReturn(true);
        when(dis2.markSupported()).thenReturn(true);
        DuplicatableKeepOpenInputStream duplicatableKeepOpenInputStream =
                new DuplicatableKeepOpenInputStream(dis);
        InputStream duplicate = duplicatableKeepOpenInputStream.duplicate();
        verify(dis, times(1)).markSupported();
        verify(dis, times(1)).duplicate();
        verifyNoMoreInteractions(dis);
        verify(dis2, times(1)).markSupported();
        verifyNoMoreInteractions(dis2);
        assertTrue(duplicate instanceof DuplicatableKeepOpenInputStream);
        assertNotEquals(duplicate, duplicatableKeepOpenInputStream);
    }
}
