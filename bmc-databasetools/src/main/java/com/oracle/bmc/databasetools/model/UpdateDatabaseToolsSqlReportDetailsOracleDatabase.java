/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Database Tools SQL report information to be updated for a report of type ORACLE_DATABASE. <br>
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
        builder = UpdateDatabaseToolsSqlReportDetailsOracleDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDatabaseToolsSqlReportDetailsOracleDatabase
        extends UpdateDatabaseToolsSqlReportDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("purpose")
        private String purpose;

        public Builder purpose(String purpose) {
            this.purpose = purpose;
            this.__explicitlySet__.add("purpose");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instructions")
        private String instructions;

        public Builder instructions(String instructions) {
            this.instructions = instructions;
            this.__explicitlySet__.add("instructions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<DatabaseToolsSqlReportVariable> variables;

        public Builder variables(java.util.List<DatabaseToolsSqlReportVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<DatabaseToolsSqlReportColumn> columns;

        public Builder columns(java.util.List<DatabaseToolsSqlReportColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDatabaseToolsSqlReportDetailsOracleDatabase build() {
            UpdateDatabaseToolsSqlReportDetailsOracleDatabase model =
                    new UpdateDatabaseToolsSqlReportDetailsOracleDatabase(
                            this.displayName,
                            this.definedTags,
                            this.freeformTags,
                            this.source,
                            this.description,
                            this.purpose,
                            this.instructions,
                            this.variables,
                            this.columns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDatabaseToolsSqlReportDetailsOracleDatabase model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("purpose")) {
                this.purpose(model.getPurpose());
            }
            if (model.wasPropertyExplicitlySet("instructions")) {
                this.instructions(model.getInstructions());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
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

    @Deprecated
    public UpdateDatabaseToolsSqlReportDetailsOracleDatabase(
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String source,
            String description,
            String purpose,
            String instructions,
            java.util.List<DatabaseToolsSqlReportVariable> variables,
            java.util.List<DatabaseToolsSqlReportColumn> columns) {
        super(
                displayName,
                definedTags,
                freeformTags,
                source,
                description,
                purpose,
                instructions,
                variables,
                columns);
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
        sb.append("UpdateDatabaseToolsSqlReportDetailsOracleDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseToolsSqlReportDetailsOracleDatabase)) {
            return false;
        }

        UpdateDatabaseToolsSqlReportDetailsOracleDatabase other =
                (UpdateDatabaseToolsSqlReportDetailsOracleDatabase) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
