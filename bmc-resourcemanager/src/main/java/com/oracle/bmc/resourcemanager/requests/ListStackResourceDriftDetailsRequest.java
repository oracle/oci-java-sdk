/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListStackResourceDriftDetailsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListStackResourceDriftDetailsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListStackResourceDriftDetailsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stack.
     */
    private String stackId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stack.
     */
    public String getStackId() {
        return stackId;
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
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request.
     */
    private String workRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request.
     */
    public String getWorkRequestId() {
        return workRequestId;
    }
    /**
     * A filter that returns only resources that match the given drift status. The value is
     * case-insensitive. Allowable values - - NOT_CHECKED - MODIFIED - IN_SYNC - DELETED
     */
    private java.util.List<
                    com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary
                            .ResourceDriftStatus>
            resourceDriftStatus;

    /**
     * A filter that returns only resources that match the given drift status. The value is
     * case-insensitive. Allowable values - - NOT_CHECKED - MODIFIED - IN_SYNC - DELETED
     */
    public java.util.List<
                    com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary
                            .ResourceDriftStatus>
            getResourceDriftStatus() {
        return resourceDriftStatus;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStackResourceDriftDetailsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stack.
         */
        private String stackId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stack.
         *
         * @param stackId the value to set
         * @return this builder instance
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request.
         */
        private String workRequestId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request.
         *
         * @param workRequestId the value to set
         * @return this builder instance
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            return this;
        }

        /**
         * A filter that returns only resources that match the given drift status. The value is
         * case-insensitive. Allowable values - - NOT_CHECKED - MODIFIED - IN_SYNC - DELETED
         */
        private java.util.List<
                        com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary
                                .ResourceDriftStatus>
                resourceDriftStatus = null;

        /**
         * A filter that returns only resources that match the given drift status. The value is
         * case-insensitive. Allowable values - - NOT_CHECKED - MODIFIED - IN_SYNC - DELETED
         *
         * @param resourceDriftStatus the value to set
         * @return this builder instance
         */
        public Builder resourceDriftStatus(
                java.util.List<
                                com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary
                                        .ResourceDriftStatus>
                        resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * Singular setter. A filter that returns only resources that match the given drift status.
         * The value is case-insensitive. Allowable values - - NOT_CHECKED - MODIFIED - IN_SYNC -
         * DELETED
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder resourceDriftStatus(
                com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary.ResourceDriftStatus
                        singularValue) {
            return this.resourceDriftStatus(java.util.Arrays.asList(singularValue));
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListStackResourceDriftDetailsRequest o) {
            stackId(o.getStackId());
            opcRequestId(o.getOpcRequestId());
            workRequestId(o.getWorkRequestId());
            resourceDriftStatus(o.getResourceDriftStatus());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStackResourceDriftDetailsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListStackResourceDriftDetailsRequest
         */
        public ListStackResourceDriftDetailsRequest build() {
            ListStackResourceDriftDetailsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStackResourceDriftDetailsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStackResourceDriftDetailsRequest
         */
        public ListStackResourceDriftDetailsRequest buildWithoutInvocationCallback() {
            ListStackResourceDriftDetailsRequest request =
                    new ListStackResourceDriftDetailsRequest();
            request.stackId = stackId;
            request.opcRequestId = opcRequestId;
            request.workRequestId = workRequestId;
            request.resourceDriftStatus = resourceDriftStatus;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListStackResourceDriftDetailsRequest(stackId, opcRequestId, workRequestId,
            // resourceDriftStatus, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .stackId(stackId)
                .opcRequestId(opcRequestId)
                .workRequestId(workRequestId)
                .resourceDriftStatus(resourceDriftStatus)
                .limit(limit)
                .page(page);
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
        sb.append(",stackId=").append(String.valueOf(this.stackId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(",resourceDriftStatus=").append(String.valueOf(this.resourceDriftStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStackResourceDriftDetailsRequest)) {
            return false;
        }

        ListStackResourceDriftDetailsRequest other = (ListStackResourceDriftDetailsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.resourceDriftStatus, other.resourceDriftStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDriftStatus == null
                                ? 43
                                : this.resourceDriftStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
