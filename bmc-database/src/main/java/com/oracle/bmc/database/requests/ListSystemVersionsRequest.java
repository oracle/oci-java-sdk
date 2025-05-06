/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSystemVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSystemVersionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListSystemVersionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Specifies gi version query parameter. */
    private String giVersion;

    /** Specifies gi version query parameter. */
    public String getGiVersion() {
        return giVersion;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token to continue listing from. */
    private String page;

    /** The pagination token to continue listing from. */
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** If provided, filters the results for the given shape. */
    private String shape;

    /** If provided, filters the results for the given shape. */
    public String getShape() {
        return shape;
    }
    /** If provided, return highest versions from each major version family. */
    private Boolean isLatest;

    /** If provided, return highest versions from each major version family. */
    public Boolean getIsLatest() {
        return isLatest;
    }
    /** If provided, filters the results for the specified resource Id. */
    private String resourceId;

    /** If provided, filters the results for the specified resource Id. */
    public String getResourceId() {
        return resourceId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSystemVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Specifies gi version query parameter. */
        private String giVersion = null;

        /**
         * Specifies gi version query parameter.
         *
         * @param giVersion the value to set
         * @return this builder instance
         */
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
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

        /** The pagination token to continue listing from. */
        private String page = null;

        /**
         * The pagination token to continue listing from.
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** If provided, filters the results for the given shape. */
        private String shape = null;

        /**
         * If provided, filters the results for the given shape.
         *
         * @param shape the value to set
         * @return this builder instance
         */
        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        /** If provided, return highest versions from each major version family. */
        private Boolean isLatest = null;

        /**
         * If provided, return highest versions from each major version family.
         *
         * @param isLatest the value to set
         * @return this builder instance
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /** If provided, filters the results for the specified resource Id. */
        private String resourceId = null;

        /**
         * If provided, filters the results for the specified resource Id.
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
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
        public Builder copy(ListSystemVersionsRequest o) {
            compartmentId(o.getCompartmentId());
            giVersion(o.getGiVersion());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            shape(o.getShape());
            isLatest(o.getIsLatest());
            resourceId(o.getResourceId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSystemVersionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSystemVersionsRequest
         */
        public ListSystemVersionsRequest build() {
            ListSystemVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSystemVersionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSystemVersionsRequest
         */
        public ListSystemVersionsRequest buildWithoutInvocationCallback() {
            ListSystemVersionsRequest request = new ListSystemVersionsRequest();
            request.compartmentId = compartmentId;
            request.giVersion = giVersion;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.shape = shape;
            request.isLatest = isLatest;
            request.resourceId = resourceId;
            return request;
            // new ListSystemVersionsRequest(compartmentId, giVersion, limit, page, sortOrder,
            // opcRequestId, shape, isLatest, resourceId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .giVersion(giVersion)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .shape(shape)
                .isLatest(isLatest)
                .resourceId(resourceId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",giVersion=").append(String.valueOf(this.giVersion));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shape=").append(String.valueOf(this.shape));
        sb.append(",isLatest=").append(String.valueOf(this.isLatest));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSystemVersionsRequest)) {
            return false;
        }

        ListSystemVersionsRequest other = (ListSystemVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.resourceId, other.resourceId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        return result;
    }
}
