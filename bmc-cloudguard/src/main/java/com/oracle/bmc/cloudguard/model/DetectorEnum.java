/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/** Possible detector types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public enum DetectorEnum implements com.oracle.bmc.http.internal.BmcEnum {
    IaasActivityDetector("IAAS_ACTIVITY_DETECTOR"),
    IaasConfigurationDetector("IAAS_CONFIGURATION_DETECTOR"),
    IaasThreatDetector("IAAS_THREAT_DETECTOR"),
    IaasLogInsightDetector("IAAS_LOG_INSIGHT_DETECTOR"),
    IaasInstanceSecurityDetector("IAAS_INSTANCE_SECURITY_DETECTOR"),
    IaasContainerSecurityDetector("IAAS_CONTAINER_SECURITY_DETECTOR"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DetectorEnum.class);

    private final String value;
    private static java.util.Map<String, DetectorEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (DetectorEnum v : DetectorEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DetectorEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DetectorEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DetectorEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
