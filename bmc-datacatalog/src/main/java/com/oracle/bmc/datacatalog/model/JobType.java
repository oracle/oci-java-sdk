/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of job as described below.
 * HARVEST - Harvest jobs are metadata crawlers that extract schema from data assets.
 * PROFILING - Profiling jobs are data profilers that extract metrics about data like histograms, distribution, min, max, avg and so on.
 * SAMPLING - Sampling jobs extract a small subset of data for profiling and viewing.
 * PREVIEW  - Preview jobs are metadata crawlers but allow users to filter and view metadata entities in data assets.
 * IMPORT - Import jobs import metadata in data catalog repository from a data catalog exported file.
 * EXPORT - Export jobs export data catalog metadata for imports into other data catalog repositories.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobType {
    Harvest("HARVEST"),
    Profiling("PROFILING"),
    Sampling("SAMPLING"),
    Preview("PREVIEW"),
    Import("IMPORT"),
    Export("EXPORT"),
    Internal("INTERNAL"),
    Purge("PURGE"),
    Immediate("IMMEDIATE"),
    Scheduled("SCHEDULED"),
    ImmediateExecution("IMMEDIATE_EXECUTION"),
    ScheduledExecution("SCHEDULED_EXECUTION"),
    ScheduledExecutionInstance("SCHEDULED_EXECUTION_INSTANCE"),
    ;

    private final String value;
    private static java.util.Map<String, JobType> map;

    static {
        map = new java.util.HashMap<>();
        for (JobType v : JobType.values()) {
            map.put(v.getValue(), v);
        }
    }

    JobType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid JobType: " + key);
    }
}
