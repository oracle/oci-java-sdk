/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DrgAttachmentNetworkDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = VcnDrgAttachmentNetworkDetails.class,
        name = "VCN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = IpsecTunnelDrgAttachmentNetworkDetails.class,
        name = "IPSEC_TUNNEL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = VirtualCircuitDrgAttachmentNetworkDetails.class,
        name = "VIRTUAL_CIRCUIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RemotePeeringConnectionDrgAttachmentNetworkDetails.class,
        name = "REMOTE_PEERING_CONNECTION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DrgAttachmentNetworkDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"id"})
    protected DrgAttachmentNetworkDetails(String id) {
        super();
        this.id = id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
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
        sb.append("DrgAttachmentNetworkDetails(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgAttachmentNetworkDetails)) {
            return false;
        }

        DrgAttachmentNetworkDetails other = (DrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        return result;
    }

    /**
     **/
    public enum Type {
        Vcn("VCN"),
        IpsecTunnel("IPSEC_TUNNEL"),
        VirtualCircuit("VIRTUAL_CIRCUIT"),
        RemotePeeringConnection("REMOTE_PEERING_CONNECTION"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
