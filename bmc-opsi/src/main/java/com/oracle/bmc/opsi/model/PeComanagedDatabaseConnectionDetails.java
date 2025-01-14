/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Connection details of the private endpoints. <br>
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
        builder = PeComanagedDatabaseConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PeComanagedDatabaseConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hosts", "protocol", "serviceName"})
    public PeComanagedDatabaseConnectionDetails(
            java.util.List<PeComanagedDatabaseHostDetails> hosts,
            Protocol protocol,
            String serviceName) {
        super();
        this.hosts = hosts;
        this.protocol = protocol;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of hosts and port for private endpoint accessed database resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<PeComanagedDatabaseHostDetails> hosts;

        /**
         * List of hosts and port for private endpoint accessed database resource.
         *
         * @param hosts the value to set
         * @return this builder
         */
        public Builder hosts(java.util.List<PeComanagedDatabaseHostDetails> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }
        /** Protocol used for connection requests for private endpoint accssed database resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Protocol used for connection requests for private endpoint accssed database resource.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Database service name used for connection requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Database service name used for connection requests.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeComanagedDatabaseConnectionDetails build() {
            PeComanagedDatabaseConnectionDetails model =
                    new PeComanagedDatabaseConnectionDetails(
                            this.hosts, this.protocol, this.serviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeComanagedDatabaseConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
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

    /** List of hosts and port for private endpoint accessed database resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<PeComanagedDatabaseHostDetails> hosts;

    /**
     * List of hosts and port for private endpoint accessed database resource.
     *
     * @return the value
     */
    public java.util.List<PeComanagedDatabaseHostDetails> getHosts() {
        return hosts;
    }

    /** Protocol used for connection requests for private endpoint accssed database resource. */
    public enum Protocol implements com.oracle.bmc.http.internal.BmcEnum {
        Tcp("TCP"),
        Tcps("TCPS"),

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
    /** Protocol used for connection requests for private endpoint accssed database resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Protocol used for connection requests for private endpoint accssed database resource.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** Database service name used for connection requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Database service name used for connection requests.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
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
        sb.append("PeComanagedDatabaseConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hosts=").append(String.valueOf(this.hosts));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeComanagedDatabaseConnectionDetails)) {
            return false;
        }

        PeComanagedDatabaseConnectionDetails other = (PeComanagedDatabaseConnectionDetails) o;
        return java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
