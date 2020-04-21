/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of job schedule.
 * SCHEDULED - The job will execute at a later time based on a schedule.
 * IMMEDIATE - The job will execute as soon as possible.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobScheduleType {
    Scheduled("SCHEDULED"),
    Immediate("IMMEDIATE"),
    ;

    private final String value;
    private static java.util.Map<String, JobScheduleType> map;

    static {
        map = new java.util.HashMap<>();
        for (JobScheduleType v : JobScheduleType.values()) {
            map.put(v.getValue(), v);
        }
    }

    JobScheduleType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobScheduleType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid JobScheduleType: " + key);
    }
}
