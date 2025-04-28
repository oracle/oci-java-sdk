/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The details of the customer Database Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciDatabaseConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "indexConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciDatabaseConfig extends IndexConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnection")
        private DatabaseConnection databaseConnection;

        public Builder databaseConnection(DatabaseConnection databaseConnection) {
            this.databaseConnection = databaseConnection;
            this.__explicitlySet__.add("databaseConnection");
            return this;
        }
        /** Array of Database functions to be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseFunctions")
        private java.util.List<DatabaseFunction> databaseFunctions;

        /**
         * Array of Database functions to be used.
         *
         * @param databaseFunctions the value to set
         * @return this builder
         */
        public Builder databaseFunctions(java.util.List<DatabaseFunction> databaseFunctions) {
            this.databaseFunctions = databaseFunctions;
            this.__explicitlySet__.add("databaseFunctions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciDatabaseConfig build() {
            OciDatabaseConfig model =
                    new OciDatabaseConfig(this.databaseConnection, this.databaseFunctions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciDatabaseConfig model) {
            if (model.wasPropertyExplicitlySet("databaseConnection")) {
                this.databaseConnection(model.getDatabaseConnection());
            }
            if (model.wasPropertyExplicitlySet("databaseFunctions")) {
                this.databaseFunctions(model.getDatabaseFunctions());
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
    public OciDatabaseConfig(
            DatabaseConnection databaseConnection,
            java.util.List<DatabaseFunction> databaseFunctions) {
        super();
        this.databaseConnection = databaseConnection;
        this.databaseFunctions = databaseFunctions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnection")
    private final DatabaseConnection databaseConnection;

    public DatabaseConnection getDatabaseConnection() {
        return databaseConnection;
    }

    /** Array of Database functions to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseFunctions")
    private final java.util.List<DatabaseFunction> databaseFunctions;

    /**
     * Array of Database functions to be used.
     *
     * @return the value
     */
    public java.util.List<DatabaseFunction> getDatabaseFunctions() {
        return databaseFunctions;
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
        sb.append("OciDatabaseConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseConnection=").append(String.valueOf(this.databaseConnection));
        sb.append(", databaseFunctions=").append(String.valueOf(this.databaseFunctions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciDatabaseConfig)) {
            return false;
        }

        OciDatabaseConfig other = (OciDatabaseConfig) o;
        return java.util.Objects.equals(this.databaseConnection, other.databaseConnection)
                && java.util.Objects.equals(this.databaseFunctions, other.databaseFunctions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseConnection == null
                                ? 43
                                : this.databaseConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseFunctions == null ? 43 : this.databaseFunctions.hashCode());
        return result;
    }
}
