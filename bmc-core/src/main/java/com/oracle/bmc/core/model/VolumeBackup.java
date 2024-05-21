/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A point-in-time copy of a volume that can then be used to create a new block volume
 * or recover a block volume. For more information, see
 * [Overview of Cloud Volume Storage](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VolumeBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeBackup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "systemTags",
        "displayName",
        "expirationTime",
        "freeformTags",
        "id",
        "kmsKeyId",
        "lifecycleState",
        "sizeInGBs",
        "sizeInMBs",
        "sourceType",
        "sourceVolumeBackupId",
        "timeCreated",
        "timeRequestReceived",
        "type",
        "uniqueSizeInGBs",
        "uniqueSizeInMbs",
        "volumeId"
    })
    public VolumeBackup(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String displayName,
            java.util.Date expirationTime,
            java.util.Map<String, String> freeformTags,
            String id,
            String kmsKeyId,
            LifecycleState lifecycleState,
            Long sizeInGBs,
            Long sizeInMBs,
            SourceType sourceType,
            String sourceVolumeBackupId,
            java.util.Date timeCreated,
            java.util.Date timeRequestReceived,
            Type type,
            Long uniqueSizeInGBs,
            Long uniqueSizeInMbs,
            String volumeId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.displayName = displayName;
        this.expirationTime = expirationTime;
        this.freeformTags = freeformTags;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.lifecycleState = lifecycleState;
        this.sizeInGBs = sizeInGBs;
        this.sizeInMBs = sizeInMBs;
        this.sourceType = sourceType;
        this.sourceVolumeBackupId = sourceVolumeBackupId;
        this.timeCreated = timeCreated;
        this.timeRequestReceived = timeRequestReceived;
        this.type = type;
        this.uniqueSizeInGBs = uniqueSizeInGBs;
        this.uniqueSizeInMbs = uniqueSizeInMbs;
        this.volumeId = volumeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains the volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the volume backup.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the volume backup will expire and be automatically deleted.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that
         * were created automatically by a scheduled-backup policy. For manually created backups,
         * it will be absent, signifying that there is no expiration time and the backup will
         * last forever until manually deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expirationTime")
        private java.util.Date expirationTime;

        /**
         * The date and time the volume backup will expire and be automatically deleted.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that
         * were created automatically by a scheduled-backup policy. For manually created backups,
         * it will be absent, signifying that there is no expiration time and the backup will
         * last forever until manually deleted.
         *
         * @param expirationTime the value to set
         * @return this builder
         **/
        public Builder expirationTime(java.util.Date expirationTime) {
            this.expirationTime = expirationTime;
            this.__explicitlySet__.add("expirationTime");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The OCID of the volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the volume backup.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the Vault service key which is the master encryption key for the volume backup.
         * For more information about the Vault service and encryption keys, see
         * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Vault service key which is the master encryption key for the volume backup.
         * For more information about the Vault service and encryption keys, see
         * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The current state of a volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a volume backup.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The size of the volume, in GBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The size of the volume, in GBs.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         **/
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /**
         * The size of the volume in MBs. The value must be a multiple of 1024.
         * This field is deprecated. Please use sizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The size of the volume in MBs. The value must be a multiple of 1024.
         * This field is deprecated. Please use sizeInGBs.
         *
         * @param sizeInMBs the value to set
         * @return this builder
         **/
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }
        /**
         * Specifies whether the backup was created manually, or via scheduled backup policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Specifies whether the backup was created manually, or via scheduled backup policy.
         *
         * @param sourceType the value to set
         * @return this builder
         **/
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The OCID of the source volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeBackupId")
        private String sourceVolumeBackupId;

        /**
         * The OCID of the source volume backup.
         * @param sourceVolumeBackupId the value to set
         * @return this builder
         **/
        public Builder sourceVolumeBackupId(String sourceVolumeBackupId) {
            this.sourceVolumeBackupId = sourceVolumeBackupId;
            this.__explicitlySet__.add("sourceVolumeBackupId");
            return this;
        }
        /**
         * The date and time the volume backup was created. This is the time the actual point-in-time image
         * of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the volume backup was created. This is the time the actual point-in-time image
         * of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRequestReceived")
        private java.util.Date timeRequestReceived;

        /**
         * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
         *
         * @param timeRequestReceived the value to set
         * @return this builder
         **/
        public Builder timeRequestReceived(java.util.Date timeRequestReceived) {
            this.timeRequestReceived = timeRequestReceived;
            this.__explicitlySet__.add("timeRequestReceived");
            return this;
        }
        /**
         * The type of a volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of a volume backup.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space
         * consumed on the volume and whether the backup is full or incremental.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInGBs")
        private Long uniqueSizeInGBs;

        /**
         * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space
         * consumed on the volume and whether the backup is full or incremental.
         *
         * @param uniqueSizeInGBs the value to set
         * @return this builder
         **/
        public Builder uniqueSizeInGBs(Long uniqueSizeInGBs) {
            this.uniqueSizeInGBs = uniqueSizeInGBs;
            this.__explicitlySet__.add("uniqueSizeInGBs");
            return this;
        }
        /**
         * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space
         * consumed on the volume and whether the backup is full or incremental.
         * This field is deprecated. Please use uniqueSizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInMbs")
        private Long uniqueSizeInMbs;

        /**
         * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space
         * consumed on the volume and whether the backup is full or incremental.
         * This field is deprecated. Please use uniqueSizeInGBs.
         *
         * @param uniqueSizeInMbs the value to set
         * @return this builder
         **/
        public Builder uniqueSizeInMbs(Long uniqueSizeInMbs) {
            this.uniqueSizeInMbs = uniqueSizeInMbs;
            this.__explicitlySet__.add("uniqueSizeInMbs");
            return this;
        }
        /**
         * The OCID of the volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        /**
         * The OCID of the volume.
         * @param volumeId the value to set
         * @return this builder
         **/
        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeBackup build() {
            VolumeBackup model =
                    new VolumeBackup(
                            this.compartmentId,
                            this.definedTags,
                            this.systemTags,
                            this.displayName,
                            this.expirationTime,
                            this.freeformTags,
                            this.id,
                            this.kmsKeyId,
                            this.lifecycleState,
                            this.sizeInGBs,
                            this.sizeInMBs,
                            this.sourceType,
                            this.sourceVolumeBackupId,
                            this.timeCreated,
                            this.timeRequestReceived,
                            this.type,
                            this.uniqueSizeInGBs,
                            this.uniqueSizeInMbs,
                            this.volumeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeBackup model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("sizeInMBs")) {
                this.sizeInMBs(model.getSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("sourceVolumeBackupId")) {
                this.sourceVolumeBackupId(model.getSourceVolumeBackupId());
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
            if (model.wasPropertyExplicitlySet("uniqueSizeInGBs")) {
                this.uniqueSizeInGBs(model.getUniqueSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("uniqueSizeInMbs")) {
                this.uniqueSizeInMbs(model.getUniqueSizeInMbs());
            }
            if (model.wasPropertyExplicitlySet("volumeId")) {
                this.volumeId(model.getVolumeId());
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
     * The OCID of the compartment that contains the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the volume backup.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the volume backup will expire and be automatically deleted.
     * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that
     * were created automatically by a scheduled-backup policy. For manually created backups,
     * it will be absent, signifying that there is no expiration time and the backup will
     * last forever until manually deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationTime")
    private final java.util.Date expirationTime;

    /**
     * The date and time the volume backup will expire and be automatically deleted.
     * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that
     * were created automatically by a scheduled-backup policy. For manually created backups,
     * it will be absent, signifying that there is no expiration time and the backup will
     * last forever until manually deleted.
     *
     * @return the value
     **/
    public java.util.Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The OCID of the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the volume backup.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the Vault service key which is the master encryption key for the volume backup.
     * For more information about the Vault service and encryption keys, see
     * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Vault service key which is the master encryption key for the volume backup.
     * For more information about the Vault service and encryption keys, see
     * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The current state of a volume backup.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),
        RequestReceived("REQUEST_RECEIVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of a volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a volume backup.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The size of the volume, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The size of the volume, in GBs.
     *
     * @return the value
     **/
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    /**
     * The size of the volume in MBs. The value must be a multiple of 1024.
     * This field is deprecated. Please use sizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The size of the volume in MBs. The value must be a multiple of 1024.
     * This field is deprecated. Please use sizeInGBs.
     *
     * @return the value
     **/
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * Specifies whether the backup was created manually, or via scheduled backup policy.
     *
     **/
    public enum SourceType {
        Manual("MANUAL"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Specifies whether the backup was created manually, or via scheduled backup policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Specifies whether the backup was created manually, or via scheduled backup policy.
     *
     * @return the value
     **/
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * The OCID of the source volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeBackupId")
    private final String sourceVolumeBackupId;

    /**
     * The OCID of the source volume backup.
     * @return the value
     **/
    public String getSourceVolumeBackupId() {
        return sourceVolumeBackupId;
    }

    /**
     * The date and time the volume backup was created. This is the time the actual point-in-time image
     * of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the volume backup was created. This is the time the actual point-in-time image
     * of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequestReceived")
    private final java.util.Date timeRequestReceived;

    /**
     * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeRequestReceived() {
        return timeRequestReceived;
    }

    /**
     * The type of a volume backup.
     **/
    public enum Type {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The type of a volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of a volume backup.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space
     * consumed on the volume and whether the backup is full or incremental.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInGBs")
    private final Long uniqueSizeInGBs;

    /**
     * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space
     * consumed on the volume and whether the backup is full or incremental.
     *
     * @return the value
     **/
    public Long getUniqueSizeInGBs() {
        return uniqueSizeInGBs;
    }

    /**
     * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space
     * consumed on the volume and whether the backup is full or incremental.
     * This field is deprecated. Please use uniqueSizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueSizeInMbs")
    private final Long uniqueSizeInMbs;

    /**
     * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space
     * consumed on the volume and whether the backup is full or incremental.
     * This field is deprecated. Please use uniqueSizeInGBs.
     *
     * @return the value
     **/
    public Long getUniqueSizeInMbs() {
        return uniqueSizeInMbs;
    }

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    private final String volumeId;

    /**
     * The OCID of the volume.
     * @return the value
     **/
    public String getVolumeId() {
        return volumeId;
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
        sb.append("VolumeBackup(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", expirationTime=").append(String.valueOf(this.expirationTime));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", sourceVolumeBackupId=").append(String.valueOf(this.sourceVolumeBackupId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeRequestReceived=").append(String.valueOf(this.timeRequestReceived));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", uniqueSizeInGBs=").append(String.valueOf(this.uniqueSizeInGBs));
        sb.append(", uniqueSizeInMbs=").append(String.valueOf(this.uniqueSizeInMbs));
        sb.append(", volumeId=").append(String.valueOf(this.volumeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeBackup)) {
            return false;
        }

        VolumeBackup other = (VolumeBackup) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.expirationTime, other.expirationTime)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.sourceVolumeBackupId, other.sourceVolumeBackupId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeRequestReceived, other.timeRequestReceived)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.uniqueSizeInGBs, other.uniqueSizeInGBs)
                && java.util.Objects.equals(this.uniqueSizeInMbs, other.uniqueSizeInMbs)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationTime == null ? 43 : this.expirationTime.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVolumeBackupId == null
                                ? 43
                                : this.sourceVolumeBackupId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRequestReceived == null
                                ? 43
                                : this.timeRequestReceived.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.uniqueSizeInGBs == null ? 43 : this.uniqueSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.uniqueSizeInMbs == null ? 43 : this.uniqueSizeInMbs.hashCode());
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
