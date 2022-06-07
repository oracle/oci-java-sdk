/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Possible operation types.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum OperationType {
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
    GoldengateDeploymentPatch("GOLDENGATE_DEPLOYMENT_PATCH"),
    GoldengateDeploymentUpgrade("GOLDENGATE_DEPLOYMENT_UPGRADE"),
    GoldengateDeploymentBackupCreate("GOLDENGATE_DEPLOYMENT_BACKUP_CREATE"),
    GoldengateDeploymentBackupDelete("GOLDENGATE_DEPLOYMENT_BACKUP_DELETE"),
    GoldengateDeploymentBackupCancel("GOLDENGATE_DEPLOYMENT_BACKUP_CANCEL"),

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
