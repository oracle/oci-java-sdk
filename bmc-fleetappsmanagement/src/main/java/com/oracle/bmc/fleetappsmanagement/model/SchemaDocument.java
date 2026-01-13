/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Schema Document representing Schema.yaml
 * (/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager_topic-schema.htm) <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SchemaDocument.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaDocument
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "title",
        "description",
        "stackDescription",
        "packageVersion",
        "version",
        "schemaVersion",
        "locale",
        "logoUrl",
        "source",
        "informationalText",
        "instructions",
        "troubleshooting",
        "canAllowViewState",
        "variables",
        "groupings",
        "variableGroups",
        "outputs",
        "outputGroups",
        "primaryOutputButton"
    })
    public SchemaDocument(
            String title,
            String description,
            String stackDescription,
            String packageVersion,
            String version,
            SchemaVersion schemaVersion,
            Locale locale,
            String logoUrl,
            StackSource source,
            String informationalText,
            String instructions,
            String troubleshooting,
            Boolean canAllowViewState,
            java.util.Map<String, BaseVariable> variables,
            VariableGroups groupings,
            java.util.List<VariableGroup> variableGroups,
            java.util.Map<String, BaseOutput> outputs,
            java.util.List<OutputGroup> outputGroups,
            String primaryOutputButton) {
        super();
        this.title = title;
        this.description = description;
        this.stackDescription = stackDescription;
        this.packageVersion = packageVersion;
        this.version = version;
        this.schemaVersion = schemaVersion;
        this.locale = locale;
        this.logoUrl = logoUrl;
        this.source = source;
        this.informationalText = informationalText;
        this.instructions = instructions;
        this.troubleshooting = troubleshooting;
        this.canAllowViewState = canAllowViewState;
        this.variables = variables;
        this.groupings = groupings;
        this.variableGroups = variableGroups;
        this.outputs = outputs;
        this.outputGroups = outputGroups;
        this.primaryOutputButton = primaryOutputButton;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name or title for this schema document. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The display name or title for this schema document.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /** A detailed description of the stack or schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A detailed description of the stack or schema.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Additional details describing the stack's purpose or use-case. */
        @com.fasterxml.jackson.annotation.JsonProperty("stackDescription")
        private String stackDescription;

        /**
         * Additional details describing the stack's purpose or use-case.
         *
         * @param stackDescription the value to set
         * @return this builder
         */
        public Builder stackDescription(String stackDescription) {
            this.stackDescription = stackDescription;
            this.__explicitlySet__.add("stackDescription");
            return this;
        }
        /** The version of the package associated with this schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The version of the package associated with this schema.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** The version identifier for this schema document. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version identifier for this schema document.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The version of the schema definition format in use for this document. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaVersion")
        private SchemaVersion schemaVersion;

        /**
         * The version of the schema definition format in use for this document.
         *
         * @param schemaVersion the value to set
         * @return this builder
         */
        public Builder schemaVersion(SchemaVersion schemaVersion) {
            this.schemaVersion = schemaVersion;
            this.__explicitlySet__.add("schemaVersion");
            return this;
        }
        /** The locale/language for the schema user interface (default is EN). */
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private Locale locale;

        /**
         * The locale/language for the schema user interface (default is EN).
         *
         * @param locale the value to set
         * @return this builder
         */
        public Builder locale(Locale locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }
        /** logo url. */
        @com.fasterxml.jackson.annotation.JsonProperty("logoUrl")
        private String logoUrl;

        /**
         * logo url.
         *
         * @param logoUrl the value to set
         * @return this builder
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            this.__explicitlySet__.add("logoUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private StackSource source;

        public Builder source(StackSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** Informational text or notes relevant to the stack or its use. */
        @com.fasterxml.jackson.annotation.JsonProperty("informationalText")
        private String informationalText;

        /**
         * Informational text or notes relevant to the stack or its use.
         *
         * @param informationalText the value to set
         * @return this builder
         */
        public Builder informationalText(String informationalText) {
            this.informationalText = informationalText;
            this.__explicitlySet__.add("informationalText");
            return this;
        }
        /** Setup or usage instructions for this stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("instructions")
        private String instructions;

        /**
         * Setup or usage instructions for this stack.
         *
         * @param instructions the value to set
         * @return this builder
         */
        public Builder instructions(String instructions) {
            this.instructions = instructions;
            this.__explicitlySet__.add("instructions");
            return this;
        }
        /** Troubleshooting tips, guidance, or steps for stack usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("troubleshooting")
        private String troubleshooting;

        /**
         * Troubleshooting tips, guidance, or steps for stack usage.
         *
         * @param troubleshooting the value to set
         * @return this builder
         */
        public Builder troubleshooting(String troubleshooting) {
            this.troubleshooting = troubleshooting;
            this.__explicitlySet__.add("troubleshooting");
            return this;
        }
        /** Indicates if the stack allows users to view state information. */
        @com.fasterxml.jackson.annotation.JsonProperty("canAllowViewState")
        private Boolean canAllowViewState;

        /**
         * Indicates if the stack allows users to view state information.
         *
         * @param canAllowViewState the value to set
         * @return this builder
         */
        public Builder canAllowViewState(Boolean canAllowViewState) {
            this.canAllowViewState = canAllowViewState;
            this.__explicitlySet__.add("canAllowViewState");
            return this;
        }
        /** Key-value map of input variables defined for use by the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.Map<String, BaseVariable> variables;

        /**
         * Key-value map of input variables defined for use by the stack.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.Map<String, BaseVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupings")
        private VariableGroups groupings;

        public Builder groupings(VariableGroups groupings) {
            this.groupings = groupings;
            this.__explicitlySet__.add("groupings");
            return this;
        }
        /** An array of variable group definitions for organizing variables together. */
        @com.fasterxml.jackson.annotation.JsonProperty("variableGroups")
        private java.util.List<VariableGroup> variableGroups;

        /**
         * An array of variable group definitions for organizing variables together.
         *
         * @param variableGroups the value to set
         * @return this builder
         */
        public Builder variableGroups(java.util.List<VariableGroup> variableGroups) {
            this.variableGroups = variableGroups;
            this.__explicitlySet__.add("variableGroups");
            return this;
        }
        /** A mapping of output variable names to their definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.Map<String, BaseOutput> outputs;

        /**
         * A mapping of output variable names to their definitions.
         *
         * @param outputs the value to set
         * @return this builder
         */
        public Builder outputs(java.util.Map<String, BaseOutput> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }
        /** Array of output group objects to group outputs for display or logical purposes. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputGroups")
        private java.util.List<OutputGroup> outputGroups;

        /**
         * Array of output group objects to group outputs for display or logical purposes.
         *
         * @param outputGroups the value to set
         * @return this builder
         */
        public Builder outputGroups(java.util.List<OutputGroup> outputGroups) {
            this.outputGroups = outputGroups;
            this.__explicitlySet__.add("outputGroups");
            return this;
        }
        /** primary output button value. */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryOutputButton")
        private String primaryOutputButton;

        /**
         * primary output button value.
         *
         * @param primaryOutputButton the value to set
         * @return this builder
         */
        public Builder primaryOutputButton(String primaryOutputButton) {
            this.primaryOutputButton = primaryOutputButton;
            this.__explicitlySet__.add("primaryOutputButton");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaDocument build() {
            SchemaDocument model =
                    new SchemaDocument(
                            this.title,
                            this.description,
                            this.stackDescription,
                            this.packageVersion,
                            this.version,
                            this.schemaVersion,
                            this.locale,
                            this.logoUrl,
                            this.source,
                            this.informationalText,
                            this.instructions,
                            this.troubleshooting,
                            this.canAllowViewState,
                            this.variables,
                            this.groupings,
                            this.variableGroups,
                            this.outputs,
                            this.outputGroups,
                            this.primaryOutputButton);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaDocument model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("stackDescription")) {
                this.stackDescription(model.getStackDescription());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("schemaVersion")) {
                this.schemaVersion(model.getSchemaVersion());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("logoUrl")) {
                this.logoUrl(model.getLogoUrl());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("informationalText")) {
                this.informationalText(model.getInformationalText());
            }
            if (model.wasPropertyExplicitlySet("instructions")) {
                this.instructions(model.getInstructions());
            }
            if (model.wasPropertyExplicitlySet("troubleshooting")) {
                this.troubleshooting(model.getTroubleshooting());
            }
            if (model.wasPropertyExplicitlySet("canAllowViewState")) {
                this.canAllowViewState(model.getCanAllowViewState());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("groupings")) {
                this.groupings(model.getGroupings());
            }
            if (model.wasPropertyExplicitlySet("variableGroups")) {
                this.variableGroups(model.getVariableGroups());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
            }
            if (model.wasPropertyExplicitlySet("outputGroups")) {
                this.outputGroups(model.getOutputGroups());
            }
            if (model.wasPropertyExplicitlySet("primaryOutputButton")) {
                this.primaryOutputButton(model.getPrimaryOutputButton());
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

    /** The display name or title for this schema document. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The display name or title for this schema document.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** A detailed description of the stack or schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A detailed description of the stack or schema.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Additional details describing the stack's purpose or use-case. */
    @com.fasterxml.jackson.annotation.JsonProperty("stackDescription")
    private final String stackDescription;

    /**
     * Additional details describing the stack's purpose or use-case.
     *
     * @return the value
     */
    public String getStackDescription() {
        return stackDescription;
    }

    /** The version of the package associated with this schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The version of the package associated with this schema.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The version identifier for this schema document. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version identifier for this schema document.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The version of the schema definition format in use for this document. */
    public enum SchemaVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V100("V_1_0_0"),
        V110("V_1_1_0"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SchemaVersion.class);

        private final String value;
        private static java.util.Map<String, SchemaVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (SchemaVersion v : SchemaVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SchemaVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SchemaVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SchemaVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The version of the schema definition format in use for this document. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaVersion")
    private final SchemaVersion schemaVersion;

    /**
     * The version of the schema definition format in use for this document.
     *
     * @return the value
     */
    public SchemaVersion getSchemaVersion() {
        return schemaVersion;
    }

    /** The locale/language for the schema user interface (default is EN). */
    public enum Locale implements com.oracle.bmc.http.internal.BmcEnum {
        En("EN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Locale.class);

        private final String value;
        private static java.util.Map<String, Locale> map;

        static {
            map = new java.util.HashMap<>();
            for (Locale v : Locale.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Locale(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Locale create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Locale', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The locale/language for the schema user interface (default is EN). */
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final Locale locale;

    /**
     * The locale/language for the schema user interface (default is EN).
     *
     * @return the value
     */
    public Locale getLocale() {
        return locale;
    }

    /** logo url. */
    @com.fasterxml.jackson.annotation.JsonProperty("logoUrl")
    private final String logoUrl;

    /**
     * logo url.
     *
     * @return the value
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final StackSource source;

    public StackSource getSource() {
        return source;
    }

    /** Informational text or notes relevant to the stack or its use. */
    @com.fasterxml.jackson.annotation.JsonProperty("informationalText")
    private final String informationalText;

    /**
     * Informational text or notes relevant to the stack or its use.
     *
     * @return the value
     */
    public String getInformationalText() {
        return informationalText;
    }

    /** Setup or usage instructions for this stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("instructions")
    private final String instructions;

    /**
     * Setup or usage instructions for this stack.
     *
     * @return the value
     */
    public String getInstructions() {
        return instructions;
    }

    /** Troubleshooting tips, guidance, or steps for stack usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("troubleshooting")
    private final String troubleshooting;

    /**
     * Troubleshooting tips, guidance, or steps for stack usage.
     *
     * @return the value
     */
    public String getTroubleshooting() {
        return troubleshooting;
    }

    /** Indicates if the stack allows users to view state information. */
    @com.fasterxml.jackson.annotation.JsonProperty("canAllowViewState")
    private final Boolean canAllowViewState;

    /**
     * Indicates if the stack allows users to view state information.
     *
     * @return the value
     */
    public Boolean getCanAllowViewState() {
        return canAllowViewState;
    }

    /** Key-value map of input variables defined for use by the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, BaseVariable> variables;

    /**
     * Key-value map of input variables defined for use by the stack.
     *
     * @return the value
     */
    public java.util.Map<String, BaseVariable> getVariables() {
        return variables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("groupings")
    private final VariableGroups groupings;

    public VariableGroups getGroupings() {
        return groupings;
    }

    /** An array of variable group definitions for organizing variables together. */
    @com.fasterxml.jackson.annotation.JsonProperty("variableGroups")
    private final java.util.List<VariableGroup> variableGroups;

    /**
     * An array of variable group definitions for organizing variables together.
     *
     * @return the value
     */
    public java.util.List<VariableGroup> getVariableGroups() {
        return variableGroups;
    }

    /** A mapping of output variable names to their definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.Map<String, BaseOutput> outputs;

    /**
     * A mapping of output variable names to their definitions.
     *
     * @return the value
     */
    public java.util.Map<String, BaseOutput> getOutputs() {
        return outputs;
    }

    /** Array of output group objects to group outputs for display or logical purposes. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputGroups")
    private final java.util.List<OutputGroup> outputGroups;

    /**
     * Array of output group objects to group outputs for display or logical purposes.
     *
     * @return the value
     */
    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /** primary output button value. */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryOutputButton")
    private final String primaryOutputButton;

    /**
     * primary output button value.
     *
     * @return the value
     */
    public String getPrimaryOutputButton() {
        return primaryOutputButton;
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
        sb.append("SchemaDocument(");
        sb.append("super=").append(super.toString());
        sb.append("title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", stackDescription=").append(String.valueOf(this.stackDescription));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", schemaVersion=").append(String.valueOf(this.schemaVersion));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", logoUrl=").append(String.valueOf(this.logoUrl));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", informationalText=").append(String.valueOf(this.informationalText));
        sb.append(", instructions=").append(String.valueOf(this.instructions));
        sb.append(", troubleshooting=").append(String.valueOf(this.troubleshooting));
        sb.append(", canAllowViewState=").append(String.valueOf(this.canAllowViewState));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", groupings=").append(String.valueOf(this.groupings));
        sb.append(", variableGroups=").append(String.valueOf(this.variableGroups));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", outputGroups=").append(String.valueOf(this.outputGroups));
        sb.append(", primaryOutputButton=").append(String.valueOf(this.primaryOutputButton));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaDocument)) {
            return false;
        }

        SchemaDocument other = (SchemaDocument) o;
        return java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.stackDescription, other.stackDescription)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.schemaVersion, other.schemaVersion)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.logoUrl, other.logoUrl)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.informationalText, other.informationalText)
                && java.util.Objects.equals(this.instructions, other.instructions)
                && java.util.Objects.equals(this.troubleshooting, other.troubleshooting)
                && java.util.Objects.equals(this.canAllowViewState, other.canAllowViewState)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.groupings, other.groupings)
                && java.util.Objects.equals(this.variableGroups, other.variableGroups)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && java.util.Objects.equals(this.outputGroups, other.outputGroups)
                && java.util.Objects.equals(this.primaryOutputButton, other.primaryOutputButton)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.stackDescription == null ? 43 : this.stackDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaVersion == null ? 43 : this.schemaVersion.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + (this.logoUrl == null ? 43 : this.logoUrl.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result =
                (result * PRIME)
                        + (this.informationalText == null ? 43 : this.informationalText.hashCode());
        result = (result * PRIME) + (this.instructions == null ? 43 : this.instructions.hashCode());
        result =
                (result * PRIME)
                        + (this.troubleshooting == null ? 43 : this.troubleshooting.hashCode());
        result =
                (result * PRIME)
                        + (this.canAllowViewState == null ? 43 : this.canAllowViewState.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.groupings == null ? 43 : this.groupings.hashCode());
        result =
                (result * PRIME)
                        + (this.variableGroups == null ? 43 : this.variableGroups.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + (this.outputGroups == null ? 43 : this.outputGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryOutputButton == null
                                ? 43
                                : this.primaryOutputButton.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
