/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Summary of results. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchResultSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchResultSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resultCount", "fieldCount"})
    public SearchResultSummary(Integer resultCount, Integer fieldCount) {
        super();
        this.resultCount = resultCount;
        this.fieldCount = fieldCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of search results. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
        private Integer resultCount;

        /**
         * Total number of search results.
         *
         * @param resultCount the value to set
         * @return this builder
         */
        public Builder resultCount(Integer resultCount) {
            this.resultCount = resultCount;
            this.__explicitlySet__.add("resultCount");
            return this;
        }
        /** Total number of field schema information. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
        private Integer fieldCount;

        /**
         * Total number of field schema information.
         *
         * @param fieldCount the value to set
         * @return this builder
         */
        public Builder fieldCount(Integer fieldCount) {
            this.fieldCount = fieldCount;
            this.__explicitlySet__.add("fieldCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResultSummary build() {
            SearchResultSummary model = new SearchResultSummary(this.resultCount, this.fieldCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultSummary model) {
            if (model.wasPropertyExplicitlySet("resultCount")) {
                this.resultCount(model.getResultCount());
            }
            if (model.wasPropertyExplicitlySet("fieldCount")) {
                this.fieldCount(model.getFieldCount());
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

    /** Total number of search results. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
    private final Integer resultCount;

    /**
     * Total number of search results.
     *
     * @return the value
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /** Total number of field schema information. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
    private final Integer fieldCount;

    /**
     * Total number of field schema information.
     *
     * @return the value
     */
    public Integer getFieldCount() {
        return fieldCount;
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
        sb.append("SearchResultSummary(");
        sb.append("super=").append(super.toString());
        sb.append("resultCount=").append(String.valueOf(this.resultCount));
        sb.append(", fieldCount=").append(String.valueOf(this.fieldCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResultSummary)) {
            return false;
        }

        SearchResultSummary other = (SearchResultSummary) o;
        return java.util.Objects.equals(this.resultCount, other.resultCount)
                && java.util.Objects.equals(this.fieldCount, other.fieldCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultCount == null ? 43 : this.resultCount.hashCode());
        result = (result * PRIME) + (this.fieldCount == null ? 43 : this.fieldCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
