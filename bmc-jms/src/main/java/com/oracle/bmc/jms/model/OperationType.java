/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateFleet("CREATE_FLEET"),
    DeleteFleet("DELETE_FLEET"),
    MoveFleet("MOVE_FLEET"),
    UpdateFleet("UPDATE_FLEET"),
    UpdateFleetAgentConfiguration("UPDATE_FLEET_AGENT_CONFIGURATION"),
    DeleteJavaInstallation("DELETE_JAVA_INSTALLATION"),
    CreateJavaInstallation("CREATE_JAVA_INSTALLATION"),
    CollectJfr("COLLECT_JFR"),
    RequestCryptoEventAnalysis("REQUEST_CRYPTO_EVENT_ANALYSIS"),
    RequestPerformanceTuningAnalysis("REQUEST_PERFORMANCE_TUNING_ANALYSIS"),
    RequestJavaMigrationAnalysis("REQUEST_JAVA_MIGRATION_ANALYSIS"),
    DeleteJmsReport("DELETE_JMS_REPORT"),
    ScanJavaServerUsage("SCAN_JAVA_SERVER_USAGE"),
    ScanLibraryUsage("SCAN_LIBRARY_USAGE"),
    ExportDataCsv("EXPORT_DATA_CSV"),
    CreateDrsFile("CREATE_DRS_FILE"),
    UpdateDrsFile("UPDATE_DRS_FILE"),
    DeleteDrsFile("DELETE_DRS_FILE"),
    EnableDrs("ENABLE_DRS"),
    DisableDrs("DISABLE_DRS"),

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
