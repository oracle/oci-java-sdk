/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifies a single key in a secondary index. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndexKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IndexKey extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The name of a column to be included as an index key. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of a column to be included as an index key.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /**
         * If the specified column is of type JSON, jsonPath contains a dotted path indicating the
         * field within the JSON object that will be the index key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
        private String jsonPath;

        /**
         * If the specified column is of type JSON, jsonPath contains a dotted path indicating the
         * field within the JSON object that will be the index key.
         *
         * @param jsonPath the value to set
         * @return this builder
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            this.__explicitlySet__.add("jsonPath");
            return this;
        }
        /**
         * If the specified column is of type JSON, jsonFieldType contains the type of the field
         * indicated by jsonPath.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
        private String jsonFieldType;

        /**
         * If the specified column is of type JSON, jsonFieldType contains the type of the field
         * indicated by jsonPath.
         *
         * @param jsonFieldType the value to set
         * @return this builder
         */
        public Builder jsonFieldType(String jsonFieldType) {
            this.jsonFieldType = jsonFieldType;
            this.__explicitlySet__.add("jsonFieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndexKey build() {
            IndexKey model = new IndexKey(this.columnName, this.jsonPath, this.jsonFieldType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndexKey model) {
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("jsonPath")) {
                this.jsonPath(model.getJsonPath());
            }
            if (model.wasPropertyExplicitlySet("jsonFieldType")) {
                this.jsonFieldType(model.getJsonFieldType());
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

    /** The name of a column to be included as an index key. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of a column to be included as an index key.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * If the specified column is of type JSON, jsonPath contains a dotted path indicating the field
     * within the JSON object that will be the index key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPath")
    private final String jsonPath;

    /**
     * If the specified column is of type JSON, jsonPath contains a dotted path indicating the field
     * within the JSON object that will be the index key.
     *
     * @return the value
     */
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * If the specified column is of type JSON, jsonFieldType contains the type of the field
     * indicated by jsonPath.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonFieldType")
    private final String jsonFieldType;

    /**
     * If the specified column is of type JSON, jsonFieldType contains the type of the field
     * indicated by jsonPath.
     *
     * @return the value
     */
    public String getJsonFieldType() {
        return jsonFieldType;
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
        sb.append("IndexKey(");
        sb.append("super=").append(super.toString());
        sb.append("columnName=").append(String.valueOf(this.columnName));
        sb.append(", jsonPath=").append(String.valueOf(this.jsonPath));
        sb.append(", jsonFieldType=").append(String.valueOf(this.jsonFieldType));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
