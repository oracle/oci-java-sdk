/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public enum OperationTypes implements com.oracle.bmc.http.internal.BmcEnum {
    CreateBds("CREATE_BDS"),
    UpdateBds("UPDATE_BDS"),
    DeleteBds("DELETE_BDS"),
    AddBlockStorage("ADD_BLOCK_STORAGE"),
    AddMasterNodes("ADD_MASTER_NODES"),
    AddUtilityNodes("ADD_UTILITY_NODES"),
    AddWorkerNodes("ADD_WORKER_NODES"),
    AddCloudSql("ADD_CLOUD_SQL"),
    RemoveCloudSql("REMOVE_CLOUD_SQL"),
    ChangeCompartmentForBds("CHANGE_COMPARTMENT_FOR_BDS"),
    ChangeShape("CHANGE_SHAPE"),
    UpdateInfra("UPDATE_INFRA"),
    RestartNode("RESTART_NODE"),
    RemoveNode("REMOVE_NODE"),
    CreateAutoscaleConfig("CREATE_AUTOSCALE_CONFIG"),
    UpdateAutoscaleConfig("UPDATE_AUTOSCALE_CONFIG"),
    DeleteAutoscaleConfig("DELETE_AUTOSCALE_CONFIG"),
    AutoscaleConfig("AUTOSCALE_CONFIG"),
    AutoscaleRun("AUTOSCALE_RUN"),
    CreateApiKey("CREATE_API_KEY"),
    DeleteApiKey("DELETE_API_KEY"),
    TestObjectStoreConnection("TEST_OBJECT_STORE_CONNECTION"),
    CreateMetastoreConfig("CREATE_METASTORE_CONFIG"),
    DeleteMetastoreConfig("DELETE_METASTORE_CONFIG"),
    UpdateMetastoreConfig("UPDATE_METASTORE_CONFIG"),
    ActivateMetastoreConfig("ACTIVATE_METASTORE_CONFIG"),
    TestMetastoreConfig("TEST_METASTORE_CONFIG"),
    PatchBds("PATCH_BDS"),
    PatchOdh("PATCH_ODH"),
    PatchOs("PATCH_OS"),
    StopBds("STOP_BDS"),
    StartBds("START_BDS"),
    AddKafka("ADD_KAFKA"),
    RemoveKafka("REMOVE_KAFKA"),
    ExecuteBootstrapScript("EXECUTE_BOOTSTRAP_SCRIPT"),
    OdhServiceCertificateUpdate("ODH_SERVICE_CERTIFICATE_UPDATE"),
    CreateBackupConfig("CREATE_BACKUP_CONFIG"),
    UpdateBackupConfig("UPDATE_BACKUP_CONFIG"),
    DeleteBackupConfig("DELETE_BACKUP_CONFIG"),
    CreateNodeReplaceConfig("CREATE_NODE_REPLACE_CONFIG"),
    UpdateNodeReplaceConfig("UPDATE_NODE_REPLACE_CONFIG"),
    DeleteNodeReplaceConfig("DELETE_NODE_REPLACE_CONFIG"),
    BackupNodes("BACKUP_NODES"),
    DeleteNodeBackup("DELETE_NODE_BACKUP"),
    ReplaceNode("REPLACE_NODE"),
    CreateResourcePrincipalConfiguration("CREATE_RESOURCE_PRINCIPAL_CONFIGURATION"),
    DeleteResourcePrincipalConfiguration("DELETE_RESOURCE_PRINCIPAL_CONFIGURATION"),
    UpdateResourcePrincipalConfiguration("UPDATE_RESOURCE_PRINCIPAL_CONFIGURATION"),
    RefreshResourcePrincipal("REFRESH_RESOURCE_PRINCIPAL"),
    CreateIdentityConfig("CREATE_IDENTITY_CONFIG"),
    DeleteIdentityConfig("DELETE_IDENTITY_CONFIG"),
    UpdateIdentityConfig("UPDATE_IDENTITY_CONFIG"),
    ActivateUpstConfig("ACTIVATE_UPST_CONFIG"),
    DeactivateUpstConfig("DEACTIVATE_UPST_CONFIG"),
    RefreshConfidentialApplication("REFRESH_CONFIDENTIAL_APPLICATION"),
    RefreshTokenExchangeKeytab("REFRESH_TOKEN_EXCHANGE_KEYTAB"),
    ActivateIamUserSyncConfig("ACTIVATE_IAM_USER_SYNC_CONFIG"),
    DeactivateIamUserSyncConfig("DEACTIVATE_IAM_USER_SYNC_CONFIG"),

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
