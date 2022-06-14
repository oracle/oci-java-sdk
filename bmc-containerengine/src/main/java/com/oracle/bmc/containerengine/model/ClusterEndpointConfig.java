/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define the network configuration for the Cluster endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterEndpointConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterEndpointConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "nsgIds", "isPublicIpEnabled"})
    public ClusterEndpointConfig(
            String subnetId, java.util.List<String> nsgIds, Boolean isPublicIpEnabled) {
        super();
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.isPublicIpEnabled = isPublicIpEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the regional subnet in which to place the Cluster endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the regional subnet in which to place the Cluster endpoint.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPublicIpEnabled")
        private Boolean isPublicIpEnabled;

        /**
         * Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
         * @param isPublicIpEnabled the value to set
         * @return this builder
         **/
        public Builder isPublicIpEnabled(Boolean isPublicIpEnabled) {
            this.isPublicIpEnabled = isPublicIpEnabled;
            this.__explicitlySet__.add("isPublicIpEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterEndpointConfig build() {
            ClusterEndpointConfig __instance__ =
                    new ClusterEndpointConfig(subnetId, nsgIds, isPublicIpEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterEndpointConfig o) {
            Builder copiedBuilder =
                    subnetId(o.getSubnetId())
                            .nsgIds(o.getNsgIds())
                            .isPublicIpEnabled(o.getIsPublicIpEnabled());

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
     * The OCID of the regional subnet in which to place the Cluster endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the regional subnet in which to place the Cluster endpoint.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublicIpEnabled")
    private final Boolean isPublicIpEnabled;

    /**
     * Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
     * @return the value
     **/
    public Boolean getIsPublicIpEnabled() {
        return isPublicIpEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterEndpointConfig(");
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", isPublicIpEnabled=").append(String.valueOf(this.isPublicIpEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterEndpointConfig)) {
            return false;
        }

        ClusterEndpointConfig other = (ClusterEndpointConfig) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.isPublicIpEnabled, other.isPublicIpEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isPublicIpEnabled == null ? 43 : this.isPublicIpEnabled.hashCode());
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
