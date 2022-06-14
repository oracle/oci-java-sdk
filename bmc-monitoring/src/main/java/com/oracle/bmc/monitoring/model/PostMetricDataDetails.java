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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PostMetricDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PostMetricDataDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"metricData", "batchAtomicity"})
    public PostMetricDataDetails(
            java.util.List<MetricDataDetails> metricData, BatchAtomicity batchAtomicity) {
        super();
        this.metricData = metricData;
        this.batchAtomicity = batchAtomicity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A metric object containing raw metric data points to be posted to the Monitoring service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricData")
        private java.util.List<MetricDataDetails> metricData;

        /**
         * A metric object containing raw metric data points to be posted to the Monitoring service.
         *
         * @param metricData the value to set
         * @return this builder
         **/
        public Builder metricData(java.util.List<MetricDataDetails> metricData) {
            this.metricData = metricData;
            this.__explicitlySet__.add("metricData");
            return this;
        }
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
        private BatchAtomicity batchAtomicity;

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
         * @param batchAtomicity the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A metric object containing raw metric data points to be posted to the Monitoring service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricData")
    private final java.util.List<MetricDataDetails> metricData;

    /**
     * A metric object containing raw metric data points to be posted to the Monitoring service.
     *
     * @return the value
     **/
    public java.util.List<MetricDataDetails> getMetricData() {
        return metricData;
    }

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
    private final BatchAtomicity batchAtomicity;

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
     * @return the value
     **/
    public BatchAtomicity getBatchAtomicity() {
        return batchAtomicity;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PostMetricDataDetails(");
        sb.append("metricData=").append(String.valueOf(this.metricData));
        sb.append(", batchAtomicity=").append(String.valueOf(this.batchAtomicity));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostMetricDataDetails)) {
            return false;
        }

        PostMetricDataDetails other = (PostMetricDataDetails) o;
        return java.util.Objects.equals(this.metricData, other.metricData)
                && java.util.Objects.equals(this.batchAtomicity, other.batchAtomicity)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricData == null ? 43 : this.metricData.hashCode());
        result =
                (result * PRIME)
                        + (this.batchAtomicity == null ? 43 : this.batchAtomicity.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
