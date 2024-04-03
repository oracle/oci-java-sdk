/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * The reason that the email address was suppressed. For more information on the types of bounces,
 * see [Suppression
 * List](https://docs.us-phoenix-1.oraclecloud.com/Content/Email/Concepts/overview.htm#components).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public enum SuppressionReason implements com.oracle.bmc.http.internal.BmcEnum {
    Unknown("UNKNOWN"),
    Hardbounce("HARDBOUNCE"),
    Complaint("COMPLAINT"),
    Manual("MANUAL"),
    Softbounce("SOFTBOUNCE"),
    Unsubscribe("UNSUBSCRIBE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SuppressionReason.class);

    private final String value;
    private static java.util.Map<String, SuppressionReason> map;

    static {
        map = new java.util.HashMap<>();
        for (SuppressionReason v : SuppressionReason.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SuppressionReason(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SuppressionReason create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SuppressionReason', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
