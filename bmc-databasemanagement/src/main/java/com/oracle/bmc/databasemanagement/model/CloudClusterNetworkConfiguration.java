/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a network address configuration in a cloud cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloudClusterNetworkConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudClusterNetworkConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"networkNumber", "networkType", "subnet"})
    public CloudClusterNetworkConfiguration(
            Integer networkNumber, NetworkType networkType, String subnet) {
        super();
        this.networkNumber = networkNumber;
        this.networkType = networkType;
        this.subnet = subnet;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The network number. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
        private Integer networkNumber;

        /**
         * The network number.
         *
         * @param networkNumber the value to set
         * @return this builder
         */
        public Builder networkNumber(Integer networkNumber) {
            this.networkNumber = networkNumber;
            this.__explicitlySet__.add("networkNumber");
            return this;
        }
        /** The network type. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        /**
         * The network type.
         *
         * @param networkType the value to set
         * @return this builder
         */
        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }
        /** The subnet for the network. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnet")
        private String subnet;

        /**
         * The subnet for the network.
         *
         * @param subnet the value to set
         * @return this builder
         */
        public Builder subnet(String subnet) {
            this.subnet = subnet;
            this.__explicitlySet__.add("subnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudClusterNetworkConfiguration build() {
            CloudClusterNetworkConfiguration model =
                    new CloudClusterNetworkConfiguration(
                            this.networkNumber, this.networkType, this.subnet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudClusterNetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("networkNumber")) {
                this.networkNumber(model.getNetworkNumber());
            }
            if (model.wasPropertyExplicitlySet("networkType")) {
                this.networkType(model.getNetworkType());
            }
            if (model.wasPropertyExplicitlySet("subnet")) {
                this.subnet(model.getSubnet());
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

    /** The network number. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
    private final Integer networkNumber;

    /**
     * The network number.
     *
     * @return the value
     */
    public Integer getNetworkNumber() {
        return networkNumber;
    }

    /** The network type. */
    public enum NetworkType implements com.oracle.bmc.http.internal.BmcEnum {
        Autoconfig("AUTOCONFIG"),
        Dhcp("DHCP"),
        Static("STATIC"),
        Mixed("MIXED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkType.class);

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The network type. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    private final NetworkType networkType;

    /**
     * The network type.
     *
     * @return the value
     */
    public NetworkType getNetworkType() {
        return networkType;
    }

    /** The subnet for the network. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnet")
    private final String subnet;

    /**
     * The subnet for the network.
     *
     * @return the value
     */
    public String getSubnet() {
        return subnet;
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
        sb.append("CloudClusterNetworkConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("networkNumber=").append(String.valueOf(this.networkNumber));
        sb.append(", networkType=").append(String.valueOf(this.networkType));
        sb.append(", subnet=").append(String.valueOf(this.subnet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudClusterNetworkConfiguration)) {
            return false;
        }

        CloudClusterNetworkConfiguration other = (CloudClusterNetworkConfiguration) o;
        return java.util.Objects.equals(this.networkNumber, other.networkNumber)
                && java.util.Objects.equals(this.networkType, other.networkType)
                && java.util.Objects.equals(this.subnet, other.subnet)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkNumber == null ? 43 : this.networkNumber.hashCode());
        result = (result * PRIME) + (this.networkType == null ? 43 : this.networkType.hashCode());
        result = (result * PRIME) + (this.subnet == null ? 43 : this.subnet.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
