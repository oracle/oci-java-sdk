/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.responses;

import com.oracle.bmc.capacitymanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class CreateOccCustomerResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     */
    private Integer retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     *
     * @return the value
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /** The returned {@code OccCustomer} instance. */
    private com.oracle.bmc.capacitymanagement.model.OccCustomer occCustomer;

    /**
     * The returned {@code OccCustomer} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.capacitymanagement.model.OccCustomer getOccCustomer() {
        return occCustomer;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "retryAfter",
        "occCustomer"
    })
    private CreateOccCustomerResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            Integer retryAfter,
            com.oracle.bmc.capacitymanagement.model.OccCustomer occCustomer) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.occCustomer = occCustomer;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateOccCustomerResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcRequestId;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         */
        private Integer retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         *
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /** The returned {@code OccCustomer} instance. */
        private com.oracle.bmc.capacitymanagement.model.OccCustomer occCustomer;

        /**
         * The returned {@code OccCustomer} instance.
         *
         * @param occCustomer the value to set
         * @return this builder
         */
        public Builder occCustomer(
                com.oracle.bmc.capacitymanagement.model.OccCustomer occCustomer) {
            this.occCustomer = occCustomer;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateOccCustomerResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            occCustomer(o.getOccCustomer());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateOccCustomerResponse build() {
            return new CreateOccCustomerResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, retryAfter, occCustomer);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",occCustomer=").append(String.valueOf(occCustomer));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOccCustomerResponse)) {
            return false;
        }

        CreateOccCustomerResponse other = (CreateOccCustomerResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.occCustomer, other.occCustomer);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result = (result * PRIME) + (this.occCustomer == null ? 43 : this.occCustomer.hashCode());
        return result;
    }
}
