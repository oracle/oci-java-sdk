/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The information about new MlApplicationInstance. <br>
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
        builder = CreateMlApplicationInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMlApplicationInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "mlApplicationId",
        "mlApplicationImplementationId",
        "authConfiguration",
        "configuration",
        "isEnabled",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateMlApplicationInstanceDetails(
            String displayName,
            String mlApplicationId,
            String mlApplicationImplementationId,
            CreateAuthConfigurationDetails authConfiguration,
            java.util.List<ConfigurationProperty> configuration,
            Boolean isEnabled,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.mlApplicationId = mlApplicationId;
        this.mlApplicationImplementationId = mlApplicationImplementationId;
        this.authConfiguration = authConfiguration;
        this.configuration = configuration;
        this.isEnabled = isEnabled;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of MlApplicationInstance. System will generate displayName when not provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of MlApplicationInstance. System will generate displayName when not provided.
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

        @com.fasterxml.jackson.annotation.JsonProperty("authConfiguration")
        private CreateAuthConfigurationDetails authConfiguration;

        public Builder authConfiguration(CreateAuthConfigurationDetails authConfiguration) {
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
        /**
         * Defines whether the MlApplicationInstance will be created in ACTIVE (true value) or
         * INACTIVE (false value) lifecycle state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Defines whether the MlApplicationInstance will be created in ACTIVE (true value) or
         * INACTIVE (false value) lifecycle state.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMlApplicationInstanceDetails build() {
            CreateMlApplicationInstanceDetails model =
                    new CreateMlApplicationInstanceDetails(
                            this.displayName,
                            this.mlApplicationId,
                            this.mlApplicationImplementationId,
                            this.authConfiguration,
                            this.configuration,
                            this.isEnabled,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMlApplicationInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationId")) {
                this.mlApplicationId(model.getMlApplicationId());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationImplementationId")) {
                this.mlApplicationImplementationId(model.getMlApplicationImplementationId());
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

    /** The name of MlApplicationInstance. System will generate displayName when not provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of MlApplicationInstance. System will generate displayName when not provided.
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

    @com.fasterxml.jackson.annotation.JsonProperty("authConfiguration")
    private final CreateAuthConfigurationDetails authConfiguration;

    public CreateAuthConfigurationDetails getAuthConfiguration() {
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

    /**
     * Defines whether the MlApplicationInstance will be created in ACTIVE (true value) or INACTIVE
     * (false value) lifecycle state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Defines whether the MlApplicationInstance will be created in ACTIVE (true value) or INACTIVE
     * (false value) lifecycle state.
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
        sb.append("CreateMlApplicationInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", mlApplicationId=").append(String.valueOf(this.mlApplicationId));
        sb.append(", mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(", authConfiguration=").append(String.valueOf(this.authConfiguration));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof CreateMlApplicationInstanceDetails)) {
            return false;
        }

        CreateMlApplicationInstanceDetails other = (CreateMlApplicationInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.mlApplicationId, other.mlApplicationId)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(this.authConfiguration, other.authConfiguration)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationId == null ? 43 : this.mlApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationId == null
                                ? 43
                                : this.mlApplicationImplementationId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
