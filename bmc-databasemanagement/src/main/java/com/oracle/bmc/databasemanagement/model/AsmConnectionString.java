/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The ASM instance connection string.
 *
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
    builder = AsmConnectionString.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AsmConnectionString extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hosts", "port", "service", "protocol"})
    public AsmConnectionString(
            java.util.List<String> hosts, Integer port, String service, Protocol protocol) {
        super();
        this.hosts = hosts;
        this.port = port;
        this.service = service;
        this.protocol = protocol;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of host names of the ASM instances.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<String> hosts;

        /**
         * The list of host names of the ASM instances.
         * @param hosts the value to set
         * @return this builder
         **/
        public Builder hosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }
        /**
         * The port used to connect to the ASM instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port used to connect to the ASM instance.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The service name of the ASM instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The service name of the ASM instance.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The protocol used to connect to the ASM instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * The protocol used to connect to the ASM instance.
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AsmConnectionString build() {
            AsmConnectionString model =
                    new AsmConnectionString(this.hosts, this.port, this.service, this.protocol);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsmConnectionString model) {
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
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
     * The list of host names of the ASM instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<String> hosts;

    /**
     * The list of host names of the ASM instances.
     * @return the value
     **/
    public java.util.List<String> getHosts() {
        return hosts;
    }

    /**
     * The port used to connect to the ASM instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port used to connect to the ASM instance.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The service name of the ASM instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The service name of the ASM instance.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * The protocol used to connect to the ASM instance.
     **/
    public enum Protocol {
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
     * The protocol used to connect to the ASM instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * The protocol used to connect to the ASM instance.
     * @return the value
     **/
    public Protocol getProtocol() {
        return protocol;
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
        sb.append("AsmConnectionString(");
        sb.append("super=").append(super.toString());
        sb.append("hosts=").append(String.valueOf(this.hosts));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsmConnectionString)) {
            return false;
        }

        AsmConnectionString other = (AsmConnectionString) o;
        return java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
