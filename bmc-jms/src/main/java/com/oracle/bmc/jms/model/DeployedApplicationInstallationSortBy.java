/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The field to sort deployed application installations.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum DeployedApplicationInstallationSortBy {
    ApplicationName("applicationName"),
    ApplicationType("applicationType"),
    ApplicationSourcePath("applicationSourcePath"),
    IsClustered("isClustered"),
    JavaServerInstanceCount("javaServerInstanceCount"),
    ApproximateJavaServerInstanceCount("approximateJavaServerInstanceCount"),
    ApproximateLibraryCount("approximateLibraryCount"),
    TimeFirstSeen("timeFirstSeen"),
    TimeLastSeen("timeLastSeen"),
    ;

    private final String value;
    private static java.util.Map<String, DeployedApplicationInstallationSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (DeployedApplicationInstallationSortBy v :
                DeployedApplicationInstallationSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    DeployedApplicationInstallationSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeployedApplicationInstallationSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DeployedApplicationInstallationSortBy: " + key);
    }
}
