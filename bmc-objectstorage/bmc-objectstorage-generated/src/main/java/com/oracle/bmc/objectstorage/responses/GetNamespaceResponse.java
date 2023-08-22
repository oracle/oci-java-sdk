/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetNamespaceResponse extends com.oracle.bmc.responses.BmcResponse {
    /** The returned {@code String} instance. */
    private String value;

    /**
     * The returned {@code String} instance.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "value"})
    private GetNamespaceResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String value) {
        super(__httpStatusCode__, headers);
        this.value = value;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetNamespaceResponse> {
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

        /** The returned {@code String} instance. */
        private String value;

        /**
         * The returned {@code String} instance.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetNamespaceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());

            value(o.getValue());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetNamespaceResponse build() {
            return new GetNamespaceResponse(__httpStatusCode__, headers, value);
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
        sb.append(",value=").append(String.valueOf(value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNamespaceResponse)) {
            return false;
        }

        GetNamespaceResponse other = (GetNamespaceResponse) o;
        return super.equals(o) && java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
