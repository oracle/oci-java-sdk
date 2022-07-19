/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * To capture all the histograms data related to profiling
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Histogram.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Histogram {
    @Deprecated
    @java.beans.ConstructorProperties({"ranges", "counts"})
    public Histogram(java.util.List<String> ranges, java.util.List<Integer> counts) {
        super();
        this.ranges = ranges;
        this.counts = counts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Range of values
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ranges")
        private java.util.List<String> ranges;

        /**
         * Range of values
         * @param ranges the value to set
         * @return this builder
         **/
        public Builder ranges(java.util.List<String> ranges) {
            this.ranges = ranges;
            this.__explicitlySet__.add("ranges");
            return this;
        }
        /**
         * Count of each ranges.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("counts")
        private java.util.List<Integer> counts;

        /**
         * Count of each ranges.
         * @param counts the value to set
         * @return this builder
         **/
        public Builder counts(java.util.List<Integer> counts) {
            this.counts = counts;
            this.__explicitlySet__.add("counts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Histogram build() {
            Histogram __instance__ = new Histogram(ranges, counts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Histogram o) {
            Builder copiedBuilder = ranges(o.getRanges()).counts(o.getCounts());

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
     * Range of values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ranges")
    private final java.util.List<String> ranges;

    /**
     * Range of values
     * @return the value
     **/
    public java.util.List<String> getRanges() {
        return ranges;
    }

    /**
     * Count of each ranges.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("counts")
    private final java.util.List<Integer> counts;

    /**
     * Count of each ranges.
     * @return the value
     **/
    public java.util.List<Integer> getCounts() {
        return counts;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Histogram(");
        sb.append("ranges=").append(String.valueOf(this.ranges));
        sb.append(", counts=").append(String.valueOf(this.counts));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Histogram)) {
            return false;
        }

        Histogram other = (Histogram) o;
        return java.util.Objects.equals(this.ranges, other.ranges)
                && java.util.Objects.equals(this.counts, other.counts)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ranges == null ? 43 : this.ranges.hashCode());
        result = (result * PRIME) + (this.counts == null ? 43 : this.counts.hashCode());
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
