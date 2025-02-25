/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateProtectionPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateProtectionPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "backupRetentionPeriodInDays",
        "policyLockedDateTime",
        "freeformTags",
        "definedTags"
    })
    public UpdateProtectionPolicyDetails(
            String displayName,
            Integer backupRetentionPeriodInDays,
            String policyLockedDateTime,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
        this.policyLockedDateTime = policyLockedDateTime;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user provided name for the protection policy. The 'displayName' does not have to be unique, and it can be modified. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user provided name for the protection policy. The 'displayName' does not have to be unique, and it can be modified. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The maximum number of days to retain backups for a protected database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
        private Integer backupRetentionPeriodInDays;

        /**
         * The maximum number of days to retain backups for a protected database.
         * @param backupRetentionPeriodInDays the value to set
         * @return this builder
         **/
        public Builder backupRetentionPeriodInDays(Integer backupRetentionPeriodInDays) {
            this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
            this.__explicitlySet__.add("backupRetentionPeriodInDays");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that specifies the exact date and time for the retention lock to take effect and permanently lock the retention period defined in the policy.
         * <p>
         * The retention lock feature controls whether Recovery Service strictly preserves backups for the duration defined in a policy. Retention lock is useful to enforce recovery window compliance and to prevent unintentional modifications to protected database backups.
         * * Recovery Service enforces a 14-day delay before the retention lock set for a policy can take effect. Therefore, you must set policyLockedDateTime  to a date that occurs 14 days after the current date.
         * * For example, assuming that the current date is Aug 1, 2023 9 pm, you can set policyLockedDateTime  to '2023-08-15T21:00:00.600Z' (Aug 15, 2023, 9:00 pm), or greater.
         * * During the 14-day delay period, you can either increase or decrease the retention period in the policy.
         * * However, you are only allowed to increase the retention period on or after the retention lock date.
         * * You cannot change the value of policyLockedDateTime if the retention lock is already in effect.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyLockedDateTime")
        private String policyLockedDateTime;

        /**
         * An RFC3339 formatted datetime string that specifies the exact date and time for the retention lock to take effect and permanently lock the retention period defined in the policy.
         * <p>
         * The retention lock feature controls whether Recovery Service strictly preserves backups for the duration defined in a policy. Retention lock is useful to enforce recovery window compliance and to prevent unintentional modifications to protected database backups.
         * * Recovery Service enforces a 14-day delay before the retention lock set for a policy can take effect. Therefore, you must set policyLockedDateTime  to a date that occurs 14 days after the current date.
         * * For example, assuming that the current date is Aug 1, 2023 9 pm, you can set policyLockedDateTime  to '2023-08-15T21:00:00.600Z' (Aug 15, 2023, 9:00 pm), or greater.
         * * During the 14-day delay period, you can either increase or decrease the retention period in the policy.
         * * However, you are only allowed to increase the retention period on or after the retention lock date.
         * * You cannot change the value of policyLockedDateTime if the retention lock is already in effect.
         *
         * @param policyLockedDateTime the value to set
         * @return this builder
         **/
        public Builder policyLockedDateTime(String policyLockedDateTime) {
            this.policyLockedDateTime = policyLockedDateTime;
            this.__explicitlySet__.add("policyLockedDateTime");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateProtectionPolicyDetails build() {
            UpdateProtectionPolicyDetails model =
                    new UpdateProtectionPolicyDetails(
                            this.displayName,
                            this.backupRetentionPeriodInDays,
                            this.policyLockedDateTime,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateProtectionPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("backupRetentionPeriodInDays")) {
                this.backupRetentionPeriodInDays(model.getBackupRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("policyLockedDateTime")) {
                this.policyLockedDateTime(model.getPolicyLockedDateTime());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
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
     * A user provided name for the protection policy. The 'displayName' does not have to be unique, and it can be modified. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user provided name for the protection policy. The 'displayName' does not have to be unique, and it can be modified. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The maximum number of days to retain backups for a protected database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
    private final Integer backupRetentionPeriodInDays;

    /**
     * The maximum number of days to retain backups for a protected database.
     * @return the value
     **/
    public Integer getBackupRetentionPeriodInDays() {
        return backupRetentionPeriodInDays;
    }

    /**
     * An RFC3339 formatted datetime string that specifies the exact date and time for the retention lock to take effect and permanently lock the retention period defined in the policy.
     * <p>
     * The retention lock feature controls whether Recovery Service strictly preserves backups for the duration defined in a policy. Retention lock is useful to enforce recovery window compliance and to prevent unintentional modifications to protected database backups.
     * * Recovery Service enforces a 14-day delay before the retention lock set for a policy can take effect. Therefore, you must set policyLockedDateTime  to a date that occurs 14 days after the current date.
     * * For example, assuming that the current date is Aug 1, 2023 9 pm, you can set policyLockedDateTime  to '2023-08-15T21:00:00.600Z' (Aug 15, 2023, 9:00 pm), or greater.
     * * During the 14-day delay period, you can either increase or decrease the retention period in the policy.
     * * However, you are only allowed to increase the retention period on or after the retention lock date.
     * * You cannot change the value of policyLockedDateTime if the retention lock is already in effect.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyLockedDateTime")
    private final String policyLockedDateTime;

    /**
     * An RFC3339 formatted datetime string that specifies the exact date and time for the retention lock to take effect and permanently lock the retention period defined in the policy.
     * <p>
     * The retention lock feature controls whether Recovery Service strictly preserves backups for the duration defined in a policy. Retention lock is useful to enforce recovery window compliance and to prevent unintentional modifications to protected database backups.
     * * Recovery Service enforces a 14-day delay before the retention lock set for a policy can take effect. Therefore, you must set policyLockedDateTime  to a date that occurs 14 days after the current date.
     * * For example, assuming that the current date is Aug 1, 2023 9 pm, you can set policyLockedDateTime  to '2023-08-15T21:00:00.600Z' (Aug 15, 2023, 9:00 pm), or greater.
     * * During the 14-day delay period, you can either increase or decrease the retention period in the policy.
     * * However, you are only allowed to increase the retention period on or after the retention lock date.
     * * You cannot change the value of policyLockedDateTime if the retention lock is already in effect.
     *
     * @return the value
     **/
    public String getPolicyLockedDateTime() {
        return policyLockedDateTime;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateProtectionPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", backupRetentionPeriodInDays=")
                .append(String.valueOf(this.backupRetentionPeriodInDays));
        sb.append(", policyLockedDateTime=").append(String.valueOf(this.policyLockedDateTime));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProtectionPolicyDetails)) {
            return false;
        }

        UpdateProtectionPolicyDetails other = (UpdateProtectionPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.backupRetentionPeriodInDays, other.backupRetentionPeriodInDays)
                && java.util.Objects.equals(this.policyLockedDateTime, other.policyLockedDateTime)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.backupRetentionPeriodInDays == null
                                ? 43
                                : this.backupRetentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.policyLockedDateTime == null
                                ? 43
                                : this.policyLockedDateTime.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
