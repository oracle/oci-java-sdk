/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Capacity details of the Database Infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeCapacityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeCapacityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalCores",
        "allocatedCores",
        "reservedCores",
        "availableCores",
        "totalMemoryInGBs",
        "usedMemoryInGBs",
        "reservedMemoryInGBs",
        "availableMemoryInGBs"
    })
    public ComputeCapacityDetails(
            Integer totalCores,
            Integer allocatedCores,
            Integer reservedCores,
            Integer availableCores,
            Long totalMemoryInGBs,
            Long usedMemoryInGBs,
            Long reservedMemoryInGBs,
            Long availableMemoryInGBs) {
        super();
        this.totalCores = totalCores;
        this.allocatedCores = allocatedCores;
        this.reservedCores = reservedCores;
        this.availableCores = availableCores;
        this.totalMemoryInGBs = totalMemoryInGBs;
        this.usedMemoryInGBs = usedMemoryInGBs;
        this.reservedMemoryInGBs = reservedMemoryInGBs;
        this.availableMemoryInGBs = availableMemoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total CPU cores count. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCores")
        private Integer totalCores;

        /**
         * Total CPU cores count.
         *
         * @param totalCores the value to set
         * @return this builder
         */
        public Builder totalCores(Integer totalCores) {
            this.totalCores = totalCores;
            this.__explicitlySet__.add("totalCores");
            return this;
        }
        /** Total CPU cores count allocated.. */
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedCores")
        private Integer allocatedCores;

        /**
         * Total CPU cores count allocated..
         *
         * @param allocatedCores the value to set
         * @return this builder
         */
        public Builder allocatedCores(Integer allocatedCores) {
            this.allocatedCores = allocatedCores;
            this.__explicitlySet__.add("allocatedCores");
            return this;
        }
        /** Total Reserved CPU cores count. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCores")
        private Integer reservedCores;

        /**
         * Total Reserved CPU cores count.
         *
         * @param reservedCores the value to set
         * @return this builder
         */
        public Builder reservedCores(Integer reservedCores) {
            this.reservedCores = reservedCores;
            this.__explicitlySet__.add("reservedCores");
            return this;
        }
        /** Total available CPU cores count. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCores")
        private Integer availableCores;

        /**
         * Total available CPU cores count.
         *
         * @param availableCores the value to set
         * @return this builder
         */
        public Builder availableCores(Integer availableCores) {
            this.availableCores = availableCores;
            this.__explicitlySet__.add("availableCores");
            return this;
        }
        /** Total memory allocated, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
        private Long totalMemoryInGBs;

        /**
         * Total memory allocated, in gigabytes (GB).
         *
         * @param totalMemoryInGBs the value to set
         * @return this builder
         */
        public Builder totalMemoryInGBs(Long totalMemoryInGBs) {
            this.totalMemoryInGBs = totalMemoryInGBs;
            this.__explicitlySet__.add("totalMemoryInGBs");
            return this;
        }
        /**
         * Memory allocated to Oracle database virtual machine cluster or Instance, in gigabytes
         * (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedMemoryInGBs")
        private Long usedMemoryInGBs;

        /**
         * Memory allocated to Oracle database virtual machine cluster or Instance, in gigabytes
         * (GB).
         *
         * @param usedMemoryInGBs the value to set
         * @return this builder
         */
        public Builder usedMemoryInGBs(Long usedMemoryInGBs) {
            this.usedMemoryInGBs = usedMemoryInGBs;
            this.__explicitlySet__.add("usedMemoryInGBs");
            return this;
        }
        /** Reserved memory, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedMemoryInGBs")
        private Long reservedMemoryInGBs;

        /**
         * Reserved memory, in gigabytes (GB).
         *
         * @param reservedMemoryInGBs the value to set
         * @return this builder
         */
        public Builder reservedMemoryInGBs(Long reservedMemoryInGBs) {
            this.reservedMemoryInGBs = reservedMemoryInGBs;
            this.__explicitlySet__.add("reservedMemoryInGBs");
            return this;
        }
        /** Available memory, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
        private Long availableMemoryInGBs;

        /**
         * Available memory, in gigabytes (GB).
         *
         * @param availableMemoryInGBs the value to set
         * @return this builder
         */
        public Builder availableMemoryInGBs(Long availableMemoryInGBs) {
            this.availableMemoryInGBs = availableMemoryInGBs;
            this.__explicitlySet__.add("availableMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeCapacityDetails build() {
            ComputeCapacityDetails model =
                    new ComputeCapacityDetails(
                            this.totalCores,
                            this.allocatedCores,
                            this.reservedCores,
                            this.availableCores,
                            this.totalMemoryInGBs,
                            this.usedMemoryInGBs,
                            this.reservedMemoryInGBs,
                            this.availableMemoryInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeCapacityDetails model) {
            if (model.wasPropertyExplicitlySet("totalCores")) {
                this.totalCores(model.getTotalCores());
            }
            if (model.wasPropertyExplicitlySet("allocatedCores")) {
                this.allocatedCores(model.getAllocatedCores());
            }
            if (model.wasPropertyExplicitlySet("reservedCores")) {
                this.reservedCores(model.getReservedCores());
            }
            if (model.wasPropertyExplicitlySet("availableCores")) {
                this.availableCores(model.getAvailableCores());
            }
            if (model.wasPropertyExplicitlySet("totalMemoryInGBs")) {
                this.totalMemoryInGBs(model.getTotalMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("usedMemoryInGBs")) {
                this.usedMemoryInGBs(model.getUsedMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("reservedMemoryInGBs")) {
                this.reservedMemoryInGBs(model.getReservedMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableMemoryInGBs")) {
                this.availableMemoryInGBs(model.getAvailableMemoryInGBs());
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

    /** Total CPU cores count. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCores")
    private final Integer totalCores;

    /**
     * Total CPU cores count.
     *
     * @return the value
     */
    public Integer getTotalCores() {
        return totalCores;
    }

    /** Total CPU cores count allocated.. */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedCores")
    private final Integer allocatedCores;

    /**
     * Total CPU cores count allocated..
     *
     * @return the value
     */
    public Integer getAllocatedCores() {
        return allocatedCores;
    }

    /** Total Reserved CPU cores count. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCores")
    private final Integer reservedCores;

    /**
     * Total Reserved CPU cores count.
     *
     * @return the value
     */
    public Integer getReservedCores() {
        return reservedCores;
    }

    /** Total available CPU cores count. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCores")
    private final Integer availableCores;

    /**
     * Total available CPU cores count.
     *
     * @return the value
     */
    public Integer getAvailableCores() {
        return availableCores;
    }

    /** Total memory allocated, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    private final Long totalMemoryInGBs;

    /**
     * Total memory allocated, in gigabytes (GB).
     *
     * @return the value
     */
    public Long getTotalMemoryInGBs() {
        return totalMemoryInGBs;
    }

    /**
     * Memory allocated to Oracle database virtual machine cluster or Instance, in gigabytes (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedMemoryInGBs")
    private final Long usedMemoryInGBs;

    /**
     * Memory allocated to Oracle database virtual machine cluster or Instance, in gigabytes (GB).
     *
     * @return the value
     */
    public Long getUsedMemoryInGBs() {
        return usedMemoryInGBs;
    }

    /** Reserved memory, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedMemoryInGBs")
    private final Long reservedMemoryInGBs;

    /**
     * Reserved memory, in gigabytes (GB).
     *
     * @return the value
     */
    public Long getReservedMemoryInGBs() {
        return reservedMemoryInGBs;
    }

    /** Available memory, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
    private final Long availableMemoryInGBs;

    /**
     * Available memory, in gigabytes (GB).
     *
     * @return the value
     */
    public Long getAvailableMemoryInGBs() {
        return availableMemoryInGBs;
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
        sb.append("ComputeCapacityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("totalCores=").append(String.valueOf(this.totalCores));
        sb.append(", allocatedCores=").append(String.valueOf(this.allocatedCores));
        sb.append(", reservedCores=").append(String.valueOf(this.reservedCores));
        sb.append(", availableCores=").append(String.valueOf(this.availableCores));
        sb.append(", totalMemoryInGBs=").append(String.valueOf(this.totalMemoryInGBs));
        sb.append(", usedMemoryInGBs=").append(String.valueOf(this.usedMemoryInGBs));
        sb.append(", reservedMemoryInGBs=").append(String.valueOf(this.reservedMemoryInGBs));
        sb.append(", availableMemoryInGBs=").append(String.valueOf(this.availableMemoryInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeCapacityDetails)) {
            return false;
        }

        ComputeCapacityDetails other = (ComputeCapacityDetails) o;
        return java.util.Objects.equals(this.totalCores, other.totalCores)
                && java.util.Objects.equals(this.allocatedCores, other.allocatedCores)
                && java.util.Objects.equals(this.reservedCores, other.reservedCores)
                && java.util.Objects.equals(this.availableCores, other.availableCores)
                && java.util.Objects.equals(this.totalMemoryInGBs, other.totalMemoryInGBs)
                && java.util.Objects.equals(this.usedMemoryInGBs, other.usedMemoryInGBs)
                && java.util.Objects.equals(this.reservedMemoryInGBs, other.reservedMemoryInGBs)
                && java.util.Objects.equals(this.availableMemoryInGBs, other.availableMemoryInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCores == null ? 43 : this.totalCores.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedCores == null ? 43 : this.allocatedCores.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedCores == null ? 43 : this.reservedCores.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCores == null ? 43 : this.availableCores.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryInGBs == null ? 43 : this.totalMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.usedMemoryInGBs == null ? 43 : this.usedMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedMemoryInGBs == null
                                ? 43
                                : this.reservedMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableMemoryInGBs == null
                                ? 43
                                : this.availableMemoryInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
