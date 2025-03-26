/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Source Type of the resource.
 * 1. SM_MGMT_AGENT_MONITORED - Management agent monitored stack monitoring discovered resources.
 * 2. SM_REPO_ONLY - Repository only stack monitoring discovered resources.
 * 3. OCI_NATIVE - OCI Native resources imported from OCI Monitoring Service.
 * 4. PROMETHEUS - Prometheus resources imported from OCI Monitoring Service.
 * 5. TELEGRAF - Telegraf based resources.
 * 6. COLLECTD - Collectd based resources.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public enum SourceType {
    SmMgmtAgentMonitored("SM_MGMT_AGENT_MONITORED"),
    SmRepoOnly("SM_REPO_ONLY"),
    OciNative("OCI_NATIVE"),
    Prometheus("PROMETHEUS"),
    Telegraf("TELEGRAF"),
    Collectd("COLLECTD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SourceType.class);

    private final String value;
    private static java.util.Map<String, SourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (SourceType v : SourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
