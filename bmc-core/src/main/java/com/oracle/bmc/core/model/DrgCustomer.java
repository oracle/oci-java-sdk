/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The list of IPSEC / FC / RPC info for a given DRG <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrgCustomer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrgCustomer extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "drgId",
        "remotePeeringConnections",
        "virtualCircuits",
        "ipsecConnections"
    })
    public DrgCustomer(
            String drgId,
            java.util.List<DrgCustomerResource> remotePeeringConnections,
            java.util.List<DrgCustomerResource> virtualCircuits,
            java.util.List<DrgCustomerResource> ipsecConnections) {
        super();
        this.drgId = drgId;
        this.remotePeeringConnections = remotePeeringConnections;
        this.virtualCircuits = virtualCircuits;
        this.ipsecConnections = ipsecConnections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * OCID of the DRG
         *
         * @param drgId the value to set
         * @return this builder
         */
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /** A List of the RPC connections on this DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnections")
        private java.util.List<DrgCustomerResource> remotePeeringConnections;

        /**
         * A List of the RPC connections on this DRG
         *
         * @param remotePeeringConnections the value to set
         * @return this builder
         */
        public Builder remotePeeringConnections(
                java.util.List<DrgCustomerResource> remotePeeringConnections) {
            this.remotePeeringConnections = remotePeeringConnections;
            this.__explicitlySet__.add("remotePeeringConnections");
            return this;
        }
        /** A List of the VCs on this DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuits")
        private java.util.List<DrgCustomerResource> virtualCircuits;

        /**
         * A List of the VCs on this DRG
         *
         * @param virtualCircuits the value to set
         * @return this builder
         */
        public Builder virtualCircuits(java.util.List<DrgCustomerResource> virtualCircuits) {
            this.virtualCircuits = virtualCircuits;
            this.__explicitlySet__.add("virtualCircuits");
            return this;
        }
        /** A List of the IPSec connections on this DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnections")
        private java.util.List<DrgCustomerResource> ipsecConnections;

        /**
         * A List of the IPSec connections on this DRG
         *
         * @param ipsecConnections the value to set
         * @return this builder
         */
        public Builder ipsecConnections(java.util.List<DrgCustomerResource> ipsecConnections) {
            this.ipsecConnections = ipsecConnections;
            this.__explicitlySet__.add("ipsecConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgCustomer build() {
            DrgCustomer model =
                    new DrgCustomer(
                            this.drgId,
                            this.remotePeeringConnections,
                            this.virtualCircuits,
                            this.ipsecConnections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgCustomer model) {
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
            }
            if (model.wasPropertyExplicitlySet("remotePeeringConnections")) {
                this.remotePeeringConnections(model.getRemotePeeringConnections());
            }
            if (model.wasPropertyExplicitlySet("virtualCircuits")) {
                this.virtualCircuits(model.getVirtualCircuits());
            }
            if (model.wasPropertyExplicitlySet("ipsecConnections")) {
                this.ipsecConnections(model.getIpsecConnections());
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

    /** OCID of the DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * OCID of the DRG
     *
     * @return the value
     */
    public String getDrgId() {
        return drgId;
    }

    /** A List of the RPC connections on this DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnections")
    private final java.util.List<DrgCustomerResource> remotePeeringConnections;

    /**
     * A List of the RPC connections on this DRG
     *
     * @return the value
     */
    public java.util.List<DrgCustomerResource> getRemotePeeringConnections() {
        return remotePeeringConnections;
    }

    /** A List of the VCs on this DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuits")
    private final java.util.List<DrgCustomerResource> virtualCircuits;

    /**
     * A List of the VCs on this DRG
     *
     * @return the value
     */
    public java.util.List<DrgCustomerResource> getVirtualCircuits() {
        return virtualCircuits;
    }

    /** A List of the IPSec connections on this DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnections")
    private final java.util.List<DrgCustomerResource> ipsecConnections;

    /**
     * A List of the IPSec connections on this DRG
     *
     * @return the value
     */
    public java.util.List<DrgCustomerResource> getIpsecConnections() {
        return ipsecConnections;
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
        sb.append("DrgCustomer(");
        sb.append("super=").append(super.toString());
        sb.append("drgId=").append(String.valueOf(this.drgId));
        sb.append(", remotePeeringConnections=")
                .append(String.valueOf(this.remotePeeringConnections));
        sb.append(", virtualCircuits=").append(String.valueOf(this.virtualCircuits));
        sb.append(", ipsecConnections=").append(String.valueOf(this.ipsecConnections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgCustomer)) {
            return false;
        }

        DrgCustomer other = (DrgCustomer) o;
        return java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(
                        this.remotePeeringConnections, other.remotePeeringConnections)
                && java.util.Objects.equals(this.virtualCircuits, other.virtualCircuits)
                && java.util.Objects.equals(this.ipsecConnections, other.ipsecConnections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result =
                (result * PRIME)
                        + (this.remotePeeringConnections == null
                                ? 43
                                : this.remotePeeringConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualCircuits == null ? 43 : this.virtualCircuits.hashCode());
        result =
                (result * PRIME)
                        + (this.ipsecConnections == null ? 43 : this.ipsecConnections.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
