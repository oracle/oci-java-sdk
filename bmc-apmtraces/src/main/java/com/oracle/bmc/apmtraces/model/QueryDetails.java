/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Request object containing the query to be run against the trace data. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queryText"})
    public QueryDetails(String queryText) {
        super();
        this.queryText = queryText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Application Performance Monitoring defined query string that filters and retrieves trace
         * data results.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryText")
        private String queryText;

        /**
         * Application Performance Monitoring defined query string that filters and retrieves trace
         * data results.
         *
         * @param queryText the value to set
         * @return this builder
         */
        public Builder queryText(String queryText) {
            this.queryText = queryText;
            this.__explicitlySet__.add("queryText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDetails build() {
            QueryDetails model = new QueryDetails(this.queryText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDetails model) {
            if (model.wasPropertyExplicitlySet("queryText")) {
                this.queryText(model.getQueryText());
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

    /**
     * Application Performance Monitoring defined query string that filters and retrieves trace data
     * results.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryText")
    private final String queryText;

    /**
     * Application Performance Monitoring defined query string that filters and retrieves trace data
     * results.
     *
     * @return the value
     */
    public String getQueryText() {
        return queryText;
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
        sb.append("QueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("queryText=").append(String.valueOf(this.queryText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDetails)) {
            return false;
        }

        QueryDetails other = (QueryDetails) o;
        return java.util.Objects.equals(this.queryText, other.queryText) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.queryText == null ? 43 : this.queryText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
