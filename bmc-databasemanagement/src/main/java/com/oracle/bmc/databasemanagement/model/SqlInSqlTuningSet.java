/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Sql information in the Sql tuning set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlInSqlTuningSet.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlInSqlTuningSet extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlId",
        "sqlText",
        "containerDatabaseId",
        "planHashValue",
        "schema",
        "module",
        "metrics"
    })
    public SqlInSqlTuningSet(
            String sqlId,
            String sqlText,
            Long containerDatabaseId,
            Long planHashValue,
            String schema,
            String module,
            java.util.List<SqlMetrics> metrics) {
        super();
        this.sqlId = sqlId;
        this.sqlText = sqlText;
        this.containerDatabaseId = containerDatabaseId;
        this.planHashValue = planHashValue;
        this.schema = schema;
        this.module = module;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique Sql identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
        private String sqlId;

        /**
         * The unique Sql identifier.
         * @param sqlId the value to set
         * @return this builder
         **/
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            this.__explicitlySet__.add("sqlId");
            return this;
        }
        /**
         * Sql text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * Sql text.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /**
         * The unique container database identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private Long containerDatabaseId;

        /**
         * The unique container database identifier.
         * @param containerDatabaseId the value to set
         * @return this builder
         **/
        public Builder containerDatabaseId(Long containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /**
         * Plan hash value of the Sql statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
        private Long planHashValue;

        /**
         * Plan hash value of the Sql statement.
         * @param planHashValue the value to set
         * @return this builder
         **/
        public Builder planHashValue(Long planHashValue) {
            this.planHashValue = planHashValue;
            this.__explicitlySet__.add("planHashValue");
            return this;
        }
        /**
         * The schema name of the Sql.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * The schema name of the Sql.
         * @param schema the value to set
         * @return this builder
         **/
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * The module of the Sql.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("module")
        private String module;

        /**
         * The module of the Sql.
         * @param module the value to set
         * @return this builder
         **/
        public Builder module(String module) {
            this.module = module;
            this.__explicitlySet__.add("module");
            return this;
        }
        /**
         * A list of the Sqls associated with the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<SqlMetrics> metrics;

        /**
         * A list of the Sqls associated with the Sql tuning set.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<SqlMetrics> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInSqlTuningSet build() {
            SqlInSqlTuningSet model =
                    new SqlInSqlTuningSet(
                            this.sqlId,
                            this.sqlText,
                            this.containerDatabaseId,
                            this.planHashValue,
                            this.schema,
                            this.module,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInSqlTuningSet model) {
            if (model.wasPropertyExplicitlySet("sqlId")) {
                this.sqlId(model.getSqlId());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("planHashValue")) {
                this.planHashValue(model.getPlanHashValue());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("module")) {
                this.module(model.getModule());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            return this;
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
     * The unique Sql identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
    private final String sqlId;

    /**
     * The unique Sql identifier.
     * @return the value
     **/
    public String getSqlId() {
        return sqlId;
    }

    /**
     * Sql text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * Sql text.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The unique container database identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final Long containerDatabaseId;

    /**
     * The unique container database identifier.
     * @return the value
     **/
    public Long getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /**
     * Plan hash value of the Sql statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    private final Long planHashValue;

    /**
     * Plan hash value of the Sql statement.
     * @return the value
     **/
    public Long getPlanHashValue() {
        return planHashValue;
    }

    /**
     * The schema name of the Sql.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * The schema name of the Sql.
     * @return the value
     **/
    public String getSchema() {
        return schema;
    }

    /**
     * The module of the Sql.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("module")
    private final String module;

    /**
     * The module of the Sql.
     * @return the value
     **/
    public String getModule() {
        return module;
    }

    /**
     * A list of the Sqls associated with the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<SqlMetrics> metrics;

    /**
     * A list of the Sqls associated with the Sql tuning set.
     * @return the value
     **/
    public java.util.List<SqlMetrics> getMetrics() {
        return metrics;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlInSqlTuningSet(");
        sb.append("super=").append(super.toString());
        sb.append("sqlId=").append(String.valueOf(this.sqlId));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", planHashValue=").append(String.valueOf(this.planHashValue));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", module=").append(String.valueOf(this.module));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInSqlTuningSet)) {
            return false;
        }

        SqlInSqlTuningSet other = (SqlInSqlTuningSet) o;
        return java.util.Objects.equals(this.sqlId, other.sqlId)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.planHashValue, other.planHashValue)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.module, other.module)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sqlId == null ? 43 : this.sqlId.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.planHashValue == null ? 43 : this.planHashValue.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.module == null ? 43 : this.module.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
