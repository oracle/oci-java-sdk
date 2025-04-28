/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** Potential fields to include in the response model to summarize managed instances endpoints. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum SummarizeManagedInstanceUsageFields implements com.oracle.bmc.http.internal.BmcEnum {
    ApproximateJreCount("approximateJreCount"),
    ApproximateInstallationCount("approximateInstallationCount"),
    ApproximateApplicationCount("approximateApplicationCount"),
    ;

    private final String value;
    private static java.util.Map<String, SummarizeManagedInstanceUsageFields> map;

    static {
        map = new java.util.HashMap<>();
        for (SummarizeManagedInstanceUsageFields v : SummarizeManagedInstanceUsageFields.values()) {
            map.put(v.getValue(), v);
        }
    }

    SummarizeManagedInstanceUsageFields(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SummarizeManagedInstanceUsageFields create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SummarizeManagedInstanceUsageFields: " + key);
    }
}
