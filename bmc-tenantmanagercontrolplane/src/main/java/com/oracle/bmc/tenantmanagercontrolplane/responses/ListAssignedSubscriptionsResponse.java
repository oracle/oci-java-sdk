/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.responses;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class ListAssignedSubscriptionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code AssignedSubscriptionCollection} instance. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionCollection
            assignedSubscriptionCollection;

    /**
     * The returned {@code AssignedSubscriptionCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionCollection
            getAssignedSubscriptionCollection() {
        return assignedSubscriptionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcRequestId",
        "assignedSubscriptionCollection"
    })
    private ListAssignedSubscriptionsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionCollection
                    assignedSubscriptionCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.assignedSubscriptionCollection = assignedSubscriptionCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListAssignedSubscriptionsResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code AssignedSubscriptionCollection} instance. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionCollection
                assignedSubscriptionCollection;

        /**
         * The returned {@code AssignedSubscriptionCollection} instance.
         *
         * @param assignedSubscriptionCollection the value to set
         * @return this builder
         */
        public Builder assignedSubscriptionCollection(
                com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionCollection
                        assignedSubscriptionCollection) {
            this.assignedSubscriptionCollection = assignedSubscriptionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListAssignedSubscriptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            assignedSubscriptionCollection(o.getAssignedSubscriptionCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListAssignedSubscriptionsResponse build() {
            return new ListAssignedSubscriptionsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcRequestId,
                    assignedSubscriptionCollection);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",assignedSubscriptionCollection=")
                .append(String.valueOf(assignedSubscriptionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAssignedSubscriptionsResponse)) {
            return false;
        }

        ListAssignedSubscriptionsResponse other = (ListAssignedSubscriptionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.assignedSubscriptionCollection, other.assignedSubscriptionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedSubscriptionCollection == null
                                ? 43
                                : this.assignedSubscriptionCollection.hashCode());
        return result;
    }
}
