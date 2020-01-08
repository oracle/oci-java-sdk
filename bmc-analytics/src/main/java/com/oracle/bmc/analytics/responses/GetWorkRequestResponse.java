/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.responses;

import com.oracle.bmc.analytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetWorkRequestResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The number of seconds a client should wait before polling this endpoint again.
     *
     */
    private Integer retryAfter;

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
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            workRequest(o.getWorkRequest());

            return this;
        }
    }
}
