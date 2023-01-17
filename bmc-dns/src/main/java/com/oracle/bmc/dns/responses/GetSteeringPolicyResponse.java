/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetSteeringPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
     */
    private String eTag;

    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /** The returned SteeringPolicy instance, or null if {@link #isNotModified()} is true. */
    private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

    /**
     * The returned SteeringPolicy instance, or null if {@link #isNotModified()} is true.
     *
     * @return the value
     */
    public com.oracle.bmc.dns.model.SteeringPolicy getSteeringPolicy() {
        return steeringPolicy;
    }

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     *
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eTag",
        "steeringPolicy",
        "isNotModified"
    })
    private GetSteeringPolicyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy,
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.steeringPolicy = steeringPolicy;
        this.isNotModified = isNotModified;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetSteeringPolicyResponse> {
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

        /**
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
         */
        private String eTag;

        /**
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /** The returned SteeringPolicy instance, or null if {@link #isNotModified()} is true. */
        private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

        /**
         * The returned SteeringPolicy instance, or null if {@link #isNotModified()} is true.
         *
         * @param steeringPolicy the value to set
         * @return this builder
         */
        public Builder steeringPolicy(com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         *
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetSteeringPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            steeringPolicy(o.getSteeringPolicy());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetSteeringPolicyResponse build() {
            return new GetSteeringPolicyResponse(
                    __httpStatusCode__, headers, opcRequestId, eTag, steeringPolicy, isNotModified);
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
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",steeringPolicy=").append(String.valueOf(steeringPolicy));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSteeringPolicyResponse)) {
            return false;
        }

        GetSteeringPolicyResponse other = (GetSteeringPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.steeringPolicy, other.steeringPolicy)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.steeringPolicy == null ? 43 : this.steeringPolicy.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
