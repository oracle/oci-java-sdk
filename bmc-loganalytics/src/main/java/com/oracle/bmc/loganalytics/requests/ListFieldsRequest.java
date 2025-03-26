/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListFieldsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFieldsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListFieldsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * A flag indicating how to handle filtering when multiple filter criteria are specified.
     * A value of true will always result in the most expansive list of items being returned.
     * For example, if two field lists are supplies as filter criteria, a value of true will
     * result in any item matching a field in either list being returned, while a value of
     * false will result in a list of items which only have fields contained in both input lists.
     *
     */
    private Boolean isMatchAll;

    /**
     * A flag indicating how to handle filtering when multiple filter criteria are specified.
     * A value of true will always result in the most expansive list of items being returned.
     * For example, if two field lists are supplies as filter criteria, a value of true will
     * result in any item matching a field in either list being returned, while a value of
     * false will result in a list of items which only have fields contained in both input lists.
     *
     */
    public Boolean getIsMatchAll() {
        return isMatchAll;
    }
    /**
     * A list of source IDs used for filtering.  Only fields used by the specified
     * sources will be returned.
     *
     */
    private String sourceIds;

    /**
     * A list of source IDs used for filtering.  Only fields used by the specified
     * sources will be returned.
     *
     */
    public String getSourceIds() {
        return sourceIds;
    }
    /**
     * A list of source names used for filtering.  Only fields used by the specified
     * sources will be returned.
     *
     */
    private String sourceNames;

    /**
     * A list of source names used for filtering.  Only fields used by the specified
     * sources will be returned.
     *
     */
    public String getSourceNames() {
        return sourceNames;
    }
    /**
     * The parser type used for filtering.  Only items with, or associated with, parsers
     * of the specified type will be returned.
     *
     */
    private ParserType parserType;

    /**
     * The parser type used for filtering.  Only items with, or associated with, parsers
     * of the specified type will be returned.
     *
     **/
    public enum ParserType {
        All("ALL"),
        Regex("REGEX"),
        Xml("XML"),
        Json("JSON"),
        Odl("ODL"),
        Delimited("DELIMITED"),
        ;

        private final String value;
        private static java.util.Map<String, ParserType> map;

        static {
            map = new java.util.HashMap<>();
            for (ParserType v : ParserType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ParserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ParserType: " + key);
        }
    };

    /**
     * The parser type used for filtering.  Only items with, or associated with, parsers
     * of the specified type will be returned.
     *
     */
    public ParserType getParserType() {
        return parserType;
    }
    /**
     * A list of parser names used for filtering.  Only fields used by the specified
     * parsers will be returned.
     *
     */
    private String parserIds;

    /**
     * A list of parser names used for filtering.  Only fields used by the specified
     * parsers will be returned.
     *
     */
    public String getParserIds() {
        return parserIds;
    }
    /**
     * A list of parser names used for filtering.  Only fields used by the specified
     * parsers will be returned.
     *
     */
    private String parserNames;

    /**
     * A list of parser names used for filtering.  Only fields used by the specified
     * parsers will be returned.
     *
     */
    public String getParserNames() {
        return parserNames;
    }
    /**
     * isIncludeParser
     */
    private Boolean isIncludeParser;

    /**
     * isIncludeParser
     */
    public Boolean getIsIncludeParser() {
        return isIncludeParser;
    }
    /**
     * filter
     */
    private String filter;

    /**
     * filter
     */
    public String getFilter() {
        return filter;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The attribute used to sort the returned fields
     */
    private SortBy sortBy;

    /**
     * The attribute used to sort the returned fields
     **/
    public enum SortBy {
        Name("name"),
        DataType("dataType"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The attribute used to sort the returned fields
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFieldsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * A flag indicating how to handle filtering when multiple filter criteria are specified.
         * A value of true will always result in the most expansive list of items being returned.
         * For example, if two field lists are supplies as filter criteria, a value of true will
         * result in any item matching a field in either list being returned, while a value of
         * false will result in a list of items which only have fields contained in both input lists.
         *
         */
        private Boolean isMatchAll = null;

        /**
         * A flag indicating how to handle filtering when multiple filter criteria are specified.
         * A value of true will always result in the most expansive list of items being returned.
         * For example, if two field lists are supplies as filter criteria, a value of true will
         * result in any item matching a field in either list being returned, while a value of
         * false will result in a list of items which only have fields contained in both input lists.
         *
         * @param isMatchAll the value to set
         * @return this builder instance
         */
        public Builder isMatchAll(Boolean isMatchAll) {
            this.isMatchAll = isMatchAll;
            return this;
        }

        /**
         * A list of source IDs used for filtering.  Only fields used by the specified
         * sources will be returned.
         *
         */
        private String sourceIds = null;

        /**
         * A list of source IDs used for filtering.  Only fields used by the specified
         * sources will be returned.
         *
         * @param sourceIds the value to set
         * @return this builder instance
         */
        public Builder sourceIds(String sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }

        /**
         * A list of source names used for filtering.  Only fields used by the specified
         * sources will be returned.
         *
         */
        private String sourceNames = null;

        /**
         * A list of source names used for filtering.  Only fields used by the specified
         * sources will be returned.
         *
         * @param sourceNames the value to set
         * @return this builder instance
         */
        public Builder sourceNames(String sourceNames) {
            this.sourceNames = sourceNames;
            return this;
        }

        /**
         * The parser type used for filtering.  Only items with, or associated with, parsers
         * of the specified type will be returned.
         *
         */
        private ParserType parserType = null;

        /**
         * The parser type used for filtering.  Only items with, or associated with, parsers
         * of the specified type will be returned.
         *
         * @param parserType the value to set
         * @return this builder instance
         */
        public Builder parserType(ParserType parserType) {
            this.parserType = parserType;
            return this;
        }

        /**
         * A list of parser names used for filtering.  Only fields used by the specified
         * parsers will be returned.
         *
         */
        private String parserIds = null;

        /**
         * A list of parser names used for filtering.  Only fields used by the specified
         * parsers will be returned.
         *
         * @param parserIds the value to set
         * @return this builder instance
         */
        public Builder parserIds(String parserIds) {
            this.parserIds = parserIds;
            return this;
        }

        /**
         * A list of parser names used for filtering.  Only fields used by the specified
         * parsers will be returned.
         *
         */
        private String parserNames = null;

        /**
         * A list of parser names used for filtering.  Only fields used by the specified
         * parsers will be returned.
         *
         * @param parserNames the value to set
         * @return this builder instance
         */
        public Builder parserNames(String parserNames) {
            this.parserNames = parserNames;
            return this;
        }

        /**
         * isIncludeParser
         */
        private Boolean isIncludeParser = null;

        /**
         * isIncludeParser
         * @param isIncludeParser the value to set
         * @return this builder instance
         */
        public Builder isIncludeParser(Boolean isIncludeParser) {
            this.isIncludeParser = isIncludeParser;
            return this;
        }

        /**
         * filter
         */
        private String filter = null;

        /**
         * filter
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The attribute used to sort the returned fields
         */
        private SortBy sortBy = null;

        /**
         * The attribute used to sort the returned fields
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListFieldsRequest o) {
            namespaceName(o.getNamespaceName());
            isMatchAll(o.getIsMatchAll());
            sourceIds(o.getSourceIds());
            sourceNames(o.getSourceNames());
            parserType(o.getParserType());
            parserIds(o.getParserIds());
            parserNames(o.getParserNames());
            isIncludeParser(o.getIsIncludeParser());
            filter(o.getFilter());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFieldsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFieldsRequest
         */
        public ListFieldsRequest build() {
            ListFieldsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFieldsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFieldsRequest
         */
        public ListFieldsRequest buildWithoutInvocationCallback() {
            ListFieldsRequest request = new ListFieldsRequest();
            request.namespaceName = namespaceName;
            request.isMatchAll = isMatchAll;
            request.sourceIds = sourceIds;
            request.sourceNames = sourceNames;
            request.parserType = parserType;
            request.parserIds = parserIds;
            request.parserNames = parserNames;
            request.isIncludeParser = isIncludeParser;
            request.filter = filter;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFieldsRequest(namespaceName, isMatchAll, sourceIds, sourceNames, parserType, parserIds, parserNames, isIncludeParser, filter, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .isMatchAll(isMatchAll)
                .sourceIds(sourceIds)
                .sourceNames(sourceNames)
                .parserType(parserType)
                .parserIds(parserIds)
                .parserNames(parserNames)
                .isIncludeParser(isIncludeParser)
                .filter(filter)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",isMatchAll=").append(String.valueOf(this.isMatchAll));
        sb.append(",sourceIds=").append(String.valueOf(this.sourceIds));
        sb.append(",sourceNames=").append(String.valueOf(this.sourceNames));
        sb.append(",parserType=").append(String.valueOf(this.parserType));
        sb.append(",parserIds=").append(String.valueOf(this.parserIds));
        sb.append(",parserNames=").append(String.valueOf(this.parserNames));
        sb.append(",isIncludeParser=").append(String.valueOf(this.isIncludeParser));
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFieldsRequest)) {
            return false;
        }

        ListFieldsRequest other = (ListFieldsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.isMatchAll, other.isMatchAll)
                && java.util.Objects.equals(this.sourceIds, other.sourceIds)
                && java.util.Objects.equals(this.sourceNames, other.sourceNames)
                && java.util.Objects.equals(this.parserType, other.parserType)
                && java.util.Objects.equals(this.parserIds, other.parserIds)
                && java.util.Objects.equals(this.parserNames, other.parserNames)
                && java.util.Objects.equals(this.isIncludeParser, other.isIncludeParser)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.isMatchAll == null ? 43 : this.isMatchAll.hashCode());
        result = (result * PRIME) + (this.sourceIds == null ? 43 : this.sourceIds.hashCode());
        result = (result * PRIME) + (this.sourceNames == null ? 43 : this.sourceNames.hashCode());
        result = (result * PRIME) + (this.parserType == null ? 43 : this.parserType.hashCode());
        result = (result * PRIME) + (this.parserIds == null ? 43 : this.parserIds.hashCode());
        result = (result * PRIME) + (this.parserNames == null ? 43 : this.parserNames.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeParser == null ? 43 : this.isIncludeParser.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
