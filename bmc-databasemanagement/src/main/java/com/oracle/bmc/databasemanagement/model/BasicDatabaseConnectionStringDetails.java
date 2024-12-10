/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the Oracle Database basic connection string.
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
    builder = BasicDatabaseConnectionStringDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BasicDatabaseConnectionStringDetails extends DatabaseConnectionStringDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The service name of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The service name of the database.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The port number used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port number used to connect to the database.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The protocol used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * The protocol used to connect to the database.
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

        public BasicDatabaseConnectionStringDetails build() {
            BasicDatabaseConnectionStringDetails model =
                    new BasicDatabaseConnectionStringDetails(
                            this.service, this.port, this.protocol);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BasicDatabaseConnectionStringDetails model) {
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
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

    @Deprecated
    public BasicDatabaseConnectionStringDetails(String service, Integer port, Protocol protocol) {
        super();
        this.service = service;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The service name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The service name of the database.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * The port number used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port number used to connect to the database.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The protocol used to connect to the database.
     **/
    public enum Protocol {
        Tcp("TCP"),
        Tcps("TCPS"),

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
     * The protocol used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * The protocol used to connect to the database.
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
        sb.append("BasicDatabaseConnectionStringDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicDatabaseConnectionStringDetails)) {
            return false;
        }

        BasicDatabaseConnectionStringDetails other = (BasicDatabaseConnectionStringDetails) o;
        return java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        return result;
    }
}
