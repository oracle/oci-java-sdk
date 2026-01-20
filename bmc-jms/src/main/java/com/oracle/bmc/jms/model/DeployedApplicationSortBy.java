/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** The field to sort deployed applications. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum DeployedApplicationSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    ApplicationName("applicationName"),
    ApplicationType("applicationType"),
    IsClustered("isClustered"),
    JavaServerInstanceCount("javaServerInstanceCount"),
    ApproximateJavaServerInstanceCount("approximateJavaServerInstanceCount"),
    ApproximateLibraryCount("approximateLibraryCount"),
    TimeFirstSeen("timeFirstSeen"),
    TimeLastSeen("timeLastSeen"),
    ;

    private final String value;
    private static java.util.Map<String, DeployedApplicationSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (DeployedApplicationSortBy v : DeployedApplicationSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    DeployedApplicationSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeployedApplicationSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DeployedApplicationSortBy: " + key);
    }
}
