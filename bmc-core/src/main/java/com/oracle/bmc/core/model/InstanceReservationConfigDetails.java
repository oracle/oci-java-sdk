/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A template that contains the settings to use when defining the instance capacity configuration.
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
    builder = InstanceReservationConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceReservationConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
        private Long reservedCount;

        public Builder reservedCount(Long reservedCount) {
            this.reservedCount = reservedCount;
            this.__explicitlySet__.add("reservedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceReservationConfigDetails build() {
            InstanceReservationConfigDetails __instance__ =
                    new InstanceReservationConfigDetails(
                            instanceShape, instanceShapeConfig, faultDomain, reservedCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceReservationConfigDetails o) {
            Builder copiedBuilder =
                    instanceShape(o.getInstanceShape())
                            .instanceShapeConfig(o.getInstanceShapeConfig())
                            .faultDomain(o.getFaultDomain())
                            .reservedCount(o.getReservedCount());

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
     * The shape requested when launching instances using reserved capacity.
     * The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    String instanceShape;

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    InstanceReservationShapeConfigDetails instanceShapeConfig;

    /**
     * The fault domain to use for instances created using this capacity configuration.
     * For more information, see [Fault Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault).
     * If you do not specify the fault domain, the capacity is available for an instance
     * that does not specify a fault domain. To change the fault domain for a reservation,
     * delete the reservation and create a new one in the preferred fault domain.
     * <p>
     * To retrieve a list of fault domains, use the {@code ListFaultDomains} operation in
     * the [Identity and Access Management Service API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
     * <p>
     * Example: {@code FAULT-DOMAIN-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The total number of instances that can be launched from the capacity configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
    Long reservedCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
