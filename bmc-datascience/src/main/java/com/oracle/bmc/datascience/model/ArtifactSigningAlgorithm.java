/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/** The different algorithms supported for artifact signing. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public enum ArtifactSigningAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
    Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
    Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
    Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
    Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ArtifactSigningAlgorithm.class);

    private final String value;
    private static java.util.Map<String, ArtifactSigningAlgorithm> map;

    static {
        map = new java.util.HashMap<>();
        for (ArtifactSigningAlgorithm v : ArtifactSigningAlgorithm.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ArtifactSigningAlgorithm(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ArtifactSigningAlgorithm create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ArtifactSigningAlgorithm', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
