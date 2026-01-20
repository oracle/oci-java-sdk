/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/** An enum value indicating the operation being performed by the work request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public enum WorkRequestOperationTypes implements com.oracle.bmc.http.internal.BmcEnum {
    CreateWaasPolicy("CREATE_WAAS_POLICY"),
    UpdateWaasPolicy("UPDATE_WAAS_POLICY"),
    DeleteWaasPolicy("DELETE_WAAS_POLICY"),
    CreateHttpRedirect("CREATE_HTTP_REDIRECT"),
    UpdateHttpRedirect("UPDATE_HTTP_REDIRECT"),
    DeleteHttpRedirect("DELETE_HTTP_REDIRECT"),
    PurgeWaasPolicyCache("PURGE_WAAS_POLICY_CACHE"),
    CreateCustomProtectionRule("CREATE_CUSTOM_PROTECTION_RULE"),
    UpdateCustomProtectionRule("UPDATE_CUSTOM_PROTECTION_RULE"),
    DeleteCustomProtectionRule("DELETE_CUSTOM_PROTECTION_RULE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestOperationTypes.class);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationTypes v : WorkRequestOperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestOperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
