/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A point-in-time copy of a volume group that can then be used to create a new volume group or
 * restore a volume group. For more information, see [Volume
 * Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VolumeGroupBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VolumeGroupBackup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "expirationTime",
        "freeformTags",
        "id",
        "lifecycleState",
        "sizeInMBs",
        "sizeInGBs",
        "sourceType",
        "timeCreated",
        "timeRequestReceived",
        "type",
        "uniqueSizeInMbs",
        "uniqueSizeInGbs",
        "volumeBackupIds",
        "volumeGroupId",
        "sourceVolumeGroupBackupId"
    })
    public VolumeGroupBackup(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Date expirationTime,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            Long sizeInMBs,
            Long sizeInGBs,
            SourceType sourceType,
            java.util.Date timeCreated,
            java.util.Date timeRequestReceived,
            Type type,
            Long uniqueSizeInMbs,
            Long uniqueSizeInGbs,
            java.util.List<String> volumeBackupIds,
            String volumeGroupId,
            String sourceVolumeGroupBackupId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.expirationTime = expirationTime;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.sizeInMBs = sizeInMBs;
        this.sizeInGBs = sizeInGBs;
        this.sourceType = sourceType;
        this.timeCreated = timeCreated;
        this.timeRequestReceived = timeRequestReceived;
        this.type = type;
        this.uniqueSizeInMbs = uniqueSizeInMbs;
        this.uniqueSizeInGbs = uniqueSizeInGbs;
        this.volumeBackupIds = volumeBackupIds;
        this.volumeGroupId = volumeGroupId;
        this.sourceVolumeGroupBackupId = sourceVolumeGroupBackupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains the volume group backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the volume group backup.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the volume group backup will expire and be automatically deleted.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will
         * always be present for volume group backups that were created automatically by a
         * scheduled-backup policy. For manually created volume group backups, it will be absent,
         * signifying that there is no expiration time and the backup will last forever until
         * manually deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expirationTime")
        private java.util.Date expirationTime;

        /**
         * The date and time the volume group backup will expire and be automatically deleted.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will
         * always be present for volume group backups that were created automatically by a
         * scheduled-backup policy. For manually created volume group backups, it will be absent,
         * signifying that there is no expiration time and the backup will last forever until
         * manually deleted.
         *
         * @param expirationTime the value to set
         * @return this builder
         */
        public Builder expirationTime(java.util.Date expirationTime) {
            this.expirationTime = expirationTime;
            this.__explicitlySet__.add("expirationTime");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /** The OCID of the volume group backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the volume group backup.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of a volume group backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a volume group backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The aggregate size of the volume group backup, in MBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The aggregate size of the volume group backup, in MBs.
         *
         * @param sizeInMBs the value to set
         * @return this builder
         */
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }
        /** The aggregate size of the volume group backup, in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The aggregate size of the volume group backup, in GBs.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         */
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /**
         * Specifies whether the volume group backup was created manually, or via scheduled backup
         * policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Specifies whether the volume group backup was created manually, or via scheduled backup
         * policy.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The date and time the volume group backup was created. This is the time the actual
         * point-in-time image of the volume group data was taken. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the volume group backup was created. This is the time the actual
         * point-in-time image of the volume group data was taken. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The date and time the request to create the volume group backup was received. Format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRequestReceived")
        private java.util.Date timeRequestReceived;

        /**
         * The date and time the request to create the volume group backup was received. Format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeRequestReceived the value to set
         * @return this builder
         */
        public Builder timeRequestReceived(java.util.Date timeRequestReceived) {
            this.timeRequestReceived = timeRequestReceived;
            this.__explicitlySet__.add("timeRequestReceived");
            return this;
        }
        /** The type of backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of backup.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The aggregate size used by the volume group backup, in MBs.
         *
         * <p>It is typically smaller than sizeInMBs, depending on the spaceconsumed on the volume
         * group and whether the volume backup is full or incremental.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInMbs")
        private Long uniqueSizeInMbs;

        /**
         * The aggregate size used by the volume group backup, in MBs.
         *
         * <p>It is typically smaller than sizeInMBs, depending on the spaceconsumed on the volume
         * group and whether the volume backup is full or incremental.
         *
         * @param uniqueSizeInMbs the value to set
         * @return this builder
         */
        public Builder uniqueSizeInMbs(Long uniqueSizeInMbs) {
            this.uniqueSizeInMbs = uniqueSizeInMbs;
            this.__explicitlySet__.add("uniqueSizeInMbs");
            return this;
        }
        /**
         * The aggregate size used by the volume group backup, in GBs.
         *
         * <p>It is typically smaller than sizeInGBs, depending on the spaceconsumed on the volume
         * group and whether the volume backup is full or incremental.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInGbs")
        private Long uniqueSizeInGbs;

        /**
         * The aggregate size used by the volume group backup, in GBs.
         *
         * <p>It is typically smaller than sizeInGBs, depending on the spaceconsumed on the volume
         * group and whether the volume backup is full or incremental.
         *
         * @param uniqueSizeInGbs the value to set
         * @return this builder
         */
        public Builder uniqueSizeInGbs(Long uniqueSizeInGbs) {
            this.uniqueSizeInGbs = uniqueSizeInGbs;
            this.__explicitlySet__.add("uniqueSizeInGbs");
            return this;
        }
        /** OCIDs for the volume backups in this volume group backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeBackupIds")
        private java.util.List<String> volumeBackupIds;

        /**
         * OCIDs for the volume backups in this volume group backup.
         *
         * @param volumeBackupIds the value to set
         * @return this builder
         */
        public Builder volumeBackupIds(java.util.List<String> volumeBackupIds) {
            this.volumeBackupIds = volumeBackupIds;
            this.__explicitlySet__.add("volumeBackupIds");
            return this;
        }
        /** The OCID of the source volume group. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * The OCID of the source volume group.
         *
         * @param volumeGroupId the value to set
         * @return this builder
         */
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }
        /** The OCID of the source volume group backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeGroupBackupId")
        private String sourceVolumeGroupBackupId;

        /**
         * The OCID of the source volume group backup.
         *
         * @param sourceVolumeGroupBackupId the value to set
         * @return this builder
         */
        public Builder sourceVolumeGroupBackupId(String sourceVolumeGroupBackupId) {
            this.sourceVolumeGroupBackupId = sourceVolumeGroupBackupId;
            this.__explicitlySet__.add("sourceVolumeGroupBackupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeGroupBackup build() {
            VolumeGroupBackup model =
                    new VolumeGroupBackup(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.expirationTime,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.sizeInMBs,
                            this.sizeInGBs,
                            this.sourceType,
                            this.timeCreated,
                            this.timeRequestReceived,
                            this.type,
                            this.uniqueSizeInMbs,
                            this.uniqueSizeInGbs,
                            this.volumeBackupIds,
                            this.volumeGroupId,
                            this.sourceVolumeGroupBackupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeGroupBackup model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("expirationTime")) {
                this.expirationTime(model.getExpirationTime());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sizeInMBs")) {
                this.sizeInMBs(model.getSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeRequestReceived")) {
                this.timeRequestReceived(model.getTimeRequestReceived());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("uniqueSizeInMbs")) {
                this.uniqueSizeInMbs(model.getUniqueSizeInMbs());
            }
            if (model.wasPropertyExplicitlySet("uniqueSizeInGbs")) {
                this.uniqueSizeInGbs(model.getUniqueSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("volumeBackupIds")) {
                this.volumeBackupIds(model.getVolumeBackupIds());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupId")) {
                this.volumeGroupId(model.getVolumeGroupId());
            }
            if (model.wasPropertyExplicitlySet("sourceVolumeGroupBackupId")) {
                this.sourceVolumeGroupBackupId(model.getSourceVolumeGroupBackupId());
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

    /** The OCID of the compartment that contains the volume group backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the volume group backup.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the volume group backup will expire and be automatically deleted. Format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be
     * present for volume group backups that were created automatically by a scheduled-backup
     * policy. For manually created volume group backups, it will be absent, signifying that there
     * is no expiration time and the backup will last forever until manually deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationTime")
    private final java.util.Date expirationTime;

    /**
     * The date and time the volume group backup will expire and be automatically deleted. Format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be
     * present for volume group backups that were created automatically by a scheduled-backup
     * policy. For manually created volume group backups, it will be absent, signifying that there
     * is no expiration time and the backup will last forever until manually deleted.
     *
     * @return the value
     */
    public java.util.Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The OCID of the volume group backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the volume group backup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of a volume group backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Committed("COMMITTED"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),
        RequestReceived("REQUEST_RECEIVED"),

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
    /** The current state of a volume group backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a volume group backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The aggregate size of the volume group backup, in MBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The aggregate size of the volume group backup, in MBs.
     *
     * @return the value
     */
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    /** The aggregate size of the volume group backup, in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The aggregate size of the volume group backup, in GBs.
     *
     * @return the value
     */
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    /**
     * Specifies whether the volume group backup was created manually, or via scheduled backup
     * policy.
     */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceType.class);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the volume group backup was created manually, or via scheduled backup
     * policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Specifies whether the volume group backup was created manually, or via scheduled backup
     * policy.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * The date and time the volume group backup was created. This is the time the actual
     * point-in-time image of the volume group data was taken. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the volume group backup was created. This is the time the actual
     * point-in-time image of the volume group data was taken. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the request to create the volume group backup was received. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequestReceived")
    private final java.util.Date timeRequestReceived;

    /**
     * The date and time the request to create the volume group backup was received. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeRequestReceived() {
        return timeRequestReceived;
    }

    /** The type of backup. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The aggregate size used by the volume group backup, in MBs.
     *
     * <p>It is typically smaller than sizeInMBs, depending on the spaceconsumed on the volume group
     * and whether the volume backup is full or incremental.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInMbs")
    private final Long uniqueSizeInMbs;

    /**
     * The aggregate size used by the volume group backup, in MBs.
     *
     * <p>It is typically smaller than sizeInMBs, depending on the spaceconsumed on the volume group
     * and whether the volume backup is full or incremental.
     *
     * @return the value
     */
    public Long getUniqueSizeInMbs() {
        return uniqueSizeInMbs;
    }

    /**
     * The aggregate size used by the volume group backup, in GBs.
     *
     * <p>It is typically smaller than sizeInGBs, depending on the spaceconsumed on the volume group
     * and whether the volume backup is full or incremental.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInGbs")
    private final Long uniqueSizeInGbs;

    /**
     * The aggregate size used by the volume group backup, in GBs.
     *
     * <p>It is typically smaller than sizeInGBs, depending on the spaceconsumed on the volume group
     * and whether the volume backup is full or incremental.
     *
     * @return the value
     */
    public Long getUniqueSizeInGbs() {
        return uniqueSizeInGbs;
    }

    /** OCIDs for the volume backups in this volume group backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeBackupIds")
    private final java.util.List<String> volumeBackupIds;

    /**
     * OCIDs for the volume backups in this volume group backup.
     *
     * @return the value
     */
    public java.util.List<String> getVolumeBackupIds() {
        return volumeBackupIds;
    }

    /** The OCID of the source volume group. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * The OCID of the source volume group.
     *
     * @return the value
     */
    public String getVolumeGroupId() {
        return volumeGroupId;
    }

    /** The OCID of the source volume group backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeGroupBackupId")
    private final String sourceVolumeGroupBackupId;

    /**
     * The OCID of the source volume group backup.
     *
     * @return the value
     */
    public String getSourceVolumeGroupBackupId() {
        return sourceVolumeGroupBackupId;
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
        sb.append("VolumeGroupBackup(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", expirationTime=").append(String.valueOf(this.expirationTime));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeRequestReceived=").append(String.valueOf(this.timeRequestReceived));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", uniqueSizeInMbs=").append(String.valueOf(this.uniqueSizeInMbs));
        sb.append(", uniqueSizeInGbs=").append(String.valueOf(this.uniqueSizeInGbs));
        sb.append(", volumeBackupIds=").append(String.valueOf(this.volumeBackupIds));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(", sourceVolumeGroupBackupId=")
                .append(String.valueOf(this.sourceVolumeGroupBackupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeGroupBackup)) {
            return false;
        }

        VolumeGroupBackup other = (VolumeGroupBackup) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.expirationTime, other.expirationTime)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeRequestReceived, other.timeRequestReceived)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.uniqueSizeInMbs, other.uniqueSizeInMbs)
                && java.util.Objects.equals(this.uniqueSizeInGbs, other.uniqueSizeInGbs)
                && java.util.Objects.equals(this.volumeBackupIds, other.volumeBackupIds)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(
                        this.sourceVolumeGroupBackupId, other.sourceVolumeGroupBackupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationTime == null ? 43 : this.expirationTime.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRequestReceived == null
                                ? 43
                                : this.timeRequestReceived.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.uniqueSizeInMbs == null ? 43 : this.uniqueSizeInMbs.hashCode());
        result =
                (result * PRIME)
                        + (this.uniqueSizeInGbs == null ? 43 : this.uniqueSizeInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeBackupIds == null ? 43 : this.volumeBackupIds.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVolumeGroupBackupId == null
                                ? 43
                                : this.sourceVolumeGroupBackupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
