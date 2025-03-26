/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The default DRG route table for this DRG. Each network type
 * has a default DRG route table.
 * <p>
 * You can update a network type to use a different DRG route table, but
 * each network type must have a default DRG route table. You cannot delete
 * a default DRG route table.
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
    builder = DefaultDrgRouteTables.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefaultDrgRouteTables
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcn",
        "ipsecTunnel",
        "virtualCircuit",
        "remotePeeringConnection"
    })
    public DefaultDrgRouteTables(
            String vcn, String ipsecTunnel, String virtualCircuit, String remotePeeringConnection) {
        super();
        this.vcn = vcn;
        this.ipsecTunnel = ipsecTunnel;
        this.virtualCircuit = virtualCircuit;
        this.remotePeeringConnection = remotePeeringConnection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type VCN on creation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcn")
        private String vcn;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type VCN on creation.
         *
         * @param vcn the value to set
         * @return this builder
         **/
        public Builder vcn(String vcn) {
            this.vcn = vcn;
            this.__explicitlySet__.add("vcn");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table assigned to DRG attachments
         * of type IPSEC_TUNNEL on creation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecTunnel")
        private String ipsecTunnel;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table assigned to DRG attachments
         * of type IPSEC_TUNNEL on creation.
         *
         * @param ipsecTunnel the value to set
         * @return this builder
         **/
        public Builder ipsecTunnel(String ipsecTunnel) {
            this.ipsecTunnel = ipsecTunnel;
            this.__explicitlySet__.add("ipsecTunnel");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type VIRTUAL_CIRCUIT on creation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuit")
        private String virtualCircuit;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type VIRTUAL_CIRCUIT on creation.
         *
         * @param virtualCircuit the value to set
         * @return this builder
         **/
        public Builder virtualCircuit(String virtualCircuit) {
            this.virtualCircuit = virtualCircuit;
            this.__explicitlySet__.add("virtualCircuit");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type REMOTE_PEERING_CONNECTION on creation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnection")
        private String remotePeeringConnection;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
         * of type REMOTE_PEERING_CONNECTION on creation.
         *
         * @param remotePeeringConnection the value to set
         * @return this builder
         **/
        public Builder remotePeeringConnection(String remotePeeringConnection) {
            this.remotePeeringConnection = remotePeeringConnection;
            this.__explicitlySet__.add("remotePeeringConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultDrgRouteTables build() {
            DefaultDrgRouteTables model =
                    new DefaultDrgRouteTables(
                            this.vcn,
                            this.ipsecTunnel,
                            this.virtualCircuit,
                            this.remotePeeringConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultDrgRouteTables model) {
            if (model.wasPropertyExplicitlySet("vcn")) {
                this.vcn(model.getVcn());
            }
            if (model.wasPropertyExplicitlySet("ipsecTunnel")) {
                this.ipsecTunnel(model.getIpsecTunnel());
            }
            if (model.wasPropertyExplicitlySet("virtualCircuit")) {
                this.virtualCircuit(model.getVirtualCircuit());
            }
            if (model.wasPropertyExplicitlySet("remotePeeringConnection")) {
                this.remotePeeringConnection(model.getRemotePeeringConnection());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type VCN on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcn")
    private final String vcn;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type VCN on creation.
     *
     * @return the value
     **/
    public String getVcn() {
        return vcn;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table assigned to DRG attachments
     * of type IPSEC_TUNNEL on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecTunnel")
    private final String ipsecTunnel;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table assigned to DRG attachments
     * of type IPSEC_TUNNEL on creation.
     *
     * @return the value
     **/
    public String getIpsecTunnel() {
        return ipsecTunnel;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type VIRTUAL_CIRCUIT on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuit")
    private final String virtualCircuit;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type VIRTUAL_CIRCUIT on creation.
     *
     * @return the value
     **/
    public String getVirtualCircuit() {
        return virtualCircuit;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type REMOTE_PEERING_CONNECTION on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnection")
    private final String remotePeeringConnection;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type REMOTE_PEERING_CONNECTION on creation.
     *
     * @return the value
     **/
    public String getRemotePeeringConnection() {
        return remotePeeringConnection;
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
        sb.append("DefaultDrgRouteTables(");
        sb.append("super=").append(super.toString());
        sb.append("vcn=").append(String.valueOf(this.vcn));
        sb.append(", ipsecTunnel=").append(String.valueOf(this.ipsecTunnel));
        sb.append(", virtualCircuit=").append(String.valueOf(this.virtualCircuit));
        sb.append(", remotePeeringConnection=")
                .append(String.valueOf(this.remotePeeringConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultDrgRouteTables)) {
            return false;
        }

        DefaultDrgRouteTables other = (DefaultDrgRouteTables) o;
        return java.util.Objects.equals(this.vcn, other.vcn)
                && java.util.Objects.equals(this.ipsecTunnel, other.ipsecTunnel)
                && java.util.Objects.equals(this.virtualCircuit, other.virtualCircuit)
                && java.util.Objects.equals(
                        this.remotePeeringConnection, other.remotePeeringConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcn == null ? 43 : this.vcn.hashCode());
        result = (result * PRIME) + (this.ipsecTunnel == null ? 43 : this.ipsecTunnel.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualCircuit == null ? 43 : this.virtualCircuit.hashCode());
        result =
                (result * PRIME)
                        + (this.remotePeeringConnection == null
                                ? 43
                                : this.remotePeeringConnection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
