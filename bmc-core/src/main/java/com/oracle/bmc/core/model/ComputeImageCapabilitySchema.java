/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Image Capability Schema is a set of capabilities that filter the compute global
 * capability schema version for an image. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeImageCapabilitySchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeImageCapabilitySchema
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "computeGlobalImageCapabilitySchemaId",
        "computeGlobalImageCapabilitySchemaVersionName",
        "imageId",
        "definedTags",
        "displayName",
        "freeformTags",
        "schemaData",
        "timeCreated"
    })
    public ComputeImageCapabilitySchema(
            String id,
            String compartmentId,
            String computeGlobalImageCapabilitySchemaId,
            String computeGlobalImageCapabilitySchemaVersionName,
            String imageId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.computeGlobalImageCapabilitySchemaId = computeGlobalImageCapabilitySchemaId;
        this.computeGlobalImageCapabilitySchemaVersionName =
                computeGlobalImageCapabilitySchemaVersionName;
        this.imageId = imageId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.schemaData = schemaData;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The id of the compute global image capability schema version */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the compute global image capability schema version
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The ocid of the compute global image capability schema */
        @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaId")
        private String computeGlobalImageCapabilitySchemaId;

        /**
         * The ocid of the compute global image capability schema
         *
         * @param computeGlobalImageCapabilitySchemaId the value to set
         * @return this builder
         */
        public Builder computeGlobalImageCapabilitySchemaId(
                String computeGlobalImageCapabilitySchemaId) {
            this.computeGlobalImageCapabilitySchemaId = computeGlobalImageCapabilitySchemaId;
            this.__explicitlySet__.add("computeGlobalImageCapabilitySchemaId");
            return this;
        }
        /** The name of the compute global image capability schema version */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "computeGlobalImageCapabilitySchemaVersionName")
        private String computeGlobalImageCapabilitySchemaVersionName;

        /**
         * The name of the compute global image capability schema version
         *
         * @param computeGlobalImageCapabilitySchemaVersionName the value to set
         * @return this builder
         */
        public Builder computeGlobalImageCapabilitySchemaVersionName(
                String computeGlobalImageCapabilitySchemaVersionName) {
            this.computeGlobalImageCapabilitySchemaVersionName =
                    computeGlobalImageCapabilitySchemaVersionName;
            this.__explicitlySet__.add("computeGlobalImageCapabilitySchemaVersionName");
            return this;
        }
        /** The OCID of the image associated with this compute image capability schema */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the image associated with this compute image capability schema
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
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
        /** The map of each capability name to its ImageCapabilityDescriptor. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
        private java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

        /**
         * The map of each capability name to its ImageCapabilityDescriptor.
         *
         * @param schemaData the value to set
         * @return this builder
         */
        public Builder schemaData(
                java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData) {
            this.schemaData = schemaData;
            this.__explicitlySet__.add("schemaData");
            return this;
        }
        /**
         * The date and time the compute image capability schema was created, in the format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the compute image capability schema was created, in the format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeImageCapabilitySchema build() {
            ComputeImageCapabilitySchema model =
                    new ComputeImageCapabilitySchema(
                            this.id,
                            this.compartmentId,
                            this.computeGlobalImageCapabilitySchemaId,
                            this.computeGlobalImageCapabilitySchemaVersionName,
                            this.imageId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.schemaData,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeImageCapabilitySchema model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("computeGlobalImageCapabilitySchemaId")) {
                this.computeGlobalImageCapabilitySchemaId(
                        model.getComputeGlobalImageCapabilitySchemaId());
            }
            if (model.wasPropertyExplicitlySet("computeGlobalImageCapabilitySchemaVersionName")) {
                this.computeGlobalImageCapabilitySchemaVersionName(
                        model.getComputeGlobalImageCapabilitySchemaVersionName());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("schemaData")) {
                this.schemaData(model.getSchemaData());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The id of the compute global image capability schema version */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the compute global image capability schema version
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The ocid of the compute global image capability schema */
    @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaId")
    private final String computeGlobalImageCapabilitySchemaId;

    /**
     * The ocid of the compute global image capability schema
     *
     * @return the value
     */
    public String getComputeGlobalImageCapabilitySchemaId() {
        return computeGlobalImageCapabilitySchemaId;
    }

    /** The name of the compute global image capability schema version */
    @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaVersionName")
    private final String computeGlobalImageCapabilitySchemaVersionName;

    /**
     * The name of the compute global image capability schema version
     *
     * @return the value
     */
    public String getComputeGlobalImageCapabilitySchemaVersionName() {
        return computeGlobalImageCapabilitySchemaVersionName;
    }

    /** The OCID of the image associated with this compute image capability schema */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the image associated with this compute image capability schema
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
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

    /** The map of each capability name to its ImageCapabilityDescriptor. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaData")
    private final java.util.Map<String, ImageCapabilitySchemaDescriptor> schemaData;

    /**
     * The map of each capability name to its ImageCapabilityDescriptor.
     *
     * @return the value
     */
    public java.util.Map<String, ImageCapabilitySchemaDescriptor> getSchemaData() {
        return schemaData;
    }

    /**
     * The date and time the compute image capability schema was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the compute image capability schema was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ComputeImageCapabilitySchema(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeGlobalImageCapabilitySchemaId=")
                .append(String.valueOf(this.computeGlobalImageCapabilitySchemaId));
        sb.append(", computeGlobalImageCapabilitySchemaVersionName=")
                .append(String.valueOf(this.computeGlobalImageCapabilitySchemaVersionName));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", schemaData=").append(String.valueOf(this.schemaData));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeImageCapabilitySchema)) {
            return false;
        }

        ComputeImageCapabilitySchema other = (ComputeImageCapabilitySchema) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.computeGlobalImageCapabilitySchemaId,
                        other.computeGlobalImageCapabilitySchemaId)
                && java.util.Objects.equals(
                        this.computeGlobalImageCapabilitySchemaVersionName,
                        other.computeGlobalImageCapabilitySchemaVersionName)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.schemaData, other.schemaData)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
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
                        + (this.computeGlobalImageCapabilitySchemaId == null
                                ? 43
                                : this.computeGlobalImageCapabilitySchemaId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeGlobalImageCapabilitySchemaVersionName == null
                                ? 43
                                : this.computeGlobalImageCapabilitySchemaVersionName.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.schemaData == null ? 43 : this.schemaData.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
