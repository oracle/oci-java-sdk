/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListImportedPackagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListImportedPackagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListImportedPackagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * List only the information for the package with this name. Package names are unique to a
     * publisher and may not change.
     *
     * <p>Example: {@code My Package}
     */
    private String name;

    /**
     * List only the information for the package with this name. Package names are unique to a
     * publisher and may not change.
     *
     * <p>Example: {@code My Package}
     */
    public String getName() {
        return name;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page at which to start retrieving results.
     *
     * <p>You get this value from the {@code opc-next-page} header in a previous list request. To
     * retireve the first page, omit this query parameter.
     *
     * <p>Example: {@code MToxMA==}
     */
    private String page;

    /**
     * The page at which to start retrieving results.
     *
     * <p>You get this value from the {@code opc-next-page} header in a previous list request. To
     * retireve the first page, omit this query parameter.
     *
     * <p>Example: {@code MToxMA==}
     */
    public String getPage() {
        return page;
    }
    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
     */
    private SortOrder sortOrder;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
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
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * TIMECREATED}.
     *
     * <p>The default sort order for {@code TIMECREATED} is descending, and the default sort order
     * for {@code DISPLAYNAME} is ascending.
     */
    private SortBy sortBy;

    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * TIMECREATED}.
     *
     * <p>The default sort order for {@code TIMECREATED} is descending, and the default sort order
     * for {@code DISPLAYNAME} is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * TIMECREATED}.
     *
     * <p>The default sort order for {@code TIMECREATED} is descending, and the default sort order
     * for {@code DISPLAYNAME} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListImportedPackagesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /**
         * List only the information for the package with this name. Package names are unique to a
         * publisher and may not change.
         *
         * <p>Example: {@code My Package}
         */
        private String name = null;

        /**
         * List only the information for the package with this name. Package names are unique to a
         * publisher and may not change.
         *
         * <p>Example: {@code My Package}
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page at which to start retrieving results.
         *
         * <p>You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         *
         * <p>Example: {@code MToxMA==}
         */
        private String page = null;

        /**
         * The page at which to start retrieving results.
         *
         * <p>You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         *
         * <p>Example: {@code MToxMA==}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
         * (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
         * (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code
         * TIMECREATED}.
         *
         * <p>The default sort order for {@code TIMECREATED} is descending, and the default sort
         * order for {@code DISPLAYNAME} is ascending.
         */
        private SortBy sortBy = null;

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code
         * TIMECREATED}.
         *
         * <p>The default sort order for {@code TIMECREATED} is descending, and the default sort
         * order for {@code DISPLAYNAME} is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
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
        public Builder copy(ListImportedPackagesRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            name(o.getName());
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
         * Build the instance of ListImportedPackagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListImportedPackagesRequest
         */
        public ListImportedPackagesRequest build() {
            ListImportedPackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListImportedPackagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListImportedPackagesRequest
         */
        public ListImportedPackagesRequest buildWithoutInvocationCallback() {
            ListImportedPackagesRequest request = new ListImportedPackagesRequest();
            request.odaInstanceId = odaInstanceId;
            request.name = name;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListImportedPackagesRequest(odaInstanceId, name, limit, page, sortOrder, sortBy,
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
                .odaInstanceId(odaInstanceId)
                .name(name)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",name=").append(String.valueOf(this.name));
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
        if (!(o instanceof ListImportedPackagesRequest)) {
            return false;
        }

        ListImportedPackagesRequest other = (ListImportedPackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.name, other.name)
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
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
