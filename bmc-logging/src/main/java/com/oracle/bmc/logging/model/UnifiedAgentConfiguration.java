/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Top Unified Agent configuration object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "definedTags",
        "freeformTags",
        "timeCreated",
        "timeLastModified",
        "lifecycleState",
        "isEnabled",
        "configurationState",
        "serviceConfiguration",
        "groupAssociation"
    })
    public UnifiedAgentConfiguration(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Date timeCreated,
            java.util.Date timeLastModified,
            LogLifecycleState lifecycleState,
            Boolean isEnabled,
            UnifiedAgentServiceConfigurationStates configurationState,
            UnifiedAgentServiceConfigurationDetails serviceConfiguration,
            GroupAssociationDetails groupAssociation) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
        this.lifecycleState = lifecycleState;
        this.isEnabled = isEnabled;
        this.configurationState = configurationState;
        this.serviceConfiguration = serviceConfiguration;
        this.groupAssociation = groupAssociation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that the resource belongs to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
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
         * Description for this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for this resource.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Time the resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the resource was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time the resource was last modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * Time the resource was last modified.
         * @param timeLastModified the value to set
         * @return this builder
         **/
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /**
         * The pipeline state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LogLifecycleState lifecycleState;

        /**
         * The pipeline state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LogLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Whether or not this resource is currently enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether or not this resource is currently enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * State of unified agent service configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurationState")
        private UnifiedAgentServiceConfigurationStates configurationState;

        /**
         * State of unified agent service configuration.
         * @param configurationState the value to set
         * @return this builder
         **/
        public Builder configurationState(
                UnifiedAgentServiceConfigurationStates configurationState) {
            this.configurationState = configurationState;
            this.__explicitlySet__.add("configurationState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfiguration")
        private UnifiedAgentServiceConfigurationDetails serviceConfiguration;

        public Builder serviceConfiguration(
                UnifiedAgentServiceConfigurationDetails serviceConfiguration) {
            this.serviceConfiguration = serviceConfiguration;
            this.__explicitlySet__.add("serviceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupAssociation")
        private GroupAssociationDetails groupAssociation;

        public Builder groupAssociation(GroupAssociationDetails groupAssociation) {
            this.groupAssociation = groupAssociation;
            this.__explicitlySet__.add("groupAssociation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentConfiguration build() {
            UnifiedAgentConfiguration model =
                    new UnifiedAgentConfiguration(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.definedTags,
                            this.freeformTags,
                            this.timeCreated,
                            this.timeLastModified,
                            this.lifecycleState,
                            this.isEnabled,
                            this.configurationState,
                            this.serviceConfiguration,
                            this.groupAssociation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentConfiguration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("configurationState")) {
                this.configurationState(model.getConfigurationState());
            }
            if (model.wasPropertyExplicitlySet("serviceConfiguration")) {
                this.serviceConfiguration(model.getServiceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("groupAssociation")) {
                this.groupAssociation(model.getGroupAssociation());
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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that the resource belongs to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description for this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for this resource.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Time the resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the resource was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time the resource was last modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * Time the resource was last modified.
     * @return the value
     **/
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /**
     * The pipeline state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LogLifecycleState lifecycleState;

    /**
     * The pipeline state.
     * @return the value
     **/
    public LogLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Whether or not this resource is currently enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this resource is currently enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * State of unified agent service configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationState")
    private final UnifiedAgentServiceConfigurationStates configurationState;

    /**
     * State of unified agent service configuration.
     * @return the value
     **/
    public UnifiedAgentServiceConfigurationStates getConfigurationState() {
        return configurationState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfiguration")
    private final UnifiedAgentServiceConfigurationDetails serviceConfiguration;

    public UnifiedAgentServiceConfigurationDetails getServiceConfiguration() {
        return serviceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("groupAssociation")
    private final GroupAssociationDetails groupAssociation;

    public GroupAssociationDetails getGroupAssociation() {
        return groupAssociation;
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
        sb.append("UnifiedAgentConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", configurationState=").append(String.valueOf(this.configurationState));
        sb.append(", serviceConfiguration=").append(String.valueOf(this.serviceConfiguration));
        sb.append(", groupAssociation=").append(String.valueOf(this.groupAssociation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentConfiguration)) {
            return false;
        }

        UnifiedAgentConfiguration other = (UnifiedAgentConfiguration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.configurationState, other.configurationState)
                && java.util.Objects.equals(this.serviceConfiguration, other.serviceConfiguration)
                && java.util.Objects.equals(this.groupAssociation, other.groupAssociation)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationState == null
                                ? 43
                                : this.configurationState.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceConfiguration == null
                                ? 43
                                : this.serviceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.groupAssociation == null ? 43 : this.groupAssociation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
