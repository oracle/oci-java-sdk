/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.responses;

import com.oracle.bmc.limitsincrease.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListLimitsIncreaseRequestsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned LimitsIncreaseRequestCollection instance.
     */
    private com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection
            limitsIncreaseRequestCollection;

    /**
     * The returned LimitsIncreaseRequestCollection instance.
     * @return the value
     */
    public com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection
            getLimitsIncreaseRequestCollection() {
        return limitsIncreaseRequestCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "limitsIncreaseRequestCollection"
    })
    private ListLimitsIncreaseRequestsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection
                    limitsIncreaseRequestCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.limitsIncreaseRequestCollection = limitsIncreaseRequestCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages
         * of results remain. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages
         * of results remain. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned LimitsIncreaseRequestCollection instance.
         */
        private com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection
                limitsIncreaseRequestCollection;

        /**
         * The returned LimitsIncreaseRequestCollection instance.
         * @param limitsIncreaseRequestCollection the value to set
         * @return this builder
         */
        public Builder limitsIncreaseRequestCollection(
                com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection
                        limitsIncreaseRequestCollection) {
            this.limitsIncreaseRequestCollection = limitsIncreaseRequestCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLimitsIncreaseRequestsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            limitsIncreaseRequestCollection(o.getLimitsIncreaseRequestCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListLimitsIncreaseRequestsResponse build() {
            return new ListLimitsIncreaseRequestsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    limitsIncreaseRequestCollection);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",limitsIncreaseRequestCollection=")
                .append(String.valueOf(limitsIncreaseRequestCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLimitsIncreaseRequestsResponse)) {
            return false;
        }

        ListLimitsIncreaseRequestsResponse other = (ListLimitsIncreaseRequestsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.limitsIncreaseRequestCollection,
                        other.limitsIncreaseRequestCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.limitsIncreaseRequestCollection == null
                                ? 43
                                : this.limitsIncreaseRequestCollection.hashCode());
        return result;
    }
}
