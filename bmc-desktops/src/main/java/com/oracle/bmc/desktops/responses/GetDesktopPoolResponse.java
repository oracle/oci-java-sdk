/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class GetDesktopPoolResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The unique identifier of the request.
     */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency. See if-match.
     */
    private String etag;

    /**
     * For optimistic concurrency. See if-match.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned DesktopPool instance.
     */
    private com.oracle.bmc.desktops.model.DesktopPool desktopPool;

    /**
     * The returned DesktopPool instance.
     * @return the value
     */
    public com.oracle.bmc.desktops.model.DesktopPool getDesktopPool() {
        return desktopPool;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "desktopPool"
    })
    private GetDesktopPoolResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.desktops.model.DesktopPool desktopPool) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.desktopPool = desktopPool;
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
         * The unique identifier of the request.
         */
        private String opcRequestId;

        /**
         * The unique identifier of the request.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency. See if-match.
         */
        private String etag;

        /**
         * For optimistic concurrency. See if-match.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned DesktopPool instance.
         */
        private com.oracle.bmc.desktops.model.DesktopPool desktopPool;

        /**
         * The returned DesktopPool instance.
         * @param desktopPool the value to set
         * @return this builder
         */
        public Builder desktopPool(com.oracle.bmc.desktops.model.DesktopPool desktopPool) {
            this.desktopPool = desktopPool;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetDesktopPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            desktopPool(o.getDesktopPool());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetDesktopPoolResponse build() {
            return new GetDesktopPoolResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, desktopPool);
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
        sb.append(",desktopPool=").append(String.valueOf(desktopPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDesktopPoolResponse)) {
            return false;
        }

        GetDesktopPoolResponse other = (GetDesktopPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.desktopPool, other.desktopPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.desktopPool == null ? 43 : this.desktopPool.hashCode());
        return result;
    }
}
