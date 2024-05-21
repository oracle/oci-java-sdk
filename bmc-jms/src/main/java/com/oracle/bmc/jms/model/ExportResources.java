/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Type of resources to export data associated
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum ExportResources {
    ManagedInstance("MANAGED_INSTANCE"),
    ManagedInstancePlusJavaRuntime("MANAGED_INSTANCE_PLUS_JAVA_RUNTIME"),
    ManagedInstancePlusJavaRuntimePlusApplication(
            "MANAGED_INSTANCE_PLUS_JAVA_RUNTIME_PLUS_APPLICATION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ExportResources.class);

    private final String value;
    private static java.util.Map<String, ExportResources> map;

    static {
        map = new java.util.HashMap<>();
        for (ExportResources v : ExportResources.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExportResources(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExportResources create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ExportResources', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
