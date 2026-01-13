/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The data to create a dedicated AI cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDedicatedAiClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDedicatedAiClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "type",
        "compartmentId",
        "unitCount",
        "unitShape",
        "freeformTags",
        "definedTags"
    })
    public CreateDedicatedAiClusterDetails(
            String displayName,
            String description,
            DedicatedAiCluster.Type type,
            String compartmentId,
            Integer unitCount,
            DedicatedAiCluster.UnitShape unitShape,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.compartmentId = compartmentId;
        this.unitCount = unitCount;
        this.unitShape = unitShape;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user-friendly name. Does not have to be unique, and it's changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An optional description of the dedicated AI cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the dedicated AI cluster.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor
         * or hosting/inference processor.
         *
         * <p>Allowed values are: - HOSTING - FINE_TUNING
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DedicatedAiCluster.Type type;

        /**
         * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor
         * or hosting/inference processor.
         *
         * <p>Allowed values are: - HOSTING - FINE_TUNING
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DedicatedAiCluster.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The compartment OCID to create the dedicated AI cluster in. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID to create the dedicated AI cluster in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The number of dedicated units in this AI cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
        private Integer unitCount;

        /**
         * The number of dedicated units in this AI cluster.
         *
         * @param unitCount the value to set
         * @return this builder
         */
        public Builder unitCount(Integer unitCount) {
            this.unitCount = unitCount;
            this.__explicitlySet__.add("unitCount");
            return this;
        }
        /**
         * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
         * hidden from customers.
         *
         * <p>Allowed values are: - LARGE_COHERE - LARGE_COHERE_V2 - SMALL_COHERE - SMALL_COHERE_V2
         * - SMALL_COHERE_4 - EMBED_COHERE - LLAMA2_70 - LARGE_GENERIC - LARGE_COHERE_V2_2 -
         * LARGE_GENERIC_4 - SMALL_GENERIC_V2 - LARGE_GENERIC_2 - LARGE_COHERE_V3 - RERANK_COHERE -
         * SMALL_GENERIC_V1 - MEDIUM_GENERIC_V1 - LARGE_GENERIC_V1 - A10_X1 - A10_X2 - A10_X4 -
         * A100_40G_X1 - A100_40G_X2 - A100_40G_X4 - A100_40G_X8 - A100_80G_X1 - A100_80G_X2 -
         * A100_80G_X4 - A100_80G_X8 - H100_X1 - H100_X2 - H100_X4 - H100_X8 - H200_X1 - H200_X2 -
         * H200_X4 - H200_X8
         *
         * <p>The following shapes can only be used to deploy imported models: - A10_X1, A10_X2,
         * A10_X4 - A100_40G_X1, A100_40G_X2, A100_40G_X4, A100_40G_X8 - A100_80G_X1, A100_80G_X2,
         * A100_80G_X4, A100_80G_X8 - H100_X1, H100_X2, H100_X4, H100_X8 - H200_X1, H200_X2,
         * H200_X4, H200_X8 - OAI_A10_X2 - OAI_H100_X1 - OAI_H100_X2 - OAI_H200_X1 - OAI_A100_80G_X1
         * - OAI_A100_80G_X2 - OAI_A100_40G_X1 - OAI_A100_40G_X4
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unitShape")
        private DedicatedAiCluster.UnitShape unitShape;

        /**
         * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
         * hidden from customers.
         *
         * <p>Allowed values are: - LARGE_COHERE - LARGE_COHERE_V2 - SMALL_COHERE - SMALL_COHERE_V2
         * - SMALL_COHERE_4 - EMBED_COHERE - LLAMA2_70 - LARGE_GENERIC - LARGE_COHERE_V2_2 -
         * LARGE_GENERIC_4 - SMALL_GENERIC_V2 - LARGE_GENERIC_2 - LARGE_COHERE_V3 - RERANK_COHERE -
         * SMALL_GENERIC_V1 - MEDIUM_GENERIC_V1 - LARGE_GENERIC_V1 - A10_X1 - A10_X2 - A10_X4 -
         * A100_40G_X1 - A100_40G_X2 - A100_40G_X4 - A100_40G_X8 - A100_80G_X1 - A100_80G_X2 -
         * A100_80G_X4 - A100_80G_X8 - H100_X1 - H100_X2 - H100_X4 - H100_X8 - H200_X1 - H200_X2 -
         * H200_X4 - H200_X8
         *
         * <p>The following shapes can only be used to deploy imported models: - A10_X1, A10_X2,
         * A10_X4 - A100_40G_X1, A100_40G_X2, A100_40G_X4, A100_40G_X8 - A100_80G_X1, A100_80G_X2,
         * A100_80G_X4, A100_80G_X8 - H100_X1, H100_X2, H100_X4, H100_X8 - H200_X1, H200_X2,
         * H200_X4, H200_X8 - OAI_A10_X2 - OAI_H100_X1 - OAI_H100_X2 - OAI_H200_X1 - OAI_A100_80G_X1
         * - OAI_A100_80G_X2 - OAI_A100_40G_X1 - OAI_A100_40G_X4
         *
         * @param unitShape the value to set
         * @return this builder
         */
        public Builder unitShape(DedicatedAiCluster.UnitShape unitShape) {
            this.unitShape = unitShape;
            this.__explicitlySet__.add("unitShape");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDedicatedAiClusterDetails build() {
            CreateDedicatedAiClusterDetails model =
                    new CreateDedicatedAiClusterDetails(
                            this.displayName,
                            this.description,
                            this.type,
                            this.compartmentId,
                            this.unitCount,
                            this.unitShape,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDedicatedAiClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("unitCount")) {
                this.unitCount(model.getUnitCount());
            }
            if (model.wasPropertyExplicitlySet("unitShape")) {
                this.unitShape(model.getUnitShape());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** A user-friendly name. Does not have to be unique, and it's changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An optional description of the dedicated AI cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the dedicated AI cluster.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor or
     * hosting/inference processor.
     *
     * <p>Allowed values are: - HOSTING - FINE_TUNING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DedicatedAiCluster.Type type;

    /**
     * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor or
     * hosting/inference processor.
     *
     * <p>Allowed values are: - HOSTING - FINE_TUNING
     *
     * @return the value
     */
    public DedicatedAiCluster.Type getType() {
        return type;
    }

    /** The compartment OCID to create the dedicated AI cluster in. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID to create the dedicated AI cluster in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The number of dedicated units in this AI cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
    private final Integer unitCount;

    /**
     * The number of dedicated units in this AI cluster.
     *
     * @return the value
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /**
     * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
     * hidden from customers.
     *
     * <p>Allowed values are: - LARGE_COHERE - LARGE_COHERE_V2 - SMALL_COHERE - SMALL_COHERE_V2 -
     * SMALL_COHERE_4 - EMBED_COHERE - LLAMA2_70 - LARGE_GENERIC - LARGE_COHERE_V2_2 -
     * LARGE_GENERIC_4 - SMALL_GENERIC_V2 - LARGE_GENERIC_2 - LARGE_COHERE_V3 - RERANK_COHERE -
     * SMALL_GENERIC_V1 - MEDIUM_GENERIC_V1 - LARGE_GENERIC_V1 - A10_X1 - A10_X2 - A10_X4 -
     * A100_40G_X1 - A100_40G_X2 - A100_40G_X4 - A100_40G_X8 - A100_80G_X1 - A100_80G_X2 -
     * A100_80G_X4 - A100_80G_X8 - H100_X1 - H100_X2 - H100_X4 - H100_X8 - H200_X1 - H200_X2 -
     * H200_X4 - H200_X8
     *
     * <p>The following shapes can only be used to deploy imported models: - A10_X1, A10_X2, A10_X4
     * - A100_40G_X1, A100_40G_X2, A100_40G_X4, A100_40G_X8 - A100_80G_X1, A100_80G_X2, A100_80G_X4,
     * A100_80G_X8 - H100_X1, H100_X2, H100_X4, H100_X8 - H200_X1, H200_X2, H200_X4, H200_X8 -
     * OAI_A10_X2 - OAI_H100_X1 - OAI_H100_X2 - OAI_H200_X1 - OAI_A100_80G_X1 - OAI_A100_80G_X2 -
     * OAI_A100_40G_X1 - OAI_A100_40G_X4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitShape")
    private final DedicatedAiCluster.UnitShape unitShape;

    /**
     * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
     * hidden from customers.
     *
     * <p>Allowed values are: - LARGE_COHERE - LARGE_COHERE_V2 - SMALL_COHERE - SMALL_COHERE_V2 -
     * SMALL_COHERE_4 - EMBED_COHERE - LLAMA2_70 - LARGE_GENERIC - LARGE_COHERE_V2_2 -
     * LARGE_GENERIC_4 - SMALL_GENERIC_V2 - LARGE_GENERIC_2 - LARGE_COHERE_V3 - RERANK_COHERE -
     * SMALL_GENERIC_V1 - MEDIUM_GENERIC_V1 - LARGE_GENERIC_V1 - A10_X1 - A10_X2 - A10_X4 -
     * A100_40G_X1 - A100_40G_X2 - A100_40G_X4 - A100_40G_X8 - A100_80G_X1 - A100_80G_X2 -
     * A100_80G_X4 - A100_80G_X8 - H100_X1 - H100_X2 - H100_X4 - H100_X8 - H200_X1 - H200_X2 -
     * H200_X4 - H200_X8
     *
     * <p>The following shapes can only be used to deploy imported models: - A10_X1, A10_X2, A10_X4
     * - A100_40G_X1, A100_40G_X2, A100_40G_X4, A100_40G_X8 - A100_80G_X1, A100_80G_X2, A100_80G_X4,
     * A100_80G_X8 - H100_X1, H100_X2, H100_X4, H100_X8 - H200_X1, H200_X2, H200_X4, H200_X8 -
     * OAI_A10_X2 - OAI_H100_X1 - OAI_H100_X2 - OAI_H200_X1 - OAI_A100_80G_X1 - OAI_A100_80G_X2 -
     * OAI_A100_40G_X1 - OAI_A100_40G_X4
     *
     * @return the value
     */
    public DedicatedAiCluster.UnitShape getUnitShape() {
        return unitShape;
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
        sb.append("CreateDedicatedAiClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", unitCount=").append(String.valueOf(this.unitCount));
        sb.append(", unitShape=").append(String.valueOf(this.unitShape));
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
        if (!(o instanceof CreateDedicatedAiClusterDetails)) {
            return false;
        }

        CreateDedicatedAiClusterDetails other = (CreateDedicatedAiClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.unitCount, other.unitCount)
                && java.util.Objects.equals(this.unitShape, other.unitShape)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.unitCount == null ? 43 : this.unitCount.hashCode());
        result = (result * PRIME) + (this.unitShape == null ? 43 : this.unitShape.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
