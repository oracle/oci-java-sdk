/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * All the information surrounding a query, including the query statement,
 * limits, consistency, and so forth.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statement")
        private String statement;

        public Builder statement(String statement) {
            this.statement = statement;
            this.__explicitlySet__.add("statement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrepared")
        private Boolean isPrepared;

        public Builder isPrepared(Boolean isPrepared) {
            this.isPrepared = isPrepared;
            this.__explicitlySet__.add("isPrepared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consistency")
        private Consistency consistency;

        public Builder consistency(Consistency consistency) {
            this.consistency = consistency;
            this.__explicitlySet__.add("consistency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxReadInKBs")
        private Integer maxReadInKBs;

        public Builder maxReadInKBs(Integer maxReadInKBs) {
            this.maxReadInKBs = maxReadInKBs;
            this.__explicitlySet__.add("maxReadInKBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.Map<String, Object> variables;

        public Builder variables(java.util.Map<String, Object> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDetails build() {
            QueryDetails __instance__ =
                    new QueryDetails(
                            compartmentId,
                            statement,
                            isPrepared,
                            consistency,
                            maxReadInKBs,
                            variables,
                            timeoutInMs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .statement(o.getStatement())
                            .isPrepared(o.getIsPrepared())
                            .consistency(o.getConsistency())
                            .maxReadInKBs(o.getMaxReadInKBs())
                            .variables(o.getVariables())
                            .timeoutInMs(o.getTimeoutInMs());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Compartment OCID, to provide context for a table name in
     * the given statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A NoSQL SQL query statement; or a Base64-encoded prepared statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statement")
    private final String statement;

    public String getStatement() {
        return statement;
    }

    /**
     * If true, the statement is a prepared statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrepared")
    private final Boolean isPrepared;

    public Boolean getIsPrepared() {
        return isPrepared;
    }

    /**
     * Consistency requirement for a read operation.
     **/
    public enum Consistency {
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
    /**
     * Consistency requirement for a read operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consistency")
    private final Consistency consistency;

    public Consistency getConsistency() {
        return consistency;
    }

    /**
     * A limit on the total amount of data read during this operation, in KB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadInKBs")
    private final Integer maxReadInKBs;

    public Integer getMaxReadInKBs() {
        return maxReadInKBs;
    }

    /**
     * A map of prepared statement variables to values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, Object> variables;

    public java.util.Map<String, Object> getVariables() {
        return variables;
    }

    /**
     * Timeout setting for the query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    private final Integer timeoutInMs;

    public Integer getTimeoutInMs() {
        return timeoutInMs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", statement=").append(String.valueOf(this.statement));
        sb.append(", isPrepared=").append(String.valueOf(this.isPrepared));
        sb.append(", consistency=").append(String.valueOf(this.consistency));
        sb.append(", maxReadInKBs=").append(String.valueOf(this.maxReadInKBs));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", timeoutInMs=").append(String.valueOf(this.timeoutInMs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
