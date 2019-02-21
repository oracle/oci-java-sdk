/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.responses;

import com.oracle.bmc.streaming.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ConsumerCommitResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Cursor instance.
     */
    private Cursor cursor;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ConsumerCommitResponse o) {
            opcRequestId(o.getOpcRequestId());
            cursor(o.getCursor());

            return this;
        }
    }
}
