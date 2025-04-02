/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Resource representing instance of ML Application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MlApplicationInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MlApplicationInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "mlApplicationId",
        "mlApplicationName",
        "mlApplicationImplementationId",
        "mlApplicationImplementationName",
        "authConfiguration",
        "configuration",
        "isEnabled",
        "compartmentId",
        "predictionEndpointDetails",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleSubstate",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MlApplicationInstance(
            String id,
            String displayName,
            String mlApplicationId,
            String mlApplicationName,
            String mlApplicationImplementationId,
            String mlApplicationImplementationName,
            AuthConfiguration authConfiguration,
            java.util.List<ConfigurationProperty> configuration,
            Boolean isEnabled,
            String compartmentId,
            PredictionEndpointDetails predictionEndpointDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            LifecycleSubstate lifecycleSubstate,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.mlApplicationId = mlApplicationId;
        this.mlApplicationName = mlApplicationName;
        this.mlApplicationImplementationId = mlApplicationImplementationId;
        this.mlApplicationImplementationName = mlApplicationImplementationName;
        this.authConfiguration = authConfiguration;
        this.configuration = configuration;
        this.isEnabled = isEnabled;
        this.compartmentId = compartmentId;
        this.predictionEndpointDetails = predictionEndpointDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubstate = lifecycleSubstate;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the MlApplicationInstance. Unique identifier that is immutable after creation
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the MlApplicationInstance. Unique identifier that is immutable after creation
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
         * The name of MlApplicationInstance. System will generate displayName when not provided
         * during creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of MlApplicationInstance. System will generate displayName when not provided
         * during creation.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of ML Application. This resource is an instance of ML Application referenced by
         * this OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
        private String mlApplicationId;

        /**
         * The OCID of ML Application. This resource is an instance of ML Application referenced by
         * this OCID.
         *
         * @param mlApplicationId the value to set
         * @return this builder
         */
        public Builder mlApplicationId(String mlApplicationId) {
            this.mlApplicationId = mlApplicationId;
            this.__explicitlySet__.add("mlApplicationId");
            return this;
        }
        /** The name of ML Application (based on mlApplicationId). */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationName")
        private String mlApplicationName;

        /**
         * The name of ML Application (based on mlApplicationId).
         *
         * @param mlApplicationName the value to set
         * @return this builder
         */
        public Builder mlApplicationName(String mlApplicationName) {
            this.mlApplicationName = mlApplicationName;
            this.__explicitlySet__.add("mlApplicationName");
            return this;
        }
        /**
         * The OCID of ML Application Implementation selected as a certain solution for a given ML
         * problem (ML Application)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
        private String mlApplicationImplementationId;

        /**
         * The OCID of ML Application Implementation selected as a certain solution for a given ML
         * problem (ML Application)
         *
         * @param mlApplicationImplementationId the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationId(String mlApplicationImplementationId) {
            this.mlApplicationImplementationId = mlApplicationImplementationId;
            this.__explicitlySet__.add("mlApplicationImplementationId");
            return this;
        }
        /** The name of Ml Application Implementation (based on mlApplicationImplementationId) */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationName")
        private String mlApplicationImplementationName;

        /**
         * The name of Ml Application Implementation (based on mlApplicationImplementationId)
         *
         * @param mlApplicationImplementationName the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationName(String mlApplicationImplementationName) {
            this.mlApplicationImplementationName = mlApplicationImplementationName;
            this.__explicitlySet__.add("mlApplicationImplementationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authConfiguration")
        private AuthConfiguration authConfiguration;

        public Builder authConfiguration(AuthConfiguration authConfiguration) {
            this.authConfiguration = authConfiguration;
            this.__explicitlySet__.add("authConfiguration");
            return this;
        }
        /**
         * Data that are used for provisioning of the given MlApplicationInstance. These are
         * validated against configurationSchema defined in referenced MlApplicationImplementation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.List<ConfigurationProperty> configuration;

        /**
         * Data that are used for provisioning of the given MlApplicationInstance. These are
         * validated against configurationSchema defined in referenced MlApplicationImplementation.
         *
         * @param configuration the value to set
         * @return this builder
         */
        public Builder configuration(java.util.List<ConfigurationProperty> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /** States whether the MlApplicationInstance is supposed to be in ACTIVE lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * States whether the MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The OCID of the compartment where the MlApplicationInstance is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the MlApplicationInstance is created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("predictionEndpointDetails")
        private PredictionEndpointDetails predictionEndpointDetails;

        public Builder predictionEndpointDetails(
                PredictionEndpointDetails predictionEndpointDetails) {
            this.predictionEndpointDetails = predictionEndpointDetails;
            this.__explicitlySet__.add("predictionEndpointDetails");
            return this;
        }
        /** The time the the MlApplication was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the MlApplication was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Time of last MlApplicationInstance update in the format defined by RFC 3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time of last MlApplicationInstance update in the format defined by RFC 3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the MlApplicationInstance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MlApplicationInstance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current substate of the MlApplicationInstance. The substate has MlApplicationInstance
         * specific values in comparison with lifecycleState which has standard values common for
         * all OCI resources. The NEEDS_ATTENTION and FAILED substates are deprecated in favor of
         * (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in next release.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
        private LifecycleSubstate lifecycleSubstate;

        /**
         * The current substate of the MlApplicationInstance. The substate has MlApplicationInstance
         * specific values in comparison with lifecycleState which has standard values common for
         * all OCI resources. The NEEDS_ATTENTION and FAILED substates are deprecated in favor of
         * (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in next release.
         *
         * @param lifecycleSubstate the value to set
         * @return this builder
         */
        public Builder lifecycleSubstate(LifecycleSubstate lifecycleSubstate) {
            this.lifecycleSubstate = lifecycleSubstate;
            this.__explicitlySet__.add("lifecycleSubstate");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MlApplicationInstance build() {
            MlApplicationInstance model =
                    new MlApplicationInstance(
                            this.id,
                            this.displayName,
                            this.mlApplicationId,
                            this.mlApplicationName,
                            this.mlApplicationImplementationId,
                            this.mlApplicationImplementationName,
                            this.authConfiguration,
                            this.configuration,
                            this.isEnabled,
                            this.compartmentId,
                            this.predictionEndpointDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleSubstate,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MlApplicationInstance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationId")) {
                this.mlApplicationId(model.getMlApplicationId());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationName")) {
                this.mlApplicationName(model.getMlApplicationName());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationImplementationId")) {
                this.mlApplicationImplementationId(model.getMlApplicationImplementationId());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationImplementationName")) {
                this.mlApplicationImplementationName(model.getMlApplicationImplementationName());
            }
            if (model.wasPropertyExplicitlySet("authConfiguration")) {
                this.authConfiguration(model.getAuthConfiguration());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("predictionEndpointDetails")) {
                this.predictionEndpointDetails(model.getPredictionEndpointDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleSubstate")) {
                this.lifecycleSubstate(model.getLifecycleSubstate());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the MlApplicationInstance. Unique identifier that is immutable after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the MlApplicationInstance. Unique identifier that is immutable after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The name of MlApplicationInstance. System will generate displayName when not provided during
     * creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of MlApplicationInstance. System will generate displayName when not provided during
     * creation.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of ML Application. This resource is an instance of ML Application referenced by this
     * OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
    private final String mlApplicationId;

    /**
     * The OCID of ML Application. This resource is an instance of ML Application referenced by this
     * OCID.
     *
     * @return the value
     */
    public String getMlApplicationId() {
        return mlApplicationId;
    }

    /** The name of ML Application (based on mlApplicationId). */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationName")
    private final String mlApplicationName;

    /**
     * The name of ML Application (based on mlApplicationId).
     *
     * @return the value
     */
    public String getMlApplicationName() {
        return mlApplicationName;
    }

    /**
     * The OCID of ML Application Implementation selected as a certain solution for a given ML
     * problem (ML Application)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
    private final String mlApplicationImplementationId;

    /**
     * The OCID of ML Application Implementation selected as a certain solution for a given ML
     * problem (ML Application)
     *
     * @return the value
     */
    public String getMlApplicationImplementationId() {
        return mlApplicationImplementationId;
    }

    /** The name of Ml Application Implementation (based on mlApplicationImplementationId) */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationName")
    private final String mlApplicationImplementationName;

    /**
     * The name of Ml Application Implementation (based on mlApplicationImplementationId)
     *
     * @return the value
     */
    public String getMlApplicationImplementationName() {
        return mlApplicationImplementationName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authConfiguration")
    private final AuthConfiguration authConfiguration;

    public AuthConfiguration getAuthConfiguration() {
        return authConfiguration;
    }

    /**
     * Data that are used for provisioning of the given MlApplicationInstance. These are validated
     * against configurationSchema defined in referenced MlApplicationImplementation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.List<ConfigurationProperty> configuration;

    /**
     * Data that are used for provisioning of the given MlApplicationInstance. These are validated
     * against configurationSchema defined in referenced MlApplicationImplementation.
     *
     * @return the value
     */
    public java.util.List<ConfigurationProperty> getConfiguration() {
        return configuration;
    }

    /** States whether the MlApplicationInstance is supposed to be in ACTIVE lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * States whether the MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The OCID of the compartment where the MlApplicationInstance is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the MlApplicationInstance is created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("predictionEndpointDetails")
    private final PredictionEndpointDetails predictionEndpointDetails;

    public PredictionEndpointDetails getPredictionEndpointDetails() {
        return predictionEndpointDetails;
    }

    /** The time the the MlApplication was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the MlApplication was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Time of last MlApplicationInstance update in the format defined by RFC 3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time of last MlApplicationInstance update in the format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the MlApplicationInstance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        NeedsAttention("NEEDS_ATTENTION"),
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
    /** The current state of the MlApplicationInstance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MlApplicationInstance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current substate of the MlApplicationInstance. The substate has MlApplicationInstance
     * specific values in comparison with lifecycleState which has standard values common for all
     * OCI resources. The NEEDS_ATTENTION and FAILED substates are deprecated in favor of
     * (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in next release.
     */
    public enum LifecycleSubstate implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Upgrading("UPGRADING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),
        NonRecoverableProviderIssue("NON_RECOVERABLE_PROVIDER_ISSUE"),
        RecoverableProviderIssue("RECOVERABLE_PROVIDER_ISSUE"),
        NonRecoverableServiceIssue("NON_RECOVERABLE_SERVICE_ISSUE"),
        RecoverableServiceIssue("RECOVERABLE_SERVICE_ISSUE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleSubstate.class);

        private final String value;
        private static java.util.Map<String, LifecycleSubstate> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleSubstate v : LifecycleSubstate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleSubstate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleSubstate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleSubstate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current substate of the MlApplicationInstance. The substate has MlApplicationInstance
     * specific values in comparison with lifecycleState which has standard values common for all
     * OCI resources. The NEEDS_ATTENTION and FAILED substates are deprecated in favor of
     * (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in next release.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
    private final LifecycleSubstate lifecycleSubstate;

    /**
     * The current substate of the MlApplicationInstance. The substate has MlApplicationInstance
     * specific values in comparison with lifecycleState which has standard values common for all
     * OCI resources. The NEEDS_ATTENTION and FAILED substates are deprecated in favor of
     * (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in next release.
     *
     * @return the value
     */
    public LifecycleSubstate getLifecycleSubstate() {
        return lifecycleSubstate;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MlApplicationInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", mlApplicationId=").append(String.valueOf(this.mlApplicationId));
        sb.append(", mlApplicationName=").append(String.valueOf(this.mlApplicationName));
        sb.append(", mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(", mlApplicationImplementationName=")
                .append(String.valueOf(this.mlApplicationImplementationName));
        sb.append(", authConfiguration=").append(String.valueOf(this.authConfiguration));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", predictionEndpointDetails=")
                .append(String.valueOf(this.predictionEndpointDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubstate=").append(String.valueOf(this.lifecycleSubstate));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MlApplicationInstance)) {
            return false;
        }

        MlApplicationInstance other = (MlApplicationInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.mlApplicationId, other.mlApplicationId)
                && java.util.Objects.equals(this.mlApplicationName, other.mlApplicationName)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationName, other.mlApplicationImplementationName)
                && java.util.Objects.equals(this.authConfiguration, other.authConfiguration)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.predictionEndpointDetails, other.predictionEndpointDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubstate, other.lifecycleSubstate)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
                        + (this.mlApplicationId == null ? 43 : this.mlApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationName == null ? 43 : this.mlApplicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationId == null
                                ? 43
                                : this.mlApplicationImplementationId.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationName == null
                                ? 43
                                : this.mlApplicationImplementationName.hashCode());
        result =
                (result * PRIME)
                        + (this.authConfiguration == null ? 43 : this.authConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.predictionEndpointDetails == null
                                ? 43
                                : this.predictionEndpointDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubstate == null ? 43 : this.lifecycleSubstate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
