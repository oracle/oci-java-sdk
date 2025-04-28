/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListParsersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListParsersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListParsersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * A flag indicating how to handle filtering when multiple filter criteria are specified. A
     * value of true will always result in the most expansive list of items being returned. For
     * example, if two field lists are supplies as filter criteria, a value of true will result in
     * any item matching a field in either list being returned, while a value of false will result
     * in a list of items which only have fields contained in both input lists.
     */
    private Boolean isMatchAll;

    /**
     * A flag indicating how to handle filtering when multiple filter criteria are specified. A
     * value of true will always result in the most expansive list of items being returned. For
     * example, if two field lists are supplies as filter criteria, a value of true will result in
     * any item matching a field in either list being returned, while a value of false will result
     * in a list of items which only have fields contained in both input lists.
     */
    public Boolean getIsMatchAll() {
        return isMatchAll;
    }
    /**
     * The source type used for filtering. Only parsers associated with a source of the specified
     * type will be returned.
     */
    private SourceType sourceType;

    /**
     * The source type used for filtering. Only parsers associated with a source of the specified
     * type will be returned.
     */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        OsFile("OS_FILE"),
        Syslog("SYSLOG"),
        Odl("ODL"),
        OsWindowsSys("OS_WINDOWS_SYS"),
        ;

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SourceType: " + key);
        }
    };

    /**
     * The source type used for filtering. Only parsers associated with a source of the specified
     * type will be returned.
     */
    public SourceType getSourceType() {
        return sourceType;
    }
    /** The parser name used for filtering. */
    private String parserName;

    /** The parser name used for filtering. */
    public String getParserName() {
        return parserName;
    }
    /**
     * The parser display text used for filtering. Only parsers with the specified name or
     * description will be returned.
     */
    private String parserDisplayText;

    /**
     * The parser display text used for filtering. Only parsers with the specified name or
     * description will be returned.
     */
    public String getParserDisplayText() {
        return parserDisplayText;
    }
    /**
     * The parser type used for filtering. Only items with, or associated with, parsers of the
     * specified type will be returned.
     */
    private ParserType parserType;

    /**
     * The parser type used for filtering. Only items with, or associated with, parsers of the
     * specified type will be returned.
     */
    public enum ParserType implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The parser type used for filtering. Only items with, or associated with, parsers of the
     * specified type will be returned.
     */
    public ParserType getParserType() {
        return parserType;
    }
    /** A comma-separated list of categories used for filtering */
    private String categories;

    /** A comma-separated list of categories used for filtering */
    public String getCategories() {
        return categories;
    }
    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    private IsSystem isSystem;

    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    public enum IsSystem implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Custom("CUSTOM"),
        BuiltIn("BUILT_IN"),
        ;

        private final String value;
        private static java.util.Map<String, IsSystem> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSystem v : IsSystem.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsSystem(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSystem create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsSystem: " + key);
        }
    };

    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    public IsSystem getIsSystem() {
        return isSystem;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The attribute used to sort the returned parsers */
    private SortBy sortBy;

    /** The attribute used to sort the returned parsers */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("name"),
        Type("type"),
        SourcesCount("sourcesCount"),
        TimeUpdated("timeUpdated"),
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

    /** The attribute used to sort the returned parsers */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListParsersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
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
         * A flag indicating how to handle filtering when multiple filter criteria are specified. A
         * value of true will always result in the most expansive list of items being returned. For
         * example, if two field lists are supplies as filter criteria, a value of true will result
         * in any item matching a field in either list being returned, while a value of false will
         * result in a list of items which only have fields contained in both input lists.
         */
        private Boolean isMatchAll = null;

        /**
         * A flag indicating how to handle filtering when multiple filter criteria are specified. A
         * value of true will always result in the most expansive list of items being returned. For
         * example, if two field lists are supplies as filter criteria, a value of true will result
         * in any item matching a field in either list being returned, while a value of false will
         * result in a list of items which only have fields contained in both input lists.
         *
         * @param isMatchAll the value to set
         * @return this builder instance
         */
        public Builder isMatchAll(Boolean isMatchAll) {
            this.isMatchAll = isMatchAll;
            return this;
        }

        /**
         * The source type used for filtering. Only parsers associated with a source of the
         * specified type will be returned.
         */
        private SourceType sourceType = null;

        /**
         * The source type used for filtering. Only parsers associated with a source of the
         * specified type will be returned.
         *
         * @param sourceType the value to set
         * @return this builder instance
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /** The parser name used for filtering. */
        private String parserName = null;

        /**
         * The parser name used for filtering.
         *
         * @param parserName the value to set
         * @return this builder instance
         */
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            return this;
        }

        /**
         * The parser display text used for filtering. Only parsers with the specified name or
         * description will be returned.
         */
        private String parserDisplayText = null;

        /**
         * The parser display text used for filtering. Only parsers with the specified name or
         * description will be returned.
         *
         * @param parserDisplayText the value to set
         * @return this builder instance
         */
        public Builder parserDisplayText(String parserDisplayText) {
            this.parserDisplayText = parserDisplayText;
            return this;
        }

        /**
         * The parser type used for filtering. Only items with, or associated with, parsers of the
         * specified type will be returned.
         */
        private ParserType parserType = null;

        /**
         * The parser type used for filtering. Only items with, or associated with, parsers of the
         * specified type will be returned.
         *
         * @param parserType the value to set
         * @return this builder instance
         */
        public Builder parserType(ParserType parserType) {
            this.parserType = parserType;
            return this;
        }

        /** A comma-separated list of categories used for filtering */
        private String categories = null;

        /**
         * A comma-separated list of categories used for filtering
         *
         * @param categories the value to set
         * @return this builder instance
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * The system value used for filtering. Only items with the specified system value will be
         * returned. Valid values are built in, custom (for user defined items), or all (for all
         * items, regardless of system value).
         */
        private IsSystem isSystem = null;

        /**
         * The system value used for filtering. Only items with the specified system value will be
         * returned. Valid values are built in, custom (for user defined items), or all (for all
         * items, regardless of system value).
         *
         * @param isSystem the value to set
         * @return this builder instance
         */
        public Builder isSystem(IsSystem isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
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

        /** The attribute used to sort the returned parsers */
        private SortBy sortBy = null;

        /**
         * The attribute used to sort the returned parsers
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ListParsersRequest o) {
            namespaceName(o.getNamespaceName());
            isMatchAll(o.getIsMatchAll());
            sourceType(o.getSourceType());
            parserName(o.getParserName());
            parserDisplayText(o.getParserDisplayText());
            parserType(o.getParserType());
            categories(o.getCategories());
            isSystem(o.getIsSystem());
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
         * Build the instance of ListParsersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListParsersRequest
         */
        public ListParsersRequest build() {
            ListParsersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListParsersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListParsersRequest
         */
        public ListParsersRequest buildWithoutInvocationCallback() {
            ListParsersRequest request = new ListParsersRequest();
            request.namespaceName = namespaceName;
            request.isMatchAll = isMatchAll;
            request.sourceType = sourceType;
            request.parserName = parserName;
            request.parserDisplayText = parserDisplayText;
            request.parserType = parserType;
            request.categories = categories;
            request.isSystem = isSystem;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListParsersRequest(namespaceName, isMatchAll, sourceType, parserName,
            // parserDisplayText, parserType, categories, isSystem, limit, page, sortOrder, sortBy,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .isMatchAll(isMatchAll)
                .sourceType(sourceType)
                .parserName(parserName)
                .parserDisplayText(parserDisplayText)
                .parserType(parserType)
                .categories(categories)
                .isSystem(isSystem)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",sourceType=").append(String.valueOf(this.sourceType));
        sb.append(",parserName=").append(String.valueOf(this.parserName));
        sb.append(",parserDisplayText=").append(String.valueOf(this.parserDisplayText));
        sb.append(",parserType=").append(String.valueOf(this.parserType));
        sb.append(",categories=").append(String.valueOf(this.categories));
        sb.append(",isSystem=").append(String.valueOf(this.isSystem));
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
        if (!(o instanceof ListParsersRequest)) {
            return false;
        }

        ListParsersRequest other = (ListParsersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.isMatchAll, other.isMatchAll)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(this.parserDisplayText, other.parserDisplayText)
                && java.util.Objects.equals(this.parserType, other.parserType)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
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
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserDisplayText == null ? 43 : this.parserDisplayText.hashCode());
        result = (result * PRIME) + (this.parserType == null ? 43 : this.parserType.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
