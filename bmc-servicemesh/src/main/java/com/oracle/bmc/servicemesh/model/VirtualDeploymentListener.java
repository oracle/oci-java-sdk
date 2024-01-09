/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Listener configuration for a virtual deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualDeploymentListener.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualDeploymentListener
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"protocol", "port", "requestTimeoutInMs", "idleTimeoutInMs"})
    public VirtualDeploymentListener(
            Protocol protocol, Integer port, Long requestTimeoutInMs, Long idleTimeoutInMs) {
        super();
        this.protocol = protocol;
        this.port = port;
        this.requestTimeoutInMs = requestTimeoutInMs;
        this.idleTimeoutInMs = idleTimeoutInMs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of protocol used in virtual deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Type of protocol used in virtual deployment.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Port in which virtual deployment is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port in which virtual deployment is running.
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
         * The maximum duration in milliseconds for the deployed service to respond to an incoming
         * request through the listener. If provided, the timeout value overrides the default
         * timeout of 15 seconds for the HTTP/HTTP2 listeners, and disabled (no timeout) for the
         * GRPC listeners. The value 0 (zero) indicates that the timeout is disabled. The timeout
         * cannot be configured for the TCP and TLS_PASSTHROUGH listeners. For streaming responses
         * from the deployed service, consider either keeping the timeout disabled or set a
         * sufficiently high value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
        private Long requestTimeoutInMs;

        /**
         * The maximum duration in milliseconds for the deployed service to respond to an incoming
         * request through the listener. If provided, the timeout value overrides the default
         * timeout of 15 seconds for the HTTP/HTTP2 listeners, and disabled (no timeout) for the
         * GRPC listeners. The value 0 (zero) indicates that the timeout is disabled. The timeout
         * cannot be configured for the TCP and TLS_PASSTHROUGH listeners. For streaming responses
         * from the deployed service, consider either keeping the timeout disabled or set a
         * sufficiently high value.
         *
         * @param requestTimeoutInMs the value to set
         * @return this builder
         */
        public Builder requestTimeoutInMs(Long requestTimeoutInMs) {
            this.requestTimeoutInMs = requestTimeoutInMs;
            this.__explicitlySet__.add("requestTimeoutInMs");
            return this;
        }
        /**
         * The maximum duration in milliseconds for which the request's stream may be idle. The
         * value 0 (zero) indicates that the timeout is disabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMs")
        private Long idleTimeoutInMs;

        /**
         * The maximum duration in milliseconds for which the request's stream may be idle. The
         * value 0 (zero) indicates that the timeout is disabled.
         *
         * @param idleTimeoutInMs the value to set
         * @return this builder
         */
        public Builder idleTimeoutInMs(Long idleTimeoutInMs) {
            this.idleTimeoutInMs = idleTimeoutInMs;
            this.__explicitlySet__.add("idleTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualDeploymentListener build() {
            VirtualDeploymentListener model =
                    new VirtualDeploymentListener(
                            this.protocol,
                            this.port,
                            this.requestTimeoutInMs,
                            this.idleTimeoutInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualDeploymentListener model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("requestTimeoutInMs")) {
                this.requestTimeoutInMs(model.getRequestTimeoutInMs());
            }
            if (model.wasPropertyExplicitlySet("idleTimeoutInMs")) {
                this.idleTimeoutInMs(model.getIdleTimeoutInMs());
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

    /** Type of protocol used in virtual deployment. */
    public enum Protocol implements com.oracle.bmc.http.internal.BmcEnum {
        Http("HTTP"),
        TlsPassthrough("TLS_PASSTHROUGH"),
        Tcp("TCP"),
        Http2("HTTP2"),
        Grpc("GRPC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Type of protocol used in virtual deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Type of protocol used in virtual deployment.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** Port in which virtual deployment is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port in which virtual deployment is running.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The maximum duration in milliseconds for the deployed service to respond to an incoming
     * request through the listener. If provided, the timeout value overrides the default timeout of
     * 15 seconds for the HTTP/HTTP2 listeners, and disabled (no timeout) for the GRPC listeners.
     * The value 0 (zero) indicates that the timeout is disabled. The timeout cannot be configured
     * for the TCP and TLS_PASSTHROUGH listeners. For streaming responses from the deployed service,
     * consider either keeping the timeout disabled or set a sufficiently high value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
    private final Long requestTimeoutInMs;

    /**
     * The maximum duration in milliseconds for the deployed service to respond to an incoming
     * request through the listener. If provided, the timeout value overrides the default timeout of
     * 15 seconds for the HTTP/HTTP2 listeners, and disabled (no timeout) for the GRPC listeners.
     * The value 0 (zero) indicates that the timeout is disabled. The timeout cannot be configured
     * for the TCP and TLS_PASSTHROUGH listeners. For streaming responses from the deployed service,
     * consider either keeping the timeout disabled or set a sufficiently high value.
     *
     * @return the value
     */
    public Long getRequestTimeoutInMs() {
        return requestTimeoutInMs;
    }

    /**
     * The maximum duration in milliseconds for which the request's stream may be idle. The value 0
     * (zero) indicates that the timeout is disabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMs")
    private final Long idleTimeoutInMs;

    /**
     * The maximum duration in milliseconds for which the request's stream may be idle. The value 0
     * (zero) indicates that the timeout is disabled.
     *
     * @return the value
     */
    public Long getIdleTimeoutInMs() {
        return idleTimeoutInMs;
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
        sb.append("VirtualDeploymentListener(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", requestTimeoutInMs=").append(String.valueOf(this.requestTimeoutInMs));
        sb.append(", idleTimeoutInMs=").append(String.valueOf(this.idleTimeoutInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualDeploymentListener)) {
            return false;
        }

        VirtualDeploymentListener other = (VirtualDeploymentListener) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.requestTimeoutInMs, other.requestTimeoutInMs)
                && java.util.Objects.equals(this.idleTimeoutInMs, other.idleTimeoutInMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.requestTimeoutInMs == null
                                ? 43
                                : this.requestTimeoutInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.idleTimeoutInMs == null ? 43 : this.idleTimeoutInMs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
