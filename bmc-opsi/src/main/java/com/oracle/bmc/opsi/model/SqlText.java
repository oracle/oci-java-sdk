/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Text type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlText {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
        private String sqlCommand;

        public Builder sqlCommand(String sqlCommand) {
            this.sqlCommand = sqlCommand;
            this.__explicitlySet__.add("sqlCommand");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
        private String exactMatchingSignature;

        public Builder exactMatchingSignature(String exactMatchingSignature) {
            this.exactMatchingSignature = exactMatchingSignature;
            this.__explicitlySet__.add("exactMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
        private String forceMatchingSignature;

        public Builder forceMatchingSignature(String forceMatchingSignature) {
            this.forceMatchingSignature = forceMatchingSignature;
            this.__explicitlySet__.add("forceMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlFullText")
        private String sqlFullText;

        public Builder sqlFullText(String sqlFullText) {
            this.sqlFullText = sqlFullText;
            this.__explicitlySet__.add("sqlFullText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlText build() {
            SqlText __instance__ =
                    new SqlText(
                            version,
                            sqlIdentifier,
                            timeCollected,
                            sqlCommand,
                            exactMatchingSignature,
                            forceMatchingSignature,
                            sqlFullText);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlText o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .sqlIdentifier(o.getSqlIdentifier())
                            .timeCollected(o.getTimeCollected())
                            .sqlCommand(o.getSqlCommand())
                            .exactMatchingSignature(o.getExactMatchingSignature())
                            .forceMatchingSignature(o.getForceMatchingSignature())
                            .sqlFullText(o.getSqlFullText());

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
     * Version
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Float version;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    String sqlIdentifier;

    /**
     * Collection timestamp
     * Example: `\"2020-05-06T00:00:00.000Z\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * SQL command
     * Example: `\"SELECT\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
    String sqlCommand;

    /**
     * Exact matching signature
     * Example: `\"18067345456756876713\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
    String exactMatchingSignature;

    /**
     * Force matching signature
     * Example: `\"18067345456756876713\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
    String forceMatchingSignature;

    /**
     * Full SQL Text
     * Example: `\"SELECT username,profile,default_tablespace,temporary_tablespace FROM dba_users\"`
     * Disclaimer: SQL text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column should be masked prior to ingestion.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlFullText")
    String sqlFullText;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
