/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class GetWindowsUpdateResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned WindowsUpdate instance.
     */
    private com.oracle.bmc.osmanagement.model.WindowsUpdate windowsUpdate;

    /**
     * The returned WindowsUpdate instance.
     * @return the value
     */
    public com.oracle.bmc.osmanagement.model.WindowsUpdate getWindowsUpdate() {
        return windowsUpdate;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "windowsUpdate"
    })
    private GetWindowsUpdateResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.osmanagement.model.WindowsUpdate windowsUpdate) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.windowsUpdate = windowsUpdate;
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
         * The returned WindowsUpdate instance.
         */
        private com.oracle.bmc.osmanagement.model.WindowsUpdate windowsUpdate;

        /**
         * The returned WindowsUpdate instance.
         * @param windowsUpdate the value to set
         * @return this builder
         */
        public Builder windowsUpdate(
                com.oracle.bmc.osmanagement.model.WindowsUpdate windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetWindowsUpdateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            windowsUpdate(o.getWindowsUpdate());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetWindowsUpdateResponse build() {
            return new GetWindowsUpdateResponse(
                    __httpStatusCode__, headers, opcRequestId, windowsUpdate);
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
        sb.append(",windowsUpdate=").append(String.valueOf(windowsUpdate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetWindowsUpdateResponse)) {
            return false;
        }

        GetWindowsUpdateResponse other = (GetWindowsUpdateResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.windowsUpdate, other.windowsUpdate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsUpdate == null ? 43 : this.windowsUpdate.hashCode());
        return result;
    }
}
