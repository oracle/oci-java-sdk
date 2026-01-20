/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of the target database-specific profiles that override the audit profile of the target
 * database group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TargetOverrideSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetOverrideSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetDatabaseId",
        "isPaidUsageEnabled",
        "onlineMonths",
        "offlineMonths",
        "onlineMonthsSource",
        "offlineMonthsSource",
        "paidUsageSource",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public TargetOverrideSummary(
            String targetDatabaseId,
            Boolean isPaidUsageEnabled,
            Integer onlineMonths,
            Integer offlineMonths,
            String onlineMonthsSource,
            String offlineMonthsSource,
            String paidUsageSource,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.targetDatabaseId = targetDatabaseId;
        this.isPaidUsageEnabled = isPaidUsageEnabled;
        this.onlineMonths = onlineMonths;
        this.offlineMonths = offlineMonths;
        this.onlineMonthsSource = onlineMonthsSource;
        this.offlineMonthsSource = offlineMonthsSource;
        this.paidUsageSource = paidUsageSource;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target database that overrides from the audit profile of the target
         * database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
        private String targetDatabaseId;

        /**
         * The OCID of the target database that overrides from the audit profile of the target
         * database group.
         *
         * @param targetDatabaseId the value to set
         * @return this builder
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            this.__explicitlySet__.add("targetDatabaseId");
            return this;
        }
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         */
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }
        /**
         * Number of months the audit records will be stored online in the audit repository for
         * immediate reporting and analysis. Minimum: 1; Maximum: 12 months
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        /**
         * Number of months the audit records will be stored online in the audit repository for
         * immediate reporting and analysis. Minimum: 1; Maximum: 12 months
         *
         * @param onlineMonths the value to set
         * @return this builder
         */
        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }
        /**
         * Number of months the audit records will be stored offline in the offline archive.
         * Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit data even
         * longer (up to 168 months) in the offline archive, please contact the Oracle Support.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        /**
         * Number of months the audit records will be stored offline in the offline archive.
         * Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit data even
         * longer (up to 168 months) in the offline archive, please contact the Oracle Support.
         *
         * @param offlineMonths the value to set
         * @return this builder
         */
        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the online month retention setting is
         * sourced. For example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonthsSource")
        private String onlineMonthsSource;

        /**
         * The name or the OCID of the resource from which the online month retention setting is
         * sourced. For example a target database group OCID or global.
         *
         * @param onlineMonthsSource the value to set
         * @return this builder
         */
        public Builder onlineMonthsSource(String onlineMonthsSource) {
            this.onlineMonthsSource = onlineMonthsSource;
            this.__explicitlySet__.add("onlineMonthsSource");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the offline month retention setting is
         * sourced. For example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonthsSource")
        private String offlineMonthsSource;

        /**
         * The name or the OCID of the resource from which the offline month retention setting is
         * sourced. For example a target database group OCID or global.
         *
         * @param offlineMonthsSource the value to set
         * @return this builder
         */
        public Builder offlineMonthsSource(String offlineMonthsSource) {
            this.offlineMonthsSource = offlineMonthsSource;
            this.__explicitlySet__.add("offlineMonthsSource");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the paid usage setting is sourced. For
         * example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("paidUsageSource")
        private String paidUsageSource;

        /**
         * The name or the OCID of the resource from which the paid usage setting is sourced. For
         * example a target database group OCID or global.
         *
         * @param paidUsageSource the value to set
         * @return this builder
         */
        public Builder paidUsageSource(String paidUsageSource) {
            this.paidUsageSource = paidUsageSource;
            this.__explicitlySet__.add("paidUsageSource");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetOverrideSummary build() {
            TargetOverrideSummary model =
                    new TargetOverrideSummary(
                            this.targetDatabaseId,
                            this.isPaidUsageEnabled,
                            this.onlineMonths,
                            this.offlineMonths,
                            this.onlineMonthsSource,
                            this.offlineMonthsSource,
                            this.paidUsageSource,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetOverrideSummary model) {
            if (model.wasPropertyExplicitlySet("targetDatabaseId")) {
                this.targetDatabaseId(model.getTargetDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("isPaidUsageEnabled")) {
                this.isPaidUsageEnabled(model.getIsPaidUsageEnabled());
            }
            if (model.wasPropertyExplicitlySet("onlineMonths")) {
                this.onlineMonths(model.getOnlineMonths());
            }
            if (model.wasPropertyExplicitlySet("offlineMonths")) {
                this.offlineMonths(model.getOfflineMonths());
            }
            if (model.wasPropertyExplicitlySet("onlineMonthsSource")) {
                this.onlineMonthsSource(model.getOnlineMonthsSource());
            }
            if (model.wasPropertyExplicitlySet("offlineMonthsSource")) {
                this.offlineMonthsSource(model.getOfflineMonthsSource());
            }
            if (model.wasPropertyExplicitlySet("paidUsageSource")) {
                this.paidUsageSource(model.getPaidUsageSource());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the target database that overrides from the audit profile of the target database
     * group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
    private final String targetDatabaseId;

    /**
     * The OCID of the target database that overrides from the audit profile of the target database
     * group.
     *
     * @return the value
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     *
     * @return the value
     */
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }

    /**
     * Number of months the audit records will be stored online in the audit repository for
     * immediate reporting and analysis. Minimum: 1; Maximum: 12 months
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    private final Integer onlineMonths;

    /**
     * Number of months the audit records will be stored online in the audit repository for
     * immediate reporting and analysis. Minimum: 1; Maximum: 12 months
     *
     * @return the value
     */
    public Integer getOnlineMonths() {
        return onlineMonths;
    }

    /**
     * Number of months the audit records will be stored offline in the offline archive. Minimum: 0;
     * Maximum: 72 months. If you have a requirement to store the audit data even longer (up to 168
     * months) in the offline archive, please contact the Oracle Support.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    private final Integer offlineMonths;

    /**
     * Number of months the audit records will be stored offline in the offline archive. Minimum: 0;
     * Maximum: 72 months. If you have a requirement to store the audit data even longer (up to 168
     * months) in the offline archive, please contact the Oracle Support.
     *
     * @return the value
     */
    public Integer getOfflineMonths() {
        return offlineMonths;
    }

    /**
     * The name or the OCID of the resource from which the online month retention setting is
     * sourced. For example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonthsSource")
    private final String onlineMonthsSource;

    /**
     * The name or the OCID of the resource from which the online month retention setting is
     * sourced. For example a target database group OCID or global.
     *
     * @return the value
     */
    public String getOnlineMonthsSource() {
        return onlineMonthsSource;
    }

    /**
     * The name or the OCID of the resource from which the offline month retention setting is
     * sourced. For example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonthsSource")
    private final String offlineMonthsSource;

    /**
     * The name or the OCID of the resource from which the offline month retention setting is
     * sourced. For example a target database group OCID or global.
     *
     * @return the value
     */
    public String getOfflineMonthsSource() {
        return offlineMonthsSource;
    }

    /**
     * The name or the OCID of the resource from which the paid usage setting is sourced. For
     * example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paidUsageSource")
    private final String paidUsageSource;

    /**
     * The name or the OCID of the resource from which the paid usage setting is sourced. For
     * example a target database group OCID or global.
     *
     * @return the value
     */
    public String getPaidUsageSource() {
        return paidUsageSource;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetOverrideSummary(");
        sb.append("super=").append(super.toString());
        sb.append("targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(", isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append(", onlineMonths=").append(String.valueOf(this.onlineMonths));
        sb.append(", offlineMonths=").append(String.valueOf(this.offlineMonths));
        sb.append(", onlineMonthsSource=").append(String.valueOf(this.onlineMonthsSource));
        sb.append(", offlineMonthsSource=").append(String.valueOf(this.offlineMonthsSource));
        sb.append(", paidUsageSource=").append(String.valueOf(this.paidUsageSource));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetOverrideSummary)) {
            return false;
        }

        TargetOverrideSummary other = (TargetOverrideSummary) o;
        return java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(this.onlineMonths, other.onlineMonths)
                && java.util.Objects.equals(this.offlineMonths, other.offlineMonths)
                && java.util.Objects.equals(this.onlineMonthsSource, other.onlineMonthsSource)
                && java.util.Objects.equals(this.offlineMonthsSource, other.offlineMonthsSource)
                && java.util.Objects.equals(this.paidUsageSource, other.paidUsageSource)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaidUsageEnabled == null
                                ? 43
                                : this.isPaidUsageEnabled.hashCode());
        result = (result * PRIME) + (this.onlineMonths == null ? 43 : this.onlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineMonths == null ? 43 : this.offlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.onlineMonthsSource == null
                                ? 43
                                : this.onlineMonthsSource.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineMonthsSource == null
                                ? 43
                                : this.offlineMonthsSource.hashCode());
        result =
                (result * PRIME)
                        + (this.paidUsageSource == null ? 43 : this.paidUsageSource.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
