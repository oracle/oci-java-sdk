/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * A list of possible rotation states for the certificate version. A certificate version marked
 * {@code CURRENT} is currently in use. A certificate version marked {@code PENDING} is staged and
 * available for use, but has not been applied on the target system and, therefore, has not been
 * rotated into current, active use. The certificate most recently uploaded to the service is always
 * marked {@code LATEST}. (The first version of a certificate is always marked as both {@code
 * CURRENT} and {@code LATEST}.) A certificate version marked {@code PREVIOUS} is the certificate
 * version that was most recently marked {@code CURRENT}, before the last certificate version
 * rotation. A certificate version marked {@code DEPRECATED} is neither current, pending, nor the
 * previous one in use. Only certificate versions marked {@code DEPRECATED} can be scheduled for
 * deletion.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum VersionStage implements com.oracle.bmc.http.internal.BmcEnum {
    Current("CURRENT"),
    Pending("PENDING"),
    Latest("LATEST"),
    Previous("PREVIOUS"),
    Deprecated("DEPRECATED"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VersionStage.class);

    private final String value;
    private static java.util.Map<String, VersionStage> map;

    static {
        map = new java.util.HashMap<>();
        for (VersionStage v : VersionStage.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    VersionStage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static VersionStage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'VersionStage', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
