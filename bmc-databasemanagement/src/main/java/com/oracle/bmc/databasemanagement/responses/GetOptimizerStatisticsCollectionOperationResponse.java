/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetOptimizerStatisticsCollectionOperationResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned OptimizerStatisticsCollectionOperation instance.
     */
    private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperation
            optimizerStatisticsCollectionOperation;

    /**
     * The returned OptimizerStatisticsCollectionOperation instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperation
            getOptimizerStatisticsCollectionOperation() {
        return optimizerStatisticsCollectionOperation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "optimizerStatisticsCollectionOperation"
    })
    private GetOptimizerStatisticsCollectionOperationResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperation
                    optimizerStatisticsCollectionOperation) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.optimizerStatisticsCollectionOperation = optimizerStatisticsCollectionOperation;
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
         * The returned OptimizerStatisticsCollectionOperation instance.
         */
        private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperation
                optimizerStatisticsCollectionOperation;

        /**
         * The returned OptimizerStatisticsCollectionOperation instance.
         * @param optimizerStatisticsCollectionOperation the value to set
         * @return this builder
         */
        public Builder optimizerStatisticsCollectionOperation(
                com.oracle.bmc.databasemanagement.model.OptimizerStatisticsCollectionOperation
                        optimizerStatisticsCollectionOperation) {
            this.optimizerStatisticsCollectionOperation = optimizerStatisticsCollectionOperation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetOptimizerStatisticsCollectionOperationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            optimizerStatisticsCollectionOperation(o.getOptimizerStatisticsCollectionOperation());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetOptimizerStatisticsCollectionOperationResponse build() {
            return new GetOptimizerStatisticsCollectionOperationResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    optimizerStatisticsCollectionOperation);
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
        sb.append(",optimizerStatisticsCollectionOperation=")
                .append(String.valueOf(optimizerStatisticsCollectionOperation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOptimizerStatisticsCollectionOperationResponse)) {
            return false;
        }

        GetOptimizerStatisticsCollectionOperationResponse other =
                (GetOptimizerStatisticsCollectionOperationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.optimizerStatisticsCollectionOperation,
                        other.optimizerStatisticsCollectionOperation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.optimizerStatisticsCollectionOperation == null
                                ? 43
                                : this.optimizerStatisticsCollectionOperation.hashCode());
        return result;
    }
}
