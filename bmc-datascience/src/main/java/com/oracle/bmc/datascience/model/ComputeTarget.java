/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * A compute target.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ComputeTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeTarget extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeCreated",
        "metadata",
        "createdBy",
        "compartmentId",
        "displayName",
        "description",
        "computeConfigurationDetails",
        "computeTargetSystemData",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public ComputeTarget(
            String id,
            java.util.Date timeCreated,
            java.util.Map<String, String> metadata,
            String createdBy,
            String compartmentId,
            String displayName,
            String description,
            ComputeConfigurationDetails computeConfigurationDetails,
            ComputeTargetSystemData computeTargetSystemData,
            ComputeTargetLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.timeCreated = timeCreated;
        this.metadata = metadata;
        this.createdBy = createdBy;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.computeConfigurationDetails = computeConfigurationDetails;
        this.computeTargetSystemData = computeTargetSystemData;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute target.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: 2020-08-06T21:10:29.41Z
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: 2020-08-06T21:10:29.41Z
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
         * Metadata for the compute target.
         * The size of metadata must be less than 2048 bytes.
         * Key should be under 32 characters.
         * Key should contain only letters, digits and underscore (_)
         * Key should start with a letter.
         * Key should have at least 2 characters.
         * Key should not end with underscore eg. {@code TEST_}
         * Key if added cannot be empty. Value can be empty.
         * No specific size limits on individual Values. But overall metadata is limited to 2048 bytes.
         * Key can't be reserved Compute Target metadata.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Metadata for the compute target.
         * The size of metadata must be less than 2048 bytes.
         * Key should be under 32 characters.
         * Key should contain only letters, digits and underscore (_)
         * Key should start with a letter.
         * Key should have at least 2 characters.
         * Key should not end with underscore eg. {@code TEST_}
         * Key if added cannot be empty. Value can be empty.
         * No specific size limits on individual Values. But overall metadata is limited to 2048 bytes.
         * Key can't be reserved Compute Target metadata.
         *
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the compute target.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the compute target.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly display name for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A short description of the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the compute target.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeConfigurationDetails")
        private ComputeConfigurationDetails computeConfigurationDetails;

        public Builder computeConfigurationDetails(
                ComputeConfigurationDetails computeConfigurationDetails) {
            this.computeConfigurationDetails = computeConfigurationDetails;
            this.__explicitlySet__.add("computeConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeTargetSystemData")
        private ComputeTargetSystemData computeTargetSystemData;

        public Builder computeTargetSystemData(ComputeTargetSystemData computeTargetSystemData) {
            this.computeTargetSystemData = computeTargetSystemData;
            this.__explicitlySet__.add("computeTargetSystemData");
            return this;
        }
        /**
         * The state of the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComputeTargetLifecycleState lifecycleState;

        /**
         * The state of the compute target.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ComputeTargetLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the state of the compute target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the state of the compute target.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeTarget build() {
            ComputeTarget model =
                    new ComputeTarget(
                            this.id,
                            this.timeCreated,
                            this.metadata,
                            this.createdBy,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.computeConfigurationDetails,
                            this.computeTargetSystemData,
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
        public Builder copy(ComputeTarget model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("computeConfigurationDetails")) {
                this.computeConfigurationDetails(model.getComputeConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("computeTargetSystemData")) {
                this.computeTargetSystemData(model.getComputeTargetSystemData());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute target.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: 2020-08-06T21:10:29.41Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: 2020-08-06T21:10:29.41Z
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Metadata for the compute target.
     * The size of metadata must be less than 2048 bytes.
     * Key should be under 32 characters.
     * Key should contain only letters, digits and underscore (_)
     * Key should start with a letter.
     * Key should have at least 2 characters.
     * Key should not end with underscore eg. {@code TEST_}
     * Key if added cannot be empty. Value can be empty.
     * No specific size limits on individual Values. But overall metadata is limited to 2048 bytes.
     * Key can't be reserved Compute Target metadata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Metadata for the compute target.
     * The size of metadata must be less than 2048 bytes.
     * Key should be under 32 characters.
     * Key should contain only letters, digits and underscore (_)
     * Key should start with a letter.
     * Key should have at least 2 characters.
     * Key should not end with underscore eg. {@code TEST_}
     * Key if added cannot be empty. Value can be empty.
     * No specific size limits on individual Values. But overall metadata is limited to 2048 bytes.
     * Key can't be reserved Compute Target metadata.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the compute target.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the compute target.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly display name for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the compute target.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("computeConfigurationDetails")
    private final ComputeConfigurationDetails computeConfigurationDetails;

    public ComputeConfigurationDetails getComputeConfigurationDetails() {
        return computeConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("computeTargetSystemData")
    private final ComputeTargetSystemData computeTargetSystemData;

    public ComputeTargetSystemData getComputeTargetSystemData() {
        return computeTargetSystemData;
    }

    /**
     * The state of the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComputeTargetLifecycleState lifecycleState;

    /**
     * The state of the compute target.
     * @return the value
     **/
    public ComputeTargetLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the state of the compute target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the state of the compute target.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("ComputeTarget(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", computeConfigurationDetails=")
                .append(String.valueOf(this.computeConfigurationDetails));
        sb.append(", computeTargetSystemData=")
                .append(String.valueOf(this.computeTargetSystemData));
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
        if (!(o instanceof ComputeTarget)) {
            return false;
        }

        ComputeTarget other = (ComputeTarget) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.computeConfigurationDetails, other.computeConfigurationDetails)
                && java.util.Objects.equals(
                        this.computeTargetSystemData, other.computeTargetSystemData)
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.computeConfigurationDetails == null
                                ? 43
                                : this.computeConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.computeTargetSystemData == null
                                ? 43
                                : this.computeTargetSystemData.hashCode());
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
