/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/** The cloud DB system component type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum CloudDbSystemComponentType implements com.oracle.bmc.http.internal.BmcEnum {
    Asm("ASM"),
    AsmInstance("ASM_INSTANCE"),
    Cluster("CLUSTER"),
    ClusterInstance("CLUSTER_INSTANCE"),
    Database("DATABASE"),
    DatabaseInstance("DATABASE_INSTANCE"),
    DatabaseHome("DATABASE_HOME"),
    DatabaseNode("DATABASE_NODE"),
    Dbsystem("DBSYSTEM"),
    Listener("LISTENER"),
    PluggableDatabase("PLUGGABLE_DATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CloudDbSystemComponentType.class);

    private final String value;
    private static java.util.Map<String, CloudDbSystemComponentType> map;

    static {
        map = new java.util.HashMap<>();
        for (CloudDbSystemComponentType v : CloudDbSystemComponentType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CloudDbSystemComponentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CloudDbSystemComponentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CloudDbSystemComponentType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
