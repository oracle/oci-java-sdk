/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new Logging Query of type DataSourceSummary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoggingQueryDataSourceSummaryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataSourceFeedProvider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LoggingQueryDataSourceSummaryDetails extends DataSourceSummaryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** DataSource customer specified regions */
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * DataSource customer specified regions
         *
         * @param regions the value to set
         * @return this builder
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** DataSource mapping with detectorRecipe and detectorRule */
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetectorMappingInfo")
        private java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo;

        /**
         * DataSource mapping with detectorRecipe and detectorRule
         *
         * @param dataSourceDetectorMappingInfo the value to set
         * @return this builder
         */
        public Builder dataSourceDetectorMappingInfo(
                java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo) {
            this.dataSourceDetectorMappingInfo = dataSourceDetectorMappingInfo;
            this.__explicitlySet__.add("dataSourceDetectorMappingInfo");
            return this;
        }
        /** DataSource query metadata replication region and status. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
        private java.util.List<RegionStatusDetail> regionStatusDetail;

        /**
         * DataSource query metadata replication region and status.
         *
         * @param regionStatusDetail the value to set
         * @return this builder
         */
        public Builder regionStatusDetail(java.util.List<RegionStatusDetail> regionStatusDetail) {
            this.regionStatusDetail = regionStatusDetail;
            this.__explicitlySet__.add("regionStatusDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingQueryDataSourceSummaryDetails build() {
            LoggingQueryDataSourceSummaryDetails model =
                    new LoggingQueryDataSourceSummaryDetails(
                            this.regions,
                            this.dataSourceDetectorMappingInfo,
                            this.regionStatusDetail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingQueryDataSourceSummaryDetails model) {
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("dataSourceDetectorMappingInfo")) {
                this.dataSourceDetectorMappingInfo(model.getDataSourceDetectorMappingInfo());
            }
            if (model.wasPropertyExplicitlySet("regionStatusDetail")) {
                this.regionStatusDetail(model.getRegionStatusDetail());
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

    @Deprecated
    public LoggingQueryDataSourceSummaryDetails(
            java.util.List<String> regions,
            java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo,
            java.util.List<RegionStatusDetail> regionStatusDetail) {
        super();
        this.regions = regions;
        this.dataSourceDetectorMappingInfo = dataSourceDetectorMappingInfo;
        this.regionStatusDetail = regionStatusDetail;
    }

    /** DataSource customer specified regions */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * DataSource customer specified regions
     *
     * @return the value
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /** DataSource mapping with detectorRecipe and detectorRule */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetectorMappingInfo")
    private final java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo;

    /**
     * DataSource mapping with detectorRecipe and detectorRule
     *
     * @return the value
     */
    public java.util.List<DataSourceMappingInfo> getDataSourceDetectorMappingInfo() {
        return dataSourceDetectorMappingInfo;
    }

    /** DataSource query metadata replication region and status. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
    private final java.util.List<RegionStatusDetail> regionStatusDetail;

    /**
     * DataSource query metadata replication region and status.
     *
     * @return the value
     */
    public java.util.List<RegionStatusDetail> getRegionStatusDetail() {
        return regionStatusDetail;
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
        sb.append("LoggingQueryDataSourceSummaryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", dataSourceDetectorMappingInfo=")
                .append(String.valueOf(this.dataSourceDetectorMappingInfo));
        sb.append(", regionStatusDetail=").append(String.valueOf(this.regionStatusDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingQueryDataSourceSummaryDetails)) {
            return false;
        }

        LoggingQueryDataSourceSummaryDetails other = (LoggingQueryDataSourceSummaryDetails) o;
        return java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(
                        this.dataSourceDetectorMappingInfo, other.dataSourceDetectorMappingInfo)
                && java.util.Objects.equals(this.regionStatusDetail, other.regionStatusDetail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSourceDetectorMappingInfo == null
                                ? 43
                                : this.dataSourceDetectorMappingInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.regionStatusDetail == null
                                ? 43
                                : this.regionStatusDetail.hashCode());
        return result;
    }
}
