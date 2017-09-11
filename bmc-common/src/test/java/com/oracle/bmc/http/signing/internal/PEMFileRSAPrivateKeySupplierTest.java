/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
