/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.responses;

import com.oracle.bmc.stackmonitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class AssociateMonitoredResourcesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned MonitoredResourceAssociation instance.
     */
    private com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation
            monitoredResourceAssociation;

    /**
     * The returned MonitoredResourceAssociation instance.
     * @return the value
     */
    public com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation
            getMonitoredResourceAssociation() {
        return monitoredResourceAssociation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "monitoredResourceAssociation"
    })
    private AssociateMonitoredResourcesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation
                    monitoredResourceAssociation) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.monitoredResourceAssociation = monitoredResourceAssociation;
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
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned MonitoredResourceAssociation instance.
         */
        private com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation
                monitoredResourceAssociation;

        /**
         * The returned MonitoredResourceAssociation instance.
         * @param monitoredResourceAssociation the value to set
         * @return this builder
         */
        public Builder monitoredResourceAssociation(
                com.oracle.bmc.stackmonitoring.model.MonitoredResourceAssociation
                        monitoredResourceAssociation) {
            this.monitoredResourceAssociation = monitoredResourceAssociation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(AssociateMonitoredResourcesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            monitoredResourceAssociation(o.getMonitoredResourceAssociation());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public AssociateMonitoredResourcesResponse build() {
            return new AssociateMonitoredResourcesResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, monitoredResourceAssociation);
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
        sb.append(",monitoredResourceAssociation=")
                .append(String.valueOf(monitoredResourceAssociation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociateMonitoredResourcesResponse)) {
            return false;
        }

        AssociateMonitoredResourcesResponse other = (AssociateMonitoredResourcesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.monitoredResourceAssociation, other.monitoredResourceAssociation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.monitoredResourceAssociation == null
                                ? 43
                                : this.monitoredResourceAssociation.hashCode());
        return result;
    }
}
