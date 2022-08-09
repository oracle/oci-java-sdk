/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class UpdatePingMonitorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * An entity tag that uniquely identifies a version of the resource.
     */
    private String etag;

    /**
     * An entity tag that uniquely identifies a version of the resource.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned PingMonitor instance.
     */
    private com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor;

    /**
     * The returned PingMonitor instance.
     * @return the value
     */
    public com.oracle.bmc.healthchecks.model.PingMonitor getPingMonitor() {
        return pingMonitor;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "pingMonitor"
    })
    private UpdatePingMonitorResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.pingMonitor = pingMonitor;
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
         * contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * An entity tag that uniquely identifies a version of the resource.
         */
        private String etag;

        /**
         * An entity tag that uniquely identifies a version of the resource.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned PingMonitor instance.
         */
        private com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor;

        /**
         * The returned PingMonitor instance.
         * @param pingMonitor the value to set
         * @return this builder
         */
        public Builder pingMonitor(com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor) {
            this.pingMonitor = pingMonitor;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdatePingMonitorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            pingMonitor(o.getPingMonitor());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdatePingMonitorResponse build() {
            return new UpdatePingMonitorResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, pingMonitor);
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
        sb.append(",pingMonitor=").append(String.valueOf(pingMonitor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePingMonitorResponse)) {
            return false;
        }

        UpdatePingMonitorResponse other = (UpdatePingMonitorResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.pingMonitor, other.pingMonitor);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.pingMonitor == null ? 43 : this.pingMonitor.hashCode());
        return result;
    }
}
