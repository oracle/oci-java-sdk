/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.responses;

import com.oracle.bmc.demandsignal.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class UpdateOccDemandSignalResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     */
    private Integer retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     * @return the value
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * The returned OccDemandSignal instance.
     */
    private com.oracle.bmc.demandsignal.model.OccDemandSignal occDemandSignal;

    /**
     * The returned OccDemandSignal instance.
     * @return the value
     */
    public com.oracle.bmc.demandsignal.model.OccDemandSignal getOccDemandSignal() {
        return occDemandSignal;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "retryAfter",
        "etag",
        "opcRequestId",
        "occDemandSignal"
    })
    private UpdateOccDemandSignalResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            Integer retryAfter,
            String etag,
            String opcRequestId,
            com.oracle.bmc.demandsignal.model.OccDemandSignal occDemandSignal) {
        super(__httpStatusCode__, headers);
        this.retryAfter = retryAfter;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.occDemandSignal = occDemandSignal;
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
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         */
        private Integer retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * The returned OccDemandSignal instance.
         */
        private com.oracle.bmc.demandsignal.model.OccDemandSignal occDemandSignal;

        /**
         * The returned OccDemandSignal instance.
         * @param occDemandSignal the value to set
         * @return this builder
         */
        public Builder occDemandSignal(
                com.oracle.bmc.demandsignal.model.OccDemandSignal occDemandSignal) {
            this.occDemandSignal = occDemandSignal;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateOccDemandSignalResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            retryAfter(o.getRetryAfter());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            occDemandSignal(o.getOccDemandSignal());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateOccDemandSignalResponse build() {
            return new UpdateOccDemandSignalResponse(
                    __httpStatusCode__, headers, retryAfter, etag, opcRequestId, occDemandSignal);
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
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",occDemandSignal=").append(String.valueOf(occDemandSignal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOccDemandSignalResponse)) {
            return false;
        }

        UpdateOccDemandSignalResponse other = (UpdateOccDemandSignalResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.occDemandSignal, other.occDemandSignal);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.occDemandSignal == null ? 43 : this.occDemandSignal.hashCode());
        return result;
    }
}
