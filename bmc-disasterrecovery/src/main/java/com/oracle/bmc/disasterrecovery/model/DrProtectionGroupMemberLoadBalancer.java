/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The properties for a load balancer member of a DR protection group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrProtectionGroupMemberLoadBalancer.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrProtectionGroupMemberLoadBalancer extends DrProtectionGroupMember {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The OCID of the destination load balancer. The backend sets in this destination load
         * balancer are updated during DR.
         *
         * <p>Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationLoadBalancerId")
        private String destinationLoadBalancerId;

        /**
         * The OCID of the destination load balancer. The backend sets in this destination load
         * balancer are updated during DR.
         *
         * <p>Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         *
         * @param destinationLoadBalancerId the value to set
         * @return this builder
         */
        public Builder destinationLoadBalancerId(String destinationLoadBalancerId) {
            this.destinationLoadBalancerId = destinationLoadBalancerId;
            this.__explicitlySet__.add("destinationLoadBalancerId");
            return this;
        }
        /**
         * A list of backend set mappings that are used to transfer or update backends during DR.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetMappings")
        private java.util.List<LoadBalancerBackendSetMapping> backendSetMappings;

        /**
         * A list of backend set mappings that are used to transfer or update backends during DR.
         *
         * @param backendSetMappings the value to set
         * @return this builder
         */
        public Builder backendSetMappings(
                java.util.List<LoadBalancerBackendSetMapping> backendSetMappings) {
            this.backendSetMappings = backendSetMappings;
            this.__explicitlySet__.add("backendSetMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrProtectionGroupMemberLoadBalancer build() {
            DrProtectionGroupMemberLoadBalancer model =
                    new DrProtectionGroupMemberLoadBalancer(
                            this.memberId, this.destinationLoadBalancerId, this.backendSetMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrProtectionGroupMemberLoadBalancer model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("destinationLoadBalancerId")) {
                this.destinationLoadBalancerId(model.getDestinationLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("backendSetMappings")) {
                this.backendSetMappings(model.getBackendSetMappings());
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

    @Deprecated
    public DrProtectionGroupMemberLoadBalancer(
            String memberId,
            String destinationLoadBalancerId,
            java.util.List<LoadBalancerBackendSetMapping> backendSetMappings) {
        super(memberId);
        this.destinationLoadBalancerId = destinationLoadBalancerId;
        this.backendSetMappings = backendSetMappings;
    }

    /**
     * The OCID of the destination load balancer. The backend sets in this destination load balancer
     * are updated during DR.
     *
     * <p>Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationLoadBalancerId")
    private final String destinationLoadBalancerId;

    /**
     * The OCID of the destination load balancer. The backend sets in this destination load balancer
     * are updated during DR.
     *
     * <p>Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationLoadBalancerId() {
        return destinationLoadBalancerId;
    }

    /** A list of backend set mappings that are used to transfer or update backends during DR. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetMappings")
    private final java.util.List<LoadBalancerBackendSetMapping> backendSetMappings;

    /**
     * A list of backend set mappings that are used to transfer or update backends during DR.
     *
     * @return the value
     */
    public java.util.List<LoadBalancerBackendSetMapping> getBackendSetMappings() {
        return backendSetMappings;
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
        sb.append("DrProtectionGroupMemberLoadBalancer(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationLoadBalancerId=")
                .append(String.valueOf(this.destinationLoadBalancerId));
        sb.append(", backendSetMappings=").append(String.valueOf(this.backendSetMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrProtectionGroupMemberLoadBalancer)) {
            return false;
        }

        DrProtectionGroupMemberLoadBalancer other = (DrProtectionGroupMemberLoadBalancer) o;
        return java.util.Objects.equals(
                        this.destinationLoadBalancerId, other.destinationLoadBalancerId)
                && java.util.Objects.equals(this.backendSetMappings, other.backendSetMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationLoadBalancerId == null
                                ? 43
                                : this.destinationLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetMappings == null
                                ? 43
                                : this.backendSetMappings.hashCode());
        return result;
    }
}
