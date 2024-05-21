/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups.model;

/**
 * Detailed information about the new cluster placement group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateClusterPlacementGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateClusterPlacementGroupDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "clusterPlacementGroupType",
        "description",
        "availabilityDomain",
        "compartmentId",
        "placementInstruction",
        "capabilities",
        "freeformTags",
        "definedTags"
    })
    public CreateClusterPlacementGroupDetails(
            String name,
            ClusterPlacementGroupType clusterPlacementGroupType,
            String description,
            String availabilityDomain,
            String compartmentId,
            PlacementInstructionDetails placementInstruction,
            CapabilitiesCollection capabilities,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.clusterPlacementGroupType = clusterPlacementGroupType;
        this.description = description;
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.placementInstruction = placementInstruction;
        this.capabilities = capabilities;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The friendly name of the cluster placement group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The friendly name of the cluster placement group.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * ClusterPlacementGroup Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupType")
        private ClusterPlacementGroupType clusterPlacementGroupType;

        /**
         * ClusterPlacementGroup Identifier.
         * @param clusterPlacementGroupType the value to set
         * @return this builder
         **/
        public Builder clusterPlacementGroupType(
                ClusterPlacementGroupType clusterPlacementGroupType) {
            this.clusterPlacementGroupType = clusterPlacementGroupType;
            this.__explicitlySet__.add("clusterPlacementGroupType");
            return this;
        }
        /**
         * A description of the cluster placement group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the cluster placement group.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The availability domain where you want to create the cluster placement group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where you want to create the cluster placement group.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the cluster placement group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the cluster placement group.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementInstruction")
        private PlacementInstructionDetails placementInstruction;

        public Builder placementInstruction(PlacementInstructionDetails placementInstruction) {
            this.placementInstruction = placementInstruction;
            this.__explicitlySet__.add("placementInstruction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private CapabilitiesCollection capabilities;

        public Builder capabilities(CapabilitiesCollection capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
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

        public CreateClusterPlacementGroupDetails build() {
            CreateClusterPlacementGroupDetails model =
                    new CreateClusterPlacementGroupDetails(
                            this.name,
                            this.clusterPlacementGroupType,
                            this.description,
                            this.availabilityDomain,
                            this.compartmentId,
                            this.placementInstruction,
                            this.capabilities,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterPlacementGroupDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupType")) {
                this.clusterPlacementGroupType(model.getClusterPlacementGroupType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("placementInstruction")) {
                this.placementInstruction(model.getPlacementInstruction());
            }
            if (model.wasPropertyExplicitlySet("capabilities")) {
                this.capabilities(model.getCapabilities());
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
     * The friendly name of the cluster placement group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The friendly name of the cluster placement group.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * ClusterPlacementGroup Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupType")
    private final ClusterPlacementGroupType clusterPlacementGroupType;

    /**
     * ClusterPlacementGroup Identifier.
     * @return the value
     **/
    public ClusterPlacementGroupType getClusterPlacementGroupType() {
        return clusterPlacementGroupType;
    }

    /**
     * A description of the cluster placement group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the cluster placement group.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The availability domain where you want to create the cluster placement group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where you want to create the cluster placement group.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the cluster placement group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the cluster placement group.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placementInstruction")
    private final PlacementInstructionDetails placementInstruction;

    public PlacementInstructionDetails getPlacementInstruction() {
        return placementInstruction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final CapabilitiesCollection capabilities;

    public CapabilitiesCollection getCapabilities() {
        return capabilities;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
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
        sb.append("CreateClusterPlacementGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", clusterPlacementGroupType=")
                .append(String.valueOf(this.clusterPlacementGroupType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", placementInstruction=").append(String.valueOf(this.placementInstruction));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
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
        if (!(o instanceof CreateClusterPlacementGroupDetails)) {
            return false;
        }

        CreateClusterPlacementGroupDetails other = (CreateClusterPlacementGroupDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupType, other.clusterPlacementGroupType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.placementInstruction, other.placementInstruction)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupType == null
                                ? 43
                                : this.clusterPlacementGroupType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.placementInstruction == null
                                ? 43
                                : this.placementInstruction.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
