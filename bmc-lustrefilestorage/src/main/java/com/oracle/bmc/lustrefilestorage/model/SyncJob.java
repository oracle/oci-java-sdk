/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * Details associated with sync job runs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SyncJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SyncJob extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "parentId",
        "jobType",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isOverwrite",
        "totalObjectsScanned",
        "objectsTransferred",
        "bytesTransferred",
        "skippedErrorCount",
        "timeStarted",
        "timeFinished",
        "lustreFileSystemPath",
        "objectStoragePath"
    })
    public SyncJob(
            String id,
            String parentId,
            JobType jobType,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isOverwrite,
            Long totalObjectsScanned,
            Long objectsTransferred,
            Long bytesTransferred,
            Long skippedErrorCount,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String lustreFileSystemPath,
            String objectStoragePath) {
        super();
        this.id = id;
        this.parentId = parentId;
        this.jobType = jobType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isOverwrite = isOverwrite;
        this.totalObjectsScanned = totalObjectsScanned;
        this.objectsTransferred = objectsTransferred;
        this.bytesTransferred = bytesTransferred;
        this.skippedErrorCount = skippedErrorCount;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.lustreFileSystemPath = lustreFileSystemPath;
        this.objectStoragePath = objectStoragePath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * sync job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * sync job.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Object Storage link.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Object Storage link.
         *
         * @param parentId the value to set
         * @return this builder
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /** The type of the sync job. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        /**
         * The type of the sync job.
         *
         * @param jobType the value to set
         * @return this builder
         */
        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }
        /** The current state of the sync job. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the sync job.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the sync job in more detail. For example,
         * can be used to provide actionable information for a resource in the Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the sync job in more detail. For example,
         * can be used to provide actionable information for a resource in the Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
         * The flag is an identifier to tell whether this specific job run has overwrite enabled. If
         * {@code isOverwrite} is false, the file to be imported or exported will be skipped if it
         * already exists. If {@code isOverwrite} is true, the file to be imported or exported will
         * be overwritten if it already exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
        private Boolean isOverwrite;

        /**
         * The flag is an identifier to tell whether this specific job run has overwrite enabled. If
         * {@code isOverwrite} is false, the file to be imported or exported will be skipped if it
         * already exists. If {@code isOverwrite} is true, the file to be imported or exported will
         * be overwritten if it already exists.
         *
         * @param isOverwrite the value to set
         * @return this builder
         */
        public Builder isOverwrite(Boolean isOverwrite) {
            this.isOverwrite = isOverwrite;
            this.__explicitlySet__.add("isOverwrite");
            return this;
        }
        /** Total object count for scanned files for import or export as part of this sync job. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
        private Long totalObjectsScanned;

        /**
         * Total object count for scanned files for import or export as part of this sync job.
         *
         * @param totalObjectsScanned the value to set
         * @return this builder
         */
        public Builder totalObjectsScanned(Long totalObjectsScanned) {
            this.totalObjectsScanned = totalObjectsScanned;
            this.__explicitlySet__.add("totalObjectsScanned");
            return this;
        }
        /** Count of total files that transferred successfully. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectsTransferred")
        private Long objectsTransferred;

        /**
         * Count of total files that transferred successfully.
         *
         * @param objectsTransferred the value to set
         * @return this builder
         */
        public Builder objectsTransferred(Long objectsTransferred) {
            this.objectsTransferred = objectsTransferred;
            this.__explicitlySet__.add("objectsTransferred");
            return this;
        }
        /**
         * Bytes transferred during the sync. This value changes while the sync is still in
         * progress.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bytesTransferred")
        private Long bytesTransferred;

        /**
         * Bytes transferred during the sync. This value changes while the sync is still in
         * progress.
         *
         * @param bytesTransferred the value to set
         * @return this builder
         */
        public Builder bytesTransferred(Long bytesTransferred) {
            this.bytesTransferred = bytesTransferred;
            this.__explicitlySet__.add("bytesTransferred");
            return this;
        }
        /** Count of files or objects that failed to export or import due to errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("skippedErrorCount")
        private Long skippedErrorCount;

        /**
         * Count of files or objects that failed to export or import due to errors.
         *
         * @param skippedErrorCount the value to set
         * @return this builder
         */
        public Builder skippedErrorCount(Long skippedErrorCount) {
            this.skippedErrorCount = skippedErrorCount;
            this.__explicitlySet__.add("skippedErrorCount");
            return this;
        }
        /**
         * The date and time the job was started, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2020-07-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the job was started, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2020-07-25T21:10:29.600Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the job finished, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2020-07-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the job finished, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2020-07-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The path in the Lustre file system used for this Object Storage link.
         *
         * <p>Example: {@code myFileSystem/mount/myDirectory}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lustreFileSystemPath")
        private String lustreFileSystemPath;

        /**
         * The path in the Lustre file system used for this Object Storage link.
         *
         * <p>Example: {@code myFileSystem/mount/myDirectory}
         *
         * @param lustreFileSystemPath the value to set
         * @return this builder
         */
        public Builder lustreFileSystemPath(String lustreFileSystemPath) {
            this.lustreFileSystemPath = lustreFileSystemPath;
            this.__explicitlySet__.add("lustreFileSystemPath");
            return this;
        }
        /**
         * The Object Storage namespace and bucket name, including optional object prefix string, to
         * use as the source for imports or destination for exports.
         *
         * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePath")
        private String objectStoragePath;

        /**
         * The Object Storage namespace and bucket name, including optional object prefix string, to
         * use as the source for imports or destination for exports.
         *
         * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
         *
         * @param objectStoragePath the value to set
         * @return this builder
         */
        public Builder objectStoragePath(String objectStoragePath) {
            this.objectStoragePath = objectStoragePath;
            this.__explicitlySet__.add("objectStoragePath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SyncJob build() {
            SyncJob model =
                    new SyncJob(
                            this.id,
                            this.parentId,
                            this.jobType,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isOverwrite,
                            this.totalObjectsScanned,
                            this.objectsTransferred,
                            this.bytesTransferred,
                            this.skippedErrorCount,
                            this.timeStarted,
                            this.timeFinished,
                            this.lustreFileSystemPath,
                            this.objectStoragePath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SyncJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("isOverwrite")) {
                this.isOverwrite(model.getIsOverwrite());
            }
            if (model.wasPropertyExplicitlySet("totalObjectsScanned")) {
                this.totalObjectsScanned(model.getTotalObjectsScanned());
            }
            if (model.wasPropertyExplicitlySet("objectsTransferred")) {
                this.objectsTransferred(model.getObjectsTransferred());
            }
            if (model.wasPropertyExplicitlySet("bytesTransferred")) {
                this.bytesTransferred(model.getBytesTransferred());
            }
            if (model.wasPropertyExplicitlySet("skippedErrorCount")) {
                this.skippedErrorCount(model.getSkippedErrorCount());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lustreFileSystemPath")) {
                this.lustreFileSystemPath(model.getLustreFileSystemPath());
            }
            if (model.wasPropertyExplicitlySet("objectStoragePath")) {
                this.objectStoragePath(model.getObjectStoragePath());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the sync
     * job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the sync
     * job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Object Storage link.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Object Storage link.
     *
     * @return the value
     */
    public String getParentId() {
        return parentId;
    }

    /** The type of the sync job. */
    public enum JobType implements com.oracle.bmc.http.internal.BmcEnum {
        Import("IMPORT"),
        Export("EXPORT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(JobType.class);

        private final String value;
        private static java.util.Map<String, JobType> map;

        static {
            map = new java.util.HashMap<>();
            for (JobType v : JobType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        JobType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static JobType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'JobType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the sync job. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    /**
     * The type of the sync job.
     *
     * @return the value
     */
    public JobType getJobType() {
        return jobType;
    }

    /** The current state of the sync job. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        Failed("FAILED"),
        Failing("FAILING"),

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
    /** The current state of the sync job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the sync job.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the sync job in more detail. For example, can
     * be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the sync job in more detail. For example, can
     * be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The flag is an identifier to tell whether this specific job run has overwrite enabled. If
     * {@code isOverwrite} is false, the file to be imported or exported will be skipped if it
     * already exists. If {@code isOverwrite} is true, the file to be imported or exported will be
     * overwritten if it already exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
    private final Boolean isOverwrite;

    /**
     * The flag is an identifier to tell whether this specific job run has overwrite enabled. If
     * {@code isOverwrite} is false, the file to be imported or exported will be skipped if it
     * already exists. If {@code isOverwrite} is true, the file to be imported or exported will be
     * overwritten if it already exists.
     *
     * @return the value
     */
    public Boolean getIsOverwrite() {
        return isOverwrite;
    }

    /** Total object count for scanned files for import or export as part of this sync job. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
    private final Long totalObjectsScanned;

    /**
     * Total object count for scanned files for import or export as part of this sync job.
     *
     * @return the value
     */
    public Long getTotalObjectsScanned() {
        return totalObjectsScanned;
    }

    /** Count of total files that transferred successfully. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectsTransferred")
    private final Long objectsTransferred;

    /**
     * Count of total files that transferred successfully.
     *
     * @return the value
     */
    public Long getObjectsTransferred() {
        return objectsTransferred;
    }

    /**
     * Bytes transferred during the sync. This value changes while the sync is still in progress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bytesTransferred")
    private final Long bytesTransferred;

    /**
     * Bytes transferred during the sync. This value changes while the sync is still in progress.
     *
     * @return the value
     */
    public Long getBytesTransferred() {
        return bytesTransferred;
    }

    /** Count of files or objects that failed to export or import due to errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("skippedErrorCount")
    private final Long skippedErrorCount;

    /**
     * Count of files or objects that failed to export or import due to errors.
     *
     * @return the value
     */
    public Long getSkippedErrorCount() {
        return skippedErrorCount;
    }

    /**
     * The date and time the job was started, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2020-07-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the job was started, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2020-07-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the job finished, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2020-07-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the job finished, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2020-07-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The path in the Lustre file system used for this Object Storage link.
     *
     * <p>Example: {@code myFileSystem/mount/myDirectory}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lustreFileSystemPath")
    private final String lustreFileSystemPath;

    /**
     * The path in the Lustre file system used for this Object Storage link.
     *
     * <p>Example: {@code myFileSystem/mount/myDirectory}
     *
     * @return the value
     */
    public String getLustreFileSystemPath() {
        return lustreFileSystemPath;
    }

    /**
     * The Object Storage namespace and bucket name, including optional object prefix string, to use
     * as the source for imports or destination for exports.
     *
     * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePath")
    private final String objectStoragePath;

    /**
     * The Object Storage namespace and bucket name, including optional object prefix string, to use
     * as the source for imports or destination for exports.
     *
     * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
     *
     * @return the value
     */
    public String getObjectStoragePath() {
        return objectStoragePath;
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
        sb.append("SyncJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(", totalObjectsScanned=").append(String.valueOf(this.totalObjectsScanned));
        sb.append(", objectsTransferred=").append(String.valueOf(this.objectsTransferred));
        sb.append(", bytesTransferred=").append(String.valueOf(this.bytesTransferred));
        sb.append(", skippedErrorCount=").append(String.valueOf(this.skippedErrorCount));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lustreFileSystemPath=").append(String.valueOf(this.lustreFileSystemPath));
        sb.append(", objectStoragePath=").append(String.valueOf(this.objectStoragePath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SyncJob)) {
            return false;
        }

        SyncJob other = (SyncJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
                && java.util.Objects.equals(this.totalObjectsScanned, other.totalObjectsScanned)
                && java.util.Objects.equals(this.objectsTransferred, other.objectsTransferred)
                && java.util.Objects.equals(this.bytesTransferred, other.bytesTransferred)
                && java.util.Objects.equals(this.skippedErrorCount, other.skippedErrorCount)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lustreFileSystemPath, other.lustreFileSystemPath)
                && java.util.Objects.equals(this.objectStoragePath, other.objectStoragePath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result =
                (result * PRIME)
                        + (this.totalObjectsScanned == null
                                ? 43
                                : this.totalObjectsScanned.hashCode());
        result =
                (result * PRIME)
                        + (this.objectsTransferred == null
                                ? 43
                                : this.objectsTransferred.hashCode());
        result =
                (result * PRIME)
                        + (this.bytesTransferred == null ? 43 : this.bytesTransferred.hashCode());
        result =
                (result * PRIME)
                        + (this.skippedErrorCount == null ? 43 : this.skippedErrorCount.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lustreFileSystemPath == null
                                ? 43
                                : this.lustreFileSystemPath.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStoragePath == null ? 43 : this.objectStoragePath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
