/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/** Mode specifying the IP version of HCS Infra. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public enum HcsInfraIpVersion implements com.oracle.bmc.http.internal.BmcEnum {
    Ipv4("IPV4"),
    Ipv4AndIpv6("IPV4_AND_IPV6"),
    Ipv6("IPV6"),
    ;

    private final String value;
    private static java.util.Map<String, HcsInfraIpVersion> map;

    static {
        map = new java.util.HashMap<>();
        for (HcsInfraIpVersion v : HcsInfraIpVersion.values()) {
            map.put(v.getValue(), v);
        }
    }

    HcsInfraIpVersion(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static HcsInfraIpVersion create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid HcsInfraIpVersion: " + key);
    }
}
