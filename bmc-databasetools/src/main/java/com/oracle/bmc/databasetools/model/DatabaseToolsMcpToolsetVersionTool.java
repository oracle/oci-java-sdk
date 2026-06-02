/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * A tool definition for a specific MCP toolset version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsMcpToolsetVersionTool.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsMcpToolsetVersionTool
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "description",
        "defaultStatus",
        "defaultAllowedRoles"
    })
    public DatabaseToolsMcpToolsetVersionTool(
            String name,
            String displayName,
            String description,
            DatabaseToolsMcpToolsetToolStatus defaultStatus,
            java.util.List<String> defaultAllowedRoles) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.defaultStatus = defaultStatus;
        this.defaultAllowedRoles = defaultAllowedRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique name of the tool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the tool.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The display name of the tool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the tool.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the tool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the tool.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The default status of the tool in this version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultStatus")
        private DatabaseToolsMcpToolsetToolStatus defaultStatus;

        /**
         * The default status of the tool in this version.
         * @param defaultStatus the value to set
         * @return this builder
         **/
        public Builder defaultStatus(DatabaseToolsMcpToolsetToolStatus defaultStatus) {
            this.defaultStatus = defaultStatus;
            this.__explicitlySet__.add("defaultStatus");
            return this;
        }
        /**
         * The roles granted access to this tool by default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAllowedRoles")
        private java.util.List<String> defaultAllowedRoles;

        /**
         * The roles granted access to this tool by default.
         * @param defaultAllowedRoles the value to set
         * @return this builder
         **/
        public Builder defaultAllowedRoles(java.util.List<String> defaultAllowedRoles) {
            this.defaultAllowedRoles = defaultAllowedRoles;
            this.__explicitlySet__.add("defaultAllowedRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpToolsetVersionTool build() {
            DatabaseToolsMcpToolsetVersionTool model =
                    new DatabaseToolsMcpToolsetVersionTool(
                            this.name,
                            this.displayName,
                            this.description,
                            this.defaultStatus,
                            this.defaultAllowedRoles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpToolsetVersionTool model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("defaultStatus")) {
                this.defaultStatus(model.getDefaultStatus());
            }
            if (model.wasPropertyExplicitlySet("defaultAllowedRoles")) {
                this.defaultAllowedRoles(model.getDefaultAllowedRoles());
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
     * The unique name of the tool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the tool.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The display name of the tool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the tool.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the tool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the tool.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The default status of the tool in this version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultStatus")
    private final DatabaseToolsMcpToolsetToolStatus defaultStatus;

    /**
     * The default status of the tool in this version.
     * @return the value
     **/
    public DatabaseToolsMcpToolsetToolStatus getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * The roles granted access to this tool by default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAllowedRoles")
    private final java.util.List<String> defaultAllowedRoles;

    /**
     * The roles granted access to this tool by default.
     * @return the value
     **/
    public java.util.List<String> getDefaultAllowedRoles() {
        return defaultAllowedRoles;
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
        sb.append("DatabaseToolsMcpToolsetVersionTool(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultStatus=").append(String.valueOf(this.defaultStatus));
        sb.append(", defaultAllowedRoles=").append(String.valueOf(this.defaultAllowedRoles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpToolsetVersionTool)) {
            return false;
        }

        DatabaseToolsMcpToolsetVersionTool other = (DatabaseToolsMcpToolsetVersionTool) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.defaultStatus, other.defaultStatus)
                && java.util.Objects.equals(this.defaultAllowedRoles, other.defaultAllowedRoles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultStatus == null ? 43 : this.defaultStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAllowedRoles == null
                                ? 43
                                : this.defaultAllowedRoles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
