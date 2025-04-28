/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a SQL statement in the cursor cache. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CursorCacheStatementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CursorCacheStatementSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sqlId", "schema", "sqlText"})
    public CursorCacheStatementSummary(String sqlId, String schema, String sqlText) {
        super();
        this.sqlId = sqlId;
        this.schema = schema;
        this.sqlText = sqlText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The SQL statement identifier. Identifies a SQL statement in the cursor cache. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
        private String sqlId;

        /**
         * The SQL statement identifier. Identifies a SQL statement in the cursor cache.
         *
         * @param sqlId the value to set
         * @return this builder
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            this.__explicitlySet__.add("sqlId");
            return this;
        }
        /** The name of the parsing schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * The name of the parsing schema.
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /** The first thousand characters of the SQL text. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The first thousand characters of the SQL text.
         *
         * @param sqlText the value to set
         * @return this builder
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CursorCacheStatementSummary build() {
            CursorCacheStatementSummary model =
                    new CursorCacheStatementSummary(this.sqlId, this.schema, this.sqlText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CursorCacheStatementSummary model) {
            if (model.wasPropertyExplicitlySet("sqlId")) {
                this.sqlId(model.getSqlId());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
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

    /** The SQL statement identifier. Identifies a SQL statement in the cursor cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
    private final String sqlId;

    /**
     * The SQL statement identifier. Identifies a SQL statement in the cursor cache.
     *
     * @return the value
     */
    public String getSqlId() {
        return sqlId;
    }

    /** The name of the parsing schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * The name of the parsing schema.
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
    }

    /** The first thousand characters of the SQL text. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The first thousand characters of the SQL text.
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
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
        sb.append("CursorCacheStatementSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sqlId=").append(String.valueOf(this.sqlId));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CursorCacheStatementSummary)) {
            return false;
        }

        CursorCacheStatementSummary other = (CursorCacheStatementSummary) o;
        return java.util.Objects.equals(this.sqlId, other.sqlId)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sqlId == null ? 43 : this.sqlId.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
