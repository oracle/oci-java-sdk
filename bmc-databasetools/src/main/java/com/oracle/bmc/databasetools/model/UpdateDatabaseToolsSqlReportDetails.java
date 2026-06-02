/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Database Tools SQL report information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UpdateDatabaseToolsSqlReportDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateDatabaseToolsSqlReportDetailsOracleDatabase.class,
        name = "ORACLE_DATABASE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateDatabaseToolsSqlReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "definedTags",
        "freeformTags",
        "source",
        "description",
        "purpose",
        "instructions",
        "variables",
        "columns"
    })
    protected UpdateDatabaseToolsSqlReportDetails(
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String source,
            String description,
            String purpose,
            String instructions,
            java.util.List<DatabaseToolsSqlReportVariable> variables,
            java.util.List<DatabaseToolsSqlReportColumn> columns) {
        super();
        this.displayName = displayName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.source = source;
        this.description = description;
        this.purpose = purpose;
        this.instructions = instructions;
        this.variables = variables;
        this.columns = columns;
    }

    /**
     * A user-friendly name. Does not have to be unique and can be updated. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique and can be updated. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * SQL query executed to generate the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * SQL query executed to generate the report.
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * A description of the SQL report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the SQL report.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Purpose of the Database Tools SQL report. Scenario or conditions describing when or why this report should be used. Provides selection criteria to AI agents to improve report selection accuracy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    private final String purpose;

    /**
     * Purpose of the Database Tools SQL report. Scenario or conditions describing when or why this report should be used. Provides selection criteria to AI agents to improve report selection accuracy.
     * @return the value
     **/
    public String getPurpose() {
        return purpose;
    }

    /**
     * Instructions on how to use the SQL report. Step-by-step guidance for an AI agent on how to execute or fill in parameters for the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instructions")
    private final String instructions;

    /**
     * Instructions on how to use the SQL report. Step-by-step guidance for an AI agent on how to execute or fill in parameters for the report.
     * @return the value
     **/
    public String getInstructions() {
        return instructions;
    }

    /**
     * Variables referenced in the Database Tools SQL Report source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<DatabaseToolsSqlReportVariable> variables;

    /**
     * Variables referenced in the Database Tools SQL Report source.
     * @return the value
     **/
    public java.util.List<DatabaseToolsSqlReportVariable> getVariables() {
        return variables;
    }

    /**
     * Descriptive information on columns referenced in the Database Tools SQL Report source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<DatabaseToolsSqlReportColumn> columns;

    /**
     * Descriptive information on columns referenced in the Database Tools SQL Report source.
     * @return the value
     **/
    public java.util.List<DatabaseToolsSqlReportColumn> getColumns() {
        return columns;
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
        sb.append("UpdateDatabaseToolsSqlReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", instructions=").append(String.valueOf(this.instructions));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseToolsSqlReportDetails)) {
            return false;
        }

        UpdateDatabaseToolsSqlReportDetails other = (UpdateDatabaseToolsSqlReportDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.instructions, other.instructions)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.columns, other.columns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.instructions == null ? 43 : this.instructions.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
