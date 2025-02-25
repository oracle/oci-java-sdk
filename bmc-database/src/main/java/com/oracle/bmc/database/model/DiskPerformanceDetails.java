/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Representation of disk performance detail parameters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DiskPerformanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiskPerformanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"diskIops", "diskThroughputInMbps"})
    public DiskPerformanceDetails(Float diskIops, Float diskThroughputInMbps) {
        super();
        this.diskIops = diskIops;
        this.diskThroughputInMbps = diskThroughputInMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Disk IOPS in thousands.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
        private Float diskIops;

        /**
         * Disk IOPS in thousands.
         * @param diskIops the value to set
         * @return this builder
         **/
        public Builder diskIops(Float diskIops) {
            this.diskIops = diskIops;
            this.__explicitlySet__.add("diskIops");
            return this;
        }
        /**
         * Disk Throughput in Mbps.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskThroughputInMbps")
        private Float diskThroughputInMbps;

        /**
         * Disk Throughput in Mbps.
         * @param diskThroughputInMbps the value to set
         * @return this builder
         **/
        public Builder diskThroughputInMbps(Float diskThroughputInMbps) {
            this.diskThroughputInMbps = diskThroughputInMbps;
            this.__explicitlySet__.add("diskThroughputInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiskPerformanceDetails build() {
            DiskPerformanceDetails model =
                    new DiskPerformanceDetails(this.diskIops, this.diskThroughputInMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiskPerformanceDetails model) {
            if (model.wasPropertyExplicitlySet("diskIops")) {
                this.diskIops(model.getDiskIops());
            }
            if (model.wasPropertyExplicitlySet("diskThroughputInMbps")) {
                this.diskThroughputInMbps(model.getDiskThroughputInMbps());
            }
            return this;
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
     * Disk IOPS in thousands.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
    private final Float diskIops;

    /**
     * Disk IOPS in thousands.
     * @return the value
     **/
    public Float getDiskIops() {
        return diskIops;
    }

    /**
     * Disk Throughput in Mbps.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskThroughputInMbps")
    private final Float diskThroughputInMbps;

    /**
     * Disk Throughput in Mbps.
     * @return the value
     **/
    public Float getDiskThroughputInMbps() {
        return diskThroughputInMbps;
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
        sb.append("DiskPerformanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("diskIops=").append(String.valueOf(this.diskIops));
        sb.append(", diskThroughputInMbps=").append(String.valueOf(this.diskThroughputInMbps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiskPerformanceDetails)) {
            return false;
        }

        DiskPerformanceDetails other = (DiskPerformanceDetails) o;
        return java.util.Objects.equals(this.diskIops, other.diskIops)
                && java.util.Objects.equals(this.diskThroughputInMbps, other.diskThroughputInMbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.diskIops == null ? 43 : this.diskIops.hashCode());
        result =
                (result * PRIME)
                        + (this.diskThroughputInMbps == null
                                ? 43
                                : this.diskThroughputInMbps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
