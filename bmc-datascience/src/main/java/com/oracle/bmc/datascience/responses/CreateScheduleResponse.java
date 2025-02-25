/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateScheduleResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL for the created schedule, the schedule id will be generated after this request is sent.
     */
    private String location;

    /**
     * URL for the created schedule, the schedule id will be generated after this request is sent.
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
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work request. Use [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work request. Use [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact
     * Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact
     * Oracle about a particular request, then provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned Schedule instance.
     */
    private com.oracle.bmc.datascience.model.Schedule schedule;

    /**
     * The returned Schedule instance.
     * @return the value
     */
    public com.oracle.bmc.datascience.model.Schedule getSchedule() {
        return schedule;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "contentLocation",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "schedule"
    })
    private CreateScheduleResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String contentLocation,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.datascience.model.Schedule schedule) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.schedule = schedule;
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
         * URL for the created schedule, the schedule id will be generated after this request is sent.
         */
        private String location;

        /**
         * URL for the created schedule, the schedule id will be generated after this request is sent.
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
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work request. Use [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         *
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work request. Use [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact
         * Oracle about a particular request, then provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact
         * Oracle about a particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned Schedule instance.
         */
        private com.oracle.bmc.datascience.model.Schedule schedule;

        /**
         * The returned Schedule instance.
         * @param schedule the value to set
         * @return this builder
         */
        public Builder schedule(com.oracle.bmc.datascience.model.Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateScheduleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            schedule(o.getSchedule());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateScheduleResponse build() {
            return new CreateScheduleResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    contentLocation,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    schedule);
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
        sb.append(",schedule=").append(String.valueOf(schedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateScheduleResponse)) {
            return false;
        }

        CreateScheduleResponse other = (CreateScheduleResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.schedule, other.schedule);
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
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        return result;
    }
}
