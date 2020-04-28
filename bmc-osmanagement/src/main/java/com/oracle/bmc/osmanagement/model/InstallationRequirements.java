/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A reason why an update may not be installable.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public enum InstallationRequirements {
    EulaAcceptanceRequired("EULA_ACCEPTANCE_REQUIRED"),
    SoftwareMediaRequired("SOFTWARE_MEDIA_REQUIRED"),
    UserInteractionRequired("USER_INTERACTION_REQUIRED"),
    ;

    private final String value;
    private static java.util.Map<String, InstallationRequirements> map;

    static {
        map = new java.util.HashMap<>();
        for (InstallationRequirements v : InstallationRequirements.values()) {
            map.put(v.getValue(), v);
        }
    }

    InstallationRequirements(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InstallationRequirements create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InstallationRequirements: " + key);
    }
}
