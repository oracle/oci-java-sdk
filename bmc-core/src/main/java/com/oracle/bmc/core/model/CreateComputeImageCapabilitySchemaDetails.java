/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Create Image Capability Schema for an image.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateComputeImageCapabilitySchemaDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateComputeImageCapabilitySchemaDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "computeGlobalImageCapabilitySchemaVersionName",
        "imageId",
        "freeformTags",
        "displayName",
        "definedTags",
        "schemaData"
    })
    public CreateComputeImageCapabilitySchemaDetails(
            String compartmentId,
            String computeGlobalImageCapabilitySchemaVersionName,
            String imageId,
            java.util.Map<String, String> freeformTags,
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData) {
        super();
        this.compartmentId = compartmentId;
        this.computeGlobalImageCapabilitySchemaVersionName =
                computeGlobalImageCapabilitySchemaVersionName;
        this.imageId = imageId;
        this.freeformTags = freeformTags;
        this.displayName = displayName;
        this.definedTags = definedTags;
        this.schemaData = schemaData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the resource.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the compute global image capability schema version
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "computeGlobalImageCapabilitySchemaVersionName")
        private String computeGlobalImageCapabilitySchemaVersionName;

        /**
         * The name of the compute global image capability schema version
         *
         * @param computeGlobalImageCapabilitySchemaVersionName the value to set
         * @return this builder
         **/
        public Builder computeGlobalImageCapabilitySchemaVersionName(
                String computeGlobalImageCapabilitySchemaVersionName) {
            this.computeGlobalImageCapabilitySchemaVersionName =
                    computeGlobalImageCapabilitySchemaVersionName;
            this.__explicitlySet__.add("computeGlobalImageCapabilitySchemaVersionName");
            return this;
        }
        /**
         * The ocid of the image
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The ocid of the image
         *
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
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
         * The map of each capability name to its ImageCapabilitySchemaDescriptor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
        private java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

        /**
         * The map of each capability name to its ImageCapabilitySchemaDescriptor.
         * @param schemaData the value to set
         * @return this builder
         **/
        public Builder schemaData(
                java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData) {
            this.schemaData = schemaData;
            this.__explicitlySet__.add("schemaData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeImageCapabilitySchemaDetails build() {
            CreateComputeImageCapabilitySchemaDetails model =
                    new CreateComputeImageCapabilitySchemaDetails(
                            this.compartmentId,
                            this.computeGlobalImageCapabilitySchemaVersionName,
                            this.imageId,
                            this.freeformTags,
                            this.displayName,
                            this.definedTags,
                            this.schemaData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateComputeImageCapabilitySchemaDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("computeGlobalImageCapabilitySchemaVersionName")) {
                this.computeGlobalImageCapabilitySchemaVersionName(
                        model.getComputeGlobalImageCapabilitySchemaVersionName());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("schemaData")) {
                this.schemaData(model.getSchemaData());
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
     * The OCID of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the resource.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the compute global image capability schema version
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaVersionName")
    private final String computeGlobalImageCapabilitySchemaVersionName;

    /**
     * The name of the compute global image capability schema version
     *
     * @return the value
     **/
    public String getComputeGlobalImageCapabilitySchemaVersionName() {
        return computeGlobalImageCapabilitySchemaVersionName;
    }

    /**
     * The ocid of the image
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The ocid of the image
     *
     * @return the value
     **/
    public String getImageId() {
        return imageId;
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
     * The map of each capability name to its ImageCapabilitySchemaDescriptor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
    private final java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

    /**
     * The map of each capability name to its ImageCapabilitySchemaDescriptor.
     * @return the value
     **/
    public java.util.Map<String, ImageCapabilitySchemaDescriptor> getSchemaData() {
        return schemaData;
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
        sb.append("CreateComputeImageCapabilitySchemaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeGlobalImageCapabilitySchemaVersionName=")
                .append(String.valueOf(this.computeGlobalImageCapabilitySchemaVersionName));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", schemaData=").append(String.valueOf(this.schemaData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeImageCapabilitySchemaDetails)) {
            return false;
        }

        CreateComputeImageCapabilitySchemaDetails other =
                (CreateComputeImageCapabilitySchemaDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.computeGlobalImageCapabilitySchemaVersionName,
                        other.computeGlobalImageCapabilitySchemaVersionName)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.schemaData, other.schemaData)
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
                        + (this.computeGlobalImageCapabilitySchemaVersionName == null
                                ? 43
                                : this.computeGlobalImageCapabilitySchemaVersionName.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.schemaData == null ? 43 : this.schemaData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
