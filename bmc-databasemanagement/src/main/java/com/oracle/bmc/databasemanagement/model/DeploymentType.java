/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A list of the supported infrastructure that can be used to deploy the database:
 * <p>
 * - ONPREMISE: External infrastructure on premises.
 * - BM: Bare metal infrastructure in Oracle Cloud.
 * - VM: Virtual machines in Oracle Cloud.
 * - EXADATA: Exadata infrastructure in Oracle Cloud.
 * - EXADATA_CC: Exadata Cloud@Customer infrastructure in customer's data center.
 * - AUTONOMOUS: Oracle Autonomous Cloud infrastructure
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum DeploymentType {
    Onpremise("ONPREMISE"),
    Bm("BM"),
    Vm("VM"),
    Exadata("EXADATA"),
    ExadataCc("EXADATA_CC"),
    Autonomous("AUTONOMOUS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DeploymentType.class);

    private final String value;
    private static java.util.Map<String, DeploymentType> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentType v : DeploymentType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DeploymentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DeploymentType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
