/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Network Activity Summary metric for the host
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostNetworkActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostNetworkActivitySummary extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
        private Double allNetworkReadInMbps;

        public Builder allNetworkReadInMbps(Double allNetworkReadInMbps) {
            this.allNetworkReadInMbps = allNetworkReadInMbps;
            this.__explicitlySet__.add("allNetworkReadInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
        private Double allNetworkWriteInMbps;

        public Builder allNetworkWriteInMbps(Double allNetworkWriteInMbps) {
            this.allNetworkWriteInMbps = allNetworkWriteInMbps;
            this.__explicitlySet__.add("allNetworkWriteInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
        private Double allNetworkIoInMbps;

        public Builder allNetworkIoInMbps(Double allNetworkIoInMbps) {
            this.allNetworkIoInMbps = allNetworkIoInMbps;
            this.__explicitlySet__.add("allNetworkIoInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostNetworkActivitySummary build() {
            HostNetworkActivitySummary __instance__ =
                    new HostNetworkActivitySummary(
                            timeCollected,
                            allNetworkReadInMbps,
                            allNetworkWriteInMbps,
                            allNetworkIoInMbps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostNetworkActivitySummary o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .allNetworkReadInMbps(o.getAllNetworkReadInMbps())
                            .allNetworkWriteInMbps(o.getAllNetworkWriteInMbps())
                            .allNetworkIoInMbps(o.getAllNetworkIoInMbps());

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

    @Deprecated
    public HostNetworkActivitySummary(
            java.util.Date timeCollected,
            Double allNetworkReadInMbps,
            Double allNetworkWriteInMbps,
            Double allNetworkIoInMbps) {
        super(timeCollected);
        this.allNetworkReadInMbps = allNetworkReadInMbps;
        this.allNetworkWriteInMbps = allNetworkWriteInMbps;
        this.allNetworkIoInMbps = allNetworkIoInMbps;
    }

    /**
     * All network interfaces read rate in Mbps
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
    private final Double allNetworkReadInMbps;

    public Double getAllNetworkReadInMbps() {
        return allNetworkReadInMbps;
    }

    /**
     * All network interfaces write rate in Mbps
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
    private final Double allNetworkWriteInMbps;

    public Double getAllNetworkWriteInMbps() {
        return allNetworkWriteInMbps;
    }

    /**
     * All network interfaces IO rate in Mbps
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
    private final Double allNetworkIoInMbps;

    public Double getAllNetworkIoInMbps() {
        return allNetworkIoInMbps;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HostNetworkActivitySummary(");
        sb.append("super=").append(super.toString());
        sb.append(", allNetworkReadInMbps=").append(String.valueOf(this.allNetworkReadInMbps));
        sb.append(", allNetworkWriteInMbps=").append(String.valueOf(this.allNetworkWriteInMbps));
        sb.append(", allNetworkIoInMbps=").append(String.valueOf(this.allNetworkIoInMbps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostNetworkActivitySummary)) {
            return false;
        }

        HostNetworkActivitySummary other = (HostNetworkActivitySummary) o;
        return java.util.Objects.equals(this.allNetworkReadInMbps, other.allNetworkReadInMbps)
                && java.util.Objects.equals(this.allNetworkWriteInMbps, other.allNetworkWriteInMbps)
                && java.util.Objects.equals(this.allNetworkIoInMbps, other.allNetworkIoInMbps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.allNetworkReadInMbps == null
                                ? 43
                                : this.allNetworkReadInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.allNetworkWriteInMbps == null
                                ? 43
                                : this.allNetworkWriteInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.allNetworkIoInMbps == null
                                ? 43
                                : this.allNetworkIoInMbps.hashCode());
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
