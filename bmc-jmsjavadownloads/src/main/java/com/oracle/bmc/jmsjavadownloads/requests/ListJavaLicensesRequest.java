/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/ListJavaLicensesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJavaLicensesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class ListJavaLicensesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Java license type.
     */
    private com.oracle.bmc.jmsjavadownloads.model.LicenseType licenseType;

    /**
     * Unique Java license type.
     */
    public com.oracle.bmc.jmsjavadownloads.model.LicenseType getLicenseType() {
        return licenseType;
    }
    /**
     * A filter to return only resources that match the display name.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the display name.
     */
    public String getDisplayName() {
        return displayName;
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
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder;

    /**
     * The sort order, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.jmsjavadownloads.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. If no value is specified, _licenseType_ is the default.
     *
     */
    private com.oracle.bmc.jmsjavadownloads.model.LicenseSortBy sortBy;

    /**
     * The field to sort by. If no value is specified, _licenseType_ is the default.
     *
     */
    public com.oracle.bmc.jmsjavadownloads.model.LicenseSortBy getSortBy() {
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
                    ListJavaLicensesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Java license type.
         */
        private com.oracle.bmc.jmsjavadownloads.model.LicenseType licenseType = null;

        /**
         * Unique Java license type.
         * @param licenseType the value to set
         * @return this builder instance
         */
        public Builder licenseType(com.oracle.bmc.jmsjavadownloads.model.LicenseType licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        /**
         * A filter to return only resources that match the display name.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the display name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. If no value is specified, _licenseType_ is the default.
         *
         */
        private com.oracle.bmc.jmsjavadownloads.model.LicenseSortBy sortBy = null;

        /**
         * The field to sort by. If no value is specified, _licenseType_ is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jmsjavadownloads.model.LicenseSortBy sortBy) {
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
        public Builder copy(ListJavaLicensesRequest o) {
            licenseType(o.getLicenseType());
            displayName(o.getDisplayName());
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
         * Build the instance of ListJavaLicensesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJavaLicensesRequest
         */
        public ListJavaLicensesRequest build() {
            ListJavaLicensesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJavaLicensesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJavaLicensesRequest
         */
        public ListJavaLicensesRequest buildWithoutInvocationCallback() {
            ListJavaLicensesRequest request = new ListJavaLicensesRequest();
            request.licenseType = licenseType;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJavaLicensesRequest(licenseType, displayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .licenseType(licenseType)
                .displayName(displayName)
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
        sb.append(",licenseType=").append(String.valueOf(this.licenseType));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof ListJavaLicensesRequest)) {
            return false;
        }

        ListJavaLicensesRequest other = (ListJavaLicensesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
