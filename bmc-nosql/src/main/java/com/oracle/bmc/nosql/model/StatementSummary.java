/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Information derived from parsing a NoSQL SQL statement.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StatementSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("indexName")
        private String indexName;

        public Builder indexName(String indexName) {
            this.indexName = indexName;
            this.__explicitlySet__.add("indexName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIfExists")
        private Boolean isIfExists;

        public Builder isIfExists(Boolean isIfExists) {
            this.isIfExists = isIfExists;
            this.__explicitlySet__.add("isIfExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
        private Boolean isIfNotExists;

        public Builder isIfNotExists(Boolean isIfNotExists) {
            this.isIfNotExists = isIfNotExists;
            this.__explicitlySet__.add("isIfNotExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syntaxError")
        private String syntaxError;

        public Builder syntaxError(String syntaxError) {
            this.syntaxError = syntaxError;
            this.__explicitlySet__.add("syntaxError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatementSummary build() {
            StatementSummary __instance__ =
                    new StatementSummary(
                            operation,
                            tableName,
                            indexName,
                            isIfExists,
                            isIfNotExists,
                            syntaxError);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatementSummary o) {
            Builder copiedBuilder =
                    operation(o.getOperation())
                            .tableName(o.getTableName())
                            .indexName(o.getIndexName())
                            .isIfExists(o.getIsIfExists())
                            .isIfNotExists(o.getIsIfNotExists())
                            .syntaxError(o.getSyntaxError());

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
     * The operation represented in the statement, e.g. CREATE_TABLE.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Operation {
        CreateTable("CREATE_TABLE"),
        AlterTable("ALTER_TABLE"),
        DropTable("DROP_TABLE"),
        CreateIndex("CREATE_INDEX"),
        DropIndex("DROP_INDEX"),
        Select("SELECT"),
        Update("UPDATE"),
        Insert("INSERT"),
        Delete("DELETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operation represented in the statement, e.g. CREATE_TABLE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Operation operation;

    /**
     * The table name from the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    /**
     * The index name from the SQL statement, if present.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    String indexName;

    /**
     * True if the statement includes "IF EXISTS."
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIfExists")
    Boolean isIfExists;

    /**
     * True if the statement includes "IF NOT EXISTS."
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
    Boolean isIfNotExists;

    /**
     * If present, indicates a syntax error in the statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntaxError")
    String syntaxError;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
