/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabaseDataguardAssociationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAutonomousContainerDatabaseDataguardAssociationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListAutonomousContainerDatabaseDataguardAssociationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
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
        public Builder copy(ListAutonomousContainerDatabaseDataguardAssociationsRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAutonomousContainerDatabaseDataguardAssociationsRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAutonomousContainerDatabaseDataguardAssociationsRequest
         */
        public ListAutonomousContainerDatabaseDataguardAssociationsRequest build() {
            ListAutonomousContainerDatabaseDataguardAssociationsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAutonomousContainerDatabaseDataguardAssociationsRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAutonomousContainerDatabaseDataguardAssociationsRequest
         */
        public ListAutonomousContainerDatabaseDataguardAssociationsRequest
                buildWithoutInvocationCallback() {
            ListAutonomousContainerDatabaseDataguardAssociationsRequest request =
                    new ListAutonomousContainerDatabaseDataguardAssociationsRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.limit = limit;
            request.page = page;
            return request;
            // new
            // ListAutonomousContainerDatabaseDataguardAssociationsRequest(autonomousContainerDatabaseId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
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
        if (!(o instanceof ListAutonomousContainerDatabaseDataguardAssociationsRequest)) {
            return false;
        }

        ListAutonomousContainerDatabaseDataguardAssociationsRequest other =
                (ListAutonomousContainerDatabaseDataguardAssociationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
