/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;

/**
 * Encapsulates a checksum value and its corresponding algorithm. Stores a checksum along with the
 * {@link ChecksumAlgorithm}.
 */
public class ChecksumInfo {
    private final String checksum;
    private final ChecksumAlgorithm algorithm;

    public ChecksumInfo(String checksum, ChecksumAlgorithm algorithm) {
        this.checksum = checksum;
        this.algorithm = algorithm; // Algorithm can be null for MD5
    }

    public String getChecksum() {
        return checksum;
    }

    public ChecksumAlgorithm getAlgorithm() {
        return algorithm;
    }
}
