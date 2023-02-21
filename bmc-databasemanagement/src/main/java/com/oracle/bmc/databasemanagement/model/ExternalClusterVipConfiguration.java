/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the Virtual IP (VIP) address for a node in an external cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalClusterVipConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalClusterVipConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeName", "address", "networkNumber"})
    public ExternalClusterVipConfiguration(String nodeName, String address, Integer networkNumber) {
        super();
        this.nodeName = nodeName;
        this.address = address;
        this.networkNumber = networkNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the node with the VIP.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
        private String nodeName;

        /**
         * The name of the node with the VIP.
         * @param nodeName the value to set
         * @return this builder
         **/
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            this.__explicitlySet__.add("nodeName");
            return this;
        }
        /**
         * The VIP name or IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The VIP name or IP address.
         * @param address the value to set
         * @return this builder
         **/
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * The network number from which VIPs are obtained.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
        private Integer networkNumber;

        /**
         * The network number from which VIPs are obtained.
         * @param networkNumber the value to set
         * @return this builder
         **/
        public Builder networkNumber(Integer networkNumber) {
            this.networkNumber = networkNumber;
            this.__explicitlySet__.add("networkNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalClusterVipConfiguration build() {
            ExternalClusterVipConfiguration model =
                    new ExternalClusterVipConfiguration(
                            this.nodeName, this.address, this.networkNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalClusterVipConfiguration model) {
            if (model.wasPropertyExplicitlySet("nodeName")) {
                this.nodeName(model.getNodeName());
            }
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("networkNumber")) {
                this.networkNumber(model.getNetworkNumber());
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
     * The name of the node with the VIP.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    private final String nodeName;

    /**
     * The name of the node with the VIP.
     * @return the value
     **/
    public String getNodeName() {
        return nodeName;
    }

    /**
     * The VIP name or IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The VIP name or IP address.
     * @return the value
     **/
    public String getAddress() {
        return address;
    }

    /**
     * The network number from which VIPs are obtained.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
    private final Integer networkNumber;

    /**
     * The network number from which VIPs are obtained.
     * @return the value
     **/
    public Integer getNetworkNumber() {
        return networkNumber;
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
        sb.append("ExternalClusterVipConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("nodeName=").append(String.valueOf(this.nodeName));
        sb.append(", address=").append(String.valueOf(this.address));
        sb.append(", networkNumber=").append(String.valueOf(this.networkNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalClusterVipConfiguration)) {
            return false;
        }

        ExternalClusterVipConfiguration other = (ExternalClusterVipConfiguration) o;
        return java.util.Objects.equals(this.nodeName, other.nodeName)
                && java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.networkNumber, other.networkNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeName == null ? 43 : this.nodeName.hashCode());
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result =
                (result * PRIME)
                        + (this.networkNumber == null ? 43 : this.networkNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
