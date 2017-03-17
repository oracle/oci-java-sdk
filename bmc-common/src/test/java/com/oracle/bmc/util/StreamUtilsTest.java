/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.oracle.bmc.util.StreamUtils;

public class StreamUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void fileToInputStream_invalidFile() {
        StreamUtils.toInputStream(new File("/asdfjkl"));
    }

    @Test
    public void fileToInputStream() throws IOException {
        File file = File.createTempFile("StreamUtilsTest", null);
        file.deleteOnExit();

        InputStream stream = StreamUtils.toInputStream(file);
        assertNotNull(stream);

        file.delete();
    }
}
