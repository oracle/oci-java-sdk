/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * An autoscaling configuration lets you dynamically scale the resources in a Compute instance pool.
 * For more information, see [Autoscaling](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/autoscalinginstancepools.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutoScalingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutoScalingConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "coolDownInSeconds",
        "isEnabled",
        "resource",
        "policies",
        "timeCreated",
        "maxResourceCount",
        "minResourceCount"
    })
    public AutoScalingConfiguration(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            Integer coolDownInSeconds,
            Boolean isEnabled,
            Resource resource,
            java.util.List<AutoScalingPolicy> policies,
            java.util.Date timeCreated,
            Integer maxResourceCount,
            Integer minResourceCount) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.coolDownInSeconds = coolDownInSeconds;
        this.isEnabled = isEnabled;
        this.resource = resource;
        this.policies = policies;
        this.timeCreated = timeCreated;
        this.maxResourceCount = maxResourceCount;
        this.minResourceCount = minResourceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the autoscaling configuration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the autoscaling configuration.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
         * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
         * is also the default. The cooldown period starts when the instance pool reaches the running state.
         * <p>
         * For schedule-based autoscaling policies, this value is not used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
        private Integer coolDownInSeconds;

        /**
         * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
         * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
         * is also the default. The cooldown period starts when the instance pool reaches the running state.
         * <p>
         * For schedule-based autoscaling policies, this value is not used.
         *
         * @param coolDownInSeconds the value to set
         * @return this builder
         **/
        public Builder coolDownInSeconds(Integer coolDownInSeconds) {
            this.coolDownInSeconds = coolDownInSeconds;
            this.__explicitlySet__.add("coolDownInSeconds");
            return this;
        }
        /**
         * Whether the autoscaling configuration is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the autoscaling configuration is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resource")
        private Resource resource;

        public Builder resource(Resource resource) {
            this.resource = resource;
            this.__explicitlySet__.add("resource");
            return this;
        }
        /**
         * Autoscaling policy definitions for the autoscaling configuration. An autoscaling policy defines the criteria that
         * trigger autoscaling actions and the actions to take.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policies")
        private java.util.List<AutoScalingPolicy> policies;

        /**
         * Autoscaling policy definitions for the autoscaling configuration. An autoscaling policy defines the criteria that
         * trigger autoscaling actions and the actions to take.
         *
         * @param policies the value to set
         * @return this builder
         **/
        public Builder policies(java.util.List<AutoScalingPolicy> policies) {
            this.policies = policies;
            this.__explicitlySet__.add("policies");
            return this;
        }
        /**
         * The date and time the autoscaling configuration was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the autoscaling configuration was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The maximum number of resources to scale out to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxResourceCount")
        private Integer maxResourceCount;

        /**
         * The maximum number of resources to scale out to.
         * @param maxResourceCount the value to set
         * @return this builder
         **/
        public Builder maxResourceCount(Integer maxResourceCount) {
            this.maxResourceCount = maxResourceCount;
            this.__explicitlySet__.add("maxResourceCount");
            return this;
        }
        /**
         * The minimum number of resources to scale in to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minResourceCount")
        private Integer minResourceCount;

        /**
         * The minimum number of resources to scale in to.
         * @param minResourceCount the value to set
         * @return this builder
         **/
        public Builder minResourceCount(Integer minResourceCount) {
            this.minResourceCount = minResourceCount;
            this.__explicitlySet__.add("minResourceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoScalingConfiguration build() {
            AutoScalingConfiguration model =
                    new AutoScalingConfiguration(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.coolDownInSeconds,
                            this.isEnabled,
                            this.resource,
                            this.policies,
                            this.timeCreated,
                            this.maxResourceCount,
                            this.minResourceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScalingConfiguration model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("coolDownInSeconds")) {
                this.coolDownInSeconds(model.getCoolDownInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("resource")) {
                this.resource(model.getResource());
            }
            if (model.wasPropertyExplicitlySet("policies")) {
                this.policies(model.getPolicies());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("maxResourceCount")) {
                this.maxResourceCount(model.getMaxResourceCount());
            }
            if (model.wasPropertyExplicitlySet("minResourceCount")) {
                this.minResourceCount(model.getMinResourceCount());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the autoscaling configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the autoscaling configuration.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
     * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
     * is also the default. The cooldown period starts when the instance pool reaches the running state.
     * <p>
     * For schedule-based autoscaling policies, this value is not used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
    private final Integer coolDownInSeconds;

    /**
     * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
     * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
     * is also the default. The cooldown period starts when the instance pool reaches the running state.
     * <p>
     * For schedule-based autoscaling policies, this value is not used.
     *
     * @return the value
     **/
    public Integer getCoolDownInSeconds() {
        return coolDownInSeconds;
    }

    /**
     * Whether the autoscaling configuration is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the autoscaling configuration is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final Resource resource;

    public Resource getResource() {
        return resource;
    }

    /**
     * Autoscaling policy definitions for the autoscaling configuration. An autoscaling policy defines the criteria that
     * trigger autoscaling actions and the actions to take.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policies")
    private final java.util.List<AutoScalingPolicy> policies;

    /**
     * Autoscaling policy definitions for the autoscaling configuration. An autoscaling policy defines the criteria that
     * trigger autoscaling actions and the actions to take.
     *
     * @return the value
     **/
    public java.util.List<AutoScalingPolicy> getPolicies() {
        return policies;
    }

    /**
     * The date and time the autoscaling configuration was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the autoscaling configuration was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The maximum number of resources to scale out to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxResourceCount")
    private final Integer maxResourceCount;

    /**
     * The maximum number of resources to scale out to.
     * @return the value
     **/
    public Integer getMaxResourceCount() {
        return maxResourceCount;
    }

    /**
     * The minimum number of resources to scale in to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minResourceCount")
    private final Integer minResourceCount;

    /**
     * The minimum number of resources to scale in to.
     * @return the value
     **/
    public Integer getMinResourceCount() {
        return minResourceCount;
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
        sb.append("AutoScalingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", coolDownInSeconds=").append(String.valueOf(this.coolDownInSeconds));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", resource=").append(String.valueOf(this.resource));
        sb.append(", policies=").append(String.valueOf(this.policies));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", maxResourceCount=").append(String.valueOf(this.maxResourceCount));
        sb.append(", minResourceCount=").append(String.valueOf(this.minResourceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScalingConfiguration)) {
            return false;
        }

        AutoScalingConfiguration other = (AutoScalingConfiguration) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.coolDownInSeconds, other.coolDownInSeconds)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.resource, other.resource)
                && java.util.Objects.equals(this.policies, other.policies)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.maxResourceCount, other.maxResourceCount)
                && java.util.Objects.equals(this.minResourceCount, other.minResourceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.coolDownInSeconds == null ? 43 : this.coolDownInSeconds.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result = (result * PRIME) + (this.policies == null ? 43 : this.policies.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.maxResourceCount == null ? 43 : this.maxResourceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.minResourceCount == null ? 43 : this.minResourceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
