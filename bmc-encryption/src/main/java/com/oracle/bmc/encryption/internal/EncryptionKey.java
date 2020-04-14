/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption.internal;

import lombok.Value;

@Value
public class EncryptionKey {
    public final String region;
    public final String vaultId;
    public final String masterKeyId;
    public final String encryptedDataKey;
}
