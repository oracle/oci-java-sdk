/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListExcludedObjectsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListExcludedObjectsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class ListExcludedObjectsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the job */
    private String jobId;

    /** The OCID of the job */
    public String getJobId() {
        return jobId;
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
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.databasemigration.model.SortOrders sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.databasemigration.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for reasonCategory
     * is ascending. If no value is specified reasonCategory is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for reasonCategory
     * is ascending. If no value is specified reasonCategory is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Type("type"),
        ReasonCategory("reasonCategory"),
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
     * The field to sort by. Only one sort order may be provided. Default order for reasonCategory
     * is ascending. If no value is specified reasonCategory is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Excluded object type. */
    private String type;

    /** Excluded object type. */
    public String getType() {
        return type;
    }
    /** Excluded object owner */
    private String owner;

    /** Excluded object owner */
    public String getOwner() {
        return owner;
    }
    /** Excluded object name */
    private String object;

    /** Excluded object name */
    public String getObject() {
        return object;
    }
    /** Excluded object owner which contains provided value. */
    private String ownerContains;

    /** Excluded object owner which contains provided value. */
    public String getOwnerContains() {
        return ownerContains;
    }
    /** Excluded object name which contains provided value. */
    private String objectContains;

    /** Excluded object name which contains provided value. */
    public String getObjectContains() {
        return objectContains;
    }
    /** Reason category for the excluded object */
    private com.oracle.bmc.databasemigration.model.ReasonKeywords reasonCategory;

    /** Reason category for the excluded object */
    public com.oracle.bmc.databasemigration.model.ReasonKeywords getReasonCategory() {
        return reasonCategory;
    }
    /** Exclude object rule that matches the excluded object, if applicable. */
    private String sourceRule;

    /** Exclude object rule that matches the excluded object, if applicable. */
    public String getSourceRule() {
        return sourceRule;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListExcludedObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the job */
        private String jobId = null;

        /**
         * The OCID of the job
         *
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.databasemigration.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemigration.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for
         * reasonCategory is ascending. If no value is specified reasonCategory is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for
         * reasonCategory is ascending. If no value is specified reasonCategory is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Excluded object type. */
        private String type = null;

        /**
         * Excluded object type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /** Excluded object owner */
        private String owner = null;

        /**
         * Excluded object owner
         *
         * @param owner the value to set
         * @return this builder instance
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /** Excluded object name */
        private String object = null;

        /**
         * Excluded object name
         *
         * @param object the value to set
         * @return this builder instance
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /** Excluded object owner which contains provided value. */
        private String ownerContains = null;

        /**
         * Excluded object owner which contains provided value.
         *
         * @param ownerContains the value to set
         * @return this builder instance
         */
        public Builder ownerContains(String ownerContains) {
            this.ownerContains = ownerContains;
            return this;
        }

        /** Excluded object name which contains provided value. */
        private String objectContains = null;

        /**
         * Excluded object name which contains provided value.
         *
         * @param objectContains the value to set
         * @return this builder instance
         */
        public Builder objectContains(String objectContains) {
            this.objectContains = objectContains;
            return this;
        }

        /** Reason category for the excluded object */
        private com.oracle.bmc.databasemigration.model.ReasonKeywords reasonCategory = null;

        /**
         * Reason category for the excluded object
         *
         * @param reasonCategory the value to set
         * @return this builder instance
         */
        public Builder reasonCategory(
                com.oracle.bmc.databasemigration.model.ReasonKeywords reasonCategory) {
            this.reasonCategory = reasonCategory;
            return this;
        }

        /** Exclude object rule that matches the excluded object, if applicable. */
        private String sourceRule = null;

        /**
         * Exclude object rule that matches the excluded object, if applicable.
         *
         * @param sourceRule the value to set
         * @return this builder instance
         */
        public Builder sourceRule(String sourceRule) {
            this.sourceRule = sourceRule;
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
        public Builder copy(ListExcludedObjectsRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            type(o.getType());
            owner(o.getOwner());
            object(o.getObject());
            ownerContains(o.getOwnerContains());
            objectContains(o.getObjectContains());
            reasonCategory(o.getReasonCategory());
            sourceRule(o.getSourceRule());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListExcludedObjectsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListExcludedObjectsRequest
         */
        public ListExcludedObjectsRequest build() {
            ListExcludedObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListExcludedObjectsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListExcludedObjectsRequest
         */
        public ListExcludedObjectsRequest buildWithoutInvocationCallback() {
            ListExcludedObjectsRequest request = new ListExcludedObjectsRequest();
            request.jobId = jobId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.type = type;
            request.owner = owner;
            request.object = object;
            request.ownerContains = ownerContains;
            request.objectContains = objectContains;
            request.reasonCategory = reasonCategory;
            request.sourceRule = sourceRule;
            return request;
            // new ListExcludedObjectsRequest(jobId, opcRequestId, limit, page, sortOrder, sortBy,
            // type, owner, object, ownerContains, objectContains, reasonCategory, sourceRule);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .type(type)
                .owner(owner)
                .object(object)
                .ownerContains(ownerContains)
                .objectContains(objectContains)
                .reasonCategory(reasonCategory)
                .sourceRule(sourceRule);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",owner=").append(String.valueOf(this.owner));
        sb.append(",object=").append(String.valueOf(this.object));
        sb.append(",ownerContains=").append(String.valueOf(this.ownerContains));
        sb.append(",objectContains=").append(String.valueOf(this.objectContains));
        sb.append(",reasonCategory=").append(String.valueOf(this.reasonCategory));
        sb.append(",sourceRule=").append(String.valueOf(this.sourceRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExcludedObjectsRequest)) {
            return false;
        }

        ListExcludedObjectsRequest other = (ListExcludedObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.ownerContains, other.ownerContains)
                && java.util.Objects.equals(this.objectContains, other.objectContains)
                && java.util.Objects.equals(this.reasonCategory, other.reasonCategory)
                && java.util.Objects.equals(this.sourceRule, other.sourceRule);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerContains == null ? 43 : this.ownerContains.hashCode());
        result =
                (result * PRIME)
                        + (this.objectContains == null ? 43 : this.objectContains.hashCode());
        result =
                (result * PRIME)
                        + (this.reasonCategory == null ? 43 : this.reasonCategory.hashCode());
        result = (result * PRIME) + (this.sourceRule == null ? 43 : this.sourceRule.hashCode());
        return result;
    }
}
