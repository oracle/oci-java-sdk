/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetScheduledJobResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
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
     * A decimal number representing the number of seconds the client
     * should wait before polling this endpoint again.
     *
     */
    private Float retryAfter;

    /**
     * The returned ScheduledJob instance.
     */
    private com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "retryAfter",
        "scheduledJob"
    })
    private GetScheduledJobResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            Float retryAfter,
            com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.scheduledJob = scheduledJob;
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
        public Builder copy(GetScheduledJobResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            scheduledJob(o.getScheduledJob());

            return this;
        }

        public GetScheduledJobResponse build() {
            return new GetScheduledJobResponse(
                    __httpStatusCode__, etag, opcRequestId, retryAfter, scheduledJob);
        }
    }
}
