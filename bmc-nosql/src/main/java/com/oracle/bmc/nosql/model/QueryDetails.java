/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * All the information surrounding a query, including the query statement, limits, consistency, and
 * so forth. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "statement",
        "isPrepared",
        "consistency",
        "maxReadInKBs",
        "variables",
        "timeoutInMs"
    })
    public QueryDetails(
            String compartmentId,
            String statement,
            Boolean isPrepared,
            Consistency consistency,
            Integer maxReadInKBs,
            java.util.Map<String, Object> variables,
            Integer timeoutInMs) {
        super();
        this.compartmentId = compartmentId;
        this.statement = statement;
        this.isPrepared = isPrepared;
        this.consistency = consistency;
        this.maxReadInKBs = maxReadInKBs;
        this.variables = variables;
        this.timeoutInMs = timeoutInMs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compartment OCID, to provide context for a table name in the given statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID, to provide context for a table name in the given statement.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A NoSQL SQL query statement; or a Base64-encoded prepared statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("statement")
        private String statement;

        /**
         * A NoSQL SQL query statement; or a Base64-encoded prepared statement.
         *
         * @param statement the value to set
         * @return this builder
         */
        public Builder statement(String statement) {
            this.statement = statement;
            this.__explicitlySet__.add("statement");
            return this;
        }
        /** If true, the statement is a prepared statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrepared")
        private Boolean isPrepared;

        /**
         * If true, the statement is a prepared statement.
         *
         * @param isPrepared the value to set
         * @return this builder
         */
        public Builder isPrepared(Boolean isPrepared) {
            this.isPrepared = isPrepared;
            this.__explicitlySet__.add("isPrepared");
            return this;
        }
        /** Consistency requirement for a read operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("consistency")
        private Consistency consistency;

        /**
         * Consistency requirement for a read operation.
         *
         * @param consistency the value to set
         * @return this builder
         */
        public Builder consistency(Consistency consistency) {
            this.consistency = consistency;
            this.__explicitlySet__.add("consistency");
            return this;
        }
        /** A limit on the total amount of data read during this operation, in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxReadInKBs")
        private Integer maxReadInKBs;

        /**
         * A limit on the total amount of data read during this operation, in KB.
         *
         * @param maxReadInKBs the value to set
         * @return this builder
         */
        public Builder maxReadInKBs(Integer maxReadInKBs) {
            this.maxReadInKBs = maxReadInKBs;
            this.__explicitlySet__.add("maxReadInKBs");
            return this;
        }
        /** A map of prepared statement variables to values. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.Map<String, Object> variables;

        /**
         * A map of prepared statement variables to values.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.Map<String, Object> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }
        /** Timeout setting for the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        /**
         * Timeout setting for the query.
         *
         * @param timeoutInMs the value to set
         * @return this builder
         */
        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDetails build() {
            QueryDetails model =
                    new QueryDetails(
                            this.compartmentId,
                            this.statement,
                            this.isPrepared,
                            this.consistency,
                            this.maxReadInKBs,
                            this.variables,
                            this.timeoutInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("statement")) {
                this.statement(model.getStatement());
            }
            if (model.wasPropertyExplicitlySet("isPrepared")) {
                this.isPrepared(model.getIsPrepared());
            }
            if (model.wasPropertyExplicitlySet("consistency")) {
                this.consistency(model.getConsistency());
            }
            if (model.wasPropertyExplicitlySet("maxReadInKBs")) {
                this.maxReadInKBs(model.getMaxReadInKBs());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMs")) {
                this.timeoutInMs(model.getTimeoutInMs());
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

    /** Compartment OCID, to provide context for a table name in the given statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID, to provide context for a table name in the given statement.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A NoSQL SQL query statement; or a Base64-encoded prepared statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("statement")
    private final String statement;

    /**
     * A NoSQL SQL query statement; or a Base64-encoded prepared statement.
     *
     * @return the value
     */
    public String getStatement() {
        return statement;
    }

    /** If true, the statement is a prepared statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrepared")
    private final Boolean isPrepared;

    /**
     * If true, the statement is a prepared statement.
     *
     * @return the value
     */
    public Boolean getIsPrepared() {
        return isPrepared;
    }

    /** Consistency requirement for a read operation. */
    public enum Consistency implements com.oracle.bmc.http.internal.BmcEnum {
        Eventual("EVENTUAL"),
        Absolute("ABSOLUTE"),
        ;

        private final String value;
        private static java.util.Map<String, Consistency> map;

        static {
            map = new java.util.HashMap<>();
            for (Consistency v : Consistency.values()) {
                map.put(v.getValue(), v);
            }
        }

        Consistency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Consistency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Consistency: " + key);
        }
    };
    /** Consistency requirement for a read operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("consistency")
    private final Consistency consistency;

    /**
     * Consistency requirement for a read operation.
     *
     * @return the value
     */
    public Consistency getConsistency() {
        return consistency;
    }

    /** A limit on the total amount of data read during this operation, in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadInKBs")
    private final Integer maxReadInKBs;

    /**
     * A limit on the total amount of data read during this operation, in KB.
     *
     * @return the value
     */
    public Integer getMaxReadInKBs() {
        return maxReadInKBs;
    }

    /** A map of prepared statement variables to values. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, Object> variables;

    /**
     * A map of prepared statement variables to values.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getVariables() {
        return variables;
    }

    /** Timeout setting for the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    private final Integer timeoutInMs;

    /**
     * Timeout setting for the query.
     *
     * @return the value
     */
    public Integer getTimeoutInMs() {
        return timeoutInMs;
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
        sb.append("QueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", statement=").append(String.valueOf(this.statement));
        sb.append(", isPrepared=").append(String.valueOf(this.isPrepared));
        sb.append(", consistency=").append(String.valueOf(this.consistency));
        sb.append(", maxReadInKBs=").append(String.valueOf(this.maxReadInKBs));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", timeoutInMs=").append(String.valueOf(this.timeoutInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDetails)) {
            return false;
        }

        QueryDetails other = (QueryDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.statement, other.statement)
                && java.util.Objects.equals(this.isPrepared, other.isPrepared)
                && java.util.Objects.equals(this.consistency, other.consistency)
                && java.util.Objects.equals(this.maxReadInKBs, other.maxReadInKBs)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.timeoutInMs, other.timeoutInMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.statement == null ? 43 : this.statement.hashCode());
        result = (result * PRIME) + (this.isPrepared == null ? 43 : this.isPrepared.hashCode());
        result = (result * PRIME) + (this.consistency == null ? 43 : this.consistency.hashCode());
        result = (result * PRIME) + (this.maxReadInKBs == null ? 43 : this.maxReadInKBs.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.timeoutInMs == null ? 43 : this.timeoutInMs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
