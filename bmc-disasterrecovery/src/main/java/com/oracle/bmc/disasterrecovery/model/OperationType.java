/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/** Operation types for resources. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateDrProtectionGroup("CREATE_DR_PROTECTION_GROUP"),
    UpdateDrProtectionGroup("UPDATE_DR_PROTECTION_GROUP"),
    DeleteDrProtectionGroup("DELETE_DR_PROTECTION_GROUP"),
    MoveDrProtectionGroup("MOVE_DR_PROTECTION_GROUP"),
    AssociateDrProtectionGroup("ASSOCIATE_DR_PROTECTION_GROUP"),
    DisassociateDrProtectionGroup("DISASSOCIATE_DR_PROTECTION_GROUP"),
    UpdateRoleDrProtectionGroup("UPDATE_ROLE_DR_PROTECTION_GROUP"),
    CreateDrPlan("CREATE_DR_PLAN"),
    UpdateDrPlan("UPDATE_DR_PLAN"),
    DeleteDrPlan("DELETE_DR_PLAN"),
    CreateDrPlanExecution("CREATE_DR_PLAN_EXECUTION"),
    UpdateDrPlanExecution("UPDATE_DR_PLAN_EXECUTION"),
    DeleteDrPlanExecution("DELETE_DR_PLAN_EXECUTION"),
    RetryDrPlanExecution("RETRY_DR_PLAN_EXECUTION"),
    IgnoreDrPlanExecution("IGNORE_DR_PLAN_EXECUTION"),
    CancelDrPlanExecution("CANCEL_DR_PLAN_EXECUTION"),
    PauseDrPlanExecution("PAUSE_DR_PLAN_EXECUTION"),
    ResumeDrPlanExecution("RESUME_DR_PLAN_EXECUTION"),

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
