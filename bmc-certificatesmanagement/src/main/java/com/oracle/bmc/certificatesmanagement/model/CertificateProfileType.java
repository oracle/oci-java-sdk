/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The name of the profile used to create the certificate, which depends on the type of certificate
 * you need.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum CertificateProfileType implements com.oracle.bmc.http.internal.BmcEnum {
    TlsServerOrClient("TLS_SERVER_OR_CLIENT"),
    TlsServer("TLS_SERVER"),
    TlsClient("TLS_CLIENT"),
    TlsCodeSign("TLS_CODE_SIGN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificateProfileType.class);

    private final String value;
    private static java.util.Map<String, CertificateProfileType> map;

    static {
        map = new java.util.HashMap<>();
        for (CertificateProfileType v : CertificateProfileType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CertificateProfileType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CertificateProfileType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CertificateProfileType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
