/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/** Types of container capability. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
public enum ContainerCapabilityType implements com.oracle.bmc.http.internal.BmcEnum {
    CapChown("CAP_CHOWN"),
    CapDacOverride("CAP_DAC_OVERRIDE"),
    CapFsetid("CAP_FSETID"),
    CapFowner("CAP_FOWNER"),
    CapMknod("CAP_MKNOD"),
    CapNetRaw("CAP_NET_RAW"),
    CapSetgid("CAP_SETGID"),
    CapSetuid("CAP_SETUID"),
    CapSetfcap("CAP_SETFCAP"),
    CapSetpcap("CAP_SETPCAP"),
    CapNetBindService("CAP_NET_BIND_SERVICE"),
    CapSysChroot("CAP_SYS_CHROOT"),
    CapKill("CAP_KILL"),
    CapAuditWrite("CAP_AUDIT_WRITE"),
    All("ALL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContainerCapabilityType.class);

    private final String value;
    private static java.util.Map<String, ContainerCapabilityType> map;

    static {
        map = new java.util.HashMap<>();
        for (ContainerCapabilityType v : ContainerCapabilityType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ContainerCapabilityType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContainerCapabilityType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ContainerCapabilityType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
