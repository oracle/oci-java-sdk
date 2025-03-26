/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.responses;

import com.oracle.bmc.jms.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class GetFleetAgentConfigurationResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Oracle about a particular request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned FleetAgentConfiguration instance.
     */
    private com.oracle.bmc.jms.model.FleetAgentConfiguration fleetAgentConfiguration;

    /**
     * The returned FleetAgentConfiguration instance.
     * @return the value
     */
    public com.oracle.bmc.jms.model.FleetAgentConfiguration getFleetAgentConfiguration() {
        return fleetAgentConfiguration;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "fleetAgentConfiguration"
    })
    private GetFleetAgentConfigurationResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.jms.model.FleetAgentConfiguration fleetAgentConfiguration) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.fleetAgentConfiguration = fleetAgentConfiguration;
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
         * Oracle about a particular request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned FleetAgentConfiguration instance.
         */
        private com.oracle.bmc.jms.model.FleetAgentConfiguration fleetAgentConfiguration;

        /**
         * The returned FleetAgentConfiguration instance.
         * @param fleetAgentConfiguration the value to set
         * @return this builder
         */
        public Builder fleetAgentConfiguration(
                com.oracle.bmc.jms.model.FleetAgentConfiguration fleetAgentConfiguration) {
            this.fleetAgentConfiguration = fleetAgentConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetFleetAgentConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            fleetAgentConfiguration(o.getFleetAgentConfiguration());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetFleetAgentConfigurationResponse build() {
            return new GetFleetAgentConfigurationResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, fleetAgentConfiguration);
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
        sb.append(",fleetAgentConfiguration=").append(String.valueOf(fleetAgentConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFleetAgentConfigurationResponse)) {
            return false;
        }

        GetFleetAgentConfigurationResponse other = (GetFleetAgentConfigurationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.fleetAgentConfiguration, other.fleetAgentConfiguration);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetAgentConfiguration == null
                                ? 43
                                : this.fleetAgentConfiguration.hashCode());
        return result;
    }
}
