/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public enum OperationType {
    CreateResources("CREATE_RESOURCES"),
    UpdateResources("UPDATE_RESOURCES"),
    DeleteResources("DELETE_RESOURCES"),
    MoveResources("MOVE_RESOURCES"),
    EnableExternalDatabase("ENABLE_EXTERNAL_DATABASE"),
    DisableExternalDatabase("DISABLE_EXTERNAL_DATABASE"),
    AddSourcesToAgent("ADD_SOURCES_TO_AGENT"),
    EnableMetricExtension("ENABLE_METRIC_EXTENSION"),
    DisableMetricExtension("DISABLE_METRIC_EXTENSION"),
    TestMetricExtension("TEST_METRIC_EXTENSION"),
    ApplyMonitoringTemplate("APPLY_MONITORING_TEMPLATE"),
    UnapplyMonitoringTemplate("UNAPPLY_MONITORING_TEMPLATE"),
    BulkAddResources("BULK_ADD_RESOURCES"),
    BulkDeleteResources("BULK_DELETE_RESOURCES"),
    UpdateAndPropagateTags("UPDATE_AND_PROPAGATE_TAGS"),
    ImportResources("IMPORT_RESOURCES"),
    CreateMaintenanceWindow("CREATE_MAINTENANCE_WINDOW"),
    UpdateMaintenanceWindow("UPDATE_MAINTENANCE_WINDOW"),
    DeleteMaintenanceWindow("DELETE_MAINTENANCE_WINDOW"),
    StopMaintenanceWindow("STOP_MAINTENANCE_WINDOW"),

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
