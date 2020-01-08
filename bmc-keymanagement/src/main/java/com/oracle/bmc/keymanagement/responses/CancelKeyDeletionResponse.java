/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CancelKeyDeletionResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Key instance.
     */
    private Key key;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CancelKeyDeletionResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            key(o.getKey());

            return this;
        }
    }
}
