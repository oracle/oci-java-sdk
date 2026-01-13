/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of job as described below. HARVEST - Harvest jobs are metadata crawlers that extract schema
 * from data assets. PROFILING - Profiling jobs are data profilers that extract metrics about data
 * like histograms, distribution, min, max, avg and so on. SAMPLING - Sampling jobs extract a small
 * subset of data for profiling and viewing. PREVIEW - Preview jobs are metadata crawlers but allow
 * users to filter and view metadata entities in data assets. IMPORT - Import jobs import metadata
 * in data catalog repository from a data catalog exported file. EXPORT - Export jobs export data
 * catalog metadata for imports into other data catalog repositories. IMPORT_GLOSSARY - Job type to
 * import glossary metadata from a file. EXPORT_GLOSSARY - Job type to export glossary metadata to a
 * file. ASYNC_DELETE - Job type for asynchronous bulk delete on data assets, folders and data
 * entities. PURGE - Job type for cleaning up schedules, executions and logs of a Job.
 * IMPORT_DATA_ASSET - Job type to import technical objects to a data asset. CREATE_SCAN_PROXY - Job
 * type to create scan proxy resource for RAC enabled data asset. ASYNC_EXPORT_GLOSSARY - Job type
 * to export glossary metadata to a file asynchronously. ASYNC_EXPORT_DATA_ASSET - Job type to
 * export data assets metadata to a file asynchronously.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobType implements com.oracle.bmc.http.internal.BmcEnum {
    Harvest("HARVEST"),
    Profiling("PROFILING"),
    Sampling("SAMPLING"),
    Preview("PREVIEW"),
    Import("IMPORT"),
    Export("EXPORT"),
    ImportGlossary("IMPORT_GLOSSARY"),
    ExportGlossary("EXPORT_GLOSSARY"),
    Internal("INTERNAL"),
    Purge("PURGE"),
    Immediate("IMMEDIATE"),
    Scheduled("SCHEDULED"),
    ImmediateExecution("IMMEDIATE_EXECUTION"),
    ScheduledExecution("SCHEDULED_EXECUTION"),
    ScheduledExecutionInstance("SCHEDULED_EXECUTION_INSTANCE"),
    AsyncDelete("ASYNC_DELETE"),
    ImportDataAsset("IMPORT_DATA_ASSET"),
    CreateScanProxy("CREATE_SCAN_PROXY"),
    AsyncExportGlossary("ASYNC_EXPORT_GLOSSARY"),
    AsyncExportDataAsset("ASYNC_EXPORT_DATA_ASSET"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(JobType.class);

    private final String value;
    private static java.util.Map<String, JobType> map;

    static {
        map = new java.util.HashMap<>();
        for (JobType v : JobType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn("Received unknown value '{}' for enum 'JobType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
