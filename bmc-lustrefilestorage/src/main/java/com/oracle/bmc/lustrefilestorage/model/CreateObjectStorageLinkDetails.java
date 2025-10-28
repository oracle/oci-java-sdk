/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * The details to create a Object Storage link. <br>
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
        builder = CreateObjectStorageLinkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateObjectStorageLinkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "availabilityDomain",
        "displayName",
        "freeformTags",
        "definedTags",
        "lustreFileSystemId",
        "fileSystemPath",
        "objectStoragePrefix",
        "isOverwrite"
    })
    public CreateObjectStorageLinkDetails(
            String compartmentId,
            String availabilityDomain,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String lustreFileSystemId,
            String fileSystemPath,
            String objectStoragePrefix,
            Boolean isOverwrite) {
        super();
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lustreFileSystemId = lustreFileSystemId;
        this.fileSystemPath = fileSystemPath;
        this.objectStoragePrefix = objectStoragePrefix;
        this.isOverwrite = isOverwrite;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Object Storage link.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Object Storage link.
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
         * The availability domain that the Lustre file system is in. May be unset as a blank or
         * NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain that the Lustre file system is in. May be unset as a blank or
         * NULL value.
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

        public CreateObjectStorageLinkDetails build() {
            CreateObjectStorageLinkDetails model =
                    new CreateObjectStorageLinkDetails(
                            this.compartmentId,
                            this.availabilityDomain,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.lustreFileSystemId,
                            this.fileSystemPath,
                            this.objectStoragePrefix,
                            this.isOverwrite);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateObjectStorageLinkDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * compartment that contains the Object Storage link.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Object Storage link.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The availability domain that the Lustre file system is in. May be unset as a blank or NULL
     * value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain that the Lustre file system is in. May be unset as a blank or NULL
     * value.
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
        sb.append("CreateObjectStorageLinkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lustreFileSystemId=").append(String.valueOf(this.lustreFileSystemId));
        sb.append(", fileSystemPath=").append(String.valueOf(this.fileSystemPath));
        sb.append(", objectStoragePrefix=").append(String.valueOf(this.objectStoragePrefix));
        sb.append(", isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateObjectStorageLinkDetails)) {
            return false;
        }

        CreateObjectStorageLinkDetails other = (CreateObjectStorageLinkDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lustreFileSystemId, other.lustreFileSystemId)
                && java.util.Objects.equals(this.fileSystemPath, other.fileSystemPath)
                && java.util.Objects.equals(this.objectStoragePrefix, other.objectStoragePrefix)
                && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
