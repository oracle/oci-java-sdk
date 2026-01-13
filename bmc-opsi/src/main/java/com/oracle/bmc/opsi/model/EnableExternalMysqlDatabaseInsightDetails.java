/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about database to be analyzed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnableExternalMysqlDatabaseInsightDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableExternalMysqlDatabaseInsightDetails extends EnableDatabaseInsightDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The DBM owned database connector
         * [OCID](https://docs.oracle.com/iaas/database-management/doc/view-connector-details.html)
         * mapping to the database credentials and connection details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectorId")
        private String databaseConnectorId;

        /**
         * The DBM owned database connector
         * [OCID](https://docs.oracle.com/iaas/database-management/doc/view-connector-details.html)
         * mapping to the database credentials and connection details.
         *
         * @param databaseConnectorId the value to set
         * @return this builder
         */
        public Builder databaseConnectorId(String databaseConnectorId) {
            this.databaseConnectorId = databaseConnectorId;
            this.__explicitlySet__.add("databaseConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableExternalMysqlDatabaseInsightDetails build() {
            EnableExternalMysqlDatabaseInsightDetails model =
                    new EnableExternalMysqlDatabaseInsightDetails(this.databaseConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableExternalMysqlDatabaseInsightDetails model) {
            if (model.wasPropertyExplicitlySet("databaseConnectorId")) {
                this.databaseConnectorId(model.getDatabaseConnectorId());
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
    public EnableExternalMysqlDatabaseInsightDetails(String databaseConnectorId) {
        super();
        this.databaseConnectorId = databaseConnectorId;
    }

    /**
     * The DBM owned database connector
     * [OCID](https://docs.oracle.com/iaas/database-management/doc/view-connector-details.html)
     * mapping to the database credentials and connection details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectorId")
    private final String databaseConnectorId;

    /**
     * The DBM owned database connector
     * [OCID](https://docs.oracle.com/iaas/database-management/doc/view-connector-details.html)
     * mapping to the database credentials and connection details.
     *
     * @return the value
     */
    public String getDatabaseConnectorId() {
        return databaseConnectorId;
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
        sb.append("EnableExternalMysqlDatabaseInsightDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseConnectorId=").append(String.valueOf(this.databaseConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalMysqlDatabaseInsightDetails)) {
            return false;
        }

        EnableExternalMysqlDatabaseInsightDetails other =
                (EnableExternalMysqlDatabaseInsightDetails) o;
        return java.util.Objects.equals(this.databaseConnectorId, other.databaseConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseConnectorId == null
                                ? 43
                                : this.databaseConnectorId.hashCode());
        return result;
    }
}
