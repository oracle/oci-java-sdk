/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new Scheduled Query of type DataSourceSummary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduledQueryDataSourceSummaryObjDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataSourceFeedProvider"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledQueryDataSourceSummaryObjDetails extends DataSourceSummaryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Description for the scheduled query
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for the scheduled query
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Target information in which scheduled query will be run
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryScopeDetails")
        private java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails;

        /**
         * Target information in which scheduled query will be run
         * @param scheduledQueryScopeDetails the value to set
         * @return this builder
         **/
        public Builder scheduledQueryScopeDetails(
                java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails) {
            this.scheduledQueryScopeDetails = scheduledQueryScopeDetails;
            this.__explicitlySet__.add("scheduledQueryScopeDetails");
            return this;
        }
        /**
         * Interval in minutes in which the query is run periodically.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        /**
         * Interval in minutes in which the query is run periodically.
         * @param intervalInSeconds the value to set
         * @return this builder
         **/
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }
        /**
         * DataSource query metadata replication region and status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
        private java.util.List<RegionStatusDetail> regionStatusDetail;

        /**
         * DataSource query metadata replication region and status.
         * @param regionStatusDetail the value to set
         * @return this builder
         **/
        public Builder regionStatusDetail(java.util.List<RegionStatusDetail> regionStatusDetail) {
            this.regionStatusDetail = regionStatusDetail;
            this.__explicitlySet__.add("regionStatusDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledQueryDataSourceSummaryObjDetails build() {
            ScheduledQueryDataSourceSummaryObjDetails model =
                    new ScheduledQueryDataSourceSummaryObjDetails(
                            this.description,
                            this.scheduledQueryScopeDetails,
                            this.intervalInSeconds,
                            this.regionStatusDetail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledQueryDataSourceSummaryObjDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryScopeDetails")) {
                this.scheduledQueryScopeDetails(model.getScheduledQueryScopeDetails());
            }
            if (model.wasPropertyExplicitlySet("intervalInSeconds")) {
                this.intervalInSeconds(model.getIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("regionStatusDetail")) {
                this.regionStatusDetail(model.getRegionStatusDetail());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public ScheduledQueryDataSourceSummaryObjDetails(
            String description,
            java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails,
            Integer intervalInSeconds,
            java.util.List<RegionStatusDetail> regionStatusDetail) {
        super();
        this.description = description;
        this.scheduledQueryScopeDetails = scheduledQueryScopeDetails;
        this.intervalInSeconds = intervalInSeconds;
        this.regionStatusDetail = regionStatusDetail;
    }

    /**
     * Description for the scheduled query
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for the scheduled query
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Target information in which scheduled query will be run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryScopeDetails")
    private final java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails;

    /**
     * Target information in which scheduled query will be run
     * @return the value
     **/
    public java.util.List<ScheduledQueryScopeDetail> getScheduledQueryScopeDetails() {
        return scheduledQueryScopeDetails;
    }

    /**
     * Interval in minutes in which the query is run periodically.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    private final Integer intervalInSeconds;

    /**
     * Interval in minutes in which the query is run periodically.
     * @return the value
     **/
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * DataSource query metadata replication region and status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
    private final java.util.List<RegionStatusDetail> regionStatusDetail;

    /**
     * DataSource query metadata replication region and status.
     * @return the value
     **/
    public java.util.List<RegionStatusDetail> getRegionStatusDetail() {
        return regionStatusDetail;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScheduledQueryDataSourceSummaryObjDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduledQueryScopeDetails=")
                .append(String.valueOf(this.scheduledQueryScopeDetails));
        sb.append(", intervalInSeconds=").append(String.valueOf(this.intervalInSeconds));
        sb.append(", regionStatusDetail=").append(String.valueOf(this.regionStatusDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledQueryDataSourceSummaryObjDetails)) {
            return false;
        }

        ScheduledQueryDataSourceSummaryObjDetails other =
                (ScheduledQueryDataSourceSummaryObjDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.scheduledQueryScopeDetails, other.scheduledQueryScopeDetails)
                && java.util.Objects.equals(this.intervalInSeconds, other.intervalInSeconds)
                && java.util.Objects.equals(this.regionStatusDetail, other.regionStatusDetail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryScopeDetails == null
                                ? 43
                                : this.scheduledQueryScopeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInSeconds == null ? 43 : this.intervalInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.regionStatusDetail == null
                                ? 43
                                : this.regionStatusDetail.hashCode());
        return result;
    }
}
