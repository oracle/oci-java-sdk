/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Generate an on-demand backup and retain it long-term as per the LTR backup retention period
 * specified. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LongTermBackupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LongTermBackupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "protectedDatabaseId",
        "retentionScn",
        "retentionPointInTime",
        "timeBackupInitiated",
        "timeBackupCompleted",
        "retentionPeriod",
        "retentionUntilDateTime",
        "databaseIdentifier",
        "databaseSizeInGBs",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleSubstate",
        "lifecycleDetails",
        "rmanTag",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public LongTermBackupSummary(
            String id,
            String displayName,
            String compartmentId,
            String protectedDatabaseId,
            Integer retentionScn,
            java.util.Date retentionPointInTime,
            java.util.Date timeBackupInitiated,
            java.util.Date timeBackupCompleted,
            java.util.List<RetentionPeriodValue> retentionPeriod,
            java.util.Date retentionUntilDateTime,
            String databaseIdentifier,
            Integer databaseSizeInGBs,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LongTermBackup.LifecycleState lifecycleState,
            LongTermBackup.LifecycleSubstate lifecycleSubstate,
            String lifecycleDetails,
            String rmanTag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.protectedDatabaseId = protectedDatabaseId;
        this.retentionScn = retentionScn;
        this.retentionPointInTime = retentionPointInTime;
        this.timeBackupInitiated = timeBackupInitiated;
        this.timeBackupCompleted = timeBackupCompleted;
        this.retentionPeriod = retentionPeriod;
        this.retentionUntilDateTime = retentionUntilDateTime;
        this.databaseIdentifier = databaseIdentifier;
        this.databaseSizeInGBs = databaseSizeInGBs;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubstate = lifecycleSubstate;
        this.lifecycleDetails = lifecycleDetails;
        this.rmanTag = rmanTag;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Long Term Backup OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Long Term Backup OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The long term backup name. You can change the displayName. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The long term backup name. You can change the displayName. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment that contains the long term backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the long term backup.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The protected database ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectedDatabaseId")
        private String protectedDatabaseId;

        /**
         * The protected database ocid.
         *
         * @param protectedDatabaseId the value to set
         * @return this builder
         */
        public Builder protectedDatabaseId(String protectedDatabaseId) {
            this.protectedDatabaseId = protectedDatabaseId;
            this.__explicitlySet__.add("protectedDatabaseId");
            return this;
        }
        /** System Change Number (SCN) to which backup is consistent. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionScn")
        private Integer retentionScn;

        /**
         * System Change Number (SCN) to which backup is consistent.
         *
         * @param retentionScn the value to set
         * @return this builder
         */
        public Builder retentionScn(Integer retentionScn) {
            this.retentionScn = retentionScn;
            this.__explicitlySet__.add("retentionScn");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the time for a long term backup to be
         * initiated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPointInTime")
        private java.util.Date retentionPointInTime;

        /**
         * An RFC3339 formatted datetime string that indicates the time for a long term backup to be
         * initiated.
         *
         * @param retentionPointInTime the value to set
         * @return this builder
         */
        public Builder retentionPointInTime(java.util.Date retentionPointInTime) {
            this.retentionPointInTime = retentionPointInTime;
            this.__explicitlySet__.add("retentionPointInTime");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the time when the backup was actually
         * taken. For example '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupInitiated")
        private java.util.Date timeBackupInitiated;

        /**
         * An RFC3339 formatted datetime string that indicates the time when the backup was actually
         * taken. For example '2020-05-22T21:10:29.600Z'
         *
         * @param timeBackupInitiated the value to set
         * @return this builder
         */
        public Builder timeBackupInitiated(java.util.Date timeBackupInitiated) {
            this.timeBackupInitiated = timeBackupInitiated;
            this.__explicitlySet__.add("timeBackupInitiated");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the time when the backup was actually
         * completed. For example '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupCompleted")
        private java.util.Date timeBackupCompleted;

        /**
         * An RFC3339 formatted datetime string that indicates the time when the backup was actually
         * completed. For example '2020-05-22T21:10:29.600Z'
         *
         * @param timeBackupCompleted the value to set
         * @return this builder
         */
        public Builder timeBackupCompleted(java.util.Date timeBackupCompleted) {
            this.timeBackupCompleted = timeBackupCompleted;
            this.__explicitlySet__.add("timeBackupCompleted");
            return this;
        }
        /** Retain the long-term backup as per the backup retention period specified */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private java.util.List<RetentionPeriodValue> retentionPeriod;

        /**
         * Retain the long-term backup as per the backup retention period specified
         *
         * @param retentionPeriod the value to set
         * @return this builder
         */
        public Builder retentionPeriod(java.util.List<RetentionPeriodValue> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            this.__explicitlySet__.add("retentionPeriod");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the time after which the long term
         * backup will be deleted. For example '2020-05-22T21:10:29.600Z'. This timestamp has to be
         * 95 days-10 years from the current timestamp
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionUntilDateTime")
        private java.util.Date retentionUntilDateTime;

        /**
         * An RFC3339 formatted datetime string that indicates the time after which the long term
         * backup will be deleted. For example '2020-05-22T21:10:29.600Z'. This timestamp has to be
         * 95 days-10 years from the current timestamp
         *
         * @param retentionUntilDateTime the value to set
         * @return this builder
         */
        public Builder retentionUntilDateTime(java.util.Date retentionUntilDateTime) {
            this.retentionUntilDateTime = retentionUntilDateTime;
            this.__explicitlySet__.add("retentionUntilDateTime");
            return this;
        }
        /**
         * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle
         * Cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseIdentifier")
        private String databaseIdentifier;

        /**
         * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle
         * Cloud.
         *
         * @param databaseIdentifier the value to set
         * @return this builder
         */
        public Builder databaseIdentifier(String databaseIdentifier) {
            this.databaseIdentifier = databaseIdentifier;
            this.__explicitlySet__.add("databaseIdentifier");
            return this;
        }
        /** Database size */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
        private Integer databaseSizeInGBs;

        /**
         * Database size
         *
         * @param databaseSizeInGBs the value to set
         * @return this builder
         */
        public Builder databaseSizeInGBs(Integer databaseSizeInGBs) {
            this.databaseSizeInGBs = databaseSizeInGBs;
            this.__explicitlySet__.add("databaseSizeInGBs");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the created time for the long term
         * backup. For example: '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC3339 formatted datetime string that indicates the created time for the long term
         * backup. For example: '2020-05-22T21:10:29.600Z'.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the updated time for the long term
         * backup. For example: '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * An RFC3339 formatted datetime string that indicates the updated time for the long term
         * backup. For example: '2020-05-22T21:10:29.600Z'.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the long term backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LongTermBackup.LifecycleState lifecycleState;

        /**
         * The current state of the long term backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LongTermBackup.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** More details on the state of the backup when it is in Creating lifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
        private LongTermBackup.LifecycleSubstate lifecycleSubstate;

        /**
         * More details on the state of the backup when it is in Creating lifecycleState.
         *
         * @param lifecycleSubstate the value to set
         * @return this builder
         */
        public Builder lifecycleSubstate(LongTermBackup.LifecycleSubstate lifecycleSubstate) {
            this.lifecycleSubstate = lifecycleSubstate;
            this.__explicitlySet__.add("lifecycleSubstate");
            return this;
        }
        /**
         * Detailed description about the current lifecycle state of the long term backup. For
         * example, it can be used to provide actionable information for a resource in a Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed description about the current lifecycle state of the long term backup. For
         * example, it can be used to provide actionable information for a resource in a Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Recovery Manager (RMAN) assigned unique identifier for the long-term backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("rmanTag")
        private String rmanTag;

        /**
         * Recovery Manager (RMAN) assigned unique identifier for the long-term backup.
         *
         * @param rmanTag the value to set
         * @return this builder
         */
        public Builder rmanTag(String rmanTag) {
            this.rmanTag = rmanTag;
            this.__explicitlySet__.add("rmanTag");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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

        public LongTermBackupSummary build() {
            LongTermBackupSummary model =
                    new LongTermBackupSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.protectedDatabaseId,
                            this.retentionScn,
                            this.retentionPointInTime,
                            this.timeBackupInitiated,
                            this.timeBackupCompleted,
                            this.retentionPeriod,
                            this.retentionUntilDateTime,
                            this.databaseIdentifier,
                            this.databaseSizeInGBs,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleSubstate,
                            this.lifecycleDetails,
                            this.rmanTag,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LongTermBackupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("protectedDatabaseId")) {
                this.protectedDatabaseId(model.getProtectedDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("retentionScn")) {
                this.retentionScn(model.getRetentionScn());
            }
            if (model.wasPropertyExplicitlySet("retentionPointInTime")) {
                this.retentionPointInTime(model.getRetentionPointInTime());
            }
            if (model.wasPropertyExplicitlySet("timeBackupInitiated")) {
                this.timeBackupInitiated(model.getTimeBackupInitiated());
            }
            if (model.wasPropertyExplicitlySet("timeBackupCompleted")) {
                this.timeBackupCompleted(model.getTimeBackupCompleted());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriod")) {
                this.retentionPeriod(model.getRetentionPeriod());
            }
            if (model.wasPropertyExplicitlySet("retentionUntilDateTime")) {
                this.retentionUntilDateTime(model.getRetentionUntilDateTime());
            }
            if (model.wasPropertyExplicitlySet("databaseIdentifier")) {
                this.databaseIdentifier(model.getDatabaseIdentifier());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeInGBs")) {
                this.databaseSizeInGBs(model.getDatabaseSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleSubstate")) {
                this.lifecycleSubstate(model.getLifecycleSubstate());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("rmanTag")) {
                this.rmanTag(model.getRmanTag());
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

    /** The Long Term Backup OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Long Term Backup OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The long term backup name. You can change the displayName. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The long term backup name. You can change the displayName. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment that contains the long term backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the long term backup.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The protected database ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectedDatabaseId")
    private final String protectedDatabaseId;

    /**
     * The protected database ocid.
     *
     * @return the value
     */
    public String getProtectedDatabaseId() {
        return protectedDatabaseId;
    }

    /** System Change Number (SCN) to which backup is consistent. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionScn")
    private final Integer retentionScn;

    /**
     * System Change Number (SCN) to which backup is consistent.
     *
     * @return the value
     */
    public Integer getRetentionScn() {
        return retentionScn;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the time for a long term backup to be
     * initiated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPointInTime")
    private final java.util.Date retentionPointInTime;

    /**
     * An RFC3339 formatted datetime string that indicates the time for a long term backup to be
     * initiated.
     *
     * @return the value
     */
    public java.util.Date getRetentionPointInTime() {
        return retentionPointInTime;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the time when the backup was actually
     * taken. For example '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupInitiated")
    private final java.util.Date timeBackupInitiated;

    /**
     * An RFC3339 formatted datetime string that indicates the time when the backup was actually
     * taken. For example '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeBackupInitiated() {
        return timeBackupInitiated;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the time when the backup was actually
     * completed. For example '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupCompleted")
    private final java.util.Date timeBackupCompleted;

    /**
     * An RFC3339 formatted datetime string that indicates the time when the backup was actually
     * completed. For example '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeBackupCompleted() {
        return timeBackupCompleted;
    }

    /** Retain the long-term backup as per the backup retention period specified */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final java.util.List<RetentionPeriodValue> retentionPeriod;

    /**
     * Retain the long-term backup as per the backup retention period specified
     *
     * @return the value
     */
    public java.util.List<RetentionPeriodValue> getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the time after which the long term backup
     * will be deleted. For example '2020-05-22T21:10:29.600Z'. This timestamp has to be 95 days-10
     * years from the current timestamp
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionUntilDateTime")
    private final java.util.Date retentionUntilDateTime;

    /**
     * An RFC3339 formatted datetime string that indicates the time after which the long term backup
     * will be deleted. For example '2020-05-22T21:10:29.600Z'. This timestamp has to be 95 days-10
     * years from the current timestamp
     *
     * @return the value
     */
    public java.util.Date getRetentionUntilDateTime() {
        return retentionUntilDateTime;
    }

    /**
     * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseIdentifier")
    private final String databaseIdentifier;

    /**
     * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     *
     * @return the value
     */
    public String getDatabaseIdentifier() {
        return databaseIdentifier;
    }

    /** Database size */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
    private final Integer databaseSizeInGBs;

    /**
     * Database size
     *
     * @return the value
     */
    public Integer getDatabaseSizeInGBs() {
        return databaseSizeInGBs;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the created time for the long term
     * backup. For example: '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC3339 formatted datetime string that indicates the created time for the long term
     * backup. For example: '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the updated time for the long term
     * backup. For example: '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * An RFC3339 formatted datetime string that indicates the updated time for the long term
     * backup. For example: '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the long term backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LongTermBackup.LifecycleState lifecycleState;

    /**
     * The current state of the long term backup.
     *
     * @return the value
     */
    public LongTermBackup.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** More details on the state of the backup when it is in Creating lifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
    private final LongTermBackup.LifecycleSubstate lifecycleSubstate;

    /**
     * More details on the state of the backup when it is in Creating lifecycleState.
     *
     * @return the value
     */
    public LongTermBackup.LifecycleSubstate getLifecycleSubstate() {
        return lifecycleSubstate;
    }

    /**
     * Detailed description about the current lifecycle state of the long term backup. For example,
     * it can be used to provide actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed description about the current lifecycle state of the long term backup. For example,
     * it can be used to provide actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Recovery Manager (RMAN) assigned unique identifier for the long-term backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("rmanTag")
    private final String rmanTag;

    /**
     * Recovery Manager (RMAN) assigned unique identifier for the long-term backup.
     *
     * @return the value
     */
    public String getRmanTag() {
        return rmanTag;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
        sb.append("LongTermBackupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", protectedDatabaseId=").append(String.valueOf(this.protectedDatabaseId));
        sb.append(", retentionScn=").append(String.valueOf(this.retentionScn));
        sb.append(", retentionPointInTime=").append(String.valueOf(this.retentionPointInTime));
        sb.append(", timeBackupInitiated=").append(String.valueOf(this.timeBackupInitiated));
        sb.append(", timeBackupCompleted=").append(String.valueOf(this.timeBackupCompleted));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
        sb.append(", retentionUntilDateTime=").append(String.valueOf(this.retentionUntilDateTime));
        sb.append(", databaseIdentifier=").append(String.valueOf(this.databaseIdentifier));
        sb.append(", databaseSizeInGBs=").append(String.valueOf(this.databaseSizeInGBs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubstate=").append(String.valueOf(this.lifecycleSubstate));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", rmanTag=").append(String.valueOf(this.rmanTag));
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
        if (!(o instanceof LongTermBackupSummary)) {
            return false;
        }

        LongTermBackupSummary other = (LongTermBackupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.protectedDatabaseId, other.protectedDatabaseId)
                && java.util.Objects.equals(this.retentionScn, other.retentionScn)
                && java.util.Objects.equals(this.retentionPointInTime, other.retentionPointInTime)
                && java.util.Objects.equals(this.timeBackupInitiated, other.timeBackupInitiated)
                && java.util.Objects.equals(this.timeBackupCompleted, other.timeBackupCompleted)
                && java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod)
                && java.util.Objects.equals(
                        this.retentionUntilDateTime, other.retentionUntilDateTime)
                && java.util.Objects.equals(this.databaseIdentifier, other.databaseIdentifier)
                && java.util.Objects.equals(this.databaseSizeInGBs, other.databaseSizeInGBs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubstate, other.lifecycleSubstate)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.rmanTag, other.rmanTag)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectedDatabaseId == null
                                ? 43
                                : this.protectedDatabaseId.hashCode());
        result = (result * PRIME) + (this.retentionScn == null ? 43 : this.retentionScn.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPointInTime == null
                                ? 43
                                : this.retentionPointInTime.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackupInitiated == null
                                ? 43
                                : this.timeBackupInitiated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackupCompleted == null
                                ? 43
                                : this.timeBackupCompleted.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionUntilDateTime == null
                                ? 43
                                : this.retentionUntilDateTime.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseIdentifier == null
                                ? 43
                                : this.databaseIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeInGBs == null ? 43 : this.databaseSizeInGBs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubstate == null ? 43 : this.lifecycleSubstate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.rmanTag == null ? 43 : this.rmanTag.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
