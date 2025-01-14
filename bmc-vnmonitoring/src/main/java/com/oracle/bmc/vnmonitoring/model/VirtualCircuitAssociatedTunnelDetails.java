/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Detailed private tunnel info associated with the virtual circuit. <br>
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
        builder = VirtualCircuitAssociatedTunnelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitAssociatedTunnelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tunnelType", "ipsecConnectionId", "tunnelId"})
    public VirtualCircuitAssociatedTunnelDetails(
            TunnelType tunnelType, String ipsecConnectionId, String tunnelId) {
        super();
        this.tunnelType = tunnelType;
        this.ipsecConnectionId = ipsecConnectionId;
        this.tunnelId = tunnelId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the tunnel associated with the virtual circuit. */
        @com.fasterxml.jackson.annotation.JsonProperty("tunnelType")
        private TunnelType tunnelType;

        /**
         * The type of the tunnel associated with the virtual circuit.
         *
         * @param tunnelType the value to set
         * @return this builder
         */
        public Builder tunnelType(TunnelType tunnelType) {
            this.tunnelType = tunnelType;
            this.__explicitlySet__.add("tunnelType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of IPSec connection associated with the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
        private String ipsecConnectionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of IPSec connection associated with the virtual circuit.
         *
         * @param ipsecConnectionId the value to set
         * @return this builder
         */
        public Builder ipsecConnectionId(String ipsecConnectionId) {
            this.ipsecConnectionId = ipsecConnectionId;
            this.__explicitlySet__.add("ipsecConnectionId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec tunnel associated with the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tunnelId")
        private String tunnelId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec tunnel associated with the virtual circuit.
         *
         * @param tunnelId the value to set
         * @return this builder
         */
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            this.__explicitlySet__.add("tunnelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitAssociatedTunnelDetails build() {
            VirtualCircuitAssociatedTunnelDetails model =
                    new VirtualCircuitAssociatedTunnelDetails(
                            this.tunnelType, this.ipsecConnectionId, this.tunnelId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitAssociatedTunnelDetails model) {
            if (model.wasPropertyExplicitlySet("tunnelType")) {
                this.tunnelType(model.getTunnelType());
            }
            if (model.wasPropertyExplicitlySet("ipsecConnectionId")) {
                this.ipsecConnectionId(model.getIpsecConnectionId());
            }
            if (model.wasPropertyExplicitlySet("tunnelId")) {
                this.tunnelId(model.getTunnelId());
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

    /** The type of the tunnel associated with the virtual circuit. */
    public enum TunnelType implements com.oracle.bmc.http.internal.BmcEnum {
        Ipsec("IPSEC"),
        ;

        private final String value;
        private static java.util.Map<String, TunnelType> map;

        static {
            map = new java.util.HashMap<>();
            for (TunnelType v : TunnelType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TunnelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TunnelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TunnelType: " + key);
        }
    };
    /** The type of the tunnel associated with the virtual circuit. */
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelType")
    private final TunnelType tunnelType;

    /**
     * The type of the tunnel associated with the virtual circuit.
     *
     * @return the value
     */
    public TunnelType getTunnelType() {
        return tunnelType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * IPSec connection associated with the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
    private final String ipsecConnectionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * IPSec connection associated with the virtual circuit.
     *
     * @return the value
     */
    public String getIpsecConnectionId() {
        return ipsecConnectionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec tunnel associated with the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelId")
    private final String tunnelId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec tunnel associated with the virtual circuit.
     *
     * @return the value
     */
    public String getTunnelId() {
        return tunnelId;
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
        sb.append("VirtualCircuitAssociatedTunnelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tunnelType=").append(String.valueOf(this.tunnelType));
        sb.append(", ipsecConnectionId=").append(String.valueOf(this.ipsecConnectionId));
        sb.append(", tunnelId=").append(String.valueOf(this.tunnelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitAssociatedTunnelDetails)) {
            return false;
        }

        VirtualCircuitAssociatedTunnelDetails other = (VirtualCircuitAssociatedTunnelDetails) o;
        return java.util.Objects.equals(this.tunnelType, other.tunnelType)
                && java.util.Objects.equals(this.ipsecConnectionId, other.ipsecConnectionId)
                && java.util.Objects.equals(this.tunnelId, other.tunnelId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tunnelType == null ? 43 : this.tunnelType.hashCode());
        result =
                (result * PRIME)
                        + (this.ipsecConnectionId == null ? 43 : this.ipsecConnectionId.hashCode());
        result = (result * PRIME) + (this.tunnelId == null ? 43 : this.tunnelId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
