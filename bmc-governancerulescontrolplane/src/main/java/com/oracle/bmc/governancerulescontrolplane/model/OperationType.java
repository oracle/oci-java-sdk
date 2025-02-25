/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public enum OperationType {
    CreateGovernanceRule("CREATE_GOVERNANCE_RULE"),
    UpdateGovernanceRule("UPDATE_GOVERNANCE_RULE"),
    DeleteGovernanceRule("DELETE_GOVERNANCE_RULE"),
    RetryGovernanceRule("RETRY_GOVERNANCE_RULE"),
    CreateInclusionCriteria("CREATE_INCLUSION_CRITERIA"),
    DeleteInclusionCriteria("DELETE_INCLUSION_CRITERIA"),
    RetryTenancyAttachment("RETRY_TENANCY_ATTACHMENT"),
    ApplyTenancyAttachment("APPLY_TENANCY_ATTACHMENT"),
    CreateEnforcedQuotaGovernanceRule("CREATE_ENFORCED_QUOTA_GOVERNANCE_RULE"),
    CreateEnforcedTagGovernanceRule("CREATE_ENFORCED_TAG_GOVERNANCE_RULE"),
    UpdateEnforcedQuotaGovernanceRule("UPDATE_ENFORCED_QUOTA_GOVERNANCE_RULE"),
    UpdateEnforcedTagGovernanceRule("UPDATE_ENFORCED_TAG_GOVERNANCE_RULE"),
    DeleteEnforcedQuotaGovernanceRule("DELETE_ENFORCED_QUOTA_GOVERNANCE_RULE"),
    DeleteEnforcedTagGovernanceRule("DELETE_ENFORCED_TAG_GOVERNANCE_RULE"),
    TenantManagerOptInEventHandler("TENANT_MANAGER_OPT_IN_EVENT_HANDLER"),
    TenantManagerOptOutEventHandler("TENANT_MANAGER_OPT_OUT_EVENT_HANDLER"),

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
