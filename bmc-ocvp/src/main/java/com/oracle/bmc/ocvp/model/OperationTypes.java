/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Possible asynchronous operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public enum OperationTypes {
    CreateSddc("CREATE_SDDC"),
    DeleteSddc("DELETE_SDDC"),
    CreateCluster("CREATE_CLUSTER"),
    DeleteCluster("DELETE_CLUSTER"),
    CreateEsxiHost("CREATE_ESXI_HOST"),
    DeleteEsxiHost("DELETE_ESXI_HOST"),
    UpgradeHcx("UPGRADE_HCX"),
    DowngradeHcx("DOWNGRADE_HCX"),
    CancelDowngradeHcx("CANCEL_DOWNGRADE_HCX"),
    RefreshHcxLicenseStatus("REFRESH_HCX_LICENSE_STATUS"),
    SwapBilling("SWAP_BILLING"),
    ReplaceHost("REPLACE_HOST"),
    InPlaceUpgrade("IN_PLACE_UPGRADE"),
    CreateDatastore("CREATE_DATASTORE"),
    UpdateDatastore("UPDATE_DATASTORE"),
    AddBlockVolumeToDatastore("ADD_BLOCK_VOLUME_TO_DATASTORE"),
    DeleteDatastore("DELETE_DATASTORE"),
    CreateDatastoreCluster("CREATE_DATASTORE_CLUSTER"),
    UpdateDatastoreCluster("UPDATE_DATASTORE_CLUSTER"),
    AttachDatastoreClusterToEsxiHost("ATTACH_DATASTORE_CLUSTER_TO_ESXI_HOST"),
    AttachDatastoreClusterToCluster("ATTACH_DATASTORE_CLUSTER_TO_CLUSTER"),
    DetachDatastoreClusterFromEsxiHost("DETACH_DATASTORE_CLUSTER_FROM_ESXI_HOST"),
    DetachDatastoreClusterFromCluster("DETACH_DATASTORE_CLUSTER_FROM_CLUSTER"),
    DeleteDatastoreCluster("DELETE_DATASTORE_CLUSTER"),
    AddDatastoreToDatastoreCluster("ADD_DATASTORE_TO_DATASTORE_CLUSTER"),
    RemoveDatastoreFromDatastoreCluster("REMOVE_DATASTORE_FROM_DATASTORE_CLUSTER"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationTypes.class);

    private final String value;
    private static java.util.Map<String, OperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationTypes v : OperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
