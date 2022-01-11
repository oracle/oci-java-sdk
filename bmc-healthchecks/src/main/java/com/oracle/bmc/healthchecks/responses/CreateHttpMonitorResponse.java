/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateHttpMonitorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The URL of the newly created monitor.
     */
    private String location;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * The returned HttpMonitor instance.
     */
    private com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "location",
        "etag",
        "httpMonitor"
    })
    private CreateHttpMonitorResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String location,
            String etag,
            com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.etag = etag;
        this.httpMonitor = httpMonitor;
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
        public Builder copy(CreateHttpMonitorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            etag(o.getEtag());
            httpMonitor(o.getHttpMonitor());

            return this;
        }

        public CreateHttpMonitorResponse build() {
            return new CreateHttpMonitorResponse(
                    __httpStatusCode__, opcRequestId, location, etag, httpMonitor);
        }
    }
}
