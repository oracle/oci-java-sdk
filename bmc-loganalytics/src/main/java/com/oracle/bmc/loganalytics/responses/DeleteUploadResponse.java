/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class DeleteUploadResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Deleted log records count. */
    private Long opcDeletedLogCount;

    /**
     * Deleted log records count.
     *
     * @return the value
     */
    public Long getOpcDeletedLogCount() {
        return opcDeletedLogCount;
    }

    /** Deleted log files count. */
    private Long opcDeletedLogfileCount;

    /**
     * Deleted log files count.
     *
     * @return the value
     */
    public Long getOpcDeletedLogfileCount() {
        return opcDeletedLogfileCount;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcDeletedLogCount",
        "opcDeletedLogfileCount"
    })
    private DeleteUploadResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            Long opcDeletedLogCount,
            Long opcDeletedLogfileCount) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcDeletedLogCount = opcDeletedLogCount;
        this.opcDeletedLogfileCount = opcDeletedLogfileCount;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<DeleteUploadResponse> {
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Deleted log records count. */
        private Long opcDeletedLogCount;

        /**
         * Deleted log records count.
         *
         * @param opcDeletedLogCount the value to set
         * @return this builder
         */
        public Builder opcDeletedLogCount(Long opcDeletedLogCount) {
            this.opcDeletedLogCount = opcDeletedLogCount;
            return this;
        }

        /** Deleted log files count. */
        private Long opcDeletedLogfileCount;

        /**
         * Deleted log files count.
         *
         * @param opcDeletedLogfileCount the value to set
         * @return this builder
         */
        public Builder opcDeletedLogfileCount(Long opcDeletedLogfileCount) {
            this.opcDeletedLogfileCount = opcDeletedLogfileCount;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(DeleteUploadResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcDeletedLogCount(o.getOpcDeletedLogCount());
            opcDeletedLogfileCount(o.getOpcDeletedLogfileCount());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public DeleteUploadResponse build() {
            return new DeleteUploadResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcDeletedLogCount,
                    opcDeletedLogfileCount);
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
        sb.append(",opcDeletedLogCount=").append(String.valueOf(opcDeletedLogCount));
        sb.append(",opcDeletedLogfileCount=").append(String.valueOf(opcDeletedLogfileCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteUploadResponse)) {
            return false;
        }

        DeleteUploadResponse other = (DeleteUploadResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDeletedLogCount, other.opcDeletedLogCount)
                && java.util.Objects.equals(
                        this.opcDeletedLogfileCount, other.opcDeletedLogfileCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcDeletedLogCount == null
                                ? 43
                                : this.opcDeletedLogCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opcDeletedLogfileCount == null
                                ? 43
                                : this.opcDeletedLogfileCount.hashCode());
        return result;
    }
}
