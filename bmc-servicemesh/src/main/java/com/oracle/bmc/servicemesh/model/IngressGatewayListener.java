/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Listener configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressGatewayListener.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressGatewayListener
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"protocol", "port", "tls"})
    public IngressGatewayListener(Protocol protocol, Integer port, IngressListenerTlsConfig tls) {
        super();
        this.protocol = protocol;
        this.port = port;
        this.tls = tls;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of protocol used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Type of protocol used.
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * Port on which ingress gateway is listening.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port on which ingress gateway is listening.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tls")
        private IngressListenerTlsConfig tls;

        public Builder tls(IngressListenerTlsConfig tls) {
            this.tls = tls;
            this.__explicitlySet__.add("tls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressGatewayListener build() {
            IngressGatewayListener model =
                    new IngressGatewayListener(this.protocol, this.port, this.tls);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressGatewayListener model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("tls")) {
                this.tls(model.getTls());
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
     * Type of protocol used.
     **/
    public enum Protocol {
        Http("HTTP"),
        TlsPassthrough("TLS_PASSTHROUGH"),
        Tcp("TCP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Protocol.class);

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Protocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of protocol used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Type of protocol used.
     * @return the value
     **/
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Port on which ingress gateway is listening.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port on which ingress gateway is listening.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    private final IngressListenerTlsConfig tls;

    public IngressListenerTlsConfig getTls() {
        return tls;
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
        sb.append("IngressGatewayListener(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", tls=").append(String.valueOf(this.tls));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressGatewayListener)) {
            return false;
        }

        IngressGatewayListener other = (IngressGatewayListener) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.tls, other.tls)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.tls == null ? 43 : this.tls.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
