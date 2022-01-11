/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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

        try (InputStream stream = StreamUtils.toInputStream(file)) {
            assertNotNull(stream);
        }

        file.delete();
    }
}
