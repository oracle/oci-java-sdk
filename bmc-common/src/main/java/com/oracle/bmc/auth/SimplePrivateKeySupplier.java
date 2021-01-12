/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import static com.oracle.bmc.util.internal.FileUtils.expandUserHome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.google.common.base.Supplier;

/**
 * Simple Supplier for the private key that handles missing files.
 */
@RequiredArgsConstructor
@ToString
public class SimplePrivateKeySupplier implements Supplier<InputStream> {

    private final String pemFilePath;

    @Override
    public InputStream get() {
        try {
            return new FileInputStream(new File(expandUserHome(pemFilePath)));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Could not find private key: " + pemFilePath, e);
        }
    }
}
