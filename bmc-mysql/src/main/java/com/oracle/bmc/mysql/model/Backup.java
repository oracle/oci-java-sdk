/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A full or incremental copy of a DB System which can be used to create a new DB System or recover
 * a DB System.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Backup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "backupType",
        "creationType",
        "dbSystemId",
        "dbSystemSnapshot",
        "backupSizeInGBs",
        "retentionInDays",
        "dataStorageSizeInGBs",
        "mysqlVersion",
        "shapeName",
        "freeformTags",
        "definedTags",
        "systemTags",
        "immediateSourceBackupId",
        "originalSourceBackupId",
        "timeCopyCreated"
    })
    public Backup(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            BackupType backupType,
            CreationType creationType,
            String dbSystemId,
            DbSystemSnapshot dbSystemSnapshot,
            Integer backupSizeInGBs,
            Integer retentionInDays,
            Integer dataStorageSizeInGBs,
            String mysqlVersion,
            String shapeName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String immediateSourceBackupId,
            String originalSourceBackupId,
            java.util.Date timeCopyCreated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.backupType = backupType;
        this.creationType = creationType;
        this.dbSystemId = dbSystemId;
        this.dbSystemSnapshot = dbSystemSnapshot;
        this.backupSizeInGBs = backupSizeInGBs;
        this.retentionInDays = retentionInDays;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.mysqlVersion = mysqlVersion;
        this.shapeName = shapeName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.immediateSourceBackupId = immediateSourceBackupId;
        this.originalSourceBackupId = originalSourceBackupId;
        this.timeCopyCreated = timeCopyCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the backup itself */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the backup itself
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
        /** A user-supplied description for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-supplied description for the backup.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The time the backup record was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the backup record was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time at which the backup was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time at which the backup was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
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
        private BackupType backupType;

        /**
         * The type of backup.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /** Indicates how the backup was created: manually, automatic, or by an Operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("creationType")
        private CreationType creationType;

        /**
         * Indicates how the backup was created: manually, automatic, or by an Operator.
         *
         * @param creationType the value to set
         * @return this builder
         */
        public Builder creationType(CreationType creationType) {
            this.creationType = creationType;
            this.__explicitlySet__.add("creationType");
            return this;
        }
        /** The OCID of the DB System the backup is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System the backup is associated with.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshot")
        private DbSystemSnapshot dbSystemSnapshot;

        public Builder dbSystemSnapshot(DbSystemSnapshot dbSystemSnapshot) {
            this.dbSystemSnapshot = dbSystemSnapshot;
            this.__explicitlySet__.add("dbSystemSnapshot");
            return this;
        }
        /** The size of the backup in base-2 (IEC) gibibytes. (GiB). */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
        private Integer backupSizeInGBs;

        /**
         * The size of the backup in base-2 (IEC) gibibytes. (GiB).
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
        /** Initial size of the data volume in GiBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Initial size of the data volume in GiBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /** The MySQL server version of the DB System used for backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * The MySQL server version of the DB System used for backup.
         *
         * @param mysqlVersion the value to set
         * @return this builder
         */
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }
        /** The shape of the DB System used for backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the DB System used for backup.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backup build() {
            Backup model =
                    new Backup(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.backupType,
                            this.creationType,
                            this.dbSystemId,
                            this.dbSystemSnapshot,
                            this.backupSizeInGBs,
                            this.retentionInDays,
                            this.dataStorageSizeInGBs,
                            this.mysqlVersion,
                            this.shapeName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.immediateSourceBackupId,
                            this.originalSourceBackupId,
                            this.timeCopyCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("dbSystemSnapshot")) {
                this.dbSystemSnapshot(model.getDbSystemSnapshot());
            }
            if (model.wasPropertyExplicitlySet("backupSizeInGBs")) {
                this.backupSizeInGBs(model.getBackupSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("retentionInDays")) {
                this.retentionInDays(model.getRetentionInDays());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
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

    /** OCID of the backup itself */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the backup itself
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

    /** A user-supplied description for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-supplied description for the backup.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The time the backup record was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the backup record was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time at which the backup was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time at which the backup was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The state of the backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
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
    public enum BackupType implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupType.class);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public BackupType getBackupType() {
        return backupType;
    }

    /** Indicates how the backup was created: manually, automatic, or by an Operator. */
    public enum CreationType implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Automatic("AUTOMATIC"),
        Operator("OPERATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreationType.class);

        private final String value;
        private static java.util.Map<String, CreationType> map;

        static {
            map = new java.util.HashMap<>();
            for (CreationType v : CreationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates how the backup was created: manually, automatic, or by an Operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("creationType")
    private final CreationType creationType;

    /**
     * Indicates how the backup was created: manually, automatic, or by an Operator.
     *
     * @return the value
     */
    public CreationType getCreationType() {
        return creationType;
    }

    /** The OCID of the DB System the backup is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System the backup is associated with.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshot")
    private final DbSystemSnapshot dbSystemSnapshot;

    public DbSystemSnapshot getDbSystemSnapshot() {
        return dbSystemSnapshot;
    }

    /** The size of the backup in base-2 (IEC) gibibytes. (GiB). */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
    private final Integer backupSizeInGBs;

    /**
     * The size of the backup in base-2 (IEC) gibibytes. (GiB).
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

    /** Initial size of the data volume in GiBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Initial size of the data volume in GiBs.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /** The MySQL server version of the DB System used for backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * The MySQL server version of the DB System used for backup.
     *
     * @return the value
     */
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /** The shape of the DB System used for backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the DB System used for backup.
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
        sb.append("Backup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", creationType=").append(String.valueOf(this.creationType));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", dbSystemSnapshot=").append(String.valueOf(this.dbSystemSnapshot));
        sb.append(", backupSizeInGBs=").append(String.valueOf(this.backupSizeInGBs));
        sb.append(", retentionInDays=").append(String.valueOf(this.retentionInDays));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", immediateSourceBackupId=")
                .append(String.valueOf(this.immediateSourceBackupId));
        sb.append(", originalSourceBackupId=").append(String.valueOf(this.originalSourceBackupId));
        sb.append(", timeCopyCreated=").append(String.valueOf(this.timeCopyCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Backup)) {
            return false;
        }

        Backup other = (Backup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.creationType, other.creationType)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.dbSystemSnapshot, other.dbSystemSnapshot)
                && java.util.Objects.equals(this.backupSizeInGBs, other.backupSizeInGBs)
                && java.util.Objects.equals(this.retentionInDays, other.retentionInDays)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
                        + (this.dbSystemSnapshot == null ? 43 : this.dbSystemSnapshot.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSizeInGBs == null ? 43 : this.backupSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionInDays == null ? 43 : this.retentionInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
