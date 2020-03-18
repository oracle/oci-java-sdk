/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * Tests for {@link KeepOpenInputStream}.
 */
public class KeepOpenInputStreamTest {
    @Mock private InputStream is;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testClose() throws IOException {
        KeepOpenInputStream keepOpenInputStream = new KeepOpenInputStream(is);
        keepOpenInputStream.close();
        verifyNoMoreInteractions(is);
    }

    @Test
    public void testDoClose() throws IOException {
        KeepOpenInputStream keepOpenInputStream = new KeepOpenInputStream(is);
        keepOpenInputStream.doClose();
        verify(is).close();
    }

    @Test
    public void testCloseStream() throws IOException {
        InputStream is2 = mock(InputStream.class);
        KeepOpenInputStream keepOpenInputStream = new KeepOpenInputStream(is);

        KeepOpenInputStream.closeStream(is2);
        verify(is2).close();

        KeepOpenInputStream.closeStream(keepOpenInputStream);
        verify(is).close();

        verifyNoMoreInteractions(is, is2);
    }
}
