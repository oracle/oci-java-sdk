/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains io statistics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostIoStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "resourceName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostIoStatistics extends HostResourceStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskReadInMBs")
        private Double diskReadInMBs;

        public Builder diskReadInMBs(Double diskReadInMBs) {
            this.diskReadInMBs = diskReadInMBs;
            this.__explicitlySet__.add("diskReadInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskWriteInMBs")
        private Double diskWriteInMBs;

        public Builder diskWriteInMBs(Double diskWriteInMBs) {
            this.diskWriteInMBs = diskWriteInMBs;
            this.__explicitlySet__.add("diskWriteInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
        private Double diskIops;

        public Builder diskIops(Double diskIops) {
            this.diskIops = diskIops;
            this.__explicitlySet__.add("diskIops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostIoStatistics build() {
            HostIoStatistics model =
                    new HostIoStatistics(
                            this.usage,
                            this.capacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.diskReadInMBs,
                            this.diskWriteInMBs,
                            this.diskIops);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostIoStatistics model) {
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("utilizationPercent")) {
                this.utilizationPercent(model.getUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("usageChangePercent")) {
                this.usageChangePercent(model.getUsageChangePercent());
            }
            if (model.wasPropertyExplicitlySet("diskReadInMBs")) {
                this.diskReadInMBs(model.getDiskReadInMBs());
            }
            if (model.wasPropertyExplicitlySet("diskWriteInMBs")) {
                this.diskWriteInMBs(model.getDiskWriteInMBs());
            }
            if (model.wasPropertyExplicitlySet("diskIops")) {
                this.diskIops(model.getDiskIops());
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

    @Deprecated
    public HostIoStatistics(
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent,
            Double diskReadInMBs,
            Double diskWriteInMBs,
            Double diskIops) {
        super(usage, capacity, utilizationPercent, usageChangePercent);
        this.diskReadInMBs = diskReadInMBs;
        this.diskWriteInMBs = diskWriteInMBs;
        this.diskIops = diskIops;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("diskReadInMBs")
    private final Double diskReadInMBs;

    public Double getDiskReadInMBs() {
        return diskReadInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("diskWriteInMBs")
    private final Double diskWriteInMBs;

    public Double getDiskWriteInMBs() {
        return diskWriteInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
    private final Double diskIops;

    public Double getDiskIops() {
        return diskIops;
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
        sb.append("HostIoStatistics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", diskReadInMBs=").append(String.valueOf(this.diskReadInMBs));
        sb.append(", diskWriteInMBs=").append(String.valueOf(this.diskWriteInMBs));
        sb.append(", diskIops=").append(String.valueOf(this.diskIops));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostIoStatistics)) {
            return false;
        }

        HostIoStatistics other = (HostIoStatistics) o;
        return java.util.Objects.equals(this.diskReadInMBs, other.diskReadInMBs)
                && java.util.Objects.equals(this.diskWriteInMBs, other.diskWriteInMBs)
                && java.util.Objects.equals(this.diskIops, other.diskIops)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.diskReadInMBs == null ? 43 : this.diskReadInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.diskWriteInMBs == null ? 43 : this.diskWriteInMBs.hashCode());
        result = (result * PRIME) + (this.diskIops == null ? 43 : this.diskIops.hashCode());
        return result;
    }
}
