/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the details for the Batch SQL statements to execute on the database connection.
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
    builder = ExecuteSqlInputBatchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlInputBatchDetails extends ExecuteSqlInputDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DML statements to execute in jdbc batch mode
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchStatementTexts")
        private java.util.List<String> batchStatementTexts;

        /**
         * DML statements to execute in jdbc batch mode
         * @param batchStatementTexts the value to set
         * @return this builder
         **/
        public Builder batchStatementTexts(java.util.List<String> batchStatementTexts) {
            this.batchStatementTexts = batchStatementTexts;
            this.__explicitlySet__.add("batchStatementTexts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
        private ExecuteSqlResponseFormat responseFormat;

        public Builder responseFormat(ExecuteSqlResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            this.__explicitlySet__.add("responseFormat");
            return this;
        }
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlInputBatchDetails build() {
            ExecuteSqlInputBatchDetails model =
                    new ExecuteSqlInputBatchDetails(
                            this.batchStatementTexts, this.responseFormat, this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlInputBatchDetails model) {
            if (model.wasPropertyExplicitlySet("batchStatementTexts")) {
                this.batchStatementTexts(model.getBatchStatementTexts());
            }
            if (model.wasPropertyExplicitlySet("responseFormat")) {
                this.responseFormat(model.getResponseFormat());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    @Deprecated
    public ExecuteSqlInputBatchDetails(
            java.util.List<String> batchStatementTexts,
            ExecuteSqlResponseFormat responseFormat,
            Object properties) {
        super();
        this.batchStatementTexts = batchStatementTexts;
        this.responseFormat = responseFormat;
        this.properties = properties;
    }

    /**
     * DML statements to execute in jdbc batch mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchStatementTexts")
    private final java.util.List<String> batchStatementTexts;

    /**
     * DML statements to execute in jdbc batch mode
     * @return the value
     **/
    public java.util.List<String> getBatchStatementTexts() {
        return batchStatementTexts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
    private final ExecuteSqlResponseFormat responseFormat;

    public ExecuteSqlResponseFormat getResponseFormat() {
        return responseFormat;
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
        sb.append("ExecuteSqlInputBatchDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", batchStatementTexts=").append(String.valueOf(this.batchStatementTexts));
        sb.append(", responseFormat=").append(String.valueOf(this.responseFormat));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlInputBatchDetails)) {
            return false;
        }

        ExecuteSqlInputBatchDetails other = (ExecuteSqlInputBatchDetails) o;
        return java.util.Objects.equals(this.batchStatementTexts, other.batchStatementTexts)
                && java.util.Objects.equals(this.responseFormat, other.responseFormat)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchStatementTexts == null
                                ? 43
                                : this.batchStatementTexts.hashCode());
        result =
                (result * PRIME)
                        + (this.responseFormat == null ? 43 : this.responseFormat.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }
}
