/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The response object returned from a PostMetricData operation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PostMetricDataResponseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PostMetricDataResponseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("failedMetricsCount")
        private Integer failedMetricsCount;

        public Builder failedMetricsCount(Integer failedMetricsCount) {
            this.failedMetricsCount = failedMetricsCount;
            this.__explicitlySet__.add("failedMetricsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedMetrics")
        private java.util.List<FailedMetricRecord> failedMetrics;

        public Builder failedMetrics(java.util.List<FailedMetricRecord> failedMetrics) {
            this.failedMetrics = failedMetrics;
            this.__explicitlySet__.add("failedMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PostMetricDataResponseDetails build() {
            PostMetricDataResponseDetails __instance__ =
                    new PostMetricDataResponseDetails(failedMetricsCount, failedMetrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PostMetricDataResponseDetails o) {
            Builder copiedBuilder =
                    failedMetricsCount(o.getFailedMetricsCount())
                            .failedMetrics(o.getFailedMetrics());

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
     * The number of metric objects that failed input validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedMetricsCount")
    Integer failedMetricsCount;

    /**
     * A list of records identifying metric objects that failed input validation
     * and the reasons for the failures.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedMetrics")
    java.util.List<FailedMetricRecord> failedMetrics;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
