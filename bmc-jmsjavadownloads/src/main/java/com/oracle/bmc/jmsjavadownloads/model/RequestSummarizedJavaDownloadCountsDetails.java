/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Attributes to summarize the Java download counts in a tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestSummarizedJavaDownloadCountsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestSummarizedJavaDownloadCountsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "groupAs",
        "familyVersion",
        "releaseVersion",
        "timeStart",
        "timeEnd",
        "sortBy",
        "sortOrder",
        "limit",
        "page"
    })
    public RequestSummarizedJavaDownloadCountsDetails(
            String compartmentId,
            JavaDownloadCountAggregationType groupAs,
            String familyVersion,
            String releaseVersion,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            AggregationSortBy sortBy,
            SortOrder sortOrder,
            Integer limit,
            String page) {
        super();
        this.compartmentId = compartmentId;
        this.groupAs = groupAs;
        this.familyVersion = familyVersion;
        this.releaseVersion = releaseVersion;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.limit = limit;
        this.page = page;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) here
         * should be the tenancy OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) here
         * should be the tenancy OCID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The property that specifies the aggregation type for the download counts. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupAs")
        private JavaDownloadCountAggregationType groupAs;

        /**
         * The property that specifies the aggregation type for the download counts.
         *
         * @param groupAs the value to set
         * @return this builder
         */
        public Builder groupAs(JavaDownloadCountAggregationType groupAs) {
            this.groupAs = groupAs;
            this.__explicitlySet__.add("groupAs");
            return this;
        }
        /** Unique Java family version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
        private String familyVersion;

        /**
         * Unique Java family version identifier.
         *
         * @param familyVersion the value to set
         * @return this builder
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            this.__explicitlySet__.add("familyVersion");
            return this;
        }
        /** Unique Java release version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
        private String releaseVersion;

        /**
         * Unique Java release version identifier.
         *
         * @param releaseVersion the value to set
         * @return this builder
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            this.__explicitlySet__.add("releaseVersion");
            return this;
        }
        /**
         * The start time from when download data has to be included (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The start time from when download data has to be included (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * The end time until when the download data has to be included (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time until when the download data has to be included (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The property to be used for sorting the aggregated report. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private AggregationSortBy sortBy;

        /**
         * The property to be used for sorting the aggregated report.
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(AggregationSortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /** The sort order for the aggregated report. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order for the aggregated report.
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /** The maximum number of items to return. */
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private Integer limit;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }
        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous call.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("page")
        private String page;

        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous call.
         *
         * @param page the value to set
         * @return this builder
         */
        public Builder page(String page) {
            this.page = page;
            this.__explicitlySet__.add("page");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedJavaDownloadCountsDetails build() {
            RequestSummarizedJavaDownloadCountsDetails model =
                    new RequestSummarizedJavaDownloadCountsDetails(
                            this.compartmentId,
                            this.groupAs,
                            this.familyVersion,
                            this.releaseVersion,
                            this.timeStart,
                            this.timeEnd,
                            this.sortBy,
                            this.sortOrder,
                            this.limit,
                            this.page);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedJavaDownloadCountsDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("groupAs")) {
                this.groupAs(model.getGroupAs());
            }
            if (model.wasPropertyExplicitlySet("familyVersion")) {
                this.familyVersion(model.getFamilyVersion());
            }
            if (model.wasPropertyExplicitlySet("releaseVersion")) {
                this.releaseVersion(model.getReleaseVersion());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("limit")) {
                this.limit(model.getLimit());
            }
            if (model.wasPropertyExplicitlySet("page")) {
                this.page(model.getPage());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) here should be
     * the tenancy OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) here should be
     * the tenancy OCID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The property that specifies the aggregation type for the download counts. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupAs")
    private final JavaDownloadCountAggregationType groupAs;

    /**
     * The property that specifies the aggregation type for the download counts.
     *
     * @return the value
     */
    public JavaDownloadCountAggregationType getGroupAs() {
        return groupAs;
    }

    /** Unique Java family version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
    private final String familyVersion;

    /**
     * Unique Java family version identifier.
     *
     * @return the value
     */
    public String getFamilyVersion() {
        return familyVersion;
    }

    /** Unique Java release version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
    private final String releaseVersion;

    /**
     * Unique Java release version identifier.
     *
     * @return the value
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /**
     * The start time from when download data has to be included (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The start time from when download data has to be included (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * The end time until when the download data has to be included (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time until when the download data has to be included (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The property to be used for sorting the aggregated report. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final AggregationSortBy sortBy;

    /**
     * The property to be used for sorting the aggregated report.
     *
     * @return the value
     */
    public AggregationSortBy getSortBy() {
        return sortBy;
    }

    /** The sort order for the aggregated report. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order for the aggregated report.
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /** The maximum number of items to return. */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    /**
     * The maximum number of items to return.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous call.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("page")
    private final String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous call.
     *
     * @return the value
     */
    public String getPage() {
        return page;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RequestSummarizedJavaDownloadCountsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", groupAs=").append(String.valueOf(this.groupAs));
        sb.append(", familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(", releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedJavaDownloadCountsDetails)) {
            return false;
        }

        RequestSummarizedJavaDownloadCountsDetails other =
                (RequestSummarizedJavaDownloadCountsDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.groupAs, other.groupAs)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.groupAs == null ? 43 : this.groupAs.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
