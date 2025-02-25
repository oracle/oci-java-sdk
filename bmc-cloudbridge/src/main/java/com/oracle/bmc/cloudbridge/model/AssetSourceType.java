/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The type of asset source. Indicates external origin of the assets that are read by assigning this asset source.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public enum AssetSourceType {
    Vmware("VMWARE"),
    Aws("AWS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AssetSourceType.class);

    private final String value;
    private static java.util.Map<String, AssetSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (AssetSourceType v : AssetSourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AssetSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AssetSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AssetSourceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
