/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * A specific version entry for a CUSTOMIZABLE_REPORTING_TOOLS MCP toolset version <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsMcpToolsetCustomizableReportingToolsVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsMcpToolsetCustomizableReportingToolsVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "description",
        "features",
        "defaultReportAllowedRoles",
        "tools"
    })
    public DatabaseToolsMcpToolsetCustomizableReportingToolsVersion(
            Integer version,
            String description,
            java.util.List<String> features,
            java.util.List<String> defaultReportAllowedRoles,
            java.util.List<DatabaseToolsMcpToolsetVersionTool> tools) {
        super();
        this.version = version;
        this.description = description;
        this.features = features;
        this.defaultReportAllowedRoles = defaultReportAllowedRoles;
        this.tools = tools;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version number. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version number.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** A description of this version. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of this version.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Optional feature flags or attributes for this version. */
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<String> features;

        /**
         * Optional feature flags or attributes for this version.
         *
         * @param features the value to set
         * @return this builder
         */
        public Builder features(java.util.List<String> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }
        /** The roles granted access to this toolset version by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultReportAllowedRoles")
        private java.util.List<String> defaultReportAllowedRoles;

        /**
         * The roles granted access to this toolset version by default.
         *
         * @param defaultReportAllowedRoles the value to set
         * @return this builder
         */
        public Builder defaultReportAllowedRoles(java.util.List<String> defaultReportAllowedRoles) {
            this.defaultReportAllowedRoles = defaultReportAllowedRoles;
            this.__explicitlySet__.add("defaultReportAllowedRoles");
            return this;
        }
        /** The tools available in this version. */
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<DatabaseToolsMcpToolsetVersionTool> tools;

        /**
         * The tools available in this version.
         *
         * @param tools the value to set
         * @return this builder
         */
        public Builder tools(java.util.List<DatabaseToolsMcpToolsetVersionTool> tools) {
            this.tools = tools;
            this.__explicitlySet__.add("tools");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpToolsetCustomizableReportingToolsVersion build() {
            DatabaseToolsMcpToolsetCustomizableReportingToolsVersion model =
                    new DatabaseToolsMcpToolsetCustomizableReportingToolsVersion(
                            this.version,
                            this.description,
                            this.features,
                            this.defaultReportAllowedRoles,
                            this.tools);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpToolsetCustomizableReportingToolsVersion model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("defaultReportAllowedRoles")) {
                this.defaultReportAllowedRoles(model.getDefaultReportAllowedRoles());
            }
            if (model.wasPropertyExplicitlySet("tools")) {
                this.tools(model.getTools());
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

    /** The version number. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version number.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /** A description of this version. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of this version.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Optional feature flags or attributes for this version. */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<String> features;

    /**
     * Optional feature flags or attributes for this version.
     *
     * @return the value
     */
    public java.util.List<String> getFeatures() {
        return features;
    }

    /** The roles granted access to this toolset version by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultReportAllowedRoles")
    private final java.util.List<String> defaultReportAllowedRoles;

    /**
     * The roles granted access to this toolset version by default.
     *
     * @return the value
     */
    public java.util.List<String> getDefaultReportAllowedRoles() {
        return defaultReportAllowedRoles;
    }

    /** The tools available in this version. */
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<DatabaseToolsMcpToolsetVersionTool> tools;

    /**
     * The tools available in this version.
     *
     * @return the value
     */
    public java.util.List<DatabaseToolsMcpToolsetVersionTool> getTools() {
        return tools;
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
        sb.append("DatabaseToolsMcpToolsetCustomizableReportingToolsVersion(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", defaultReportAllowedRoles=")
                .append(String.valueOf(this.defaultReportAllowedRoles));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpToolsetCustomizableReportingToolsVersion)) {
            return false;
        }

        DatabaseToolsMcpToolsetCustomizableReportingToolsVersion other =
                (DatabaseToolsMcpToolsetCustomizableReportingToolsVersion) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(
                        this.defaultReportAllowedRoles, other.defaultReportAllowedRoles)
                && java.util.Objects.equals(this.tools, other.tools)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultReportAllowedRoles == null
                                ? 43
                                : this.defaultReportAllowedRoles.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
