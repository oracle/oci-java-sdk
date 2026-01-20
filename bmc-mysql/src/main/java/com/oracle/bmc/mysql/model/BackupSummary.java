/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details of Backups such as OCID, description, backupType, and so on.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "softDelete",
        "backupPreparationStatus",
        "validationStatus",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "backupType",
        "creationType",
        "dbSystemId",
        "compartmentId",
        "dataStorageSizeInGBs",
        "backupSizeInGBs",
        "retentionInDays",
        "mysqlVersion",
        "shapeName",
        "freeformTags",
        "definedTags",
        "systemTags",
        "immediateSourceBackupId",
        "originalSourceBackupId",
        "timeCopyCreated",
        "dbSystemSnapshotSummary",
        "encryptData"
    })
    public BackupSummary(
            String id,
            String displayName,
            String description,
            SoftDelete softDelete,
            BackupValidationDetails.BackupPreparationStatus backupPreparationStatus,
            BackupValidationDetails.ValidationStatus validationStatus,
            java.util.Date timeCreated,
            Backup.LifecycleState lifecycleState,
            String lifecycleDetails,
            Backup.BackupType backupType,
            Backup.CreationType creationType,
            String dbSystemId,
            String compartmentId,
            Integer dataStorageSizeInGBs,
            Integer backupSizeInGBs,
            Integer retentionInDays,
            String mysqlVersion,
            String shapeName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String immediateSourceBackupId,
            String originalSourceBackupId,
            java.util.Date timeCopyCreated,
            DbSystemSnapshotSummary dbSystemSnapshotSummary,
            EncryptDataDetails encryptData) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.softDelete = softDelete;
        this.backupPreparationStatus = backupPreparationStatus;
        this.validationStatus = validationStatus;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.backupType = backupType;
        this.creationType = creationType;
        this.dbSystemId = dbSystemId;
        this.compartmentId = compartmentId;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.backupSizeInGBs = backupSizeInGBs;
        this.retentionInDays = retentionInDays;
        this.mysqlVersion = mysqlVersion;
        this.shapeName = shapeName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.immediateSourceBackupId = immediateSourceBackupId;
        this.originalSourceBackupId = originalSourceBackupId;
        this.timeCopyCreated = timeCopyCreated;
        this.dbSystemSnapshotSummary = dbSystemSnapshotSummary;
        this.encryptData = encryptData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the backup.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-supplied display name for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-supplied display name for the backup.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A user-supplied description of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-supplied description of the backup.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state
         * for 7 days before permanently deleting it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softDelete")
        private SoftDelete softDelete;

        /**
         * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state
         * for 7 days before permanently deleting it.
         *
         * @param softDelete the value to set
         * @return this builder
         */
        public Builder softDelete(SoftDelete softDelete) {
            this.softDelete = softDelete;
            this.__explicitlySet__.add("softDelete");
            return this;
        }
        /** Indicates whether the backup has been prepared successfully. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupPreparationStatus")
        private BackupValidationDetails.BackupPreparationStatus backupPreparationStatus;

        /**
         * Indicates whether the backup has been prepared successfully.
         *
         * @param backupPreparationStatus the value to set
         * @return this builder
         */
        public Builder backupPreparationStatus(
                BackupValidationDetails.BackupPreparationStatus backupPreparationStatus) {
            this.backupPreparationStatus = backupPreparationStatus;
            this.__explicitlySet__.add("backupPreparationStatus");
            return this;
        }
        /** Status of the backup validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
        private BackupValidationDetails.ValidationStatus validationStatus;

        /**
         * Status of the backup validation.
         *
         * @param validationStatus the value to set
         * @return this builder
         */
        public Builder validationStatus(BackupValidationDetails.ValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            this.__explicitlySet__.add("validationStatus");
            return this;
        }
        /** The time the backup was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the backup was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Backup.LifecycleState lifecycleState;

        /**
         * The state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Backup.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycleState.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The type of backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private Backup.BackupType backupType;

        /**
         * The type of backup.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(Backup.BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /** If the backup was created automatically, or by a manual request. */
        @com.fasterxml.jackson.annotation.JsonProperty("creationType")
        private Backup.CreationType creationType;

        /**
         * If the backup was created automatically, or by a manual request.
         *
         * @param creationType the value to set
         * @return this builder
         */
        public Builder creationType(Backup.CreationType creationType) {
            this.creationType = creationType;
            this.__explicitlySet__.add("creationType");
            return this;
        }
        /** The OCID of the DB System the Backup is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System the Backup is associated with.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /** The OCID of the compartment the backup exists in. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the backup exists in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Size of the data volume in GiBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Size of the data volume in GiBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /** The size of the backup in GiBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
        private Integer backupSizeInGBs;

        /**
         * The size of the backup in GiBs.
         *
         * @param backupSizeInGBs the value to set
         * @return this builder
         */
        public Builder backupSizeInGBs(Integer backupSizeInGBs) {
            this.backupSizeInGBs = backupSizeInGBs;
            this.__explicitlySet__.add("backupSizeInGBs");
            return this;
        }
        /** Number of days to retain this backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
        private Integer retentionInDays;

        /**
         * Number of days to retain this backup.
         *
         * @param retentionInDays the value to set
         * @return this builder
         */
        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            this.__explicitlySet__.add("retentionInDays");
            return this;
        }
        /** The version of the DB System used for backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * The version of the DB System used for backup.
         *
         * @param mysqlVersion the value to set
         * @return this builder
         */
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }
        /** The shape of the DB System instance used for backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the DB System instance used for backup.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The OCID of the immediate source DB system backup from which this DB system backup was
         * copied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("immediateSourceBackupId")
        private String immediateSourceBackupId;

        /**
         * The OCID of the immediate source DB system backup from which this DB system backup was
         * copied.
         *
         * @param immediateSourceBackupId the value to set
         * @return this builder
         */
        public Builder immediateSourceBackupId(String immediateSourceBackupId) {
            this.immediateSourceBackupId = immediateSourceBackupId;
            this.__explicitlySet__.add("immediateSourceBackupId");
            return this;
        }
        /**
         * The OCID of the original source DB system backup from which this DB system backup was
         * copied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originalSourceBackupId")
        private String originalSourceBackupId;

        /**
         * The OCID of the original source DB system backup from which this DB system backup was
         * copied.
         *
         * @param originalSourceBackupId the value to set
         * @return this builder
         */
        public Builder originalSourceBackupId(String originalSourceBackupId) {
            this.originalSourceBackupId = originalSourceBackupId;
            this.__explicitlySet__.add("originalSourceBackupId");
            return this;
        }
        /**
         * The date and time the DB system backup copy was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCopyCreated")
        private java.util.Date timeCopyCreated;

        /**
         * The date and time the DB system backup copy was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeCopyCreated the value to set
         * @return this builder
         */
        public Builder timeCopyCreated(java.util.Date timeCopyCreated) {
            this.timeCopyCreated = timeCopyCreated;
            this.__explicitlySet__.add("timeCopyCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshotSummary")
        private DbSystemSnapshotSummary dbSystemSnapshotSummary;

        public Builder dbSystemSnapshotSummary(DbSystemSnapshotSummary dbSystemSnapshotSummary) {
            this.dbSystemSnapshotSummary = dbSystemSnapshotSummary;
            this.__explicitlySet__.add("dbSystemSnapshotSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
        private EncryptDataDetails encryptData;

        public Builder encryptData(EncryptDataDetails encryptData) {
            this.encryptData = encryptData;
            this.__explicitlySet__.add("encryptData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupSummary build() {
            BackupSummary model =
                    new BackupSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.softDelete,
                            this.backupPreparationStatus,
                            this.validationStatus,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.backupType,
                            this.creationType,
                            this.dbSystemId,
                            this.compartmentId,
                            this.dataStorageSizeInGBs,
                            this.backupSizeInGBs,
                            this.retentionInDays,
                            this.mysqlVersion,
                            this.shapeName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.immediateSourceBackupId,
                            this.originalSourceBackupId,
                            this.timeCopyCreated,
                            this.dbSystemSnapshotSummary,
                            this.encryptData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("softDelete")) {
                this.softDelete(model.getSoftDelete());
            }
            if (model.wasPropertyExplicitlySet("backupPreparationStatus")) {
                this.backupPreparationStatus(model.getBackupPreparationStatus());
            }
            if (model.wasPropertyExplicitlySet("validationStatus")) {
                this.validationStatus(model.getValidationStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("creationType")) {
                this.creationType(model.getCreationType());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("backupSizeInGBs")) {
                this.backupSizeInGBs(model.getBackupSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("retentionInDays")) {
                this.retentionInDays(model.getRetentionInDays());
            }
            if (model.wasPropertyExplicitlySet("mysqlVersion")) {
                this.mysqlVersion(model.getMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
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
            if (model.wasPropertyExplicitlySet("immediateSourceBackupId")) {
                this.immediateSourceBackupId(model.getImmediateSourceBackupId());
            }
            if (model.wasPropertyExplicitlySet("originalSourceBackupId")) {
                this.originalSourceBackupId(model.getOriginalSourceBackupId());
            }
            if (model.wasPropertyExplicitlySet("timeCopyCreated")) {
                this.timeCopyCreated(model.getTimeCopyCreated());
            }
            if (model.wasPropertyExplicitlySet("dbSystemSnapshotSummary")) {
                this.dbSystemSnapshotSummary(model.getDbSystemSnapshotSummary());
            }
            if (model.wasPropertyExplicitlySet("encryptData")) {
                this.encryptData(model.getEncryptData());
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

    /** OCID of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the backup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-supplied display name for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-supplied display name for the backup.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A user-supplied description of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-supplied description of the backup.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state for 7
     * days before permanently deleting it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softDelete")
    private final SoftDelete softDelete;

    /**
     * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state for 7
     * days before permanently deleting it.
     *
     * @return the value
     */
    public SoftDelete getSoftDelete() {
        return softDelete;
    }

    /** Indicates whether the backup has been prepared successfully. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupPreparationStatus")
    private final BackupValidationDetails.BackupPreparationStatus backupPreparationStatus;

    /**
     * Indicates whether the backup has been prepared successfully.
     *
     * @return the value
     */
    public BackupValidationDetails.BackupPreparationStatus getBackupPreparationStatus() {
        return backupPreparationStatus;
    }

    /** Status of the backup validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    private final BackupValidationDetails.ValidationStatus validationStatus;

    /**
     * Status of the backup validation.
     *
     * @return the value
     */
    public BackupValidationDetails.ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /** The time the backup was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the backup was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Backup.LifecycleState lifecycleState;

    /**
     * The state of the backup.
     *
     * @return the value
     */
    public Backup.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycleState.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final Backup.BackupType backupType;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public Backup.BackupType getBackupType() {
        return backupType;
    }

    /** If the backup was created automatically, or by a manual request. */
    @com.fasterxml.jackson.annotation.JsonProperty("creationType")
    private final Backup.CreationType creationType;

    /**
     * If the backup was created automatically, or by a manual request.
     *
     * @return the value
     */
    public Backup.CreationType getCreationType() {
        return creationType;
    }

    /** The OCID of the DB System the Backup is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System the Backup is associated with.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /** The OCID of the compartment the backup exists in. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the backup exists in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Size of the data volume in GiBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Size of the data volume in GiBs.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /** The size of the backup in GiBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
    private final Integer backupSizeInGBs;

    /**
     * The size of the backup in GiBs.
     *
     * @return the value
     */
    public Integer getBackupSizeInGBs() {
        return backupSizeInGBs;
    }

    /** Number of days to retain this backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
    private final Integer retentionInDays;

    /**
     * Number of days to retain this backup.
     *
     * @return the value
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    /** The version of the DB System used for backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * The version of the DB System used for backup.
     *
     * @return the value
     */
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /** The shape of the DB System instance used for backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the DB System instance used for backup.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
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
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The OCID of the immediate source DB system backup from which this DB system backup was
     * copied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("immediateSourceBackupId")
    private final String immediateSourceBackupId;

    /**
     * The OCID of the immediate source DB system backup from which this DB system backup was
     * copied.
     *
     * @return the value
     */
    public String getImmediateSourceBackupId() {
        return immediateSourceBackupId;
    }

    /**
     * The OCID of the original source DB system backup from which this DB system backup was copied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalSourceBackupId")
    private final String originalSourceBackupId;

    /**
     * The OCID of the original source DB system backup from which this DB system backup was copied.
     *
     * @return the value
     */
    public String getOriginalSourceBackupId() {
        return originalSourceBackupId;
    }

    /**
     * The date and time the DB system backup copy was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCopyCreated")
    private final java.util.Date timeCopyCreated;

    /**
     * The date and time the DB system backup copy was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCopyCreated() {
        return timeCopyCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshotSummary")
    private final DbSystemSnapshotSummary dbSystemSnapshotSummary;

    public DbSystemSnapshotSummary getDbSystemSnapshotSummary() {
        return dbSystemSnapshotSummary;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
    private final EncryptDataDetails encryptData;

    public EncryptDataDetails getEncryptData() {
        return encryptData;
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
        sb.append("BackupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", softDelete=").append(String.valueOf(this.softDelete));
        sb.append(", backupPreparationStatus=")
                .append(String.valueOf(this.backupPreparationStatus));
        sb.append(", validationStatus=").append(String.valueOf(this.validationStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", creationType=").append(String.valueOf(this.creationType));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", backupSizeInGBs=").append(String.valueOf(this.backupSizeInGBs));
        sb.append(", retentionInDays=").append(String.valueOf(this.retentionInDays));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", immediateSourceBackupId=")
                .append(String.valueOf(this.immediateSourceBackupId));
        sb.append(", originalSourceBackupId=").append(String.valueOf(this.originalSourceBackupId));
        sb.append(", timeCopyCreated=").append(String.valueOf(this.timeCopyCreated));
        sb.append(", dbSystemSnapshotSummary=")
                .append(String.valueOf(this.dbSystemSnapshotSummary));
        sb.append(", encryptData=").append(String.valueOf(this.encryptData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupSummary)) {
            return false;
        }

        BackupSummary other = (BackupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.softDelete, other.softDelete)
                && java.util.Objects.equals(
                        this.backupPreparationStatus, other.backupPreparationStatus)
                && java.util.Objects.equals(this.validationStatus, other.validationStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.creationType, other.creationType)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.backupSizeInGBs, other.backupSizeInGBs)
                && java.util.Objects.equals(this.retentionInDays, other.retentionInDays)
                && java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.immediateSourceBackupId, other.immediateSourceBackupId)
                && java.util.Objects.equals(
                        this.originalSourceBackupId, other.originalSourceBackupId)
                && java.util.Objects.equals(this.timeCopyCreated, other.timeCopyCreated)
                && java.util.Objects.equals(
                        this.dbSystemSnapshotSummary, other.dbSystemSnapshotSummary)
                && java.util.Objects.equals(this.encryptData, other.encryptData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.softDelete == null ? 43 : this.softDelete.hashCode());
        result =
                (result * PRIME)
                        + (this.backupPreparationStatus == null
                                ? 43
                                : this.backupPreparationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.validationStatus == null ? 43 : this.validationStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + (this.creationType == null ? 43 : this.creationType.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSizeInGBs == null ? 43 : this.backupSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionInDays == null ? 43 : this.retentionInDays.hashCode());
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.immediateSourceBackupId == null
                                ? 43
                                : this.immediateSourceBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.originalSourceBackupId == null
                                ? 43
                                : this.originalSourceBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCopyCreated == null ? 43 : this.timeCopyCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemSnapshotSummary == null
                                ? 43
                                : this.dbSystemSnapshotSummary.hashCode());
        result = (result * PRIME) + (this.encryptData == null ? 43 : this.encryptData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
