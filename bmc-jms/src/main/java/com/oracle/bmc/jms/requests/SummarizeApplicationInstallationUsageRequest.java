/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeApplicationInstallationUsageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeApplicationInstallationUsageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class SummarizeApplicationInstallationUsageRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /** The Fleet-unique identifier of the application installation. */
    private String applicationInstallationKey;

    /** The Fleet-unique identifier of the application installation. */
    public String getApplicationInstallationKey() {
        return applicationInstallationKey;
    }
    /** The Fleet-unique identifier of the application. */
    private String applicationId;

    /** The Fleet-unique identifier of the application. */
    public String getApplicationId() {
        return applicationId;
    }
    /** The display name. */
    private String displayName;

    /** The display name. */
    public String getDisplayName() {
        return displayName;
    }
    /** Filter the list with displayName contains the given value. */
    private String displayNameContains;

    /** Filter the list with displayName contains the given value. */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /** The type of the application. */
    private String applicationType;

    /** The type of the application. */
    public String getApplicationType() {
        return applicationType;
    }
    /** Filter the list with the application installation path that contains the given value. */
    private String appInstallationPathContains;

    /** Filter the list with the application installation path that contains the given value. */
    public String getAppInstallationPathContains() {
        return appInstallationPathContains;
    }
    /** The vendor of the related Java Runtime. */
    private String jreVendor;

    /** The vendor of the related Java Runtime. */
    public String getJreVendor() {
        return jreVendor;
    }
    /** The distribution of the related Java Runtime. */
    private String jreDistribution;

    /** The distribution of the related Java Runtime. */
    public String getJreDistribution() {
        return jreDistribution;
    }
    /** The version of the related Java Runtime. */
    private String jreVersion;

    /** The version of the related Java Runtime. */
    public String getJreVersion() {
        return jreVersion;
    }
    /** The file system path of the Java Runtime installation. */
    private String installationPath;

    /** The file system path of the Java Runtime installation. */
    public String getInstallationPath() {
        return installationPath;
    }
    /** The library key. */
    private String libraryKey;

    /** The library key. */
    public String getLibraryKey() {
        return libraryKey;
    }
    /** The Fleet-unique identifier of the related managed instance. */
    private String managedInstanceId;

    /** The Fleet-unique identifier of the related managed instance. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The operating system type. */
    private java.util.List<com.oracle.bmc.jms.model.OsFamily> osFamily;

    /** The operating system type. */
    public java.util.List<com.oracle.bmc.jms.model.OsFamily> getOsFamily() {
        return osFamily;
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
     * The field to sort application installation views. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, _approximateJreCount_,
     * _approximateInstallationCount_ and _approximateManagedInstanceCount_ is **descending**.
     * Default order for _displayName_, _installationPath_ and _osName_ is **ascending**. If no
     * value is specified _timeLastSeen_ is default.
     */
    private com.oracle.bmc.jms.model.ApplicationInstallationSortBy sortBy;

    /**
     * The field to sort application installation views. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, _approximateJreCount_,
     * _approximateInstallationCount_ and _approximateManagedInstanceCount_ is **descending**.
     * Default order for _displayName_, _installationPath_ and _osName_ is **ascending**. If no
     * value is specified _timeLastSeen_ is default.
     */
    public com.oracle.bmc.jms.model.ApplicationInstallationSortBy getSortBy() {
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
                    SummarizeApplicationInstallationUsageRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** The Fleet-unique identifier of the application installation. */
        private String applicationInstallationKey = null;

        /**
         * The Fleet-unique identifier of the application installation.
         *
         * @param applicationInstallationKey the value to set
         * @return this builder instance
         */
        public Builder applicationInstallationKey(String applicationInstallationKey) {
            this.applicationInstallationKey = applicationInstallationKey;
            return this;
        }

        /** The Fleet-unique identifier of the application. */
        private String applicationId = null;

        /**
         * The Fleet-unique identifier of the application.
         *
         * @param applicationId the value to set
         * @return this builder instance
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /** The display name. */
        private String displayName = null;

        /**
         * The display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Filter the list with displayName contains the given value. */
        private String displayNameContains = null;

        /**
         * Filter the list with displayName contains the given value.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /** The type of the application. */
        private String applicationType = null;

        /**
         * The type of the application.
         *
         * @param applicationType the value to set
         * @return this builder instance
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /** Filter the list with the application installation path that contains the given value. */
        private String appInstallationPathContains = null;

        /**
         * Filter the list with the application installation path that contains the given value.
         *
         * @param appInstallationPathContains the value to set
         * @return this builder instance
         */
        public Builder appInstallationPathContains(String appInstallationPathContains) {
            this.appInstallationPathContains = appInstallationPathContains;
            return this;
        }

        /** The vendor of the related Java Runtime. */
        private String jreVendor = null;

        /**
         * The vendor of the related Java Runtime.
         *
         * @param jreVendor the value to set
         * @return this builder instance
         */
        public Builder jreVendor(String jreVendor) {
            this.jreVendor = jreVendor;
            return this;
        }

        /** The distribution of the related Java Runtime. */
        private String jreDistribution = null;

        /**
         * The distribution of the related Java Runtime.
         *
         * @param jreDistribution the value to set
         * @return this builder instance
         */
        public Builder jreDistribution(String jreDistribution) {
            this.jreDistribution = jreDistribution;
            return this;
        }

        /** The version of the related Java Runtime. */
        private String jreVersion = null;

        /**
         * The version of the related Java Runtime.
         *
         * @param jreVersion the value to set
         * @return this builder instance
         */
        public Builder jreVersion(String jreVersion) {
            this.jreVersion = jreVersion;
            return this;
        }

        /** The file system path of the Java Runtime installation. */
        private String installationPath = null;

        /**
         * The file system path of the Java Runtime installation.
         *
         * @param installationPath the value to set
         * @return this builder instance
         */
        public Builder installationPath(String installationPath) {
            this.installationPath = installationPath;
            return this;
        }

        /** The library key. */
        private String libraryKey = null;

        /**
         * The library key.
         *
         * @param libraryKey the value to set
         * @return this builder instance
         */
        public Builder libraryKey(String libraryKey) {
            this.libraryKey = libraryKey;
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
         * The field to sort application installation views. Only one sort order may be provided.
         * Default order for _timeFirstSeen_, _timeLastSeen_, _approximateJreCount_,
         * _approximateInstallationCount_ and _approximateManagedInstanceCount_ is **descending**.
         * Default order for _displayName_, _installationPath_ and _osName_ is **ascending**. If no
         * value is specified _timeLastSeen_ is default.
         */
        private com.oracle.bmc.jms.model.ApplicationInstallationSortBy sortBy = null;

        /**
         * The field to sort application installation views. Only one sort order may be provided.
         * Default order for _timeFirstSeen_, _timeLastSeen_, _approximateJreCount_,
         * _approximateInstallationCount_ and _approximateManagedInstanceCount_ is **descending**.
         * Default order for _displayName_, _installationPath_ and _osName_ is **ascending**. If no
         * value is specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.ApplicationInstallationSortBy sortBy) {
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
        public Builder copy(SummarizeApplicationInstallationUsageRequest o) {
            fleetId(o.getFleetId());
            applicationInstallationKey(o.getApplicationInstallationKey());
            applicationId(o.getApplicationId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            applicationType(o.getApplicationType());
            appInstallationPathContains(o.getAppInstallationPathContains());
            jreVendor(o.getJreVendor());
            jreDistribution(o.getJreDistribution());
            jreVersion(o.getJreVersion());
            installationPath(o.getInstallationPath());
            libraryKey(o.getLibraryKey());
            managedInstanceId(o.getManagedInstanceId());
            osFamily(o.getOsFamily());
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
         * Build the instance of SummarizeApplicationInstallationUsageRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeApplicationInstallationUsageRequest
         */
        public SummarizeApplicationInstallationUsageRequest build() {
            SummarizeApplicationInstallationUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeApplicationInstallationUsageRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeApplicationInstallationUsageRequest
         */
        public SummarizeApplicationInstallationUsageRequest buildWithoutInvocationCallback() {
            SummarizeApplicationInstallationUsageRequest request =
                    new SummarizeApplicationInstallationUsageRequest();
            request.fleetId = fleetId;
            request.applicationInstallationKey = applicationInstallationKey;
            request.applicationId = applicationId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.applicationType = applicationType;
            request.appInstallationPathContains = appInstallationPathContains;
            request.jreVendor = jreVendor;
            request.jreDistribution = jreDistribution;
            request.jreVersion = jreVersion;
            request.installationPath = installationPath;
            request.libraryKey = libraryKey;
            request.managedInstanceId = managedInstanceId;
            request.osFamily = osFamily;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeApplicationInstallationUsageRequest(fleetId, applicationInstallationKey,
            // applicationId, displayName, displayNameContains, applicationType,
            // appInstallationPathContains, jreVendor, jreDistribution, jreVersion,
            // installationPath, libraryKey, managedInstanceId, osFamily, timeStart, timeEnd, limit,
            // page, sortOrder, sortBy, opcRequestId);
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
                .applicationInstallationKey(applicationInstallationKey)
                .applicationId(applicationId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .applicationType(applicationType)
                .appInstallationPathContains(appInstallationPathContains)
                .jreVendor(jreVendor)
                .jreDistribution(jreDistribution)
                .jreVersion(jreVersion)
                .installationPath(installationPath)
                .libraryKey(libraryKey)
                .managedInstanceId(managedInstanceId)
                .osFamily(osFamily)
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",applicationInstallationKey=")
                .append(String.valueOf(this.applicationInstallationKey));
        sb.append(",applicationId=").append(String.valueOf(this.applicationId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",applicationType=").append(String.valueOf(this.applicationType));
        sb.append(",appInstallationPathContains=")
                .append(String.valueOf(this.appInstallationPathContains));
        sb.append(",jreVendor=").append(String.valueOf(this.jreVendor));
        sb.append(",jreDistribution=").append(String.valueOf(this.jreDistribution));
        sb.append(",jreVersion=").append(String.valueOf(this.jreVersion));
        sb.append(",installationPath=").append(String.valueOf(this.installationPath));
        sb.append(",libraryKey=").append(String.valueOf(this.libraryKey));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
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
        if (!(o instanceof SummarizeApplicationInstallationUsageRequest)) {
            return false;
        }

        SummarizeApplicationInstallationUsageRequest other =
                (SummarizeApplicationInstallationUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.applicationInstallationKey, other.applicationInstallationKey)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(
                        this.appInstallationPathContains, other.appInstallationPathContains)
                && java.util.Objects.equals(this.jreVendor, other.jreVendor)
                && java.util.Objects.equals(this.jreDistribution, other.jreDistribution)
                && java.util.Objects.equals(this.jreVersion, other.jreVersion)
                && java.util.Objects.equals(this.installationPath, other.installationPath)
                && java.util.Objects.equals(this.libraryKey, other.libraryKey)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
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
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationKey == null
                                ? 43
                                : this.applicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.appInstallationPathContains == null
                                ? 43
                                : this.appInstallationPathContains.hashCode());
        result = (result * PRIME) + (this.jreVendor == null ? 43 : this.jreVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.jreDistribution == null ? 43 : this.jreDistribution.hashCode());
        result = (result * PRIME) + (this.jreVersion == null ? 43 : this.jreVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.installationPath == null ? 43 : this.installationPath.hashCode());
        result = (result * PRIME) + (this.libraryKey == null ? 43 : this.libraryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
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
