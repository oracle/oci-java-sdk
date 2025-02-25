/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Inventory for a Compute Cloud@Customer infrastructure. This information
 * cannot be updated and is from the infrastructure. The information will only be available
 * after the connectionState is transitioned to CONNECTED.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CccInfrastructureInventory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CccInfrastructureInventory
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serialNumber",
        "managementNodeCount",
        "computeNodeCount",
        "capacityStorageTrayCount",
        "performanceStorageTrayCount"
    })
    public CccInfrastructureInventory(
            String serialNumber,
            Integer managementNodeCount,
            Integer computeNodeCount,
            Integer capacityStorageTrayCount,
            Integer performanceStorageTrayCount) {
        super();
        this.serialNumber = serialNumber;
        this.managementNodeCount = managementNodeCount;
        this.computeNodeCount = computeNodeCount;
        this.capacityStorageTrayCount = capacityStorageTrayCount;
        this.performanceStorageTrayCount = performanceStorageTrayCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The serial number of the Compute Cloud@Customer infrastructure rack.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * The serial number of the Compute Cloud@Customer infrastructure rack.
         *
         * @param serialNumber the value to set
         * @return this builder
         **/
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * The number of management nodes that are available and in active use
         * on the Compute Cloud@Customer infrastructure rack.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementNodeCount")
        private Integer managementNodeCount;

        /**
         * The number of management nodes that are available and in active use
         * on the Compute Cloud@Customer infrastructure rack.
         *
         * @param managementNodeCount the value to set
         * @return this builder
         **/
        public Builder managementNodeCount(Integer managementNodeCount) {
            this.managementNodeCount = managementNodeCount;
            this.__explicitlySet__.add("managementNodeCount");
            return this;
        }
        /**
         * The number of compute nodes that are available and usable
         * on the Compute Cloud@Customer infrastructure rack. There is no distinction
         * of compute node type in this information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeNodeCount")
        private Integer computeNodeCount;

        /**
         * The number of compute nodes that are available and usable
         * on the Compute Cloud@Customer infrastructure rack. There is no distinction
         * of compute node type in this information.
         *
         * @param computeNodeCount the value to set
         * @return this builder
         **/
        public Builder computeNodeCount(Integer computeNodeCount) {
            this.computeNodeCount = computeNodeCount;
            this.__explicitlySet__.add("computeNodeCount");
            return this;
        }
        /**
         * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for capacity storage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityStorageTrayCount")
        private Integer capacityStorageTrayCount;

        /**
         * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for capacity storage.
         * @param capacityStorageTrayCount the value to set
         * @return this builder
         **/
        public Builder capacityStorageTrayCount(Integer capacityStorageTrayCount) {
            this.capacityStorageTrayCount = capacityStorageTrayCount;
            this.__explicitlySet__.add("capacityStorageTrayCount");
            return this;
        }
        /**
         * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for performance storage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("performanceStorageTrayCount")
        private Integer performanceStorageTrayCount;

        /**
         * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for performance storage.
         * @param performanceStorageTrayCount the value to set
         * @return this builder
         **/
        public Builder performanceStorageTrayCount(Integer performanceStorageTrayCount) {
            this.performanceStorageTrayCount = performanceStorageTrayCount;
            this.__explicitlySet__.add("performanceStorageTrayCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureInventory build() {
            CccInfrastructureInventory model =
                    new CccInfrastructureInventory(
                            this.serialNumber,
                            this.managementNodeCount,
                            this.computeNodeCount,
                            this.capacityStorageTrayCount,
                            this.performanceStorageTrayCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureInventory model) {
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("managementNodeCount")) {
                this.managementNodeCount(model.getManagementNodeCount());
            }
            if (model.wasPropertyExplicitlySet("computeNodeCount")) {
                this.computeNodeCount(model.getComputeNodeCount());
            }
            if (model.wasPropertyExplicitlySet("capacityStorageTrayCount")) {
                this.capacityStorageTrayCount(model.getCapacityStorageTrayCount());
            }
            if (model.wasPropertyExplicitlySet("performanceStorageTrayCount")) {
                this.performanceStorageTrayCount(model.getPerformanceStorageTrayCount());
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
     * The serial number of the Compute Cloud@Customer infrastructure rack.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * The serial number of the Compute Cloud@Customer infrastructure rack.
     *
     * @return the value
     **/
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The number of management nodes that are available and in active use
     * on the Compute Cloud@Customer infrastructure rack.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementNodeCount")
    private final Integer managementNodeCount;

    /**
     * The number of management nodes that are available and in active use
     * on the Compute Cloud@Customer infrastructure rack.
     *
     * @return the value
     **/
    public Integer getManagementNodeCount() {
        return managementNodeCount;
    }

    /**
     * The number of compute nodes that are available and usable
     * on the Compute Cloud@Customer infrastructure rack. There is no distinction
     * of compute node type in this information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeNodeCount")
    private final Integer computeNodeCount;

    /**
     * The number of compute nodes that are available and usable
     * on the Compute Cloud@Customer infrastructure rack. There is no distinction
     * of compute node type in this information.
     *
     * @return the value
     **/
    public Integer getComputeNodeCount() {
        return computeNodeCount;
    }

    /**
     * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for capacity storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityStorageTrayCount")
    private final Integer capacityStorageTrayCount;

    /**
     * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for capacity storage.
     * @return the value
     **/
    public Integer getCapacityStorageTrayCount() {
        return capacityStorageTrayCount;
    }

    /**
     * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for performance storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("performanceStorageTrayCount")
    private final Integer performanceStorageTrayCount;

    /**
     * The number of storage trays in the Compute Cloud@Customer infrastructure rack that are designated for performance storage.
     * @return the value
     **/
    public Integer getPerformanceStorageTrayCount() {
        return performanceStorageTrayCount;
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
        sb.append("CccInfrastructureInventory(");
        sb.append("super=").append(super.toString());
        sb.append("serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", managementNodeCount=").append(String.valueOf(this.managementNodeCount));
        sb.append(", computeNodeCount=").append(String.valueOf(this.computeNodeCount));
        sb.append(", capacityStorageTrayCount=")
                .append(String.valueOf(this.capacityStorageTrayCount));
        sb.append(", performanceStorageTrayCount=")
                .append(String.valueOf(this.performanceStorageTrayCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureInventory)) {
            return false;
        }

        CccInfrastructureInventory other = (CccInfrastructureInventory) o;
        return java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.managementNodeCount, other.managementNodeCount)
                && java.util.Objects.equals(this.computeNodeCount, other.computeNodeCount)
                && java.util.Objects.equals(
                        this.capacityStorageTrayCount, other.capacityStorageTrayCount)
                && java.util.Objects.equals(
                        this.performanceStorageTrayCount, other.performanceStorageTrayCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.managementNodeCount == null
                                ? 43
                                : this.managementNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.computeNodeCount == null ? 43 : this.computeNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityStorageTrayCount == null
                                ? 43
                                : this.capacityStorageTrayCount.hashCode());
        result =
                (result * PRIME)
                        + (this.performanceStorageTrayCount == null
                                ? 43
                                : this.performanceStorageTrayCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
