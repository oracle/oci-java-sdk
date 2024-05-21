/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * List of (Oracle) Data Safe services, the only production service is DataSafe, the other services are used in devtest.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum ServiceList {
    DataSafe("DataSafe"),
    DataSafeDev("DataSafe-dev"),
    DataSafeDev1("DataSafe-dev1"),
    DataSafeDev2("DataSafe-dev2"),
    DataSafeDev3("DataSafe-dev3"),
    DataSafeDev4("DataSafe-dev4"),
    DataSafeDev5("DataSafe-dev5"),
    DataSafeDev6("DataSafe-dev6"),
    DataSafeDev7("DataSafe-dev7"),
    DataSafeDev8("DataSafe-dev8"),
    DataSafeDev9("DataSafe-dev9"),
    DataSafeLrg1("DataSafe-lrg1"),
    DataSafeLrg2("DataSafe-lrg2"),
    DataSafeLrg3("DataSafe-lrg3"),
    DataSafeLrg4("DataSafe-lrg4"),
    DataSafePtest("DataSafe-ptest"),
    DataSafeStest("DataSafe-stest"),
    DataSafeStage("DataSafe-stage"),
    ;

    private final String value;
    private static java.util.Map<String, ServiceList> map;

    static {
        map = new java.util.HashMap<>();
        for (ServiceList v : ServiceList.values()) {
            map.put(v.getValue(), v);
        }
    }

    ServiceList(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ServiceList create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ServiceList: " + key);
    }
}
