/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Category key for crypto findings. These are stable values meant for programmatic use; clients can map them to user-facing labels.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum CryptoFindingCategory {
    NetworkEncryption("NETWORK_ENCRYPTION"),
    DataEncryption("DATA_ENCRYPTION"),
    CertificatesAndKeyManagement("CERTIFICATES_AND_KEY_MANAGEMENT"),
    BackupAndExportEncryption("BACKUP_AND_EXPORT_ENCRYPTION"),
    PostQuantumReadiness("POST_QUANTUM_READINESS"),
    NotSupported("NOT_SUPPORTED"),
    ;

    private final String value;
    private static java.util.Map<String, CryptoFindingCategory> map;

    static {
        map = new java.util.HashMap<>();
        for (CryptoFindingCategory v : CryptoFindingCategory.values()) {
            map.put(v.getValue(), v);
        }
    }

    CryptoFindingCategory(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CryptoFindingCategory create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CryptoFindingCategory: " + key);
    }
}
