/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The types of operations that spawn work requests.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public enum OperationType {
    CreateOpensearchCluster("CREATE_OPENSEARCH_CLUSTER"),
    UpdateOpensearchCluster("UPDATE_OPENSEARCH_CLUSTER"),
    DeleteOpensearchCluster("DELETE_OPENSEARCH_CLUSTER"),
    MoveOpensearchCluster("MOVE_OPENSEARCH_CLUSTER"),
    RestoreOpensearchCluster("RESTORE_OPENSEARCH_CLUSTER"),
    BackupOpensearchCluster("BACKUP_OPENSEARCH_CLUSTER"),
    UpdateOpensearchClusterBackup("UPDATE_OPENSEARCH_CLUSTER_BACKUP"),
    MoveOpensearchClusterBackup("MOVE_OPENSEARCH_CLUSTER_BACKUP"),
    DeleteOpensearchClusterBackup("DELETE_OPENSEARCH_CLUSTER_BACKUP"),
    CreateOpensearchPipeline("CREATE_OPENSEARCH_PIPELINE"),
    UpdateOpensearchPipeline("UPDATE_OPENSEARCH_PIPELINE"),
    DeleteOpensearchPipeline("DELETE_OPENSEARCH_PIPELINE"),
    UpdateOpensearchClusterSecurityConfig("UPDATE_OPENSEARCH_CLUSTER_SECURITY_CONFIG"),
    UpdateOpensearchCrossClusterConfig("UPDATE_OPENSEARCH_CROSS_CLUSTER_CONFIG"),
    UpdateOpensearchClusterReverseConnectionEndpoints(
            "UPDATE_OPENSEARCH_CLUSTER_REVERSE_CONNECTION_ENDPOINTS"),
    ConfigureRemoteCluster("CONFIGURE_REMOTE_CLUSTER"),

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
