/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes association information for an Elastic IP address (IPv4).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceNetworkInterfaceAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceNetworkInterfaceAssociation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "carrierIp",
        "customerOwnedIp",
        "ipOwnerKey",
        "publicDnsName",
        "publicIp"
    })
    public InstanceNetworkInterfaceAssociation(
            String carrierIp,
            String customerOwnedIp,
            String ipOwnerKey,
            String publicDnsName,
            String publicIp) {
        super();
        this.carrierIp = carrierIp;
        this.customerOwnedIp = customerOwnedIp;
        this.ipOwnerKey = ipOwnerKey;
        this.publicDnsName = publicDnsName;
        this.publicIp = publicIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The carrier IP address associated with the network interface.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("carrierIp")
        private String carrierIp;

        /**
         * The carrier IP address associated with the network interface.
         * @param carrierIp the value to set
         * @return this builder
         **/
        public Builder carrierIp(String carrierIp) {
            this.carrierIp = carrierIp;
            this.__explicitlySet__.add("carrierIp");
            return this;
        }
        /**
         * The customer-owned IP address associated with the network interface.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerOwnedIp")
        private String customerOwnedIp;

        /**
         * The customer-owned IP address associated with the network interface.
         * @param customerOwnedIp the value to set
         * @return this builder
         **/
        public Builder customerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = customerOwnedIp;
            this.__explicitlySet__.add("customerOwnedIp");
            return this;
        }
        /**
         * The ID of the owner of the Elastic IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipOwnerKey")
        private String ipOwnerKey;

        /**
         * The ID of the owner of the Elastic IP address.
         * @param ipOwnerKey the value to set
         * @return this builder
         **/
        public Builder ipOwnerKey(String ipOwnerKey) {
            this.ipOwnerKey = ipOwnerKey;
            this.__explicitlySet__.add("ipOwnerKey");
            return this;
        }
        /**
         * The public DNS name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicDnsName")
        private String publicDnsName;

        /**
         * The public DNS name.
         * @param publicDnsName the value to set
         * @return this builder
         **/
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = publicDnsName;
            this.__explicitlySet__.add("publicDnsName");
            return this;
        }
        /**
         * The public IP address or Elastic IP address bound to the network interface.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        /**
         * The public IP address or Elastic IP address bound to the network interface.
         * @param publicIp the value to set
         * @return this builder
         **/
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            this.__explicitlySet__.add("publicIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceNetworkInterfaceAssociation build() {
            InstanceNetworkInterfaceAssociation model =
                    new InstanceNetworkInterfaceAssociation(
                            this.carrierIp,
                            this.customerOwnedIp,
                            this.ipOwnerKey,
                            this.publicDnsName,
                            this.publicIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceNetworkInterfaceAssociation model) {
            if (model.wasPropertyExplicitlySet("carrierIp")) {
                this.carrierIp(model.getCarrierIp());
            }
            if (model.wasPropertyExplicitlySet("customerOwnedIp")) {
                this.customerOwnedIp(model.getCustomerOwnedIp());
            }
            if (model.wasPropertyExplicitlySet("ipOwnerKey")) {
                this.ipOwnerKey(model.getIpOwnerKey());
            }
            if (model.wasPropertyExplicitlySet("publicDnsName")) {
                this.publicDnsName(model.getPublicDnsName());
            }
            if (model.wasPropertyExplicitlySet("publicIp")) {
                this.publicIp(model.getPublicIp());
            }
            return this;
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
     * The carrier IP address associated with the network interface.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("carrierIp")
    private final String carrierIp;

    /**
     * The carrier IP address associated with the network interface.
     * @return the value
     **/
    public String getCarrierIp() {
        return carrierIp;
    }

    /**
     * The customer-owned IP address associated with the network interface.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerOwnedIp")
    private final String customerOwnedIp;

    /**
     * The customer-owned IP address associated with the network interface.
     * @return the value
     **/
    public String getCustomerOwnedIp() {
        return customerOwnedIp;
    }

    /**
     * The ID of the owner of the Elastic IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipOwnerKey")
    private final String ipOwnerKey;

    /**
     * The ID of the owner of the Elastic IP address.
     * @return the value
     **/
    public String getIpOwnerKey() {
        return ipOwnerKey;
    }

    /**
     * The public DNS name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicDnsName")
    private final String publicDnsName;

    /**
     * The public DNS name.
     * @return the value
     **/
    public String getPublicDnsName() {
        return publicDnsName;
    }

    /**
     * The public IP address or Elastic IP address bound to the network interface.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    private final String publicIp;

    /**
     * The public IP address or Elastic IP address bound to the network interface.
     * @return the value
     **/
    public String getPublicIp() {
        return publicIp;
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
        sb.append("InstanceNetworkInterfaceAssociation(");
        sb.append("super=").append(super.toString());
        sb.append("carrierIp=").append(String.valueOf(this.carrierIp));
        sb.append(", customerOwnedIp=").append(String.valueOf(this.customerOwnedIp));
        sb.append(", ipOwnerKey=").append(String.valueOf(this.ipOwnerKey));
        sb.append(", publicDnsName=").append(String.valueOf(this.publicDnsName));
        sb.append(", publicIp=").append(String.valueOf(this.publicIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceNetworkInterfaceAssociation)) {
            return false;
        }

        InstanceNetworkInterfaceAssociation other = (InstanceNetworkInterfaceAssociation) o;
        return java.util.Objects.equals(this.carrierIp, other.carrierIp)
                && java.util.Objects.equals(this.customerOwnedIp, other.customerOwnedIp)
                && java.util.Objects.equals(this.ipOwnerKey, other.ipOwnerKey)
                && java.util.Objects.equals(this.publicDnsName, other.publicDnsName)
                && java.util.Objects.equals(this.publicIp, other.publicIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.carrierIp == null ? 43 : this.carrierIp.hashCode());
        result =
                (result * PRIME)
                        + (this.customerOwnedIp == null ? 43 : this.customerOwnedIp.hashCode());
        result = (result * PRIME) + (this.ipOwnerKey == null ? 43 : this.ipOwnerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publicDnsName == null ? 43 : this.publicDnsName.hashCode());
        result = (result * PRIME) + (this.publicIp == null ? 43 : this.publicIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
