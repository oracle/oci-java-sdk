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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceReservationConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceReservationConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceShape",
        "instanceShapeConfig",
        "faultDomain",
        "reservedCount"
    })
    public InstanceReservationConfigDetails(
            String instanceShape,
            InstanceReservationShapeConfigDetails instanceShapeConfig,
            String faultDomain,
            Long reservedCount) {
        super();
        this.instanceShape = instanceShape;
        this.instanceShapeConfig = instanceShapeConfig;
        this.faultDomain = faultDomain;
        this.reservedCount = reservedCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The shape requested when launching instances using reserved capacity.
     * The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * You can list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    public String getInstanceShape() {
        return instanceShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    private final InstanceReservationShapeConfigDetails instanceShapeConfig;

    public InstanceReservationShapeConfigDetails getInstanceShapeConfig() {
        return instanceShapeConfig;
    }

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
    private final String faultDomain;

    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The total number of instances that can be launched from the capacity configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
    private final Long reservedCount;

    public Long getReservedCount() {
        return reservedCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceReservationConfigDetails(");
        sb.append("instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", instanceShapeConfig=").append(String.valueOf(this.instanceShapeConfig));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", reservedCount=").append(String.valueOf(this.reservedCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceReservationConfigDetails)) {
            return false;
        }

        InstanceReservationConfigDetails other = (InstanceReservationConfigDetails) o;
        return java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.instanceShapeConfig, other.instanceShapeConfig)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.reservedCount, other.reservedCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeConfig == null
                                ? 43
                                : this.instanceShapeConfig.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedCount == null ? 43 : this.reservedCount.hashCode());
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
