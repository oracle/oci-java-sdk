/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReservedIP.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReservedIP extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id"})
    public ReservedIP(String id) {
        super();
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Ocid of the Reserved IP/Public Ip created with VCN.
         *
         * <p>Reserved IPs are IPs which already registered using VCN API.
         *
         * <p>Create a reserved Public IP and then while creating the load balancer pass the ocid of
         * the reserved IP in this field reservedIp to attach the Ip to Load balancer. Load balancer
         * will be configured to listen to traffic on this IP.
         *
         * <p>Reserved IPs will not be deleted when the Load balancer is deleted. They will be
         * unattached from the Load balancer.
         *
         * <p>Example: "ocid1.publicip.oc1.phx.unique_ID"
         *
         * <p>IPV6 example: "ocid1.ipv6.oc1.phx.unique_ID"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Ocid of the Reserved IP/Public Ip created with VCN.
         *
         * <p>Reserved IPs are IPs which already registered using VCN API.
         *
         * <p>Create a reserved Public IP and then while creating the load balancer pass the ocid of
         * the reserved IP in this field reservedIp to attach the Ip to Load balancer. Load balancer
         * will be configured to listen to traffic on this IP.
         *
         * <p>Reserved IPs will not be deleted when the Load balancer is deleted. They will be
         * unattached from the Load balancer.
         *
         * <p>Example: "ocid1.publicip.oc1.phx.unique_ID"
         *
         * <p>IPV6 example: "ocid1.ipv6.oc1.phx.unique_ID"
         *
         * @param id the value to set
         * @return this builder
         */
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Ocid of the Reserved IP/Public Ip created with VCN.
     *
     * <p>Reserved IPs are IPs which already registered using VCN API.
     *
     * <p>Create a reserved Public IP and then while creating the load balancer pass the ocid of the
     * reserved IP in this field reservedIp to attach the Ip to Load balancer. Load balancer will be
     * configured to listen to traffic on this IP.
     *
     * <p>Reserved IPs will not be deleted when the Load balancer is deleted. They will be
     * unattached from the Load balancer.
     *
     * <p>Example: "ocid1.publicip.oc1.phx.unique_ID"
     *
     * <p>IPV6 example: "ocid1.ipv6.oc1.phx.unique_ID"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Ocid of the Reserved IP/Public Ip created with VCN.
     *
     * <p>Reserved IPs are IPs which already registered using VCN API.
     *
     * <p>Create a reserved Public IP and then while creating the load balancer pass the ocid of the
     * reserved IP in this field reservedIp to attach the Ip to Load balancer. Load balancer will be
     * configured to listen to traffic on this IP.
     *
     * <p>Reserved IPs will not be deleted when the Load balancer is deleted. They will be
     * unattached from the Load balancer.
     *
     * <p>Example: "ocid1.publicip.oc1.phx.unique_ID"
     *
     * <p>IPV6 example: "ocid1.ipv6.oc1.phx.unique_ID"
     *
     * @return the value
     */
    public String getId() {
        return id;
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
