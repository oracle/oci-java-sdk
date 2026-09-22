/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/ListFunctionsRuntimeVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListFunctionsRuntimeVersionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public class ListFunctionsRuntimeVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique FunctionsRuntime identifier */
    private String functionsRuntimeId;

    /** unique FunctionsRuntime identifier */
    public String getFunctionsRuntimeId() {
        return functionsRuntimeId;
    }
    /** A filter to return only resources that match the entire FunctionsRuntime name given. */
    private String functionsRuntimeName;

    /** A filter to return only resources that match the entire FunctionsRuntime name given. */
    public String getFunctionsRuntimeName() {
        return functionsRuntimeName;
    }
    /** unique FunctionsRuntimeVersion identifier */
    private String functionsRuntimeVersionId;

    /** unique FunctionsRuntimeVersion identifier */
    public String getFunctionsRuntimeVersionId() {
        return functionsRuntimeVersionId;
    }
    /**
     * A filter to return only resources that match the entire FunctionsRuntimeVersion name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire FunctionsRuntimeVersion name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only resources that match the entire osVersion name given. */
    private String osVersion;

    /** A filter to return only resources that match the entire osVersion name given. */
    public String getOsVersion() {
        return osVersion;
    }
    /** A filter to return only resources that match the entire languageVersion name given. */
    private String languageVersion;

    /** A filter to return only resources that match the entire languageVersion name given. */
    public String getLanguageVersion() {
        return languageVersion;
    }
    /** Matches the current version associated with a FunctionsRuntime. */
    private Boolean isCurrentVersion;

    /** Matches the current version associated with a FunctionsRuntime. */
    public Boolean getIsCurrentVersion() {
        return isCurrentVersion;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.functions.model.FunctionsRuntimeVersion.LifecycleState lifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.functions.model.FunctionsRuntimeVersion.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for name is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for name is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        Name("name"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for name is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     *
     * <p>Default: 10
     */
    private Integer limit;

    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     *
     * <p>Default: 10
     */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token for a list query returned by a previous operation */
    private String page;

    /** The pagination token for a list query returned by a previous operation */
    public String getPage() {
        return page;
    }
    /**
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
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

    /**
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFunctionsRuntimeVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique FunctionsRuntime identifier */
        private String functionsRuntimeId = null;

        /**
         * unique FunctionsRuntime identifier
         *
         * @param functionsRuntimeId the value to set
         * @return this builder instance
         */
        public Builder functionsRuntimeId(String functionsRuntimeId) {
            this.functionsRuntimeId = functionsRuntimeId;
            return this;
        }

        /** A filter to return only resources that match the entire FunctionsRuntime name given. */
        private String functionsRuntimeName = null;

        /**
         * A filter to return only resources that match the entire FunctionsRuntime name given.
         *
         * @param functionsRuntimeName the value to set
         * @return this builder instance
         */
        public Builder functionsRuntimeName(String functionsRuntimeName) {
            this.functionsRuntimeName = functionsRuntimeName;
            return this;
        }

        /** unique FunctionsRuntimeVersion identifier */
        private String functionsRuntimeVersionId = null;

        /**
         * unique FunctionsRuntimeVersion identifier
         *
         * @param functionsRuntimeVersionId the value to set
         * @return this builder instance
         */
        public Builder functionsRuntimeVersionId(String functionsRuntimeVersionId) {
            this.functionsRuntimeVersionId = functionsRuntimeVersionId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire FunctionsRuntimeVersion name
         * given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire FunctionsRuntimeVersion name
         * given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return only resources that match the entire osVersion name given. */
        private String osVersion = null;

        /**
         * A filter to return only resources that match the entire osVersion name given.
         *
         * @param osVersion the value to set
         * @return this builder instance
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /** A filter to return only resources that match the entire languageVersion name given. */
        private String languageVersion = null;

        /**
         * A filter to return only resources that match the entire languageVersion name given.
         *
         * @param languageVersion the value to set
         * @return this builder instance
         */
        public Builder languageVersion(String languageVersion) {
            this.languageVersion = languageVersion;
            return this;
        }

        /** Matches the current version associated with a FunctionsRuntime. */
        private Boolean isCurrentVersion = null;

        /**
         * Matches the current version associated with a FunctionsRuntime.
         *
         * @param isCurrentVersion the value to set
         * @return this builder instance
         */
        public Builder isCurrentVersion(Boolean isCurrentVersion) {
            this.isCurrentVersion = isCurrentVersion;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.functions.model.FunctionsRuntimeVersion.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.functions.model.FunctionsRuntimeVersion.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for name is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for name is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         *
         * <p>Default: 10
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         *
         * <p>Default: 10
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token for a list query returned by a previous operation */
        private String page = null;

        /**
         * The pagination token for a list query returned by a previous operation
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Specifies sort order.
         *
         * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order.
         *
         * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(ListFunctionsRuntimeVersionsRequest o) {
            functionsRuntimeId(o.getFunctionsRuntimeId());
            functionsRuntimeName(o.getFunctionsRuntimeName());
            functionsRuntimeVersionId(o.getFunctionsRuntimeVersionId());
            displayName(o.getDisplayName());
            osVersion(o.getOsVersion());
            languageVersion(o.getLanguageVersion());
            isCurrentVersion(o.getIsCurrentVersion());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFunctionsRuntimeVersionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFunctionsRuntimeVersionsRequest
         */
        public ListFunctionsRuntimeVersionsRequest build() {
            ListFunctionsRuntimeVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFunctionsRuntimeVersionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFunctionsRuntimeVersionsRequest
         */
        public ListFunctionsRuntimeVersionsRequest buildWithoutInvocationCallback() {
            ListFunctionsRuntimeVersionsRequest request = new ListFunctionsRuntimeVersionsRequest();
            request.functionsRuntimeId = functionsRuntimeId;
            request.functionsRuntimeName = functionsRuntimeName;
            request.functionsRuntimeVersionId = functionsRuntimeVersionId;
            request.displayName = displayName;
            request.osVersion = osVersion;
            request.languageVersion = languageVersion;
            request.isCurrentVersion = isCurrentVersion;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFunctionsRuntimeVersionsRequest(functionsRuntimeId, functionsRuntimeName,
            // functionsRuntimeVersionId, displayName, osVersion, languageVersion, isCurrentVersion,
            // lifecycleState, sortBy, limit, page, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .functionsRuntimeId(functionsRuntimeId)
                .functionsRuntimeName(functionsRuntimeName)
                .functionsRuntimeVersionId(functionsRuntimeVersionId)
                .displayName(displayName)
                .osVersion(osVersion)
                .languageVersion(languageVersion)
                .isCurrentVersion(isCurrentVersion)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
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
        sb.append(",functionsRuntimeId=").append(String.valueOf(this.functionsRuntimeId));
        sb.append(",functionsRuntimeName=").append(String.valueOf(this.functionsRuntimeName));
        sb.append(",functionsRuntimeVersionId=")
                .append(String.valueOf(this.functionsRuntimeVersionId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",osVersion=").append(String.valueOf(this.osVersion));
        sb.append(",languageVersion=").append(String.valueOf(this.languageVersion));
        sb.append(",isCurrentVersion=").append(String.valueOf(this.isCurrentVersion));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFunctionsRuntimeVersionsRequest)) {
            return false;
        }

        ListFunctionsRuntimeVersionsRequest other = (ListFunctionsRuntimeVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.functionsRuntimeId, other.functionsRuntimeId)
                && java.util.Objects.equals(this.functionsRuntimeName, other.functionsRuntimeName)
                && java.util.Objects.equals(
                        this.functionsRuntimeVersionId, other.functionsRuntimeVersionId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.languageVersion, other.languageVersion)
                && java.util.Objects.equals(this.isCurrentVersion, other.isCurrentVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.functionsRuntimeId == null
                                ? 43
                                : this.functionsRuntimeId.hashCode());
        result =
                (result * PRIME)
                        + (this.functionsRuntimeName == null
                                ? 43
                                : this.functionsRuntimeName.hashCode());
        result =
                (result * PRIME)
                        + (this.functionsRuntimeVersionId == null
                                ? 43
                                : this.functionsRuntimeVersionId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.languageVersion == null ? 43 : this.languageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isCurrentVersion == null ? 43 : this.isCurrentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
