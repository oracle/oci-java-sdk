/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetResolverEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String etag;

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
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
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ResolverEndpoint instance, or null if {@link #isNotModified()} is true.
     */
    private com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint;

    /**
     * The returned ResolverEndpoint instance, or null if {@link #isNotModified()} is true.
     * @return the value
     */
    public com.oracle.bmc.dns.model.ResolverEndpoint getResolverEndpoint() {
        return resolverEndpoint;
    }

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "resolverEndpoint",
        "isNotModified"
    })
    private GetResolverEndpointResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint,
            boolean isNotModified) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.resolverEndpoint = resolverEndpoint;
        this.isNotModified = isNotModified;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * The current version of the resource, ending with a
         * representation-specific suffix. This value may be used in If-Match
         * and If-None-Match headers for later requests of the same resource.
         *
         */
        private String etag;

        /**
         * The current version of the resource, ending with a
         * representation-specific suffix. This value may be used in If-Match
         * and If-None-Match headers for later requests of the same resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
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
         * The returned ResolverEndpoint instance, or null if {@link #isNotModified()} is true.
         */
        private com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint;

        /**
         * The returned ResolverEndpoint instance, or null if {@link #isNotModified()} is true.
         * @param resolverEndpoint the value to set
         * @return this builder
         */
        public Builder resolverEndpoint(
                com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint) {
            this.resolverEndpoint = resolverEndpoint;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetResolverEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            resolverEndpoint(o.getResolverEndpoint());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetResolverEndpointResponse build() {
            return new GetResolverEndpointResponse(
                    __httpStatusCode__, etag, opcRequestId, resolverEndpoint, isNotModified);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",resolverEndpoint=").append(String.valueOf(resolverEndpoint));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResolverEndpointResponse)) {
            return false;
        }

        GetResolverEndpointResponse other = (GetResolverEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.resolverEndpoint, other.resolverEndpoint)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.resolverEndpoint == null ? 43 : this.resolverEndpoint.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
