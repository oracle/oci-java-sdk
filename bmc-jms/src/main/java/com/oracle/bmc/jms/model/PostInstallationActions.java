/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** list of post installation actions */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum PostInstallationActions implements com.oracle.bmc.http.internal.BmcEnum {
    ChangeMinimumKeyLengthForEc("CHANGE_MINIMUM_KEY_LENGTH_FOR_EC"),
    ChangeMinimumKeyLengthForDsa("CHANGE_MINIMUM_KEY_LENGTH_FOR_DSA"),
    ChangeMinimumKeyLengthForDiffieHellman("CHANGE_MINIMUM_KEY_LENGTH_FOR_DIFFIE_HELLMAN"),
    ChangeMinimumKeyLengthForRsaSignedJars("CHANGE_MINIMUM_KEY_LENGTH_FOR_RSA_SIGNED_JARS"),
    DisableTls("DISABLE_TLS"),
    UseOsCacerts("USE_OS_CACERTS"),
    ;

    private final String value;
    private static java.util.Map<String, PostInstallationActions> map;

    static {
        map = new java.util.HashMap<>();
        for (PostInstallationActions v : PostInstallationActions.values()) {
            map.put(v.getValue(), v);
        }
    }

    PostInstallationActions(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PostInstallationActions create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid PostInstallationActions: " + key);
    }
}
