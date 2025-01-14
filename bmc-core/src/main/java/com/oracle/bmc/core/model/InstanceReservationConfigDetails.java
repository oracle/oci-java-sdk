/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A template that contains the settings to use when defining the instance capacity configuration.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceReservationConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceReservationConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceShape",
        "instanceShapeConfig",
        "faultDomain",
        "clusterConfig",
        "reservedCount",
        "clusterPlacementGroupId"
    })
    public InstanceReservationConfigDetails(
            String instanceShape,
            InstanceReservationShapeConfigDetails instanceShapeConfig,
            String faultDomain,
            ClusterConfigDetails clusterConfig,
            Long reservedCount,
            String clusterPlacementGroupId) {
        super();
        this.instanceShape = instanceShape;
        this.instanceShapeConfig = instanceShapeConfig;
        this.faultDomain = faultDomain;
        this.clusterConfig = clusterConfig;
        this.reservedCount = reservedCount;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape requested when launching instances using reserved capacity. The shape
         * determines the number of CPUs, amount of memory, and other resources allocated to the
         * instance. You can list all available shapes by calling {@link
         * ListComputeCapacityReservationInstanceShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape requested when launching instances using reserved capacity. The shape
         * determines the number of CPUs, amount of memory, and other resources allocated to the
         * instance. You can list all available shapes by calling {@link
         * ListComputeCapacityReservationInstanceShapes}.
         *
         * @param instanceShape the value to set
         * @return this builder
         */
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
         * The fault domain to use for instances created using this capacity configuration. For more
         * information, see [Fault
         * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault).
         * If you do not specify the fault domain, the capacity is available for an instance that
         * does not specify a fault domain. To change the fault domain for a reservation, delete the
         * reservation and create a new one in the preferred fault domain.
         *
         * <p>To retrieve a list of fault domains, use the {@code ListFaultDomains} operation in the
         * [Identity and Access Management Service
         * API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain to use for instances created using this capacity configuration. For more
         * information, see [Fault
         * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault).
         * If you do not specify the fault domain, the capacity is available for an instance that
         * does not specify a fault domain. To change the fault domain for a reservation, delete the
         * reservation and create a new one in the preferred fault domain.
         *
         * <p>To retrieve a list of fault domains, use the {@code ListFaultDomains} operation in the
         * [Identity and Access Management Service
         * API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterConfig")
        private ClusterConfigDetails clusterConfig;

        public Builder clusterConfig(ClusterConfigDetails clusterConfig) {
            this.clusterConfig = clusterConfig;
            this.__explicitlySet__.add("clusterConfig");
            return this;
        }
        /** The total number of instances that can be launched from the capacity configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
        private Long reservedCount;

        /**
         * The total number of instances that can be launched from the capacity configuration.
         *
         * @param reservedCount the value to set
         * @return this builder
         */
        public Builder reservedCount(Long reservedCount) {
            this.reservedCount = reservedCount;
            this.__explicitlySet__.add("reservedCount");
            return this;
        }
        /**
         * The OCID of the cluster placement group for this instance reservation capacity
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The OCID of the cluster placement group for this instance reservation capacity
         * configuration.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceReservationConfigDetails build() {
            InstanceReservationConfigDetails model =
                    new InstanceReservationConfigDetails(
                            this.instanceShape,
                            this.instanceShapeConfig,
                            this.faultDomain,
                            this.clusterConfig,
                            this.reservedCount,
                            this.clusterPlacementGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceReservationConfigDetails model) {
            if (model.wasPropertyExplicitlySet("instanceShape")) {
                this.instanceShape(model.getInstanceShape());
            }
            if (model.wasPropertyExplicitlySet("instanceShapeConfig")) {
                this.instanceShapeConfig(model.getInstanceShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("clusterConfig")) {
                this.clusterConfig(model.getClusterConfig());
            }
            if (model.wasPropertyExplicitlySet("reservedCount")) {
                this.reservedCount(model.getReservedCount());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
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

    /**
     * The shape requested when launching instances using reserved capacity. The shape determines
     * the number of CPUs, amount of memory, and other resources allocated to the instance. You can
     * list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape requested when launching instances using reserved capacity. The shape determines
     * the number of CPUs, amount of memory, and other resources allocated to the instance. You can
     * list all available shapes by calling {@link ListComputeCapacityReservationInstanceShapes}.
     *
     * @return the value
     */
    public String getInstanceShape() {
        return instanceShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    private final InstanceReservationShapeConfigDetails instanceShapeConfig;

    public InstanceReservationShapeConfigDetails getInstanceShapeConfig() {
        return instanceShapeConfig;
    }

    /**
     * The fault domain to use for instances created using this capacity configuration. For more
     * information, see [Fault
     * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault). If
     * you do not specify the fault domain, the capacity is available for an instance that does not
     * specify a fault domain. To change the fault domain for a reservation, delete the reservation
     * and create a new one in the preferred fault domain.
     *
     * <p>To retrieve a list of fault domains, use the {@code ListFaultDomains} operation in the
     * [Identity and Access Management Service
     * API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain to use for instances created using this capacity configuration. For more
     * information, see [Fault
     * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault). If
     * you do not specify the fault domain, the capacity is available for an instance that does not
     * specify a fault domain. To change the fault domain for a reservation, delete the reservation
     * and create a new one in the preferred fault domain.
     *
     * <p>To retrieve a list of fault domains, use the {@code ListFaultDomains} operation in the
     * [Identity and Access Management Service
     * API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfig")
    private final ClusterConfigDetails clusterConfig;

    public ClusterConfigDetails getClusterConfig() {
        return clusterConfig;
    }

    /** The total number of instances that can be launched from the capacity configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCount")
    private final Long reservedCount;

    /**
     * The total number of instances that can be launched from the capacity configuration.
     *
     * @return the value
     */
    public Long getReservedCount() {
        return reservedCount;
    }

    /**
     * The OCID of the cluster placement group for this instance reservation capacity configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The OCID of the cluster placement group for this instance reservation capacity configuration.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
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
        sb.append("InstanceReservationConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", instanceShapeConfig=").append(String.valueOf(this.instanceShapeConfig));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", clusterConfig=").append(String.valueOf(this.clusterConfig));
        sb.append(", reservedCount=").append(String.valueOf(this.reservedCount));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
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
                && java.util.Objects.equals(this.clusterConfig, other.clusterConfig)
                && java.util.Objects.equals(this.reservedCount, other.reservedCount)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && super.equals(other);
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
                        + (this.clusterConfig == null ? 43 : this.clusterConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedCount == null ? 43 : this.reservedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
