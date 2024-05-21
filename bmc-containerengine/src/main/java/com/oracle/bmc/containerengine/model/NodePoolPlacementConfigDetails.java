/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The location where a node pool will place nodes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodePoolPlacementConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodePoolPlacementConfigDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "subnetId",
        "capacityReservationId",
        "preemptibleNodeConfig",
        "faultDomains"
    })
    public NodePoolPlacementConfigDetails(
            String availabilityDomain,
            String subnetId,
            String capacityReservationId,
            PreemptibleNodeConfigDetails preemptibleNodeConfig,
            java.util.List<String> faultDomains) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.capacityReservationId = capacityReservationId;
        this.preemptibleNodeConfig = preemptibleNodeConfig;
        this.faultDomains = faultDomains;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain in which to place nodes.
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain in which to place nodes.
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the subnet in which to place nodes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which to place nodes.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCID of the compute capacity reservation in which to place the compute instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation in which to place the compute instance.
         * @param capacityReservationId the value to set
         * @return this builder
         **/
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preemptibleNodeConfig")
        private PreemptibleNodeConfigDetails preemptibleNodeConfig;

        public Builder preemptibleNodeConfig(PreemptibleNodeConfigDetails preemptibleNodeConfig) {
            this.preemptibleNodeConfig = preemptibleNodeConfig;
            this.__explicitlySet__.add("preemptibleNodeConfig");
            return this;
        }
        /**
         * A list of fault domains in which to place nodes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        /**
         * A list of fault domains in which to place nodes.
         *
         * @param faultDomains the value to set
         * @return this builder
         **/
        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolPlacementConfigDetails build() {
            NodePoolPlacementConfigDetails model =
                    new NodePoolPlacementConfigDetails(
                            this.availabilityDomain,
                            this.subnetId,
                            this.capacityReservationId,
                            this.preemptibleNodeConfig,
                            this.faultDomains);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolPlacementConfigDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("preemptibleNodeConfig")) {
                this.preemptibleNodeConfig(model.getPreemptibleNodeConfig());
            }
            if (model.wasPropertyExplicitlySet("faultDomains")) {
                this.faultDomains(model.getFaultDomains());
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
     * The availability domain in which to place nodes.
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain in which to place nodes.
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the subnet in which to place nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which to place nodes.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCID of the compute capacity reservation in which to place the compute instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation in which to place the compute instance.
     * @return the value
     **/
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preemptibleNodeConfig")
    private final PreemptibleNodeConfigDetails preemptibleNodeConfig;

    public PreemptibleNodeConfigDetails getPreemptibleNodeConfig() {
        return preemptibleNodeConfig;
    }

    /**
     * A list of fault domains in which to place nodes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    /**
     * A list of fault domains in which to place nodes.
     *
     * @return the value
     **/
    public java.util.List<String> getFaultDomains() {
        return faultDomains;
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
        sb.append("NodePoolPlacementConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", preemptibleNodeConfig=").append(String.valueOf(this.preemptibleNodeConfig));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodePoolPlacementConfigDetails)) {
            return false;
        }

        NodePoolPlacementConfigDetails other = (NodePoolPlacementConfigDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.preemptibleNodeConfig, other.preemptibleNodeConfig)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.preemptibleNodeConfig == null
                                ? 43
                                : this.preemptibleNodeConfig.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
