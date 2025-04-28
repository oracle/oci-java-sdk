/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes a network interface. <br>
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
        builder = InstanceNetworkInterface.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceNetworkInterface
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "association",
        "attachment",
        "description",
        "securityGroups",
        "interfaceType",
        "ipv4Prefixes",
        "ipv6Addresses",
        "ipv6Prefixes",
        "macAddress",
        "networkInterfaceKey",
        "ownerKey",
        "privateIpAddresses",
        "isSourceDestCheck",
        "status",
        "subnetKey"
    })
    public InstanceNetworkInterface(
            InstanceNetworkInterfaceAssociation association,
            InstanceNetworkInterfaceAttachment attachment,
            String description,
            java.util.List<GroupIdentifier> securityGroups,
            String interfaceType,
            java.util.List<String> ipv4Prefixes,
            java.util.List<String> ipv6Addresses,
            java.util.List<String> ipv6Prefixes,
            String macAddress,
            String networkInterfaceKey,
            String ownerKey,
            java.util.List<InstancePrivateIpAddress> privateIpAddresses,
            Boolean isSourceDestCheck,
            String status,
            String subnetKey) {
        super();
        this.association = association;
        this.attachment = attachment;
        this.description = description;
        this.securityGroups = securityGroups;
        this.interfaceType = interfaceType;
        this.ipv4Prefixes = ipv4Prefixes;
        this.ipv6Addresses = ipv6Addresses;
        this.ipv6Prefixes = ipv6Prefixes;
        this.macAddress = macAddress;
        this.networkInterfaceKey = networkInterfaceKey;
        this.ownerKey = ownerKey;
        this.privateIpAddresses = privateIpAddresses;
        this.isSourceDestCheck = isSourceDestCheck;
        this.status = status;
        this.subnetKey = subnetKey;
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

        @com.fasterxml.jackson.annotation.JsonProperty("attachment")
        private InstanceNetworkInterfaceAttachment attachment;

        public Builder attachment(InstanceNetworkInterfaceAttachment attachment) {
            this.attachment = attachment;
            this.__explicitlySet__.add("attachment");
            return this;
        }
        /** The description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The security groups. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityGroups")
        private java.util.List<GroupIdentifier> securityGroups;

        /**
         * The security groups.
         *
         * @param securityGroups the value to set
         * @return this builder
         */
        public Builder securityGroups(java.util.List<GroupIdentifier> securityGroups) {
            this.securityGroups = securityGroups;
            this.__explicitlySet__.add("securityGroups");
            return this;
        }
        /** The type of network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceType")
        private String interfaceType;

        /**
         * The type of network interface.
         *
         * @param interfaceType the value to set
         * @return this builder
         */
        public Builder interfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            this.__explicitlySet__.add("interfaceType");
            return this;
        }
        /** The IPv4 delegated prefixes that are assigned to the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4Prefixes")
        private java.util.List<String> ipv4Prefixes;

        /**
         * The IPv4 delegated prefixes that are assigned to the network interface.
         *
         * @param ipv4Prefixes the value to set
         * @return this builder
         */
        public Builder ipv4Prefixes(java.util.List<String> ipv4Prefixes) {
            this.ipv4Prefixes = ipv4Prefixes;
            this.__explicitlySet__.add("ipv4Prefixes");
            return this;
        }
        /** The IPv6 addresses associated with the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Addresses")
        private java.util.List<String> ipv6Addresses;

        /**
         * The IPv6 addresses associated with the network interface.
         *
         * @param ipv6Addresses the value to set
         * @return this builder
         */
        public Builder ipv6Addresses(java.util.List<String> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            this.__explicitlySet__.add("ipv6Addresses");
            return this;
        }
        /** The IPv6 delegated prefixes that are assigned to the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Prefixes")
        private java.util.List<String> ipv6Prefixes;

        /**
         * The IPv6 delegated prefixes that are assigned to the network interface.
         *
         * @param ipv6Prefixes the value to set
         * @return this builder
         */
        public Builder ipv6Prefixes(java.util.List<String> ipv6Prefixes) {
            this.ipv6Prefixes = ipv6Prefixes;
            this.__explicitlySet__.add("ipv6Prefixes");
            return this;
        }
        /** The MAC address. */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * The MAC address.
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }
        /** The ID of the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkInterfaceKey")
        private String networkInterfaceKey;

        /**
         * The ID of the network interface.
         *
         * @param networkInterfaceKey the value to set
         * @return this builder
         */
        public Builder networkInterfaceKey(String networkInterfaceKey) {
            this.networkInterfaceKey = networkInterfaceKey;
            this.__explicitlySet__.add("networkInterfaceKey");
            return this;
        }
        /** The ID of the AWS account that created the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("ownerKey")
        private String ownerKey;

        /**
         * The ID of the AWS account that created the network interface.
         *
         * @param ownerKey the value to set
         * @return this builder
         */
        public Builder ownerKey(String ownerKey) {
            this.ownerKey = ownerKey;
            this.__explicitlySet__.add("ownerKey");
            return this;
        }
        /** The private IPv4 addresses associated with the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddresses")
        private java.util.List<InstancePrivateIpAddress> privateIpAddresses;

        /**
         * The private IPv4 addresses associated with the network interface.
         *
         * @param privateIpAddresses the value to set
         * @return this builder
         */
        public Builder privateIpAddresses(
                java.util.List<InstancePrivateIpAddress> privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            this.__explicitlySet__.add("privateIpAddresses");
            return this;
        }
        /** Indicates whether source/destination checking is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSourceDestCheck")
        private Boolean isSourceDestCheck;

        /**
         * Indicates whether source/destination checking is enabled.
         *
         * @param isSourceDestCheck the value to set
         * @return this builder
         */
        public Builder isSourceDestCheck(Boolean isSourceDestCheck) {
            this.isSourceDestCheck = isSourceDestCheck;
            this.__explicitlySet__.add("isSourceDestCheck");
            return this;
        }
        /** The status of the network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status of the network interface.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The ID of the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetKey")
        private String subnetKey;

        /**
         * The ID of the subnet.
         *
         * @param subnetKey the value to set
         * @return this builder
         */
        public Builder subnetKey(String subnetKey) {
            this.subnetKey = subnetKey;
            this.__explicitlySet__.add("subnetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceNetworkInterface build() {
            InstanceNetworkInterface model =
                    new InstanceNetworkInterface(
                            this.association,
                            this.attachment,
                            this.description,
                            this.securityGroups,
                            this.interfaceType,
                            this.ipv4Prefixes,
                            this.ipv6Addresses,
                            this.ipv6Prefixes,
                            this.macAddress,
                            this.networkInterfaceKey,
                            this.ownerKey,
                            this.privateIpAddresses,
                            this.isSourceDestCheck,
                            this.status,
                            this.subnetKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceNetworkInterface model) {
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
            }
            if (model.wasPropertyExplicitlySet("attachment")) {
                this.attachment(model.getAttachment());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("securityGroups")) {
                this.securityGroups(model.getSecurityGroups());
            }
            if (model.wasPropertyExplicitlySet("interfaceType")) {
                this.interfaceType(model.getInterfaceType());
            }
            if (model.wasPropertyExplicitlySet("ipv4Prefixes")) {
                this.ipv4Prefixes(model.getIpv4Prefixes());
            }
            if (model.wasPropertyExplicitlySet("ipv6Addresses")) {
                this.ipv6Addresses(model.getIpv6Addresses());
            }
            if (model.wasPropertyExplicitlySet("ipv6Prefixes")) {
                this.ipv6Prefixes(model.getIpv6Prefixes());
            }
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
            }
            if (model.wasPropertyExplicitlySet("networkInterfaceKey")) {
                this.networkInterfaceKey(model.getNetworkInterfaceKey());
            }
            if (model.wasPropertyExplicitlySet("ownerKey")) {
                this.ownerKey(model.getOwnerKey());
            }
            if (model.wasPropertyExplicitlySet("privateIpAddresses")) {
                this.privateIpAddresses(model.getPrivateIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("isSourceDestCheck")) {
                this.isSourceDestCheck(model.getIsSourceDestCheck());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("subnetKey")) {
                this.subnetKey(model.getSubnetKey());
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

    @com.fasterxml.jackson.annotation.JsonProperty("attachment")
    private final InstanceNetworkInterfaceAttachment attachment;

    public InstanceNetworkInterfaceAttachment getAttachment() {
        return attachment;
    }

    /** The description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The security groups. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityGroups")
    private final java.util.List<GroupIdentifier> securityGroups;

    /**
     * The security groups.
     *
     * @return the value
     */
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        return securityGroups;
    }

    /** The type of network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceType")
    private final String interfaceType;

    /**
     * The type of network interface.
     *
     * @return the value
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /** The IPv4 delegated prefixes that are assigned to the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4Prefixes")
    private final java.util.List<String> ipv4Prefixes;

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * @return the value
     */
    public java.util.List<String> getIpv4Prefixes() {
        return ipv4Prefixes;
    }

    /** The IPv6 addresses associated with the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Addresses")
    private final java.util.List<String> ipv6Addresses;

    /**
     * The IPv6 addresses associated with the network interface.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /** The IPv6 delegated prefixes that are assigned to the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Prefixes")
    private final java.util.List<String> ipv6Prefixes;

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6Prefixes() {
        return ipv6Prefixes;
    }

    /** The MAC address. */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * The MAC address.
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
    }

    /** The ID of the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkInterfaceKey")
    private final String networkInterfaceKey;

    /**
     * The ID of the network interface.
     *
     * @return the value
     */
    public String getNetworkInterfaceKey() {
        return networkInterfaceKey;
    }

    /** The ID of the AWS account that created the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("ownerKey")
    private final String ownerKey;

    /**
     * The ID of the AWS account that created the network interface.
     *
     * @return the value
     */
    public String getOwnerKey() {
        return ownerKey;
    }

    /** The private IPv4 addresses associated with the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddresses")
    private final java.util.List<InstancePrivateIpAddress> privateIpAddresses;

    /**
     * The private IPv4 addresses associated with the network interface.
     *
     * @return the value
     */
    public java.util.List<InstancePrivateIpAddress> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /** Indicates whether source/destination checking is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSourceDestCheck")
    private final Boolean isSourceDestCheck;

    /**
     * Indicates whether source/destination checking is enabled.
     *
     * @return the value
     */
    public Boolean getIsSourceDestCheck() {
        return isSourceDestCheck;
    }

    /** The status of the network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the network interface.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The ID of the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetKey")
    private final String subnetKey;

    /**
     * The ID of the subnet.
     *
     * @return the value
     */
    public String getSubnetKey() {
        return subnetKey;
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
        sb.append("InstanceNetworkInterface(");
        sb.append("super=").append(super.toString());
        sb.append("association=").append(String.valueOf(this.association));
        sb.append(", attachment=").append(String.valueOf(this.attachment));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", securityGroups=").append(String.valueOf(this.securityGroups));
        sb.append(", interfaceType=").append(String.valueOf(this.interfaceType));
        sb.append(", ipv4Prefixes=").append(String.valueOf(this.ipv4Prefixes));
        sb.append(", ipv6Addresses=").append(String.valueOf(this.ipv6Addresses));
        sb.append(", ipv6Prefixes=").append(String.valueOf(this.ipv6Prefixes));
        sb.append(", macAddress=").append(String.valueOf(this.macAddress));
        sb.append(", networkInterfaceKey=").append(String.valueOf(this.networkInterfaceKey));
        sb.append(", ownerKey=").append(String.valueOf(this.ownerKey));
        sb.append(", privateIpAddresses=").append(String.valueOf(this.privateIpAddresses));
        sb.append(", isSourceDestCheck=").append(String.valueOf(this.isSourceDestCheck));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", subnetKey=").append(String.valueOf(this.subnetKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceNetworkInterface)) {
            return false;
        }

        InstanceNetworkInterface other = (InstanceNetworkInterface) o;
        return java.util.Objects.equals(this.association, other.association)
                && java.util.Objects.equals(this.attachment, other.attachment)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.securityGroups, other.securityGroups)
                && java.util.Objects.equals(this.interfaceType, other.interfaceType)
                && java.util.Objects.equals(this.ipv4Prefixes, other.ipv4Prefixes)
                && java.util.Objects.equals(this.ipv6Addresses, other.ipv6Addresses)
                && java.util.Objects.equals(this.ipv6Prefixes, other.ipv6Prefixes)
                && java.util.Objects.equals(this.macAddress, other.macAddress)
                && java.util.Objects.equals(this.networkInterfaceKey, other.networkInterfaceKey)
                && java.util.Objects.equals(this.ownerKey, other.ownerKey)
                && java.util.Objects.equals(this.privateIpAddresses, other.privateIpAddresses)
                && java.util.Objects.equals(this.isSourceDestCheck, other.isSourceDestCheck)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.subnetKey, other.subnetKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result = (result * PRIME) + (this.attachment == null ? 43 : this.attachment.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.securityGroups == null ? 43 : this.securityGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.interfaceType == null ? 43 : this.interfaceType.hashCode());
        result = (result * PRIME) + (this.ipv4Prefixes == null ? 43 : this.ipv4Prefixes.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6Addresses == null ? 43 : this.ipv6Addresses.hashCode());
        result = (result * PRIME) + (this.ipv6Prefixes == null ? 43 : this.ipv6Prefixes.hashCode());
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.networkInterfaceKey == null
                                ? 43
                                : this.networkInterfaceKey.hashCode());
        result = (result * PRIME) + (this.ownerKey == null ? 43 : this.ownerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.privateIpAddresses == null
                                ? 43
                                : this.privateIpAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.isSourceDestCheck == null ? 43 : this.isSourceDestCheck.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.subnetKey == null ? 43 : this.subnetKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
