/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Creation details for a stack. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateStackDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStackDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "configSource",
        "customTerraformProvider",
        "variables",
        "terraformVersion",
        "freeformTags",
        "definedTags"
    })
    public CreateStackDetails(
            String compartmentId,
            String displayName,
            String description,
            CreateConfigSourceDetails configSource,
            CustomTerraformProvider customTerraformProvider,
            java.util.Map<String, String> variables,
            String terraformVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.configSource = configSource;
        this.customTerraformProvider = customTerraformProvider;
        this.variables = variables;
        this.terraformVersion = terraformVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * compartment in which the stack resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Unique identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * compartment in which the stack resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The stack's display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The stack's display name.
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

        @com.fasterxml.jackson.annotation.JsonProperty("configSource")
        private CreateConfigSourceDetails configSource;

        public Builder configSource(CreateConfigSourceDetails configSource) {
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
        /** The version of Terraform to use with the stack. Example: {@code 0.12.x} */
        @com.fasterxml.jackson.annotation.JsonProperty("terraformVersion")
        private String terraformVersion;

        /**
         * The version of Terraform to use with the stack. Example: {@code 0.12.x}
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
         * Free-form tags associated with this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
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
         * Defined tags associated with this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags associated with this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateStackDetails build() {
            CreateStackDetails model =
                    new CreateStackDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.configSource,
                            this.customTerraformProvider,
                            this.variables,
                            this.terraformVersion,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStackDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("configSource")) {
                this.configSource(model.getConfigSource());
            }
            if (model.wasPropertyExplicitlySet("customTerraformProvider")) {
                this.customTerraformProvider(model.getCustomTerraformProvider());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("terraformVersion")) {
                this.terraformVersion(model.getTerraformVersion());
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
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * compartment in which the stack resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Unique identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * compartment in which the stack resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The stack's display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The stack's display name.
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

    @com.fasterxml.jackson.annotation.JsonProperty("configSource")
    private final CreateConfigSourceDetails configSource;

    public CreateConfigSourceDetails getConfigSource() {
        return configSource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customTerraformProvider")
    private final CustomTerraformProvider customTerraformProvider;

    public CustomTerraformProvider getCustomTerraformProvider() {
        return customTerraformProvider;
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

    /** The version of Terraform to use with the stack. Example: {@code 0.12.x} */
    @com.fasterxml.jackson.annotation.JsonProperty("terraformVersion")
    private final String terraformVersion;

    /**
     * The version of Terraform to use with the stack. Example: {@code 0.12.x}
     *
     * @return the value
     */
    public String getTerraformVersion() {
        return terraformVersion;
    }

    /**
     * Free-form tags associated with this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags associated with this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags associated with this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
        sb.append("CreateStackDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", configSource=").append(String.valueOf(this.configSource));
        sb.append(", customTerraformProvider=")
                .append(String.valueOf(this.customTerraformProvider));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", terraformVersion=").append(String.valueOf(this.terraformVersion));
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
        if (!(o instanceof CreateStackDetails)) {
            return false;
        }

        CreateStackDetails other = (CreateStackDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.configSource, other.configSource)
                && java.util.Objects.equals(
                        this.customTerraformProvider, other.customTerraformProvider)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.terraformVersion, other.terraformVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.configSource == null ? 43 : this.configSource.hashCode());
        result =
                (result * PRIME)
                        + (this.customTerraformProvider == null
                                ? 43
                                : this.customTerraformProvider.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result =
                (result * PRIME)
                        + (this.terraformVersion == null ? 43 : this.terraformVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
