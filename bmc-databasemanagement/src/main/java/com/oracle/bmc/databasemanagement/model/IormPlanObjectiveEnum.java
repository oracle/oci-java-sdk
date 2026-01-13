/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The objective of the IORM plan of an Exadata storage server. The following is an excerpt from
 * Exadata documentation: auto - Use this setting for IORM to determine the best mode based on
 * active workloads and resource plans. IORM continuously and dynamically determines the
 * optimization objective, based on the observed workloads and enabled resource plans. This is the
 * recommended value for most use cases, and starting with Oracle Exadata System Software release
 * 21.2.0, this is the default setting. high_throughput - Use this setting to optimize critical DSS
 * workloads that require high throughput. This setting improves throughput at the cost of I/O
 * latency. low_latency - Use this setting to optimize critical OLTP workloads that require
 * extremely good disk latency. This setting provides the lowest possible latency at the cost of
 * throughput by limiting disk utilization. balanced - Use this setting for a mixture of critical
 * OLTP and DSS workloads. This setting balances low disk latency and high throughput. This setting
 * limits disk utilization of large I/Os to a lesser extent than low_latency to achieve a balance
 * between latency and throughput. basic - Use this setting to limit the maximum small I/O latency
 * and otherwise disable I/O prioritization. This is the default setting in Oracle Exadata System
 * Software release 20.1.0 and earlier. other - Temporarily handle the case when Exadata side adds
 * new value, should not be used as input when to make change to IORM plan.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum IormPlanObjectiveEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Auto("AUTO"),
    HighThroughput("HIGH_THROUGHPUT"),
    LowLatency("LOW_LATENCY"),
    Balanced("BALANCED"),
    Basic("BASIC"),
    Other("OTHER"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IormPlanObjectiveEnum.class);

    private final String value;
    private static java.util.Map<String, IormPlanObjectiveEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (IormPlanObjectiveEnum v : IormPlanObjectiveEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    IormPlanObjectiveEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static IormPlanObjectiveEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'IormPlanObjectiveEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
