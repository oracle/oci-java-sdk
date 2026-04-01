/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Common Update Assessment details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "databaseCombination",
    defaultImpl = UpdateAssessmentDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateMySqlAssessmentDetails.class,
        name = "MYSQL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOracleAssessmentDetails.class,
        name = "ORACLE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateAssessmentDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "networkSpeedMegabitPerSecond",
        "acceptableDowntime",
        "databaseDataSize",
        "ddlExpectation",
        "creationType",
        "sourceDatabaseConnection",
        "targetDatabaseConnection",
        "freeformTags",
        "definedTags"
    })
    protected UpdateAssessmentDetails(
            String description,
            String displayName,
            NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond,
            AcceptableDowntime acceptableDowntime,
            DatabaseDataSize databaseDataSize,
            DdlExpectation ddlExpectation,
            CreationType creationType,
            SourceAssessmentConnection sourceDatabaseConnection,
            TargetAssessmentConnection targetDatabaseConnection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.networkSpeedMegabitPerSecond = networkSpeedMegabitPerSecond;
        this.acceptableDowntime = acceptableDowntime;
        this.databaseDataSize = databaseDataSize;
        this.ddlExpectation = ddlExpectation;
        this.creationType = creationType;
        this.sourceDatabaseConnection = sourceDatabaseConnection;
        this.targetDatabaseConnection = targetDatabaseConnection;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A network speed in Megabits per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSpeedMegabitPerSecond")
    private final NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond;

    /**
     * A network speed in Megabits per second.
     * @return the value
     **/
    public NetworkSpeedMegabitPerSecond getNetworkSpeedMegabitPerSecond() {
        return networkSpeedMegabitPerSecond;
    }

    /**
     * Time allowed for the application downtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("acceptableDowntime")
    private final AcceptableDowntime acceptableDowntime;

    /**
     * Time allowed for the application downtime.
     * @return the value
     **/
    public AcceptableDowntime getAcceptableDowntime() {
        return acceptableDowntime;
    }

    /**
     * The size of a source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDataSize")
    private final DatabaseDataSize databaseDataSize;

    /**
     * The size of a source database.
     * @return the value
     **/
    public DatabaseDataSize getDatabaseDataSize() {
        return databaseDataSize;
    }

    /**
     * DDL expectation values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ddlExpectation")
    private final DdlExpectation ddlExpectation;

    /**
     * DDL expectation values.
     * @return the value
     **/
    public DdlExpectation getDdlExpectation() {
        return ddlExpectation;
    }

    /**
     * The type of assessment creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creationType")
    private final CreationType creationType;

    /**
     * The type of assessment creation.
     * @return the value
     **/
    public CreationType getCreationType() {
        return creationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnection")
    private final SourceAssessmentConnection sourceDatabaseConnection;

    public SourceAssessmentConnection getSourceDatabaseConnection() {
        return sourceDatabaseConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnection")
    private final TargetAssessmentConnection targetDatabaseConnection;

    public TargetAssessmentConnection getTargetDatabaseConnection() {
        return targetDatabaseConnection;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see Resource Tags. Example: {"Department": "Finance"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see Resource Tags. Example: {"Department": "Finance"}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("UpdateAssessmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", networkSpeedMegabitPerSecond=")
                .append(String.valueOf(this.networkSpeedMegabitPerSecond));
        sb.append(", acceptableDowntime=").append(String.valueOf(this.acceptableDowntime));
        sb.append(", databaseDataSize=").append(String.valueOf(this.databaseDataSize));
        sb.append(", ddlExpectation=").append(String.valueOf(this.ddlExpectation));
        sb.append(", creationType=").append(String.valueOf(this.creationType));
        sb.append(", sourceDatabaseConnection=")
                .append(String.valueOf(this.sourceDatabaseConnection));
        sb.append(", targetDatabaseConnection=")
                .append(String.valueOf(this.targetDatabaseConnection));
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
        if (!(o instanceof UpdateAssessmentDetails)) {
            return false;
        }

        UpdateAssessmentDetails other = (UpdateAssessmentDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.networkSpeedMegabitPerSecond, other.networkSpeedMegabitPerSecond)
                && java.util.Objects.equals(this.acceptableDowntime, other.acceptableDowntime)
                && java.util.Objects.equals(this.databaseDataSize, other.databaseDataSize)
                && java.util.Objects.equals(this.ddlExpectation, other.ddlExpectation)
                && java.util.Objects.equals(this.creationType, other.creationType)
                && java.util.Objects.equals(
                        this.sourceDatabaseConnection, other.sourceDatabaseConnection)
                && java.util.Objects.equals(
                        this.targetDatabaseConnection, other.targetDatabaseConnection)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSpeedMegabitPerSecond == null
                                ? 43
                                : this.networkSpeedMegabitPerSecond.hashCode());
        result =
                (result * PRIME)
                        + (this.acceptableDowntime == null
                                ? 43
                                : this.acceptableDowntime.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDataSize == null ? 43 : this.databaseDataSize.hashCode());
        result =
                (result * PRIME)
                        + (this.ddlExpectation == null ? 43 : this.ddlExpectation.hashCode());
        result = (result * PRIME) + (this.creationType == null ? 43 : this.creationType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabaseConnection == null
                                ? 43
                                : this.sourceDatabaseConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseConnection == null
                                ? 43
                                : this.targetDatabaseConnection.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
