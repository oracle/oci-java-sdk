/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifies a single key in a secondary index.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndexKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IndexKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
        private String jsonPath;

        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            this.__explicitlySet__.add("jsonPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
        private String jsonFieldType;

        public Builder jsonFieldType(String jsonFieldType) {
            this.jsonFieldType = jsonFieldType;
            this.__explicitlySet__.add("jsonFieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndexKey build() {
            IndexKey __instance__ = new IndexKey(columnName, jsonPath, jsonFieldType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndexKey o) {
            Builder copiedBuilder =
                    columnName(o.getColumnName())
                            .jsonPath(o.getJsonPath())
                            .jsonFieldType(o.getJsonFieldType());

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
     * The name of a column to be included as an index key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    /**
     * If the specified column is of type JSON, jsonPath contains
     * a dotted path indicating the field within the JSON object
     * that will be the index key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
    String jsonPath;

    /**
     * If the specified column is of type JSON, jsonFieldType contains
     * the type of the field indicated by jsonPath.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
    String jsonFieldType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
