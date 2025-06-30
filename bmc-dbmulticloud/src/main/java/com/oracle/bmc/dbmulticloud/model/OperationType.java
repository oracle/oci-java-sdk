/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateAzureConnector("CREATE_AZURE_CONNECTOR"),
    DeleteAzureConnector("DELETE_AZURE_CONNECTOR"),
    UpdateAzureConnector("UPDATE_AZURE_CONNECTOR"),
    MoveAzureConnector("MOVE_AZURE_CONNECTOR"),
    CreateAzureBlobContainer("CREATE_AZURE_BLOB_CONTAINER"),
    DeleteAzureBlobContainer("DELETE_AZURE_BLOB_CONTAINER"),
    UpdateAzureBlobContainer("UPDATE_AZURE_BLOB_CONTAINER"),
    MoveAzureBlobContainer("MOVE_AZURE_BLOB_CONTAINER"),
    CreateAzureBlobMount("CREATE_AZURE_BLOB_MOUNT"),
    MoveAzureBlobMount("MOVE_AZURE_BLOB_MOUNT"),
    UpdateAzureBlobMount("UPDATE_AZURE_BLOB_MOUNT"),
    DeleteAzureBlobMount("DELETE_AZURE_BLOB_MOUNT"),
    CreateMulticloudDiscovery("CREATE_MULTICLOUD_DISCOVERY"),
    DeleteMulticloudDiscovery("DELETE_MULTICLOUD_DISCOVERY"),
    UpdateMulticloudDiscovery("UPDATE_MULTICLOUD_DISCOVERY"),
    MoveMulticloudDiscovery("MOVE_MULTICLOUD_DISCOVERY"),
    CreateAzureVault("CREATE_AZURE_VAULT"),
    DeleteAzureVault("DELETE_AZURE_VAULT"),
    UpdateAzureVault("UPDATE_AZURE_VAULT"),
    MoveAzureVault("MOVE_AZURE_VAULT"),
    RefreshAzureVault("REFRESH_AZURE_VAULT"),
    CreateAzureVaultAssociation("CREATE_AZURE_VAULT_ASSOCIATION"),
    DeleteAzureVaultAssociation("DELETE_AZURE_VAULT_ASSOCIATION"),
    UpdateAzureVaultAssociation("UPDATE_AZURE_VAULT_ASSOCIATION"),
    MoveAzureVaultAssociation("MOVE_AZURE_VAULT_ASSOCIATION"),
    PatchDbResource("PATCH_DB_RESOURCE"),
    CreateGcpIdentityConfiguration("CREATE_GCP_IDENTITY_CONFIGURATION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
