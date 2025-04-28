/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to enable the specified Database Management feature for an Autonomous
 * Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "feature",
        defaultImpl = AutonomousDatabaseFeatureDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousDatabaseSqlWatchFeatureDetails.class,
            name = "SQLWATCH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AutonomousDatabaseDiagnosticsAndManagementFeatureDetails.class,
            name = "DIAGNOSTICS_AND_MANAGEMENT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class AutonomousDatabaseFeatureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseConnectionDetails", "connectorDetails"})
    protected AutonomousDatabaseFeatureDetails(
            DatabaseConnectionDetails databaseConnectionDetails,
            ConnectorDetails connectorDetails) {
        super();
        this.databaseConnectionDetails = databaseConnectionDetails;
        this.connectorDetails = connectorDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
    private final DatabaseConnectionDetails databaseConnectionDetails;

    public DatabaseConnectionDetails getDatabaseConnectionDetails() {
        return databaseConnectionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectorDetails")
    private final ConnectorDetails connectorDetails;

    public ConnectorDetails getConnectorDetails() {
        return connectorDetails;
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
        sb.append("AutonomousDatabaseFeatureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseConnectionDetails=")
                .append(String.valueOf(this.databaseConnectionDetails));
        sb.append(", connectorDetails=").append(String.valueOf(this.connectorDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseFeatureDetails)) {
            return false;
        }

        AutonomousDatabaseFeatureDetails other = (AutonomousDatabaseFeatureDetails) o;
        return java.util.Objects.equals(
                        this.databaseConnectionDetails, other.databaseConnectionDetails)
                && java.util.Objects.equals(this.connectorDetails, other.connectorDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseConnectionDetails == null
                                ? 43
                                : this.databaseConnectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorDetails == null ? 43 : this.connectorDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
