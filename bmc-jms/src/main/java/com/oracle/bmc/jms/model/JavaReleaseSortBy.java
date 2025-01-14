/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** The field to sort the Java version. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum JavaReleaseSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    ReleaseDate("releaseDate"),
    ReleaseVersion("releaseVersion"),
    FamilyVersion("familyVersion"),
    LicenseType("licenseType"),
    ;

    private final String value;
    private static java.util.Map<String, JavaReleaseSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (JavaReleaseSortBy v : JavaReleaseSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    JavaReleaseSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JavaReleaseSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid JavaReleaseSortBy: " + key);
    }
}
