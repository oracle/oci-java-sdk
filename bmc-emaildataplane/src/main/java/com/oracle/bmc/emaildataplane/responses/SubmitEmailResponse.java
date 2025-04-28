/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.responses;

import com.oracle.bmc.emaildataplane.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
public class SubmitEmailResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code EmailSubmittedResponse} instance. */
    private com.oracle.bmc.emaildataplane.model.EmailSubmittedResponse emailSubmittedResponse;

    /**
     * The returned {@code EmailSubmittedResponse} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.emaildataplane.model.EmailSubmittedResponse getEmailSubmittedResponse() {
        return emailSubmittedResponse;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "emailSubmittedResponse"
    })
    private SubmitEmailResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.emaildataplane.model.EmailSubmittedResponse emailSubmittedResponse) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.emailSubmittedResponse = emailSubmittedResponse;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<SubmitEmailResponse> {
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

        /** The returned {@code EmailSubmittedResponse} instance. */
        private com.oracle.bmc.emaildataplane.model.EmailSubmittedResponse emailSubmittedResponse;

        /**
         * The returned {@code EmailSubmittedResponse} instance.
         *
         * @param emailSubmittedResponse the value to set
         * @return this builder
         */
        public Builder emailSubmittedResponse(
                com.oracle.bmc.emaildataplane.model.EmailSubmittedResponse emailSubmittedResponse) {
            this.emailSubmittedResponse = emailSubmittedResponse;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SubmitEmailResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            emailSubmittedResponse(o.getEmailSubmittedResponse());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SubmitEmailResponse build() {
            return new SubmitEmailResponse(
                    __httpStatusCode__, headers, opcRequestId, emailSubmittedResponse);
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
        sb.append(",emailSubmittedResponse=").append(String.valueOf(emailSubmittedResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitEmailResponse)) {
            return false;
        }

        SubmitEmailResponse other = (SubmitEmailResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.emailSubmittedResponse, other.emailSubmittedResponse);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.emailSubmittedResponse == null
                                ? 43
                                : this.emailSubmittedResponse.hashCode());
        return result;
    }
}
