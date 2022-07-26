/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.responses;

import com.oracle.bmc.ospgateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class PaySubscriptionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
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
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned PaySubscriptionReceipt instance.
     */
    private com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt paySubscriptionReceipt;

    /**
     * The returned PaySubscriptionReceipt instance.
     * @return the value
     */
    public com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt getPaySubscriptionReceipt() {
        return paySubscriptionReceipt;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "paySubscriptionReceipt"
    })
    private PaySubscriptionResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt paySubscriptionReceipt) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.paySubscriptionReceipt = paySubscriptionReceipt;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * For optimistic concurrency control. See {@code if-match}.
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned PaySubscriptionReceipt instance.
         */
        private com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt paySubscriptionReceipt;

        /**
         * The returned PaySubscriptionReceipt instance.
         * @param paySubscriptionReceipt the value to set
         * @return this builder
         */
        public Builder paySubscriptionReceipt(
                com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt paySubscriptionReceipt) {
            this.paySubscriptionReceipt = paySubscriptionReceipt;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PaySubscriptionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            paySubscriptionReceipt(o.getPaySubscriptionReceipt());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public PaySubscriptionResponse build() {
            return new PaySubscriptionResponse(
                    __httpStatusCode__, opcRequestId, etag, paySubscriptionReceipt);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",paySubscriptionReceipt=").append(String.valueOf(paySubscriptionReceipt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaySubscriptionResponse)) {
            return false;
        }

        PaySubscriptionResponse other = (PaySubscriptionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.paySubscriptionReceipt, other.paySubscriptionReceipt);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.paySubscriptionReceipt == null
                                ? 43
                                : this.paySubscriptionReceipt.hashCode());
        return result;
    }
}