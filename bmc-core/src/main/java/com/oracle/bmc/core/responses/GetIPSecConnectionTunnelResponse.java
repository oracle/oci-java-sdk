/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetIPSecConnectionTunnelResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned IPSecConnectionTunnel instance.
     */
    private com.oracle.bmc.core.model.IPSecConnectionTunnel iPSecConnectionTunnel;

    public com.oracle.bmc.core.model.IPSecConnectionTunnel getIPSecConnectionTunnel() {
        return iPSecConnectionTunnel;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "iPSecConnectionTunnel"
    })
    private GetIPSecConnectionTunnelResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.core.model.IPSecConnectionTunnel iPSecConnectionTunnel) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.iPSecConnectionTunnel = iPSecConnectionTunnel;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.core.model.IPSecConnectionTunnel iPSecConnectionTunnel;

        public Builder iPSecConnectionTunnel(
                com.oracle.bmc.core.model.IPSecConnectionTunnel iPSecConnectionTunnel) {
            this.iPSecConnectionTunnel = iPSecConnectionTunnel;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetIPSecConnectionTunnelResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            iPSecConnectionTunnel(o.getIPSecConnectionTunnel());

            return this;
        }

        public GetIPSecConnectionTunnelResponse build() {
            return new GetIPSecConnectionTunnelResponse(
                    __httpStatusCode__, etag, opcRequestId, iPSecConnectionTunnel);
        }
    }

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
        sb.append(",iPSecConnectionTunnel=").append(String.valueOf(iPSecConnectionTunnel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIPSecConnectionTunnelResponse)) {
            return false;
        }

        GetIPSecConnectionTunnelResponse other = (GetIPSecConnectionTunnelResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.iPSecConnectionTunnel, other.iPSecConnectionTunnel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.iPSecConnectionTunnel == null
                                ? 43
                                : this.iPSecConnectionTunnel.hashCode());
        return result;
    }
}
