/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * An array of metric objects containing raw metric data points to be posted to the Monitoring service.
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
    builder = PostMetricDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PostMetricDataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metricData")
        private java.util.List<MetricDataDetails> metricData;

        public Builder metricData(java.util.List<MetricDataDetails> metricData) {
            this.metricData = metricData;
            this.__explicitlySet__.add("metricData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchAtomicity")
        private BatchAtomicity batchAtomicity;

        public Builder batchAtomicity(BatchAtomicity batchAtomicity) {
            this.batchAtomicity = batchAtomicity;
            this.__explicitlySet__.add("batchAtomicity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PostMetricDataDetails build() {
            PostMetricDataDetails __instance__ =
                    new PostMetricDataDetails(metricData, batchAtomicity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PostMetricDataDetails o) {
            Builder copiedBuilder =
                    metricData(o.getMetricData()).batchAtomicity(o.getBatchAtomicity());

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
     * A metric object containing raw metric data points to be posted to the Monitoring service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricData")
    java.util.List<MetricDataDetails> metricData;
    /**
     * Batch atomicity behavior. Requires either partial or full pass of input validation for
     * metric objects in PostMetricData requests. The default value of NON_ATOMIC requires a
     * partial pass: at least one metric object in the request must pass input validation, and
     * any objects that failed validation are identified in the returned summary, along with
     * their error messages. A value of ATOMIC requires a full pass: all metric objects in
     * the request must pass input validation.
     * <p>
     * Example: {@code NON_ATOMIC}
     *
     **/
    public enum BatchAtomicity {
        Atomic("ATOMIC"),
        NonAtomic("NON_ATOMIC"),
        ;

        private final String value;
        private static java.util.Map<String, BatchAtomicity> map;

        static {
            map = new java.util.HashMap<>();
            for (BatchAtomicity v : BatchAtomicity.values()) {
                map.put(v.getValue(), v);
            }
        }

        BatchAtomicity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BatchAtomicity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BatchAtomicity: " + key);
        }
    };
    /**
     * Batch atomicity behavior. Requires either partial or full pass of input validation for
     * metric objects in PostMetricData requests. The default value of NON_ATOMIC requires a
     * partial pass: at least one metric object in the request must pass input validation, and
     * any objects that failed validation are identified in the returned summary, along with
     * their error messages. A value of ATOMIC requires a full pass: all metric objects in
     * the request must pass input validation.
     * <p>
     * Example: {@code NON_ATOMIC}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchAtomicity")
    BatchAtomicity batchAtomicity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
