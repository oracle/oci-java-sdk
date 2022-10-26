/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The stack object. Stacks represent definitions of groups of Oracle Cloud Infrastructure resources
 * that you can act upon as a group. You take action on stacks by using jobs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Stack.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Stack extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "timeCreated",
        "lifecycleState",
        "configSource",
        "customTerraformProvider",
        "isThirdPartyProviderExperienceEnabled",
        "variables",
        "terraformVersion",
        "stackDriftStatus",
        "timeDriftLastChecked",
        "freeformTags",
        "definedTags"
    })
    public Stack(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            ConfigSource configSource,
            CustomTerraformProvider customTerraformProvider,
            Boolean isThirdPartyProviderExperienceEnabled,
            java.util.Map<String, String> variables,
            String terraformVersion,
            StackDriftStatus stackDriftStatus,
            java.util.Date timeDriftLastChecked,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.configSource = configSource;
        this.customTerraformProvider = customTerraformProvider;
        this.isThirdPartyProviderExperienceEnabled = isThirdPartyProviderExperienceEnabled;
        this.variables = variables;
        this.terraformVersion = terraformVersion;
        this.stackDriftStatus = stackDriftStatus;
        this.timeDriftLastChecked = timeDriftLastChecked;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the stack.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the stack.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the compartment where the stack is located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the compartment where the stack is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Human-readable name of the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Human-readable name of the stack.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the stack.
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
         * The date and time at which the stack was created. Format is defined by RFC3339. Example:
         * {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time at which the stack was created. Format is defined by RFC3339. Example:
         * {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current lifecycle state of the stack. For more information about stack lifecycle
         * states in Resource Manager, see [Key
         * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__StackStates).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the stack. For more information about stack lifecycle
         * states in Resource Manager, see [Key
         * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__StackStates).
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configSource")
        private ConfigSource configSource;

        public Builder configSource(ConfigSource configSource) {
            this.configSource = configSource;
            this.__explicitlySet__.add("configSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customTerraformProvider")
        private CustomTerraformProvider customTerraformProvider;

        public Builder customTerraformProvider(CustomTerraformProvider customTerraformProvider) {
            this.customTerraformProvider = customTerraformProvider;
            this.__explicitlySet__.add("customTerraformProvider");
            return this;
        }
        /**
         * When {@code true}, the stack sources third-party Terraform providers from [Terraform
         * Registry](https://registry.terraform.io/browse/providers) and allows {@link
         * #customTerraformProvider(CustomTerraformProviderRequest) customTerraformProvider}. For
         * more information about stack sourcing of third-party Terraform providers, see
         * [Third-party Provider
         * Configuration](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#third-party-providers).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isThirdPartyProviderExperienceEnabled")
        private Boolean isThirdPartyProviderExperienceEnabled;

        /**
         * When {@code true}, the stack sources third-party Terraform providers from [Terraform
         * Registry](https://registry.terraform.io/browse/providers) and allows {@link
         * #customTerraformProvider(CustomTerraformProviderRequest) customTerraformProvider}. For
         * more information about stack sourcing of third-party Terraform providers, see
         * [Third-party Provider
         * Configuration](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#third-party-providers).
         *
         * @param isThirdPartyProviderExperienceEnabled the value to set
         * @return this builder
         */
        public Builder isThirdPartyProviderExperienceEnabled(
                Boolean isThirdPartyProviderExperienceEnabled) {
            this.isThirdPartyProviderExperienceEnabled = isThirdPartyProviderExperienceEnabled;
            this.__explicitlySet__.add("isThirdPartyProviderExperienceEnabled");
            return this;
        }
        /**
         * Terraform variables associated with this resource. Maximum number of variables supported
         * is 250. The maximum size of each variable, including both name and value, is 8192 bytes.
         * Example: {@code {"CompartmentId": "compartment-id-value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.Map<String, String> variables;

        /**
         * Terraform variables associated with this resource. Maximum number of variables supported
         * is 250. The maximum size of each variable, including both name and value, is 8192 bytes.
         * Example: {@code {"CompartmentId": "compartment-id-value"}}
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.Map<String, String> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }
        /** The version of Terraform specified for the stack. Example: {@code 0.12.x} */
        @com.fasterxml.jackson.annotation.JsonProperty("terraformVersion")
        private String terraformVersion;

        /**
         * The version of Terraform specified for the stack. Example: {@code 0.12.x}
         *
         * @param terraformVersion the value to set
         * @return this builder
         */
        public Builder terraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            this.__explicitlySet__.add("terraformVersion");
            return this;
        }
        /**
         * Drift status of the stack. Drift refers to differences between the actual (current) state
         * of the stack and the expected (defined) state of the stack.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackDriftStatus")
        private StackDriftStatus stackDriftStatus;

        /**
         * Drift status of the stack. Drift refers to differences between the actual (current) state
         * of the stack and the expected (defined) state of the stack.
         *
         * @param stackDriftStatus the value to set
         * @return this builder
         */
        public Builder stackDriftStatus(StackDriftStatus stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            this.__explicitlySet__.add("stackDriftStatus");
            return this;
        }
        /**
         * The date and time when the drift detection was last executed. Format is defined by
         * RFC3339. Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDriftLastChecked")
        private java.util.Date timeDriftLastChecked;

        /**
         * The date and time when the drift detection was last executed. Format is defined by
         * RFC3339. Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeDriftLastChecked the value to set
         * @return this builder
         */
        public Builder timeDriftLastChecked(java.util.Date timeDriftLastChecked) {
            this.timeDriftLastChecked = timeDriftLastChecked;
            this.__explicitlySet__.add("timeDriftLastChecked");
            return this;
        }
        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public Stack build() {
            Stack model =
                    new Stack(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.lifecycleState,
                            this.configSource,
                            this.customTerraformProvider,
                            this.isThirdPartyProviderExperienceEnabled,
                            this.variables,
                            this.terraformVersion,
                            this.stackDriftStatus,
                            this.timeDriftLastChecked,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Stack model) {
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("configSource")) {
                this.configSource(model.getConfigSource());
            }
            if (model.wasPropertyExplicitlySet("customTerraformProvider")) {
                this.customTerraformProvider(model.getCustomTerraformProvider());
            }
            if (model.wasPropertyExplicitlySet("isThirdPartyProviderExperienceEnabled")) {
                this.isThirdPartyProviderExperienceEnabled(
                        model.getIsThirdPartyProviderExperienceEnabled());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("terraformVersion")) {
                this.terraformVersion(model.getTerraformVersion());
            }
            if (model.wasPropertyExplicitlySet("stackDriftStatus")) {
                this.stackDriftStatus(model.getStackDriftStatus());
            }
            if (model.wasPropertyExplicitlySet("timeDriftLastChecked")) {
                this.timeDriftLastChecked(model.getTimeDriftLastChecked());
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

    /**
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * stack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * stack.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * compartment where the stack is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * compartment where the stack is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Human-readable name of the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Human-readable name of the stack.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the stack.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The date and time at which the stack was created. Format is defined by RFC3339. Example:
     * {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time at which the stack was created. Format is defined by RFC3339. Example:
     * {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current lifecycle state of the stack. For more information about stack lifecycle states
     * in Resource Manager, see [Key
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__StackStates).
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current lifecycle state of the stack. For more information about stack lifecycle states
     * in Resource Manager, see [Key
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__StackStates).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the stack. For more information about stack lifecycle states
     * in Resource Manager, see [Key
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__StackStates).
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configSource")
    private final ConfigSource configSource;

    public ConfigSource getConfigSource() {
        return configSource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customTerraformProvider")
    private final CustomTerraformProvider customTerraformProvider;

    public CustomTerraformProvider getCustomTerraformProvider() {
        return customTerraformProvider;
    }

    /**
     * When {@code true}, the stack sources third-party Terraform providers from [Terraform
     * Registry](https://registry.terraform.io/browse/providers) and allows {@link
     * #customTerraformProvider(CustomTerraformProviderRequest) customTerraformProvider}. For more
     * information about stack sourcing of third-party Terraform providers, see [Third-party
     * Provider
     * Configuration](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#third-party-providers).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isThirdPartyProviderExperienceEnabled")
    private final Boolean isThirdPartyProviderExperienceEnabled;

    /**
     * When {@code true}, the stack sources third-party Terraform providers from [Terraform
     * Registry](https://registry.terraform.io/browse/providers) and allows {@link
     * #customTerraformProvider(CustomTerraformProviderRequest) customTerraformProvider}. For more
     * information about stack sourcing of third-party Terraform providers, see [Third-party
     * Provider
     * Configuration](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#third-party-providers).
     *
     * @return the value
     */
    public Boolean getIsThirdPartyProviderExperienceEnabled() {
        return isThirdPartyProviderExperienceEnabled;
    }

    /**
     * Terraform variables associated with this resource. Maximum number of variables supported is
     * 250. The maximum size of each variable, including both name and value, is 8192 bytes.
     * Example: {@code {"CompartmentId": "compartment-id-value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, String> variables;

    /**
     * Terraform variables associated with this resource. Maximum number of variables supported is
     * 250. The maximum size of each variable, including both name and value, is 8192 bytes.
     * Example: {@code {"CompartmentId": "compartment-id-value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /** The version of Terraform specified for the stack. Example: {@code 0.12.x} */
    @com.fasterxml.jackson.annotation.JsonProperty("terraformVersion")
    private final String terraformVersion;

    /**
     * The version of Terraform specified for the stack. Example: {@code 0.12.x}
     *
     * @return the value
     */
    public String getTerraformVersion() {
        return terraformVersion;
    }

    /**
     * Drift status of the stack. Drift refers to differences between the actual (current) state of
     * the stack and the expected (defined) state of the stack.
     */
    public enum StackDriftStatus implements com.oracle.bmc.http.internal.BmcEnum {
        NotChecked("NOT_CHECKED"),
        InSync("IN_SYNC"),
        Drifted("DRIFTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StackDriftStatus.class);

        private final String value;
        private static java.util.Map<String, StackDriftStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (StackDriftStatus v : StackDriftStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StackDriftStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StackDriftStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StackDriftStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Drift status of the stack. Drift refers to differences between the actual (current) state of
     * the stack and the expected (defined) state of the stack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackDriftStatus")
    private final StackDriftStatus stackDriftStatus;

    /**
     * Drift status of the stack. Drift refers to differences between the actual (current) state of
     * the stack and the expected (defined) state of the stack.
     *
     * @return the value
     */
    public StackDriftStatus getStackDriftStatus() {
        return stackDriftStatus;
    }

    /**
     * The date and time when the drift detection was last executed. Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDriftLastChecked")
    private final java.util.Date timeDriftLastChecked;

    /**
     * The date and time when the drift detection was last executed. Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeDriftLastChecked() {
        return timeDriftLastChecked;
    }

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("Stack(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", configSource=").append(String.valueOf(this.configSource));
        sb.append(", customTerraformProvider=")
                .append(String.valueOf(this.customTerraformProvider));
        sb.append(", isThirdPartyProviderExperienceEnabled=")
                .append(String.valueOf(this.isThirdPartyProviderExperienceEnabled));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", terraformVersion=").append(String.valueOf(this.terraformVersion));
        sb.append(", stackDriftStatus=").append(String.valueOf(this.stackDriftStatus));
        sb.append(", timeDriftLastChecked=").append(String.valueOf(this.timeDriftLastChecked));
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
        if (!(o instanceof Stack)) {
            return false;
        }

        Stack other = (Stack) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.configSource, other.configSource)
                && java.util.Objects.equals(
                        this.customTerraformProvider, other.customTerraformProvider)
                && java.util.Objects.equals(
                        this.isThirdPartyProviderExperienceEnabled,
                        other.isThirdPartyProviderExperienceEnabled)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.terraformVersion, other.terraformVersion)
                && java.util.Objects.equals(this.stackDriftStatus, other.stackDriftStatus)
                && java.util.Objects.equals(this.timeDriftLastChecked, other.timeDriftLastChecked)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.configSource == null ? 43 : this.configSource.hashCode());
        result =
                (result * PRIME)
                        + (this.customTerraformProvider == null
                                ? 43
                                : this.customTerraformProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.isThirdPartyProviderExperienceEnabled == null
                                ? 43
                                : this.isThirdPartyProviderExperienceEnabled.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result =
                (result * PRIME)
                        + (this.terraformVersion == null ? 43 : this.terraformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.stackDriftStatus == null ? 43 : this.stackDriftStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDriftLastChecked == null
                                ? 43
                                : this.timeDriftLastChecked.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
