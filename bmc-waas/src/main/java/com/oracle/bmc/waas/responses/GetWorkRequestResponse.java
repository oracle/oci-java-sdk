/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.responses;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetWorkRequestResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     */
    private Float retryAfter;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The returned WorkRequest instance.
     */
    private WorkRequest workRequest;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetWorkRequestResponse o) {
            etag(o.getEtag());
            retryAfter(o.getRetryAfter());
            opcRequestId(o.getOpcRequestId());
            workRequest(o.getWorkRequest());

            return this;
        }
    }
}
