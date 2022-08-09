/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.responses;

import com.oracle.bmc.containerengine.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class GetNodePoolOptionsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned NodePoolOptions instance.
     */
    private com.oracle.bmc.containerengine.model.NodePoolOptions nodePoolOptions;

    /**
     * The returned NodePoolOptions instance.
     * @return the value
     */
    public com.oracle.bmc.containerengine.model.NodePoolOptions getNodePoolOptions() {
        return nodePoolOptions;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "nodePoolOptions"
    })
    private GetNodePoolOptionsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.containerengine.model.NodePoolOptions nodePoolOptions) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.nodePoolOptions = nodePoolOptions;
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
         * The returned NodePoolOptions instance.
         */
        private com.oracle.bmc.containerengine.model.NodePoolOptions nodePoolOptions;

        /**
         * The returned NodePoolOptions instance.
         * @param nodePoolOptions the value to set
         * @return this builder
         */
        public Builder nodePoolOptions(
                com.oracle.bmc.containerengine.model.NodePoolOptions nodePoolOptions) {
            this.nodePoolOptions = nodePoolOptions;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetNodePoolOptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            nodePoolOptions(o.getNodePoolOptions());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetNodePoolOptionsResponse build() {
            return new GetNodePoolOptionsResponse(
                    __httpStatusCode__, headers, opcRequestId, nodePoolOptions);
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
        sb.append(",nodePoolOptions=").append(String.valueOf(nodePoolOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNodePoolOptionsResponse)) {
            return false;
        }

        GetNodePoolOptionsResponse other = (GetNodePoolOptionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.nodePoolOptions, other.nodePoolOptions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.nodePoolOptions == null ? 43 : this.nodePoolOptions.hashCode());
        return result;
    }
}
