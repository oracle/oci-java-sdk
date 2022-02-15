/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Represents an audit policy relevant for the target database.The audit policy could be in any one of the following 3 states in the target database
 * 1) Created and enabled
 * 2) Created but not enabled
 * 3) Not created
 * For more details on relevant audit policies for the target database, refer to [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditSpecification.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuditSpecification {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
        private String auditPolicyName;

        public Builder auditPolicyName(String auditPolicyName) {
            this.auditPolicyName = auditPolicyName;
            this.__explicitlySet__.add("auditPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databasePolicyNames")
        private java.util.List<String> databasePolicyNames;

        public Builder databasePolicyNames(java.util.List<String> databasePolicyNames) {
            this.databasePolicyNames = databasePolicyNames;
            this.__explicitlySet__.add("databasePolicyNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
        private AuditPolicyCategory auditPolicyCategory;

        public Builder auditPolicyCategory(AuditPolicyCategory auditPolicyCategory) {
            this.auditPolicyCategory = auditPolicyCategory;
            this.__explicitlySet__.add("auditPolicyCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enableStatus")
        private EnableStatus enableStatus;

        public Builder enableStatus(EnableStatus enableStatus) {
            this.enableStatus = enableStatus;
            this.__explicitlySet__.add("enableStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partiallyEnabledMsg")
        private String partiallyEnabledMsg;

        public Builder partiallyEnabledMsg(String partiallyEnabledMsg) {
            this.partiallyEnabledMsg = partiallyEnabledMsg;
            this.__explicitlySet__.add("partiallyEnabledMsg");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForAllUsers")
        private Boolean isEnabledForAllUsers;

        public Builder isEnabledForAllUsers(Boolean isEnabledForAllUsers) {
            this.isEnabledForAllUsers = isEnabledForAllUsers;
            this.__explicitlySet__.add("isEnabledForAllUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isViewOnly")
        private Boolean isViewOnly;

        public Builder isViewOnly(Boolean isViewOnly) {
            this.isViewOnly = isViewOnly;
            this.__explicitlySet__.add("isViewOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSeededInTarget")
        private Boolean isSeededInTarget;

        public Builder isSeededInTarget(Boolean isSeededInTarget) {
            this.isSeededInTarget = isSeededInTarget;
            this.__explicitlySet__.add("isSeededInTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSeededInDataSafe")
        private Boolean isSeededInDataSafe;

        public Builder isSeededInDataSafe(Boolean isSeededInDataSafe) {
            this.isSeededInDataSafe = isSeededInDataSafe;
            this.__explicitlySet__.add("isSeededInDataSafe");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCreated")
        private Boolean isCreated;

        public Builder isCreated(Boolean isCreated) {
            this.isCreated = isCreated;
            this.__explicitlySet__.add("isCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enabledEntities")
        private EnabledEntities enabledEntities;

        public Builder enabledEntities(EnabledEntities enabledEntities) {
            this.enabledEntities = enabledEntities;
            this.__explicitlySet__.add("enabledEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditSpecification build() {
            AuditSpecification __instance__ =
                    new AuditSpecification(
                            auditPolicyName,
                            databasePolicyNames,
                            auditPolicyCategory,
                            enableStatus,
                            partiallyEnabledMsg,
                            isEnabledForAllUsers,
                            isViewOnly,
                            isSeededInTarget,
                            isSeededInDataSafe,
                            isCreated,
                            enabledEntities);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditSpecification o) {
            Builder copiedBuilder =
                    auditPolicyName(o.getAuditPolicyName())
                            .databasePolicyNames(o.getDatabasePolicyNames())
                            .auditPolicyCategory(o.getAuditPolicyCategory())
                            .enableStatus(o.getEnableStatus())
                            .partiallyEnabledMsg(o.getPartiallyEnabledMsg())
                            .isEnabledForAllUsers(o.getIsEnabledForAllUsers())
                            .isViewOnly(o.getIsViewOnly())
                            .isSeededInTarget(o.getIsSeededInTarget())
                            .isSeededInDataSafe(o.getIsSeededInDataSafe())
                            .isCreated(o.getIsCreated())
                            .enabledEntities(o.getEnabledEntities());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
    String auditPolicyName;

    /**
     * Indicates the names of corresponding database policy ( or policies) in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databasePolicyNames")
    java.util.List<String> databasePolicyNames;

    /**
     * The category to which the audit policy belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
    AuditPolicyCategory auditPolicyCategory;
    /**
     * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EnableStatus {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        PartiallyEnabled("PARTIALLY_ENABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EnableStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (EnableStatus v : EnableStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnableStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnableStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnableStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableStatus")
    EnableStatus enableStatus;

    /**
     * Provides information about the policy that has been only partially enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partiallyEnabledMsg")
    String partiallyEnabledMsg;

    /**
     * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForAllUsers")
    Boolean isEnabledForAllUsers;

    /**
     * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isViewOnly")
    Boolean isViewOnly;

    /**
     * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeededInTarget")
    Boolean isSeededInTarget;

    /**
     * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeededInDataSafe")
    Boolean isSeededInDataSafe;

    /**
     * Indicates whether the policy is already created on the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCreated")
    Boolean isCreated;
    /**
     * Indicates on whom the audit policy is enabled.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EnabledEntities {
        AllUsers("ALL_USERS"),
        IncludeUsers("INCLUDE_USERS"),
        IncludeRoles("INCLUDE_ROLES"),
        ExcludeUsers("EXCLUDE_USERS"),
        IncludeUsersRoles("INCLUDE_USERS_ROLES"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EnabledEntities> map;

        static {
            map = new java.util.HashMap<>();
            for (EnabledEntities v : EnabledEntities.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnabledEntities(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnabledEntities create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnabledEntities', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates on whom the audit policy is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabledEntities")
    EnabledEntities enabledEntities;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
