/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Private endpoint configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivateEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "networkEndpointType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateEndpointDetails extends NetworkEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The subnet OCID for the private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet OCID for the private endpoint.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** Network Security Group OCIDs for the Private Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * Network Security Group OCIDs for the Private Endpoint.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         */
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /** The IP address to be assigned to Private Endpoint */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The IP address to be assigned to Private Endpoint
         *
         * @param privateEndpointIp the value to set
         * @return this builder
         */
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpointDetails build() {
            PrivateEndpointDetails model =
                    new PrivateEndpointDetails(
                            this.subnetId, this.networkSecurityGroupIds, this.privateEndpointIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
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

    @Deprecated
    public PrivateEndpointDetails(
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            String privateEndpointIp) {
        super();
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.privateEndpointIp = privateEndpointIp;
    }

    /** The subnet OCID for the private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet OCID for the private endpoint.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** Network Security Group OCIDs for the Private Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * Network Security Group OCIDs for the Private Endpoint.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /** The IP address to be assigned to Private Endpoint */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The IP address to be assigned to Private Endpoint
     *
     * @return the value
     */
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
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
        sb.append("PrivateEndpointDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpointDetails)) {
            return false;
        }

        PrivateEndpointDetails other = (PrivateEndpointDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        return result;
    }
}
