/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogEventsFileResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Unique Oracle-assigned identifier for log data. */
    private String opcObjectId;

    /**
     * Unique Oracle-assigned identifier for log data.
     *
     * @return the value
     */
    public String getOpcObjectId() {
        return opcObjectId;
    }

    /** The time the upload was created, in the format defined by RFC3339 */
    private java.util.Date timeCreated;

    /**
     * The time the upload was created, in the format defined by RFC3339
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcObjectId",
        "timeCreated"
    })
    private UploadLogEventsFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcObjectId,
            java.util.Date timeCreated) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcObjectId = opcObjectId;
        this.timeCreated = timeCreated;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<UploadLogEventsFileResponse> {
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

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Unique Oracle-assigned identifier for log data. */
        private String opcObjectId;

        /**
         * Unique Oracle-assigned identifier for log data.
         *
         * @param opcObjectId the value to set
         * @return this builder
         */
        public Builder opcObjectId(String opcObjectId) {
            this.opcObjectId = opcObjectId;
            return this;
        }

        /** The time the upload was created, in the format defined by RFC3339 */
        private java.util.Date timeCreated;

        /**
         * The time the upload was created, in the format defined by RFC3339
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UploadLogEventsFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcObjectId(o.getOpcObjectId());
            timeCreated(o.getTimeCreated());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UploadLogEventsFileResponse build() {
            return new UploadLogEventsFileResponse(
                    __httpStatusCode__, headers, opcRequestId, opcObjectId, timeCreated);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcObjectId=").append(String.valueOf(opcObjectId));
        sb.append(",timeCreated=").append(String.valueOf(timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadLogEventsFileResponse)) {
            return false;
        }

        UploadLogEventsFileResponse other = (UploadLogEventsFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcObjectId, other.opcObjectId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcObjectId == null ? 43 : this.opcObjectId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        return result;
    }
}
