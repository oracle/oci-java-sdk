/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for a file system.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FileSystemSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileSystemSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "meteredBytes",
        "compartmentId",
        "displayName",
        "id",
        "lifecycleState",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "kmsKeyId",
        "sourceDetails",
        "isCloneParent",
        "isHydrated",
        "lifecycleDetails"
    })
    public FileSystemSummary(
            String availabilityDomain,
            Long meteredBytes,
            String compartmentId,
            String displayName,
            String id,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String kmsKeyId,
            SourceDetails sourceDetails,
            Boolean isCloneParent,
            Boolean isHydrated,
            String lifecycleDetails) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.meteredBytes = meteredBytes;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.kmsKeyId = kmsKeyId;
        this.sourceDetails = sourceDetails;
        this.isCloneParent = isCloneParent;
        this.isHydrated = isHydrated;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain the file system is in. May be unset
         * as a blank or NULL value.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the file system is in. May be unset
         * as a blank or NULL value.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The number of bytes consumed by the file system, including
         * any snapshots. This number reflects the metered size of the file
         * system and is updated asynchronously with respect to
         * updates to the file system.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meteredBytes")
        private Long meteredBytes;

        /**
         * The number of bytes consumed by the file system, including
         * any snapshots. This number reflects the metered size of the file
         * system and is updated asynchronously with respect to
         * updates to the file system.
         *
         * @param meteredBytes the value to set
         * @return this builder
         **/
        public Builder meteredBytes(Long meteredBytes) {
            this.meteredBytes = meteredBytes;
            this.__explicitlySet__.add("meteredBytes");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that contains the file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that contains the file system.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My file system}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My file system}
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of the file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the file system.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the file system was created, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the file system was created, expressed
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key used to encrypt the encryption keys associated with this file system.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key used to encrypt the encryption keys associated with this file system.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private SourceDetails sourceDetails;

        public Builder sourceDetails(SourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * Specifies whether the file system has been cloned.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCloneParent")
        private Boolean isCloneParent;

        /**
         * Specifies whether the file system has been cloned.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm).
         *
         * @param isCloneParent the value to set
         * @return this builder
         **/
        public Builder isCloneParent(Boolean isCloneParent) {
            this.isCloneParent = isCloneParent;
            this.__explicitlySet__.add("isCloneParent");
            return this;
        }
        /**
         * Specifies whether the data has finished copying from the source to the clone.
         * Hydration can take up to several hours to complete depending on the size of the source.
         * The source and clone remain available during hydration, but there may be some performance impact.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm#hydration).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
        private Boolean isHydrated;

        /**
         * Specifies whether the data has finished copying from the source to the clone.
         * Hydration can take up to several hours to complete depending on the size of the source.
         * The source and clone remain available during hydration, but there may be some performance impact.
         * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm#hydration).
         *
         * @param isHydrated the value to set
         * @return this builder
         **/
        public Builder isHydrated(Boolean isHydrated) {
            this.isHydrated = isHydrated;
            this.__explicitlySet__.add("isHydrated");
            return this;
        }
        /**
         * Additional information about the current 'lifecycleState'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current 'lifecycleState'.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileSystemSummary build() {
            FileSystemSummary __instance__ =
                    new FileSystemSummary(
                            availabilityDomain,
                            meteredBytes,
                            compartmentId,
                            displayName,
                            id,
                            lifecycleState,
                            timeCreated,
                            freeformTags,
                            definedTags,
                            kmsKeyId,
                            sourceDetails,
                            isCloneParent,
                            isHydrated,
                            lifecycleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileSystemSummary o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .meteredBytes(o.getMeteredBytes())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .sourceDetails(o.getSourceDetails())
                            .isCloneParent(o.getIsCloneParent())
                            .isHydrated(o.getIsHydrated())
                            .lifecycleDetails(o.getLifecycleDetails());

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
     * The availability domain the file system is in. May be unset
     * as a blank or NULL value.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the file system is in. May be unset
     * as a blank or NULL value.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The number of bytes consumed by the file system, including
     * any snapshots. This number reflects the metered size of the file
     * system and is updated asynchronously with respect to
     * updates to the file system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meteredBytes")
    private final Long meteredBytes;

    /**
     * The number of bytes consumed by the file system, including
     * any snapshots. This number reflects the metered size of the file
     * system and is updated asynchronously with respect to
     * updates to the file system.
     *
     * @return the value
     **/
    public Long getMeteredBytes() {
        return meteredBytes;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that contains the file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that contains the file system.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My file system}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My file system}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the file system.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of the file system.
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
     * The current state of the file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the file system.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the file system was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the file system was created, expressed
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key used to encrypt the encryption keys associated with this file system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key used to encrypt the encryption keys associated with this file system.
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final SourceDetails sourceDetails;

    public SourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * Specifies whether the file system has been cloned.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloneParent")
    private final Boolean isCloneParent;

    /**
     * Specifies whether the file system has been cloned.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm).
     *
     * @return the value
     **/
    public Boolean getIsCloneParent() {
        return isCloneParent;
    }

    /**
     * Specifies whether the data has finished copying from the source to the clone.
     * Hydration can take up to several hours to complete depending on the size of the source.
     * The source and clone remain available during hydration, but there may be some performance impact.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm#hydration).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
    private final Boolean isHydrated;

    /**
     * Specifies whether the data has finished copying from the source to the clone.
     * Hydration can take up to several hours to complete depending on the size of the source.
     * The source and clone remain available during hydration, but there may be some performance impact.
     * See [Cloning a File System](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/cloningafilesystem.htm#hydration).
     *
     * @return the value
     **/
    public Boolean getIsHydrated() {
        return isHydrated;
    }

    /**
     * Additional information about the current 'lifecycleState'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current 'lifecycleState'.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("FileSystemSummary(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", meteredBytes=").append(String.valueOf(this.meteredBytes));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", isCloneParent=").append(String.valueOf(this.isCloneParent));
        sb.append(", isHydrated=").append(String.valueOf(this.isHydrated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileSystemSummary)) {
            return false;
        }

        FileSystemSummary other = (FileSystemSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.meteredBytes, other.meteredBytes)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.isCloneParent, other.isCloneParent)
                && java.util.Objects.equals(this.isHydrated, other.isHydrated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.meteredBytes == null ? 43 : this.meteredBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isCloneParent == null ? 43 : this.isCloneParent.hashCode());
        result = (result * PRIME) + (this.isHydrated == null ? 43 : this.isHydrated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
