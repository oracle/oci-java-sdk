/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Summary of results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchResultSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchResultSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"resultCount", "fieldCount"})
    public SearchResultSummary(Integer resultCount, Integer fieldCount) {
        super();
        this.resultCount = resultCount;
        this.fieldCount = fieldCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total number of search results.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
        private Integer resultCount;

        /**
         * Total number of search results.
         * @param resultCount the value to set
         * @return this builder
         **/
        public Builder resultCount(Integer resultCount) {
            this.resultCount = resultCount;
            this.__explicitlySet__.add("resultCount");
            return this;
        }
        /**
         * Total number of field schema information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
        private Integer fieldCount;

        /**
         * Total number of field schema information.
         * @param fieldCount the value to set
         * @return this builder
         **/
        public Builder fieldCount(Integer fieldCount) {
            this.fieldCount = fieldCount;
            this.__explicitlySet__.add("fieldCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResultSummary build() {
            SearchResultSummary __instance__ = new SearchResultSummary(resultCount, fieldCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultSummary o) {
            Builder copiedBuilder = resultCount(o.getResultCount()).fieldCount(o.getFieldCount());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Total number of search results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
    private final Integer resultCount;

    /**
     * Total number of search results.
     * @return the value
     **/
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * Total number of field schema information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
    private final Integer fieldCount;

    /**
     * Total number of field schema information.
     * @return the value
     **/
    public Integer getFieldCount() {
        return fieldCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchResultSummary(");
        sb.append("resultCount=").append(String.valueOf(this.resultCount));
        sb.append(", fieldCount=").append(String.valueOf(this.fieldCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultCount == null ? 43 : this.resultCount.hashCode());
        result = (result * PRIME) + (this.fieldCount == null ? 43 : this.fieldCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
