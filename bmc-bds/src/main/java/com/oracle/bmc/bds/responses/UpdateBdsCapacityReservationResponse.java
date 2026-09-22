/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.responses;

import com.oracle.bmc.bds.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class UpdateBdsCapacityReservationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * The returned BdsCapacityReservation instance.
     */
    private com.oracle.bmc.bds.model.BdsCapacityReservation bdsCapacityReservation;

    /**
     * The returned BdsCapacityReservation instance.
     * @return the value
     */
    public com.oracle.bmc.bds.model.BdsCapacityReservation getBdsCapacityReservation() {
        return bdsCapacityReservation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "bdsCapacityReservation"
    })
    private UpdateBdsCapacityReservationResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.bds.model.BdsCapacityReservation bdsCapacityReservation) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.bdsCapacityReservation = bdsCapacityReservation;
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
         * Oracle about a request, provide this request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a request, provide this request ID.
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
         * The returned BdsCapacityReservation instance.
         */
        private com.oracle.bmc.bds.model.BdsCapacityReservation bdsCapacityReservation;

        /**
         * The returned BdsCapacityReservation instance.
         * @param bdsCapacityReservation the value to set
         * @return this builder
         */
        public Builder bdsCapacityReservation(
                com.oracle.bmc.bds.model.BdsCapacityReservation bdsCapacityReservation) {
            this.bdsCapacityReservation = bdsCapacityReservation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateBdsCapacityReservationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            bdsCapacityReservation(o.getBdsCapacityReservation());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateBdsCapacityReservationResponse build() {
            return new UpdateBdsCapacityReservationResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, bdsCapacityReservation);
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
        sb.append(",bdsCapacityReservation=").append(String.valueOf(bdsCapacityReservation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBdsCapacityReservationResponse)) {
            return false;
        }

        UpdateBdsCapacityReservationResponse other = (UpdateBdsCapacityReservationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.bdsCapacityReservation, other.bdsCapacityReservation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsCapacityReservation == null
                                ? 43
                                : this.bdsCapacityReservation.hashCode());
        return result;
    }
}
