/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetQueryWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     */
    private Float retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     * @return the value
     */
    public Float getRetryAfter() {
        return retryAfter;
    }

    /**
     * The returned QueryWorkRequest instance.
     */
    private com.oracle.bmc.loganalytics.model.QueryWorkRequest queryWorkRequest;

    /**
     * The returned QueryWorkRequest instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.QueryWorkRequest getQueryWorkRequest() {
        return queryWorkRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "retryAfter",
        "queryWorkRequest"
    })
    private GetQueryWorkRequestResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            Float retryAfter,
            com.oracle.bmc.loganalytics.model.QueryWorkRequest queryWorkRequest) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.retryAfter = retryAfter;
        this.queryWorkRequest = queryWorkRequest;
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
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         */
        private Float retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Float retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /**
         * The returned QueryWorkRequest instance.
         */
        private com.oracle.bmc.loganalytics.model.QueryWorkRequest queryWorkRequest;

        /**
         * The returned QueryWorkRequest instance.
         * @param queryWorkRequest the value to set
         * @return this builder
         */
        public Builder queryWorkRequest(
                com.oracle.bmc.loganalytics.model.QueryWorkRequest queryWorkRequest) {
            this.queryWorkRequest = queryWorkRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetQueryWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            retryAfter(o.getRetryAfter());
            queryWorkRequest(o.getQueryWorkRequest());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetQueryWorkRequestResponse build() {
            return new GetQueryWorkRequestResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, retryAfter, queryWorkRequest);
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
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",queryWorkRequest=").append(String.valueOf(queryWorkRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetQueryWorkRequestResponse)) {
            return false;
        }

        GetQueryWorkRequestResponse other = (GetQueryWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.queryWorkRequest, other.queryWorkRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.queryWorkRequest == null ? 43 : this.queryWorkRequest.hashCode());
        return result;
    }
}
