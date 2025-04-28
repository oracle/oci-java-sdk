/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Database objects to migrate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OracleMigrationObjectCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleMigrationObjectCollection extends MigrationObjectCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Database objects to exclude/include from migration */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<OracleDatabaseObjectSummary> items;

        /**
         * Database objects to exclude/include from migration
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<OracleDatabaseObjectSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
        private String bulkIncludeExcludeData;

        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         *
         * @param bulkIncludeExcludeData the value to set
         * @return this builder
         */
        public Builder bulkIncludeExcludeData(String bulkIncludeExcludeData) {
            this.bulkIncludeExcludeData = bulkIncludeExcludeData;
            this.__explicitlySet__.add("bulkIncludeExcludeData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleMigrationObjectCollection build() {
            OracleMigrationObjectCollection model =
                    new OracleMigrationObjectCollection(this.items, this.bulkIncludeExcludeData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleMigrationObjectCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("bulkIncludeExcludeData")) {
                this.bulkIncludeExcludeData(model.getBulkIncludeExcludeData());
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
    public OracleMigrationObjectCollection(
            java.util.List<OracleDatabaseObjectSummary> items, String bulkIncludeExcludeData) {
        super();
        this.items = items;
        this.bulkIncludeExcludeData = bulkIncludeExcludeData;
    }

    /** Database objects to exclude/include from migration */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<OracleDatabaseObjectSummary> items;

    /**
     * Database objects to exclude/include from migration
     *
     * @return the value
     */
    public java.util.List<OracleDatabaseObjectSummary> getItems() {
        return items;
    }

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
    private final String bulkIncludeExcludeData;

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     *
     * @return the value
     */
    public String getBulkIncludeExcludeData() {
        return bulkIncludeExcludeData;
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
        sb.append("OracleMigrationObjectCollection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", bulkIncludeExcludeData=").append(String.valueOf(this.bulkIncludeExcludeData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleMigrationObjectCollection)) {
            return false;
        }

        OracleMigrationObjectCollection other = (OracleMigrationObjectCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(
                        this.bulkIncludeExcludeData, other.bulkIncludeExcludeData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkIncludeExcludeData == null
                                ? 43
                                : this.bulkIncludeExcludeData.hashCode());
        return result;
    }
}
