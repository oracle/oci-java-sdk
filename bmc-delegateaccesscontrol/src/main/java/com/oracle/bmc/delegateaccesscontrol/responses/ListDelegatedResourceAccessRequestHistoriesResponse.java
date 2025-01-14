/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.responses;

import com.oracle.bmc.delegateaccesscontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ListDelegatedResourceAccessRequestHistoriesResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code DelegatedResourceAccessRequestHistoryCollection} instance. */
    private com.oracle.bmc.delegateaccesscontrol.model
                    .DelegatedResourceAccessRequestHistoryCollection
            delegatedResourceAccessRequestHistoryCollection;

    /**
     * The returned {@code DelegatedResourceAccessRequestHistoryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.delegateaccesscontrol.model
                    .DelegatedResourceAccessRequestHistoryCollection
            getDelegatedResourceAccessRequestHistoryCollection() {
        return delegatedResourceAccessRequestHistoryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "delegatedResourceAccessRequestHistoryCollection"
    })
    private ListDelegatedResourceAccessRequestHistoriesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.delegateaccesscontrol.model
                            .DelegatedResourceAccessRequestHistoryCollection
                    delegatedResourceAccessRequestHistoryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.delegatedResourceAccessRequestHistoryCollection =
                delegatedResourceAccessRequestHistoryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListDelegatedResourceAccessRequestHistoriesResponse> {
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

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code DelegatedResourceAccessRequestHistoryCollection} instance. */
        private com.oracle.bmc.delegateaccesscontrol.model
                        .DelegatedResourceAccessRequestHistoryCollection
                delegatedResourceAccessRequestHistoryCollection;

        /**
         * The returned {@code DelegatedResourceAccessRequestHistoryCollection} instance.
         *
         * @param delegatedResourceAccessRequestHistoryCollection the value to set
         * @return this builder
         */
        public Builder delegatedResourceAccessRequestHistoryCollection(
                com.oracle.bmc.delegateaccesscontrol.model
                                .DelegatedResourceAccessRequestHistoryCollection
                        delegatedResourceAccessRequestHistoryCollection) {
            this.delegatedResourceAccessRequestHistoryCollection =
                    delegatedResourceAccessRequestHistoryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListDelegatedResourceAccessRequestHistoriesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            delegatedResourceAccessRequestHistoryCollection(
                    o.getDelegatedResourceAccessRequestHistoryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListDelegatedResourceAccessRequestHistoriesResponse build() {
            return new ListDelegatedResourceAccessRequestHistoriesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    delegatedResourceAccessRequestHistoryCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",delegatedResourceAccessRequestHistoryCollection=")
                .append(String.valueOf(delegatedResourceAccessRequestHistoryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDelegatedResourceAccessRequestHistoriesResponse)) {
            return false;
        }

        ListDelegatedResourceAccessRequestHistoriesResponse other =
                (ListDelegatedResourceAccessRequestHistoriesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.delegatedResourceAccessRequestHistoryCollection,
                        other.delegatedResourceAccessRequestHistoryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.delegatedResourceAccessRequestHistoryCollection == null
                                ? 43
                                : this.delegatedResourceAccessRequestHistoryCollection.hashCode());
        return result;
    }
}
