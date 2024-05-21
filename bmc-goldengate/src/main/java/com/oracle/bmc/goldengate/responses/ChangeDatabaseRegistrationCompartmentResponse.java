/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ChangeDatabaseRegistrationCompartmentResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
     * status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
     * status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Deprecation date of this API version.
     *
     */
    private String sunset;

    /**
     * Deprecation date of this API version.
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "opcRequestId",
        "sunset"
    })
    private ChangeDatabaseRegistrationCompartmentResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String sunset) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.sunset = sunset;
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
         * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
         * status of the asynchronous operation.
         *
         */
        private String opcWorkRequestId;

        /**
         * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
         * status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Deprecation date of this API version.
         *
         */
        private String sunset;

        /**
         * Deprecation date of this API version.
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ChangeDatabaseRegistrationCompartmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            sunset(o.getSunset());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ChangeDatabaseRegistrationCompartmentResponse build() {
            return new ChangeDatabaseRegistrationCompartmentResponse(
                    __httpStatusCode__, headers, opcWorkRequestId, opcRequestId, sunset);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDatabaseRegistrationCompartmentResponse)) {
            return false;
        }

        ChangeDatabaseRegistrationCompartmentResponse other =
                (ChangeDatabaseRegistrationCompartmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sunset, other.sunset);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        return result;
    }
}
