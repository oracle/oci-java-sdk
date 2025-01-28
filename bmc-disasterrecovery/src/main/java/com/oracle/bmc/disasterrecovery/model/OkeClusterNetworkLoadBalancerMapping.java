/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Source-to-destination mapping for a network load balancer. <br>
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
        builder = OkeClusterNetworkLoadBalancerMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OkeClusterNetworkLoadBalancerMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceNetworkLoadBalancerId",
        "destinationNetworkLoadBalancerId"
    })
    public OkeClusterNetworkLoadBalancerMapping(
            String sourceNetworkLoadBalancerId, String destinationNetworkLoadBalancerId) {
        super();
        this.sourceNetworkLoadBalancerId = sourceNetworkLoadBalancerId;
        this.destinationNetworkLoadBalancerId = destinationNetworkLoadBalancerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the source Network Load Balancer.
         *
         * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceNetworkLoadBalancerId")
        private String sourceNetworkLoadBalancerId;

        /**
         * The OCID of the source Network Load Balancer.
         *
         * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
         *
         * @param sourceNetworkLoadBalancerId the value to set
         * @return this builder
         */
        public Builder sourceNetworkLoadBalancerId(String sourceNetworkLoadBalancerId) {
            this.sourceNetworkLoadBalancerId = sourceNetworkLoadBalancerId;
            this.__explicitlySet__.add("sourceNetworkLoadBalancerId");
            return this;
        }
        /**
         * The OCID of the destination Network Load Balancer.
         *
         * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationNetworkLoadBalancerId")
        private String destinationNetworkLoadBalancerId;

        /**
         * The OCID of the destination Network Load Balancer.
         *
         * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
         *
         * @param destinationNetworkLoadBalancerId the value to set
         * @return this builder
         */
        public Builder destinationNetworkLoadBalancerId(String destinationNetworkLoadBalancerId) {
            this.destinationNetworkLoadBalancerId = destinationNetworkLoadBalancerId;
            this.__explicitlySet__.add("destinationNetworkLoadBalancerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeClusterNetworkLoadBalancerMapping build() {
            OkeClusterNetworkLoadBalancerMapping model =
                    new OkeClusterNetworkLoadBalancerMapping(
                            this.sourceNetworkLoadBalancerId,
                            this.destinationNetworkLoadBalancerId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeClusterNetworkLoadBalancerMapping model) {
            if (model.wasPropertyExplicitlySet("sourceNetworkLoadBalancerId")) {
                this.sourceNetworkLoadBalancerId(model.getSourceNetworkLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("destinationNetworkLoadBalancerId")) {
                this.destinationNetworkLoadBalancerId(model.getDestinationNetworkLoadBalancerId());
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
     * The OCID of the source Network Load Balancer.
     *
     * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNetworkLoadBalancerId")
    private final String sourceNetworkLoadBalancerId;

    /**
     * The OCID of the source Network Load Balancer.
     *
     * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
     *
     * @return the value
     */
    public String getSourceNetworkLoadBalancerId() {
        return sourceNetworkLoadBalancerId;
    }

    /**
     * The OCID of the destination Network Load Balancer.
     *
     * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationNetworkLoadBalancerId")
    private final String destinationNetworkLoadBalancerId;

    /**
     * The OCID of the destination Network Load Balancer.
     *
     * <p>Example: {@code ocid1.networkloadbalancer.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationNetworkLoadBalancerId() {
        return destinationNetworkLoadBalancerId;
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
        sb.append("OkeClusterNetworkLoadBalancerMapping(");
        sb.append("super=").append(super.toString());
        sb.append("sourceNetworkLoadBalancerId=")
                .append(String.valueOf(this.sourceNetworkLoadBalancerId));
        sb.append(", destinationNetworkLoadBalancerId=")
                .append(String.valueOf(this.destinationNetworkLoadBalancerId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkeClusterNetworkLoadBalancerMapping)) {
            return false;
        }

        OkeClusterNetworkLoadBalancerMapping other = (OkeClusterNetworkLoadBalancerMapping) o;
        return java.util.Objects.equals(
                        this.sourceNetworkLoadBalancerId, other.sourceNetworkLoadBalancerId)
                && java.util.Objects.equals(
                        this.destinationNetworkLoadBalancerId,
                        other.destinationNetworkLoadBalancerId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceNetworkLoadBalancerId == null
                                ? 43
                                : this.sourceNetworkLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationNetworkLoadBalancerId == null
                                ? 43
                                : this.destinationNetworkLoadBalancerId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
