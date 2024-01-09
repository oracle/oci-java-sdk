/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * TCP connection results. All durations are in milliseconds. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TcpConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TcpConnection extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "port",
        "connectDuration",
        "secureConnectDuration"
    })
    public TcpConnection(
            String address, Integer port, Double connectDuration, Double secureConnectDuration) {
        super();
        this.address = address;
        this.port = port;
        this.connectDuration = connectDuration;
        this.secureConnectDuration = secureConnectDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The connection IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The connection IP address.
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** The port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Total connect duration, calculated using {@code connectEnd} minus {@code connectStart}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectDuration")
        private Double connectDuration;

        /**
         * Total connect duration, calculated using {@code connectEnd} minus {@code connectStart}.
         *
         * @param connectDuration the value to set
         * @return this builder
         */
        public Builder connectDuration(Double connectDuration) {
            this.connectDuration = connectDuration;
            this.__explicitlySet__.add("connectDuration");
            return this;
        }
        /**
         * The duration to secure the connection. This value will be zero for insecure connections.
         * Calculated using {@code connectEnd} minus {@code secureConnectionStart}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secureConnectDuration")
        private Double secureConnectDuration;

        /**
         * The duration to secure the connection. This value will be zero for insecure connections.
         * Calculated using {@code connectEnd} minus {@code secureConnectionStart}.
         *
         * @param secureConnectDuration the value to set
         * @return this builder
         */
        public Builder secureConnectDuration(Double secureConnectDuration) {
            this.secureConnectDuration = secureConnectDuration;
            this.__explicitlySet__.add("secureConnectDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TcpConnection build() {
            TcpConnection model =
                    new TcpConnection(
                            this.address,
                            this.port,
                            this.connectDuration,
                            this.secureConnectDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpConnection model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("connectDuration")) {
                this.connectDuration(model.getConnectDuration());
            }
            if (model.wasPropertyExplicitlySet("secureConnectDuration")) {
                this.secureConnectDuration(model.getSecureConnectDuration());
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

    /** The connection IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The connection IP address.
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** The port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Total connect duration, calculated using {@code connectEnd} minus {@code connectStart}. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectDuration")
    private final Double connectDuration;

    /**
     * Total connect duration, calculated using {@code connectEnd} minus {@code connectStart}.
     *
     * @return the value
     */
    public Double getConnectDuration() {
        return connectDuration;
    }

    /**
     * The duration to secure the connection. This value will be zero for insecure connections.
     * Calculated using {@code connectEnd} minus {@code secureConnectionStart}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secureConnectDuration")
    private final Double secureConnectDuration;

    /**
     * The duration to secure the connection. This value will be zero for insecure connections.
     * Calculated using {@code connectEnd} minus {@code secureConnectionStart}.
     *
     * @return the value
     */
    public Double getSecureConnectDuration() {
        return secureConnectDuration;
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
        sb.append("TcpConnection(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", connectDuration=").append(String.valueOf(this.connectDuration));
        sb.append(", secureConnectDuration=").append(String.valueOf(this.secureConnectDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TcpConnection)) {
            return false;
        }

        TcpConnection other = (TcpConnection) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.connectDuration, other.connectDuration)
                && java.util.Objects.equals(this.secureConnectDuration, other.secureConnectDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.connectDuration == null ? 43 : this.connectDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.secureConnectDuration == null
                                ? 43
                                : this.secureConnectDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
