/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Information about the other remote peering connection (RPC).
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
    builder = ConnectRemotePeeringConnectionsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectRemotePeeringConnectionsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"peerId", "peerRegionName"})
    public ConnectRemotePeeringConnectionsDetails(String peerId, String peerRegionName) {
        super();
        this.peerId = peerId;
        this.peerRegionName = peerRegionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC you want to peer with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC you want to peer with.
         * @param peerId the value to set
         * @return this builder
         **/
        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }
        /**
         * The name of the region that contains the RPC you want to peer with.
         * <p>
         * Example: {@code us-ashburn-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
        private String peerRegionName;

        /**
         * The name of the region that contains the RPC you want to peer with.
         * <p>
         * Example: {@code us-ashburn-1}
         *
         * @param peerRegionName the value to set
         * @return this builder
         **/
        public Builder peerRegionName(String peerRegionName) {
            this.peerRegionName = peerRegionName;
            this.__explicitlySet__.add("peerRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectRemotePeeringConnectionsDetails build() {
            ConnectRemotePeeringConnectionsDetails __instance__ =
                    new ConnectRemotePeeringConnectionsDetails(peerId, peerRegionName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectRemotePeeringConnectionsDetails o) {
            Builder copiedBuilder = peerId(o.getPeerId()).peerRegionName(o.getPeerRegionName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC you want to peer with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    private final String peerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC you want to peer with.
     * @return the value
     **/
    public String getPeerId() {
        return peerId;
    }

    /**
     * The name of the region that contains the RPC you want to peer with.
     * <p>
     * Example: {@code us-ashburn-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
    private final String peerRegionName;

    /**
     * The name of the region that contains the RPC you want to peer with.
     * <p>
     * Example: {@code us-ashburn-1}
     *
     * @return the value
     **/
    public String getPeerRegionName() {
        return peerRegionName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectRemotePeeringConnectionsDetails(");
        sb.append("peerId=").append(String.valueOf(this.peerId));
        sb.append(", peerRegionName=").append(String.valueOf(this.peerRegionName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectRemotePeeringConnectionsDetails)) {
            return false;
        }

        ConnectRemotePeeringConnectionsDetails other = (ConnectRemotePeeringConnectionsDetails) o;
        return java.util.Objects.equals(this.peerId, other.peerId)
                && java.util.Objects.equals(this.peerRegionName, other.peerRegionName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerId == null ? 43 : this.peerId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerRegionName == null ? 43 : this.peerRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
