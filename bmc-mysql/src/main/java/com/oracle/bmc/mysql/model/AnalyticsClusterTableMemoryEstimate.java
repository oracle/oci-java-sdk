/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Estimated memory footprint for a MySQL user table
 * when loaded to the Analytics Cluster memory.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsClusterTableMemoryEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AnalyticsClusterTableMemoryEstimate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toLoadColumnCount")
        private Integer toLoadColumnCount;

        public Builder toLoadColumnCount(Integer toLoadColumnCount) {
            this.toLoadColumnCount = toLoadColumnCount;
            this.__explicitlySet__.add("toLoadColumnCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("varlenColumnCount")
        private Integer varlenColumnCount;

        public Builder varlenColumnCount(Integer varlenColumnCount) {
            this.varlenColumnCount = varlenColumnCount;
            this.__explicitlySet__.add("varlenColumnCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
        private Long estimatedRowCount;

        public Builder estimatedRowCount(Long estimatedRowCount) {
            this.estimatedRowCount = estimatedRowCount;
            this.__explicitlySet__.add("estimatedRowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("analyticalFootprintInMbs")
        private Long analyticalFootprintInMbs;

        public Builder analyticalFootprintInMbs(Long analyticalFootprintInMbs) {
            this.analyticalFootprintInMbs = analyticalFootprintInMbs;
            this.__explicitlySet__.add("analyticalFootprintInMbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorComment")
        private String errorComment;

        public Builder errorComment(String errorComment) {
            this.errorComment = errorComment;
            this.__explicitlySet__.add("errorComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsClusterTableMemoryEstimate build() {
            AnalyticsClusterTableMemoryEstimate __instance__ =
                    new AnalyticsClusterTableMemoryEstimate(
                            tableName,
                            toLoadColumnCount,
                            varlenColumnCount,
                            estimatedRowCount,
                            analyticalFootprintInMbs,
                            errorComment);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsClusterTableMemoryEstimate o) {
            Builder copiedBuilder =
                    tableName(o.getTableName())
                            .toLoadColumnCount(o.getToLoadColumnCount())
                            .varlenColumnCount(o.getVarlenColumnCount())
                            .estimatedRowCount(o.getEstimatedRowCount())
                            .analyticalFootprintInMbs(o.getAnalyticalFootprintInMbs())
                            .errorComment(o.getErrorComment());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The table name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    /**
     * The number of columns to be loaded to Analytics Cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toLoadColumnCount")
    Integer toLoadColumnCount;

    /**
     * The number of variable-length columns to be loaded to Analytics Cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("varlenColumnCount")
    Integer varlenColumnCount;

    /**
     * The estimated number of rows in the table. This number was used to
     * derive the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
    Long estimatedRowCount;

    /**
     * The estimated memory footprint of the table in MBs when loaded to
     * Analytics Cluster memory (null if the table cannot be loaded to the
     * Analytics Cluster).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("analyticalFootprintInMbs")
    Long analyticalFootprintInMbs;

    /**
     * Error comment (empty string if no errors occured).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorComment")
    String errorComment;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
