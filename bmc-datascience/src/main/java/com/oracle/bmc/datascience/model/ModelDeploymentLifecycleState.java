/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The lifecycle state of a model deployment.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.extern.slf4j.Slf4j
public enum ModelDeploymentLifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Deleting("DELETING"),
    Failed("FAILED"),
    Inactive("INACTIVE"),
    Updating("UPDATING"),
    Deleted("DELETED"),
    NeedsAttention("NEEDS_ATTENTION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, ModelDeploymentLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (ModelDeploymentLifecycleState v : ModelDeploymentLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ModelDeploymentLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ModelDeploymentLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ModelDeploymentLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
