/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeJreUsageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeJreUsageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class SummarizeJreUsageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /** The Fleet-unique identifier of the related Java Runtime. */
    private String jreId;

    /** The Fleet-unique identifier of the related Java Runtime. */
    public String getJreId() {
        return jreId;
    }
    /** The vendor of the Java Runtime. */
    private String jreVendor;

    /** The vendor of the Java Runtime. */
    public String getJreVendor() {
        return jreVendor;
    }
    /** The distribution of the Java Runtime. */
    private String jreDistribution;

    /** The distribution of the Java Runtime. */
    public String getJreDistribution() {
        return jreDistribution;
    }
    /** The version of the Java Runtime. */
    private String jreVersion;

    /** The version of the Java Runtime. */
    public String getJreVersion() {
        return jreVersion;
    }
    /** The Fleet-unique identifier of the related application. */
    private String applicationId;

    /** The Fleet-unique identifier of the related application. */
    public String getApplicationId() {
        return applicationId;
    }
    /** The Fleet-unique identifier of the related managed instance. */
    private String managedInstanceId;

    /** The Fleet-unique identifier of the related managed instance. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * Additional fields to include into the returned model on top of the required ones. This
     * parameter can also include 'approximateApplicationCount', 'approximateInstallationCount' and
     * 'approximateManagedInstanceCount'. For example
     * 'approximateApplicationCount,approximateManagedInstanceCount'.
     */
    private java.util.List<com.oracle.bmc.jms.model.SummarizeJreUsageFields> fields;

    /**
     * Additional fields to include into the returned model on top of the required ones. This
     * parameter can also include 'approximateApplicationCount', 'approximateInstallationCount' and
     * 'approximateManagedInstanceCount'. For example
     * 'approximateApplicationCount,approximateManagedInstanceCount'.
     */
    public java.util.List<com.oracle.bmc.jms.model.SummarizeJreUsageFields> getFields() {
        return fields;
    }
    /**
     * The start of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeStart;

    /**
     * The start of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The end of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeEnd;

    /**
     * The end of the time period during which resources are searched (formatted according to
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
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /** The sort order, either 'asc' or 'desc'. */
    public com.oracle.bmc.jms.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort JRE usages. Only one sort order may be provided. Default order for
     * _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**. Default order for
     * _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
     * _approximateApplicationCount_ and _approximateManagedInstanceCount_ is **descending**.
     * Default order for _distribution_, _vendor_, and _osName_ is **ascending**. If no value is
     * specified _timeLastSeen_ is default.
     */
    private com.oracle.bmc.jms.model.JreSortBy sortBy;

    /**
     * The field to sort JRE usages. Only one sort order may be provided. Default order for
     * _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**. Default order for
     * _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
     * _approximateApplicationCount_ and _approximateManagedInstanceCount_ is **descending**.
     * Default order for _distribution_, _vendor_, and _osName_ is **ascending**. If no value is
     * specified _timeLastSeen_ is default.
     */
    public com.oracle.bmc.jms.model.JreSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The operating system type. */
    private java.util.List<com.oracle.bmc.jms.model.OsFamily> osFamily;

    /** The operating system type. */
    public java.util.List<com.oracle.bmc.jms.model.OsFamily> getOsFamily() {
        return osFamily;
    }
    /** The security status of the Java Runtime. */
    private com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus;

    /** The security status of the Java Runtime. */
    public com.oracle.bmc.jms.model.JreSecurityStatus getJreSecurityStatus() {
        return jreSecurityStatus;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeJreUsageRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** The Fleet-unique identifier of the related Java Runtime. */
        private String jreId = null;

        /**
         * The Fleet-unique identifier of the related Java Runtime.
         *
         * @param jreId the value to set
         * @return this builder instance
         */
        public Builder jreId(String jreId) {
            this.jreId = jreId;
            return this;
        }

        /** The vendor of the Java Runtime. */
        private String jreVendor = null;

        /**
         * The vendor of the Java Runtime.
         *
         * @param jreVendor the value to set
         * @return this builder instance
         */
        public Builder jreVendor(String jreVendor) {
            this.jreVendor = jreVendor;
            return this;
        }

        /** The distribution of the Java Runtime. */
        private String jreDistribution = null;

        /**
         * The distribution of the Java Runtime.
         *
         * @param jreDistribution the value to set
         * @return this builder instance
         */
        public Builder jreDistribution(String jreDistribution) {
            this.jreDistribution = jreDistribution;
            return this;
        }

        /** The version of the Java Runtime. */
        private String jreVersion = null;

        /**
         * The version of the Java Runtime.
         *
         * @param jreVersion the value to set
         * @return this builder instance
         */
        public Builder jreVersion(String jreVersion) {
            this.jreVersion = jreVersion;
            return this;
        }

        /** The Fleet-unique identifier of the related application. */
        private String applicationId = null;

        /**
         * The Fleet-unique identifier of the related application.
         *
         * @param applicationId the value to set
         * @return this builder instance
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /** The Fleet-unique identifier of the related managed instance. */
        private String managedInstanceId = null;

        /**
         * The Fleet-unique identifier of the related managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * Additional fields to include into the returned model on top of the required ones. This
         * parameter can also include 'approximateApplicationCount', 'approximateInstallationCount'
         * and 'approximateManagedInstanceCount'. For example
         * 'approximateApplicationCount,approximateManagedInstanceCount'.
         */
        private java.util.List<com.oracle.bmc.jms.model.SummarizeJreUsageFields> fields = null;

        /**
         * Additional fields to include into the returned model on top of the required ones. This
         * parameter can also include 'approximateApplicationCount', 'approximateInstallationCount'
         * and 'approximateManagedInstanceCount'. For example
         * 'approximateApplicationCount,approximateManagedInstanceCount'.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(
                java.util.List<com.oracle.bmc.jms.model.SummarizeJreUsageFields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Additional fields to include into the returned model on top of the
         * required ones. This parameter can also include 'approximateApplicationCount',
         * 'approximateInstallationCount' and 'approximateManagedInstanceCount'. For example
         * 'approximateApplicationCount,approximateManagedInstanceCount'.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(SummarizeJreUsageFields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * The start of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeStart = null;

        /**
         * The start of the time period during which resources are searched (formatted according to
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
         * The end of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeEnd = null;

        /**
         * The end of the time period during which resources are searched (formatted according to
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
        private com.oracle.bmc.jms.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jms.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort JRE usages. Only one sort order may be provided. Default order for
         * _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**. Default order for
         * _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
         * _approximateApplicationCount_ and _approximateManagedInstanceCount_ is **descending**.
         * Default order for _distribution_, _vendor_, and _osName_ is **ascending**. If no value is
         * specified _timeLastSeen_ is default.
         */
        private com.oracle.bmc.jms.model.JreSortBy sortBy = null;

        /**
         * The field to sort JRE usages. Only one sort order may be provided. Default order for
         * _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**. Default order for
         * _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
         * _approximateApplicationCount_ and _approximateManagedInstanceCount_ is **descending**.
         * Default order for _distribution_, _vendor_, and _osName_ is **ascending**. If no value is
         * specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.JreSortBy sortBy) {
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

        /** The operating system type. */
        private java.util.List<com.oracle.bmc.jms.model.OsFamily> osFamily = null;

        /**
         * The operating system type.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(java.util.List<com.oracle.bmc.jms.model.OsFamily> osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /**
         * Singular setter. The operating system type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder osFamily(OsFamily singularValue) {
            return this.osFamily(java.util.Arrays.asList(singularValue));
        }

        /** The security status of the Java Runtime. */
        private com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus = null;

        /**
         * The security status of the Java Runtime.
         *
         * @param jreSecurityStatus the value to set
         * @return this builder instance
         */
        public Builder jreSecurityStatus(
                com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus) {
            this.jreSecurityStatus = jreSecurityStatus;
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
        public Builder copy(SummarizeJreUsageRequest o) {
            fleetId(o.getFleetId());
            jreId(o.getJreId());
            jreVendor(o.getJreVendor());
            jreDistribution(o.getJreDistribution());
            jreVersion(o.getJreVersion());
            applicationId(o.getApplicationId());
            managedInstanceId(o.getManagedInstanceId());
            fields(o.getFields());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            osFamily(o.getOsFamily());
            jreSecurityStatus(o.getJreSecurityStatus());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeJreUsageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeJreUsageRequest
         */
        public SummarizeJreUsageRequest build() {
            SummarizeJreUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeJreUsageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeJreUsageRequest
         */
        public SummarizeJreUsageRequest buildWithoutInvocationCallback() {
            SummarizeJreUsageRequest request = new SummarizeJreUsageRequest();
            request.fleetId = fleetId;
            request.jreId = jreId;
            request.jreVendor = jreVendor;
            request.jreDistribution = jreDistribution;
            request.jreVersion = jreVersion;
            request.applicationId = applicationId;
            request.managedInstanceId = managedInstanceId;
            request.fields = fields;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.osFamily = osFamily;
            request.jreSecurityStatus = jreSecurityStatus;
            return request;
            // new SummarizeJreUsageRequest(fleetId, jreId, jreVendor, jreDistribution, jreVersion,
            // applicationId, managedInstanceId, fields, timeStart, timeEnd, limit, page, sortOrder,
            // sortBy, opcRequestId, osFamily, jreSecurityStatus);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .jreId(jreId)
                .jreVendor(jreVendor)
                .jreDistribution(jreDistribution)
                .jreVersion(jreVersion)
                .applicationId(applicationId)
                .managedInstanceId(managedInstanceId)
                .fields(fields)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .osFamily(osFamily)
                .jreSecurityStatus(jreSecurityStatus);
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",jreId=").append(String.valueOf(this.jreId));
        sb.append(",jreVendor=").append(String.valueOf(this.jreVendor));
        sb.append(",jreDistribution=").append(String.valueOf(this.jreDistribution));
        sb.append(",jreVersion=").append(String.valueOf(this.jreVersion));
        sb.append(",applicationId=").append(String.valueOf(this.applicationId));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",jreSecurityStatus=").append(String.valueOf(this.jreSecurityStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeJreUsageRequest)) {
            return false;
        }

        SummarizeJreUsageRequest other = (SummarizeJreUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.jreId, other.jreId)
                && java.util.Objects.equals(this.jreVendor, other.jreVendor)
                && java.util.Objects.equals(this.jreDistribution, other.jreDistribution)
                && java.util.Objects.equals(this.jreVersion, other.jreVersion)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.jreSecurityStatus, other.jreSecurityStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.jreId == null ? 43 : this.jreId.hashCode());
        result = (result * PRIME) + (this.jreVendor == null ? 43 : this.jreVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.jreDistribution == null ? 43 : this.jreDistribution.hashCode());
        result = (result * PRIME) + (this.jreVersion == null ? 43 : this.jreVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.jreSecurityStatus == null ? 43 : this.jreSecurityStatus.hashCode());
        return result;
    }
}
