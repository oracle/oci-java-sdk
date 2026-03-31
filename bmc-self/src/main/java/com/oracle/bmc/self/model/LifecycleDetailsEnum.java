/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * A message that describes the current state of the Subscription in more detail. For example, can
 * be used to provide actionable information for a resource in the Failed state.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
public enum LifecycleDetailsEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Created("CREATED"),
    PendingActivation("PENDING_ACTIVATION"),
    ProvisioningStarted("PROVISIONING_STARTED"),
    ProvisioningCompleted("PROVISIONING_COMPLETED"),
    ProvisioningFailed("PROVISIONING_FAILED"),
    Active("ACTIVE"),
    Expired("EXPIRED"),
    Terminated("TERMINATED"),
    Failed("FAILED"),
    Deleting("DELETING"),
    Updating("UPDATING"),
    Deleted("DELETED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LifecycleDetailsEnum.class);

    private final String value;
    private static java.util.Map<String, LifecycleDetailsEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (LifecycleDetailsEnum v : LifecycleDetailsEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    LifecycleDetailsEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LifecycleDetailsEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'LifecycleDetailsEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
