/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Possible deploymentUpgrade lifecycle states.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum DeploymentUpgradeLifecycleState {
    Waiting("WAITING"),
    InProgress("IN_PROGRESS"),
    Failed("FAILED"),
    Succeeded("SUCCEEDED"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),
    NeedsAttention("NEEDS_ATTENTION"),
    ;

    private final String value;
    private static java.util.Map<String, DeploymentUpgradeLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentUpgradeLifecycleState v : DeploymentUpgradeLifecycleState.values()) {
            map.put(v.getValue(), v);
        }
    }

    DeploymentUpgradeLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentUpgradeLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DeploymentUpgradeLifecycleState: " + key);
    }
}
