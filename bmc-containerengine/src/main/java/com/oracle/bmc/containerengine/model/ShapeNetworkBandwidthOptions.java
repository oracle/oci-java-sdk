/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Properties of network bandwidth. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapeNetworkBandwidthOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeNetworkBandwidthOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"minInGbps", "maxInGbps", "defaultPerOcpuInGbps"})
    public ShapeNetworkBandwidthOptions(
            Float minInGbps, Float maxInGbps, Float defaultPerOcpuInGbps) {
        super();
        this.minInGbps = minInGbps;
        this.maxInGbps = maxInGbps;
        this.defaultPerOcpuInGbps = defaultPerOcpuInGbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The minimum amount of networking bandwidth, in gigabits per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
        private Float minInGbps;

        /**
         * The minimum amount of networking bandwidth, in gigabits per second.
         *
         * @param minInGbps the value to set
         * @return this builder
         */
        public Builder minInGbps(Float minInGbps) {
            this.minInGbps = minInGbps;
            this.__explicitlySet__.add("minInGbps");
            return this;
        }
        /** The maximum amount of networking bandwidth, in gigabits per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
        private Float maxInGbps;

        /**
         * The maximum amount of networking bandwidth, in gigabits per second.
         *
         * @param maxInGbps the value to set
         * @return this builder
         */
        public Builder maxInGbps(Float maxInGbps) {
            this.maxInGbps = maxInGbps;
            this.__explicitlySet__.add("maxInGbps");
            return this;
        }
        /** The default amount of networking bandwidth per OCPU, in gigabits per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
        private Float defaultPerOcpuInGbps;

        /**
         * The default amount of networking bandwidth per OCPU, in gigabits per second.
         *
         * @param defaultPerOcpuInGbps the value to set
         * @return this builder
         */
        public Builder defaultPerOcpuInGbps(Float defaultPerOcpuInGbps) {
            this.defaultPerOcpuInGbps = defaultPerOcpuInGbps;
            this.__explicitlySet__.add("defaultPerOcpuInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeNetworkBandwidthOptions build() {
            ShapeNetworkBandwidthOptions model =
                    new ShapeNetworkBandwidthOptions(
                            this.minInGbps, this.maxInGbps, this.defaultPerOcpuInGbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeNetworkBandwidthOptions model) {
            if (model.wasPropertyExplicitlySet("minInGbps")) {
                this.minInGbps(model.getMinInGbps());
            }
            if (model.wasPropertyExplicitlySet("maxInGbps")) {
                this.maxInGbps(model.getMaxInGbps());
            }
            if (model.wasPropertyExplicitlySet("defaultPerOcpuInGbps")) {
                this.defaultPerOcpuInGbps(model.getDefaultPerOcpuInGbps());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The minimum amount of networking bandwidth, in gigabits per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
    private final Float minInGbps;

    /**
     * The minimum amount of networking bandwidth, in gigabits per second.
     *
     * @return the value
     */
    public Float getMinInGbps() {
        return minInGbps;
    }

    /** The maximum amount of networking bandwidth, in gigabits per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
    private final Float maxInGbps;

    /**
     * The maximum amount of networking bandwidth, in gigabits per second.
     *
     * @return the value
     */
    public Float getMaxInGbps() {
        return maxInGbps;
    }

    /** The default amount of networking bandwidth per OCPU, in gigabits per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
    private final Float defaultPerOcpuInGbps;

    /**
     * The default amount of networking bandwidth per OCPU, in gigabits per second.
     *
     * @return the value
     */
    public Float getDefaultPerOcpuInGbps() {
        return defaultPerOcpuInGbps;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeNetworkBandwidthOptions(");
        sb.append("super=").append(super.toString());
        sb.append("minInGbps=").append(String.valueOf(this.minInGbps));
        sb.append(", maxInGbps=").append(String.valueOf(this.maxInGbps));
        sb.append(", defaultPerOcpuInGbps=").append(String.valueOf(this.defaultPerOcpuInGbps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeNetworkBandwidthOptions)) {
            return false;
        }

        ShapeNetworkBandwidthOptions other = (ShapeNetworkBandwidthOptions) o;
        return java.util.Objects.equals(this.minInGbps, other.minInGbps)
                && java.util.Objects.equals(this.maxInGbps, other.maxInGbps)
                && java.util.Objects.equals(this.defaultPerOcpuInGbps, other.defaultPerOcpuInGbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minInGbps == null ? 43 : this.minInGbps.hashCode());
        result = (result * PRIME) + (this.maxInGbps == null ? 43 : this.maxInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPerOcpuInGbps == null
                                ? 43
                                : this.defaultPerOcpuInGbps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
