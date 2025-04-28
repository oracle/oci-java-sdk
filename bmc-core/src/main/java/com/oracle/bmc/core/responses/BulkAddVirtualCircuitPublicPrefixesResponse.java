/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BulkAddVirtualCircuitPublicPrefixesResponse
        extends com.oracle.bmc.responses.BmcResponse {

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers"})
    private BulkAddVirtualCircuitPublicPrefixesResponse(
            int __httpStatusCode__, java.util.Map<String, java.util.List<String>> headers) {
        super(__httpStatusCode__, headers);
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    BulkAddVirtualCircuitPublicPrefixesResponse> {
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
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(BulkAddVirtualCircuitPublicPrefixesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public BulkAddVirtualCircuitPublicPrefixesResponse build() {
            return new BulkAddVirtualCircuitPublicPrefixesResponse(__httpStatusCode__, headers);
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkAddVirtualCircuitPublicPrefixesResponse)) {
            return false;
        }

        BulkAddVirtualCircuitPublicPrefixesResponse other =
                (BulkAddVirtualCircuitPublicPrefixesResponse) o;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
