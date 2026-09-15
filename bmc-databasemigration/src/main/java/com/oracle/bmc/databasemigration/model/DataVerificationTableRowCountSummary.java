/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Table row count comparison result line. <br>
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
        defaultImpl = DataVerificationTableRowCountSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MySqlDataVerificationTableRowCountSummary.class,
            name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OracleDataVerificationTableRowCountSummary.class,
            name = "ORACLE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DataVerificationTableRowCountSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "owner",
        "tableName",
        "sourceRowCount",
        "targetRowCount",
        "variancePercent"
    })
    protected DataVerificationTableRowCountSummary(
            String owner,
            String tableName,
            Integer sourceRowCount,
            Integer targetRowCount,
            Double variancePercent) {
        super();
        this.owner = owner;
        this.tableName = tableName;
        this.sourceRowCount = sourceRowCount;
        this.targetRowCount = targetRowCount;
        this.variancePercent = variancePercent;
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
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

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
    public String getOwner() {
        return owner;
    }

    /** Table name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * Table name.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /** Row count in source. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRowCount")
    private final Integer sourceRowCount;

    /**
     * Row count in source.
     *
     * @return the value
     */
    public Integer getSourceRowCount() {
        return sourceRowCount;
    }

    /** Row count in target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRowCount")
    private final Integer targetRowCount;

    /**
     * Row count in target.
     *
     * @return the value
     */
    public Integer getTargetRowCount() {
        return targetRowCount;
    }

    /**
     * Percentage variance between source and target row counts. This value is expected to be
     * non-negative.
     *
     * <p>A negative value indicates that the target has rows not present in the source, which
     * should be treated as an inconsistency (i.e., a failed comparison/report result).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variancePercent")
    private final Double variancePercent;

    /**
     * Percentage variance between source and target row counts. This value is expected to be
     * non-negative.
     *
     * <p>A negative value indicates that the target has rows not present in the source, which
     * should be treated as an inconsistency (i.e., a failed comparison/report result).
     *
     * @return the value
     */
    public Double getVariancePercent() {
        return variancePercent;
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
        sb.append("DataVerificationTableRowCountSummary(");
        sb.append("super=").append(super.toString());
        sb.append("owner=").append(String.valueOf(this.owner));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", sourceRowCount=").append(String.valueOf(this.sourceRowCount));
        sb.append(", targetRowCount=").append(String.valueOf(this.targetRowCount));
        sb.append(", variancePercent=").append(String.valueOf(this.variancePercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataVerificationTableRowCountSummary)) {
            return false;
        }

        DataVerificationTableRowCountSummary other = (DataVerificationTableRowCountSummary) o;
        return java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.sourceRowCount, other.sourceRowCount)
                && java.util.Objects.equals(this.targetRowCount, other.targetRowCount)
                && java.util.Objects.equals(this.variancePercent, other.variancePercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRowCount == null ? 43 : this.sourceRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetRowCount == null ? 43 : this.targetRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.variancePercent == null ? 43 : this.variancePercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
