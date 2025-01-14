/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.responses;

import com.oracle.bmc.queue.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class DeleteMessagesResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code DeleteMessagesResult} instance. */
    private com.oracle.bmc.queue.model.DeleteMessagesResult deleteMessagesResult;

    /**
     * The returned {@code DeleteMessagesResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.queue.model.DeleteMessagesResult getDeleteMessagesResult() {
        return deleteMessagesResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "deleteMessagesResult"
    })
    private DeleteMessagesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.queue.model.DeleteMessagesResult deleteMessagesResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.deleteMessagesResult = deleteMessagesResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<DeleteMessagesResponse> {
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

        /** The returned {@code DeleteMessagesResult} instance. */
        private com.oracle.bmc.queue.model.DeleteMessagesResult deleteMessagesResult;

        /**
         * The returned {@code DeleteMessagesResult} instance.
         *
         * @param deleteMessagesResult the value to set
         * @return this builder
         */
        public Builder deleteMessagesResult(
                com.oracle.bmc.queue.model.DeleteMessagesResult deleteMessagesResult) {
            this.deleteMessagesResult = deleteMessagesResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(DeleteMessagesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            deleteMessagesResult(o.getDeleteMessagesResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public DeleteMessagesResponse build() {
            return new DeleteMessagesResponse(
                    __httpStatusCode__, headers, opcRequestId, deleteMessagesResult);
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
        sb.append(",deleteMessagesResult=").append(String.valueOf(deleteMessagesResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteMessagesResponse)) {
            return false;
        }

        DeleteMessagesResponse other = (DeleteMessagesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.deleteMessagesResult, other.deleteMessagesResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteMessagesResult == null
                                ? 43
                                : this.deleteMessagesResult.hashCode());
        return result;
    }
}
