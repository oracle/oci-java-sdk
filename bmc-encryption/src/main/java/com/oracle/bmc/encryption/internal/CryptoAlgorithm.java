/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CryptoAlgorithm {
    /**
     * AES-GCM 128
     */
    AES_128_GCM_IV12_TAG16(0, "AES", "AES/GCM/NoPadding", 16, 12, 16, 0, 16),
    /**
     * AES-GCM 192
     */
    AES_192_GCM_IV12_TAG16(0, "AES", "AES/GCM/NoPadding", 24, 12, 16, 0, 16),
    /**
     * AES-GCM 256
     */
    AES_256_GCM_IV12_TAG16(0, "AES", "AES/GCM/NoPadding", 32, 12, 16, 0, 16);

    private final int algorithmId;
    private final String algorithm;
    private final String mode;
    private final int dataKeyLen;
    private final int ivLen;
    private final int tagLen;
    private final int padding;
    private final int blockSize;
}
