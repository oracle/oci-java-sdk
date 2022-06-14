/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * A Peer details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Peer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Peer {
    @Deprecated
    @java.beans.ConstructorProperties({
        "peerKey",
        "role",
        "alias",
        "ocpuAllocationParam",
        "host",
        "ad",
        "lifecycleState"
    })
    public Peer(
            String peerKey,
            PeerRole.Role role,
            String alias,
            OcpuAllocationNumberParam ocpuAllocationParam,
            String host,
            AvailabilityDomain.Ads ad,
            LifecycleState lifecycleState) {
        super();
        this.peerKey = peerKey;
        this.role = role;
        this.alias = alias;
        this.ocpuAllocationParam = ocpuAllocationParam;
        this.host = host;
        this.ad = ad;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * peer identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerKey")
        private String peerKey;

        /**
         * peer identifier
         * @param peerKey the value to set
         * @return this builder
         **/
        public Builder peerKey(String peerKey) {
            this.peerKey = peerKey;
            this.__explicitlySet__.add("peerKey");
            return this;
        }
        /**
         * Peer role
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private PeerRole.Role role;

        /**
         * Peer role
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(PeerRole.Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * peer alias
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * peer alias
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
        private OcpuAllocationNumberParam ocpuAllocationParam;

        public Builder ocpuAllocationParam(OcpuAllocationNumberParam ocpuAllocationParam) {
            this.ocpuAllocationParam = ocpuAllocationParam;
            this.__explicitlySet__.add("ocpuAllocationParam");
            return this;
        }
        /**
         * Host on which the Peer exists
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Host on which the Peer exists
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * Availability Domain of peer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private AvailabilityDomain.Ads ad;

        /**
         * Availability Domain of peer
         * @param ad the value to set
         * @return this builder
         **/
        public Builder ad(AvailabilityDomain.Ads ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }
        /**
         * The current state of the peer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the peer.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Peer build() {
            Peer __instance__ =
                    new Peer(peerKey, role, alias, ocpuAllocationParam, host, ad, lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Peer o) {
            Builder copiedBuilder =
                    peerKey(o.getPeerKey())
                            .role(o.getRole())
                            .alias(o.getAlias())
                            .ocpuAllocationParam(o.getOcpuAllocationParam())
                            .host(o.getHost())
                            .ad(o.getAd())
                            .lifecycleState(o.getLifecycleState());

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
     * peer identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerKey")
    private final String peerKey;

    /**
     * peer identifier
     * @return the value
     **/
    public String getPeerKey() {
        return peerKey;
    }

    /**
     * Peer role
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final PeerRole.Role role;

    /**
     * Peer role
     * @return the value
     **/
    public PeerRole.Role getRole() {
        return role;
    }

    /**
     * peer alias
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * peer alias
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
    private final OcpuAllocationNumberParam ocpuAllocationParam;

    public OcpuAllocationNumberParam getOcpuAllocationParam() {
        return ocpuAllocationParam;
    }

    /**
     * Host on which the Peer exists
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Host on which the Peer exists
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * Availability Domain of peer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final AvailabilityDomain.Ads ad;

    /**
     * Availability Domain of peer
     * @return the value
     **/
    public AvailabilityDomain.Ads getAd() {
        return ad;
    }

    /**
     * The current state of the peer.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the peer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the peer.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Peer(");
        sb.append("peerKey=").append(String.valueOf(this.peerKey));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", ocpuAllocationParam=").append(String.valueOf(this.ocpuAllocationParam));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", ad=").append(String.valueOf(this.ad));
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
        if (!(o instanceof Peer)) {
            return false;
        }

        Peer other = (Peer) o;
        return java.util.Objects.equals(this.peerKey, other.peerKey)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.ocpuAllocationParam, other.ocpuAllocationParam)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerKey == null ? 43 : this.peerKey.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuAllocationParam == null
                                ? 43
                                : this.ocpuAllocationParam.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
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
