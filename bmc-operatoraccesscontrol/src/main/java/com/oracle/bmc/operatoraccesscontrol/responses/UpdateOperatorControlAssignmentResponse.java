/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.responses;

import com.oracle.bmc.operatoraccesscontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOperatorControlAssignmentResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code OperatorControlAssignment} instance. */
    private com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment
            operatorControlAssignment;

    /**
     * The returned {@code OperatorControlAssignment} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment
            getOperatorControlAssignment() {
        return operatorControlAssignment;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "operatorControlAssignment"
    })
    private UpdateOperatorControlAssignmentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment
                    operatorControlAssignment) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.operatorControlAssignment = operatorControlAssignment;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateOperatorControlAssignmentResponse> {
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

        /** The returned {@code OperatorControlAssignment} instance. */
        private com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment
                operatorControlAssignment;

        /**
         * The returned {@code OperatorControlAssignment} instance.
         *
         * @param operatorControlAssignment the value to set
         * @return this builder
         */
        public Builder operatorControlAssignment(
                com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment
                        operatorControlAssignment) {
            this.operatorControlAssignment = operatorControlAssignment;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateOperatorControlAssignmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            operatorControlAssignment(o.getOperatorControlAssignment());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateOperatorControlAssignmentResponse build() {
            return new UpdateOperatorControlAssignmentResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, operatorControlAssignment);
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
        sb.append(",operatorControlAssignment=").append(String.valueOf(operatorControlAssignment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOperatorControlAssignmentResponse)) {
            return false;
        }

        UpdateOperatorControlAssignmentResponse other = (UpdateOperatorControlAssignmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.operatorControlAssignment, other.operatorControlAssignment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.operatorControlAssignment == null
                                ? 43
                                : this.operatorControlAssignment.hashCode());
        return result;
    }
}
