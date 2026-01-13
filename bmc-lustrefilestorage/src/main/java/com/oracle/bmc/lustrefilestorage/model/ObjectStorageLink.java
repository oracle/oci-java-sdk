/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * Object Storage links create the relationship between a directory in an File Storage with Lustre
 * file system and a path within an Object Storage bucket. For more information, see [Syncing Lustre
 * file systems with Object
 * Storage](https://docs.oracle.com/iaas/Content/lustre/object-storage-sync.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageLink.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageLink
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "availabilityDomain",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lustreFileSystemId",
        "fileSystemPath",
        "objectStoragePrefix",
        "currentJobId",
        "lastJobId",
        "isOverwrite"
    })
    public ObjectStorageLink(
            String id,
            String compartmentId,
            String availabilityDomain,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String lustreFileSystemId,
            String fileSystemPath,
            String objectStoragePrefix,
            String currentJobId,
            String lastJobId,
            Boolean isOverwrite) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lustreFileSystemId = lustreFileSystemId;
        this.fileSystemPath = fileSystemPath;
        this.objectStoragePrefix = objectStoragePrefix;
        this.currentJobId = currentJobId;
        this.lastJobId = lastJobId;
        this.isOverwrite = isOverwrite;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ObjectStorageLink.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ObjectStorageLink.
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
         * compartment that contains the Lustre file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Lustre file system.
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
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Object Storage Link}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Object Storage Link}
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
         * The date and time the Lustre file system was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Lustre file system was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
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
         * The date and time the Object Storage link was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Object Storage link was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Object Storage link. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Object Storage link.
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
         * A message that describes the current state of the Object Storage link in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the Object Storage link in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated Lustre file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lustreFileSystemId")
        private String lustreFileSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated Lustre file system.
         *
         * @param lustreFileSystemId the value to set
         * @return this builder
         */
        public Builder lustreFileSystemId(String lustreFileSystemId) {
            this.lustreFileSystemId = lustreFileSystemId;
            this.__explicitlySet__.add("lustreFileSystemId");
            return this;
        }
        /**
         * The path in the Lustre file system used for this Object Storage link.
         *
         * <p>Example: {@code myFileSystem/mount/myDirectory}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemPath")
        private String fileSystemPath;

        /**
         * The path in the Lustre file system used for this Object Storage link.
         *
         * <p>Example: {@code myFileSystem/mount/myDirectory}
         *
         * @param fileSystemPath the value to set
         * @return this builder
         */
        public Builder fileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            this.__explicitlySet__.add("fileSystemPath");
            return this;
        }
        /**
         * The Object Storage namespace and bucket name, including optional object prefix string, to
         * use as the source for imports or destination for exports.
         *
         * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefix")
        private String objectStoragePrefix;

        /**
         * The Object Storage namespace and bucket name, including optional object prefix string, to
         * use as the source for imports or destination for exports.
         *
         * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
         *
         * @param objectStoragePrefix the value to set
         * @return this builder
         */
        public Builder objectStoragePrefix(String objectStoragePrefix) {
            this.objectStoragePrefix = objectStoragePrefix;
            this.__explicitlySet__.add("objectStoragePrefix");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * currently running sync job. If no sync job is running, then this will be empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentJobId")
        private String currentJobId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * currently running sync job. If no sync job is running, then this will be empty.
         *
         * @param currentJobId the value to set
         * @return this builder
         */
        public Builder currentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            this.__explicitlySet__.add("currentJobId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of last
         * succeeded sync job. If no sync job has previously run, then this will be empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastJobId")
        private String lastJobId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of last
         * succeeded sync job. If no sync job has previously run, then this will be empty.
         *
         * @param lastJobId the value to set
         * @return this builder
         */
        public Builder lastJobId(String lastJobId) {
            this.lastJobId = lastJobId;
            this.__explicitlySet__.add("lastJobId");
            return this;
        }
        /**
         * The flag is an identifier to tell whether the job run has overwrite enabled. If {@code
         * isOverwrite} is false, the file to be imported or exported will be skipped if it already
         * exists. If {@code isOverwrite} is true, the file to be imported or exported will be
         * overwritten if it already exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
        private Boolean isOverwrite;

        /**
         * The flag is an identifier to tell whether the job run has overwrite enabled. If {@code
         * isOverwrite} is false, the file to be imported or exported will be skipped if it already
         * exists. If {@code isOverwrite} is true, the file to be imported or exported will be
         * overwritten if it already exists.
         *
         * @param isOverwrite the value to set
         * @return this builder
         */
        public Builder isOverwrite(Boolean isOverwrite) {
            this.isOverwrite = isOverwrite;
            this.__explicitlySet__.add("isOverwrite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageLink build() {
            ObjectStorageLink model =
                    new ObjectStorageLink(
                            this.id,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lustreFileSystemId,
                            this.fileSystemPath,
                            this.objectStoragePrefix,
                            this.currentJobId,
                            this.lastJobId,
                            this.isOverwrite);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageLink model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lustreFileSystemId")) {
                this.lustreFileSystemId(model.getLustreFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemPath")) {
                this.fileSystemPath(model.getFileSystemPath());
            }
            if (model.wasPropertyExplicitlySet("objectStoragePrefix")) {
                this.objectStoragePrefix(model.getObjectStoragePrefix());
            }
            if (model.wasPropertyExplicitlySet("currentJobId")) {
                this.currentJobId(model.getCurrentJobId());
            }
            if (model.wasPropertyExplicitlySet("lastJobId")) {
                this.lastJobId(model.getLastJobId());
            }
            if (model.wasPropertyExplicitlySet("isOverwrite")) {
                this.isOverwrite(model.getIsOverwrite());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ObjectStorageLink.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ObjectStorageLink.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Object Storage Link}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Object Storage Link}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the Lustre file system was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Lustre file system was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Object Storage link was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Object Storage link was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Object Storage link. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
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
    /** The current state of the Object Storage link. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Object Storage link.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the Object Storage link in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the Object Storage link in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated Lustre file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lustreFileSystemId")
    private final String lustreFileSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated Lustre file system.
     *
     * @return the value
     */
    public String getLustreFileSystemId() {
        return lustreFileSystemId;
    }

    /**
     * The path in the Lustre file system used for this Object Storage link.
     *
     * <p>Example: {@code myFileSystem/mount/myDirectory}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemPath")
    private final String fileSystemPath;

    /**
     * The path in the Lustre file system used for this Object Storage link.
     *
     * <p>Example: {@code myFileSystem/mount/myDirectory}
     *
     * @return the value
     */
    public String getFileSystemPath() {
        return fileSystemPath;
    }

    /**
     * The Object Storage namespace and bucket name, including optional object prefix string, to use
     * as the source for imports or destination for exports.
     *
     * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefix")
    private final String objectStoragePrefix;

    /**
     * The Object Storage namespace and bucket name, including optional object prefix string, to use
     * as the source for imports or destination for exports.
     *
     * <p>Example: {@code objectStorageNamespace:/bucketName/optionalFolder/optionalPrefix}
     *
     * @return the value
     */
    public String getObjectStoragePrefix() {
        return objectStoragePrefix;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * currently running sync job. If no sync job is running, then this will be empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentJobId")
    private final String currentJobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * currently running sync job. If no sync job is running, then this will be empty.
     *
     * @return the value
     */
    public String getCurrentJobId() {
        return currentJobId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of last
     * succeeded sync job. If no sync job has previously run, then this will be empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobId")
    private final String lastJobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of last
     * succeeded sync job. If no sync job has previously run, then this will be empty.
     *
     * @return the value
     */
    public String getLastJobId() {
        return lastJobId;
    }

    /**
     * The flag is an identifier to tell whether the job run has overwrite enabled. If {@code
     * isOverwrite} is false, the file to be imported or exported will be skipped if it already
     * exists. If {@code isOverwrite} is true, the file to be imported or exported will be
     * overwritten if it already exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
    private final Boolean isOverwrite;

    /**
     * The flag is an identifier to tell whether the job run has overwrite enabled. If {@code
     * isOverwrite} is false, the file to be imported or exported will be skipped if it already
     * exists. If {@code isOverwrite} is true, the file to be imported or exported will be
     * overwritten if it already exists.
     *
     * @return the value
     */
    public Boolean getIsOverwrite() {
        return isOverwrite;
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
        sb.append("ObjectStorageLink(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lustreFileSystemId=").append(String.valueOf(this.lustreFileSystemId));
        sb.append(", fileSystemPath=").append(String.valueOf(this.fileSystemPath));
        sb.append(", objectStoragePrefix=").append(String.valueOf(this.objectStoragePrefix));
        sb.append(", currentJobId=").append(String.valueOf(this.currentJobId));
        sb.append(", lastJobId=").append(String.valueOf(this.lastJobId));
        sb.append(", isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageLink)) {
            return false;
        }

        ObjectStorageLink other = (ObjectStorageLink) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lustreFileSystemId, other.lustreFileSystemId)
                && java.util.Objects.equals(this.fileSystemPath, other.fileSystemPath)
                && java.util.Objects.equals(this.objectStoragePrefix, other.objectStoragePrefix)
                && java.util.Objects.equals(this.currentJobId, other.currentJobId)
                && java.util.Objects.equals(this.lastJobId, other.lastJobId)
                && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lustreFileSystemId == null
                                ? 43
                                : this.lustreFileSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemPath == null ? 43 : this.fileSystemPath.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStoragePrefix == null
                                ? 43
                                : this.objectStoragePrefix.hashCode());
        result = (result * PRIME) + (this.currentJobId == null ? 43 : this.currentJobId.hashCode());
        result = (result * PRIME) + (this.lastJobId == null ? 43 : this.lastJobId.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
