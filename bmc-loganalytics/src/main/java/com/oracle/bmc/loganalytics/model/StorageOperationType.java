/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/** These are the asynchronous operation name for a storage work Request */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum StorageOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    OffboardTenancy("OFFBOARD_TENANCY"),
    PurgeStorageData("PURGE_STORAGE_DATA"),
    RecallArchivedStorageData("RECALL_ARCHIVED_STORAGE_DATA"),
    ReleaseRecalledStorageData("RELEASE_RECALLED_STORAGE_DATA"),
    PurgeArchivalData("PURGE_ARCHIVAL_DATA"),
    ArchiveStorageData("ARCHIVE_STORAGE_DATA"),
    CleanupArchivalStorageData("CLEANUP_ARCHIVAL_STORAGE_DATA"),
    EncryptActiveData("ENCRYPT_ACTIVE_DATA"),
    EncryptArchivalData("ENCRYPT_ARCHIVAL_DATA"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StorageOperationType.class);

    private final String value;
    private static java.util.Map<String, StorageOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (StorageOperationType v : StorageOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    StorageOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StorageOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'StorageOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
