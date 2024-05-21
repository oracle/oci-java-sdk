/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/BatchGetBasicInfoExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BatchGetBasicInfoRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class BatchGetBasicInfoRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.loganalytics.model.LabelNames> {

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
     * List of label names to get information on
     */
    private com.oracle.bmc.loganalytics.model.LabelNames basicDetails;

    /**
     * List of label names to get information on
     */
    public com.oracle.bmc.loganalytics.model.LabelNames getBasicDetails() {
        return basicDetails;
    }
    /**
     * A flag specifying whether or not to include information on deleted labels.
     *
     */
    private Boolean isIncludeDeleted;

    /**
     * A flag specifying whether or not to include information on deleted labels.
     *
     */
    public Boolean getIsIncludeDeleted() {
        return isIncludeDeleted;
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
     * The attribute used to sort the returned labels
     */
    private BasicLabelSortBy basicLabelSortBy;

    /**
     * The attribute used to sort the returned labels
     **/
    public enum BasicLabelSortBy {
        Name("name"),
        Priority("priority"),
        ;

        private final String value;
        private static java.util.Map<String, BasicLabelSortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (BasicLabelSortBy v : BasicLabelSortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        BasicLabelSortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BasicLabelSortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BasicLabelSortBy: " + key);
        }
    };

    /**
     * The attribute used to sort the returned labels
     */
    public BasicLabelSortBy getBasicLabelSortBy() {
        return basicLabelSortBy;
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

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.LabelNames getBody$() {
        return basicDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BatchGetBasicInfoRequest, com.oracle.bmc.loganalytics.model.LabelNames> {
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
         * List of label names to get information on
         */
        private com.oracle.bmc.loganalytics.model.LabelNames basicDetails = null;

        /**
         * List of label names to get information on
         * @param basicDetails the value to set
         * @return this builder instance
         */
        public Builder basicDetails(com.oracle.bmc.loganalytics.model.LabelNames basicDetails) {
            this.basicDetails = basicDetails;
            return this;
        }

        /**
         * A flag specifying whether or not to include information on deleted labels.
         *
         */
        private Boolean isIncludeDeleted = null;

        /**
         * A flag specifying whether or not to include information on deleted labels.
         *
         * @param isIncludeDeleted the value to set
         * @return this builder instance
         */
        public Builder isIncludeDeleted(Boolean isIncludeDeleted) {
            this.isIncludeDeleted = isIncludeDeleted;
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
         * The attribute used to sort the returned labels
         */
        private BasicLabelSortBy basicLabelSortBy = null;

        /**
         * The attribute used to sort the returned labels
         * @param basicLabelSortBy the value to set
         * @return this builder instance
         */
        public Builder basicLabelSortBy(BasicLabelSortBy basicLabelSortBy) {
            this.basicLabelSortBy = basicLabelSortBy;
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
        public Builder copy(BatchGetBasicInfoRequest o) {
            namespaceName(o.getNamespaceName());
            basicDetails(o.getBasicDetails());
            isIncludeDeleted(o.getIsIncludeDeleted());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            basicLabelSortBy(o.getBasicLabelSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BatchGetBasicInfoRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of BatchGetBasicInfoRequest
         */
        public BatchGetBasicInfoRequest build() {
            BatchGetBasicInfoRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.loganalytics.model.LabelNames body) {
            basicDetails(body);
            return this;
        }

        /**
         * Build the instance of BatchGetBasicInfoRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BatchGetBasicInfoRequest
         */
        public BatchGetBasicInfoRequest buildWithoutInvocationCallback() {
            BatchGetBasicInfoRequest request = new BatchGetBasicInfoRequest();
            request.namespaceName = namespaceName;
            request.basicDetails = basicDetails;
            request.isIncludeDeleted = isIncludeDeleted;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.basicLabelSortBy = basicLabelSortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new BatchGetBasicInfoRequest(namespaceName, basicDetails, isIncludeDeleted, limit, page, sortOrder, basicLabelSortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .basicDetails(basicDetails)
                .isIncludeDeleted(isIncludeDeleted)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .basicLabelSortBy(basicLabelSortBy)
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
        sb.append(",basicDetails=").append(String.valueOf(this.basicDetails));
        sb.append(",isIncludeDeleted=").append(String.valueOf(this.isIncludeDeleted));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",basicLabelSortBy=").append(String.valueOf(this.basicLabelSortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchGetBasicInfoRequest)) {
            return false;
        }

        BatchGetBasicInfoRequest other = (BatchGetBasicInfoRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.basicDetails, other.basicDetails)
                && java.util.Objects.equals(this.isIncludeDeleted, other.isIncludeDeleted)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.basicLabelSortBy, other.basicLabelSortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.basicDetails == null ? 43 : this.basicDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeDeleted == null ? 43 : this.isIncludeDeleted.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.basicLabelSortBy == null ? 43 : this.basicLabelSortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
