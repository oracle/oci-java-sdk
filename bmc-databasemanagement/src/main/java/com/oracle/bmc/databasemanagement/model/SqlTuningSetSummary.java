/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary information of a SQL tuning set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningSetSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningSetSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "owner", "description", "statementCounts"})
    public SqlTuningSetSummary(
            String name, String owner, String description, Integer statementCounts) {
        super();
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.statementCounts = statementCounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the SQL tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the SQL tuning set.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The owner of the SQL tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the SQL tuning set.
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * The description of the SQL tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL tuning set.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The number of SQL statements in the SQL tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
        private Integer statementCounts;

        /**
         * The number of SQL statements in the SQL tuning set.
         * @param statementCounts the value to set
         * @return this builder
         **/
        public Builder statementCounts(Integer statementCounts) {
            this.statementCounts = statementCounts;
            this.__explicitlySet__.add("statementCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningSetSummary build() {
            SqlTuningSetSummary model =
                    new SqlTuningSetSummary(
                            this.name, this.owner, this.description, this.statementCounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningSetSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("statementCounts")) {
                this.statementCounts(model.getStatementCounts());
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
     * The name of the SQL tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the SQL tuning set.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The owner of the SQL tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the SQL tuning set.
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    /**
     * The description of the SQL tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL tuning set.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The number of SQL statements in the SQL tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
    private final Integer statementCounts;

    /**
     * The number of SQL statements in the SQL tuning set.
     * @return the value
     **/
    public Integer getStatementCounts() {
        return statementCounts;
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
        sb.append("SqlTuningSetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", statementCounts=").append(String.valueOf(this.statementCounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningSetSummary)) {
            return false;
        }

        SqlTuningSetSummary other = (SqlTuningSetSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.statementCounts, other.statementCounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.statementCounts == null ? 43 : this.statementCounts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
