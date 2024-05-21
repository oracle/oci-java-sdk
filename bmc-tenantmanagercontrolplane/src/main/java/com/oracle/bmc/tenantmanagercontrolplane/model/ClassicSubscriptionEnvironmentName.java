/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * TAS (Tenant Automation System) legacy environment this order orginated from.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public enum ClassicSubscriptionEnvironmentName {
    Prod("PROD"),
    Preprod("PREPROD"),
    Preprod1("PREPROD1"),
    Pintlab("PINTLAB"),
    Miglab("MIGLAB"),
    Pool2("POOL2"),
    Pintlab2("PINTLAB2"),
    Mylab0("MYLAB0"),
    Mylab1("MYLAB1"),
    Mylab2("MYLAB2"),
    Mylab3("MYLAB3"),
    Mylab4("MYLAB4"),
    Mylab5("MYLAB5"),
    ;

    private final String value;
    private static java.util.Map<String, ClassicSubscriptionEnvironmentName> map;

    static {
        map = new java.util.HashMap<>();
        for (ClassicSubscriptionEnvironmentName v : ClassicSubscriptionEnvironmentName.values()) {
            map.put(v.getValue(), v);
        }
    }

    ClassicSubscriptionEnvironmentName(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ClassicSubscriptionEnvironmentName create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ClassicSubscriptionEnvironmentName: " + key);
    }
}
