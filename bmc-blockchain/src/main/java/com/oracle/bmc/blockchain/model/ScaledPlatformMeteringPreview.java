/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Metering Preview after Scaling <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScaledPlatformMeteringPreview.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScaledPlatformMeteringPreview
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalOcpuAllocation",
        "totalOcpuAllocationPostScaling",
        "storageMeteredUnits",
        "extraStorageMeteredUnits",
        "storageMeteredUnitsPostScaling"
    })
    public ScaledPlatformMeteringPreview(
            Float totalOcpuAllocation,
            Float totalOcpuAllocationPostScaling,
            Double storageMeteredUnits,
            Double extraStorageMeteredUnits,
            Double storageMeteredUnitsPostScaling) {
        super();
        this.totalOcpuAllocation = totalOcpuAllocation;
        this.totalOcpuAllocationPostScaling = totalOcpuAllocationPostScaling;
        this.storageMeteredUnits = storageMeteredUnits;
        this.extraStorageMeteredUnits = extraStorageMeteredUnits;
        this.storageMeteredUnitsPostScaling = storageMeteredUnitsPostScaling;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of total OCPU allocation for the blockchain platform */
        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuAllocation")
        private Float totalOcpuAllocation;

        /**
         * Number of total OCPU allocation for the blockchain platform
         *
         * @param totalOcpuAllocation the value to set
         * @return this builder
         */
        public Builder totalOcpuAllocation(Float totalOcpuAllocation) {
            this.totalOcpuAllocation = totalOcpuAllocation;
            this.__explicitlySet__.add("totalOcpuAllocation");
            return this;
        }
        /** Number of total OCPU allocation for the blockchain platform after Scaling */
        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuAllocationPostScaling")
        private Float totalOcpuAllocationPostScaling;

        /**
         * Number of total OCPU allocation for the blockchain platform after Scaling
         *
         * @param totalOcpuAllocationPostScaling the value to set
         * @return this builder
         */
        public Builder totalOcpuAllocationPostScaling(Float totalOcpuAllocationPostScaling) {
            this.totalOcpuAllocationPostScaling = totalOcpuAllocationPostScaling;
            this.__explicitlySet__.add("totalOcpuAllocationPostScaling");
            return this;
        }
        /** Current Storage metered units in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageMeteredUnits")
        private Double storageMeteredUnits;

        /**
         * Current Storage metered units in TBs
         *
         * @param storageMeteredUnits the value to set
         * @return this builder
         */
        public Builder storageMeteredUnits(Double storageMeteredUnits) {
            this.storageMeteredUnits = storageMeteredUnits;
            this.__explicitlySet__.add("storageMeteredUnits");
            return this;
        }
        /** Extra Storage units required in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("extraStorageMeteredUnits")
        private Double extraStorageMeteredUnits;

        /**
         * Extra Storage units required in TBs
         *
         * @param extraStorageMeteredUnits the value to set
         * @return this builder
         */
        public Builder extraStorageMeteredUnits(Double extraStorageMeteredUnits) {
            this.extraStorageMeteredUnits = extraStorageMeteredUnits;
            this.__explicitlySet__.add("extraStorageMeteredUnits");
            return this;
        }
        /** Total Post Scaling Storage metered units in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageMeteredUnitsPostScaling")
        private Double storageMeteredUnitsPostScaling;

        /**
         * Total Post Scaling Storage metered units in TBs
         *
         * @param storageMeteredUnitsPostScaling the value to set
         * @return this builder
         */
        public Builder storageMeteredUnitsPostScaling(Double storageMeteredUnitsPostScaling) {
            this.storageMeteredUnitsPostScaling = storageMeteredUnitsPostScaling;
            this.__explicitlySet__.add("storageMeteredUnitsPostScaling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaledPlatformMeteringPreview build() {
            ScaledPlatformMeteringPreview model =
                    new ScaledPlatformMeteringPreview(
                            this.totalOcpuAllocation,
                            this.totalOcpuAllocationPostScaling,
                            this.storageMeteredUnits,
                            this.extraStorageMeteredUnits,
                            this.storageMeteredUnitsPostScaling);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaledPlatformMeteringPreview model) {
            if (model.wasPropertyExplicitlySet("totalOcpuAllocation")) {
                this.totalOcpuAllocation(model.getTotalOcpuAllocation());
            }
            if (model.wasPropertyExplicitlySet("totalOcpuAllocationPostScaling")) {
                this.totalOcpuAllocationPostScaling(model.getTotalOcpuAllocationPostScaling());
            }
            if (model.wasPropertyExplicitlySet("storageMeteredUnits")) {
                this.storageMeteredUnits(model.getStorageMeteredUnits());
            }
            if (model.wasPropertyExplicitlySet("extraStorageMeteredUnits")) {
                this.extraStorageMeteredUnits(model.getExtraStorageMeteredUnits());
            }
            if (model.wasPropertyExplicitlySet("storageMeteredUnitsPostScaling")) {
                this.storageMeteredUnitsPostScaling(model.getStorageMeteredUnitsPostScaling());
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

    /** Number of total OCPU allocation for the blockchain platform */
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuAllocation")
    private final Float totalOcpuAllocation;

    /**
     * Number of total OCPU allocation for the blockchain platform
     *
     * @return the value
     */
    public Float getTotalOcpuAllocation() {
        return totalOcpuAllocation;
    }

    /** Number of total OCPU allocation for the blockchain platform after Scaling */
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuAllocationPostScaling")
    private final Float totalOcpuAllocationPostScaling;

    /**
     * Number of total OCPU allocation for the blockchain platform after Scaling
     *
     * @return the value
     */
    public Float getTotalOcpuAllocationPostScaling() {
        return totalOcpuAllocationPostScaling;
    }

    /** Current Storage metered units in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageMeteredUnits")
    private final Double storageMeteredUnits;

    /**
     * Current Storage metered units in TBs
     *
     * @return the value
     */
    public Double getStorageMeteredUnits() {
        return storageMeteredUnits;
    }

    /** Extra Storage units required in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("extraStorageMeteredUnits")
    private final Double extraStorageMeteredUnits;

    /**
     * Extra Storage units required in TBs
     *
     * @return the value
     */
    public Double getExtraStorageMeteredUnits() {
        return extraStorageMeteredUnits;
    }

    /** Total Post Scaling Storage metered units in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageMeteredUnitsPostScaling")
    private final Double storageMeteredUnitsPostScaling;

    /**
     * Total Post Scaling Storage metered units in TBs
     *
     * @return the value
     */
    public Double getStorageMeteredUnitsPostScaling() {
        return storageMeteredUnitsPostScaling;
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
        sb.append("ScaledPlatformMeteringPreview(");
        sb.append("super=").append(super.toString());
        sb.append("totalOcpuAllocation=").append(String.valueOf(this.totalOcpuAllocation));
        sb.append(", totalOcpuAllocationPostScaling=")
                .append(String.valueOf(this.totalOcpuAllocationPostScaling));
        sb.append(", storageMeteredUnits=").append(String.valueOf(this.storageMeteredUnits));
        sb.append(", extraStorageMeteredUnits=")
                .append(String.valueOf(this.extraStorageMeteredUnits));
        sb.append(", storageMeteredUnitsPostScaling=")
                .append(String.valueOf(this.storageMeteredUnitsPostScaling));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaledPlatformMeteringPreview)) {
            return false;
        }

        ScaledPlatformMeteringPreview other = (ScaledPlatformMeteringPreview) o;
        return java.util.Objects.equals(this.totalOcpuAllocation, other.totalOcpuAllocation)
                && java.util.Objects.equals(
                        this.totalOcpuAllocationPostScaling, other.totalOcpuAllocationPostScaling)
                && java.util.Objects.equals(this.storageMeteredUnits, other.storageMeteredUnits)
                && java.util.Objects.equals(
                        this.extraStorageMeteredUnits, other.extraStorageMeteredUnits)
                && java.util.Objects.equals(
                        this.storageMeteredUnitsPostScaling, other.storageMeteredUnitsPostScaling)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalOcpuAllocation == null
                                ? 43
                                : this.totalOcpuAllocation.hashCode());
        result =
                (result * PRIME)
                        + (this.totalOcpuAllocationPostScaling == null
                                ? 43
                                : this.totalOcpuAllocationPostScaling.hashCode());
        result =
                (result * PRIME)
                        + (this.storageMeteredUnits == null
                                ? 43
                                : this.storageMeteredUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.extraStorageMeteredUnits == null
                                ? 43
                                : this.extraStorageMeteredUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.storageMeteredUnitsPostScaling == null
                                ? 43
                                : this.storageMeteredUnitsPostScaling.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
