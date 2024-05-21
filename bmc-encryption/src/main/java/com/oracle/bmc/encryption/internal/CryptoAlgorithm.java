/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

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

    @java.beans.ConstructorProperties({
        "algorithmId",
        "algorithm",
        "mode",
        "dataKeyLen",
        "ivLen",
        "tagLen",
        "padding",
        "blockSize"
    })
    CryptoAlgorithm(
            int algorithmId,
            String algorithm,
            String mode,
            int dataKeyLen,
            int ivLen,
            int tagLen,
            int padding,
            int blockSize) {
        this.algorithmId = algorithmId;
        this.algorithm = algorithm;
        this.mode = mode;
        this.dataKeyLen = dataKeyLen;
        this.ivLen = ivLen;
        this.tagLen = tagLen;
        this.padding = padding;
        this.blockSize = blockSize;
    }

    public int getAlgorithmId() {
        return this.algorithmId;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public String getMode() {
        return this.mode;
    }

    public int getDataKeyLen() {
        return this.dataKeyLen;
    }

    public int getIvLen() {
        return this.ivLen;
    }

    public int getTagLen() {
        return this.tagLen;
    }

    public int getPadding() {
        return this.padding;
    }

    public int getBlockSize() {
        return this.blockSize;
    }
}
