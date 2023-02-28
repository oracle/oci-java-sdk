/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJavaReleasesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJavaReleasesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListJavaReleasesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Java release version identifier */
    private String releaseVersion;

    /** Unique Java release version identifier */
    public String getReleaseVersion() {
        return releaseVersion;
    }
    /** The version identifier for the Java family. */
    private String familyVersion;

    /** The version identifier for the Java family. */
    public String getFamilyVersion() {
        return familyVersion;
    }
    /** Java release type. */
    private com.oracle.bmc.jms.model.ReleaseType releaseType;

    /** Java release type. */
    public com.oracle.bmc.jms.model.ReleaseType getReleaseType() {
        return releaseType;
    }
    /** The security status of the Java Runtime. */
    private com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus;

    /** The security status of the Java Runtime. */
    public com.oracle.bmc.jms.model.JreSecurityStatus getJreSecurityStatus() {
        return jreSecurityStatus;
    }
    /** Java license type. */
    private com.oracle.bmc.jms.model.LicenseType licenseType;

    /** Java license type. */
    public com.oracle.bmc.jms.model.LicenseType getLicenseType() {
        return licenseType;
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
    /** If no value is specified _releaseDate_ is default. */
    private com.oracle.bmc.jms.model.JavaReleaseSortBy sortBy;

    /** If no value is specified _releaseDate_ is default. */
    public com.oracle.bmc.jms.model.JavaReleaseSortBy getSortBy() {
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
                    ListJavaReleasesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Java release version identifier */
        private String releaseVersion = null;

        /**
         * Unique Java release version identifier
         *
         * @param releaseVersion the value to set
         * @return this builder instance
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /** The version identifier for the Java family. */
        private String familyVersion = null;

        /**
         * The version identifier for the Java family.
         *
         * @param familyVersion the value to set
         * @return this builder instance
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            return this;
        }

        /** Java release type. */
        private com.oracle.bmc.jms.model.ReleaseType releaseType = null;

        /**
         * Java release type.
         *
         * @param releaseType the value to set
         * @return this builder instance
         */
        public Builder releaseType(com.oracle.bmc.jms.model.ReleaseType releaseType) {
            this.releaseType = releaseType;
            return this;
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

        /** Java license type. */
        private com.oracle.bmc.jms.model.LicenseType licenseType = null;

        /**
         * Java license type.
         *
         * @param licenseType the value to set
         * @return this builder instance
         */
        public Builder licenseType(com.oracle.bmc.jms.model.LicenseType licenseType) {
            this.licenseType = licenseType;
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

        /** If no value is specified _releaseDate_ is default. */
        private com.oracle.bmc.jms.model.JavaReleaseSortBy sortBy = null;

        /**
         * If no value is specified _releaseDate_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.JavaReleaseSortBy sortBy) {
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
        public Builder copy(ListJavaReleasesRequest o) {
            releaseVersion(o.getReleaseVersion());
            familyVersion(o.getFamilyVersion());
            releaseType(o.getReleaseType());
            jreSecurityStatus(o.getJreSecurityStatus());
            licenseType(o.getLicenseType());
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
         * Build the instance of ListJavaReleasesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListJavaReleasesRequest
         */
        public ListJavaReleasesRequest build() {
            ListJavaReleasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJavaReleasesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJavaReleasesRequest
         */
        public ListJavaReleasesRequest buildWithoutInvocationCallback() {
            ListJavaReleasesRequest request = new ListJavaReleasesRequest();
            request.releaseVersion = releaseVersion;
            request.familyVersion = familyVersion;
            request.releaseType = releaseType;
            request.jreSecurityStatus = jreSecurityStatus;
            request.licenseType = licenseType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJavaReleasesRequest(releaseVersion, familyVersion, releaseType,
            // jreSecurityStatus, licenseType, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .releaseVersion(releaseVersion)
                .familyVersion(familyVersion)
                .releaseType(releaseType)
                .jreSecurityStatus(jreSecurityStatus)
                .licenseType(licenseType)
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
        sb.append(",releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(",familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(",releaseType=").append(String.valueOf(this.releaseType));
        sb.append(",jreSecurityStatus=").append(String.valueOf(this.jreSecurityStatus));
        sb.append(",licenseType=").append(String.valueOf(this.licenseType));
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
        if (!(o instanceof ListJavaReleasesRequest)) {
            return false;
        }

        ListJavaReleasesRequest other = (ListJavaReleasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.releaseType, other.releaseType)
                && java.util.Objects.equals(this.jreSecurityStatus, other.jreSecurityStatus)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
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
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result = (result * PRIME) + (this.releaseType == null ? 43 : this.releaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.jreSecurityStatus == null ? 43 : this.jreSecurityStatus.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
