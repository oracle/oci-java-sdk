/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSourcesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListSourcesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only sources associated with entities of the specified type. The match is
     * case-insensitive.
     */
    private String entityType;

    /**
     * A filter to return only sources associated with entities of the specified type. The match is
     * case-insensitive.
     */
    public String getEntityType() {
        return entityType;
    }
    /**
     * The source display text used for filtering. Only sources with the specified name or
     * description will be returned.
     */
    private String sourceDisplayText;

    /**
     * The source display text used for filtering. Only sources with the specified name or
     * description will be returned.
     */
    public String getSourceDisplayText() {
        return sourceDisplayText;
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
    /**
     * An auto-associate flag used for filtering. Only sources which are marked for automatic
     * association will be returned.
     */
    private Boolean isAutoAssociated;

    /**
     * An auto-associate flag used for filtering. Only sources which are marked for automatic
     * association will be returned.
     */
    public Boolean getIsAutoAssociated() {
        return isAutoAssociated;
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
    /** The attribute used to sort the returned sources */
    private SortBy sortBy;

    /** The attribute used to sort the returned sources */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("name"),
        TimeUpdated("timeUpdated"),
        AssociationCount("associationCount"),
        SourceType("sourceType"),
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

    /** The attribute used to sort the returned sources */
    public SortBy getSortBy() {
        return sortBy;
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
    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    private String name;

    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    public String getName() {
        return name;
    }
    /** A comma-separated list of categories used for filtering */
    private String categories;

    /** A comma-separated list of categories used for filtering */
    public String getCategories() {
        return categories;
    }
    /**
     * A flag specifying whether or not to return all source information, or a subset of the
     * information about each source. A value of true will return only the source unique identifier
     * and the source name. A value of false will return all source information (such as author,
     * updated date, system flag, etc.)
     */
    private Boolean isSimplified;

    /**
     * A flag specifying whether or not to return all source information, or a subset of the
     * information about each source. A value of true will return only the source unique identifier
     * and the source name. A value of false will return all source information (such as author,
     * updated date, system flag, etc.)
     */
    public Boolean getIsSimplified() {
        return isSimplified;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSourcesRequest, java.lang.Void> {
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

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only sources associated with entities of the specified type. The match
         * is case-insensitive.
         */
        private String entityType = null;

        /**
         * A filter to return only sources associated with entities of the specified type. The match
         * is case-insensitive.
         *
         * @param entityType the value to set
         * @return this builder instance
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * The source display text used for filtering. Only sources with the specified name or
         * description will be returned.
         */
        private String sourceDisplayText = null;

        /**
         * The source display text used for filtering. Only sources with the specified name or
         * description will be returned.
         *
         * @param sourceDisplayText the value to set
         * @return this builder instance
         */
        public Builder sourceDisplayText(String sourceDisplayText) {
            this.sourceDisplayText = sourceDisplayText;
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

        /**
         * An auto-associate flag used for filtering. Only sources which are marked for automatic
         * association will be returned.
         */
        private Boolean isAutoAssociated = null;

        /**
         * An auto-associate flag used for filtering. Only sources which are marked for automatic
         * association will be returned.
         *
         * @param isAutoAssociated the value to set
         * @return this builder instance
         */
        public Builder isAutoAssociated(Boolean isAutoAssociated) {
            this.isAutoAssociated = isAutoAssociated;
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

        /** The attribute used to sort the returned sources */
        private SortBy sortBy = null;

        /**
         * The attribute used to sort the returned sources
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         */
        private String name = null;

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
         * A flag specifying whether or not to return all source information, or a subset of the
         * information about each source. A value of true will return only the source unique
         * identifier and the source name. A value of false will return all source information (such
         * as author, updated date, system flag, etc.)
         */
        private Boolean isSimplified = null;

        /**
         * A flag specifying whether or not to return all source information, or a subset of the
         * information about each source. A value of true will return only the source unique
         * identifier and the source name. A value of false will return all source information (such
         * as author, updated date, system flag, etc.)
         *
         * @param isSimplified the value to set
         * @return this builder instance
         */
        public Builder isSimplified(Boolean isSimplified) {
            this.isSimplified = isSimplified;
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
        public Builder copy(ListSourcesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            entityType(o.getEntityType());
            sourceDisplayText(o.getSourceDisplayText());
            isSystem(o.getIsSystem());
            isAutoAssociated(o.getIsAutoAssociated());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            name(o.getName());
            categories(o.getCategories());
            isSimplified(o.getIsSimplified());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSourcesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSourcesRequest
         */
        public ListSourcesRequest build() {
            ListSourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSourcesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSourcesRequest
         */
        public ListSourcesRequest buildWithoutInvocationCallback() {
            ListSourcesRequest request = new ListSourcesRequest();
            request.namespaceName = namespaceName;
            request.compartmentId = compartmentId;
            request.entityType = entityType;
            request.sourceDisplayText = sourceDisplayText;
            request.isSystem = isSystem;
            request.isAutoAssociated = isAutoAssociated;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.name = name;
            request.categories = categories;
            request.isSimplified = isSimplified;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSourcesRequest(namespaceName, compartmentId, entityType, sourceDisplayText,
            // isSystem, isAutoAssociated, sortOrder, sortBy, limit, page, name, categories,
            // isSimplified, opcRequestId);
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
                .compartmentId(compartmentId)
                .entityType(entityType)
                .sourceDisplayText(sourceDisplayText)
                .isSystem(isSystem)
                .isAutoAssociated(isAutoAssociated)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .limit(limit)
                .page(page)
                .name(name)
                .categories(categories)
                .isSimplified(isSimplified)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",entityType=").append(String.valueOf(this.entityType));
        sb.append(",sourceDisplayText=").append(String.valueOf(this.sourceDisplayText));
        sb.append(",isSystem=").append(String.valueOf(this.isSystem));
        sb.append(",isAutoAssociated=").append(String.valueOf(this.isAutoAssociated));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",categories=").append(String.valueOf(this.categories));
        sb.append(",isSimplified=").append(String.valueOf(this.isSimplified));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSourcesRequest)) {
            return false;
        }

        ListSourcesRequest other = (ListSourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.sourceDisplayText, other.sourceDisplayText)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.isAutoAssociated, other.isAutoAssociated)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.isSimplified, other.isSimplified)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDisplayText == null ? 43 : this.sourceDisplayText.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoAssociated == null ? 43 : this.isAutoAssociated.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.isSimplified == null ? 43 : this.isSimplified.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
