/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Search SQL response.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlSearchCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlSearchCollection extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlIdentifier",
        "sqlText",
        "timeIntervalStart",
        "timeIntervalEnd",
        "items"
    })
    public SqlSearchCollection(
            String sqlIdentifier,
            String sqlText,
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            java.util.List<SqlSearchSummary> items) {
        super();
        this.sqlIdentifier = sqlIdentifier;
        this.sqlText = sqlText;
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique SQL_ID for a SQL Statement.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         **/
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }
        /**
         * SQL Statement Text
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * SQL Statement Text
         *
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /**
         * The start timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         * @param timeIntervalStart the value to set
         * @return this builder
         **/
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /**
         * The end timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         * @param timeIntervalEnd the value to set
         * @return this builder
         **/
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }
        /**
         * List of Databases executing the sql.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SqlSearchSummary> items;

        /**
         * List of Databases executing the sql.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<SqlSearchSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlSearchCollection build() {
            SqlSearchCollection model =
                    new SqlSearchCollection(
                            this.sqlIdentifier,
                            this.sqlText,
                            this.timeIntervalStart,
                            this.timeIntervalEnd,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlSearchCollection model) {
            if (model.wasPropertyExplicitlySet("sqlIdentifier")) {
                this.sqlIdentifier(model.getSqlIdentifier());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalStart")) {
                this.timeIntervalStart(model.getTimeIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalEnd")) {
                this.timeIntervalEnd(model.getTimeIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     **/
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /**
     * SQL Statement Text
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * SQL Statement Text
     *
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The start timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /**
     * The end timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    /**
     * List of Databases executing the sql.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SqlSearchSummary> items;

    /**
     * List of Databases executing the sql.
     * @return the value
     **/
    public java.util.List<SqlSearchSummary> getItems() {
        return items;
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
        sb.append("SqlSearchCollection(");
        sb.append("super=").append(super.toString());
        sb.append("sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlSearchCollection)) {
            return false;
        }

        SqlSearchCollection other = (SqlSearchCollection) o;
        return java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
