/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.responses;

import com.oracle.bmc.osmanagementhub.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class CreateScheduledJobResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A link to the created scheduled job.
     */
    private String location;

    /**
     * A link to the created scheduled job.
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned ScheduledJob instance.
     */
    private com.oracle.bmc.osmanagementhub.model.ScheduledJob scheduledJob;

    /**
     * The returned ScheduledJob instance.
     * @return the value
     */
    public com.oracle.bmc.osmanagementhub.model.ScheduledJob getScheduledJob() {
        return scheduledJob;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "opcRequestId",
        "etag",
        "scheduledJob"
    })
    private CreateScheduledJobResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.osmanagementhub.model.ScheduledJob scheduledJob) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.scheduledJob = scheduledJob;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * A link to the created scheduled job.
         */
        private String location;

        /**
         * A link to the created scheduled job.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned ScheduledJob instance.
         */
        private com.oracle.bmc.osmanagementhub.model.ScheduledJob scheduledJob;

        /**
         * The returned ScheduledJob instance.
         * @param scheduledJob the value to set
         * @return this builder
         */
        public Builder scheduledJob(
                com.oracle.bmc.osmanagementhub.model.ScheduledJob scheduledJob) {
            this.scheduledJob = scheduledJob;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateScheduledJobResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            scheduledJob(o.getScheduledJob());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateScheduledJobResponse build() {
            return new CreateScheduledJobResponse(
                    __httpStatusCode__, headers, location, opcRequestId, etag, scheduledJob);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",scheduledJob=").append(String.valueOf(scheduledJob));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateScheduledJobResponse)) {
            return false;
        }

        CreateScheduledJobResponse other = (CreateScheduledJobResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.scheduledJob, other.scheduledJob);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.scheduledJob == null ? 43 : this.scheduledJob.hashCode());
        return result;
    }
}
