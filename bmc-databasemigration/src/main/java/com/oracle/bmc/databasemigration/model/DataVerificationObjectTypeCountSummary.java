/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Object type count comparison summary line. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination",
        defaultImpl = DataVerificationObjectTypeCountSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MySqlDataVerificationObjectTypeCountSummary.class,
            name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OracleDataVerificationObjectTypeCountSummary.class,
            name = "ORACLE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DataVerificationObjectTypeCountSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "sourceObjectCount",
        "targetObjectCount",
        "deltaPercent"
    })
    protected DataVerificationObjectTypeCountSummary(
            String schemaName,
            Integer sourceObjectCount,
            Integer targetObjectCount,
            Double deltaPercent) {
        super();
        this.schemaName = schemaName;
        this.sourceObjectCount = sourceObjectCount;
        this.targetObjectCount = targetObjectCount;
        this.deltaPercent = deltaPercent;
    }

    /**
     * Schema/owner name.
     *
     * <p>This field is omitted (null/empty depending on backend serialization) for database-wide
     * object types that are not schema-scoped.
     *
     * <p>Oracle non-schema-scoped object types: USER, ROLE, PROFILE, TABLESPACE, DATABASE_LINK,
     * CONTROLFILE, DATAFILE, REDO_LOG, DIRECTORY, LIBRARY, CONTEXT.
     *
     * <p>MySQL non-schema-scoped object types: USER, ROLE, SERVER, TABLESPACE, LOGFILE_GROUP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Schema/owner name.
     *
     * <p>This field is omitted (null/empty depending on backend serialization) for database-wide
     * object types that are not schema-scoped.
     *
     * <p>Oracle non-schema-scoped object types: USER, ROLE, PROFILE, TABLESPACE, DATABASE_LINK,
     * CONTROLFILE, DATAFILE, REDO_LOG, DIRECTORY, LIBRARY, CONTEXT.
     *
     * <p>MySQL non-schema-scoped object types: USER, ROLE, SERVER, TABLESPACE, LOGFILE_GROUP.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** Number of objects in source. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectCount")
    private final Integer sourceObjectCount;

    /**
     * Number of objects in source.
     *
     * @return the value
     */
    public Integer getSourceObjectCount() {
        return sourceObjectCount;
    }

    /** Number of objects in target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetObjectCount")
    private final Integer targetObjectCount;

    /**
     * Number of objects in target.
     *
     * @return the value
     */
    public Integer getTargetObjectCount() {
        return targetObjectCount;
    }

    /**
     * Percentage delta between source and target counts. This value is expected to be non-negative.
     *
     * <p>If a negative value is encountered, it indicates that the target has objects not present
     * in the source, which should be treated as an inconsistency (i.e., a failed comparison/report
     * result).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deltaPercent")
    private final Double deltaPercent;

    /**
     * Percentage delta between source and target counts. This value is expected to be non-negative.
     *
     * <p>If a negative value is encountered, it indicates that the target has objects not present
     * in the source, which should be treated as an inconsistency (i.e., a failed comparison/report
     * result).
     *
     * @return the value
     */
    public Double getDeltaPercent() {
        return deltaPercent;
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
        sb.append("DataVerificationObjectTypeCountSummary(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", sourceObjectCount=").append(String.valueOf(this.sourceObjectCount));
        sb.append(", targetObjectCount=").append(String.valueOf(this.targetObjectCount));
        sb.append(", deltaPercent=").append(String.valueOf(this.deltaPercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataVerificationObjectTypeCountSummary)) {
            return false;
        }

        DataVerificationObjectTypeCountSummary other = (DataVerificationObjectTypeCountSummary) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.sourceObjectCount, other.sourceObjectCount)
                && java.util.Objects.equals(this.targetObjectCount, other.targetObjectCount)
                && java.util.Objects.equals(this.deltaPercent, other.deltaPercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectCount == null ? 43 : this.sourceObjectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetObjectCount == null ? 43 : this.targetObjectCount.hashCode());
        result = (result * PRIME) + (this.deltaPercent == null ? 43 : this.deltaPercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
