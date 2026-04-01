/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Technology type e.g. OCI_AUTONOMOUS_DATABASE, array of corresponding sub-types e.g. ADW_SHARED and versions.
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
    builder = DatabaseTechnologyType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseTechnologyType
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"technologyType", "technologySubTypes", "databaseVersions"})
    public DatabaseTechnologyType(
            TechnologyType technologyType,
            java.util.List<DatabaseTechnologySubType> technologySubTypes,
            java.util.List<String> databaseVersions) {
        super();
        this.technologyType = technologyType;
        this.technologySubTypes = technologySubTypes;
        this.databaseVersions = databaseVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Array of technology sub-types e.g. ADW_SHARED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologySubTypes")
        private java.util.List<DatabaseTechnologySubType> technologySubTypes;

        /**
         * Array of technology sub-types e.g. ADW_SHARED.
         * @param technologySubTypes the value to set
         * @return this builder
         **/
        public Builder technologySubTypes(
                java.util.List<DatabaseTechnologySubType> technologySubTypes) {
            this.technologySubTypes = technologySubTypes;
            this.__explicitlySet__.add("technologySubTypes");
            return this;
        }
        /**
         * Array of database versions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersions")
        private java.util.List<String> databaseVersions;

        /**
         * Array of database versions
         * @param databaseVersions the value to set
         * @return this builder
         **/
        public Builder databaseVersions(java.util.List<String> databaseVersions) {
            this.databaseVersions = databaseVersions;
            this.__explicitlySet__.add("databaseVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseTechnologyType build() {
            DatabaseTechnologyType model =
                    new DatabaseTechnologyType(
                            this.technologyType, this.technologySubTypes, this.databaseVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTechnologyType model) {
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("technologySubTypes")) {
                this.technologySubTypes(model.getTechnologySubTypes());
            }
            if (model.wasPropertyExplicitlySet("databaseVersions")) {
                this.databaseVersions(model.getDatabaseVersions());
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
     * The technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Array of technology sub-types e.g. ADW_SHARED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologySubTypes")
    private final java.util.List<DatabaseTechnologySubType> technologySubTypes;

    /**
     * Array of technology sub-types e.g. ADW_SHARED.
     * @return the value
     **/
    public java.util.List<DatabaseTechnologySubType> getTechnologySubTypes() {
        return technologySubTypes;
    }

    /**
     * Array of database versions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersions")
    private final java.util.List<String> databaseVersions;

    /**
     * Array of database versions
     * @return the value
     **/
    public java.util.List<String> getDatabaseVersions() {
        return databaseVersions;
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
        sb.append("DatabaseTechnologyType(");
        sb.append("super=").append(super.toString());
        sb.append("technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", technologySubTypes=").append(String.valueOf(this.technologySubTypes));
        sb.append(", databaseVersions=").append(String.valueOf(this.databaseVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTechnologyType)) {
            return false;
        }

        DatabaseTechnologyType other = (DatabaseTechnologyType) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.technologySubTypes, other.technologySubTypes)
                && java.util.Objects.equals(this.databaseVersions, other.databaseVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.technologySubTypes == null
                                ? 43
                                : this.technologySubTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersions == null ? 43 : this.databaseVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
