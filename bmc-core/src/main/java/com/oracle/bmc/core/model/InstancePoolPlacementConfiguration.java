/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The location for where an instance pool will place instances. <br>
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
        builder = InstancePoolPlacementConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolPlacementConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "primarySubnetId",
        "faultDomains",
        "primaryVnicSubnets",
        "secondaryVnicSubnets"
    })
    public InstancePoolPlacementConfiguration(
            String availabilityDomain,
            String primarySubnetId,
            java.util.List<String> faultDomains,
            InstancePoolPlacementPrimarySubnet primaryVnicSubnets,
            java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.primarySubnetId = primarySubnetId;
        this.faultDomains = faultDomains;
        this.primaryVnicSubnets = primaryVnicSubnets;
        this.secondaryVnicSubnets = secondaryVnicSubnets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain to place instances.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain to place instances.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the primary subnet in which to place instances. This field is deprecated. Use {@code
         * primaryVnicSubnets} instead to set VNIC data for instances in the pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primarySubnetId")
        private String primarySubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the primary subnet in which to place instances. This field is deprecated. Use {@code
         * primaryVnicSubnets} instead to set VNIC data for instances in the pool.
         *
         * @param primarySubnetId the value to set
         * @return this builder
         */
        public Builder primarySubnetId(String primarySubnetId) {
            this.primarySubnetId = primarySubnetId;
            this.__explicitlySet__.add("primarySubnetId");
            return this;
        }
        /**
         * The fault domains to place instances.
         *
         * <p>If you don't provide any values, the system makes a best effort to distribute
         * instances across all fault domains based on capacity.
         *
         * <p>To distribute the instances evenly across selected fault domains, provide a set of
         * fault domains. For example, you might want instances to be evenly distributed if your
         * applications require high availability.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code [FAULT-DOMAIN-1, FAULT-DOMAIN-2, FAULT-DOMAIN-3]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        /**
         * The fault domains to place instances.
         *
         * <p>If you don't provide any values, the system makes a best effort to distribute
         * instances across all fault domains based on capacity.
         *
         * <p>To distribute the instances evenly across selected fault domains, provide a set of
         * fault domains. For example, you might want instances to be evenly distributed if your
         * applications require high availability.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code [FAULT-DOMAIN-1, FAULT-DOMAIN-2, FAULT-DOMAIN-3]}
         *
         * @param faultDomains the value to set
         * @return this builder
         */
        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryVnicSubnets")
        private InstancePoolPlacementPrimarySubnet primaryVnicSubnets;

        public Builder primaryVnicSubnets(InstancePoolPlacementPrimarySubnet primaryVnicSubnets) {
            this.primaryVnicSubnets = primaryVnicSubnets;
            this.__explicitlySet__.add("primaryVnicSubnets");
            return this;
        }
        /** The set of secondary VNIC data for instances in the pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnicSubnets")
        private java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets;

        /**
         * The set of secondary VNIC data for instances in the pool.
         *
         * @param secondaryVnicSubnets the value to set
         * @return this builder
         */
        public Builder secondaryVnicSubnets(
                java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets) {
            this.secondaryVnicSubnets = secondaryVnicSubnets;
            this.__explicitlySet__.add("secondaryVnicSubnets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolPlacementConfiguration build() {
            InstancePoolPlacementConfiguration model =
                    new InstancePoolPlacementConfiguration(
                            this.availabilityDomain,
                            this.primarySubnetId,
                            this.faultDomains,
                            this.primaryVnicSubnets,
                            this.secondaryVnicSubnets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolPlacementConfiguration model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("primarySubnetId")) {
                this.primarySubnetId(model.getPrimarySubnetId());
            }
            if (model.wasPropertyExplicitlySet("faultDomains")) {
                this.faultDomains(model.getFaultDomains());
            }
            if (model.wasPropertyExplicitlySet("primaryVnicSubnets")) {
                this.primaryVnicSubnets(model.getPrimaryVnicSubnets());
            }
            if (model.wasPropertyExplicitlySet("secondaryVnicSubnets")) {
                this.secondaryVnicSubnets(model.getSecondaryVnicSubnets());
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
     * The availability domain to place instances.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain to place instances.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the primary subnet in which to place instances. This field is deprecated. Use {@code
     * primaryVnicSubnets} instead to set VNIC data for instances in the pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primarySubnetId")
    private final String primarySubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the primary subnet in which to place instances. This field is deprecated. Use {@code
     * primaryVnicSubnets} instead to set VNIC data for instances in the pool.
     *
     * @return the value
     */
    public String getPrimarySubnetId() {
        return primarySubnetId;
    }

    /**
     * The fault domains to place instances.
     *
     * <p>If you don't provide any values, the system makes a best effort to distribute instances
     * across all fault domains based on capacity.
     *
     * <p>To distribute the instances evenly across selected fault domains, provide a set of fault
     * domains. For example, you might want instances to be evenly distributed if your applications
     * require high availability.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code [FAULT-DOMAIN-1, FAULT-DOMAIN-2, FAULT-DOMAIN-3]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    /**
     * The fault domains to place instances.
     *
     * <p>If you don't provide any values, the system makes a best effort to distribute instances
     * across all fault domains based on capacity.
     *
     * <p>To distribute the instances evenly across selected fault domains, provide a set of fault
     * domains. For example, you might want instances to be evenly distributed if your applications
     * require high availability.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code [FAULT-DOMAIN-1, FAULT-DOMAIN-2, FAULT-DOMAIN-3]}
     *
     * @return the value
     */
    public java.util.List<String> getFaultDomains() {
        return faultDomains;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("primaryVnicSubnets")
    private final InstancePoolPlacementPrimarySubnet primaryVnicSubnets;

    public InstancePoolPlacementPrimarySubnet getPrimaryVnicSubnets() {
        return primaryVnicSubnets;
    }

    /** The set of secondary VNIC data for instances in the pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnicSubnets")
    private final java.util.List<InstancePoolPlacementSecondaryVnicSubnet> secondaryVnicSubnets;

    /**
     * The set of secondary VNIC data for instances in the pool.
     *
     * @return the value
     */
    public java.util.List<InstancePoolPlacementSecondaryVnicSubnet> getSecondaryVnicSubnets() {
        return secondaryVnicSubnets;
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
        sb.append("InstancePoolPlacementConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", primarySubnetId=").append(String.valueOf(this.primarySubnetId));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append(", primaryVnicSubnets=").append(String.valueOf(this.primaryVnicSubnets));
        sb.append(", secondaryVnicSubnets=").append(String.valueOf(this.secondaryVnicSubnets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolPlacementConfiguration)) {
            return false;
        }

        InstancePoolPlacementConfiguration other = (InstancePoolPlacementConfiguration) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.primarySubnetId, other.primarySubnetId)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && java.util.Objects.equals(this.primaryVnicSubnets, other.primaryVnicSubnets)
                && java.util.Objects.equals(this.secondaryVnicSubnets, other.secondaryVnicSubnets)
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
        result =
                (result * PRIME)
                        + (this.primarySubnetId == null ? 43 : this.primarySubnetId.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryVnicSubnets == null
                                ? 43
                                : this.primaryVnicSubnets.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryVnicSubnets == null
                                ? 43
                                : this.secondaryVnicSubnets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
