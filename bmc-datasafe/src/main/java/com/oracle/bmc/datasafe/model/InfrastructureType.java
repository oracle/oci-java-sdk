/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The infrastructure type the database is running on. Allowed values are
 *   - ORACLE_CLOUD - Represents that the database is running on the Oracle Cloud Infrastructure.
 *   - CLOUD_AT_CUSTOMER - Represents that the database is running on Oracle Cloud@Customer infrastructure.
 *   - ON_PREMISES - Represents that the database is running on on-premises infrastructure.
 *   - NON_ORACLE_CLOUD - Represents that the database is running on non-Oracle cloud infrastructure.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public enum InfrastructureType {
    OracleCloud("ORACLE_CLOUD"),
    CloudAtCustomer("CLOUD_AT_CUSTOMER"),
    OnPremises("ON_PREMISES"),
    NonOracleCloud("NON_ORACLE_CLOUD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, InfrastructureType> map;

    static {
        map = new java.util.HashMap<>();
        for (InfrastructureType v : InfrastructureType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    InfrastructureType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InfrastructureType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'InfrastructureType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
