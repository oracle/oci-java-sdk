/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Representation of ML Application Instance which providers use for instance observability. <br>
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
        builder = MlApplicationInstanceView.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MlApplicationInstanceView
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "mlApplicationInstanceId",
        "mlApplicationId",
        "mlApplicationName",
        "mlApplicationImplementationId",
        "mlApplicationImplementationName",
        "packageVersion",
        "mlApplicationImplementationVersionId",
        "authConfiguration",
        "configuration",
        "isEnabled",
        "instanceComponents",
        "compartmentId",
        "predictionEndpointDetails",
        "timeCreated",
        "lifecycleState",
        "lifecycleSubstate",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MlApplicationInstanceView(
            String id,
            String displayName,
            String mlApplicationInstanceId,
            String mlApplicationId,
            String mlApplicationName,
            String mlApplicationImplementationId,
            String mlApplicationImplementationName,
            String packageVersion,
            String mlApplicationImplementationVersionId,
            AuthConfiguration authConfiguration,
            java.util.List<ConfigurationProperty> configuration,
            Boolean isEnabled,
            java.util.List<InstanceComponent> instanceComponents,
            String compartmentId,
            PredictionEndpointDetails predictionEndpointDetails,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            LifecycleSubstate lifecycleSubstate,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.mlApplicationInstanceId = mlApplicationInstanceId;
        this.mlApplicationId = mlApplicationId;
        this.mlApplicationName = mlApplicationName;
        this.mlApplicationImplementationId = mlApplicationImplementationId;
        this.mlApplicationImplementationName = mlApplicationImplementationName;
        this.packageVersion = packageVersion;
        this.mlApplicationImplementationVersionId = mlApplicationImplementationVersionId;
        this.authConfiguration = authConfiguration;
        this.configuration = configuration;
        this.isEnabled = isEnabled;
        this.instanceComponents = instanceComponents;
        this.compartmentId = compartmentId;
        this.predictionEndpointDetails = predictionEndpointDetails;
        this.timeCreated = timeCreated;
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
         * The OCID of the MlApplicationInstanceView. Unique identifier that is immutable after
         * creation
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the MlApplicationInstanceView. Unique identifier that is immutable after
         * creation
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
         * The name of the MlApplicationInstance (created by the consumer) which this
         * MlApplicationInstanceView is mirroring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the MlApplicationInstance (created by the consumer) which this
         * MlApplicationInstanceView is mirroring.
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
         * The OCID of the MlApplicationInstance (created by the consumer) which this
         * MlApplicationInstanceView is mirroring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationInstanceId")
        private String mlApplicationInstanceId;

        /**
         * The OCID of the MlApplicationInstance (created by the consumer) which this
         * MlApplicationInstanceView is mirroring.
         *
         * @param mlApplicationInstanceId the value to set
         * @return this builder
         */
        public Builder mlApplicationInstanceId(String mlApplicationInstanceId) {
            this.mlApplicationInstanceId = mlApplicationInstanceId;
            this.__explicitlySet__.add("mlApplicationInstanceId");
            return this;
        }
        /**
         * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
         * Application. This resource is an instance of ML Application referenced by this OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
        private String mlApplicationId;

        /**
         * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
         * Application. This resource is an instance of ML Application referenced by this OCID.
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
         * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
         * Application Implementation selected as a certain solution for a given ML problem (ML
         * Application)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
        private String mlApplicationImplementationId;

        /**
         * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
         * Application Implementation selected as a certain solution for a given ML problem (ML
         * Application)
         *
         * @param mlApplicationImplementationId the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationId(String mlApplicationImplementationId) {
            this.mlApplicationImplementationId = mlApplicationImplementationId;
            this.__explicitlySet__.add("mlApplicationImplementationId");
            return this;
        }
        /**
         * This field is a copy from MlApplicationInstance created by the consumer. The name of Ml
         * Application Implemenation (based on mlApplicationImplementationId)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationName")
        private String mlApplicationImplementationName;

        /**
         * This field is a copy from MlApplicationInstance created by the consumer. The name of Ml
         * Application Implemenation (based on mlApplicationImplementationId)
         *
         * @param mlApplicationImplementationName the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationName(String mlApplicationImplementationName) {
            this.mlApplicationImplementationName = mlApplicationImplementationName;
            this.__explicitlySet__.add("mlApplicationImplementationName");
            return this;
        }
        /**
         * Version of MlApplication package which is currently used by this MlApplicationInstance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * Version of MlApplication package which is currently used by this MlApplicationInstance.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** The OCID of the MlApplicationImplementationVersion */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationVersionId")
        private String mlApplicationImplementationVersionId;

        /**
         * The OCID of the MlApplicationImplementationVersion
         *
         * @param mlApplicationImplementationVersionId the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationVersionId(
                String mlApplicationImplementationVersionId) {
            this.mlApplicationImplementationVersionId = mlApplicationImplementationVersionId;
            this.__explicitlySet__.add("mlApplicationImplementationVersionId");
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
         * This field is a copy from MlApplicationInstance created by the consumer. Data that are
         * used for provisioning of the given MlApplicationInstance. These are validated against
         * configurationSchema defined in referenced MlApplication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.List<ConfigurationProperty> configuration;

        /**
         * This field is a copy from MlApplicationInstance created by the consumer. Data that are
         * used for provisioning of the given MlApplicationInstance. These are validated against
         * configurationSchema defined in referenced MlApplication.
         *
         * @param configuration the value to set
         * @return this builder
         */
        public Builder configuration(java.util.List<ConfigurationProperty> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /**
         * This field is a copy from MlApplicationInstance created by the consumer. States whether
         * the MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * This field is a copy from MlApplicationInstance created by the consumer. States whether
         * the MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** References (Identifiers) for components dedicated to this instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceComponents")
        private java.util.List<InstanceComponent> instanceComponents;

        /**
         * References (Identifiers) for components dedicated to this instance.
         *
         * @param instanceComponents the value to set
         * @return this builder
         */
        public Builder instanceComponents(java.util.List<InstanceComponent> instanceComponents) {
            this.instanceComponents = instanceComponents;
            this.__explicitlySet__.add("instanceComponents");
            return this;
        }
        /** The OCID of the compartment where the MlApplicationInstanceView is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the MlApplicationInstanceView is created.
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
        /**
         * The time the the MlApplicationInstanceView was created. An RFC3339 formatted datetime
         * string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the MlApplicationInstanceView was created. An RFC3339 formatted datetime
         * string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the MlApplicationInstance(View). */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MlApplicationInstance(View).
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
         * The current substate of the MlApplicationInstance(View). The substate has
         * MlApplicationInstance(View) specific values in comparison with lifecycleState which has
         * standard values common for all OCI resources. The NEEDS_ATTENTION and FAILED substates
         * are deprecated in favor of (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be
         * removed in next release.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
        private LifecycleSubstate lifecycleSubstate;

        /**
         * The current substate of the MlApplicationInstance(View). The substate has
         * MlApplicationInstance(View) specific values in comparison with lifecycleState which has
         * standard values common for all OCI resources. The NEEDS_ATTENTION and FAILED substates
         * are deprecated in favor of (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be
         * removed in next release.
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

        public MlApplicationInstanceView build() {
            MlApplicationInstanceView model =
                    new MlApplicationInstanceView(
                            this.id,
                            this.displayName,
                            this.mlApplicationInstanceId,
                            this.mlApplicationId,
                            this.mlApplicationName,
                            this.mlApplicationImplementationId,
                            this.mlApplicationImplementationName,
                            this.packageVersion,
                            this.mlApplicationImplementationVersionId,
                            this.authConfiguration,
                            this.configuration,
                            this.isEnabled,
                            this.instanceComponents,
                            this.compartmentId,
                            this.predictionEndpointDetails,
                            this.timeCreated,
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
        public Builder copy(MlApplicationInstanceView model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationInstanceId")) {
                this.mlApplicationInstanceId(model.getMlApplicationInstanceId());
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
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationImplementationVersionId")) {
                this.mlApplicationImplementationVersionId(
                        model.getMlApplicationImplementationVersionId());
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
            if (model.wasPropertyExplicitlySet("instanceComponents")) {
                this.instanceComponents(model.getInstanceComponents());
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

    /**
     * The OCID of the MlApplicationInstanceView. Unique identifier that is immutable after creation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the MlApplicationInstanceView. Unique identifier that is immutable after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The name of the MlApplicationInstance (created by the consumer) which this
     * MlApplicationInstanceView is mirroring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the MlApplicationInstance (created by the consumer) which this
     * MlApplicationInstanceView is mirroring.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the MlApplicationInstance (created by the consumer) which this
     * MlApplicationInstanceView is mirroring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationInstanceId")
    private final String mlApplicationInstanceId;

    /**
     * The OCID of the MlApplicationInstance (created by the consumer) which this
     * MlApplicationInstanceView is mirroring.
     *
     * @return the value
     */
    public String getMlApplicationInstanceId() {
        return mlApplicationInstanceId;
    }

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
     * Application. This resource is an instance of ML Application referenced by this OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
    private final String mlApplicationId;

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
     * Application. This resource is an instance of ML Application referenced by this OCID.
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
     * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
     * Application Implementation selected as a certain solution for a given ML problem (ML
     * Application)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
    private final String mlApplicationImplementationId;

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. The OCID of ML
     * Application Implementation selected as a certain solution for a given ML problem (ML
     * Application)
     *
     * @return the value
     */
    public String getMlApplicationImplementationId() {
        return mlApplicationImplementationId;
    }

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. The name of Ml
     * Application Implemenation (based on mlApplicationImplementationId)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationName")
    private final String mlApplicationImplementationName;

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. The name of Ml
     * Application Implemenation (based on mlApplicationImplementationId)
     *
     * @return the value
     */
    public String getMlApplicationImplementationName() {
        return mlApplicationImplementationName;
    }

    /** Version of MlApplication package which is currently used by this MlApplicationInstance. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * Version of MlApplication package which is currently used by this MlApplicationInstance.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The OCID of the MlApplicationImplementationVersion */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationVersionId")
    private final String mlApplicationImplementationVersionId;

    /**
     * The OCID of the MlApplicationImplementationVersion
     *
     * @return the value
     */
    public String getMlApplicationImplementationVersionId() {
        return mlApplicationImplementationVersionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authConfiguration")
    private final AuthConfiguration authConfiguration;

    public AuthConfiguration getAuthConfiguration() {
        return authConfiguration;
    }

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. Data that are used
     * for provisioning of the given MlApplicationInstance. These are validated against
     * configurationSchema defined in referenced MlApplication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.List<ConfigurationProperty> configuration;

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. Data that are used
     * for provisioning of the given MlApplicationInstance. These are validated against
     * configurationSchema defined in referenced MlApplication.
     *
     * @return the value
     */
    public java.util.List<ConfigurationProperty> getConfiguration() {
        return configuration;
    }

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. States whether the
     * MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * This field is a copy from MlApplicationInstance created by the consumer. States whether the
     * MlApplicationInstance is supposed to be in ACTIVE lifecycle state.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** References (Identifiers) for components dedicated to this instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceComponents")
    private final java.util.List<InstanceComponent> instanceComponents;

    /**
     * References (Identifiers) for components dedicated to this instance.
     *
     * @return the value
     */
    public java.util.List<InstanceComponent> getInstanceComponents() {
        return instanceComponents;
    }

    /** The OCID of the compartment where the MlApplicationInstanceView is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the MlApplicationInstanceView is created.
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

    /**
     * The time the the MlApplicationInstanceView was created. An RFC3339 formatted datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the MlApplicationInstanceView was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the MlApplicationInstance(View). */
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
    /** The current state of the MlApplicationInstance(View). */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MlApplicationInstance(View).
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current substate of the MlApplicationInstance(View). The substate has
     * MlApplicationInstance(View) specific values in comparison with lifecycleState which has
     * standard values common for all OCI resources. The NEEDS_ATTENTION and FAILED substates are
     * deprecated in favor of (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in
     * next release.
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
     * The current substate of the MlApplicationInstance(View). The substate has
     * MlApplicationInstance(View) specific values in comparison with lifecycleState which has
     * standard values common for all OCI resources. The NEEDS_ATTENTION and FAILED substates are
     * deprecated in favor of (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in
     * next release.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
    private final LifecycleSubstate lifecycleSubstate;

    /**
     * The current substate of the MlApplicationInstance(View). The substate has
     * MlApplicationInstance(View) specific values in comparison with lifecycleState which has
     * standard values common for all OCI resources. The NEEDS_ATTENTION and FAILED substates are
     * deprecated in favor of (NON_)?RECOVERABLE_(PROVIDER|SERVICE)_ISSUE and will be removed in
     * next release.
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
        sb.append("MlApplicationInstanceView(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", mlApplicationInstanceId=")
                .append(String.valueOf(this.mlApplicationInstanceId));
        sb.append(", mlApplicationId=").append(String.valueOf(this.mlApplicationId));
        sb.append(", mlApplicationName=").append(String.valueOf(this.mlApplicationName));
        sb.append(", mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(", mlApplicationImplementationName=")
                .append(String.valueOf(this.mlApplicationImplementationName));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", mlApplicationImplementationVersionId=")
                .append(String.valueOf(this.mlApplicationImplementationVersionId));
        sb.append(", authConfiguration=").append(String.valueOf(this.authConfiguration));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", instanceComponents=").append(String.valueOf(this.instanceComponents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", predictionEndpointDetails=")
                .append(String.valueOf(this.predictionEndpointDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
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
        if (!(o instanceof MlApplicationInstanceView)) {
            return false;
        }

        MlApplicationInstanceView other = (MlApplicationInstanceView) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.mlApplicationInstanceId, other.mlApplicationInstanceId)
                && java.util.Objects.equals(this.mlApplicationId, other.mlApplicationId)
                && java.util.Objects.equals(this.mlApplicationName, other.mlApplicationName)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationName, other.mlApplicationImplementationName)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationVersionId,
                        other.mlApplicationImplementationVersionId)
                && java.util.Objects.equals(this.authConfiguration, other.authConfiguration)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.instanceComponents, other.instanceComponents)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.predictionEndpointDetails, other.predictionEndpointDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
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
                        + (this.mlApplicationInstanceId == null
                                ? 43
                                : this.mlApplicationInstanceId.hashCode());
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
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationVersionId == null
                                ? 43
                                : this.mlApplicationImplementationVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.authConfiguration == null ? 43 : this.authConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceComponents == null
                                ? 43
                                : this.instanceComponents.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.predictionEndpointDetails == null
                                ? 43
                                : this.predictionEndpointDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
