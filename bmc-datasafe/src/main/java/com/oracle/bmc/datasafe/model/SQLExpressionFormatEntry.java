/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The SQL Expression masking format uses a SQL expression to generate values that are used to
 * replace the original data values. SQL expressions with dbms_lob and other user-defined functions
 * can be used to mask columns of Large Object data type (LOB). To learn more, check SQL Expression
 * in the Data Safe documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SQLExpressionFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SQLExpressionFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The SQL expression to be used to generate the masked values. It can consist of one or
         * more values, operators, and SQL functions that evaluate to a value. It can also contain
         * substitution columns from the same table. Specify the substitution columns within percent
         * (%) symbols.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlExpression")
        private String sqlExpression;

        /**
         * The SQL expression to be used to generate the masked values. It can consist of one or
         * more values, operators, and SQL functions that evaluate to a value. It can also contain
         * substitution columns from the same table. Specify the substitution columns within percent
         * (%) symbols.
         *
         * @param sqlExpression the value to set
         * @return this builder
         */
        public Builder sqlExpression(String sqlExpression) {
            this.sqlExpression = sqlExpression;
            this.__explicitlySet__.add("sqlExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SQLExpressionFormatEntry build() {
            SQLExpressionFormatEntry model =
                    new SQLExpressionFormatEntry(this.description, this.sqlExpression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SQLExpressionFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sqlExpression")) {
                this.sqlExpression(model.getSqlExpression());
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

    @Deprecated
    public SQLExpressionFormatEntry(String description, String sqlExpression) {
        super(description);
        this.sqlExpression = sqlExpression;
    }

    /**
     * The SQL expression to be used to generate the masked values. It can consist of one or more
     * values, operators, and SQL functions that evaluate to a value. It can also contain
     * substitution columns from the same table. Specify the substitution columns within percent (%)
     * symbols.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlExpression")
    private final String sqlExpression;

    /**
     * The SQL expression to be used to generate the masked values. It can consist of one or more
     * values, operators, and SQL functions that evaluate to a value. It can also contain
     * substitution columns from the same table. Specify the substitution columns within percent (%)
     * symbols.
     *
     * @return the value
     */
    public String getSqlExpression() {
        return sqlExpression;
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
        sb.append("SQLExpressionFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sqlExpression=").append(String.valueOf(this.sqlExpression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SQLExpressionFormatEntry)) {
            return false;
        }

        SQLExpressionFormatEntry other = (SQLExpressionFormatEntry) o;
        return java.util.Objects.equals(this.sqlExpression, other.sqlExpression)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sqlExpression == null ? 43 : this.sqlExpression.hashCode());
        return result;
    }
}
