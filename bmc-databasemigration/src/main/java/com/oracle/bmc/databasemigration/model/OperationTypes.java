/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Possible operation types.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum OperationTypes {
    CreateMigration("CREATE_MIGRATION"),
    CloneMigration("CLONE_MIGRATION"),
    DeleteMigration("DELETE_MIGRATION"),
    UpdateMigration("UPDATE_MIGRATION"),
    StartMigration("START_MIGRATION"),
    ValidateMigration("VALIDATE_MIGRATION"),
    CreateConnection("CREATE_CONNECTION"),
    DeleteConnection("DELETE_CONNECTION"),
    UpdateConnection("UPDATE_CONNECTION"),
    CreateAssessment("CREATE_ASSESSMENT"),
    DeleteAssessment("DELETE_ASSESSMENT"),
    UpdateAssessment("UPDATE_ASSESSMENT"),
    RunAssessorAction("RUN_ASSESSOR_ACTION"),
    RunMigrateTableAssessor("RUN_MIGRATE_TABLE_ASSESSOR"),
    RunCompatibilityAssessor("RUN_COMPATIBILITY_ASSESSOR"),
    RunViabilityAssessor("RUN_VIABILITY_ASSESSOR"),
    ConfigureMigrationAssessor("CONFIGURE_MIGRATION_ASSESSOR"),
    CreateMigrationAssessor("CREATE_MIGRATION_ASSESSOR"),
    PrepareSourceAssessor("PREPARE_SOURCE_ASSESSOR"),
    PrepareTargetAssessor("PREPARE_TARGET_ASSESSOR"),
    ConfirmViabilityAssessor("CONFIRM_VIABILITY_ASSESSOR"),

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
