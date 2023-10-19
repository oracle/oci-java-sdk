/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Action: * NO_DECRYPT - Matching traffic is not decrypted. * DECRYPT - Matching traffic is
 * decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum DecryptionActionType implements com.oracle.bmc.http.internal.BmcEnum {
    NoDecrypt("NO_DECRYPT"),
    Decrypt("DECRYPT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DecryptionActionType.class);

    private final String value;
    private static java.util.Map<String, DecryptionActionType> map;

    static {
        map = new java.util.HashMap<>();
        for (DecryptionActionType v : DecryptionActionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DecryptionActionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DecryptionActionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DecryptionActionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
