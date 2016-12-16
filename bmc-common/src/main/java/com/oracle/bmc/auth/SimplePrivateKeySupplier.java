/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
