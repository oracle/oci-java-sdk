/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Peer summary information for returning in a list.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PeerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PeerSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"peerKey", "lifecycleState"})
    public PeerSummary(String peerKey, Peer.LifecycleState lifecycleState) {
        super();
        this.peerKey = peerKey;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Peer identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerKey")
        private String peerKey;

        /**
         * Peer identifier
         * @param peerKey the value to set
         * @return this builder
         **/
        public Builder peerKey(String peerKey) {
            this.peerKey = peerKey;
            this.__explicitlySet__.add("peerKey");
            return this;
        }
        /**
         * The current state of the peer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Peer.LifecycleState lifecycleState;

        /**
         * The current state of the peer.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Peer.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerSummary build() {
            PeerSummary __instance__ = new PeerSummary(peerKey, lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerSummary o) {
            Builder copiedBuilder = peerKey(o.getPeerKey()).lifecycleState(o.getLifecycleState());

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
     * Peer identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerKey")
    private final String peerKey;

    /**
     * Peer identifier
     * @return the value
     **/
    public String getPeerKey() {
        return peerKey;
    }

    /**
     * The current state of the peer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Peer.LifecycleState lifecycleState;

    /**
     * The current state of the peer.
     * @return the value
     **/
    public Peer.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("PeerSummary(");
        sb.append("peerKey=").append(String.valueOf(this.peerKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerSummary)) {
            return false;
        }

        PeerSummary other = (PeerSummary) o;
        return java.util.Objects.equals(this.peerKey, other.peerKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerKey == null ? 43 : this.peerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
