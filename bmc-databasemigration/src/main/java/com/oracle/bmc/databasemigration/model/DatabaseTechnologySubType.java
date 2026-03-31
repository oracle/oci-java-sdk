/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Technology sub-type e.g. ADW_SHARED and database versions corresponding to the sub-type.
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
    builder = DatabaseTechnologySubType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseTechnologySubType
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "technologySubType",
        "technologySubTypeDisplayName",
        "databaseVersions"
    })
    public DatabaseTechnologySubType(
            String technologySubType,
            String technologySubTypeDisplayName,
            java.util.List<String> databaseVersions) {
        super();
        this.technologySubType = technologySubType;
        this.technologySubTypeDisplayName = technologySubTypeDisplayName;
        this.databaseVersions = databaseVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Technology sub-type e.g. ADW_SHARED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologySubType")
        private String technologySubType;

        /**
         * Technology sub-type e.g. ADW_SHARED.
         * @param technologySubType the value to set
         * @return this builder
         **/
        public Builder technologySubType(String technologySubType) {
            this.technologySubType = technologySubType;
            this.__explicitlySet__.add("technologySubType");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologySubTypeDisplayName")
        private String technologySubTypeDisplayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param technologySubTypeDisplayName the value to set
         * @return this builder
         **/
        public Builder technologySubTypeDisplayName(String technologySubTypeDisplayName) {
            this.technologySubTypeDisplayName = technologySubTypeDisplayName;
            this.__explicitlySet__.add("technologySubTypeDisplayName");
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

        public DatabaseTechnologySubType build() {
            DatabaseTechnologySubType model =
                    new DatabaseTechnologySubType(
                            this.technologySubType,
                            this.technologySubTypeDisplayName,
                            this.databaseVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTechnologySubType model) {
            if (model.wasPropertyExplicitlySet("technologySubType")) {
                this.technologySubType(model.getTechnologySubType());
            }
            if (model.wasPropertyExplicitlySet("technologySubTypeDisplayName")) {
                this.technologySubTypeDisplayName(model.getTechnologySubTypeDisplayName());
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
     * Technology sub-type e.g. ADW_SHARED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologySubType")
    private final String technologySubType;

    /**
     * Technology sub-type e.g. ADW_SHARED.
     * @return the value
     **/
    public String getTechnologySubType() {
        return technologySubType;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologySubTypeDisplayName")
    private final String technologySubTypeDisplayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getTechnologySubTypeDisplayName() {
        return technologySubTypeDisplayName;
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
        sb.append("DatabaseTechnologySubType(");
        sb.append("super=").append(super.toString());
        sb.append("technologySubType=").append(String.valueOf(this.technologySubType));
        sb.append(", technologySubTypeDisplayName=")
                .append(String.valueOf(this.technologySubTypeDisplayName));
        sb.append(", databaseVersions=").append(String.valueOf(this.databaseVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTechnologySubType)) {
            return false;
        }

        DatabaseTechnologySubType other = (DatabaseTechnologySubType) o;
        return java.util.Objects.equals(this.technologySubType, other.technologySubType)
                && java.util.Objects.equals(
                        this.technologySubTypeDisplayName, other.technologySubTypeDisplayName)
                && java.util.Objects.equals(this.databaseVersions, other.databaseVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.technologySubType == null ? 43 : this.technologySubType.hashCode());
        result =
                (result * PRIME)
                        + (this.technologySubTypeDisplayName == null
                                ? 43
                                : this.technologySubTypeDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersions == null ? 43 : this.databaseVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
