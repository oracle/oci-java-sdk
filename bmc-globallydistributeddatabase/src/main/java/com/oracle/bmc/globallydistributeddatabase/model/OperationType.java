/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateShardedDatabase("CREATE_SHARDED_DATABASE"),
    DeleteShardedDatabase("DELETE_SHARDED_DATABASE"),
    UpdateShardedDatabase("UPDATE_SHARDED_DATABASE"),
    ConfigureShardedDatabaseGsms("CONFIGURE_SHARDED_DATABASE_GSMS"),
    StartShardedDatabase("START_SHARDED_DATABASE"),
    StopShardedDatabase("STOP_SHARDED_DATABASE"),
    ValidateNetwork("VALIDATE_NETWORK"),
    ChangeShardedDbCompartment("CHANGE_SHARDED_DB_COMPARTMENT"),
    CreatePrivateEndpoint("CREATE_PRIVATE_ENDPOINT"),
    UpdatePrivateEndpoint("UPDATE_PRIVATE_ENDPOINT"),
    DeletePrivateEndpoint("DELETE_PRIVATE_ENDPOINT"),
    ChangePrivateEndpointCompartment("CHANGE_PRIVATE_ENDPOINT_COMPARTMENT"),
    InsertShards("INSERT_SHARDS"),
    RemoveShards("REMOVE_SHARDS"),
    MergeCatalogShards("MERGE_CATALOG_SHARDS"),
    UploadSignedCertAndGenerateWallet("UPLOAD_SIGNED_CERT_AND_GENERATE_WALLET"),
    GenerateGsmCertSigningReq("GENERATE_GSM_CERT_SIGNING_REQ"),
    ConfigureSharding("CONFIGURE_SHARDING"),
    ExecuteValidateNetworkTests("EXECUTE_VALIDATE_NETWORK_TESTS"),
    UpdateShard("UPDATE_SHARD"),
    PrivateDeleteSdb("PRIVATE_DELETE_SDB"),
    ProcessShardedDatabase("PROCESS_SHARDED_DATABASE"),
    CreateCatalogs("CREATE_CATALOGS"),
    CreateShards("CREATE_SHARDS"),
    CreateGsmNodes("CREATE_GSM_NODES"),
    AddGsmNodes("ADD_GSM_NODES"),
    PrivateDeleteAtpdCatalog("PRIVATE_DELETE_ATPD_CATALOG"),
    PrivateDeleteAtpdShard("PRIVATE_DELETE_ATPD_SHARD"),
    PrivateDeleteGsm("PRIVATE_DELETE_GSM"),
    ReinstateProxyInstance("REINSTATE_PROXY_INSTANCE"),

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
