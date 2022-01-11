/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Tests for {@link PEMFileRSAPrivateKeySupplierTest}.
 */
public class PEMFileRSAPrivateKeySupplierTest {
    @Test(expected = IllegalArgumentException.class)
    public void ctor_invalidFile() throws IOException {
        InputStream notAPem = new ByteArrayInputStream(new byte[0]);
        // not a valid key file
        new PEMFileRSAPrivateKeySupplier(notAPem, null);
        fail("Should have thrown an IllegalArgumentException");
    }
}
