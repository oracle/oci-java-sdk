/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create source-to-destination mapping for a load balancer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOkeClusterLoadBalancerMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOkeClusterLoadBalancerMappingDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceLoadBalancerId", "destinationLoadBalancerId"})
    public CreateOkeClusterLoadBalancerMappingDetails(
            String sourceLoadBalancerId, String destinationLoadBalancerId) {
        super();
        this.sourceLoadBalancerId = sourceLoadBalancerId;
        this.destinationLoadBalancerId = destinationLoadBalancerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the source Load Balancer.
         *
         *  Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceLoadBalancerId")
        private String sourceLoadBalancerId;

        /**
         * The OCID of the source Load Balancer.
         *
         *  Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         *
         * @param sourceLoadBalancerId the value to set
         * @return this builder
         **/
        public Builder sourceLoadBalancerId(String sourceLoadBalancerId) {
            this.sourceLoadBalancerId = sourceLoadBalancerId;
            this.__explicitlySet__.add("sourceLoadBalancerId");
            return this;
        }
        /**
         * The OCID of the destination Load Balancer.
         * <p>
         * Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationLoadBalancerId")
        private String destinationLoadBalancerId;

        /**
         * The OCID of the destination Load Balancer.
         * <p>
         * Example: {@code ocid1.loadbalancer.oc1..uniqueID}
         *
         * @param destinationLoadBalancerId the value to set
         * @return this builder
         **/
        public Builder destinationLoadBalancerId(String destinationLoadBalancerId) {
            this.destinationLoadBalancerId = destinationLoadBalancerId;
            this.__explicitlySet__.add("destinationLoadBalancerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOkeClusterLoadBalancerMappingDetails build() {
            CreateOkeClusterLoadBalancerMappingDetails model =
                    new CreateOkeClusterLoadBalancerMappingDetails(
                            this.sourceLoadBalancerId, this.destinationLoadBalancerId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOkeClusterLoadBalancerMappingDetails model) {
            if (model.wasPropertyExplicitlySet("sourceLoadBalancerId")) {
                this.sourceLoadBalancerId(model.getSourceLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("destinationLoadBalancerId")) {
                this.destinationLoadBalancerId(model.getDestinationLoadBalancerId());
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
     * The OCID of the source Load Balancer.
     *
     *  Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceLoadBalancerId")
    private final String sourceLoadBalancerId;

    /**
     * The OCID of the source Load Balancer.
     *
     *  Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getSourceLoadBalancerId() {
        return sourceLoadBalancerId;
    }

    /**
     * The OCID of the destination Load Balancer.
     * <p>
     * Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationLoadBalancerId")
    private final String destinationLoadBalancerId;

    /**
     * The OCID of the destination Load Balancer.
     * <p>
     * Example: {@code ocid1.loadbalancer.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getDestinationLoadBalancerId() {
        return destinationLoadBalancerId;
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
        sb.append("CreateOkeClusterLoadBalancerMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceLoadBalancerId=").append(String.valueOf(this.sourceLoadBalancerId));
        sb.append(", destinationLoadBalancerId=")
                .append(String.valueOf(this.destinationLoadBalancerId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOkeClusterLoadBalancerMappingDetails)) {
            return false;
        }

        CreateOkeClusterLoadBalancerMappingDetails other =
                (CreateOkeClusterLoadBalancerMappingDetails) o;
        return java.util.Objects.equals(this.sourceLoadBalancerId, other.sourceLoadBalancerId)
                && java.util.Objects.equals(
                        this.destinationLoadBalancerId, other.destinationLoadBalancerId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceLoadBalancerId == null
                                ? 43
                                : this.sourceLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationLoadBalancerId == null
                                ? 43
                                : this.destinationLoadBalancerId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
