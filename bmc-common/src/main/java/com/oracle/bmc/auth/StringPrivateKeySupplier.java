/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import com.google.common.base.Supplier;

/**
 * Supplier for private key in String format
 */
public class StringPrivateKeySupplier implements Supplier<InputStream> {

    private final String privateKey;

    @java.beans.ConstructorProperties({"privateKey"})
    public StringPrivateKeySupplier(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public InputStream get() {
        return new ByteArrayInputStream(privateKey.getBytes(StandardCharsets.UTF_8));
    }

    public String toString() {
        return "StringPrivateKeySupplier(privateKey=" + this.privateKey + ")";
    }
}
