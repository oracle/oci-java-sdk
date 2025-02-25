/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.oracle.bmc.util.StreamUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringPrivateKeySupplierTest {
    private static final String DATA = "123abcdef";

    @Test
    public void testGet() throws IOException {
        StringPrivateKeySupplier s = new StringPrivateKeySupplier(DATA);
        InputStream is = s.get();
        String read = StreamUtils.toString(is, StandardCharsets.UTF_8);
        assertEquals(DATA, read);

        // get again
        is = s.get();
        read = StreamUtils.toString(is, StandardCharsets.UTF_8);
        assertEquals(DATA, read);
    }
}
