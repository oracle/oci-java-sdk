/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Data that defines the instance reservation configuration.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceReservationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceReservationConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

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

        @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
        private Long reservedCount;

        public Builder reservedCount(Long reservedCount) {
            this.reservedCount = reservedCount;
            this.__explicitlySet__.add("reservedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedCount")
        private Long usedCount;

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

    /**
     * The fault domain of this reservation configuration.
     * If a value is not supplied, this reservation configuration is applicable to all fault domains in the specified availability domain.
     * For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The shape to use when launching instances using compute capacity reservations. The shape determines the number of CPUs, the amount of memory,
     * and other resources allocated to the instance.
     * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    String instanceShape;

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    InstanceReservationShapeConfigDetails instanceShapeConfig;

    /**
     * The amount of capacity reserved in this configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
    Long reservedCount;

    /**
     * The amount of capacity in use out of the total capacity reserved in this reservation configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedCount")
    Long usedCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
