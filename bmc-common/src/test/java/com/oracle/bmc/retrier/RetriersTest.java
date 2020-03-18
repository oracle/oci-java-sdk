/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Tests for {@link Retriers}.
 */
public class RetriersTest {
    @Mock private InputStream is;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTryResetStreamForRetry_CanReset() throws IOException {
        when(is.markSupported()).thenReturn(true);

        Retriers.tryResetStreamForRetry(is);

        verify(is).markSupported();
        verify(is).reset();
        verifyNoMoreInteractions(is);
    }
}
