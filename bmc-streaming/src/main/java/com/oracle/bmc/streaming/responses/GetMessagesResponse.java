/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.responses;

import com.oracle.bmc.streaming.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetMessagesResponse {

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
     * A list of Message instances.
     */
    private java.util.List<Message> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetMessagesResponse o) {
            opcNextCursor(o.getOpcNextCursor());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }
    }
}
