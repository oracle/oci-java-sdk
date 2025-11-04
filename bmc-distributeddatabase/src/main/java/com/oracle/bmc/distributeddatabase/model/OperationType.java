/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateDistributedDb("CREATE_DISTRIBUTED_DB"),
    PatchDistributedDbInsertShards("PATCH_DISTRIBUTED_DB_INSERT_SHARDS"),
    PatchDistributedDbRemoveShards("PATCH_DISTRIBUTED_DB_REMOVE_SHARDS"),
    PatchDistributedDbMergeCatalogShards("PATCH_DISTRIBUTED_DB_MERGE_CATALOG_SHARDS"),
    DeleteDistributedDb("DELETE_DISTRIBUTED_DB"),
    ChangeDistributedDbCompartment("CHANGE_DISTRIBUTED_DB_COMPARTMENT"),
    ConfigureDistributedDbGsms("CONFIGURE_DISTRIBUTED_DB_GSMS"),
    ConfigureDistributedDbSharding("CONFIGURE_DISTRIBUTED_DB_SHARDING"),
    GenerateDistributedDbGsmCertSigningReq("GENERATE_DISTRIBUTED_DB_GSM_CERT_SIGNING_REQ"),
    RotateDistributedDbPasswords("ROTATE_DISTRIBUTED_DB_PASSWORDS"),
    StartDistributedDb("START_DISTRIBUTED_DB"),
    StopDistributedDb("STOP_DISTRIBUTED_DB"),
    StartDistributedDbShard("START_DISTRIBUTED_DB_SHARD"),
    StartDistributedDbCatalog("START_DISTRIBUTED_DB_CATALOG"),
    StopDistributedDbShard("STOP_DISTRIBUTED_DB_SHARD"),
    StopDistributedDbCatalog("STOP_DISTRIBUTED_DB_CATALOG"),
    UploadDistributedDbSignedCertAndGenerateWallet(
            "UPLOAD_DISTRIBUTED_DB_SIGNED_CERT_AND_GENERATE_WALLET"),
    CreateDistributedDbShard("CREATE_DISTRIBUTED_DB_SHARD"),
    CreateDistributedDbCatalog("CREATE_DISTRIBUTED_DB_CATALOG"),
    CreateDistributedDbGsm("CREATE_DISTRIBUTED_DB_GSM"),
    UpdateDistributedDbCatalogShards("UPDATE_DISTRIBUTED_DB_CATALOG_SHARDS"),
    ValidateNetwork("VALIDATE_NETWORK"),
    ExecuteValidateNetworkTests("EXECUTE_VALIDATE_NETWORK_TESTS"),
    CreatePrivateEndpoint("CREATE_PRIVATE_ENDPOINT"),
    DeletePrivateEndpoint("DELETE_PRIVATE_ENDPOINT"),
    ChangePrivateEndpointCompartment("CHANGE_PRIVATE_ENDPOINT_COMPARTMENT"),
    ReinstateProxyInstance("REINSTATE_PROXY_INSTANCE"),
    DeleteDistributedDbShard("DELETE_DISTRIBUTED_DB_SHARD"),
    DeleteDistributedDbCatalog("DELETE_DISTRIBUTED_DB_CATALOG"),
    DeleteDistributedDbGsm("DELETE_DISTRIBUTED_DB_GSM"),
    AddGdscontrolNode("ADD_GDSCONTROL_NODE"),
    ChangeDistributedDbBackupConfig("CHANGE_DISTRIBUTED_DB_BACKUP_CONFIG"),
    AddDistributedDbDg("ADD_DISTRIBUTED_DB_DG"),
    RemoveDistributedDbDg("REMOVE_DISTRIBUTED_DB_DG"),

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
