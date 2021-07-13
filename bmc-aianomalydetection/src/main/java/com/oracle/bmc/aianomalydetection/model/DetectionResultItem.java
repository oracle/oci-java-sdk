/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * An object to hold detection result for one timestamp/row.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectionResultItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DetectionResultItem {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
        private Integer rowIndex;

        public Builder rowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            this.__explicitlySet__.add("rowIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("anomalies")
        private java.util.List<Anomaly> anomalies;

        public Builder anomalies(java.util.List<Anomaly> anomalies) {
            this.anomalies = anomalies;
            this.__explicitlySet__.add("anomalies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectionResultItem build() {
            DetectionResultItem __instance__ =
                    new DetectionResultItem(timestamp, rowIndex, score, anomalies);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectionResultItem o) {
            Builder copiedBuilder =
                    timestamp(o.getTimestamp())
                            .rowIndex(o.getRowIndex())
                            .score(o.getScore())
                            .anomalies(o.getAnomalies());

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
     * The time stamp associated with a list of anomaly points, format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    /**
     * The index number to indicate where anomaly points are located among all rows when there are no timestamps provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
    Integer rowIndex;

    /**
     * A significant score across multiple signals at timestamp/row level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    Double score;

    /**
     * An array of anomalies associated with a given timestamp/row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anomalies")
    java.util.List<Anomaly> anomalies;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
