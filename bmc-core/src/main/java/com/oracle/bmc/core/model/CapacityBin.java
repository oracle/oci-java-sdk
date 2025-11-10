/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Total and remaining CPU and memory capacity for each capacity bucket. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CapacityBin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CapacityBin extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "capacityIndex",
        "totalOcpus",
        "remainingOcpus",
        "totalMemoryInGBs",
        "remainingMemoryInGBs",
        "supportedShapes"
    })
    public CapacityBin(
            Integer capacityIndex,
            Float totalOcpus,
            Float remainingOcpus,
            Float totalMemoryInGBs,
            Float remainingMemoryInGBs,
            java.util.List<String> supportedShapes) {
        super();
        this.capacityIndex = capacityIndex;
        this.totalOcpus = totalOcpus;
        this.remainingOcpus = remainingOcpus;
        this.totalMemoryInGBs = totalMemoryInGBs;
        this.remainingMemoryInGBs = remainingMemoryInGBs;
        this.supportedShapes = supportedShapes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Zero-based index for the corresponding capacity bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityIndex")
        private Integer capacityIndex;

        /**
         * Zero-based index for the corresponding capacity bucket.
         *
         * @param capacityIndex the value to set
         * @return this builder
         */
        public Builder capacityIndex(Integer capacityIndex) {
            this.capacityIndex = capacityIndex;
            this.__explicitlySet__.add("capacityIndex");
            return this;
        }
        /** The total OCPUs of the capacity bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
        private Float totalOcpus;

        /**
         * The total OCPUs of the capacity bucket.
         *
         * @param totalOcpus the value to set
         * @return this builder
         */
        public Builder totalOcpus(Float totalOcpus) {
            this.totalOcpus = totalOcpus;
            this.__explicitlySet__.add("totalOcpus");
            return this;
        }
        /** The available OCPUs of the capacity bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
        private Float remainingOcpus;

        /**
         * The available OCPUs of the capacity bucket.
         *
         * @param remainingOcpus the value to set
         * @return this builder
         */
        public Builder remainingOcpus(Float remainingOcpus) {
            this.remainingOcpus = remainingOcpus;
            this.__explicitlySet__.add("remainingOcpus");
            return this;
        }
        /** The total memory of the capacity bucket, in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
        private Float totalMemoryInGBs;

        /**
         * The total memory of the capacity bucket, in GBs.
         *
         * @param totalMemoryInGBs the value to set
         * @return this builder
         */
        public Builder totalMemoryInGBs(Float totalMemoryInGBs) {
            this.totalMemoryInGBs = totalMemoryInGBs;
            this.__explicitlySet__.add("totalMemoryInGBs");
            return this;
        }
        /** The remaining memory of the capacity bucket, in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
        private Float remainingMemoryInGBs;

        /**
         * The remaining memory of the capacity bucket, in GBs.
         *
         * @param remainingMemoryInGBs the value to set
         * @return this builder
         */
        public Builder remainingMemoryInGBs(Float remainingMemoryInGBs) {
            this.remainingMemoryInGBs = remainingMemoryInGBs;
            this.__explicitlySet__.add("remainingMemoryInGBs");
            return this;
        }
        /** List of VMI shapes supported on each capacity bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedShapes")
        private java.util.List<String> supportedShapes;

        /**
         * List of VMI shapes supported on each capacity bucket.
         *
         * @param supportedShapes the value to set
         * @return this builder
         */
        public Builder supportedShapes(java.util.List<String> supportedShapes) {
            this.supportedShapes = supportedShapes;
            this.__explicitlySet__.add("supportedShapes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CapacityBin build() {
            CapacityBin model =
                    new CapacityBin(
                            this.capacityIndex,
                            this.totalOcpus,
                            this.remainingOcpus,
                            this.totalMemoryInGBs,
                            this.remainingMemoryInGBs,
                            this.supportedShapes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CapacityBin model) {
            if (model.wasPropertyExplicitlySet("capacityIndex")) {
                this.capacityIndex(model.getCapacityIndex());
            }
            if (model.wasPropertyExplicitlySet("totalOcpus")) {
                this.totalOcpus(model.getTotalOcpus());
            }
            if (model.wasPropertyExplicitlySet("remainingOcpus")) {
                this.remainingOcpus(model.getRemainingOcpus());
            }
            if (model.wasPropertyExplicitlySet("totalMemoryInGBs")) {
                this.totalMemoryInGBs(model.getTotalMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("remainingMemoryInGBs")) {
                this.remainingMemoryInGBs(model.getRemainingMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("supportedShapes")) {
                this.supportedShapes(model.getSupportedShapes());
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

    /** Zero-based index for the corresponding capacity bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityIndex")
    private final Integer capacityIndex;

    /**
     * Zero-based index for the corresponding capacity bucket.
     *
     * @return the value
     */
    public Integer getCapacityIndex() {
        return capacityIndex;
    }

    /** The total OCPUs of the capacity bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
    private final Float totalOcpus;

    /**
     * The total OCPUs of the capacity bucket.
     *
     * @return the value
     */
    public Float getTotalOcpus() {
        return totalOcpus;
    }

    /** The available OCPUs of the capacity bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
    private final Float remainingOcpus;

    /**
     * The available OCPUs of the capacity bucket.
     *
     * @return the value
     */
    public Float getRemainingOcpus() {
        return remainingOcpus;
    }

    /** The total memory of the capacity bucket, in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    private final Float totalMemoryInGBs;

    /**
     * The total memory of the capacity bucket, in GBs.
     *
     * @return the value
     */
    public Float getTotalMemoryInGBs() {
        return totalMemoryInGBs;
    }

    /** The remaining memory of the capacity bucket, in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
    private final Float remainingMemoryInGBs;

    /**
     * The remaining memory of the capacity bucket, in GBs.
     *
     * @return the value
     */
    public Float getRemainingMemoryInGBs() {
        return remainingMemoryInGBs;
    }

    /** List of VMI shapes supported on each capacity bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedShapes")
    private final java.util.List<String> supportedShapes;

    /**
     * List of VMI shapes supported on each capacity bucket.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedShapes() {
        return supportedShapes;
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
        sb.append("CapacityBin(");
        sb.append("super=").append(super.toString());
        sb.append("capacityIndex=").append(String.valueOf(this.capacityIndex));
        sb.append(", totalOcpus=").append(String.valueOf(this.totalOcpus));
        sb.append(", remainingOcpus=").append(String.valueOf(this.remainingOcpus));
        sb.append(", totalMemoryInGBs=").append(String.valueOf(this.totalMemoryInGBs));
        sb.append(", remainingMemoryInGBs=").append(String.valueOf(this.remainingMemoryInGBs));
        sb.append(", supportedShapes=").append(String.valueOf(this.supportedShapes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityBin)) {
            return false;
        }

        CapacityBin other = (CapacityBin) o;
        return java.util.Objects.equals(this.capacityIndex, other.capacityIndex)
                && java.util.Objects.equals(this.totalOcpus, other.totalOcpus)
                && java.util.Objects.equals(this.remainingOcpus, other.remainingOcpus)
                && java.util.Objects.equals(this.totalMemoryInGBs, other.totalMemoryInGBs)
                && java.util.Objects.equals(this.remainingMemoryInGBs, other.remainingMemoryInGBs)
                && java.util.Objects.equals(this.supportedShapes, other.supportedShapes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.capacityIndex == null ? 43 : this.capacityIndex.hashCode());
        result = (result * PRIME) + (this.totalOcpus == null ? 43 : this.totalOcpus.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingOcpus == null ? 43 : this.remainingOcpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryInGBs == null ? 43 : this.totalMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingMemoryInGBs == null
                                ? 43
                                : this.remainingMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedShapes == null ? 43 : this.supportedShapes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
