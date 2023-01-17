/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.responses;

import com.oracle.bmc.waa.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class ListWebAppAccelerationPoliciesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned WebAppAccelerationPolicyCollection instance.
     */
    private com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection
            webAppAccelerationPolicyCollection;

    /**
     * The returned WebAppAccelerationPolicyCollection instance.
     * @return the value
     */
    public com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection
            getWebAppAccelerationPolicyCollection() {
        return webAppAccelerationPolicyCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "webAppAccelerationPolicyCollection"
    })
    private ListWebAppAccelerationPoliciesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection
                    webAppAccelerationPolicyCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.webAppAccelerationPolicyCollection = webAppAccelerationPolicyCollection;
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
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned WebAppAccelerationPolicyCollection instance.
         */
        private com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection
                webAppAccelerationPolicyCollection;

        /**
         * The returned WebAppAccelerationPolicyCollection instance.
         * @param webAppAccelerationPolicyCollection the value to set
         * @return this builder
         */
        public Builder webAppAccelerationPolicyCollection(
                com.oracle.bmc.waa.model.WebAppAccelerationPolicyCollection
                        webAppAccelerationPolicyCollection) {
            this.webAppAccelerationPolicyCollection = webAppAccelerationPolicyCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWebAppAccelerationPoliciesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            webAppAccelerationPolicyCollection(o.getWebAppAccelerationPolicyCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListWebAppAccelerationPoliciesResponse build() {
            return new ListWebAppAccelerationPoliciesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    webAppAccelerationPolicyCollection);
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
        sb.append(",webAppAccelerationPolicyCollection=")
                .append(String.valueOf(webAppAccelerationPolicyCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWebAppAccelerationPoliciesResponse)) {
            return false;
        }

        ListWebAppAccelerationPoliciesResponse other = (ListWebAppAccelerationPoliciesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.webAppAccelerationPolicyCollection,
                        other.webAppAccelerationPolicyCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.webAppAccelerationPolicyCollection == null
                                ? 43
                                : this.webAppAccelerationPolicyCollection.hashCode());
        return result;
    }
}
