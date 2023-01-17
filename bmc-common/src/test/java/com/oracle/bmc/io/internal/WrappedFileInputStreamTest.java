/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WrappedFileInputStreamTest {
    private static final String MESSAGE = "abcdefghijklmnopqrstuvwxyz";
    private File tmpFile;

    @Before
    public void setUp() throws IOException {
        tmpFile = File.createTempFile("WrappedFileInputStreamTest", null);
        tmpFile.deleteOnExit();

        try (FileOutputStream fos = new FileOutputStream(tmpFile)) {
            fos.write(MESSAGE.getBytes());
        }
    }

    @After
    public void tearDown() throws IOException {
        if (tmpFile != null) {
            tmpFile.delete();
        }
    }

    @Test
    public void getSourceFile() throws IOException {
        try (WrappedFileInputStream wrappedStream = new WrappedFileInputStream(tmpFile)) {
            assertSame(tmpFile, wrappedStream.getSourceFile());
        }
    }

    @Test
    public void markReset() throws IOException {
        try (WrappedFileInputStream wrappedStream = new WrappedFileInputStream(tmpFile)) {
            // mark supported
            assertTrue(wrappedStream.markSupported());

            // advance 3
            wrappedStream.read();
            wrappedStream.read();
            wrappedStream.read();

            // mark
            wrappedStream.mark(100);

            // advance 3 more
            wrappedStream.read();
            wrappedStream.read();
            wrappedStream.read();

            // verify location
            assertEquals('g', wrappedStream.read());

            // skip 3
            wrappedStream.skip(3L);

            // verify location
            assertEquals('k', wrappedStream.read());

            // reset
            wrappedStream.reset();

            // verify location
            assertEquals('d', wrappedStream.read());
        }
    }
}
