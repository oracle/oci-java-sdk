/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.responses;

import com.oracle.bmc.stackmonitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class CreateMonitoredResourceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Unique identifier for the monitored resource. This is sent to user in response headers for create monitored resource.
     *
     */
    private String opcMonitoredResourceId;

    public String getOpcMonitoredResourceId() {
        return opcMonitoredResourceId;
    }

    /**
     * Location of the resource.
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * Content location of the resource.
     */
    private String contentLocation;

    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned MonitoredResource instance.
     */
    private com.oracle.bmc.stackmonitoring.model.MonitoredResource monitoredResource;

    public com.oracle.bmc.stackmonitoring.model.MonitoredResource getMonitoredResource() {
        return monitoredResource;
    }

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

        private String opcWorkRequestId;

        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcMonitoredResourceId;

        public Builder opcMonitoredResourceId(String opcMonitoredResourceId) {
            this.opcMonitoredResourceId = opcMonitoredResourceId;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private String contentLocation;

        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.stackmonitoring.model.MonitoredResource monitoredResource;

        public Builder monitoredResource(
                com.oracle.bmc.stackmonitoring.model.MonitoredResource monitoredResource) {
            this.monitoredResource = monitoredResource;
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

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcMonitoredResourceId=").append(String.valueOf(opcMonitoredResourceId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",monitoredResource=").append(String.valueOf(monitoredResource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMonitoredResourceResponse)) {
            return false;
        }

        CreateMonitoredResourceResponse other = (CreateMonitoredResourceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.opcMonitoredResourceId, other.opcMonitoredResourceId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.monitoredResource, other.monitoredResource);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMonitoredResourceId == null
                                ? 43
                                : this.opcMonitoredResourceId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.monitoredResource == null ? 43 : this.monitoredResource.hashCode());
        return result;
    }
}
