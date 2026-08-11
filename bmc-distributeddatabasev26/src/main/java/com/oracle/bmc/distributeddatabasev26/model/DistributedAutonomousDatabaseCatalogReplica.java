/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details of a catalog replica. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedAutonomousDatabaseCatalogReplica.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedAutonomousDatabaseCatalogReplica
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "database"})
    public DistributedAutonomousDatabaseCatalogReplica(
            String name, DistributedAutonomousDatabaseCatalogDatabase database) {
        super();
        this.name = name;
        this.database = database;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the catalog replica. It must start with a letter and contain only letters,
         * digits, and underscores. Maximum length is 40 characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the catalog replica. It must start with a letter and contain only letters,
         * digits, and underscores. Maximum length is 40 characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("database")
        private DistributedAutonomousDatabaseCatalogDatabase database;

        public Builder database(DistributedAutonomousDatabaseCatalogDatabase database) {
            this.database = database;
            this.__explicitlySet__.add("database");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDatabaseCatalogReplica build() {
            DistributedAutonomousDatabaseCatalogReplica model =
                    new DistributedAutonomousDatabaseCatalogReplica(this.name, this.database);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDatabaseCatalogReplica model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("database")) {
                this.database(model.getDatabase());
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
     * The name of the catalog replica. It must start with a letter and contain only letters,
     * digits, and underscores. Maximum length is 40 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the catalog replica. It must start with a letter and contain only letters,
     * digits, and underscores. Maximum length is 40 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("database")
    private final DistributedAutonomousDatabaseCatalogDatabase database;

    public DistributedAutonomousDatabaseCatalogDatabase getDatabase() {
        return database;
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
        sb.append("DistributedAutonomousDatabaseCatalogReplica(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", database=").append(String.valueOf(this.database));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDatabaseCatalogReplica)) {
            return false;
        }

        DistributedAutonomousDatabaseCatalogReplica other =
                (DistributedAutonomousDatabaseCatalogReplica) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.database, other.database)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.database == null ? 43 : this.database.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
