/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A filter to return only findings that match the specified reference. Currently supported values are STIG, CIS, and GDPR.
 * Here STIG refers to DISA STIG, CIS refers to CIS Benchmark, and GDPR refers to EU GDPR.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum SecurityAssessmentReferences {
    Stig("STIG"),
    Cis("CIS"),
    Gdpr("GDPR"),
    ;

    private final String value;
    private static java.util.Map<String, SecurityAssessmentReferences> map;

    static {
        map = new java.util.HashMap<>();
        for (SecurityAssessmentReferences v : SecurityAssessmentReferences.values()) {
            map.put(v.getValue(), v);
        }
    }

    SecurityAssessmentReferences(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SecurityAssessmentReferences create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SecurityAssessmentReferences: " + key);
    }
}
