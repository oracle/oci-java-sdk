/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the details for the Script SQL statements to execute on the database connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteSqlInputScriptSqlRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlInputScriptSqlRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"properties", "sqlRequests"})
    public ExecuteSqlInputScriptSqlRequestDetails(
            Object properties, java.util.List<ExecuteSqlInputDetails> sqlRequests) {
        super();
        this.properties = properties;
        this.sqlRequests = sqlRequests;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Client properties returned as-is in the response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private Object properties;

        /**
         * Client properties returned as-is in the response
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(Object properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * The SQL statements to execute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlRequests")
        private java.util.List<ExecuteSqlInputDetails> sqlRequests;

        /**
         * The SQL statements to execute.
         * @param sqlRequests the value to set
         * @return this builder
         **/
        public Builder sqlRequests(java.util.List<ExecuteSqlInputDetails> sqlRequests) {
            this.sqlRequests = sqlRequests;
            this.__explicitlySet__.add("sqlRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlInputScriptSqlRequestDetails build() {
            ExecuteSqlInputScriptSqlRequestDetails model =
                    new ExecuteSqlInputScriptSqlRequestDetails(this.properties, this.sqlRequests);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlInputScriptSqlRequestDetails model) {
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("sqlRequests")) {
                this.sqlRequests(model.getSqlRequests());
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
     * Client properties returned as-is in the response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final Object properties;

    /**
     * Client properties returned as-is in the response
     * @return the value
     **/
    public Object getProperties() {
        return properties;
    }

    /**
     * The SQL statements to execute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlRequests")
    private final java.util.List<ExecuteSqlInputDetails> sqlRequests;

    /**
     * The SQL statements to execute.
     * @return the value
     **/
    public java.util.List<ExecuteSqlInputDetails> getSqlRequests() {
        return sqlRequests;
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
        sb.append("ExecuteSqlInputScriptSqlRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("properties=").append(String.valueOf(this.properties));
        sb.append(", sqlRequests=").append(String.valueOf(this.sqlRequests));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlInputScriptSqlRequestDetails)) {
            return false;
        }

        ExecuteSqlInputScriptSqlRequestDetails other = (ExecuteSqlInputScriptSqlRequestDetails) o;
        return java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.sqlRequests, other.sqlRequests)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.sqlRequests == null ? 43 : this.sqlRequests.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
