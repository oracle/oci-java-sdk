/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public enum OperationType {
    CreateDelegationControl("CREATE_DELEGATION_CONTROL"),
    UpdateDelegationControl("UPDATE_DELEGATION_CONTROL"),
    DeleteDelegationControl("DELETE_DELEGATION_CONTROL"),
    MoveDelegationControl("MOVE_DELEGATION_CONTROL"),
    CreateDelegatedResourceAccessRequest("CREATE_DELEGATED_RESOURCE_ACCESS_REQUEST"),
    ApproveDelegatedResourceAccessRequest("APPROVE_DELEGATED_RESOURCE_ACCESS_REQUEST"),
    RejectDelegatedResourceAccessRequest("REJECT_DELEGATED_RESOURCE_ACCESS_REQUEST"),
    RevokeDelegatedResourceAccessRequest("REVOKE_DELEGATED_RESOURCE_ACCESS_REQUEST"),
    CreateDelegationSubscription("CREATE_DELEGATION_SUBSCRIPTION"),
    UpdateDelegationSubscription("UPDATE_DELEGATION_SUBSCRIPTION"),
    DeleteDelegationSubscription("DELETE_DELEGATION_SUBSCRIPTION"),
    MoveDelegationSubscription("MOVE_DELEGATION_SUBSCRIPTION"),

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
