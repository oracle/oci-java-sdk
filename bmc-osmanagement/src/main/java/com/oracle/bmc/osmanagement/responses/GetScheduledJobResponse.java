/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class GetScheduledJobResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     */
    private Float retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     *
     * @return the value
     */
    public Float getRetryAfter() {
        return retryAfter;
    }

    /** The returned {@code ScheduledJob} instance. */
    private com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob;

    /**
     * The returned {@code ScheduledJob} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.osmanagement.model.ScheduledJob getScheduledJob() {
        return scheduledJob;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "retryAfter",
        "scheduledJob"
    })
    private GetScheduledJobResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            Float retryAfter,
            com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.scheduledJob = scheduledJob;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetScheduledJobResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         */
        private Float retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         *
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Float retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /** The returned {@code ScheduledJob} instance. */
        private com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob;

        /**
         * The returned {@code ScheduledJob} instance.
         *
         * @param scheduledJob the value to set
         * @return this builder
         */
        public Builder scheduledJob(com.oracle.bmc.osmanagement.model.ScheduledJob scheduledJob) {
            this.scheduledJob = scheduledJob;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetScheduledJobResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            scheduledJob(o.getScheduledJob());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetScheduledJobResponse build() {
            return new GetScheduledJobResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, retryAfter, scheduledJob);
        }
    }

    /**
     * Return a new builder for this response object.
     *
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",scheduledJob=").append(String.valueOf(scheduledJob));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetScheduledJobResponse)) {
            return false;
        }

        GetScheduledJobResponse other = (GetScheduledJobResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.scheduledJob, other.scheduledJob);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result = (result * PRIME) + (this.scheduledJob == null ? 43 : this.scheduledJob.hashCode());
        return result;
    }
}
