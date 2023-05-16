/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the datatype, unit and related metadata of an individual row element of a query result
 * row that is returned. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueryResultRowTypeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryResultRowTypeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataType",
        "unit",
        "displayName",
        "expression",
        "queryResultRowTypeSummaries"
    })
    public QueryResultRowTypeSummary(
            String dataType,
            String unit,
            String displayName,
            String expression,
            java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries) {
        super();
        this.dataType = dataType;
        this.unit = unit;
        this.displayName = displayName;
        this.expression = expression;
        this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Datatype of the query result row element. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Datatype of the query result row element.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Granular unit in which the query result row element's data is represented. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * Granular unit in which the query result row element's data is represented.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * Alias name if an alias is used for the query result row element or an assigned display
         * name from the query language in some default cases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Alias name if an alias is used for the query result row element or an assigned display
         * name from the query language in some default cases.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Actual show expression in the user typed query that produced this column. */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * Actual show expression in the user typed query that produced this column.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /** A query result row type summary object that represents a nested table structure. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
        private java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

        /**
         * A query result row type summary object that represents a nested table structure.
         *
         * @param queryResultRowTypeSummaries the value to set
         * @return this builder
         */
        public Builder queryResultRowTypeSummaries(
                java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries) {
            this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
            this.__explicitlySet__.add("queryResultRowTypeSummaries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultRowTypeSummary build() {
            QueryResultRowTypeSummary model =
                    new QueryResultRowTypeSummary(
                            this.dataType,
                            this.unit,
                            this.displayName,
                            this.expression,
                            this.queryResultRowTypeSummaries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultRowTypeSummary model) {
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("queryResultRowTypeSummaries")) {
                this.queryResultRowTypeSummaries(model.getQueryResultRowTypeSummaries());
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

    /** Datatype of the query result row element. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Datatype of the query result row element.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** Granular unit in which the query result row element's data is represented. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * Granular unit in which the query result row element's data is represented.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Alias name if an alias is used for the query result row element or an assigned display name
     * from the query language in some default cases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Alias name if an alias is used for the query result row element or an assigned display name
     * from the query language in some default cases.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Actual show expression in the user typed query that produced this column. */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * Actual show expression in the user typed query that produced this column.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
    }

    /** A query result row type summary object that represents a nested table structure. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
    private final java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

    /**
     * A query result row type summary object that represents a nested table structure.
     *
     * @return the value
     */
    public java.util.List<QueryResultRowTypeSummary> getQueryResultRowTypeSummaries() {
        return queryResultRowTypeSummaries;
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
        sb.append("QueryResultRowTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dataType=").append(String.valueOf(this.dataType));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", queryResultRowTypeSummaries=")
                .append(String.valueOf(this.queryResultRowTypeSummaries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultRowTypeSummary)) {
            return false;
        }

        QueryResultRowTypeSummary other = (QueryResultRowTypeSummary) o;
        return java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(
                        this.queryResultRowTypeSummaries, other.queryResultRowTypeSummaries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultRowTypeSummaries == null
                                ? 43
                                : this.queryResultRowTypeSummaries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
