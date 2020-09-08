/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Verify acceleration output.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VerifyOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VerifyOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledTaskId")
        private String scheduledTaskId;

        public Builder scheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            this.__explicitlySet__.add("scheduledTaskId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
        private Long responseTimeInMs;

        public Builder responseTimeInMs(Long responseTimeInMs) {
            this.responseTimeInMs = responseTimeInMs;
            this.__explicitlySet__.add("responseTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
        private Long totalMatchedCount;

        public Builder totalMatchedCount(Long totalMatchedCount) {
            this.totalMatchedCount = totalMatchedCount;
            this.__explicitlySet__.add("totalMatchedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<ResultColumn> columns;

        public Builder columns(java.util.List<ResultColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<java.util.Map<String, Object>> results;

        public Builder results(java.util.List<java.util.Map<String, Object>> results) {
            this.results = results;
            this.__explicitlySet__.add("results");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifyOutput build() {
            VerifyOutput __instance__ =
                    new VerifyOutput(
                            scheduledTaskId,
                            responseTimeInMs,
                            totalMatchedCount,
                            totalCount,
                            columns,
                            results);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifyOutput o) {
            Builder copiedBuilder =
                    scheduledTaskId(o.getScheduledTaskId())
                            .responseTimeInMs(o.getResponseTimeInMs())
                            .totalMatchedCount(o.getTotalMatchedCount())
                            .totalCount(o.getTotalCount())
                            .columns(o.getColumns())
                            .results(o.getResults());

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
     * Acceleration task identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledTaskId")
    String scheduledTaskId;

    /**
     * Response time in ms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
    Long responseTimeInMs;

    /**
     * Total match count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
    Long totalMatchedCount;

    /**
     * Total count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    Integer totalCount;

    /**
     * Acceleration result columns, included if requested (shouldIncludeResults).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    java.util.List<ResultColumn> columns;

    /**
     * Acceleration result values, included if requested (shouldIncludeResults).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    java.util.List<java.util.Map<String, Object>> results;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
