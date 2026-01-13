/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The VNIC configuration. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Nic.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Nic extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "label",
        "switchName",
        "macAddress",
        "macAddressType",
        "networkName",
        "ipAddresses"
    })
    public Nic(
            String label,
            String switchName,
            String macAddress,
            String macAddressType,
            String networkName,
            java.util.List<String> ipAddresses) {
        super();
        this.label = label;
        this.switchName = switchName;
        this.macAddress = macAddress;
        this.macAddressType = macAddressType;
        this.networkName = networkName;
        this.ipAddresses = ipAddresses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Provides a label and summary information for the device. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Provides a label and summary information for the device.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** Switch name. */
        @com.fasterxml.jackson.annotation.JsonProperty("switchName")
        private String switchName;

        /**
         * Switch name.
         *
         * @param switchName the value to set
         * @return this builder
         */
        public Builder switchName(String switchName) {
            this.switchName = switchName;
            this.__explicitlySet__.add("switchName");
            return this;
        }
        /** Mac address of the VM. */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * Mac address of the VM.
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }
        /** Mac address type. */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddressType")
        private String macAddressType;

        /**
         * Mac address type.
         *
         * @param macAddressType the value to set
         * @return this builder
         */
        public Builder macAddressType(String macAddressType) {
            this.macAddressType = macAddressType;
            this.__explicitlySet__.add("macAddressType");
            return this;
        }
        /** Network name. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkName")
        private String networkName;

        /**
         * Network name.
         *
         * @param networkName the value to set
         * @return this builder
         */
        public Builder networkName(String networkName) {
            this.networkName = networkName;
            this.__explicitlySet__.add("networkName");
            return this;
        }
        /** List of IP addresses. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<String> ipAddresses;

        /**
         * List of IP addresses.
         *
         * @param ipAddresses the value to set
         * @return this builder
         */
        public Builder ipAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Nic build() {
            Nic model =
                    new Nic(
                            this.label,
                            this.switchName,
                            this.macAddress,
                            this.macAddressType,
                            this.networkName,
                            this.ipAddresses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Nic model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("switchName")) {
                this.switchName(model.getSwitchName());
            }
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
            }
            if (model.wasPropertyExplicitlySet("macAddressType")) {
                this.macAddressType(model.getMacAddressType());
            }
            if (model.wasPropertyExplicitlySet("networkName")) {
                this.networkName(model.getNetworkName());
            }
            if (model.wasPropertyExplicitlySet("ipAddresses")) {
                this.ipAddresses(model.getIpAddresses());
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

    /** Provides a label and summary information for the device. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Provides a label and summary information for the device.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** Switch name. */
    @com.fasterxml.jackson.annotation.JsonProperty("switchName")
    private final String switchName;

    /**
     * Switch name.
     *
     * @return the value
     */
    public String getSwitchName() {
        return switchName;
    }

    /** Mac address of the VM. */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * Mac address of the VM.
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
    }

    /** Mac address type. */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddressType")
    private final String macAddressType;

    /**
     * Mac address type.
     *
     * @return the value
     */
    public String getMacAddressType() {
        return macAddressType;
    }

    /** Network name. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkName")
    private final String networkName;

    /**
     * Network name.
     *
     * @return the value
     */
    public String getNetworkName() {
        return networkName;
    }

    /** List of IP addresses. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    private final java.util.List<String> ipAddresses;

    /**
     * List of IP addresses.
     *
     * @return the value
     */
    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
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
        sb.append("Nic(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", switchName=").append(String.valueOf(this.switchName));
        sb.append(", macAddress=").append(String.valueOf(this.macAddress));
        sb.append(", macAddressType=").append(String.valueOf(this.macAddressType));
        sb.append(", networkName=").append(String.valueOf(this.networkName));
        sb.append(", ipAddresses=").append(String.valueOf(this.ipAddresses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Nic)) {
            return false;
        }

        Nic other = (Nic) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.switchName, other.switchName)
                && java.util.Objects.equals(this.macAddress, other.macAddress)
                && java.util.Objects.equals(this.macAddressType, other.macAddressType)
                && java.util.Objects.equals(this.networkName, other.networkName)
                && java.util.Objects.equals(this.ipAddresses, other.ipAddresses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.switchName == null ? 43 : this.switchName.hashCode());
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.macAddressType == null ? 43 : this.macAddressType.hashCode());
        result = (result * PRIME) + (this.networkName == null ? 43 : this.networkName.hashCode());
        result = (result * PRIME) + (this.ipAddresses == null ? 43 : this.ipAddresses.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
