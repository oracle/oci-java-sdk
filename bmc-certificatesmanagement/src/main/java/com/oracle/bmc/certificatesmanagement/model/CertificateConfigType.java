/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The manner in which the certificate was created. You can have a CA that was generated internally
 * by the service issue a certificate. You can subsequently manage that certificate internally or
 * externally. Alternatively, you can import a certificate that was issued by an external,
 * third-party public or private CA, and then manage it internally.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum CertificateConfigType implements com.oracle.bmc.http.internal.BmcEnum {
    IssuedByInternalCa("ISSUED_BY_INTERNAL_CA"),
    ManagedExternallyIssuedByInternalCa("MANAGED_EXTERNALLY_ISSUED_BY_INTERNAL_CA"),
    Imported("IMPORTED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificateConfigType.class);

    private final String value;
    private static java.util.Map<String, CertificateConfigType> map;

    static {
        map = new java.util.HashMap<>();
        for (CertificateConfigType v : CertificateConfigType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CertificateConfigType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CertificateConfigType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CertificateConfigType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
