/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * The Peer details to be added
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
    builder = CreatePeerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePeerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"role", "alias", "ocpuAllocationParam", "ad"})
    public CreatePeerDetails(
            PeerRole.Role role,
            String alias,
            OcpuAllocationNumberParam ocpuAllocationParam,
            AvailabilityDomain.Ads ad) {
        super();
        this.role = role;
        this.alias = alias;
        this.ocpuAllocationParam = ocpuAllocationParam;
        this.ad = ad;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * Availability Domain to place new peer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private AvailabilityDomain.Ads ad;

        /**
         * Availability Domain to place new peer
         * @param ad the value to set
         * @return this builder
         **/
        public Builder ad(AvailabilityDomain.Ads ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePeerDetails build() {
            CreatePeerDetails __instance__ =
                    new CreatePeerDetails(role, alias, ocpuAllocationParam, ad);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePeerDetails o) {
            Builder copiedBuilder =
                    role(o.getRole())
                            .alias(o.getAlias())
                            .ocpuAllocationParam(o.getOcpuAllocationParam())
                            .ad(o.getAd());

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
     * Availability Domain to place new peer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final AvailabilityDomain.Ads ad;

    /**
     * Availability Domain to place new peer
     * @return the value
     **/
    public AvailabilityDomain.Ads getAd() {
        return ad;
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
        sb.append("CreatePeerDetails(");
        sb.append("role=").append(String.valueOf(this.role));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", ocpuAllocationParam=").append(String.valueOf(this.ocpuAllocationParam));
        sb.append(", ad=").append(String.valueOf(this.ad));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePeerDetails)) {
            return false;
        }

        CreatePeerDetails other = (CreatePeerDetails) o;
        return java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.ocpuAllocationParam, other.ocpuAllocationParam)
                && java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuAllocationParam == null
                                ? 43
                                : this.ocpuAllocationParam.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
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
