/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetConsoleHistoryContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /** The number of bytes remaining in the snapshot. */
    private Integer opcBytesRemaining;

    /**
     * The number of bytes remaining in the snapshot.
     *
     * @return the value
     */
    public Integer getOpcBytesRemaining() {
        return opcBytesRemaining;
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

    /** The returned String instance. */
    private String value;

    /**
     * The returned String instance.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcBytesRemaining",
        "opcRequestId",
        "value"
    })
    private GetConsoleHistoryContentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            Integer opcBytesRemaining,
            String opcRequestId,
            String value) {
        super(__httpStatusCode__, headers);
        this.opcBytesRemaining = opcBytesRemaining;
        this.opcRequestId = opcRequestId;
        this.value = value;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetConsoleHistoryContentResponse> {
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

        /** The number of bytes remaining in the snapshot. */
        private Integer opcBytesRemaining;

        /**
         * The number of bytes remaining in the snapshot.
         *
         * @param opcBytesRemaining the value to set
         * @return this builder
         */
        public Builder opcBytesRemaining(Integer opcBytesRemaining) {
            this.opcBytesRemaining = opcBytesRemaining;
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

        /** The returned String instance. */
        private String value;

        /**
         * The returned String instance.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetConsoleHistoryContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcBytesRemaining(o.getOpcBytesRemaining());
            opcRequestId(o.getOpcRequestId());
            value(o.getValue());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetConsoleHistoryContentResponse build() {
            return new GetConsoleHistoryContentResponse(
                    __httpStatusCode__, headers, opcBytesRemaining, opcRequestId, value);
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
        sb.append(",opcBytesRemaining=").append(String.valueOf(opcBytesRemaining));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",value=").append(String.valueOf(value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConsoleHistoryContentResponse)) {
            return false;
        }

        GetConsoleHistoryContentResponse other = (GetConsoleHistoryContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcBytesRemaining, other.opcBytesRemaining)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcBytesRemaining == null ? 43 : this.opcBytesRemaining.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
