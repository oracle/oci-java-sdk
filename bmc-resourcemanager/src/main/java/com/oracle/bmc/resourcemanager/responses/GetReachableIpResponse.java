/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class GetReachableIpResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ReachableIp instance.
     */
    private com.oracle.bmc.resourcemanager.model.ReachableIp reachableIp;

    /**
     * The returned ReachableIp instance.
     * @return the value
     */
    public com.oracle.bmc.resourcemanager.model.ReachableIp getReachableIp() {
        return reachableIp;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "reachableIp"
    })
    private GetReachableIpResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.resourcemanager.model.ReachableIp reachableIp) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.reachableIp = reachableIp;
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
         * Unique identifier for the request.
         */
        private String opcRequestId;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned ReachableIp instance.
         */
        private com.oracle.bmc.resourcemanager.model.ReachableIp reachableIp;

        /**
         * The returned ReachableIp instance.
         * @param reachableIp the value to set
         * @return this builder
         */
        public Builder reachableIp(com.oracle.bmc.resourcemanager.model.ReachableIp reachableIp) {
            this.reachableIp = reachableIp;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetReachableIpResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            reachableIp(o.getReachableIp());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetReachableIpResponse build() {
            return new GetReachableIpResponse(
                    __httpStatusCode__, headers, opcRequestId, reachableIp);
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
        sb.append(",reachableIp=").append(String.valueOf(reachableIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetReachableIpResponse)) {
            return false;
        }

        GetReachableIpResponse other = (GetReachableIpResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.reachableIp, other.reachableIp);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.reachableIp == null ? 43 : this.reachableIp.hashCode());
        return result;
    }
}
