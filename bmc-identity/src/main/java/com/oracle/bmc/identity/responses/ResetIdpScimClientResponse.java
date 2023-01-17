/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ResetIdpScimClientResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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

    /** The returned ScimClientCredentials instance. */
    private com.oracle.bmc.identity.model.ScimClientCredentials scimClientCredentials;

    /**
     * The returned ScimClientCredentials instance.
     *
     * @return the value
     */
    public com.oracle.bmc.identity.model.ScimClientCredentials getScimClientCredentials() {
        return scimClientCredentials;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "scimClientCredentials"
    })
    private ResetIdpScimClientResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.identity.model.ScimClientCredentials scimClientCredentials) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.scimClientCredentials = scimClientCredentials;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ResetIdpScimClientResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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

        /** The returned ScimClientCredentials instance. */
        private com.oracle.bmc.identity.model.ScimClientCredentials scimClientCredentials;

        /**
         * The returned ScimClientCredentials instance.
         *
         * @param scimClientCredentials the value to set
         * @return this builder
         */
        public Builder scimClientCredentials(
                com.oracle.bmc.identity.model.ScimClientCredentials scimClientCredentials) {
            this.scimClientCredentials = scimClientCredentials;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ResetIdpScimClientResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            scimClientCredentials(o.getScimClientCredentials());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ResetIdpScimClientResponse build() {
            return new ResetIdpScimClientResponse(
                    __httpStatusCode__, headers, opcRequestId, scimClientCredentials);
        }
    }

    /**
     * Return a new builder for this response object.
     *
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
        sb.append(",scimClientCredentials=").append(String.valueOf(scimClientCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResetIdpScimClientResponse)) {
            return false;
        }

        ResetIdpScimClientResponse other = (ResetIdpScimClientResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.scimClientCredentials, other.scimClientCredentials);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.scimClientCredentials == null
                                ? 43
                                : this.scimClientCredentials.hashCode());
        return result;
    }
}
