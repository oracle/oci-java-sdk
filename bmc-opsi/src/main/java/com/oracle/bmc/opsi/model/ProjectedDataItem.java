/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The timestamp of the projected event and their corresponding resource value.
 * `highValue` and `lowValue` are the uncertainty bounds of the corresponding value.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProjectedDataItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProjectedDataItem {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highValue")
        private Double highValue;

        public Builder highValue(Double highValue) {
            this.highValue = highValue;
            this.__explicitlySet__.add("highValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowValue")
        private Double lowValue;

        public Builder lowValue(Double lowValue) {
            this.lowValue = lowValue;
            this.__explicitlySet__.add("lowValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProjectedDataItem build() {
            ProjectedDataItem __instance__ =
                    new ProjectedDataItem(endTimestamp, usage, highValue, lowValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProjectedDataItem o) {
            Builder copiedBuilder =
                    endTimestamp(o.getEndTimestamp())
                            .usage(o.getUsage())
                            .highValue(o.getHighValue())
                            .lowValue(o.getLowValue());

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
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    java.util.Date endTimestamp;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    Double usage;

    /**
     * Upper uncertainty bound of the current usage value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("highValue")
    Double highValue;

    /**
     * Lower uncertainty bound of the current usage value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowValue")
    Double lowValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
