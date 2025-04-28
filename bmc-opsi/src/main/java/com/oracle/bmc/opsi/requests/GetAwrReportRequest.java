/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetAwrReportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAwrReportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetAwrReportRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Awr Hub identifier */
    private String awrHubId;

    /** Unique Awr Hub identifier */
    public String getAwrHubId() {
        return awrHubId;
    }
    /** AWR source database identifier. */
    private String awrSourceDatabaseIdentifier;

    /** AWR source database identifier. */
    public String getAwrSourceDatabaseIdentifier() {
        return awrSourceDatabaseIdentifier;
    }
    /** The format of the AWR report. Default report format is HTML. */
    private com.oracle.bmc.opsi.model.AwrReportFormatType reportFormat;

    /** The format of the AWR report. Default report format is HTML. */
    public com.oracle.bmc.opsi.model.AwrReportFormatType getReportFormat() {
        return reportFormat;
    }
    /** The optional single value query parameter to filter by database instance number. */
    private String instanceNumber;

    /** The optional single value query parameter to filter by database instance number. */
    public String getInstanceNumber() {
        return instanceNumber;
    }
    /** The optional greater than or equal to filter on the snapshot ID. */
    private Integer beginSnapshotIdentifierGreaterThanOrEqualTo;

    /** The optional greater than or equal to filter on the snapshot ID. */
    public Integer getBeginSnapshotIdentifierGreaterThanOrEqualTo() {
        return beginSnapshotIdentifierGreaterThanOrEqualTo;
    }
    /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
    private Integer endSnapshotIdentifierLessThanOrEqualTo;

    /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
    public Integer getEndSnapshotIdentifierLessThanOrEqualTo() {
        return endSnapshotIdentifierLessThanOrEqualTo;
    }
    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
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
                    GetAwrReportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Awr Hub identifier */
        private String awrHubId = null;

        /**
         * Unique Awr Hub identifier
         *
         * @param awrHubId the value to set
         * @return this builder instance
         */
        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            return this;
        }

        /** AWR source database identifier. */
        private String awrSourceDatabaseIdentifier = null;

        /**
         * AWR source database identifier.
         *
         * @param awrSourceDatabaseIdentifier the value to set
         * @return this builder instance
         */
        public Builder awrSourceDatabaseIdentifier(String awrSourceDatabaseIdentifier) {
            this.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            return this;
        }

        /** The format of the AWR report. Default report format is HTML. */
        private com.oracle.bmc.opsi.model.AwrReportFormatType reportFormat = null;

        /**
         * The format of the AWR report. Default report format is HTML.
         *
         * @param reportFormat the value to set
         * @return this builder instance
         */
        public Builder reportFormat(com.oracle.bmc.opsi.model.AwrReportFormatType reportFormat) {
            this.reportFormat = reportFormat;
            return this;
        }

        /** The optional single value query parameter to filter by database instance number. */
        private String instanceNumber = null;

        /**
         * The optional single value query parameter to filter by database instance number.
         *
         * @param instanceNumber the value to set
         * @return this builder instance
         */
        public Builder instanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }

        /** The optional greater than or equal to filter on the snapshot ID. */
        private Integer beginSnapshotIdentifierGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to filter on the snapshot ID.
         *
         * @param beginSnapshotIdentifierGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder beginSnapshotIdentifierGreaterThanOrEqualTo(
                Integer beginSnapshotIdentifierGreaterThanOrEqualTo) {
            this.beginSnapshotIdentifierGreaterThanOrEqualTo =
                    beginSnapshotIdentifierGreaterThanOrEqualTo;
            return this;
        }

        /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
        private Integer endSnapshotIdentifierLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the snapshot Identifier.
         *
         * @param endSnapshotIdentifierLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder endSnapshotIdentifierLessThanOrEqualTo(
                Integer endSnapshotIdentifierLessThanOrEqualTo) {
            this.endSnapshotIdentifierLessThanOrEqualTo = endSnapshotIdentifierLessThanOrEqualTo;
            return this;
        }

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. The
         * timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. The
         * timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp
         * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp
         * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
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
        public Builder copy(GetAwrReportRequest o) {
            awrHubId(o.getAwrHubId());
            awrSourceDatabaseIdentifier(o.getAwrSourceDatabaseIdentifier());
            reportFormat(o.getReportFormat());
            instanceNumber(o.getInstanceNumber());
            beginSnapshotIdentifierGreaterThanOrEqualTo(
                    o.getBeginSnapshotIdentifierGreaterThanOrEqualTo());
            endSnapshotIdentifierLessThanOrEqualTo(o.getEndSnapshotIdentifierLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAwrReportRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetAwrReportRequest
         */
        public GetAwrReportRequest build() {
            GetAwrReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAwrReportRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAwrReportRequest
         */
        public GetAwrReportRequest buildWithoutInvocationCallback() {
            GetAwrReportRequest request = new GetAwrReportRequest();
            request.awrHubId = awrHubId;
            request.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            request.reportFormat = reportFormat;
            request.instanceNumber = instanceNumber;
            request.beginSnapshotIdentifierGreaterThanOrEqualTo =
                    beginSnapshotIdentifierGreaterThanOrEqualTo;
            request.endSnapshotIdentifierLessThanOrEqualTo = endSnapshotIdentifierLessThanOrEqualTo;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAwrReportRequest(awrHubId, awrSourceDatabaseIdentifier, reportFormat,
            // instanceNumber, beginSnapshotIdentifierGreaterThanOrEqualTo,
            // endSnapshotIdentifierLessThanOrEqualTo, timeGreaterThanOrEqualTo,
            // timeLessThanOrEqualTo, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .awrHubId(awrHubId)
                .awrSourceDatabaseIdentifier(awrSourceDatabaseIdentifier)
                .reportFormat(reportFormat)
                .instanceNumber(instanceNumber)
                .beginSnapshotIdentifierGreaterThanOrEqualTo(
                        beginSnapshotIdentifierGreaterThanOrEqualTo)
                .endSnapshotIdentifierLessThanOrEqualTo(endSnapshotIdentifierLessThanOrEqualTo)
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
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
        sb.append(",awrHubId=").append(String.valueOf(this.awrHubId));
        sb.append(",awrSourceDatabaseIdentifier=")
                .append(String.valueOf(this.awrSourceDatabaseIdentifier));
        sb.append(",reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append(",instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(",beginSnapshotIdentifierGreaterThanOrEqualTo=")
                .append(String.valueOf(this.beginSnapshotIdentifierGreaterThanOrEqualTo));
        sb.append(",endSnapshotIdentifierLessThanOrEqualTo=")
                .append(String.valueOf(this.endSnapshotIdentifierLessThanOrEqualTo));
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAwrReportRequest)) {
            return false;
        }

        GetAwrReportRequest other = (GetAwrReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.awrHubId, other.awrHubId)
                && java.util.Objects.equals(
                        this.awrSourceDatabaseIdentifier, other.awrSourceDatabaseIdentifier)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(
                        this.beginSnapshotIdentifierGreaterThanOrEqualTo,
                        other.beginSnapshotIdentifierGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endSnapshotIdentifierLessThanOrEqualTo,
                        other.endSnapshotIdentifierLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeGreaterThanOrEqualTo, other.timeGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLessThanOrEqualTo, other.timeLessThanOrEqualTo)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.awrHubId == null ? 43 : this.awrHubId.hashCode());
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseIdentifier == null
                                ? 43
                                : this.awrSourceDatabaseIdentifier.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.beginSnapshotIdentifierGreaterThanOrEqualTo == null
                                ? 43
                                : this.beginSnapshotIdentifierGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotIdentifierLessThanOrEqualTo == null
                                ? 43
                                : this.endSnapshotIdentifierLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLessThanOrEqualTo == null
                                ? 43
                                : this.timeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
