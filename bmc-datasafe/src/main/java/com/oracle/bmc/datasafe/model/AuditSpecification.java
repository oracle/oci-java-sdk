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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditSpecification.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditSpecification {
    @Deprecated
    @java.beans.ConstructorProperties({
        "auditPolicyName",
        "databasePolicyNames",
        "auditPolicyCategory",
        "enableStatus",
        "partiallyEnabledMsg",
        "isEnabledForAllUsers",
        "isViewOnly",
        "isSeededInTarget",
        "isSeededInDataSafe",
        "isCreated",
        "enabledEntities"
    })
    public AuditSpecification(
            String auditPolicyName,
            java.util.List<String> databasePolicyNames,
            AuditPolicyCategory auditPolicyCategory,
            EnableStatus enableStatus,
            String partiallyEnabledMsg,
            Boolean isEnabledForAllUsers,
            Boolean isViewOnly,
            Boolean isSeededInTarget,
            Boolean isSeededInDataSafe,
            Boolean isCreated,
            EnabledEntities enabledEntities) {
        super();
        this.auditPolicyName = auditPolicyName;
        this.databasePolicyNames = databasePolicyNames;
        this.auditPolicyCategory = auditPolicyCategory;
        this.enableStatus = enableStatus;
        this.partiallyEnabledMsg = partiallyEnabledMsg;
        this.isEnabledForAllUsers = isEnabledForAllUsers;
        this.isViewOnly = isViewOnly;
        this.isSeededInTarget = isSeededInTarget;
        this.isSeededInDataSafe = isSeededInDataSafe;
        this.isCreated = isCreated;
        this.enabledEntities = enabledEntities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
        private String auditPolicyName;

        /**
         * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
         *
         * @param auditPolicyName the value to set
         * @return this builder
         **/
        public Builder auditPolicyName(String auditPolicyName) {
            this.auditPolicyName = auditPolicyName;
            this.__explicitlySet__.add("auditPolicyName");
            return this;
        }
        /**
         * Indicates the names of corresponding database policy ( or policies) in the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databasePolicyNames")
        private java.util.List<String> databasePolicyNames;

        /**
         * Indicates the names of corresponding database policy ( or policies) in the target database.
         * @param databasePolicyNames the value to set
         * @return this builder
         **/
        public Builder databasePolicyNames(java.util.List<String> databasePolicyNames) {
            this.databasePolicyNames = databasePolicyNames;
            this.__explicitlySet__.add("databasePolicyNames");
            return this;
        }
        /**
         * The category to which the audit policy belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
        private AuditPolicyCategory auditPolicyCategory;

        /**
         * The category to which the audit policy belongs.
         * @param auditPolicyCategory the value to set
         * @return this builder
         **/
        public Builder auditPolicyCategory(AuditPolicyCategory auditPolicyCategory) {
            this.auditPolicyCategory = auditPolicyCategory;
            this.__explicitlySet__.add("auditPolicyCategory");
            return this;
        }
        /**
         * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enableStatus")
        private EnableStatus enableStatus;

        /**
         * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
         * @param enableStatus the value to set
         * @return this builder
         **/
        public Builder enableStatus(EnableStatus enableStatus) {
            this.enableStatus = enableStatus;
            this.__explicitlySet__.add("enableStatus");
            return this;
        }
        /**
         * Provides information about the policy that has been only partially enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partiallyEnabledMsg")
        private String partiallyEnabledMsg;

        /**
         * Provides information about the policy that has been only partially enabled.
         * @param partiallyEnabledMsg the value to set
         * @return this builder
         **/
        public Builder partiallyEnabledMsg(String partiallyEnabledMsg) {
            this.partiallyEnabledMsg = partiallyEnabledMsg;
            this.__explicitlySet__.add("partiallyEnabledMsg");
            return this;
        }
        /**
         * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForAllUsers")
        private Boolean isEnabledForAllUsers;

        /**
         * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
         * @param isEnabledForAllUsers the value to set
         * @return this builder
         **/
        public Builder isEnabledForAllUsers(Boolean isEnabledForAllUsers) {
            this.isEnabledForAllUsers = isEnabledForAllUsers;
            this.__explicitlySet__.add("isEnabledForAllUsers");
            return this;
        }
        /**
         * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isViewOnly")
        private Boolean isViewOnly;

        /**
         * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
         * @param isViewOnly the value to set
         * @return this builder
         **/
        public Builder isViewOnly(Boolean isViewOnly) {
            this.isViewOnly = isViewOnly;
            this.__explicitlySet__.add("isViewOnly");
            return this;
        }
        /**
         * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSeededInTarget")
        private Boolean isSeededInTarget;

        /**
         * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
         * @param isSeededInTarget the value to set
         * @return this builder
         **/
        public Builder isSeededInTarget(Boolean isSeededInTarget) {
            this.isSeededInTarget = isSeededInTarget;
            this.__explicitlySet__.add("isSeededInTarget");
            return this;
        }
        /**
         * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSeededInDataSafe")
        private Boolean isSeededInDataSafe;

        /**
         * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
         * @param isSeededInDataSafe the value to set
         * @return this builder
         **/
        public Builder isSeededInDataSafe(Boolean isSeededInDataSafe) {
            this.isSeededInDataSafe = isSeededInDataSafe;
            this.__explicitlySet__.add("isSeededInDataSafe");
            return this;
        }
        /**
         * Indicates whether the policy is already created on the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCreated")
        private Boolean isCreated;

        /**
         * Indicates whether the policy is already created on the target database.
         * @param isCreated the value to set
         * @return this builder
         **/
        public Builder isCreated(Boolean isCreated) {
            this.isCreated = isCreated;
            this.__explicitlySet__.add("isCreated");
            return this;
        }
        /**
         * Indicates on whom the audit policy is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabledEntities")
        private EnabledEntities enabledEntities;

        /**
         * Indicates on whom the audit policy is enabled.
         * @param enabledEntities the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
    private final String auditPolicyName;

    /**
     * Indicates the audit policy name. Refer to the [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827) for seeded audit policy names. For custom policies, refer to the user-defined policy name created in the target database.
     *
     * @return the value
     **/
    public String getAuditPolicyName() {
        return auditPolicyName;
    }

    /**
     * Indicates the names of corresponding database policy ( or policies) in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databasePolicyNames")
    private final java.util.List<String> databasePolicyNames;

    /**
     * Indicates the names of corresponding database policy ( or policies) in the target database.
     * @return the value
     **/
    public java.util.List<String> getDatabasePolicyNames() {
        return databasePolicyNames;
    }

    /**
     * The category to which the audit policy belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
    private final AuditPolicyCategory auditPolicyCategory;

    /**
     * The category to which the audit policy belongs.
     * @return the value
     **/
    public AuditPolicyCategory getAuditPolicyCategory() {
        return auditPolicyCategory;
    }

    /**
     * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     **/
    public enum EnableStatus {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        PartiallyEnabled("PARTIALLY_ENABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnableStatus.class);

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
    private final EnableStatus enableStatus;

    /**
     * Indicates whether the policy has been enabled, disabled or partially enabled in the target database. The status is PARTIALLY_ENABLED if any of the constituent database audit policies is not enabled.
     * @return the value
     **/
    public EnableStatus getEnableStatus() {
        return enableStatus;
    }

    /**
     * Provides information about the policy that has been only partially enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partiallyEnabledMsg")
    private final String partiallyEnabledMsg;

    /**
     * Provides information about the policy that has been only partially enabled.
     * @return the value
     **/
    public String getPartiallyEnabledMsg() {
        return partiallyEnabledMsg;
    }

    /**
     * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForAllUsers")
    private final Boolean isEnabledForAllUsers;

    /**
     * Indicates whether the policy by default is enabled for all users with no flexibility to alter the enablement conditions.
     * @return the value
     **/
    public Boolean getIsEnabledForAllUsers() {
        return isEnabledForAllUsers;
    }

    /**
     * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isViewOnly")
    private final Boolean isViewOnly;

    /**
     * Indicates whether the audit policy is available for provisioning/ de-provisioning from Oracle Data Safe, or is only available for displaying the current provisioning status from the target.
     * @return the value
     **/
    public Boolean getIsViewOnly() {
        return isViewOnly;
    }

    /**
     * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeededInTarget")
    private final Boolean isSeededInTarget;

    /**
     * Indicates whether the audit policy is one of the predefined policies provided by Oracle Database.
     * @return the value
     **/
    public Boolean getIsSeededInTarget() {
        return isSeededInTarget;
    }

    /**
     * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeededInDataSafe")
    private final Boolean isSeededInDataSafe;

    /**
     * Indicates whether the audit policy is one of the seeded policies provided by Oracle Data Safe.
     * @return the value
     **/
    public Boolean getIsSeededInDataSafe() {
        return isSeededInDataSafe;
    }

    /**
     * Indicates whether the policy is already created on the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCreated")
    private final Boolean isCreated;

    /**
     * Indicates whether the policy is already created on the target database.
     * @return the value
     **/
    public Boolean getIsCreated() {
        return isCreated;
    }

    /**
     * Indicates on whom the audit policy is enabled.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnabledEntities.class);

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
    private final EnabledEntities enabledEntities;

    /**
     * Indicates on whom the audit policy is enabled.
     * @return the value
     **/
    public EnabledEntities getEnabledEntities() {
        return enabledEntities;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuditSpecification(");
        sb.append("auditPolicyName=").append(String.valueOf(this.auditPolicyName));
        sb.append(", databasePolicyNames=").append(String.valueOf(this.databasePolicyNames));
        sb.append(", auditPolicyCategory=").append(String.valueOf(this.auditPolicyCategory));
        sb.append(", enableStatus=").append(String.valueOf(this.enableStatus));
        sb.append(", partiallyEnabledMsg=").append(String.valueOf(this.partiallyEnabledMsg));
        sb.append(", isEnabledForAllUsers=").append(String.valueOf(this.isEnabledForAllUsers));
        sb.append(", isViewOnly=").append(String.valueOf(this.isViewOnly));
        sb.append(", isSeededInTarget=").append(String.valueOf(this.isSeededInTarget));
        sb.append(", isSeededInDataSafe=").append(String.valueOf(this.isSeededInDataSafe));
        sb.append(", isCreated=").append(String.valueOf(this.isCreated));
        sb.append(", enabledEntities=").append(String.valueOf(this.enabledEntities));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditSpecification)) {
            return false;
        }

        AuditSpecification other = (AuditSpecification) o;
        return java.util.Objects.equals(this.auditPolicyName, other.auditPolicyName)
                && java.util.Objects.equals(this.databasePolicyNames, other.databasePolicyNames)
                && java.util.Objects.equals(this.auditPolicyCategory, other.auditPolicyCategory)
                && java.util.Objects.equals(this.enableStatus, other.enableStatus)
                && java.util.Objects.equals(this.partiallyEnabledMsg, other.partiallyEnabledMsg)
                && java.util.Objects.equals(this.isEnabledForAllUsers, other.isEnabledForAllUsers)
                && java.util.Objects.equals(this.isViewOnly, other.isViewOnly)
                && java.util.Objects.equals(this.isSeededInTarget, other.isSeededInTarget)
                && java.util.Objects.equals(this.isSeededInDataSafe, other.isSeededInDataSafe)
                && java.util.Objects.equals(this.isCreated, other.isCreated)
                && java.util.Objects.equals(this.enabledEntities, other.enabledEntities)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditPolicyName == null ? 43 : this.auditPolicyName.hashCode());
        result =
                (result * PRIME)
                        + (this.databasePolicyNames == null
                                ? 43
                                : this.databasePolicyNames.hashCode());
        result =
                (result * PRIME)
                        + (this.auditPolicyCategory == null
                                ? 43
                                : this.auditPolicyCategory.hashCode());
        result = (result * PRIME) + (this.enableStatus == null ? 43 : this.enableStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.partiallyEnabledMsg == null
                                ? 43
                                : this.partiallyEnabledMsg.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnabledForAllUsers == null
                                ? 43
                                : this.isEnabledForAllUsers.hashCode());
        result = (result * PRIME) + (this.isViewOnly == null ? 43 : this.isViewOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.isSeededInTarget == null ? 43 : this.isSeededInTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.isSeededInDataSafe == null
                                ? 43
                                : this.isSeededInDataSafe.hashCode());
        result = (result * PRIME) + (this.isCreated == null ? 43 : this.isCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledEntities == null ? 43 : this.enabledEntities.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
