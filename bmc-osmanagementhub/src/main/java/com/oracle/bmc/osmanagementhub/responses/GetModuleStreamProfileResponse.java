/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.responses;

import com.oracle.bmc.osmanagementhub.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetModuleStreamProfileResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ModuleStreamProfile instance.
     */
    private com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile moduleStreamProfile;

    /**
     * The returned ModuleStreamProfile instance.
     * @return the value
     */
    public com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile getModuleStreamProfile() {
        return moduleStreamProfile;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "moduleStreamProfile"
    })
    private GetModuleStreamProfileResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile moduleStreamProfile) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.moduleStreamProfile = moduleStreamProfile;
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
         * The returned ModuleStreamProfile instance.
         */
        private com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile moduleStreamProfile;

        /**
         * The returned ModuleStreamProfile instance.
         * @param moduleStreamProfile the value to set
         * @return this builder
         */
        public Builder moduleStreamProfile(
                com.oracle.bmc.osmanagementhub.model.ModuleStreamProfile moduleStreamProfile) {
            this.moduleStreamProfile = moduleStreamProfile;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetModuleStreamProfileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            moduleStreamProfile(o.getModuleStreamProfile());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetModuleStreamProfileResponse build() {
            return new GetModuleStreamProfileResponse(
                    __httpStatusCode__, headers, opcRequestId, moduleStreamProfile);
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
        sb.append(",moduleStreamProfile=").append(String.valueOf(moduleStreamProfile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetModuleStreamProfileResponse)) {
            return false;
        }

        GetModuleStreamProfileResponse other = (GetModuleStreamProfileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.moduleStreamProfile, other.moduleStreamProfile);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.moduleStreamProfile == null
                                ? 43
                                : this.moduleStreamProfile.hashCode());
        return result;
    }
}
