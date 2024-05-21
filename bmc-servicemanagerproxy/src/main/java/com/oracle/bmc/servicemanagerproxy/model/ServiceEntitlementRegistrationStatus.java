/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * Service Entitlement registration status
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
public enum ServiceEntitlementRegistrationStatus {
    Initialized("INITIALIZED"),
    BeginActivation("BEGIN_ACTIVATION"),
    Active("ACTIVE"),
    BeginSoftTermination("BEGIN_SOFT_TERMINATION"),
    SoftTerminated("SOFT_TERMINATED"),
    BeginTermination("BEGIN_TERMINATION"),
    Canceled("CANCELED"),
    Terminated("TERMINATED"),
    BeginDisabling("BEGIN_DISABLING"),
    BeginEnabling("BEGIN_ENABLING"),
    BeginMigration("BEGIN_MIGRATION"),
    Disabled("DISABLED"),
    BeginSuspension("BEGIN_SUSPENSION"),
    BeginResumption("BEGIN_RESUMPTION"),
    Suspended("SUSPENDED"),
    BeginLockRelocation("BEGIN_LOCK_RELOCATION"),
    LockedRelocation("LOCKED_RELOCATION"),
    BeginRelocation("BEGIN_RELOCATION"),
    Relocated("RELOCATED"),
    BeginUnlockRelocation("BEGIN_UNLOCK_RELOCATION"),
    UnlockedRelocation("UNLOCKED_RELOCATION"),
    FailedLockRelocation("FAILED_LOCK_RELOCATION"),
    FailedActivation("FAILED_ACTIVATION"),
    FailedMigration("FAILED_MIGRATION"),
    AccessDisabled("ACCESS_DISABLED"),
    BeginDisablingAccess("BEGIN_DISABLING_ACCESS"),
    BeginEnablingAccess("BEGIN_ENABLING_ACCESS"),
    TraUnknown("TRA_UNKNOWN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ServiceEntitlementRegistrationStatus.class);

    private final String value;
    private static java.util.Map<String, ServiceEntitlementRegistrationStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (ServiceEntitlementRegistrationStatus v :
                ServiceEntitlementRegistrationStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ServiceEntitlementRegistrationStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ServiceEntitlementRegistrationStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ServiceEntitlementRegistrationStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
