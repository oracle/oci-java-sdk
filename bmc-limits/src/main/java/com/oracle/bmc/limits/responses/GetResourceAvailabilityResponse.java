/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.responses;

import com.oracle.bmc.limits.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class GetResourceAvailabilityResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ResourceAvailability instance.
     */
    private com.oracle.bmc.limits.model.ResourceAvailability resourceAvailability;

    /**
     * The returned ResourceAvailability instance.
     * @return the value
     */
    public com.oracle.bmc.limits.model.ResourceAvailability getResourceAvailability() {
        return resourceAvailability;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "resourceAvailability"
    })
    private GetResourceAvailabilityResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.limits.model.ResourceAvailability resourceAvailability) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.resourceAvailability = resourceAvailability;
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
         * The returned ResourceAvailability instance.
         */
        private com.oracle.bmc.limits.model.ResourceAvailability resourceAvailability;

        /**
         * The returned ResourceAvailability instance.
         * @param resourceAvailability the value to set
         * @return this builder
         */
        public Builder resourceAvailability(
                com.oracle.bmc.limits.model.ResourceAvailability resourceAvailability) {
            this.resourceAvailability = resourceAvailability;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetResourceAvailabilityResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            resourceAvailability(o.getResourceAvailability());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetResourceAvailabilityResponse build() {
            return new GetResourceAvailabilityResponse(
                    __httpStatusCode__, headers, opcRequestId, resourceAvailability);
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
        sb.append(",resourceAvailability=").append(String.valueOf(resourceAvailability));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceAvailabilityResponse)) {
            return false;
        }

        GetResourceAvailabilityResponse other = (GetResourceAvailabilityResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.resourceAvailability, other.resourceAvailability);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAvailability == null
                                ? 43
                                : this.resourceAvailability.hashCode());
        return result;
    }
}
