/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class ListTransferPackagesResponse extends com.oracle.bmc.responses.BmcResponse {
    /** */
    private String opcRequestId;

    /** @return the value */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code MultipleTransferPackages} instance. */
    private com.oracle.bmc.dts.model.MultipleTransferPackages multipleTransferPackages;

    /**
     * The returned {@code MultipleTransferPackages} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dts.model.MultipleTransferPackages getMultipleTransferPackages() {
        return multipleTransferPackages;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "multipleTransferPackages"
    })
    private ListTransferPackagesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.dts.model.MultipleTransferPackages multipleTransferPackages) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.multipleTransferPackages = multipleTransferPackages;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListTransferPackagesResponse> {
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

        /** */
        private String opcRequestId;

        /**
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code MultipleTransferPackages} instance. */
        private com.oracle.bmc.dts.model.MultipleTransferPackages multipleTransferPackages;

        /**
         * The returned {@code MultipleTransferPackages} instance.
         *
         * @param multipleTransferPackages the value to set
         * @return this builder
         */
        public Builder multipleTransferPackages(
                com.oracle.bmc.dts.model.MultipleTransferPackages multipleTransferPackages) {
            this.multipleTransferPackages = multipleTransferPackages;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListTransferPackagesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            multipleTransferPackages(o.getMultipleTransferPackages());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListTransferPackagesResponse build() {
            return new ListTransferPackagesResponse(
                    __httpStatusCode__, headers, opcRequestId, multipleTransferPackages);
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
        sb.append(",multipleTransferPackages=").append(String.valueOf(multipleTransferPackages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTransferPackagesResponse)) {
            return false;
        }

        ListTransferPackagesResponse other = (ListTransferPackagesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.multipleTransferPackages, other.multipleTransferPackages);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.multipleTransferPackages == null
                                ? 43
                                : this.multipleTransferPackages.hashCode());
        return result;
    }
}
