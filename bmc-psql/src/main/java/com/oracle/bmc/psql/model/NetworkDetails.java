/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * DbSystem network details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "primaryDbEndpointPrivateIp", "nsgIds"})
    public NetworkDetails(
            String subnetId, String primaryDbEndpointPrivateIp, java.util.List<String> nsgIds) {
        super();
        this.subnetId = subnetId;
        this.primaryDbEndpointPrivateIp = primaryDbEndpointPrivateIp;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Customer Subnet identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Customer Subnet identifier
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Private IP in customer subnet. The value is optional. If the IP is not provided the IP
         * will be chosen among the available IP addresses from the specified subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpointPrivateIp")
        private String primaryDbEndpointPrivateIp;

        /**
         * Private IP in customer subnet. The value is optional. If the IP is not provided the IP
         * will be chosen among the available IP addresses from the specified subnet.
         *
         * @param primaryDbEndpointPrivateIp the value to set
         * @return this builder
         */
        public Builder primaryDbEndpointPrivateIp(String primaryDbEndpointPrivateIp) {
            this.primaryDbEndpointPrivateIp = primaryDbEndpointPrivateIp;
            this.__explicitlySet__.add("primaryDbEndpointPrivateIp");
            return this;
        }
        /** List of customer NetworkSecurityGroup identifiers */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * List of customer NetworkSecurityGroup identifiers
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkDetails build() {
            NetworkDetails model =
                    new NetworkDetails(this.subnetId, this.primaryDbEndpointPrivateIp, this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkDetails model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("primaryDbEndpointPrivateIp")) {
                this.primaryDbEndpointPrivateIp(model.getPrimaryDbEndpointPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /** Customer Subnet identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Customer Subnet identifier
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Private IP in customer subnet. The value is optional. If the IP is not provided the IP will
     * be chosen among the available IP addresses from the specified subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpointPrivateIp")
    private final String primaryDbEndpointPrivateIp;

    /**
     * Private IP in customer subnet. The value is optional. If the IP is not provided the IP will
     * be chosen among the available IP addresses from the specified subnet.
     *
     * @return the value
     */
    public String getPrimaryDbEndpointPrivateIp() {
        return primaryDbEndpointPrivateIp;
    }

    /** List of customer NetworkSecurityGroup identifiers */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * List of customer NetworkSecurityGroup identifiers
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
        sb.append("NetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", primaryDbEndpointPrivateIp=")
                .append(String.valueOf(this.primaryDbEndpointPrivateIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkDetails)) {
            return false;
        }

        NetworkDetails other = (NetworkDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.primaryDbEndpointPrivateIp, other.primaryDbEndpointPrivateIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryDbEndpointPrivateIp == null
                                ? 43
                                : this.primaryDbEndpointPrivateIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
