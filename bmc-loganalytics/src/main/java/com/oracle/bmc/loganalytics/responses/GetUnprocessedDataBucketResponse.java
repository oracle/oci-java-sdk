/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetUnprocessedDataBucketResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned UnprocessedDataBucket instance.
     */
    private com.oracle.bmc.loganalytics.model.UnprocessedDataBucket unprocessedDataBucket;

    /**
     * The returned UnprocessedDataBucket instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.UnprocessedDataBucket getUnprocessedDataBucket() {
        return unprocessedDataBucket;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "unprocessedDataBucket"
    })
    private GetUnprocessedDataBucketResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.UnprocessedDataBucket unprocessedDataBucket) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.unprocessedDataBucket = unprocessedDataBucket;
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned UnprocessedDataBucket instance.
         */
        private com.oracle.bmc.loganalytics.model.UnprocessedDataBucket unprocessedDataBucket;

        /**
         * The returned UnprocessedDataBucket instance.
         * @param unprocessedDataBucket the value to set
         * @return this builder
         */
        public Builder unprocessedDataBucket(
                com.oracle.bmc.loganalytics.model.UnprocessedDataBucket unprocessedDataBucket) {
            this.unprocessedDataBucket = unprocessedDataBucket;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetUnprocessedDataBucketResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            unprocessedDataBucket(o.getUnprocessedDataBucket());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetUnprocessedDataBucketResponse build() {
            return new GetUnprocessedDataBucketResponse(
                    __httpStatusCode__, headers, opcRequestId, unprocessedDataBucket);
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
        sb.append(",unprocessedDataBucket=").append(String.valueOf(unprocessedDataBucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetUnprocessedDataBucketResponse)) {
            return false;
        }

        GetUnprocessedDataBucketResponse other = (GetUnprocessedDataBucketResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.unprocessedDataBucket, other.unprocessedDataBucket);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.unprocessedDataBucket == null
                                ? 43
                                : this.unprocessedDataBucket.hashCode());
        return result;
    }
}
