/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class EstimatePurgeDataSizeResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned EstimatePurgeDataSizeResult instance.
     */
    private com.oracle.bmc.loganalytics.model.EstimatePurgeDataSizeResult
            estimatePurgeDataSizeResult;

    private EstimatePurgeDataSizeResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.loganalytics.model.EstimatePurgeDataSizeResult
                    estimatePurgeDataSizeResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.estimatePurgeDataSizeResult = estimatePurgeDataSizeResult;
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
        public Builder copy(EstimatePurgeDataSizeResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            estimatePurgeDataSizeResult(o.getEstimatePurgeDataSizeResult());

            return this;
        }

        public EstimatePurgeDataSizeResponse build() {
            return new EstimatePurgeDataSizeResponse(
                    __httpStatusCode__, opcRequestId, etag, estimatePurgeDataSizeResult);
        }
    }
}
