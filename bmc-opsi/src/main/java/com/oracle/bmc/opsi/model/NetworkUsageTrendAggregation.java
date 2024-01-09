/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per network interface. <br>
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
        builder = NetworkUsageTrendAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkUsageTrendAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"interfaceName", "ipAddress", "macAddress", "usageData"})
    public NetworkUsageTrendAggregation(
            String interfaceName,
            String ipAddress,
            String macAddress,
            java.util.List<NetworkUsageTrend> usageData) {
        super();
        this.interfaceName = interfaceName;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.usageData = usageData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
        private String interfaceName;

        /**
         * Name of interface.
         *
         * @param interfaceName the value to set
         * @return this builder
         */
        public Builder interfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            this.__explicitlySet__.add("interfaceName");
            return this;
        }
        /**
         * Address that is connected to a computer network that uses the Internet Protocol for
         * communication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * Address that is connected to a computer network that uses the Internet Protocol for
         * communication.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** Unique identifier assigned to a network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * Unique identifier assigned to a network interface.
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }
        /** List of usage data samples for a network interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<NetworkUsageTrend> usageData;

        /**
         * List of usage data samples for a network interface.
         *
         * @param usageData the value to set
         * @return this builder
         */
        public Builder usageData(java.util.List<NetworkUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkUsageTrendAggregation build() {
            NetworkUsageTrendAggregation model =
                    new NetworkUsageTrendAggregation(
                            this.interfaceName, this.ipAddress, this.macAddress, this.usageData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkUsageTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("interfaceName")) {
                this.interfaceName(model.getInterfaceName());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
            }
            if (model.wasPropertyExplicitlySet("usageData")) {
                this.usageData(model.getUsageData());
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

    /** Name of interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
    private final String interfaceName;

    /**
     * Name of interface.
     *
     * @return the value
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Address that is connected to a computer network that uses the Internet Protocol for
     * communication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * Address that is connected to a computer network that uses the Internet Protocol for
     * communication.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** Unique identifier assigned to a network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * Unique identifier assigned to a network interface.
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
    }

    /** List of usage data samples for a network interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    private final java.util.List<NetworkUsageTrend> usageData;

    /**
     * List of usage data samples for a network interface.
     *
     * @return the value
     */
    public java.util.List<NetworkUsageTrend> getUsageData() {
        return usageData;
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
        sb.append("NetworkUsageTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("interfaceName=").append(String.valueOf(this.interfaceName));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", macAddress=").append(String.valueOf(this.macAddress));
        sb.append(", usageData=").append(String.valueOf(this.usageData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkUsageTrendAggregation)) {
            return false;
        }

        NetworkUsageTrendAggregation other = (NetworkUsageTrendAggregation) o;
        return java.util.Objects.equals(this.interfaceName, other.interfaceName)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.macAddress, other.macAddress)
                && java.util.Objects.equals(this.usageData, other.usageData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.interfaceName == null ? 43 : this.interfaceName.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        result = (result * PRIME) + (this.usageData == null ? 43 : this.usageData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
