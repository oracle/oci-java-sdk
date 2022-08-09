/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the profile.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Profile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Profile extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "description",
        "aggregationIntervalInDays",
        "definedTags",
        "freeformTags",
        "levelsConfiguration",
        "targetCompartments",
        "targetTags",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public Profile(
            String id,
            String compartmentId,
            String name,
            String description,
            Integer aggregationIntervalInDays,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            LevelsConfiguration levelsConfiguration,
            TargetCompartments targetCompartments,
            TargetTags targetTags,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.aggregationIntervalInDays = aggregationIntervalInDays;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.levelsConfiguration = levelsConfiguration;
        this.targetCompartments = targetCompartments;
        this.targetTags = targetTags;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique OCID of the profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique OCID of the profile.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the tenancy. The tenancy is the root compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy. The tenancy is the root compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name assigned to the profile. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name assigned to the profile. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Text describing the profile. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Text describing the profile. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time period over which to collect data for the recommendations, measured in number of days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationIntervalInDays")
        private Integer aggregationIntervalInDays;

        /**
         * The time period over which to collect data for the recommendations, measured in number of days.
         * @param aggregationIntervalInDays the value to set
         * @return this builder
         **/
        public Builder aggregationIntervalInDays(Integer aggregationIntervalInDays) {
            this.aggregationIntervalInDays = aggregationIntervalInDays;
            this.__explicitlySet__.add("aggregationIntervalInDays");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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
        /**
         * Simple key-value pair applied without any predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair applied without any predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
         * <p>
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

        @com.fasterxml.jackson.annotation.JsonProperty("levelsConfiguration")
        private LevelsConfiguration levelsConfiguration;

        public Builder levelsConfiguration(LevelsConfiguration levelsConfiguration) {
            this.levelsConfiguration = levelsConfiguration;
            this.__explicitlySet__.add("levelsConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartments")
        private TargetCompartments targetCompartments;

        public Builder targetCompartments(TargetCompartments targetCompartments) {
            this.targetCompartments = targetCompartments;
            this.__explicitlySet__.add("targetCompartments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTags")
        private TargetTags targetTags;

        public Builder targetTags(TargetTags targetTags) {
            this.targetTags = targetTags;
            this.__explicitlySet__.add("targetTags");
            return this;
        }
        /**
         * The profile's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The profile's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the profile was created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the profile was created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the profile was last updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the profile was last updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Profile build() {
            Profile model =
                    new Profile(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.description,
                            this.aggregationIntervalInDays,
                            this.definedTags,
                            this.freeformTags,
                            this.levelsConfiguration,
                            this.targetCompartments,
                            this.targetTags,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Profile model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("aggregationIntervalInDays")) {
                this.aggregationIntervalInDays(model.getAggregationIntervalInDays());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("levelsConfiguration")) {
                this.levelsConfiguration(model.getLevelsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("targetCompartments")) {
                this.targetCompartments(model.getTargetCompartments());
            }
            if (model.wasPropertyExplicitlySet("targetTags")) {
                this.targetTags(model.getTargetTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The unique OCID of the profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique OCID of the profile.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name assigned to the profile. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name assigned to the profile. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Text describing the profile. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Text describing the profile. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time period over which to collect data for the recommendations, measured in number of days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationIntervalInDays")
    private final Integer aggregationIntervalInDays;

    /**
     * The time period over which to collect data for the recommendations, measured in number of days.
     * @return the value
     **/
    public Integer getAggregationIntervalInDays() {
        return aggregationIntervalInDays;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair applied without any predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair applied without any predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("levelsConfiguration")
    private final LevelsConfiguration levelsConfiguration;

    public LevelsConfiguration getLevelsConfiguration() {
        return levelsConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartments")
    private final TargetCompartments targetCompartments;

    public TargetCompartments getTargetCompartments() {
        return targetCompartments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetTags")
    private final TargetTags targetTags;

    public TargetTags getTargetTags() {
        return targetTags;
    }

    /**
     * The profile's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The profile's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the profile was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the profile was created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the profile was last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the profile was last updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("Profile(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", aggregationIntervalInDays=")
                .append(String.valueOf(this.aggregationIntervalInDays));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", levelsConfiguration=").append(String.valueOf(this.levelsConfiguration));
        sb.append(", targetCompartments=").append(String.valueOf(this.targetCompartments));
        sb.append(", targetTags=").append(String.valueOf(this.targetTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Profile)) {
            return false;
        }

        Profile other = (Profile) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.aggregationIntervalInDays, other.aggregationIntervalInDays)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.levelsConfiguration, other.levelsConfiguration)
                && java.util.Objects.equals(this.targetCompartments, other.targetCompartments)
                && java.util.Objects.equals(this.targetTags, other.targetTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationIntervalInDays == null
                                ? 43
                                : this.aggregationIntervalInDays.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.levelsConfiguration == null
                                ? 43
                                : this.levelsConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCompartments == null
                                ? 43
                                : this.targetCompartments.hashCode());
        result = (result * PRIME) + (this.targetTags == null ? 43 : this.targetTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
