/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes a private IPv4 address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePrivateIpAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePrivateIpAddress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "association",
        "isPrimary",
        "privateDnsName",
        "privateIpAddress"
    })
    public InstancePrivateIpAddress(
            InstanceNetworkInterfaceAssociation association,
            Boolean isPrimary,
            String privateDnsName,
            String privateIpAddress) {
        super();
        this.association = association;
        this.isPrimary = isPrimary;
        this.privateDnsName = privateDnsName;
        this.privateIpAddress = privateIpAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("association")
        private InstanceNetworkInterfaceAssociation association;

        public Builder association(InstanceNetworkInterfaceAssociation association) {
            this.association = association;
            this.__explicitlySet__.add("association");
            return this;
        }
        /**
         * Indicates whether this IPv4 address is the primary private IP address of the network
         * interface.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * Indicates whether this IPv4 address is the primary private IP address of the network
         * interface.
         *
         * @param isPrimary the value to set
         * @return this builder
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }
        /** The private IPv4 DNS name. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateDnsName")
        private String privateDnsName;

        /**
         * The private IPv4 DNS name.
         *
         * @param privateDnsName the value to set
         * @return this builder
         */
        public Builder privateDnsName(String privateDnsName) {
            this.privateDnsName = privateDnsName;
            this.__explicitlySet__.add("privateDnsName");
            return this;
        }
        /** The private IPv4 address of the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
        private String privateIpAddress;

        /**
         * The private IPv4 address of the network interface.
         *
         * @param privateIpAddress the value to set
         * @return this builder
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            this.__explicitlySet__.add("privateIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePrivateIpAddress build() {
            InstancePrivateIpAddress model =
                    new InstancePrivateIpAddress(
                            this.association,
                            this.isPrimary,
                            this.privateDnsName,
                            this.privateIpAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePrivateIpAddress model) {
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("privateDnsName")) {
                this.privateDnsName(model.getPrivateDnsName());
            }
            if (model.wasPropertyExplicitlySet("privateIpAddress")) {
                this.privateIpAddress(model.getPrivateIpAddress());
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

    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private final InstanceNetworkInterfaceAssociation association;

    public InstanceNetworkInterfaceAssociation getAssociation() {
        return association;
    }

    /**
     * Indicates whether this IPv4 address is the primary private IP address of the network
     * interface.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * Indicates whether this IPv4 address is the primary private IP address of the network
     * interface.
     *
     * @return the value
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /** The private IPv4 DNS name. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateDnsName")
    private final String privateDnsName;

    /**
     * The private IPv4 DNS name.
     *
     * @return the value
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /** The private IPv4 address of the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
    private final String privateIpAddress;

    /**
     * The private IPv4 address of the network interface.
     *
     * @return the value
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
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
        sb.append("InstancePrivateIpAddress(");
        sb.append("super=").append(super.toString());
        sb.append("association=").append(String.valueOf(this.association));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", privateDnsName=").append(String.valueOf(this.privateDnsName));
        sb.append(", privateIpAddress=").append(String.valueOf(this.privateIpAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePrivateIpAddress)) {
            return false;
        }

        InstancePrivateIpAddress other = (InstancePrivateIpAddress) o;
        return java.util.Objects.equals(this.association, other.association)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.privateDnsName, other.privateDnsName)
                && java.util.Objects.equals(this.privateIpAddress, other.privateIpAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result =
                (result * PRIME)
                        + (this.privateDnsName == null ? 43 : this.privateDnsName.hashCode());
        result =
                (result * PRIME)
                        + (this.privateIpAddress == null ? 43 : this.privateIpAddress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
