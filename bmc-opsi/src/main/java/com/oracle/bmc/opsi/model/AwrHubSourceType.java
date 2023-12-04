/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/** source types of the databases */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum AwrHubSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    AdwS("ADW_S"),
    AtpS("ATP_S"),
    AdwD("ADW_D"),
    AtpD("ATP_D"),
    ExternalPdb("EXTERNAL_PDB"),
    ExternalNoncdb("EXTERNAL_NONCDB"),
    ComanagedVmCdb("COMANAGED_VM_CDB"),
    ComanagedVmPdb("COMANAGED_VM_PDB"),
    ComanagedVmNoncdb("COMANAGED_VM_NONCDB"),
    ComanagedBmCdb("COMANAGED_BM_CDB"),
    ComanagedBmPdb("COMANAGED_BM_PDB"),
    ComanagedBmNoncdb("COMANAGED_BM_NONCDB"),
    ComanagedExacsCdb("COMANAGED_EXACS_CDB"),
    ComanagedExacsPdb("COMANAGED_EXACS_PDB"),
    ComanagedExacsNoncdb("COMANAGED_EXACS_NONCDB"),
    Undefined("UNDEFINED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AwrHubSourceType.class);

    private final String value;
    private static java.util.Map<String, AwrHubSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (AwrHubSourceType v : AwrHubSourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AwrHubSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AwrHubSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AwrHubSourceType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
