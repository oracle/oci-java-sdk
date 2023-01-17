/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * An object representing a reserved IP address to be attached or that is already attached to a network load balancer.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReservedIP.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReservedIP extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id"})
    public ReservedIP(String id) {
        super();
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the reserved public IP address created with the virtual cloud network.
         * <p>
         * Reserved public IP addresses are IP addresses that are registered using the virtual cloud network API.
         * <p>
         * Create a reserved public IP address. When you create the network load balancer, enter the OCID of the reserved public IP address in the
         * reservedIp field to attach the IP address to the network load balancer. This task configures the network load balancer to listen to traffic on this IP address.
         * <p>
         * Reserved public IP addresses are not deleted when the network load balancer is deleted. The IP addresses become unattached from the network load balancer.
         * <p>
         * Example: "ocid1.publicip.oc1.phx.unique_ID"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the reserved public IP address created with the virtual cloud network.
         * <p>
         * Reserved public IP addresses are IP addresses that are registered using the virtual cloud network API.
         * <p>
         * Create a reserved public IP address. When you create the network load balancer, enter the OCID of the reserved public IP address in the
         * reservedIp field to attach the IP address to the network load balancer. This task configures the network load balancer to listen to traffic on this IP address.
         * <p>
         * Reserved public IP addresses are not deleted when the network load balancer is deleted. The IP addresses become unattached from the network load balancer.
         * <p>
         * Example: "ocid1.publicip.oc1.phx.unique_ID"
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReservedIP build() {
            ReservedIP model = new ReservedIP(this.id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReservedIP model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
     * OCID of the reserved public IP address created with the virtual cloud network.
     * <p>
     * Reserved public IP addresses are IP addresses that are registered using the virtual cloud network API.
     * <p>
     * Create a reserved public IP address. When you create the network load balancer, enter the OCID of the reserved public IP address in the
     * reservedIp field to attach the IP address to the network load balancer. This task configures the network load balancer to listen to traffic on this IP address.
     * <p>
     * Reserved public IP addresses are not deleted when the network load balancer is deleted. The IP addresses become unattached from the network load balancer.
     * <p>
     * Example: "ocid1.publicip.oc1.phx.unique_ID"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the reserved public IP address created with the virtual cloud network.
     * <p>
     * Reserved public IP addresses are IP addresses that are registered using the virtual cloud network API.
     * <p>
     * Create a reserved public IP address. When you create the network load balancer, enter the OCID of the reserved public IP address in the
     * reservedIp field to attach the IP address to the network load balancer. This task configures the network load balancer to listen to traffic on this IP address.
     * <p>
     * Reserved public IP addresses are not deleted when the network load balancer is deleted. The IP addresses become unattached from the network load balancer.
     * <p>
     * Example: "ocid1.publicip.oc1.phx.unique_ID"
     *
     * @return the value
     **/
    public String getId() {
        return id;
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
        sb.append("ReservedIP(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReservedIP)) {
            return false;
        }

        ReservedIP other = (ReservedIP) o;
        return java.util.Objects.equals(this.id, other.id) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
