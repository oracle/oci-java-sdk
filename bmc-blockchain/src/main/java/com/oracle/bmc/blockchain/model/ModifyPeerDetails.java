/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * peer to modify ocpu allocation
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
    builder = ModifyPeerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModifyPeerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"peerName", "ocpuAllocationParam"})
    public ModifyPeerDetails(String peerName, OcpuAllocationNumberParam ocpuAllocationParam) {
        super();
        this.peerName = peerName;
        this.ocpuAllocationParam = ocpuAllocationParam;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * peer identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerName")
        private String peerName;

        /**
         * peer identifier
         * @param peerName the value to set
         * @return this builder
         **/
        public Builder peerName(String peerName) {
            this.peerName = peerName;
            this.__explicitlySet__.add("peerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
        private OcpuAllocationNumberParam ocpuAllocationParam;

        public Builder ocpuAllocationParam(OcpuAllocationNumberParam ocpuAllocationParam) {
            this.ocpuAllocationParam = ocpuAllocationParam;
            this.__explicitlySet__.add("ocpuAllocationParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyPeerDetails build() {
            ModifyPeerDetails __instance__ = new ModifyPeerDetails(peerName, ocpuAllocationParam);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyPeerDetails o) {
            Builder copiedBuilder =
                    peerName(o.getPeerName()).ocpuAllocationParam(o.getOcpuAllocationParam());

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
    @com.fasterxml.jackson.annotation.JsonProperty("peerName")
    private final String peerName;

    /**
     * peer identifier
     * @return the value
     **/
    public String getPeerName() {
        return peerName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
    private final OcpuAllocationNumberParam ocpuAllocationParam;

    public OcpuAllocationNumberParam getOcpuAllocationParam() {
        return ocpuAllocationParam;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModifyPeerDetails(");
        sb.append("peerName=").append(String.valueOf(this.peerName));
        sb.append(", ocpuAllocationParam=").append(String.valueOf(this.ocpuAllocationParam));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyPeerDetails)) {
            return false;
        }

        ModifyPeerDetails other = (ModifyPeerDetails) o;
        return java.util.Objects.equals(this.peerName, other.peerName)
                && java.util.Objects.equals(this.ocpuAllocationParam, other.ocpuAllocationParam)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerName == null ? 43 : this.peerName.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuAllocationParam == null
                                ? 43
                                : this.ocpuAllocationParam.hashCode());
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
