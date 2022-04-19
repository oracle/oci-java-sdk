/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.responses;

import com.oracle.bmc.stackmonitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateMonitoredResourceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the monitored resource. This is sent to user in response headers for create monitored resource.
     *
     */
    private String opcMonitoredResourceId;

    /**
     * Location of the resource.
     */
    private String location;

    /**
     * Content location of the resource.
     */
    private String contentLocation;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned MonitoredResource instance.
     */
    private com.oracle.bmc.stackmonitoring.model.MonitoredResource monitoredResource;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcWorkRequestId",
        "opcRequestId",
        "opcMonitoredResourceId",
        "location",
        "contentLocation",
        "etag",
        "monitoredResource"
    })
    private CreateMonitoredResourceResponse(
            int __httpStatusCode__,
            String opcWorkRequestId,
            String opcRequestId,
            String opcMonitoredResourceId,
            String location,
            String contentLocation,
            String etag,
            com.oracle.bmc.stackmonitoring.model.MonitoredResource monitoredResource) {
        super(__httpStatusCode__);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.opcMonitoredResourceId = opcMonitoredResourceId;
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.monitoredResource = monitoredResource;
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
        public Builder copy(CreateMonitoredResourceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            opcMonitoredResourceId(o.getOpcMonitoredResourceId());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            monitoredResource(o.getMonitoredResource());

            return this;
        }

        public CreateMonitoredResourceResponse build() {
            return new CreateMonitoredResourceResponse(
                    __httpStatusCode__,
                    opcWorkRequestId,
                    opcRequestId,
                    opcMonitoredResourceId,
                    location,
                    contentLocation,
                    etag,
                    monitoredResource);
        }
    }
}
