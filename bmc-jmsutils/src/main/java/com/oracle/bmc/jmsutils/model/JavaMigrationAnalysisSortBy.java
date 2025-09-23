/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/** The field to sort Java Migration analysis. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
public enum JavaMigrationAnalysisSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    TimeCreated("TIME_CREATED"),
    TimeStarted("TIME_STARTED"),
    TimeFinished("TIME_FINISHED"),
    ;

    private final String value;
    private static java.util.Map<String, JavaMigrationAnalysisSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (JavaMigrationAnalysisSortBy v : JavaMigrationAnalysisSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    JavaMigrationAnalysisSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JavaMigrationAnalysisSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid JavaMigrationAnalysisSortBy: " + key);
    }
}
