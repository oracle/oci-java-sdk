/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * Summary of network load balancing policy
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public enum NetworkLoadBalancersPolicySummary {
    TwoTuple("TWO_TUPLE"),
    ThreeTuple("THREE_TUPLE"),
    FiveTuple("FIVE_TUPLE"),
    ;

    private final String value;
    private static java.util.Map<String, NetworkLoadBalancersPolicySummary> map;

    static {
        map = new java.util.HashMap<>();
        for (NetworkLoadBalancersPolicySummary v : NetworkLoadBalancersPolicySummary.values()) {
            map.put(v.getValue(), v);
        }
    }

    NetworkLoadBalancersPolicySummary(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NetworkLoadBalancersPolicySummary create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid NetworkLoadBalancersPolicySummary: " + key);
    }
}
