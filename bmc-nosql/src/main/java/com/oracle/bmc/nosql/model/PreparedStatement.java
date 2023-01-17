/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of query preparation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PreparedStatement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PreparedStatement
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statement", "queryPlan", "usage"})
    public PreparedStatement(String statement, Object queryPlan, RequestUsage usage) {
        super();
        this.statement = statement;
        this.queryPlan = queryPlan;
        this.usage = usage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A base64-encoded, compiled and parameterized version of a SQL statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("statement")
        private String statement;

        /**
         * A base64-encoded, compiled and parameterized version of a SQL statement.
         *
         * @param statement the value to set
         * @return this builder
         */
        public Builder statement(String statement) {
            this.statement = statement;
            this.__explicitlySet__.add("statement");
            return this;
        }
        /** A representation of the query plan as a schema-less JSON object. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryPlan")
        private Object queryPlan;

        /**
         * A representation of the query plan as a schema-less JSON object.
         *
         * @param queryPlan the value to set
         * @return this builder
         */
        public Builder queryPlan(Object queryPlan) {
            this.queryPlan = queryPlan;
            this.__explicitlySet__.add("queryPlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreparedStatement build() {
            PreparedStatement model =
                    new PreparedStatement(this.statement, this.queryPlan, this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreparedStatement model) {
            if (model.wasPropertyExplicitlySet("statement")) {
                this.statement(model.getStatement());
            }
            if (model.wasPropertyExplicitlySet("queryPlan")) {
                this.queryPlan(model.getQueryPlan());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
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

    /** A base64-encoded, compiled and parameterized version of a SQL statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("statement")
    private final String statement;

    /**
     * A base64-encoded, compiled and parameterized version of a SQL statement.
     *
     * @return the value
     */
    public String getStatement() {
        return statement;
    }

    /** A representation of the query plan as a schema-less JSON object. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryPlan")
    private final Object queryPlan;

    /**
     * A representation of the query plan as a schema-less JSON object.
     *
     * @return the value
     */
    public Object getQueryPlan() {
        return queryPlan;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final RequestUsage usage;

    public RequestUsage getUsage() {
        return usage;
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
        sb.append("PreparedStatement(");
        sb.append("super=").append(super.toString());
        sb.append("statement=").append(String.valueOf(this.statement));
        sb.append(", queryPlan=").append(String.valueOf(this.queryPlan));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreparedStatement)) {
            return false;
        }

        PreparedStatement other = (PreparedStatement) o;
        return java.util.Objects.equals(this.statement, other.statement)
                && java.util.Objects.equals(this.queryPlan, other.queryPlan)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statement == null ? 43 : this.statement.hashCode());
        result = (result * PRIME) + (this.queryPlan == null ? 43 : this.queryPlan.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
