/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The information needed to create a new endpoint and expose to end users.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "computeType",
        "alias",
        "description",
        "compartmentId",
        "modelId",
        "inferenceUnits",
        "freeformTags",
        "definedTags"
    })
    public CreateEndpointDetails(
            String displayName,
            ComputeType computeType,
            String alias,
            String description,
            String compartmentId,
            String modelId,
            Integer inferenceUnits,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.computeType = computeType;
        this.alias = alias;
        this.description = description;
        this.compartmentId = compartmentId;
        this.modelId = modelId;
        this.inferenceUnits = inferenceUnits;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the resource. It should be unique and can be modified. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. It should be unique and can be modified. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compute infra type for endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeType")
        private ComputeType computeType;

        /**
         * Compute infra type for endpoint.
         * @param computeType the value to set
         * @return this builder
         **/
        public Builder computeType(ComputeType computeType) {
            this.computeType = computeType;
            this.__explicitlySet__.add("computeType");
            return this;
        }
        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /**
         * A short description of the an endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the an endpoint.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) compartment identifier for the endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) compartment identifier for the endpoint
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model to associate with the endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model to associate with the endpoint.
         * @param modelId the value to set
         * @return this builder
         **/
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * Number of replicas required for this endpoint. This will be optional parameter. Default will be 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inferenceUnits")
        private Integer inferenceUnits;

        /**
         * Number of replicas required for this endpoint. This will be optional parameter. Default will be 1.
         * @param inferenceUnits the value to set
         * @return this builder
         **/
        public Builder inferenceUnits(Integer inferenceUnits) {
            this.inferenceUnits = inferenceUnits;
            this.__explicitlySet__.add("inferenceUnits");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CreateEndpointDetails build() {
            CreateEndpointDetails model =
                    new CreateEndpointDetails(
                            this.displayName,
                            this.computeType,
                            this.alias,
                            this.description,
                            this.compartmentId,
                            this.modelId,
                            this.inferenceUnits,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("computeType")) {
                this.computeType(model.getComputeType());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("inferenceUnits")) {
                this.inferenceUnits(model.getInferenceUnits());
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
     * A user-friendly display name for the resource. It should be unique and can be modified. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. It should be unique and can be modified. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compute infra type for endpoint.
     **/
    public enum ComputeType {
        Cpu("CPU"),
        Gpu("GPU"),
        ;

        private final String value;
        private static java.util.Map<String, ComputeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeType v : ComputeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ComputeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ComputeType: " + key);
        }
    };
    /**
     * Compute infra type for endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeType")
    private final ComputeType computeType;

    /**
     * Compute infra type for endpoint.
     * @return the value
     **/
    public ComputeType getComputeType() {
        return computeType;
    }

    /**
     * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Unique name across user tenancy in a region to identify an endpoint to be used for inferencing.
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    /**
     * A short description of the an endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the an endpoint.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) compartment identifier for the endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) compartment identifier for the endpoint
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model to associate with the endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model to associate with the endpoint.
     * @return the value
     **/
    public String getModelId() {
        return modelId;
    }

    /**
     * Number of replicas required for this endpoint. This will be optional parameter. Default will be 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inferenceUnits")
    private final Integer inferenceUnits;

    /**
     * Number of replicas required for this endpoint. This will be optional parameter. Default will be 1.
     * @return the value
     **/
    public Integer getInferenceUnits() {
        return inferenceUnits;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("CreateEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", computeType=").append(String.valueOf(this.computeType));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", inferenceUnits=").append(String.valueOf(this.inferenceUnits));
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
        if (!(o instanceof CreateEndpointDetails)) {
            return false;
        }

        CreateEndpointDetails other = (CreateEndpointDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.computeType, other.computeType)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.inferenceUnits, other.inferenceUnits)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.computeType == null ? 43 : this.computeType.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.inferenceUnits == null ? 43 : this.inferenceUnits.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
