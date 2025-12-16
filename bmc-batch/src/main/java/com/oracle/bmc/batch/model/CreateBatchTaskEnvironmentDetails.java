/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * The data to create a batch task environment. If the value for a collection is absent or is
 * explicitly provided as null, it will be converted to an empty value, i.e. "[]" or "{}" in json
 * notation. This applies to nested collections as well. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBatchTaskEnvironmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBatchTaskEnvironmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "imageUrl",
        "securityContext",
        "workingDirectory",
        "volumes",
        "definedTags",
        "freeformTags"
    })
    public CreateBatchTaskEnvironmentDetails(
            String compartmentId,
            String displayName,
            String description,
            String imageUrl,
            SecurityContext securityContext,
            String workingDirectory,
            java.util.List<BatchTaskEnvironmentVolume> volumes,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.securityContext = securityContext;
        this.workingDirectory = workingDirectory;
        this.volumes = volumes;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
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
         * A user-friendly name. Does not have to be unique, and it's changeable. If not specified
         * or provided as null or empty string, it be generated as "<resourceType><timeCreated>",
         * where timeCreated corresponds with the resource creation time in ISO 8601 basic format,
         * i.e. omitting separating punctuation, at second-level precision and no UTC offset.
         * Example: batchtaskenvironment20250914115623.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. If not specified
         * or provided as null or empty string, it be generated as "<resourceType><timeCreated>",
         * where timeCreated corresponds with the resource creation time in ISO 8601 basic format,
         * i.e. omitting separating punctuation, at second-level precision and no UTC offset.
         * Example: batchtaskenvironment20250914115623.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The batch task environment description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The batch task environment description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The URL of the ocir image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
        private String imageUrl;

        /**
         * The URL of the ocir image.
         *
         * @param imageUrl the value to set
         * @return this builder
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            this.__explicitlySet__.add("imageUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
        private SecurityContext securityContext;

        public Builder securityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            this.__explicitlySet__.add("securityContext");
            return this;
        }
        /** Container's working directory. */
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        /**
         * Container's working directory.
         *
         * @param workingDirectory the value to set
         * @return this builder
         */
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * List of volumes attached to the image. The use cases of the volumes are but not limited
         * to: read the input of the task and write the output.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("volumes")
        private java.util.List<BatchTaskEnvironmentVolume> volumes;

        /**
         * List of volumes attached to the image. The use cases of the volumes are but not limited
         * to: read the input of the task and write the output.
         *
         * @param volumes the value to set
         * @return this builder
         */
        public Builder volumes(java.util.List<BatchTaskEnvironmentVolume> volumes) {
            this.volumes = volumes;
            this.__explicitlySet__.add("volumes");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBatchTaskEnvironmentDetails build() {
            CreateBatchTaskEnvironmentDetails model =
                    new CreateBatchTaskEnvironmentDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.imageUrl,
                            this.securityContext,
                            this.workingDirectory,
                            this.volumes,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBatchTaskEnvironmentDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("imageUrl")) {
                this.imageUrl(model.getImageUrl());
            }
            if (model.wasPropertyExplicitlySet("securityContext")) {
                this.securityContext(model.getSecurityContext());
            }
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("volumes")) {
                this.volumes(model.getVolumes());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. If not specified or
     * provided as null or empty string, it be generated as "<resourceType><timeCreated>", where
     * timeCreated corresponds with the resource creation time in ISO 8601 basic format, i.e.
     * omitting separating punctuation, at second-level precision and no UTC offset. Example:
     * batchtaskenvironment20250914115623.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. If not specified or
     * provided as null or empty string, it be generated as "<resourceType><timeCreated>", where
     * timeCreated corresponds with the resource creation time in ISO 8601 basic format, i.e.
     * omitting separating punctuation, at second-level precision and no UTC offset. Example:
     * batchtaskenvironment20250914115623.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The batch task environment description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The batch task environment description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The URL of the ocir image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * The URL of the ocir image.
     *
     * @return the value
     */
    public String getImageUrl() {
        return imageUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    private final SecurityContext securityContext;

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /** Container's working directory. */
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * Container's working directory.
     *
     * @return the value
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * List of volumes attached to the image. The use cases of the volumes are but not limited to:
     * read the input of the task and write the output.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    private final java.util.List<BatchTaskEnvironmentVolume> volumes;

    /**
     * List of volumes attached to the image. The use cases of the volumes are but not limited to:
     * read the input of the task and write the output.
     *
     * @return the value
     */
    public java.util.List<BatchTaskEnvironmentVolume> getVolumes() {
        return volumes;
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
        sb.append("CreateBatchTaskEnvironmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", imageUrl=").append(String.valueOf(this.imageUrl));
        sb.append(", securityContext=").append(String.valueOf(this.securityContext));
        sb.append(", workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(", volumes=").append(String.valueOf(this.volumes));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBatchTaskEnvironmentDetails)) {
            return false;
        }

        CreateBatchTaskEnvironmentDetails other = (CreateBatchTaskEnvironmentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.imageUrl, other.imageUrl)
                && java.util.Objects.equals(this.securityContext, other.securityContext)
                && java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && java.util.Objects.equals(this.volumes, other.volumes)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.imageUrl == null ? 43 : this.imageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.securityContext == null ? 43 : this.securityContext.hashCode());
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        result = (result * PRIME) + (this.volumes == null ? 43 : this.volumes.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
