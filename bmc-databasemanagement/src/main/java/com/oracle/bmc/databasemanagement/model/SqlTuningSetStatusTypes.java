/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The status types of a Sql Tuning Set. Refer to the following documentaion for details https://docs.oracle.com/en/database/oracle/oracle-database/19/refrn/ALL_SCHEDULER_JOBS.html#GUID-D72A57AD-96EB-4FB9-A599-33CB238AFA62
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum SqlTuningSetStatusTypes {
    Disabled("DISABLED"),
    RetryScheduled("RETRY_SCHEDULED"),
    Scheduled("SCHEDULED"),
    Blocked("BLOCKED"),
    Running("RUNNING"),
    Completed("COMPLETED"),
    Broken("BROKEN"),
    Failed("FAILED"),
    Remote("REMOTE"),
    ResourceUnavailable("RESOURCE_UNAVAILABLE"),
    Succeeded("SUCCEEDED"),
    ChainStalled("CHAIN_STALLED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SqlTuningSetStatusTypes.class);

    private final String value;
    private static java.util.Map<String, SqlTuningSetStatusTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (SqlTuningSetStatusTypes v : SqlTuningSetStatusTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SqlTuningSetStatusTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SqlTuningSetStatusTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SqlTuningSetStatusTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
