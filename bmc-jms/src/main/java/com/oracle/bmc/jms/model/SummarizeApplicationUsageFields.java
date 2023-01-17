/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** Potential fields to include into response model to summarize applications endpoints. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum SummarizeApplicationUsageFields implements com.oracle.bmc.http.internal.BmcEnum {
    ApproximateJreCount("approximateJreCount"),
    ApproximateInstallationCount("approximateInstallationCount"),
    ApproximateManagedInstanceCount("approximateManagedInstanceCount"),
    ;

    private final String value;
    private static java.util.Map<String, SummarizeApplicationUsageFields> map;

    static {
        map = new java.util.HashMap<>();
        for (SummarizeApplicationUsageFields v : SummarizeApplicationUsageFields.values()) {
            map.put(v.getValue(), v);
        }
    }

    SummarizeApplicationUsageFields(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SummarizeApplicationUsageFields create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SummarizeApplicationUsageFields: " + key);
    }
}
