/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/** The asynchronous operation tracked by the work request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreatePrivilegedApiControl("CREATE_PRIVILEGED_API_CONTROL"),
    GetPrivilegedApiControl("GET_PRIVILEGED_API_CONTROL"),
    ListPrivilegedApiControl("LIST_PRIVILEGED_API_CONTROL"),
    UpdatePrivilegedApiControl("UPDATE_PRIVILEGED_API_CONTROL"),
    DeletePrivilegedApiControl("DELETE_PRIVILEGED_API_CONTROL"),
    MovePrivilegedApiControl("MOVE_PRIVILEGED_API_CONTROL"),
    CreatePrivilegedApiRequest("CREATE_PRIVILEGED_API_REQUEST"),
    GetPrivilegedApiRequest("GET_PRIVILEGED_API_REQUEST"),
    ListPrivilegedApiRequest("LIST_PRIVILEGED_API_REQUEST"),
    ApprovePrivilegedApiRequest("APPROVE_PRIVILEGED_API_REQUEST"),
    RejectPrivilegedApiRequest("REJECT_PRIVILEGED_API_REQUEST"),
    RevokePrivilegedApiRequest("REVOKE_PRIVILEGED_API_REQUEST"),
    ClosePrivilegedApiRequest("CLOSE_PRIVILEGED_API_REQUEST"),
    TimeoutPrivilegedApiRequest("TIMEOUT_PRIVILEGED_API_REQUEST"),
    CustomerApprovalCheckPrivilegedApiRequest("CUSTOMER_APPROVAL_CHECK_PRIVILEGED_API_REQUEST"),
    CheckPrivilegedApiRequestStatus("CHECK_PRIVILEGED_API_REQUEST_STATUS"),
    GetPrivilegedApiWorkRequest("GET_PRIVILEGED_API_WORK_REQUEST"),
    ListPrivilegedApiWorkRequest("LIST_PRIVILEGED_API_WORK_REQUEST"),
    ListPrivilegedApiWorkRequestErrors("LIST_PRIVILEGED_API_WORK_REQUEST_ERRORS"),
    ListPrivilegedApiWorkRequestLogs("LIST_PRIVILEGED_API_WORK_REQUEST_LOGS"),
    CancelPrivilegedApiWorkRequest("CANCEL_PRIVILEGED_API_WORK_REQUEST"),
    ListApiMetadata("LIST_API_METADATA"),
    ListApiMetadataByEntityType("LIST_API_METADATA_BY_ENTITY_TYPE"),

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
