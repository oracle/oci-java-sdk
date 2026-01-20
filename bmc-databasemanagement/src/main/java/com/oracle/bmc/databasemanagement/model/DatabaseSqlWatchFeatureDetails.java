/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to enable the SQL Watch feature. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseSqlWatchFeatureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "feature")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseSqlWatchFeatureDetails extends DatabaseFeatureDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
        private DatabaseConnectionDetails databaseConnectionDetails;

        public Builder databaseConnectionDetails(
                DatabaseConnectionDetails databaseConnectionDetails) {
            this.databaseConnectionDetails = databaseConnectionDetails;
            this.__explicitlySet__.add("databaseConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorDetails")
        private ConnectorDetails connectorDetails;

        public Builder connectorDetails(ConnectorDetails connectorDetails) {
            this.connectorDetails = connectorDetails;
            this.__explicitlySet__.add("connectorDetails");
            return this;
        }
        /**
         * Indicates whether SQL Watch should be enabled for all the current pluggable databases in
         * the container database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canEnableAllCurrentPdbs")
        private Boolean canEnableAllCurrentPdbs;

        /**
         * Indicates whether SQL Watch should be enabled for all the current pluggable databases in
         * the container database.
         *
         * @param canEnableAllCurrentPdbs the value to set
         * @return this builder
         */
        public Builder canEnableAllCurrentPdbs(Boolean canEnableAllCurrentPdbs) {
            this.canEnableAllCurrentPdbs = canEnableAllCurrentPdbs;
            this.__explicitlySet__.add("canEnableAllCurrentPdbs");
            return this;
        }
        /**
         * Indicates whether SQL Watch should be enabled automatically for all the pluggable
         * databases in the container database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoEnablePluggableDatabase")
        private Boolean isAutoEnablePluggableDatabase;

        /**
         * Indicates whether SQL Watch should be enabled automatically for all the pluggable
         * databases in the container database.
         *
         * @param isAutoEnablePluggableDatabase the value to set
         * @return this builder
         */
        public Builder isAutoEnablePluggableDatabase(Boolean isAutoEnablePluggableDatabase) {
            this.isAutoEnablePluggableDatabase = isAutoEnablePluggableDatabase;
            this.__explicitlySet__.add("isAutoEnablePluggableDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSqlWatchFeatureDetails build() {
            DatabaseSqlWatchFeatureDetails model =
                    new DatabaseSqlWatchFeatureDetails(
                            this.databaseConnectionDetails,
                            this.connectorDetails,
                            this.canEnableAllCurrentPdbs,
                            this.isAutoEnablePluggableDatabase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSqlWatchFeatureDetails model) {
            if (model.wasPropertyExplicitlySet("databaseConnectionDetails")) {
                this.databaseConnectionDetails(model.getDatabaseConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("connectorDetails")) {
                this.connectorDetails(model.getConnectorDetails());
            }
            if (model.wasPropertyExplicitlySet("canEnableAllCurrentPdbs")) {
                this.canEnableAllCurrentPdbs(model.getCanEnableAllCurrentPdbs());
            }
            if (model.wasPropertyExplicitlySet("isAutoEnablePluggableDatabase")) {
                this.isAutoEnablePluggableDatabase(model.getIsAutoEnablePluggableDatabase());
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
    public DatabaseSqlWatchFeatureDetails(
            DatabaseConnectionDetails databaseConnectionDetails,
            ConnectorDetails connectorDetails,
            Boolean canEnableAllCurrentPdbs,
            Boolean isAutoEnablePluggableDatabase) {
        super(databaseConnectionDetails, connectorDetails);
        this.canEnableAllCurrentPdbs = canEnableAllCurrentPdbs;
        this.isAutoEnablePluggableDatabase = isAutoEnablePluggableDatabase;
    }

    /**
     * Indicates whether SQL Watch should be enabled for all the current pluggable databases in the
     * container database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canEnableAllCurrentPdbs")
    private final Boolean canEnableAllCurrentPdbs;

    /**
     * Indicates whether SQL Watch should be enabled for all the current pluggable databases in the
     * container database.
     *
     * @return the value
     */
    public Boolean getCanEnableAllCurrentPdbs() {
        return canEnableAllCurrentPdbs;
    }

    /**
     * Indicates whether SQL Watch should be enabled automatically for all the pluggable databases
     * in the container database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoEnablePluggableDatabase")
    private final Boolean isAutoEnablePluggableDatabase;

    /**
     * Indicates whether SQL Watch should be enabled automatically for all the pluggable databases
     * in the container database.
     *
     * @return the value
     */
    public Boolean getIsAutoEnablePluggableDatabase() {
        return isAutoEnablePluggableDatabase;
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
        sb.append("DatabaseSqlWatchFeatureDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", canEnableAllCurrentPdbs=")
                .append(String.valueOf(this.canEnableAllCurrentPdbs));
        sb.append(", isAutoEnablePluggableDatabase=")
                .append(String.valueOf(this.isAutoEnablePluggableDatabase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseSqlWatchFeatureDetails)) {
            return false;
        }

        DatabaseSqlWatchFeatureDetails other = (DatabaseSqlWatchFeatureDetails) o;
        return java.util.Objects.equals(this.canEnableAllCurrentPdbs, other.canEnableAllCurrentPdbs)
                && java.util.Objects.equals(
                        this.isAutoEnablePluggableDatabase, other.isAutoEnablePluggableDatabase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.canEnableAllCurrentPdbs == null
                                ? 43
                                : this.canEnableAllCurrentPdbs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoEnablePluggableDatabase == null
                                ? 43
                                : this.isAutoEnablePluggableDatabase.hashCode());
        return result;
    }
}
