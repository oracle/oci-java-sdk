/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Allows generating a summary of SQL query execution details for database operations.
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
    defaultImpl = DatabaseToolsSqlReport.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseToolsSqlReportOracleDatabase.class,
        name = "ORACLE_DATABASE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DatabaseToolsSqlReport extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "source",
        "purpose",
        "instructions",
        "variables",
        "columns",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "definedTags",
        "freeformTags",
        "systemTags",
        "locks"
    })
    protected DatabaseToolsSqlReport(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String source,
            String purpose,
            String instructions,
            java.util.List<DatabaseToolsSqlReportVariable> variables,
            java.util.List<DatabaseToolsSqlReportColumn> columns,
            DatabaseToolsSqlReportLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.source = source;
        this.purpose = purpose;
        this.instructions = instructions;
        this.variables = variables;
        this.columns = columns;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.locks = locks;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Tools SQL report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Tools SQL report.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Database Tools SQL report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Database Tools SQL report.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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

    /**
     * The current state of the Database Tools SQL report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DatabaseToolsSqlReportLifecycleState lifecycleState;

    /**
     * The current state of the Database Tools SQL report.
     * @return the value
     **/
    public DatabaseToolsSqlReportLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time the Database Tools SQL report was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Database Tools SQL report was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Database Tools SQL report was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Database Tools SQL report was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("DatabaseToolsSqlReport(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", instructions=").append(String.valueOf(this.instructions));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsSqlReport)) {
            return false;
        }

        DatabaseToolsSqlReport other = (DatabaseToolsSqlReport) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.instructions, other.instructions)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.instructions == null ? 43 : this.instructions.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
