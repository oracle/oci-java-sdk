/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.responses;

import com.oracle.bmc.streaming.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetMessagesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The cursor to use to get the next batch of messages.
     */
    private String opcNextCursor;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.streaming.model.Message instances.
     */
    private java.util.List<com.oracle.bmc.streaming.model.Message> items;

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
}
