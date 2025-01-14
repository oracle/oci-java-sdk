/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/** Type of information in the managed list. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public enum ManagedListType implements com.oracle.bmc.http.internal.BmcEnum {
    CidrBlock("CIDR_BLOCK"),
    Users("USERS"),
    Groups("GROUPS"),
    Ipv4Address("IPV4ADDRESS"),
    Ipv6Address("IPV6ADDRESS"),
    ResourceOcid("RESOURCE_OCID"),
    Region("REGION"),
    Country("COUNTRY"),
    State("STATE"),
    City("CITY"),
    Tags("TAGS"),
    Generic("GENERIC"),
    FusionAppsRole("FUSION_APPS_ROLE"),
    FusionAppsPermission("FUSION_APPS_PERMISSION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedListType.class);

    private final String value;
    private static java.util.Map<String, ManagedListType> map;

    static {
        map = new java.util.HashMap<>();
        for (ManagedListType v : ManagedListType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ManagedListType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ManagedListType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ManagedListType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
