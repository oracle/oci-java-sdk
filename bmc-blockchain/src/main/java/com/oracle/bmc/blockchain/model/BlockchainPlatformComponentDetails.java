/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform component details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockchainPlatformComponentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlockchainPlatformComponentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"osns", "peers"})
    public BlockchainPlatformComponentDetails(
            java.util.List<Osn> osns, java.util.List<Peer> peers) {
        super();
        this.osns = osns;
        this.peers = peers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of OSNs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osns")
        private java.util.List<Osn> osns;

        /**
         * List of OSNs
         * @param osns the value to set
         * @return this builder
         **/
        public Builder osns(java.util.List<Osn> osns) {
            this.osns = osns;
            this.__explicitlySet__.add("osns");
            return this;
        }
        /**
         * List of Peers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peers")
        private java.util.List<Peer> peers;

        /**
         * List of Peers
         * @param peers the value to set
         * @return this builder
         **/
        public Builder peers(java.util.List<Peer> peers) {
            this.peers = peers;
            this.__explicitlySet__.add("peers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockchainPlatformComponentDetails build() {
            BlockchainPlatformComponentDetails __instance__ =
                    new BlockchainPlatformComponentDetails(osns, peers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatformComponentDetails o) {
            Builder copiedBuilder = osns(o.getOsns()).peers(o.getPeers());

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
     * List of OSNs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osns")
    private final java.util.List<Osn> osns;

    /**
     * List of OSNs
     * @return the value
     **/
    public java.util.List<Osn> getOsns() {
        return osns;
    }

    /**
     * List of Peers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peers")
    private final java.util.List<Peer> peers;

    /**
     * List of Peers
     * @return the value
     **/
    public java.util.List<Peer> getPeers() {
        return peers;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BlockchainPlatformComponentDetails(");
        sb.append("osns=").append(String.valueOf(this.osns));
        sb.append(", peers=").append(String.valueOf(this.peers));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockchainPlatformComponentDetails)) {
            return false;
        }

        BlockchainPlatformComponentDetails other = (BlockchainPlatformComponentDetails) o;
        return java.util.Objects.equals(this.osns, other.osns)
                && java.util.Objects.equals(this.peers, other.peers)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.osns == null ? 43 : this.osns.hashCode());
        result = (result * PRIME) + (this.peers == null ? 43 : this.peers.hashCode());
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
