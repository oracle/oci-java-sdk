/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class CreatePingMonitorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The URL of the newly created monitor.
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * An entity tag that uniquely identifies a version of the resource.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned PingMonitor instance.
     */
    private com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor;

    public com.oracle.bmc.healthchecks.model.PingMonitor getPingMonitor() {
        return pingMonitor;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "location",
        "etag",
        "pingMonitor"
    })
    private CreatePingMonitorResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String location,
            String etag,
            com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.etag = etag;
        this.pingMonitor = pingMonitor;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor;

        public Builder pingMonitor(com.oracle.bmc.healthchecks.model.PingMonitor pingMonitor) {
            this.pingMonitor = pingMonitor;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreatePingMonitorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            etag(o.getEtag());
            pingMonitor(o.getPingMonitor());

            return this;
        }

        public CreatePingMonitorResponse build() {
            return new CreatePingMonitorResponse(
                    __httpStatusCode__, opcRequestId, location, etag, pingMonitor);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",pingMonitor=").append(String.valueOf(pingMonitor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePingMonitorResponse)) {
            return false;
        }

        CreatePingMonitorResponse other = (CreatePingMonitorResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.pingMonitor, other.pingMonitor);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.pingMonitor == null ? 43 : this.pingMonitor.hashCode());
        return result;
    }
}
