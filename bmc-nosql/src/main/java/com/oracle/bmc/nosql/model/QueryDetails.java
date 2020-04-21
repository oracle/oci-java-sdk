/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class QueryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Compartment OCID, to provide context for a table name in
     * the given statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A NoSQL SQL query statement; or a Base64-encoded prepared statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statement")
    String statement;

    /**
     * If true, the statement is a prepared statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrepared")
    Boolean isPrepared;
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
    Consistency consistency;

    /**
     * A limit on the total amount of data read during this operation, in KB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadInKBs")
    Integer maxReadInKBs;

    /**
     * A map of prepared statement variables to values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    java.util.Map<String, Object> variables;

    /**
     * Timeout setting for the query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    Integer timeoutInMs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
