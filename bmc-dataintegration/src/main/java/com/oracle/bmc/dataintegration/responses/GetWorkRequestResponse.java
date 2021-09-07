/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.responses;

import com.oracle.bmc.dataintegration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
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
     * Indicates the number of seconds to wait before making a follow-up request.
     */
    private Integer retryAfter;

    /**
     * The returned WorkRequest instance.
     */
    private com.oracle.bmc.dataintegration.model.WorkRequest workRequest;

    private GetWorkRequestResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            Integer retryAfter,
            com.oracle.bmc.dataintegration.model.WorkRequest workRequest) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.workRequest = workRequest;
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
        public Builder copy(GetWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            workRequest(o.getWorkRequest());

            return this;
        }

        public GetWorkRequestResponse build() {
            return new GetWorkRequestResponse(
                    __httpStatusCode__, etag, opcRequestId, retryAfter, workRequest);
        }
    }
}
