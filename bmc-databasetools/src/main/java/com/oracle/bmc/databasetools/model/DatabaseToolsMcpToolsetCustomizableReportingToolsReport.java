/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Database Tools SQL Reports <br>
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
        builder = DatabaseToolsMcpToolsetCustomizableReportingToolsReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsMcpToolsetCustomizableReportingToolsReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseToolsSqlReportId", "allowedRoles"})
    public DatabaseToolsMcpToolsetCustomizableReportingToolsReport(
            String databaseToolsSqlReportId, java.util.List<String> allowedRoles) {
        super();
        this.databaseToolsSqlReportId = databaseToolsSqlReportId;
        this.allowedRoles = allowedRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * report OCID of sql report.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsSqlReportId")
        private String databaseToolsSqlReportId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * report OCID of sql report.
         *
         * @param databaseToolsSqlReportId the value to set
         * @return this builder
         */
        public Builder databaseToolsSqlReportId(String databaseToolsSqlReportId) {
            this.databaseToolsSqlReportId = databaseToolsSqlReportId;
            this.__explicitlySet__.add("databaseToolsSqlReportId");
            return this;
        }
        /** The roles granted access to this report */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedRoles")
        private java.util.List<String> allowedRoles;

        /**
         * The roles granted access to this report
         *
         * @param allowedRoles the value to set
         * @return this builder
         */
        public Builder allowedRoles(java.util.List<String> allowedRoles) {
            this.allowedRoles = allowedRoles;
            this.__explicitlySet__.add("allowedRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpToolsetCustomizableReportingToolsReport build() {
            DatabaseToolsMcpToolsetCustomizableReportingToolsReport model =
                    new DatabaseToolsMcpToolsetCustomizableReportingToolsReport(
                            this.databaseToolsSqlReportId, this.allowedRoles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpToolsetCustomizableReportingToolsReport model) {
            if (model.wasPropertyExplicitlySet("databaseToolsSqlReportId")) {
                this.databaseToolsSqlReportId(model.getDatabaseToolsSqlReportId());
            }
            if (model.wasPropertyExplicitlySet("allowedRoles")) {
                this.allowedRoles(model.getAllowedRoles());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * report OCID of sql report.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsSqlReportId")
    private final String databaseToolsSqlReportId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * report OCID of sql report.
     *
     * @return the value
     */
    public String getDatabaseToolsSqlReportId() {
        return databaseToolsSqlReportId;
    }

    /** The roles granted access to this report */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRoles")
    private final java.util.List<String> allowedRoles;

    /**
     * The roles granted access to this report
     *
     * @return the value
     */
    public java.util.List<String> getAllowedRoles() {
        return allowedRoles;
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
        sb.append("DatabaseToolsMcpToolsetCustomizableReportingToolsReport(");
        sb.append("super=").append(super.toString());
        sb.append("databaseToolsSqlReportId=")
                .append(String.valueOf(this.databaseToolsSqlReportId));
        sb.append(", allowedRoles=").append(String.valueOf(this.allowedRoles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpToolsetCustomizableReportingToolsReport)) {
            return false;
        }

        DatabaseToolsMcpToolsetCustomizableReportingToolsReport other =
                (DatabaseToolsMcpToolsetCustomizableReportingToolsReport) o;
        return java.util.Objects.equals(
                        this.databaseToolsSqlReportId, other.databaseToolsSqlReportId)
                && java.util.Objects.equals(this.allowedRoles, other.allowedRoles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseToolsSqlReportId == null
                                ? 43
                                : this.databaseToolsSqlReportId.hashCode());
        result = (result * PRIME) + (this.allowedRoles == null ? 43 : this.allowedRoles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
