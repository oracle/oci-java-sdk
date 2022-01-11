/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Stream action for scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StreamAction.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StreamAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
        private String savedSearchId;

        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = savedSearchId;
            this.__explicitlySet__.add("savedSearchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricExtraction")
        private MetricExtraction metricExtraction;

        public Builder metricExtraction(MetricExtraction metricExtraction) {
            this.metricExtraction = metricExtraction;
            this.__explicitlySet__.add("metricExtraction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchDuration")
        private String savedSearchDuration;

        public Builder savedSearchDuration(String savedSearchDuration) {
            this.savedSearchDuration = savedSearchDuration;
            this.__explicitlySet__.add("savedSearchDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamAction build() {
            StreamAction __instance__ =
                    new StreamAction(savedSearchId, metricExtraction, savedSearchDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamAction o) {
            Builder copiedBuilder =
                    savedSearchId(o.getSavedSearchId())
                            .metricExtraction(o.getMetricExtraction())
                            .savedSearchDuration(o.getSavedSearchDuration());

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

    @Deprecated
    public StreamAction(
            String savedSearchId, MetricExtraction metricExtraction, String savedSearchDuration) {
        super();
        this.savedSearchId = savedSearchId;
        this.metricExtraction = metricExtraction;
        this.savedSearchDuration = savedSearchDuration;
    }

    /**
     * The ManagementSavedSearch id [OCID] utilized in the action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    String savedSearchId;

    @com.fasterxml.jackson.annotation.JsonProperty("metricExtraction")
    MetricExtraction metricExtraction;

    /**
     * The duration of data to be searched for SAVED_SEARCH tasks,
     * used when the task fires to calculate the query time range.
     * <p>
     * Duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The value should be positive.
     * The largest supported unit (as opposed to value) is D, e.g.  P14D (not P2W).
     * <p>
     * There are restrictions on the maximum duration value relative to the task schedule
     * value as specified in the following table.
     *    Schedule Interval Range          | Maximum Duration
     * ----------------------------------- | -----------------
     *   5 Minutes     to 30 Minutes       |   1 hour  "PT60M"
     *  31 Minutes     to  1 Hour          |  12 hours "PT720M"
     *  1 Hour+1Minute to  1 Day           |   1 day   "P1D"
     *  1 Day+1Minute  to  1 Week-1Minute  |   7 days  "P7D"
     *  1 Week         to  2 Weeks         |  14 days  "P14D"
     *  greater than 2 Weeks               |  30 days  "P30D"
     * <p>
     * If not specified, the duration will be based on the schedule. For example,
     * if the schedule is every 5 minutes then the savedSearchDuration will be "PT5M";
     * if the schedule is every 3 weeks then the savedSearchDuration will be "P21D".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchDuration")
    String savedSearchDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
