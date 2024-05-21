/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The current revocation state of the certificate.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum RevocationReason {
    Unspecified("UNSPECIFIED"),
    KeyCompromise("KEY_COMPROMISE"),
    CaCompromise("CA_COMPROMISE"),
    AffiliationChanged("AFFILIATION_CHANGED"),
    Superseded("SUPERSEDED"),
    CessationOfOperation("CESSATION_OF_OPERATION"),
    PrivilegeWithdrawn("PRIVILEGE_WITHDRAWN"),
    AaCompromise("AA_COMPROMISE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RevocationReason.class);

    private final String value;
    private static java.util.Map<String, RevocationReason> map;

    static {
        map = new java.util.HashMap<>();
        for (RevocationReason v : RevocationReason.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RevocationReason(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RevocationReason create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RevocationReason', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
