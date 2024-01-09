/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/** Possible operations. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateNetworkLoadBalancer("CREATE_NETWORK_LOAD_BALANCER"),
    UpdateNetworkLoadBalancer("UPDATE_NETWORK_LOAD_BALANCER"),
    DeleteNetworkLoadBalancer("DELETE_NETWORK_LOAD_BALANCER"),
    CreateBackend("CREATE_BACKEND"),
    UpdateBackend("UPDATE_BACKEND"),
    DeleteBackend("DELETE_BACKEND"),
    CreateListener("CREATE_LISTENER"),
    UpdateListener("UPDATE_LISTENER"),
    DeleteListener("DELETE_LISTENER"),
    CreateBackendset("CREATE_BACKENDSET"),
    UpdateBackendset("UPDATE_BACKENDSET"),
    DeleteBackendset("DELETE_BACKENDSET"),
    UpdateNsgs("UPDATE_NSGS"),
    UpdateHealthChecker("UPDATE_HEALTH_CHECKER"),
    ChangeCompartment("CHANGE_COMPARTMENT"),
    AttachNlbToPod("ATTACH_NLB_TO_POD"),
    DetachNlbFromPod("DETACH_NLB_FROM_POD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
