/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/ListJavaDownloadRecordsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListJavaDownloadRecordsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class ListJavaDownloadRecordsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * tenancy.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * tenancy.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Unique Java family version identifier. */
    private String familyVersion;

    /** Unique Java family version identifier. */
    public String getFamilyVersion() {
        return familyVersion;
    }
    /** Unique Java release version identifier. */
    private String releaseVersion;

    /** Unique Java release version identifier. */
    public String getReleaseVersion() {
        return releaseVersion;
    }
    /** Target Operating System family of the artifact. */
    private String osFamily;

    /** Target Operating System family of the artifact. */
    public String getOsFamily() {
        return osFamily;
    }
    /** Target Operating System architecture of the artifact. */
    private String architecture;

    /** Target Operating System architecture of the artifact. */
    public String getArchitecture() {
        return architecture;
    }
    /** Packaging type detail of the artifact. */
    private String packageTypeDetail;

    /** Packaging type detail of the artifact. */
    public String getPackageTypeDetail() {
        return packageTypeDetail;
    }
    /**
     * The start of the time period for which reports are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeStart;

    /**
     * The start of the time period for which reports are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The end of the time period for which reports are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeEnd;

    /**
     * The end of the time period for which reports are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order, either 'asc' or 'desc'. */
    private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder;

    /** The sort order, either 'asc' or 'desc'. */
    public com.oracle.bmc.jmsjavadownloads.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** If no value is specified _timeDownloaded_ is default. */
    private com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSortBy sortBy;

    /** If no value is specified _timeDownloaded_ is default. */
    public com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJavaDownloadRecordsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * tenancy.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * tenancy.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Unique Java family version identifier. */
        private String familyVersion = null;

        /**
         * Unique Java family version identifier.
         *
         * @param familyVersion the value to set
         * @return this builder instance
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            return this;
        }

        /** Unique Java release version identifier. */
        private String releaseVersion = null;

        /**
         * Unique Java release version identifier.
         *
         * @param releaseVersion the value to set
         * @return this builder instance
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /** Target Operating System family of the artifact. */
        private String osFamily = null;

        /**
         * Target Operating System family of the artifact.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(String osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /** Target Operating System architecture of the artifact. */
        private String architecture = null;

        /**
         * Target Operating System architecture of the artifact.
         *
         * @param architecture the value to set
         * @return this builder instance
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /** Packaging type detail of the artifact. */
        private String packageTypeDetail = null;

        /**
         * Packaging type detail of the artifact.
         *
         * @param packageTypeDetail the value to set
         * @return this builder instance
         */
        public Builder packageTypeDetail(String packageTypeDetail) {
            this.packageTypeDetail = packageTypeDetail;
            return this;
        }

        /**
         * The start of the time period for which reports are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeStart = null;

        /**
         * The start of the time period for which reports are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The end of the time period for which reports are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeEnd = null;

        /**
         * The end of the time period for which reports are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order, either 'asc' or 'desc'. */
        private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** If no value is specified _timeDownloaded_ is default. */
        private com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSortBy sortBy = null;

        /**
         * If no value is specified _timeDownloaded_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(
                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListJavaDownloadRecordsRequest o) {
            compartmentId(o.getCompartmentId());
            familyVersion(o.getFamilyVersion());
            releaseVersion(o.getReleaseVersion());
            osFamily(o.getOsFamily());
            architecture(o.getArchitecture());
            packageTypeDetail(o.getPackageTypeDetail());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJavaDownloadRecordsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListJavaDownloadRecordsRequest
         */
        public ListJavaDownloadRecordsRequest build() {
            ListJavaDownloadRecordsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJavaDownloadRecordsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJavaDownloadRecordsRequest
         */
        public ListJavaDownloadRecordsRequest buildWithoutInvocationCallback() {
            ListJavaDownloadRecordsRequest request = new ListJavaDownloadRecordsRequest();
            request.compartmentId = compartmentId;
            request.familyVersion = familyVersion;
            request.releaseVersion = releaseVersion;
            request.osFamily = osFamily;
            request.architecture = architecture;
            request.packageTypeDetail = packageTypeDetail;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJavaDownloadRecordsRequest(compartmentId, familyVersion, releaseVersion,
            // osFamily, architecture, packageTypeDetail, timeStart, timeEnd, limit, page,
            // sortOrder, sortBy, opcRequestId);
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
                .familyVersion(familyVersion)
                .releaseVersion(releaseVersion)
                .osFamily(osFamily)
                .architecture(architecture)
                .packageTypeDetail(packageTypeDetail)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(",releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",architecture=").append(String.valueOf(this.architecture));
        sb.append(",packageTypeDetail=").append(String.valueOf(this.packageTypeDetail));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListJavaDownloadRecordsRequest)) {
            return false;
        }

        ListJavaDownloadRecordsRequest other = (ListJavaDownloadRecordsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.packageTypeDetail, other.packageTypeDetail)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result =
                (result * PRIME)
                        + (this.packageTypeDetail == null ? 43 : this.packageTypeDetail.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
