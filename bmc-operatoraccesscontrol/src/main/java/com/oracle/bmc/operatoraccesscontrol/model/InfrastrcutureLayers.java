/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Infrastructure layers available to be governed under operator control - DOM0 - CellServer - CPS
 * (Control Plane Server)
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum InfrastrcutureLayers implements com.oracle.bmc.http.internal.BmcEnum {
    Dom0("DOM0"),
    Cellserver("CELLSERVER"),
    Cps("CPS"),
    ;

    private final String value;
    private static java.util.Map<String, InfrastrcutureLayers> map;

    static {
        map = new java.util.HashMap<>();
        for (InfrastrcutureLayers v : InfrastrcutureLayers.values()) {
            map.put(v.getValue(), v);
        }
    }

    InfrastrcutureLayers(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InfrastrcutureLayers create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InfrastrcutureLayers: " + key);
    }
}
