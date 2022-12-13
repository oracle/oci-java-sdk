/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.responses;

import com.oracle.bmc.queue.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class PutMessagesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned PutMessages instance.
     */
    private com.oracle.bmc.queue.model.PutMessages putMessages;

    /**
     * The returned PutMessages instance.
     * @return the value
     */
    public com.oracle.bmc.queue.model.PutMessages getPutMessages() {
        return putMessages;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "putMessages"
    })
    private PutMessagesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.queue.model.PutMessages putMessages) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.putMessages = putMessages;
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
         * The returned PutMessages instance.
         */
        private com.oracle.bmc.queue.model.PutMessages putMessages;

        /**
         * The returned PutMessages instance.
         * @param putMessages the value to set
         * @return this builder
         */
        public Builder putMessages(com.oracle.bmc.queue.model.PutMessages putMessages) {
            this.putMessages = putMessages;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PutMessagesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            putMessages(o.getPutMessages());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public PutMessagesResponse build() {
            return new PutMessagesResponse(__httpStatusCode__, headers, opcRequestId, putMessages);
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
        sb.append(",putMessages=").append(String.valueOf(putMessages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMessagesResponse)) {
            return false;
        }

        PutMessagesResponse other = (PutMessagesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.putMessages, other.putMessages);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.putMessages == null ? 43 : this.putMessages.hashCode());
        return result;
    }
}
