/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Network Configuration metric for the host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostNetworkConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostNetworkConfiguration extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Name of the network interface */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
        private String interfaceName;

        /**
         * Name of the network interface
         *
         * @param interfaceName the value to set
         * @return this builder
         */
        public Builder interfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            this.__explicitlySet__.add("interfaceName");
            return this;
        }
        /** IP address (IPv4 or IPv6) of the network interface */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP address (IPv4 or IPv6) of the network interface
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * MAC address of the network interface. MAC address is a 12-digit hexadecimal number
         * separated by colons or dashes or dots. Following formats are accepted: MM:MM:MM:SS:SS:SS,
         * MM-MM-MM-SS-SS-SS, MM.MM.MM.SS.SS.SS, MMM:MMM:SSS:SSS, MMM-MMM-SSS-SSS, MMM.MMM.SSS.SSS,
         * MMMM:MMSS:SSSS, MMMM-MMSS-SSSS, MMMM.MMSS.SSSS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * MAC address of the network interface. MAC address is a 12-digit hexadecimal number
         * separated by colons or dashes or dots. Following formats are accepted: MM:MM:MM:SS:SS:SS,
         * MM-MM-MM-SS-SS-SS, MM.MM.MM.SS.SS.SS, MMM:MMM:SSS:SSS, MMM-MMM-SSS-SSS, MMM.MMM.SSS.SSS,
         * MMMM:MMSS:SSSS, MMMM-MMSS-SSSS, MMMM.MMSS.SSSS
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostNetworkConfiguration build() {
            HostNetworkConfiguration model =
                    new HostNetworkConfiguration(
                            this.timeCollected,
                            this.interfaceName,
                            this.ipAddress,
                            this.macAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostNetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("interfaceName")) {
                this.interfaceName(model.getInterfaceName());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
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
    public HostNetworkConfiguration(
            java.util.Date timeCollected,
            String interfaceName,
            String ipAddress,
            String macAddress) {
        super(timeCollected);
        this.interfaceName = interfaceName;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
    }

    /** Name of the network interface */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
    private final String interfaceName;

    /**
     * Name of the network interface
     *
     * @return the value
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /** IP address (IPv4 or IPv6) of the network interface */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP address (IPv4 or IPv6) of the network interface
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * MAC address of the network interface. MAC address is a 12-digit hexadecimal number separated
     * by colons or dashes or dots. Following formats are accepted: MM:MM:MM:SS:SS:SS,
     * MM-MM-MM-SS-SS-SS, MM.MM.MM.SS.SS.SS, MMM:MMM:SSS:SSS, MMM-MMM-SSS-SSS, MMM.MMM.SSS.SSS,
     * MMMM:MMSS:SSSS, MMMM-MMSS-SSSS, MMMM.MMSS.SSSS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * MAC address of the network interface. MAC address is a 12-digit hexadecimal number separated
     * by colons or dashes or dots. Following formats are accepted: MM:MM:MM:SS:SS:SS,
     * MM-MM-MM-SS-SS-SS, MM.MM.MM.SS.SS.SS, MMM:MMM:SSS:SSS, MMM-MMM-SSS-SSS, MMM.MMM.SSS.SSS,
     * MMMM:MMSS:SSSS, MMMM-MMSS-SSSS, MMMM.MMSS.SSSS
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
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
        sb.append("HostNetworkConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", interfaceName=").append(String.valueOf(this.interfaceName));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", macAddress=").append(String.valueOf(this.macAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostNetworkConfiguration)) {
            return false;
        }

        HostNetworkConfiguration other = (HostNetworkConfiguration) o;
        return java.util.Objects.equals(this.interfaceName, other.interfaceName)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.macAddress, other.macAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.interfaceName == null ? 43 : this.interfaceName.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        return result;
    }
}
