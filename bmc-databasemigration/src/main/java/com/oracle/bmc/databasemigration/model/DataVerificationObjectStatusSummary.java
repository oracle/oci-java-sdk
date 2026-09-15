/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Per-object status comparison line. <br>
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
        defaultImpl = DataVerificationObjectStatusSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MySqlDataVerificationObjectStatusSummary.class,
            name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OracleDataVerificationObjectStatusSummary.class,
            name = "ORACLE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DataVerificationObjectStatusSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"owner", "objectName", "statusInSource", "statusInTarget"})
    protected DataVerificationObjectStatusSummary(
            String owner, String objectName, String statusInSource, String statusInTarget) {
        super();
        this.owner = owner;
        this.objectName = objectName;
        this.statusInSource = statusInSource;
        this.statusInTarget = statusInTarget;
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

    /** Database object name. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Database object name.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** Object status in source. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusInSource")
    private final String statusInSource;

    /**
     * Object status in source.
     *
     * @return the value
     */
    public String getStatusInSource() {
        return statusInSource;
    }

    /** Object status in target. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusInTarget")
    private final String statusInTarget;

    /**
     * Object status in target.
     *
     * @return the value
     */
    public String getStatusInTarget() {
        return statusInTarget;
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
        sb.append("DataVerificationObjectStatusSummary(");
        sb.append("super=").append(super.toString());
        sb.append("owner=").append(String.valueOf(this.owner));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", statusInSource=").append(String.valueOf(this.statusInSource));
        sb.append(", statusInTarget=").append(String.valueOf(this.statusInTarget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataVerificationObjectStatusSummary)) {
            return false;
        }

        DataVerificationObjectStatusSummary other = (DataVerificationObjectStatusSummary) o;
        return java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.statusInSource, other.statusInSource)
                && java.util.Objects.equals(this.statusInTarget, other.statusInTarget)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.statusInSource == null ? 43 : this.statusInSource.hashCode());
        result =
                (result * PRIME)
                        + (this.statusInTarget == null ? 43 : this.statusInTarget.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
