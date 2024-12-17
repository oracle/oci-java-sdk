/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Possible operation types.
 *
 * <p>Deprecated value: GoldengateConnectionAssigmnentDelete
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    GoldengateDatabaseRegistrationCreate("GOLDENGATE_DATABASE_REGISTRATION_CREATE"),
    GoldengateDatabaseRegistrationUpdate("GOLDENGATE_DATABASE_REGISTRATION_UPDATE"),
    GoldengateDatabaseRegistrationDelete("GOLDENGATE_DATABASE_REGISTRATION_DELETE"),
    GoldengateDatabaseRegistrationMove("GOLDENGATE_DATABASE_REGISTRATION_MOVE"),
    GoldengateDeploymentCreate("GOLDENGATE_DEPLOYMENT_CREATE"),
    GoldengateDeploymentUpdate("GOLDENGATE_DEPLOYMENT_UPDATE"),
    GoldengateDeploymentDelete("GOLDENGATE_DEPLOYMENT_DELETE"),
    GoldengateDeploymentMove("GOLDENGATE_DEPLOYMENT_MOVE"),
    GoldengateDeploymentRestore("GOLDENGATE_DEPLOYMENT_RESTORE"),
    GoldengateDeploymentStart("GOLDENGATE_DEPLOYMENT_START"),
    GoldengateDeploymentStop("GOLDENGATE_DEPLOYMENT_STOP"),
    GoldengateDeploymentUpgrade("GOLDENGATE_DEPLOYMENT_UPGRADE"),
    GoldengateDeploymentBackupCreate("GOLDENGATE_DEPLOYMENT_BACKUP_CREATE"),
    GoldengateDeploymentBackupDelete("GOLDENGATE_DEPLOYMENT_BACKUP_DELETE"),
    GoldengateDeploymentBackupCancel("GOLDENGATE_DEPLOYMENT_BACKUP_CANCEL"),
    GoldengateDeploymentBackupCopy("GOLDENGATE_DEPLOYMENT_BACKUP_COPY"),
    GoldengateConnectionCreate("GOLDENGATE_CONNECTION_CREATE"),
    GoldengateConnectionUpdate("GOLDENGATE_CONNECTION_UPDATE"),
    GoldengateConnectionDelete("GOLDENGATE_CONNECTION_DELETE"),
    GoldengateConnectionMove("GOLDENGATE_CONNECTION_MOVE"),
    GoldengateConnectionRefresh("GOLDENGATE_CONNECTION_REFRESH"),
    GoldengateConnectionAssignmentCreate("GOLDENGATE_CONNECTION_ASSIGNMENT_CREATE"),
    GoldengateConnectionAssignmentDelete("GOLDENGATE_CONNECTION_ASSIGNMENT_DELETE"),
    GoldengateConnectionAssigmnentDelete("GOLDENGATE_CONNECTION_ASSIGMNENT_DELETE"),
    GoldengateDeploymentDiagnosticCollect("GOLDENGATE_DEPLOYMENT_DIAGNOSTIC_COLLECT"),
    GoldengateDeploymentWalletExport("GOLDENGATE_DEPLOYMENT_WALLET_EXPORT"),
    GoldengateDeploymentWalletImport("GOLDENGATE_DEPLOYMENT_WALLET_IMPORT"),
    GoldengateDeploymentUpgradeUpgrade("GOLDENGATE_DEPLOYMENT_UPGRADE_UPGRADE"),
    GoldengateDeploymentUpgradeRollback("GOLDENGATE_DEPLOYMENT_UPGRADE_ROLLBACK"),
    GoldengateDeploymentUpgradeSnooze("GOLDENGATE_DEPLOYMENT_UPGRADE_SNOOZE"),
    GoldengateDeploymentCertificateCreate("GOLDENGATE_DEPLOYMENT_CERTIFICATE_CREATE"),
    GoldengateDeploymentCertificateDelete("GOLDENGATE_DEPLOYMENT_CERTIFICATE_DELETE"),
    GoldengatePipelineCreate("GOLDENGATE_PIPELINE_CREATE"),
    GoldengatePipelineStart("GOLDENGATE_PIPELINE_START"),
    GoldengatePipelineStop("GOLDENGATE_PIPELINE_STOP"),
    GoldengatePipelineUpdate("GOLDENGATE_PIPELINE_UPDATE"),
    GoldengatePipelineDelete("GOLDENGATE_PIPELINE_DELETE"),
    GoldengatePipelineMove("GOLDENGATE_PIPELINE_MOVE"),

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
