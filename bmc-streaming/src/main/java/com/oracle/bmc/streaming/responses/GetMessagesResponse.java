/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.responses;

import com.oracle.bmc.streaming.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class GetMessagesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The cursor to use to get the next batch of messages.
     */
    private String opcNextCursor;

    public String getOpcNextCursor() {
        return opcNextCursor;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * A list of com.oracle.bmc.streaming.model.Message instances.
     */
    private java.util.List<com.oracle.bmc.streaming.model.Message> items;

    public java.util.List<com.oracle.bmc.streaming.model.Message> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextCursor",
        "opcRequestId",
        "items"
    })
    private GetMessagesResponse(
            int __httpStatusCode__,
            String opcNextCursor,
            String opcRequestId,
            java.util.List<com.oracle.bmc.streaming.model.Message> items) {
        super(__httpStatusCode__);
        this.opcNextCursor = opcNextCursor;
        this.opcRequestId = opcRequestId;
        this.items = items;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcNextCursor;

        public Builder opcNextCursor(String opcNextCursor) {
            this.opcNextCursor = opcNextCursor;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private java.util.List<com.oracle.bmc.streaming.model.Message> items;

        public Builder items(java.util.List<com.oracle.bmc.streaming.model.Message> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetMessagesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextCursor(o.getOpcNextCursor());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public GetMessagesResponse build() {
            return new GetMessagesResponse(__httpStatusCode__, opcNextCursor, opcRequestId, items);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcNextCursor=").append(String.valueOf(opcNextCursor));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMessagesResponse)) {
            return false;
        }

        GetMessagesResponse other = (GetMessagesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextCursor, other.opcNextCursor)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcNextCursor == null ? 43 : this.opcNextCursor.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
