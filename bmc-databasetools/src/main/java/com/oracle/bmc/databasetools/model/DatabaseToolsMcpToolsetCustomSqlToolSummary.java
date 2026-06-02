/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Summary of the Database Tools MCP Toolset.
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
    builder = DatabaseToolsMcpToolsetCustomSqlToolSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsMcpToolsetCustomSqlToolSummary
        extends DatabaseToolsMcpToolsetSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DatabaseToolsMcpToolsetLifecycleState lifecycleState;

        public Builder lifecycleState(DatabaseToolsMcpToolsetLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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
         * Name of the tool returned by the MCP Server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toolName")
        private String toolName;

        /**
         * Name of the tool returned by the MCP Server
         * @param toolName the value to set
         * @return this builder
         **/
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            this.__explicitlySet__.add("toolName");
            return this;
        }
        /**
         * Instructions describing how to use the MCP toolset and its features. This can be used to improve the LLM's understanding of the tool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toolDescription")
        private String toolDescription;

        /**
         * Instructions describing how to use the MCP toolset and its features. This can be used to improve the LLM's understanding of the tool.
         * @param toolDescription the value to set
         * @return this builder
         **/
        public Builder toolDescription(String toolDescription) {
            this.toolDescription = toolDescription;
            this.__explicitlySet__.add("toolDescription");
            return this;
        }
        /**
         * The roles granted access to this MCP tool
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedRoles")
        private java.util.List<String> allowedRoles;

        /**
         * The roles granted access to this MCP tool
         * @param allowedRoles the value to set
         * @return this builder
         **/
        public Builder allowedRoles(java.util.List<String> allowedRoles) {
            this.allowedRoles = allowedRoles;
            this.__explicitlySet__.add("allowedRoles");
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

        public DatabaseToolsMcpToolsetCustomSqlToolSummary build() {
            DatabaseToolsMcpToolsetCustomSqlToolSummary model =
                    new DatabaseToolsMcpToolsetCustomSqlToolSummary(
                            this.id,
                            this.version,
                            this.compartmentId,
                            this.displayName,
                            this.databaseToolsMcpServerId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.locks,
                            this.toolName,
                            this.toolDescription,
                            this.allowedRoles,
                            this.defaultExecutionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpToolsetCustomSqlToolSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("toolName")) {
                this.toolName(model.getToolName());
            }
            if (model.wasPropertyExplicitlySet("toolDescription")) {
                this.toolDescription(model.getToolDescription());
            }
            if (model.wasPropertyExplicitlySet("allowedRoles")) {
                this.allowedRoles(model.getAllowedRoles());
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
    public DatabaseToolsMcpToolsetCustomSqlToolSummary(
            String id,
            Integer version,
            String compartmentId,
            String displayName,
            String databaseToolsMcpServerId,
            DatabaseToolsMcpToolsetLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks,
            String toolName,
            String toolDescription,
            java.util.List<String> allowedRoles,
            DatabaseToolsMcpToolsetDefaultExecutionType defaultExecutionType) {
        super(
                id,
                version,
                compartmentId,
                displayName,
                databaseToolsMcpServerId,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                definedTags,
                freeformTags,
                systemTags,
                locks);
        this.toolName = toolName;
        this.toolDescription = toolDescription;
        this.allowedRoles = allowedRoles;
        this.defaultExecutionType = defaultExecutionType;
    }

    /**
     * Name of the tool returned by the MCP Server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toolName")
    private final String toolName;

    /**
     * Name of the tool returned by the MCP Server
     * @return the value
     **/
    public String getToolName() {
        return toolName;
    }

    /**
     * Instructions describing how to use the MCP toolset and its features. This can be used to improve the LLM's understanding of the tool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toolDescription")
    private final String toolDescription;

    /**
     * Instructions describing how to use the MCP toolset and its features. This can be used to improve the LLM's understanding of the tool.
     * @return the value
     **/
    public String getToolDescription() {
        return toolDescription;
    }

    /**
     * The roles granted access to this MCP tool
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRoles")
    private final java.util.List<String> allowedRoles;

    /**
     * The roles granted access to this MCP tool
     * @return the value
     **/
    public java.util.List<String> getAllowedRoles() {
        return allowedRoles;
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
        sb.append("DatabaseToolsMcpToolsetCustomSqlToolSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolName=").append(String.valueOf(this.toolName));
        sb.append(", toolDescription=").append(String.valueOf(this.toolDescription));
        sb.append(", allowedRoles=").append(String.valueOf(this.allowedRoles));
        sb.append(", defaultExecutionType=").append(String.valueOf(this.defaultExecutionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpToolsetCustomSqlToolSummary)) {
            return false;
        }

        DatabaseToolsMcpToolsetCustomSqlToolSummary other =
                (DatabaseToolsMcpToolsetCustomSqlToolSummary) o;
        return java.util.Objects.equals(this.toolName, other.toolName)
                && java.util.Objects.equals(this.toolDescription, other.toolDescription)
                && java.util.Objects.equals(this.allowedRoles, other.allowedRoles)
                && java.util.Objects.equals(this.defaultExecutionType, other.defaultExecutionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolName == null ? 43 : this.toolName.hashCode());
        result =
                (result * PRIME)
                        + (this.toolDescription == null ? 43 : this.toolDescription.hashCode());
        result = (result * PRIME) + (this.allowedRoles == null ? 43 : this.allowedRoles.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultExecutionType == null
                                ? 43
                                : this.defaultExecutionType.hashCode());
        return result;
    }
}
