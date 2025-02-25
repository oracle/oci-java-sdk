/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.responses;

import com.oracle.bmc.fleetappsmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class CreateSchedulerDefinitionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL for the created schedulerDefinition, the schedulerDefinition id will be generated after this request is sent.
     */
    private String location;

    /**
     * URL for the created schedulerDefinition, the schedulerDefinition id will be generated after this request is sent.
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Same as location
     */
    private String contentLocation;

    /**
     * Same as location
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
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
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its status.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its status.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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
     * The returned SchedulerDefinition instance.
     */
    private com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition schedulerDefinition;

    /**
     * The returned SchedulerDefinition instance.
     * @return the value
     */
    public com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition getSchedulerDefinition() {
        return schedulerDefinition;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "contentLocation",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "schedulerDefinition"
    })
    private CreateSchedulerDefinitionResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String contentLocation,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition schedulerDefinition) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.schedulerDefinition = schedulerDefinition;
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
         * URL for the created schedulerDefinition, the schedulerDefinition id will be generated after this request is sent.
         */
        private String location;

        /**
         * URL for the created schedulerDefinition, the schedulerDefinition id will be generated after this request is sent.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Same as location
         */
        private String contentLocation;

        /**
         * Same as location
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
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
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its status.
         *
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its status.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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
         * The returned SchedulerDefinition instance.
         */
        private com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition schedulerDefinition;

        /**
         * The returned SchedulerDefinition instance.
         * @param schedulerDefinition the value to set
         * @return this builder
         */
        public Builder schedulerDefinition(
                com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition schedulerDefinition) {
            this.schedulerDefinition = schedulerDefinition;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSchedulerDefinitionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            schedulerDefinition(o.getSchedulerDefinition());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateSchedulerDefinitionResponse build() {
            return new CreateSchedulerDefinitionResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    contentLocation,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    schedulerDefinition);
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
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",schedulerDefinition=").append(String.valueOf(schedulerDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSchedulerDefinitionResponse)) {
            return false;
        }

        CreateSchedulerDefinitionResponse other = (CreateSchedulerDefinitionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.schedulerDefinition, other.schedulerDefinition);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulerDefinition == null
                                ? 43
                                : this.schedulerDefinition.hashCode());
        return result;
    }
}
