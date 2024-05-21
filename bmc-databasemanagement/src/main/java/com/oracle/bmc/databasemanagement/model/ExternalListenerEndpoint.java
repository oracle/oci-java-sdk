/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The protocol address that an external listener is configured to listen on.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol",
    defaultImpl = ExternalListenerEndpoint.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExternalListenerTcpEndpoint.class,
        name = "TCP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExternalListenerTcpsEndpoint.class,
        name = "TCPS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExternalListenerIpcEndpoint.class,
        name = "IPC"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExternalListenerEndpoint extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"services"})
    protected ExternalListenerEndpoint(java.util.List<String> services) {
        super();
        this.services = services;
    }

    /**
     * The list of services registered with the listener.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<String> services;

    /**
     * The list of services registered with the listener.
     * @return the value
     **/
    public java.util.List<String> getServices() {
        return services;
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
        sb.append("ExternalListenerEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("services=").append(String.valueOf(this.services));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalListenerEndpoint)) {
            return false;
        }

        ExternalListenerEndpoint other = (ExternalListenerEndpoint) o;
        return java.util.Objects.equals(this.services, other.services) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The listener protocol.
     **/
    public enum Protocol {
        Ipc("IPC"),
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
}
