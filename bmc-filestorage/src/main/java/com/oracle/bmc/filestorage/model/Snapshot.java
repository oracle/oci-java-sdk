/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * A point-in-time snapshot of a specified file system.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Snapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Snapshot extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fileSystemId",
        "id",
        "lifecycleState",
        "name",
        "timeCreated",
        "snapshotType",
        "snapshotTime",
        "provenanceId",
        "isCloneSource",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public Snapshot(
            String fileSystemId,
            String id,
            LifecycleState lifecycleState,
            String name,
            java.util.Date timeCreated,
            SnapshotType snapshotType,
            java.util.Date snapshotTime,
            String provenanceId,
            Boolean isCloneSource,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.timeCreated = timeCreated;
        this.snapshotType = snapshotType;
        this.snapshotTime = snapshotTime;
        this.provenanceId = provenanceId;
        this.isCloneSource = isCloneSource;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system from which the snapshot
         * was created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system from which the snapshot
         * was created.
         *
         * @param fileSystemId the value to set
         * @return this builder
         **/
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the snapshot.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of the snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the snapshot.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Name of the snapshot. This value is immutable.
         * <p>
         * Avoid entering confidential information.
         * <p>
         * Example: {@code Sunday}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the snapshot. This value is immutable.
         * <p>
         * Avoid entering confidential information.
         * <p>
         * Example: {@code Sunday}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The date and time the snapshot was created, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the snapshot was created, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * Specifies generation type of the snapshot.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotType")
        private SnapshotType snapshotType;

        /**
         * Specifies generation type of the snapshot.
         *
         * @param snapshotType the value to set
         * @return this builder
         **/
        public Builder snapshotType(SnapshotType snapshotType) {
            this.snapshotType = snapshotType;
            this.__explicitlySet__.add("snapshotType");
            return this;
        }
        /**
         * The date and time the snapshot was taken, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * This value might be the same or different from {@code timeCreated} depending
         * on the following factors:
         * - If the snapshot is created in the original file system directory.
         * - If the snapshot is cloned from a file system.
         * - If the snapshot is replicated from a file system.
         * <p>
         * Example: {@code 2020-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotTime")
        private java.util.Date snapshotTime;

        /**
         * The date and time the snapshot was taken, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * This value might be the same or different from {@code timeCreated} depending
         * on the following factors:
         * - If the snapshot is created in the original file system directory.
         * - If the snapshot is cloned from a file system.
         * - If the snapshot is replicated from a file system.
         * <p>
         * Example: {@code 2020-08-25T21:10:29.600Z}
         *
         * @param snapshotTime the value to set
         * @return this builder
         **/
        public Builder snapshotTime(java.util.Date snapshotTime) {
            this.snapshotTime = snapshotTime;
            this.__explicitlySet__.add("snapshotTime");
            return this;
        }
        /**
         * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) identifying the parent from which this snapshot was cloned.
         * If this snapshot was not cloned, then the {@code provenanceId} is the same as the snapshot {@code id} value.
         * If this snapshot was cloned, then the {@code provenanceId} value is the parent's {@code provenanceId}.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("provenanceId")
        private String provenanceId;

        /**
         * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) identifying the parent from which this snapshot was cloned.
         * If this snapshot was not cloned, then the {@code provenanceId} is the same as the snapshot {@code id} value.
         * If this snapshot was cloned, then the {@code provenanceId} value is the parent's {@code provenanceId}.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         *
         * @param provenanceId the value to set
         * @return this builder
         **/
        public Builder provenanceId(String provenanceId) {
            this.provenanceId = provenanceId;
            this.__explicitlySet__.add("provenanceId");
            return this;
        }
        /**
         * Specifies whether the snapshot has been cloned.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCloneSource")
        private Boolean isCloneSource;

        /**
         * Specifies whether the snapshot has been cloned.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         *
         * @param isCloneSource the value to set
         * @return this builder
         **/
        public Builder isCloneSource(Boolean isCloneSource) {
            this.isCloneSource = isCloneSource;
            this.__explicitlySet__.add("isCloneSource");
            return this;
        }
        /**
         * Additional information about the current {@code lifecycleState}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current {@code lifecycleState}.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         *  with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         *  with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        public Snapshot build() {
            Snapshot model =
                    new Snapshot(
                            this.fileSystemId,
                            this.id,
                            this.lifecycleState,
                            this.name,
                            this.timeCreated,
                            this.snapshotType,
                            this.snapshotTime,
                            this.provenanceId,
                            this.isCloneSource,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Snapshot model) {
            if (model.wasPropertyExplicitlySet("fileSystemId")) {
                this.fileSystemId(model.getFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("snapshotType")) {
                this.snapshotType(model.getSnapshotType());
            }
            if (model.wasPropertyExplicitlySet("snapshotTime")) {
                this.snapshotTime(model.getSnapshotTime());
            }
            if (model.wasPropertyExplicitlySet("provenanceId")) {
                this.provenanceId(model.getProvenanceId());
            }
            if (model.wasPropertyExplicitlySet("isCloneSource")) {
                this.isCloneSource(model.getIsCloneSource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system from which the snapshot
     * was created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    private final String fileSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system from which the snapshot
     * was created.
     *
     * @return the value
     **/
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the snapshot.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of the snapshot.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
     * The current state of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the snapshot.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Name of the snapshot. This value is immutable.
     * <p>
     * Avoid entering confidential information.
     * <p>
     * Example: {@code Sunday}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the snapshot. This value is immutable.
     * <p>
     * Avoid entering confidential information.
     * <p>
     * Example: {@code Sunday}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The date and time the snapshot was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the snapshot was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Specifies generation type of the snapshot.
     *
     **/
    public enum SnapshotType {
        User("USER"),
        PolicyBased("POLICY_BASED"),
        Replication("REPLICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SnapshotType.class);

        private final String value;
        private static java.util.Map<String, SnapshotType> map;

        static {
            map = new java.util.HashMap<>();
            for (SnapshotType v : SnapshotType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SnapshotType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SnapshotType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SnapshotType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies generation type of the snapshot.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotType")
    private final SnapshotType snapshotType;

    /**
     * Specifies generation type of the snapshot.
     *
     * @return the value
     **/
    public SnapshotType getSnapshotType() {
        return snapshotType;
    }

    /**
     * The date and time the snapshot was taken, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * This value might be the same or different from {@code timeCreated} depending
     * on the following factors:
     * - If the snapshot is created in the original file system directory.
     * - If the snapshot is cloned from a file system.
     * - If the snapshot is replicated from a file system.
     * <p>
     * Example: {@code 2020-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotTime")
    private final java.util.Date snapshotTime;

    /**
     * The date and time the snapshot was taken, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * This value might be the same or different from {@code timeCreated} depending
     * on the following factors:
     * - If the snapshot is created in the original file system directory.
     * - If the snapshot is cloned from a file system.
     * - If the snapshot is replicated from a file system.
     * <p>
     * Example: {@code 2020-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getSnapshotTime() {
        return snapshotTime;
    }

    /**
     * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) identifying the parent from which this snapshot was cloned.
     * If this snapshot was not cloned, then the {@code provenanceId} is the same as the snapshot {@code id} value.
     * If this snapshot was cloned, then the {@code provenanceId} value is the parent's {@code provenanceId}.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provenanceId")
    private final String provenanceId;

    /**
     * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) identifying the parent from which this snapshot was cloned.
     * If this snapshot was not cloned, then the {@code provenanceId} is the same as the snapshot {@code id} value.
     * If this snapshot was cloned, then the {@code provenanceId} value is the parent's {@code provenanceId}.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     *
     * @return the value
     **/
    public String getProvenanceId() {
        return provenanceId;
    }

    /**
     * Specifies whether the snapshot has been cloned.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloneSource")
    private final Boolean isCloneSource;

    /**
     * Specifies whether the snapshot has been cloned.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     *
     * @return the value
     **/
    public Boolean getIsCloneSource() {
        return isCloneSource;
    }

    /**
     * Additional information about the current {@code lifecycleState}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current {@code lifecycleState}.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     *  with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     *  with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("Snapshot(");
        sb.append("super=").append(super.toString());
        sb.append("fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", snapshotType=").append(String.valueOf(this.snapshotType));
        sb.append(", snapshotTime=").append(String.valueOf(this.snapshotTime));
        sb.append(", provenanceId=").append(String.valueOf(this.provenanceId));
        sb.append(", isCloneSource=").append(String.valueOf(this.isCloneSource));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof Snapshot)) {
            return false;
        }

        Snapshot other = (Snapshot) o;
        return java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.snapshotType, other.snapshotType)
                && java.util.Objects.equals(this.snapshotTime, other.snapshotTime)
                && java.util.Objects.equals(this.provenanceId, other.provenanceId)
                && java.util.Objects.equals(this.isCloneSource, other.isCloneSource)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.snapshotType == null ? 43 : this.snapshotType.hashCode());
        result = (result * PRIME) + (this.snapshotTime == null ? 43 : this.snapshotTime.hashCode());
        result = (result * PRIME) + (this.provenanceId == null ? 43 : this.provenanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCloneSource == null ? 43 : this.isCloneSource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
