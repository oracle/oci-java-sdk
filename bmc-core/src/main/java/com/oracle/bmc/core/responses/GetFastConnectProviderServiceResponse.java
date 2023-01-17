/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetFastConnectProviderServiceResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned FastConnectProviderService instance.
     */
    private com.oracle.bmc.core.model.FastConnectProviderService fastConnectProviderService;

    /**
     * The returned FastConnectProviderService instance.
     * @return the value
     */
    public com.oracle.bmc.core.model.FastConnectProviderService getFastConnectProviderService() {
        return fastConnectProviderService;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "fastConnectProviderService"
    })
    private GetFastConnectProviderServiceResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.core.model.FastConnectProviderService fastConnectProviderService) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.fastConnectProviderService = fastConnectProviderService;
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
         * The returned FastConnectProviderService instance.
         */
        private com.oracle.bmc.core.model.FastConnectProviderService fastConnectProviderService;

        /**
         * The returned FastConnectProviderService instance.
         * @param fastConnectProviderService the value to set
         * @return this builder
         */
        public Builder fastConnectProviderService(
                com.oracle.bmc.core.model.FastConnectProviderService fastConnectProviderService) {
            this.fastConnectProviderService = fastConnectProviderService;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetFastConnectProviderServiceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            fastConnectProviderService(o.getFastConnectProviderService());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetFastConnectProviderServiceResponse build() {
            return new GetFastConnectProviderServiceResponse(
                    __httpStatusCode__, headers, opcRequestId, fastConnectProviderService);
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
        sb.append(",fastConnectProviderService=")
                .append(String.valueOf(fastConnectProviderService));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFastConnectProviderServiceResponse)) {
            return false;
        }

        GetFastConnectProviderServiceResponse other = (GetFastConnectProviderServiceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.fastConnectProviderService, other.fastConnectProviderService);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.fastConnectProviderService == null
                                ? 43
                                : this.fastConnectProviderService.hashCode());
        return result;
    }
}
