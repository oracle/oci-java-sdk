/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.responses;

import com.oracle.bmc.datacc.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class GetMaintenanceExecutionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For Optimistic concurrency control. See the {@code if-match}. */
    private String etag;

    /**
     * For Optimistic concurrency control. See the {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The full URI of the resource. */
    private String location;

    /**
     * The full URI of the resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code MaintenanceExecution} instance. */
    private com.oracle.bmc.datacc.model.MaintenanceExecution maintenanceExecution;

    /**
     * The returned {@code MaintenanceExecution} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datacc.model.MaintenanceExecution getMaintenanceExecution() {
        return maintenanceExecution;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "location",
        "maintenanceExecution"
    })
    private GetMaintenanceExecutionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            String location,
            com.oracle.bmc.datacc.model.MaintenanceExecution maintenanceExecution) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.location = location;
        this.maintenanceExecution = maintenanceExecution;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetMaintenanceExecutionResponse> {
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
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For Optimistic concurrency control. See the {@code if-match}. */
        private String etag;

        /**
         * For Optimistic concurrency control. See the {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The full URI of the resource. */
        private String location;

        /**
         * The full URI of the resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code MaintenanceExecution} instance. */
        private com.oracle.bmc.datacc.model.MaintenanceExecution maintenanceExecution;

        /**
         * The returned {@code MaintenanceExecution} instance.
         *
         * @param maintenanceExecution the value to set
         * @return this builder
         */
        public Builder maintenanceExecution(
                com.oracle.bmc.datacc.model.MaintenanceExecution maintenanceExecution) {
            this.maintenanceExecution = maintenanceExecution;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetMaintenanceExecutionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            location(o.getLocation());
            maintenanceExecution(o.getMaintenanceExecution());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetMaintenanceExecutionResponse build() {
            return new GetMaintenanceExecutionResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    location,
                    maintenanceExecution);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",maintenanceExecution=").append(String.valueOf(maintenanceExecution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaintenanceExecutionResponse)) {
            return false;
        }

        GetMaintenanceExecutionResponse other = (GetMaintenanceExecutionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.maintenanceExecution, other.maintenanceExecution);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceExecution == null
                                ? 43
                                : this.maintenanceExecution.hashCode());
        return result;
    }
}
