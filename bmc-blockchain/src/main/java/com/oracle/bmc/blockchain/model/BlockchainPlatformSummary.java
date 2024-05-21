/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockchainPlatformSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlockchainPlatformSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "timeCreated",
        "timeUpdated",
        "platformRole",
        "computeShape",
        "serviceEndpoint",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public BlockchainPlatformSummary(
            String id,
            String displayName,
            String compartmentId,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BlockchainPlatform.PlatformRole platformRole,
            BlockchainPlatform.ComputeShape computeShape,
            String serviceEndpoint,
            BlockchainPlatform.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.platformRole = platformRole;
        this.computeShape = computeShape;
        this.serviceEndpoint = serviceEndpoint;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Platform Instance Display name, can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Platform Instance Display name, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Platform Instance Description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Platform Instance Description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time the the Platform Instance was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Platform Instance was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Platform Instance was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Platform Instance was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Role of platform - founder or participant
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private BlockchainPlatform.PlatformRole platformRole;

        /**
         * Role of platform - founder or participant
         * @param platformRole the value to set
         * @return this builder
         **/
        public Builder platformRole(BlockchainPlatform.PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }
        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private BlockchainPlatform.ComputeShape computeShape;

        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         * @param computeShape the value to set
         * @return this builder
         **/
        public Builder computeShape(BlockchainPlatform.ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }
        /**
         * Service endpoint URL, valid post-provisioning
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
        private String serviceEndpoint;

        /**
         * Service endpoint URL, valid post-provisioning
         * @param serviceEndpoint the value to set
         * @return this builder
         **/
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            this.__explicitlySet__.add("serviceEndpoint");
            return this;
        }
        /**
         * The current state of the Platform Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BlockchainPlatform.LifecycleState lifecycleState;

        /**
         * The current state of the Platform Instance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(BlockchainPlatform.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        public BlockchainPlatformSummary build() {
            BlockchainPlatformSummary model =
                    new BlockchainPlatformSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.platformRole,
                            this.computeShape,
                            this.serviceEndpoint,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatformSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("platformRole")) {
                this.platformRole(model.getPlatformRole());
            }
            if (model.wasPropertyExplicitlySet("computeShape")) {
                this.computeShape(model.getComputeShape());
            }
            if (model.wasPropertyExplicitlySet("serviceEndpoint")) {
                this.serviceEndpoint(model.getServiceEndpoint());
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
     * unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Platform Instance Display name, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Platform Instance Display name, can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Platform Instance Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Platform Instance Description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time the the Platform Instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Platform Instance was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Platform Instance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Platform Instance was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Role of platform - founder or participant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    private final BlockchainPlatform.PlatformRole platformRole;

    /**
     * Role of platform - founder or participant
     * @return the value
     **/
    public BlockchainPlatform.PlatformRole getPlatformRole() {
        return platformRole;
    }

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    private final BlockchainPlatform.ComputeShape computeShape;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     * @return the value
     **/
    public BlockchainPlatform.ComputeShape getComputeShape() {
        return computeShape;
    }

    /**
     * Service endpoint URL, valid post-provisioning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
    private final String serviceEndpoint;

    /**
     * Service endpoint URL, valid post-provisioning
     * @return the value
     **/
    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    /**
     * The current state of the Platform Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BlockchainPlatform.LifecycleState lifecycleState;

    /**
     * The current state of the Platform Instance.
     * @return the value
     **/
    public BlockchainPlatform.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("BlockchainPlatformSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", platformRole=").append(String.valueOf(this.platformRole));
        sb.append(", computeShape=").append(String.valueOf(this.computeShape));
        sb.append(", serviceEndpoint=").append(String.valueOf(this.serviceEndpoint));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof BlockchainPlatformSummary)) {
            return false;
        }

        BlockchainPlatformSummary other = (BlockchainPlatformSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.platformRole, other.platformRole)
                && java.util.Objects.equals(this.computeShape, other.computeShape)
                && java.util.Objects.equals(this.serviceEndpoint, other.serviceEndpoint)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.platformRole == null ? 43 : this.platformRole.hashCode());
        result = (result * PRIME) + (this.computeShape == null ? 43 : this.computeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceEndpoint == null ? 43 : this.serviceEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
