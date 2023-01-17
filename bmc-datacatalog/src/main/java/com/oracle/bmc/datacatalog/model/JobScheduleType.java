/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of job schedule. SCHEDULED - The job will execute at a later time based on a schedule.
 * IMMEDIATE - The job will execute as soon as possible.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobScheduleType implements com.oracle.bmc.http.internal.BmcEnum {
    Scheduled("SCHEDULED"),
    Immediate("IMMEDIATE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JobScheduleType.class);

    private final String value;
    private static java.util.Map<String, JobScheduleType> map;

    static {
        map = new java.util.HashMap<>();
        for (JobScheduleType v : JobScheduleType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn(
                "Received unknown value '{}' for enum 'JobScheduleType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
