/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * The preferred schedule to delete a protected database and its backups after you terminate the
 * source database - * If you do not specify a value, then Recovery Service schedules to delete the
 * protected database 72 hours (3 days) after the database is terminated. * If you set the option as
 * DELETE_AFTER_RETENTION_PERIOD, then Recovery Service schedules to delete the protected database
 * after the backup retention period expires.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public enum DeletionSchedule implements com.oracle.bmc.http.internal.BmcEnum {
    DeleteAfterRetentionPeriod("DELETE_AFTER_RETENTION_PERIOD"),
    DeleteAfter72Hours("DELETE_AFTER_72_HOURS"),
    ;

    private final String value;
    private static java.util.Map<String, DeletionSchedule> map;

    static {
        map = new java.util.HashMap<>();
        for (DeletionSchedule v : DeletionSchedule.values()) {
            map.put(v.getValue(), v);
        }
    }

    DeletionSchedule(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeletionSchedule create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DeletionSchedule: " + key);
    }
}
