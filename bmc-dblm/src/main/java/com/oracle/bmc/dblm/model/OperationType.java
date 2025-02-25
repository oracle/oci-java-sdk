/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    DblmSubscribe("DBLM_SUBSCRIBE"),
    DblmEnable("DBLM_ENABLE"),
    ScanVulCve("SCAN_VUL_CVE"),
    ScanVulPatch("SCAN_VUL_PATCH"),
    ScanVulImage("SCAN_VUL_IMAGE"),
    UpdateSubscription("UPDATE_SUBSCRIPTION"),
    UpdateSubscribedResource("UPDATE_SUBSCRIBED_RESOURCE"),
    CreateSharedDatastore("CREATE_SHARED_DATASTORE"),
    DeleteSharedDatastore("DELETE_SHARED_DATASTORE"),

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
