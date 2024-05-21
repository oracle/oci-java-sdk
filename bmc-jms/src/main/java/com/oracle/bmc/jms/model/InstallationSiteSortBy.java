/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The field to sort installation sites.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum InstallationSiteSortBy {
    ManagedInstanceId("managedInstanceId"),
    JreDistribution("jreDistribution"),
    JreVendor("jreVendor"),
    JreVersion("jreVersion"),
    Path("path"),
    ApproximateApplicationCount("approximateApplicationCount"),
    OsName("osName"),
    SecurityStatus("securityStatus"),
    ;

    private final String value;
    private static java.util.Map<String, InstallationSiteSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (InstallationSiteSortBy v : InstallationSiteSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    InstallationSiteSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InstallationSiteSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InstallationSiteSortBy: " + key);
    }
}
