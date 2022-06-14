/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndexKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IndexKey {
    @Deprecated
    @java.beans.ConstructorProperties({"columnName", "jsonPath", "jsonFieldType"})
    public IndexKey(String columnName, String jsonPath, String jsonFieldType) {
        super();
        this.columnName = columnName;
        this.jsonPath = jsonPath;
        this.jsonFieldType = jsonFieldType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of a column to be included as an index key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of a column to be included as an index key.
         * @param columnName the value to set
         * @return this builder
         **/
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /**
         * If the specified column is of type JSON, jsonPath contains
         * a dotted path indicating the field within the JSON object
         * that will be the index key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
        private String jsonPath;

        /**
         * If the specified column is of type JSON, jsonPath contains
         * a dotted path indicating the field within the JSON object
         * that will be the index key.
         *
         * @param jsonPath the value to set
         * @return this builder
         **/
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            this.__explicitlySet__.add("jsonPath");
            return this;
        }
        /**
         * If the specified column is of type JSON, jsonFieldType contains
         * the type of the field indicated by jsonPath.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
        private String jsonFieldType;

        /**
         * If the specified column is of type JSON, jsonFieldType contains
         * the type of the field indicated by jsonPath.
         *
         * @param jsonFieldType the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of a column to be included as an index key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of a column to be included as an index key.
     * @return the value
     **/
    public String getColumnName() {
        return columnName;
    }

    /**
     * If the specified column is of type JSON, jsonPath contains
     * a dotted path indicating the field within the JSON object
     * that will be the index key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
    private final String jsonPath;

    /**
     * If the specified column is of type JSON, jsonPath contains
     * a dotted path indicating the field within the JSON object
     * that will be the index key.
     *
     * @return the value
     **/
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * If the specified column is of type JSON, jsonFieldType contains
     * the type of the field indicated by jsonPath.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
    private final String jsonFieldType;

    /**
     * If the specified column is of type JSON, jsonFieldType contains
     * the type of the field indicated by jsonPath.
     *
     * @return the value
     **/
    public String getJsonFieldType() {
        return jsonFieldType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IndexKey(");
        sb.append("columnName=").append(String.valueOf(this.columnName));
        sb.append(", jsonPath=").append(String.valueOf(this.jsonPath));
        sb.append(", jsonFieldType=").append(String.valueOf(this.jsonFieldType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndexKey)) {
            return false;
        }

        IndexKey other = (IndexKey) o;
        return java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.jsonPath, other.jsonPath)
                && java.util.Objects.equals(this.jsonFieldType, other.jsonFieldType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.jsonPath == null ? 43 : this.jsonPath.hashCode());
        result =
                (result * PRIME)
                        + (this.jsonFieldType == null ? 43 : this.jsonFieldType.hashCode());
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
