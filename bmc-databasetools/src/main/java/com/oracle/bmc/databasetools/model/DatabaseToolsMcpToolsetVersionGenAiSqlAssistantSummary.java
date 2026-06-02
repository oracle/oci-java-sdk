/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Summary of versions available for the GENAI_SQL_ASSISTANT MCP toolset type
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
    builder = DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary
        extends DatabaseToolsMcpToolsetVersionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultVersion")
        private Integer defaultVersion;

        public Builder defaultVersion(Integer defaultVersion) {
            this.defaultVersion = defaultVersion;
            this.__explicitlySet__.add("defaultVersion");
            return this;
        }
        /**
         * The version configurations available for this toolset type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<DatabaseToolsMcpToolsetGenAiSqlAssistantVersion> versions;

        /**
         * The version configurations available for this toolset type.
         * @param versions the value to set
         * @return this builder
         **/
        public Builder versions(
                java.util.List<DatabaseToolsMcpToolsetGenAiSqlAssistantVersion> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary build() {
            DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary model =
                    new DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary(
                            this.defaultVersion, this.versions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary model) {
            if (model.wasPropertyExplicitlySet("defaultVersion")) {
                this.defaultVersion(model.getDefaultVersion());
            }
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
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
    public DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary(
            Integer defaultVersion,
            java.util.List<DatabaseToolsMcpToolsetGenAiSqlAssistantVersion> versions) {
        super(defaultVersion);
        this.versions = versions;
    }

    /**
     * The version configurations available for this toolset type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<DatabaseToolsMcpToolsetGenAiSqlAssistantVersion> versions;

    /**
     * The version configurations available for this toolset type.
     * @return the value
     **/
    public java.util.List<DatabaseToolsMcpToolsetGenAiSqlAssistantVersion> getVersions() {
        return versions;
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
        sb.append("DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary)) {
            return false;
        }

        DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary other =
                (DatabaseToolsMcpToolsetVersionGenAiSqlAssistantSummary) o;
        return java.util.Objects.equals(this.versions, other.versions) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        return result;
    }
}
