/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the database for the registration in Data Safe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseType",
        defaultImpl = DatabaseDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstalledDatabaseDetails.class,
            name = "INSTALLED_DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousDatabaseDetails.class,
            name = "AUTONOMOUS_DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseCloudServiceDetails.class,
            name = "DATABASE_CLOUD_SERVICE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class DatabaseDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"infrastructureType"})
    protected DatabaseDetails(InfrastructureType infrastructureType) {
        super();
        this.infrastructureType = infrastructureType;
    }

    /** The infrastructure type the database is running on. */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    private final InfrastructureType infrastructureType;

    /**
     * The infrastructure type the database is running on.
     *
     * @return the value
     */
    public InfrastructureType getInfrastructureType() {
        return infrastructureType;
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
        sb.append("DatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseDetails)) {
            return false;
        }

        DatabaseDetails other = (DatabaseDetails) o;
        return java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
