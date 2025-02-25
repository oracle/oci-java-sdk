/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPrivateEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The entity tag (ETag) for the Private Endpoint.
     */
    private String eTag;

    /**
     * The entity tag (ETag) for the Private Endpoint.
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /**
     * The returned PrivateEndpoint instance, or null if {@link #isNotModified()} is true.
     */
    private com.oracle.bmc.objectstorage.model.PrivateEndpoint privateEndpoint;

    /**
     * The returned PrivateEndpoint instance, or null if {@link #isNotModified()} is true.
     * @return the value
     */
    public com.oracle.bmc.objectstorage.model.PrivateEndpoint getPrivateEndpoint() {
        return privateEndpoint;
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
        "headers",
        "opcClientRequestId",
        "opcRequestId",
        "eTag",
        "privateEndpoint",
        "isNotModified"
    })
    private GetPrivateEndpointResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcClientRequestId,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.objectstorage.model.PrivateEndpoint privateEndpoint,
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.privateEndpoint = privateEndpoint;
        this.isNotModified = isNotModified;
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
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The entity tag (ETag) for the Private Endpoint.
         */
        private String eTag;

        /**
         * The entity tag (ETag) for the Private Endpoint.
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The returned PrivateEndpoint instance, or null if {@link #isNotModified()} is true.
         */
        private com.oracle.bmc.objectstorage.model.PrivateEndpoint privateEndpoint;

        /**
         * The returned PrivateEndpoint instance, or null if {@link #isNotModified()} is true.
         * @param privateEndpoint the value to set
         * @return this builder
         */
        public Builder privateEndpoint(
                com.oracle.bmc.objectstorage.model.PrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
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
        public Builder copy(GetPrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            privateEndpoint(o.getPrivateEndpoint());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetPrivateEndpointResponse build() {
            return new GetPrivateEndpointResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    eTag,
                    privateEndpoint,
                    isNotModified);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",privateEndpoint=").append(String.valueOf(privateEndpoint));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPrivateEndpointResponse)) {
            return false;
        }

        GetPrivateEndpointResponse other = (GetPrivateEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
