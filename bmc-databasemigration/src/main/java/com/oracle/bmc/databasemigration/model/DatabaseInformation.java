/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Database Information.
 *
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
    builder = DatabaseInformation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseInformation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseName", "databaseVersion", "dataSizeInMBs"})
    public DatabaseInformation(String databaseName, String databaseVersion, Integer dataSizeInMBs) {
        super();
        this.databaseName = databaseName;
        this.databaseVersion = databaseVersion;
        this.dataSizeInMBs = dataSizeInMBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The database name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The database name.
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * The database version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The total size of the database in megabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSizeInMBs")
        private Integer dataSizeInMBs;

        /**
         * The total size of the database in megabytes.
         * @param dataSizeInMBs the value to set
         * @return this builder
         **/
        public Builder dataSizeInMBs(Integer dataSizeInMBs) {
            this.dataSizeInMBs = dataSizeInMBs;
            this.__explicitlySet__.add("dataSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseInformation build() {
            DatabaseInformation model =
                    new DatabaseInformation(
                            this.databaseName, this.databaseVersion, this.dataSizeInMBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseInformation model) {
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("dataSizeInMBs")) {
                this.dataSizeInMBs(model.getDataSizeInMBs());
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
     * The database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The database name.
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * The database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The total size of the database in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSizeInMBs")
    private final Integer dataSizeInMBs;

    /**
     * The total size of the database in megabytes.
     * @return the value
     **/
    public Integer getDataSizeInMBs() {
        return dataSizeInMBs;
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
        sb.append("DatabaseInformation(");
        sb.append("super=").append(super.toString());
        sb.append("databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", dataSizeInMBs=").append(String.valueOf(this.dataSizeInMBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseInformation)) {
            return false;
        }

        DatabaseInformation other = (DatabaseInformation) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.dataSizeInMBs, other.dataSizeInMBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSizeInMBs == null ? 43 : this.dataSizeInMBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
