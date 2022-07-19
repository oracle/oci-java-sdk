/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Data that defines the capacity configuration.
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
    builder = InstanceReservationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceReservationConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "faultDomain",
        "instanceShape",
        "instanceShapeConfig",
        "reservedCount",
        "usedCount"
    })
    public InstanceReservationConfig(
            String faultDomain,
            String instanceShape,
            InstanceReservationShapeConfigDetails instanceShapeConfig,
            Long reservedCount,
            Long usedCount) {
        super();
        this.faultDomain = faultDomain;
        this.instanceShape = instanceShape;
        this.instanceShapeConfig = instanceShapeConfig;
        this.reservedCount = reservedCount;
        this.usedCount = usedCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fault domain of this capacity configuration.
         * If a value is not supplied, this capacity configuration is applicable to all fault domains in the specified availability domain.
         * For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain of this capacity configuration.
         * If a value is not supplied, this capacity configuration is applicable to all fault domains in the specified availability domain.
         * For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
         *
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory,
         * and other resources allocated to the instance.
         * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory,
         * and other resources allocated to the instance.
         * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
         *
         * @param instanceShape the value to set
         * @return this builder
         **/
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = instanceShape;
            this.__explicitlySet__.add("instanceShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
        private InstanceReservationShapeConfigDetails instanceShapeConfig;

        public Builder instanceShapeConfig(
                InstanceReservationShapeConfigDetails instanceShapeConfig) {
            this.instanceShapeConfig = instanceShapeConfig;
            this.__explicitlySet__.add("instanceShapeConfig");
            return this;
        }
        /**
         * The total number of instances that can be launched from the capacity configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
        private Long reservedCount;

        /**
         * The total number of instances that can be launched from the capacity configuration.
         * @param reservedCount the value to set
         * @return this builder
         **/
        public Builder reservedCount(Long reservedCount) {
            this.reservedCount = reservedCount;
            this.__explicitlySet__.add("reservedCount");
            return this;
        }
        /**
         * The amount of capacity in use out of the total capacity reserved in this capacity configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usedCount")
        private Long usedCount;

        /**
         * The amount of capacity in use out of the total capacity reserved in this capacity configuration.
         * @param usedCount the value to set
         * @return this builder
         **/
        public Builder usedCount(Long usedCount) {
            this.usedCount = usedCount;
            this.__explicitlySet__.add("usedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceReservationConfig build() {
            InstanceReservationConfig __instance__ =
                    new InstanceReservationConfig(
                            faultDomain,
                            instanceShape,
                            instanceShapeConfig,
                            reservedCount,
                            usedCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceReservationConfig o) {
            Builder copiedBuilder =
                    faultDomain(o.getFaultDomain())
                            .instanceShape(o.getInstanceShape())
                            .instanceShapeConfig(o.getInstanceShapeConfig())
                            .reservedCount(o.getReservedCount())
                            .usedCount(o.getUsedCount());

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
     * The fault domain of this capacity configuration.
     * If a value is not supplied, this capacity configuration is applicable to all fault domains in the specified availability domain.
     * For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain of this capacity configuration.
     * If a value is not supplied, this capacity configuration is applicable to all fault domains in the specified availability domain.
     * For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     *
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory,
     * and other resources allocated to the instance.
     * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory,
     * and other resources allocated to the instance.
     * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     * @return the value
     **/
    public String getInstanceShape() {
        return instanceShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    private final InstanceReservationShapeConfigDetails instanceShapeConfig;

    public InstanceReservationShapeConfigDetails getInstanceShapeConfig() {
        return instanceShapeConfig;
    }

    /**
     * The total number of instances that can be launched from the capacity configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
    private final Long reservedCount;

    /**
     * The total number of instances that can be launched from the capacity configuration.
     * @return the value
     **/
    public Long getReservedCount() {
        return reservedCount;
    }

    /**
     * The amount of capacity in use out of the total capacity reserved in this capacity configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedCount")
    private final Long usedCount;

    /**
     * The amount of capacity in use out of the total capacity reserved in this capacity configuration.
     * @return the value
     **/
    public Long getUsedCount() {
        return usedCount;
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
        sb.append("InstanceReservationConfig(");
        sb.append("faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", instanceShapeConfig=").append(String.valueOf(this.instanceShapeConfig));
        sb.append(", reservedCount=").append(String.valueOf(this.reservedCount));
        sb.append(", usedCount=").append(String.valueOf(this.usedCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceReservationConfig)) {
            return false;
        }

        InstanceReservationConfig other = (InstanceReservationConfig) o;
        return java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.instanceShapeConfig, other.instanceShapeConfig)
                && java.util.Objects.equals(this.reservedCount, other.reservedCount)
                && java.util.Objects.equals(this.usedCount, other.usedCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeConfig == null
                                ? 43
                                : this.instanceShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedCount == null ? 43 : this.reservedCount.hashCode());
        result = (result * PRIME) + (this.usedCount == null ? 43 : this.usedCount.hashCode());
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
