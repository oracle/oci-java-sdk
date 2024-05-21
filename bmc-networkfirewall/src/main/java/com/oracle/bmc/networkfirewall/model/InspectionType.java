/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Type of the secrets mapped based on the policy.
 * <p>
 * {@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic.
 *   * {@code SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum InspectionType {
    SslInboundInspection("SSL_INBOUND_INSPECTION"),
    SslForwardProxy("SSL_FORWARD_PROXY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InspectionType.class);

    private final String value;
    private static java.util.Map<String, InspectionType> map;

    static {
        map = new java.util.HashMap<>();
        for (InspectionType v : InspectionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    InspectionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InspectionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'InspectionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
