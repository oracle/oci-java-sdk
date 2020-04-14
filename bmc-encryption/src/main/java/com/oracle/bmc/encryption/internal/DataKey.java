/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption.internal;

@lombok.Data
public class DataKey {
    public final String ciphertext;
    public final String plaintext;
    public final String plaintextChecksum;
}
