/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.responses;

import com.oracle.bmc.dataintegration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateScheduleResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * The returned Schedule instance.
     */
    private com.oracle.bmc.dataintegration.model.Schedule schedule;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "etag", "schedule"})
    private UpdateScheduleResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.dataintegration.model.Schedule schedule) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.schedule = schedule;
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
        public Builder copy(UpdateScheduleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            schedule(o.getSchedule());

            return this;
        }

        public UpdateScheduleResponse build() {
            return new UpdateScheduleResponse(__httpStatusCode__, opcRequestId, etag, schedule);
        }
    }
}
