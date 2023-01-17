/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListReportsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListReportsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class ListReportsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The type of the report.
     */
    private String reportType;

    /**
     * The type of the report.
     */
    public String getReportType() {
        return reportType;
    }
    /**
     * Date, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The service only interprets the year, month, and day parts in the input value, and ignores the hour, minute, and second parts.
     *
     */
    private java.util.Date date;

    /**
     * Date, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The service only interprets the year, month, and day parts in the input value, and ignores the hour, minute, and second parts.
     *
     */
    public java.util.Date getDate() {
        return date;
    }
    /**
     * The unique identifier for the compartment.
     */
    private String compartmentId;

    /**
     * The unique identifier for the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListReportsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The type of the report.
         */
        private String reportType = null;

        /**
         * The type of the report.
         * @param reportType the value to set
         * @return this builder instance
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * Date, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The service only interprets the year, month, and day parts in the input value, and ignores the hour, minute, and second parts.
         *
         */
        private java.util.Date date = null;

        /**
         * Date, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The service only interprets the year, month, and day parts in the input value, and ignores the hour, minute, and second parts.
         *
         * @param date the value to set
         * @return this builder instance
         */
        public Builder date(java.util.Date date) {
            this.date = date;
            return this;
        }

        /**
         * The unique identifier for the compartment.
         */
        private String compartmentId = null;

        /**
         * The unique identifier for the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListReportsRequest o) {
            reportType(o.getReportType());
            date(o.getDate());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListReportsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListReportsRequest
         */
        public ListReportsRequest build() {
            ListReportsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListReportsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListReportsRequest
         */
        public ListReportsRequest buildWithoutInvocationCallback() {
            ListReportsRequest request = new ListReportsRequest();
            request.reportType = reportType;
            request.date = date;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            return request;
            // new ListReportsRequest(reportType, date, compartmentId, opcRequestId, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .reportType(reportType)
                .date(date)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .page(page);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",reportType=").append(String.valueOf(this.reportType));
        sb.append(",date=").append(String.valueOf(this.date));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListReportsRequest)) {
            return false;
        }

        ListReportsRequest other = (ListReportsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.reportType, other.reportType)
                && java.util.Objects.equals(this.date, other.date)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.reportType == null ? 43 : this.reportType.hashCode());
        result = (result * PRIME) + (this.date == null ? 43 : this.date.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
