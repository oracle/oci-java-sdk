/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The manner in which the certificate authority (CA) was created, whether it is a root CA generated internally by the service or a subordinate CA issued by another CA that was itself generated internally by the service.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum CertificateAuthorityConfigType {
    RootCaGeneratedInternally("ROOT_CA_GENERATED_INTERNALLY"),
    SubordinateCaIssuedByInternalCa("SUBORDINATE_CA_ISSUED_BY_INTERNAL_CA"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificateAuthorityConfigType.class);

    private final String value;
    private static java.util.Map<String, CertificateAuthorityConfigType> map;

    static {
        map = new java.util.HashMap<>();
        for (CertificateAuthorityConfigType v : CertificateAuthorityConfigType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CertificateAuthorityConfigType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CertificateAuthorityConfigType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CertificateAuthorityConfigType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
