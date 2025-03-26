/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Represents the category to which an audit policy belongs. An audit policy can belong to a single category.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum AuditPolicyCategory {
    BasicActivity("BASIC_ACTIVITY"),
    AdminUserActivity("ADMIN_USER_ACTIVITY"),
    UserActivity("USER_ACTIVITY"),
    OraclePredefined("ORACLE_PREDEFINED"),
    ComplianceStandard("COMPLIANCE_STANDARD"),
    Custom("CUSTOM"),
    SqlFirewallAuditing("SQL_FIREWALL_AUDITING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AuditPolicyCategory.class);

    private final String value;
    private static java.util.Map<String, AuditPolicyCategory> map;

    static {
        map = new java.util.HashMap<>();
        for (AuditPolicyCategory v : AuditPolicyCategory.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AuditPolicyCategory(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AuditPolicyCategory create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AuditPolicyCategory', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
