/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetTaggingWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The number of seconds that the client should wait before polling again.
     *
     */
    private Float retryAfter;

    /**
     * The number of seconds that the client should wait before polling again.
     *
     * @return the value
     */
    public Float getRetryAfter() {
        return retryAfter;
    }

    /**
     * The returned TaggingWorkRequest instance.
     */
    private com.oracle.bmc.identity.model.TaggingWorkRequest taggingWorkRequest;

    /**
     * The returned TaggingWorkRequest instance.
     * @return the value
     */
    public com.oracle.bmc.identity.model.TaggingWorkRequest getTaggingWorkRequest() {
        return taggingWorkRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "retryAfter",
        "taggingWorkRequest"
    })
    private GetTaggingWorkRequestResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            Float retryAfter,
            com.oracle.bmc.identity.model.TaggingWorkRequest taggingWorkRequest) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.taggingWorkRequest = taggingWorkRequest;
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
         * The number of seconds that the client should wait before polling again.
         *
         */
        private Float retryAfter;

        /**
         * The number of seconds that the client should wait before polling again.
         *
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Float retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /**
         * The returned TaggingWorkRequest instance.
         */
        private com.oracle.bmc.identity.model.TaggingWorkRequest taggingWorkRequest;

        /**
         * The returned TaggingWorkRequest instance.
         * @param taggingWorkRequest the value to set
         * @return this builder
         */
        public Builder taggingWorkRequest(
                com.oracle.bmc.identity.model.TaggingWorkRequest taggingWorkRequest) {
            this.taggingWorkRequest = taggingWorkRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTaggingWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            taggingWorkRequest(o.getTaggingWorkRequest());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetTaggingWorkRequestResponse build() {
            return new GetTaggingWorkRequestResponse(
                    __httpStatusCode__, headers, opcRequestId, retryAfter, taggingWorkRequest);
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
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",taggingWorkRequest=").append(String.valueOf(taggingWorkRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTaggingWorkRequestResponse)) {
            return false;
        }

        GetTaggingWorkRequestResponse other = (GetTaggingWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.taggingWorkRequest, other.taggingWorkRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.taggingWorkRequest == null
                                ? 43
                                : this.taggingWorkRequest.hashCode());
        return result;
    }
}
