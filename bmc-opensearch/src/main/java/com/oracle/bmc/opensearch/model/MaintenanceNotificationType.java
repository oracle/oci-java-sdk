/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/** Maintenance Notification Type */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public enum MaintenanceNotificationType implements com.oracle.bmc.http.internal.BmcEnum {
    ScheduledMaintenanceWithReleaseNotes("SCHEDULED_MAINTENANCE_WITH_RELEASE_NOTES"),
    ScheduledMaintenanceWithoutReleaseNotes("SCHEDULED_MAINTENANCE_WITHOUT_RELEASE_NOTES"),
    RescheduledMaintenance("RESCHEDULED_MAINTENANCE"),
    ScheduledMaintenanceReminder("SCHEDULED_MAINTENANCE_REMINDER"),
    ScheduledMaintenanceCompleted("SCHEDULED_MAINTENANCE_COMPLETED"),
    ;

    private final String value;
    private static java.util.Map<String, MaintenanceNotificationType> map;

    static {
        map = new java.util.HashMap<>();
        for (MaintenanceNotificationType v : MaintenanceNotificationType.values()) {
            map.put(v.getValue(), v);
        }
    }

    MaintenanceNotificationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MaintenanceNotificationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MaintenanceNotificationType: " + key);
    }
}
