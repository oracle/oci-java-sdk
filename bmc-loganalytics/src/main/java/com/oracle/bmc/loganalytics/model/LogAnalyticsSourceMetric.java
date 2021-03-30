/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceMetric
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsSourceMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourceMetric {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
        private Boolean isMetricSourceEnabled;

        public Builder isMetricSourceEnabled(Boolean isMetricSourceEnabled) {
            this.isMetricSourceEnabled = isMetricSourceEnabled;
            this.__explicitlySet__.add("isMetricSourceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceMetric build() {
            LogAnalyticsSourceMetric __instance__ =
                    new LogAnalyticsSourceMetric(
                            isMetricSourceEnabled, metricName, sourceName, entityType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceMetric o) {
            Builder copiedBuilder =
                    isMetricSourceEnabled(o.getIsMetricSourceEnabled())
                            .metricName(o.getMetricName())
                            .sourceName(o.getSourceName())
                            .entityType(o.getEntityType());

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
     * A flag specifying whether or not the metric source is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
    Boolean isMetricSourceEnabled;

    /**
     * The metric name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    String metricName;

    /**
     * The source internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
