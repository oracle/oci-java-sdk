/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Note: Deprecated. Use the new resource model APIs instead.
 * Possible ODMS Job Phases.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.extern.slf4j.Slf4j
public enum OdmsJobPhases {
    OdmsValidateTgt("ODMS_VALIDATE_TGT"),
    OdmsValidateSrc("ODMS_VALIDATE_SRC"),
    OdmsValidateGgHub("ODMS_VALIDATE_GG_HUB"),
    OdmsValidateDatapumpSettings("ODMS_VALIDATE_DATAPUMP_SETTINGS"),
    OdmsValidateDatapumpSettingsSrc("ODMS_VALIDATE_DATAPUMP_SETTINGS_SRC"),
    OdmsValidateDatapumpSettingsTgt("ODMS_VALIDATE_DATAPUMP_SETTINGS_TGT"),
    OdmsValidate("ODMS_VALIDATE"),
    OdmsPrepare("ODMS_PREPARE"),
    OdmsInitialLoadExport("ODMS_INITIAL_LOAD_EXPORT"),
    OdmsDataUpload("ODMS_DATA_UPLOAD"),
    OdmsInitialLoadImport("ODMS_INITIAL_LOAD_IMPORT"),
    OdmsPostInitialLoad("ODMS_POST_INITIAL_LOAD"),
    OdmsPrepareReplicationTarget("ODMS_PREPARE_REPLICATION_TARGET"),
    OdmsMonitorReplicationLag("ODMS_MONITOR_REPLICATION_LAG"),
    OdmsSwitchover("ODMS_SWITCHOVER"),
    OdmsCleanup("ODMS_CLEANUP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, OdmsJobPhases> map;

    static {
        map = new java.util.HashMap<>();
        for (OdmsJobPhases v : OdmsJobPhases.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OdmsJobPhases(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OdmsJobPhases create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OdmsJobPhases', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
