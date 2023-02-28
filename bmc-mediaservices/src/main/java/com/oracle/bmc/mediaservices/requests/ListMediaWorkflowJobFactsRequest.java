/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/ListMediaWorkflowJobFactsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMediaWorkflowJobFactsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class ListMediaWorkflowJobFactsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique MediaWorkflowJob identifier. */
    private String mediaWorkflowJobId;

    /** Unique MediaWorkflowJob identifier. */
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
    }
    /** Filter by MediaWorkflowJob ID and MediaWorkflowJobFact key. */
    private Integer key;

    /** Filter by MediaWorkflowJob ID and MediaWorkflowJobFact key. */
    public Integer getKey() {
        return key;
    }
    /** Types of details to include. */
    private Type type;

    /** Types of details to include. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        RunnableJob("runnableJob"),
        TaskDeclaration("taskDeclaration"),
        Workflow("workflow"),
        Configuration("configuration"),
        ParameterResolutionEvent("parameterResolutionEvent"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

    /** Types of details to include. */
    public Type getType() {
        return type;
    }
    /** Types of details to include. */
    private com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSortBy sortBy;

    /** Types of details to include. */
    public com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.mediaservices.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.mediaservices.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMediaWorkflowJobFactsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique MediaWorkflowJob identifier. */
        private String mediaWorkflowJobId = null;

        /**
         * Unique MediaWorkflowJob identifier.
         *
         * @param mediaWorkflowJobId the value to set
         * @return this builder instance
         */
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            return this;
        }

        /** Filter by MediaWorkflowJob ID and MediaWorkflowJobFact key. */
        private Integer key = null;

        /**
         * Filter by MediaWorkflowJob ID and MediaWorkflowJobFact key.
         *
         * @param key the value to set
         * @return this builder instance
         */
        public Builder key(Integer key) {
            this.key = key;
            return this;
        }

        /** Types of details to include. */
        private Type type = null;

        /**
         * Types of details to include.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        /** Types of details to include. */
        private com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSortBy sortBy = null;

        /**
         * Types of details to include.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(
                com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.mediaservices.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.mediaservices.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListMediaWorkflowJobFactsRequest o) {
            mediaWorkflowJobId(o.getMediaWorkflowJobId());
            key(o.getKey());
            type(o.getType());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMediaWorkflowJobFactsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMediaWorkflowJobFactsRequest
         */
        public ListMediaWorkflowJobFactsRequest build() {
            ListMediaWorkflowJobFactsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMediaWorkflowJobFactsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMediaWorkflowJobFactsRequest
         */
        public ListMediaWorkflowJobFactsRequest buildWithoutInvocationCallback() {
            ListMediaWorkflowJobFactsRequest request = new ListMediaWorkflowJobFactsRequest();
            request.mediaWorkflowJobId = mediaWorkflowJobId;
            request.key = key;
            request.type = type;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMediaWorkflowJobFactsRequest(mediaWorkflowJobId, key, type, sortBy,
            // sortOrder, page, limit, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mediaWorkflowJobId(mediaWorkflowJobId)
                .key(key)
                .type(type)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .page(page)
                .limit(limit)
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
        sb.append(",mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(",key=").append(String.valueOf(this.key));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMediaWorkflowJobFactsRequest)) {
            return false;
        }

        ListMediaWorkflowJobFactsRequest other = (ListMediaWorkflowJobFactsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
