/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Details for the new Database Tools MCP Toolset of type Built-in SQL tools.
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
    builder = CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails
        extends CreateDatabaseToolsMcpToolsetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsMcpServerId")
        private String databaseToolsMcpServerId;

        public Builder databaseToolsMcpServerId(String databaseToolsMcpServerId) {
            this.databaseToolsMcpServerId = databaseToolsMcpServerId;
            this.__explicitlySet__.add("databaseToolsMcpServerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * List of Database Tools BUILT_IN_SQL_TOOLS toolset tool configurations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<CreateDatabaseToolsMcpToolsetToolDetails> tools;

        /**
         * List of Database Tools BUILT_IN_SQL_TOOLS toolset tool configurations
         * @param tools the value to set
         * @return this builder
         **/
        public Builder tools(java.util.List<CreateDatabaseToolsMcpToolsetToolDetails> tools) {
            this.tools = tools;
            this.__explicitlySet__.add("tools");
            return this;
        }
        /**
         * The default execution type for the toolset. The default value is SYNCHRONOUS.
         * <p>
         * To use ASYNCHRONOUS execution, the MCP Server must have the storage property configured.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultExecutionType")
        private DatabaseToolsMcpToolsetDefaultExecutionType defaultExecutionType;

        /**
         * The default execution type for the toolset. The default value is SYNCHRONOUS.
         * <p>
         * To use ASYNCHRONOUS execution, the MCP Server must have the storage property configured.
         *
         * @param defaultExecutionType the value to set
         * @return this builder
         **/
        public Builder defaultExecutionType(
                DatabaseToolsMcpToolsetDefaultExecutionType defaultExecutionType) {
            this.defaultExecutionType = defaultExecutionType;
            this.__explicitlySet__.add("defaultExecutionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails build() {
            CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails model =
                    new CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails(
                            this.version,
                            this.compartmentId,
                            this.displayName,
                            this.databaseToolsMcpServerId,
                            this.description,
                            this.definedTags,
                            this.freeformTags,
                            this.locks,
                            this.tools,
                            this.defaultExecutionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsMcpServerId")) {
                this.databaseToolsMcpServerId(model.getDatabaseToolsMcpServerId());
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("tools")) {
                this.tools(model.getTools());
            }
            if (model.wasPropertyExplicitlySet("defaultExecutionType")) {
                this.defaultExecutionType(model.getDefaultExecutionType());
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

    @Deprecated
    public CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails(
            Integer version,
            String compartmentId,
            String displayName,
            String databaseToolsMcpServerId,
            String description,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.List<ResourceLock> locks,
            java.util.List<CreateDatabaseToolsMcpToolsetToolDetails> tools,
            DatabaseToolsMcpToolsetDefaultExecutionType defaultExecutionType) {
        super(
                version,
                compartmentId,
                displayName,
                databaseToolsMcpServerId,
                description,
                definedTags,
                freeformTags,
                locks);
        this.tools = tools;
        this.defaultExecutionType = defaultExecutionType;
    }

    /**
     * List of Database Tools BUILT_IN_SQL_TOOLS toolset tool configurations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<CreateDatabaseToolsMcpToolsetToolDetails> tools;

    /**
     * List of Database Tools BUILT_IN_SQL_TOOLS toolset tool configurations
     * @return the value
     **/
    public java.util.List<CreateDatabaseToolsMcpToolsetToolDetails> getTools() {
        return tools;
    }

    /**
     * The default execution type for the toolset. The default value is SYNCHRONOUS.
     * <p>
     * To use ASYNCHRONOUS execution, the MCP Server must have the storage property configured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultExecutionType")
    private final DatabaseToolsMcpToolsetDefaultExecutionType defaultExecutionType;

    /**
     * The default execution type for the toolset. The default value is SYNCHRONOUS.
     * <p>
     * To use ASYNCHRONOUS execution, the MCP Server must have the storage property configured.
     *
     * @return the value
     **/
    public DatabaseToolsMcpToolsetDefaultExecutionType getDefaultExecutionType() {
        return defaultExecutionType;
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
        sb.append("CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(", defaultExecutionType=").append(String.valueOf(this.defaultExecutionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails)) {
            return false;
        }

        CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails other =
                (CreateDatabaseToolsMcpToolsetBuiltInSqlToolsDetails) o;
        return java.util.Objects.equals(this.tools, other.tools)
                && java.util.Objects.equals(this.defaultExecutionType, other.defaultExecutionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultExecutionType == null
                                ? 43
                                : this.defaultExecutionType.hashCode());
        return result;
    }
}
