/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/** The Usage of the container. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public enum ContainerUsage implements com.oracle.bmc.http.internal.BmcEnum {
    Inference("INFERENCE"),
    FineTune("FINE_TUNE"),
    Evaluation("EVALUATION"),
    BatchInference("BATCH_INFERENCE"),
    Other("OTHER"),
    ;

    private final String value;
    private static java.util.Map<String, ContainerUsage> map;

    static {
        map = new java.util.HashMap<>();
        for (ContainerUsage v : ContainerUsage.values()) {
            map.put(v.getValue(), v);
        }
    }

    ContainerUsage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContainerUsage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ContainerUsage: " + key);
    }
}
