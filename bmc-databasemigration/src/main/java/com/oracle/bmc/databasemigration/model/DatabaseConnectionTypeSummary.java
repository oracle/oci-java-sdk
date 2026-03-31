/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Connection type e.g. ORACLE and array of technology type objects.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseConnectionTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseConnectionTypeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionType", "technologyTypes"})
    public DatabaseConnectionTypeSummary(
            ConnectionType connectionType, java.util.List<DatabaseTechnologyType> technologyTypes) {
        super();
        this.connectionType = connectionType;
        this.technologyTypes = technologyTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defines the type of connection. For example, ORACLE.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
        private ConnectionType connectionType;

        /**
         * Defines the type of connection. For example, ORACLE.
         * @param connectionType the value to set
         * @return this builder
         **/
        public Builder connectionType(ConnectionType connectionType) {
            this.connectionType = connectionType;
            this.__explicitlySet__.add("connectionType");
            return this;
        }
        /**
         * Array of technology type objects
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyTypes")
        private java.util.List<DatabaseTechnologyType> technologyTypes;

        /**
         * Array of technology type objects
         * @param technologyTypes the value to set
         * @return this builder
         **/
        public Builder technologyTypes(java.util.List<DatabaseTechnologyType> technologyTypes) {
            this.technologyTypes = technologyTypes;
            this.__explicitlySet__.add("technologyTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionTypeSummary build() {
            DatabaseConnectionTypeSummary model =
                    new DatabaseConnectionTypeSummary(this.connectionType, this.technologyTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionTypeSummary model) {
            if (model.wasPropertyExplicitlySet("connectionType")) {
                this.connectionType(model.getConnectionType());
            }
            if (model.wasPropertyExplicitlySet("technologyTypes")) {
                this.technologyTypes(model.getTechnologyTypes());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Defines the type of connection. For example, ORACLE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    private final ConnectionType connectionType;

    /**
     * Defines the type of connection. For example, ORACLE.
     * @return the value
     **/
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * Array of technology type objects
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyTypes")
    private final java.util.List<DatabaseTechnologyType> technologyTypes;

    /**
     * Array of technology type objects
     * @return the value
     **/
    public java.util.List<DatabaseTechnologyType> getTechnologyTypes() {
        return technologyTypes;
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
        sb.append("DatabaseConnectionTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("connectionType=").append(String.valueOf(this.connectionType));
        sb.append(", technologyTypes=").append(String.valueOf(this.technologyTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionTypeSummary)) {
            return false;
        }

        DatabaseConnectionTypeSummary other = (DatabaseConnectionTypeSummary) o;
        return java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.technologyTypes, other.technologyTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.technologyTypes == null ? 43 : this.technologyTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
