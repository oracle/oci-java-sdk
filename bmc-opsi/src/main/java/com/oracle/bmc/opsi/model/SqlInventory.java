/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Inventory details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlInventory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlInventory extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalSqls", "totalDatabases", "sqlsAnalyzed"})
    public SqlInventory(Long totalSqls, Integer totalDatabases, Long sqlsAnalyzed) {
        super();
        this.totalSqls = totalSqls;
        this.totalDatabases = totalDatabases;
        this.sqlsAnalyzed = sqlsAnalyzed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total number of sqls. Example {@code 2000}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSqls")
        private Long totalSqls;

        /**
         * Total number of sqls. Example {@code 2000}
         * @param totalSqls the value to set
         * @return this builder
         **/
        public Builder totalSqls(Long totalSqls) {
            this.totalSqls = totalSqls;
            this.__explicitlySet__.add("totalSqls");
            return this;
        }
        /**
         * Total number of Databases. Example {@code 400}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalDatabases")
        private Integer totalDatabases;

        /**
         * Total number of Databases. Example {@code 400}
         * @param totalDatabases the value to set
         * @return this builder
         **/
        public Builder totalDatabases(Integer totalDatabases) {
            this.totalDatabases = totalDatabases;
            this.__explicitlySet__.add("totalDatabases");
            return this;
        }
        /**
         * Total number of sqls analyzed by the query. Example {@code 120}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlsAnalyzed")
        private Long sqlsAnalyzed;

        /**
         * Total number of sqls analyzed by the query. Example {@code 120}
         * @param sqlsAnalyzed the value to set
         * @return this builder
         **/
        public Builder sqlsAnalyzed(Long sqlsAnalyzed) {
            this.sqlsAnalyzed = sqlsAnalyzed;
            this.__explicitlySet__.add("sqlsAnalyzed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInventory build() {
            SqlInventory model =
                    new SqlInventory(this.totalSqls, this.totalDatabases, this.sqlsAnalyzed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInventory model) {
            if (model.wasPropertyExplicitlySet("totalSqls")) {
                this.totalSqls(model.getTotalSqls());
            }
            if (model.wasPropertyExplicitlySet("totalDatabases")) {
                this.totalDatabases(model.getTotalDatabases());
            }
            if (model.wasPropertyExplicitlySet("sqlsAnalyzed")) {
                this.sqlsAnalyzed(model.getSqlsAnalyzed());
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
     * Total number of sqls. Example {@code 2000}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqls")
    private final Long totalSqls;

    /**
     * Total number of sqls. Example {@code 2000}
     * @return the value
     **/
    public Long getTotalSqls() {
        return totalSqls;
    }

    /**
     * Total number of Databases. Example {@code 400}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDatabases")
    private final Integer totalDatabases;

    /**
     * Total number of Databases. Example {@code 400}
     * @return the value
     **/
    public Integer getTotalDatabases() {
        return totalDatabases;
    }

    /**
     * Total number of sqls analyzed by the query. Example {@code 120}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlsAnalyzed")
    private final Long sqlsAnalyzed;

    /**
     * Total number of sqls analyzed by the query. Example {@code 120}
     * @return the value
     **/
    public Long getSqlsAnalyzed() {
        return sqlsAnalyzed;
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
        sb.append("SqlInventory(");
        sb.append("super=").append(super.toString());
        sb.append("totalSqls=").append(String.valueOf(this.totalSqls));
        sb.append(", totalDatabases=").append(String.valueOf(this.totalDatabases));
        sb.append(", sqlsAnalyzed=").append(String.valueOf(this.sqlsAnalyzed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInventory)) {
            return false;
        }

        SqlInventory other = (SqlInventory) o;
        return java.util.Objects.equals(this.totalSqls, other.totalSqls)
                && java.util.Objects.equals(this.totalDatabases, other.totalDatabases)
                && java.util.Objects.equals(this.sqlsAnalyzed, other.sqlsAnalyzed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalSqls == null ? 43 : this.totalSqls.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDatabases == null ? 43 : this.totalDatabases.hashCode());
        result = (result * PRIME) + (this.sqlsAnalyzed == null ? 43 : this.sqlsAnalyzed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
