/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListPublicationPackagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListPublicationPackagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class ListPublicationPackagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique identifier for the publication. */
    private String publicationId;

    /** The unique identifier for the publication. */
    public String getPublicationId() {
        return publicationId;
    }
    /** The version of the package. Package versions are unique within a listing. */
    private String packageVersion;

    /** The version of the package. Package versions are unique within a listing. */
    public String getPackageVersion() {
        return packageVersion;
    }
    /** A filter to return only packages that match the given package type exactly. */
    private String packageType;

    /** A filter to return only packages that match the given package type exactly. */
    public String getPackageType() {
        return packageType;
    }
    /**
     * The field to use to sort listed results. You can only specify one field to sort by. {@code
     * TIMERELEASED} displays results in descending order by default. You can change your preference
     * by specifying a different sort order.
     */
    private SortBy sortBy;

    /**
     * The field to use to sort listed results. You can only specify one field to sort by. {@code
     * TIMERELEASED} displays results in descending order by default. You can change your preference
     * by specifying a different sort order.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timereleased("TIMERELEASED"),
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
     * The field to use to sort listed results. You can only specify one field to sort by. {@code
     * TIMERELEASED} displays results in descending order by default. You can change your preference
     * by specifying a different sort order.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either {@code ASC} or {@code DESC}. */
    private SortOrder sortOrder;

    /** The sort order to use, either {@code ASC} or {@code DESC}. */
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

    /** The sort order to use, either {@code ASC} or {@code DESC}. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000.
     * The default is 30.
     */
    private Integer limit;

    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000.
     * The default is 30.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPublicationPackagesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier for the publication. */
        private String publicationId = null;

        /**
         * The unique identifier for the publication.
         *
         * @param publicationId the value to set
         * @return this builder instance
         */
        public Builder publicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }

        /** The version of the package. Package versions are unique within a listing. */
        private String packageVersion = null;

        /**
         * The version of the package. Package versions are unique within a listing.
         *
         * @param packageVersion the value to set
         * @return this builder instance
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        /** A filter to return only packages that match the given package type exactly. */
        private String packageType = null;

        /**
         * A filter to return only packages that match the given package type exactly.
         *
         * @param packageType the value to set
         * @return this builder instance
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMERELEASED} displays results in descending order by default. You can change your
         * preference by specifying a different sort order.
         */
        private SortBy sortBy = null;

        /**
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMERELEASED} displays results in descending order by default. You can change your
         * preference by specifying a different sort order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either {@code ASC} or {@code DESC}. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either {@code ASC} or {@code DESC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to
         * 1000. The default is 30.
         */
        private Integer limit = null;

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to
         * 1000. The default is 30.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListPublicationPackagesRequest o) {
            publicationId(o.getPublicationId());
            packageVersion(o.getPackageVersion());
            packageType(o.getPackageType());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPublicationPackagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPublicationPackagesRequest
         */
        public ListPublicationPackagesRequest build() {
            ListPublicationPackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPublicationPackagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPublicationPackagesRequest
         */
        public ListPublicationPackagesRequest buildWithoutInvocationCallback() {
            ListPublicationPackagesRequest request = new ListPublicationPackagesRequest();
            request.publicationId = publicationId;
            request.packageVersion = packageVersion;
            request.packageType = packageType;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPublicationPackagesRequest(publicationId, packageVersion, packageType,
            // sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .publicationId(publicationId)
                .packageVersion(packageVersion)
                .packageType(packageType)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
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
        sb.append(",publicationId=").append(String.valueOf(this.publicationId));
        sb.append(",packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(",packageType=").append(String.valueOf(this.packageType));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPublicationPackagesRequest)) {
            return false;
        }

        ListPublicationPackagesRequest other = (ListPublicationPackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.publicationId, other.publicationId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.publicationId == null ? 43 : this.publicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
