/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.requests;

import com.oracle.bmc.audit.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/audit/ListEventsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEventsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
public class ListEventsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Returns events that were processed at or after this start date and time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>For example, a start value of {@code 2017-01-15T11:30:00Z} will retrieve a list of all
     * events processed since 30 minutes after the 11th hour of January 15, 2017, in Coordinated
     * Universal Time (UTC). You can specify a value with granularity to the minute. Seconds (and
     * milliseconds, if included) must be set to {@code 0}.
     */
    private java.util.Date startTime;

    /**
     * Returns events that were processed at or after this start date and time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>For example, a start value of {@code 2017-01-15T11:30:00Z} will retrieve a list of all
     * events processed since 30 minutes after the 11th hour of January 15, 2017, in Coordinated
     * Universal Time (UTC). You can specify a value with granularity to the minute. Seconds (and
     * milliseconds, if included) must be set to {@code 0}.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    /**
     * Returns events that were processed before this end date and time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>For example, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
     * 2017-01-02T00:00:00Z} will retrieve a list of all events processed on January 1, 2017.
     * Similarly, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
     * 2017-02-01T00:00:00Z} will result in a list of all events processed between January 1, 2017
     * and January 31, 2017. You can specify a value with granularity to the minute. Seconds (and
     * milliseconds, if included) must be set to {@code 0}.
     */
    private java.util.Date endTime;

    /**
     * Returns events that were processed before this end date and time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>For example, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
     * 2017-01-02T00:00:00Z} will retrieve a list of all events processed on January 1, 2017.
     * Similarly, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
     * 2017-02-01T00:00:00Z} will result in a list of all events processed between January 1, 2017
     * and January 31, 2017. You can specify a value with granularity to the minute. Seconds (and
     * milliseconds, if included) must be set to {@code 0}.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEventsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Returns events that were processed at or after this start date and time, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>For example, a start value of {@code 2017-01-15T11:30:00Z} will retrieve a list of all
         * events processed since 30 minutes after the 11th hour of January 15, 2017, in Coordinated
         * Universal Time (UTC). You can specify a value with granularity to the minute. Seconds
         * (and milliseconds, if included) must be set to {@code 0}.
         */
        private java.util.Date startTime = null;

        /**
         * Returns events that were processed at or after this start date and time, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>For example, a start value of {@code 2017-01-15T11:30:00Z} will retrieve a list of all
         * events processed since 30 minutes after the 11th hour of January 15, 2017, in Coordinated
         * Universal Time (UTC). You can specify a value with granularity to the minute. Seconds
         * (and milliseconds, if included) must be set to {@code 0}.
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Returns events that were processed before this end date and time, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>For example, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
         * 2017-01-02T00:00:00Z} will retrieve a list of all events processed on January 1, 2017.
         * Similarly, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
         * 2017-02-01T00:00:00Z} will result in a list of all events processed between January 1,
         * 2017 and January 31, 2017. You can specify a value with granularity to the minute.
         * Seconds (and milliseconds, if included) must be set to {@code 0}.
         */
        private java.util.Date endTime = null;

        /**
         * Returns events that were processed before this end date and time, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>For example, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
         * 2017-01-02T00:00:00Z} will retrieve a list of all events processed on January 1, 2017.
         * Similarly, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code
         * 2017-02-01T00:00:00Z} will result in a list of all events processed between January 1,
         * 2017 and January 31, 2017. You can specify a value with granularity to the minute.
         * Seconds (and milliseconds, if included) must be set to {@code 0}.
         *
         * @param endTime the value to set
         * @return this builder instance
         */
        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListEventsRequest o) {
            compartmentId(o.getCompartmentId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest build() {
            ListEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest buildWithoutInvocationCallback() {
            ListEventsRequest request = new ListEventsRequest();
            request.compartmentId = compartmentId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListEventsRequest(compartmentId, startTime, endTime, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .startTime(startTime)
                .endTime(endTime)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListEventsRequest)) {
            return false;
        }

        ListEventsRequest other = (ListEventsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
