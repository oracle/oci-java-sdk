/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned and
 * MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is assigned. CONNECTING
 * - Oracle Cloud Infrastructure information is assigned and the control plane is provisioning
 * resources. ACTIVE - Network anchor is connected and resources (VNICs) exist within a subnet.
 * ERROR - DRG attach fails during connection. FAILED - Network anchor creation failed
 * NEEDS_ATTENTION - Network anchor is in temporary bad state UPDATING - Network anchor is getting
 * updated. DELETING - Network anchor is getting deleted DELETED - A connected network anchor is
 * deleted.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public enum NetworkAnchorConnectionStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Connected("CONNECTED"),
    Disconnected("DISCONNECTED"),
    Connecting("CONNECTING"),
    Active("ACTIVE"),
    Error("ERROR"),
    Updating("UPDATING"),
    NeedsAttention("NEEDS_ATTENTION"),
    Failed("FAILED"),
    Deleting("DELETING"),
    Deleted("DELETED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkAnchorConnectionStatus.class);

    private final String value;
    private static java.util.Map<String, NetworkAnchorConnectionStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (NetworkAnchorConnectionStatus v : NetworkAnchorConnectionStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NetworkAnchorConnectionStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NetworkAnchorConnectionStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'NetworkAnchorConnectionStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
