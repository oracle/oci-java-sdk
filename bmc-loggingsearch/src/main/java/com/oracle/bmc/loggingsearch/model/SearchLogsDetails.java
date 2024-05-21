/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Search request object.
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
    builder = SearchLogsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchLogsDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "searchQuery", "isReturnFieldInfo"})
    public SearchLogsDetails(
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String searchQuery,
            Boolean isReturnFieldInfo) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.searchQuery = searchQuery;
        this.isReturnFieldInfo = isReturnFieldInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Start filter log's date and time, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Start filter log's date and time, in the format defined by RFC3339.
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * End filter log's date and time, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * End filter log's date and time, in the format defined by RFC3339.
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Query corresponding to the search operation. This query is parsed and validated before execution and
         * should follow the specification. For more information on the query language specification, see
         * [Logging Query Language Specification](https://docs.cloud.oracle.com/Content/Logging/Reference/query_language_specification.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("searchQuery")
        private String searchQuery;

        /**
         * Query corresponding to the search operation. This query is parsed and validated before execution and
         * should follow the specification. For more information on the query language specification, see
         * [Logging Query Language Specification](https://docs.cloud.oracle.com/Content/Logging/Reference/query_language_specification.htm).
         *
         * @param searchQuery the value to set
         * @return this builder
         **/
        public Builder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            this.__explicitlySet__.add("searchQuery");
            return this;
        }
        /**
         * Whether to return field schema information for the log stream specified in searchQuery.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReturnFieldInfo")
        private Boolean isReturnFieldInfo;

        /**
         * Whether to return field schema information for the log stream specified in searchQuery.
         *
         * @param isReturnFieldInfo the value to set
         * @return this builder
         **/
        public Builder isReturnFieldInfo(Boolean isReturnFieldInfo) {
            this.isReturnFieldInfo = isReturnFieldInfo;
            this.__explicitlySet__.add("isReturnFieldInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchLogsDetails build() {
            SearchLogsDetails model =
                    new SearchLogsDetails(
                            this.timeStart, this.timeEnd, this.searchQuery, this.isReturnFieldInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchLogsDetails model) {
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("searchQuery")) {
                this.searchQuery(model.getSearchQuery());
            }
            if (model.wasPropertyExplicitlySet("isReturnFieldInfo")) {
                this.isReturnFieldInfo(model.getIsReturnFieldInfo());
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
     * Start filter log's date and time, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Start filter log's date and time, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * End filter log's date and time, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * End filter log's date and time, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Query corresponding to the search operation. This query is parsed and validated before execution and
     * should follow the specification. For more information on the query language specification, see
     * [Logging Query Language Specification](https://docs.cloud.oracle.com/Content/Logging/Reference/query_language_specification.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchQuery")
    private final String searchQuery;

    /**
     * Query corresponding to the search operation. This query is parsed and validated before execution and
     * should follow the specification. For more information on the query language specification, see
     * [Logging Query Language Specification](https://docs.cloud.oracle.com/Content/Logging/Reference/query_language_specification.htm).
     *
     * @return the value
     **/
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Whether to return field schema information for the log stream specified in searchQuery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReturnFieldInfo")
    private final Boolean isReturnFieldInfo;

    /**
     * Whether to return field schema information for the log stream specified in searchQuery.
     *
     * @return the value
     **/
    public Boolean getIsReturnFieldInfo() {
        return isReturnFieldInfo;
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
        sb.append("SearchLogsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", searchQuery=").append(String.valueOf(this.searchQuery));
        sb.append(", isReturnFieldInfo=").append(String.valueOf(this.isReturnFieldInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchLogsDetails)) {
            return false;
        }

        SearchLogsDetails other = (SearchLogsDetails) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.searchQuery, other.searchQuery)
                && java.util.Objects.equals(this.isReturnFieldInfo, other.isReturnFieldInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.searchQuery == null ? 43 : this.searchQuery.hashCode());
        result =
                (result * PRIME)
                        + (this.isReturnFieldInfo == null ? 43 : this.isReturnFieldInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
