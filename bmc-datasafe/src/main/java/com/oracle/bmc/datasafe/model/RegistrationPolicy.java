/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A registration policy. This object contains detailed information about a registration policy,
 * including its ID, compartment ID, display name, and features. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RegistrationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegistrationPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "id",
        "displayName",
        "description",
        "enablementLevel",
        "resourceId",
        "features",
        "canOverrideFeatures",
        "lifecycleState",
        "lifecycleStateDetails",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "connectionOption"
    })
    public RegistrationPolicy(
            String compartmentId,
            String id,
            String displayName,
            String description,
            EnablementLevel enablementLevel,
            String resourceId,
            java.util.List<RegistrationPolicyFeatures> features,
            Boolean canOverrideFeatures,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            PolicyConnectionOption connectionOption) {
        super();
        this.compartmentId = compartmentId;
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.enablementLevel = enablementLevel;
        this.resourceId = resourceId;
        this.features = features;
        this.canOverrideFeatures = canOverrideFeatures;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.connectionOption = connectionOption;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID for the compartment containing the registration policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID for the compartment containing the registration policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the registration policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the registration policy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The display name of the registration policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the registration policy.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description of the registration policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the registration policy.
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
         * The resource type which has been opted in for the registration policy. - DATABASE - The
         * registration policy will be opted in at the Container Database level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enablementLevel")
        private EnablementLevel enablementLevel;

        /**
         * The resource type which has been opted in for the registration policy. - DATABASE - The
         * registration policy will be opted in at the Container Database level.
         *
         * @param enablementLevel the value to set
         * @return this builder
         */
        public Builder enablementLevel(EnablementLevel enablementLevel) {
            this.enablementLevel = enablementLevel;
            this.__explicitlySet__.add("enablementLevel");
            return this;
        }
        /** The OCID of the resource used in the registration policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the resource used in the registration policy.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The Data Safe features granted to the databases registering under the registration
         * policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<RegistrationPolicyFeatures> features;

        /**
         * The Data Safe features granted to the databases registering under the registration
         * policy.
         *
         * @param features the value to set
         * @return this builder
         */
        public Builder features(java.util.List<RegistrationPolicyFeatures> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }
        /** Indicates whether features will be overridden. */
        @com.fasterxml.jackson.annotation.JsonProperty("canOverrideFeatures")
        private Boolean canOverrideFeatures;

        /**
         * Indicates whether features will be overridden.
         *
         * @param canOverrideFeatures the value to set
         * @return this builder
         */
        public Builder canOverrideFeatures(Boolean canOverrideFeatures) {
            this.canOverrideFeatures = canOverrideFeatures;
            this.__explicitlySet__.add("canOverrideFeatures");
            return this;
        }
        /**
         * The lifecycle state of the registration policy. - CREATING - The registration policy is
         * getting created. - ACTIVE - The registration policy has been successfully created. -
         * UPDATING - The registration policy is getting updated. - NEEDS_ATTENTION - The
         * registration policy needs attention. - FAILED - The registration policy creation or
         * update has failed. - DELETING - The registration policy is getting deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the registration policy. - CREATING - The registration policy is
         * getting created. - ACTIVE - The registration policy has been successfully created. -
         * UPDATING - The registration policy is getting updated. - NEEDS_ATTENTION - The
         * registration policy needs attention. - FAILED - The registration policy creation or
         * update has failed. - DELETING - The registration policy is getting deleted.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the lifecycle state of the registration policy */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Details about the lifecycle state of the registration policy
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** The date and time when the registration policy was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the registration policy was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time when the registration policy was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the registration policy was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionOption")
        private PolicyConnectionOption connectionOption;

        public Builder connectionOption(PolicyConnectionOption connectionOption) {
            this.connectionOption = connectionOption;
            this.__explicitlySet__.add("connectionOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegistrationPolicy build() {
            RegistrationPolicy model =
                    new RegistrationPolicy(
                            this.compartmentId,
                            this.id,
                            this.displayName,
                            this.description,
                            this.enablementLevel,
                            this.resourceId,
                            this.features,
                            this.canOverrideFeatures,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.connectionOption);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegistrationPolicy model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("enablementLevel")) {
                this.enablementLevel(model.getEnablementLevel());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("canOverrideFeatures")) {
                this.canOverrideFeatures(model.getCanOverrideFeatures());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("connectionOption")) {
                this.connectionOption(model.getConnectionOption());
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

    /** The OCID for the compartment containing the registration policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID for the compartment containing the registration policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the registration policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the registration policy.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The display name of the registration policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the registration policy.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description of the registration policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the registration policy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The resource type which has been opted in for the registration policy. - DATABASE - The
     * registration policy will be opted in at the Container Database level.
     */
    public enum EnablementLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Database("DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnablementLevel.class);

        private final String value;
        private static java.util.Map<String, EnablementLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (EnablementLevel v : EnablementLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnablementLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnablementLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnablementLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The resource type which has been opted in for the registration policy. - DATABASE - The
     * registration policy will be opted in at the Container Database level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enablementLevel")
    private final EnablementLevel enablementLevel;

    /**
     * The resource type which has been opted in for the registration policy. - DATABASE - The
     * registration policy will be opted in at the Container Database level.
     *
     * @return the value
     */
    public EnablementLevel getEnablementLevel() {
        return enablementLevel;
    }

    /** The OCID of the resource used in the registration policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the resource used in the registration policy.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The Data Safe features granted to the databases registering under the registration policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<RegistrationPolicyFeatures> features;

    /**
     * The Data Safe features granted to the databases registering under the registration policy.
     *
     * @return the value
     */
    public java.util.List<RegistrationPolicyFeatures> getFeatures() {
        return features;
    }

    /** Indicates whether features will be overridden. */
    @com.fasterxml.jackson.annotation.JsonProperty("canOverrideFeatures")
    private final Boolean canOverrideFeatures;

    /**
     * Indicates whether features will be overridden.
     *
     * @return the value
     */
    public Boolean getCanOverrideFeatures() {
        return canOverrideFeatures;
    }

    /**
     * The lifecycle state of the registration policy. - CREATING - The registration policy is
     * getting created. - ACTIVE - The registration policy has been successfully created. - UPDATING
     * - The registration policy is getting updated. - NEEDS_ATTENTION - The registration policy
     * needs attention. - FAILED - The registration policy creation or update has failed. - DELETING
     * - The registration policy is getting deleted.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle state of the registration policy. - CREATING - The registration policy is
     * getting created. - ACTIVE - The registration policy has been successfully created. - UPDATING
     * - The registration policy is getting updated. - NEEDS_ATTENTION - The registration policy
     * needs attention. - FAILED - The registration policy creation or update has failed. - DELETING
     * - The registration policy is getting deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the registration policy. - CREATING - The registration policy is
     * getting created. - ACTIVE - The registration policy has been successfully created. - UPDATING
     * - The registration policy is getting updated. - NEEDS_ATTENTION - The registration policy
     * needs attention. - FAILED - The registration policy creation or update has failed. - DELETING
     * - The registration policy is getting deleted.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the lifecycle state of the registration policy */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Details about the lifecycle state of the registration policy
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** The date and time when the registration policy was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the registration policy was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time when the registration policy was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the registration policy was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionOption")
    private final PolicyConnectionOption connectionOption;

    public PolicyConnectionOption getConnectionOption() {
        return connectionOption;
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
        sb.append("RegistrationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", enablementLevel=").append(String.valueOf(this.enablementLevel));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", canOverrideFeatures=").append(String.valueOf(this.canOverrideFeatures));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", connectionOption=").append(String.valueOf(this.connectionOption));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegistrationPolicy)) {
            return false;
        }

        RegistrationPolicy other = (RegistrationPolicy) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.enablementLevel, other.enablementLevel)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.canOverrideFeatures, other.canOverrideFeatures)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.connectionOption, other.connectionOption)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.enablementLevel == null ? 43 : this.enablementLevel.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result =
                (result * PRIME)
                        + (this.canOverrideFeatures == null
                                ? 43
                                : this.canOverrideFeatures.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionOption == null ? 43 : this.connectionOption.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
