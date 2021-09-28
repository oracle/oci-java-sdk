/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetEventReportResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * identifier for the request
     */
    private String opcRequestId;

    /**
     * The returned EventReport instance.
     */
    private com.oracle.bmc.osmanagement.model.EventReport eventReport;

    private GetEventReportResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.osmanagement.model.EventReport eventReport) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.eventReport = eventReport;
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
        public Builder copy(GetEventReportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            eventReport(o.getEventReport());

            return this;
        }

        public GetEventReportResponse build() {
            return new GetEventReportResponse(__httpStatusCode__, opcRequestId, eventReport);
        }
    }
}
