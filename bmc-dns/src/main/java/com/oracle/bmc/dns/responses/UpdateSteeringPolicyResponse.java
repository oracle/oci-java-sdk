/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateSteeringPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request.
     * You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request.
     * You can use this to query status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /**
     * The returned SteeringPolicy instance.
     */
    private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

    /**
     * The returned SteeringPolicy instance.
     * @return the value
     */
    public com.oracle.bmc.dns.model.SteeringPolicy getSteeringPolicy() {
        return steeringPolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcWorkRequestId",
        "eTag",
        "steeringPolicy"
    })
    private UpdateSteeringPolicyResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcWorkRequestId,
            String eTag,
            com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.eTag = eTag;
        this.steeringPolicy = steeringPolicy;
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
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the asynchronous request.
         * You can use this to query status of the asynchronous operation.
         *
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request.
         * You can use this to query status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * The current version of the resource, ending with a
         * representation-specific suffix. This value may be used in If-Match
         * and If-None-Match headers for later requests of the same resource.
         *
         */
        private String eTag;

        /**
         * The current version of the resource, ending with a
         * representation-specific suffix. This value may be used in If-Match
         * and If-None-Match headers for later requests of the same resource.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The returned SteeringPolicy instance.
         */
        private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

        /**
         * The returned SteeringPolicy instance.
         * @param steeringPolicy the value to set
         * @return this builder
         */
        public Builder steeringPolicy(com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSteeringPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            eTag(o.getETag());
            steeringPolicy(o.getSteeringPolicy());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateSteeringPolicyResponse build() {
            return new UpdateSteeringPolicyResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcWorkRequestId,
                    eTag,
                    steeringPolicy);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",steeringPolicy=").append(String.valueOf(steeringPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSteeringPolicyResponse)) {
            return false;
        }

        UpdateSteeringPolicyResponse other = (UpdateSteeringPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.steeringPolicy, other.steeringPolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.steeringPolicy == null ? 43 : this.steeringPolicy.hashCode());
        return result;
    }
}
