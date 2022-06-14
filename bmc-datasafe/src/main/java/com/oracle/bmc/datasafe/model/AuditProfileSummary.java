/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of an audit profile.
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
    builder = AuditProfileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditProfileSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "targetId",
        "lifecycleState",
        "description",
        "lifecycleDetails",
        "isPaidUsageEnabled",
        "onlineMonths",
        "offlineMonths",
        "auditCollectedVolume",
        "isOverrideGlobalRetentionSetting",
        "freeformTags",
        "definedTags"
    })
    public AuditProfileSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String targetId,
            AuditProfileLifecycleState lifecycleState,
            String description,
            String lifecycleDetails,
            Boolean isPaidUsageEnabled,
            Integer onlineMonths,
            Integer offlineMonths,
            Long auditCollectedVolume,
            Boolean isOverrideGlobalRetentionSetting,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.targetId = targetId;
        this.lifecycleState = lifecycleState;
        this.description = description;
        this.lifecycleDetails = lifecycleDetails;
        this.isPaidUsageEnabled = isPaidUsageEnabled;
        this.onlineMonths = onlineMonths;
        this.offlineMonths = offlineMonths;
        this.auditCollectedVolume = auditCollectedVolume;
        this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the audit profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the audit profile.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that contains the audit profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the audit profile.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The display name of the audit profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the audit profile.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the audit profile was created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the audit profile was created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the audit profile was updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the audit profile was updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The OCID of the Data Safe target for which the audit profile is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the Data Safe target for which the audit profile is created.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The current state of the audit profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditProfileLifecycleState lifecycleState;

        /**
         * The current state of the audit profile.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AuditProfileLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The description of audit profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of audit profile.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Details about the current state of the audit profile in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the audit profile in Data Safe.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         **/
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }
        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for immediate reporting and analysis.
         * Minimum: 1; Maximum:12 months
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for immediate reporting and analysis.
         * Minimum: 1; Maximum:12 months
         *
         * @param onlineMonths the value to set
         * @return this builder
         **/
        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }
        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
         * Minimum: 0; Maximum: 72 months.
         * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
         * Minimum: 0; Maximum: 72 months.
         * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
         *
         * @param offlineMonths the value to set
         * @return this builder
         **/
        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }
        /**
         * Indicates count of audit records collected by Data Safe from the target which is eligible
         * for the current month's billing cycle. Audit records for actions performed by Data Safe service
         * account on the target is excluded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
        private Long auditCollectedVolume;

        /**
         * Indicates count of audit records collected by Data Safe from the target which is eligible
         * for the current month's billing cycle. Audit records for actions performed by Data Safe service
         * account on the target is excluded.
         *
         * @param auditCollectedVolume the value to set
         * @return this builder
         **/
        public Builder auditCollectedVolume(Long auditCollectedVolume) {
            this.auditCollectedVolume = auditCollectedVolume;
            this.__explicitlySet__.add("auditCollectedVolume");
            return this;
        }
        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
        private Boolean isOverrideGlobalRetentionSetting;

        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         *
         * @param isOverrideGlobalRetentionSetting the value to set
         * @return this builder
         **/
        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            this.__explicitlySet__.add("isOverrideGlobalRetentionSetting");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public AuditProfileSummary build() {
            AuditProfileSummary __instance__ =
                    new AuditProfileSummary(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            targetId,
                            lifecycleState,
                            description,
                            lifecycleDetails,
                            isPaidUsageEnabled,
                            onlineMonths,
                            offlineMonths,
                            auditCollectedVolume,
                            isOverrideGlobalRetentionSetting,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditProfileSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .targetId(o.getTargetId())
                            .lifecycleState(o.getLifecycleState())
                            .description(o.getDescription())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .isPaidUsageEnabled(o.getIsPaidUsageEnabled())
                            .onlineMonths(o.getOnlineMonths())
                            .offlineMonths(o.getOfflineMonths())
                            .auditCollectedVolume(o.getAuditCollectedVolume())
                            .isOverrideGlobalRetentionSetting(
                                    o.getIsOverrideGlobalRetentionSetting())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the audit profile.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that contains the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the audit profile.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the audit profile.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the audit profile was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the audit profile was created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the audit profile was updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the audit profile was updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The OCID of the Data Safe target for which the audit profile is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the Data Safe target for which the audit profile is created.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The current state of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditProfileLifecycleState lifecycleState;

    /**
     * The current state of the audit profile.
     * @return the value
     **/
    public AuditProfileLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The description of audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of audit profile.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Details about the current state of the audit profile in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the audit profile in Data Safe.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     * @return the value
     **/
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for immediate reporting and analysis.
     * Minimum: 1; Maximum:12 months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    private final Integer onlineMonths;

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for immediate reporting and analysis.
     * Minimum: 1; Maximum:12 months
     *
     * @return the value
     **/
    public Integer getOnlineMonths() {
        return onlineMonths;
    }

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
     * Minimum: 0; Maximum: 72 months.
     * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    private final Integer offlineMonths;

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
     * Minimum: 0; Maximum: 72 months.
     * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
     *
     * @return the value
     **/
    public Integer getOfflineMonths() {
        return offlineMonths;
    }

    /**
     * Indicates count of audit records collected by Data Safe from the target which is eligible
     * for the current month's billing cycle. Audit records for actions performed by Data Safe service
     * account on the target is excluded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
    private final Long auditCollectedVolume;

    /**
     * Indicates count of audit records collected by Data Safe from the target which is eligible
     * for the current month's billing cycle. Audit records for actions performed by Data Safe service
     * account on the target is excluded.
     *
     * @return the value
     **/
    public Long getAuditCollectedVolume() {
        return auditCollectedVolume;
    }

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    private final Boolean isOverrideGlobalRetentionSetting;

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     * @return the value
     **/
    public Boolean getIsOverrideGlobalRetentionSetting() {
        return isOverrideGlobalRetentionSetting;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuditProfileSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append(", onlineMonths=").append(String.valueOf(this.onlineMonths));
        sb.append(", offlineMonths=").append(String.valueOf(this.offlineMonths));
        sb.append(", auditCollectedVolume=").append(String.valueOf(this.auditCollectedVolume));
        sb.append(", isOverrideGlobalRetentionSetting=")
                .append(String.valueOf(this.isOverrideGlobalRetentionSetting));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditProfileSummary)) {
            return false;
        }

        AuditProfileSummary other = (AuditProfileSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(this.onlineMonths, other.onlineMonths)
                && java.util.Objects.equals(this.offlineMonths, other.offlineMonths)
                && java.util.Objects.equals(this.auditCollectedVolume, other.auditCollectedVolume)
                && java.util.Objects.equals(
                        this.isOverrideGlobalRetentionSetting,
                        other.isOverrideGlobalRetentionSetting)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
                        + (this.auditCollectedVolume == null
                                ? 43
                                : this.auditCollectedVolume.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideGlobalRetentionSetting == null
                                ? 43
                                : this.isOverrideGlobalRetentionSetting.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
