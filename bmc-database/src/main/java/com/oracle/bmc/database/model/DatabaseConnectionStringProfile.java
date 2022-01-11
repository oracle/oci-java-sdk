/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The connection string profile to allow clients to group, filter and select connection string values based on structured metadata.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseConnectionStringProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseConnectionStringProfile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
        private ConsumerGroup consumerGroup;

        public Builder consumerGroup(ConsumerGroup consumerGroup) {
            this.consumerGroup = consumerGroup;
            this.__explicitlySet__.add("consumerGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsAuthentication")
        private TlsAuthentication tlsAuthentication;

        public Builder tlsAuthentication(TlsAuthentication tlsAuthentication) {
            this.tlsAuthentication = tlsAuthentication;
            this.__explicitlySet__.add("tlsAuthentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostFormat")
        private HostFormat hostFormat;

        public Builder hostFormat(HostFormat hostFormat) {
            this.hostFormat = hostFormat;
            this.__explicitlySet__.add("hostFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
        private SessionMode sessionMode;

        public Builder sessionMode(SessionMode sessionMode) {
            this.sessionMode = sessionMode;
            this.__explicitlySet__.add("sessionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syntaxFormat")
        private SyntaxFormat syntaxFormat;

        public Builder syntaxFormat(SyntaxFormat syntaxFormat) {
            this.syntaxFormat = syntaxFormat;
            this.__explicitlySet__.add("syntaxFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionStringProfile build() {
            DatabaseConnectionStringProfile __instance__ =
                    new DatabaseConnectionStringProfile(
                            displayName,
                            value,
                            consumerGroup,
                            protocol,
                            tlsAuthentication,
                            hostFormat,
                            sessionMode,
                            syntaxFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionStringProfile o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .value(o.getValue())
                            .consumerGroup(o.getConsumerGroup())
                            .protocol(o.getProtocol())
                            .tlsAuthentication(o.getTlsAuthentication())
                            .hostFormat(o.getHostFormat())
                            .sessionMode(o.getSessionMode())
                            .syntaxFormat(o.getSyntaxFormat());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Connection string value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;
    /**
     * Consumer group used by the connection.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ConsumerGroup {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Tp("TP"),
        Tpurgent("TPURGENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ConsumerGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumerGroup v : ConsumerGroup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConsumerGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConsumerGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConsumerGroup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Consumer group used by the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
    ConsumerGroup consumerGroup;
    /**
     * Protocol used by the connection.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Protocol {
        Tcp("TCP"),
        Tcps("TCPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Protocol used by the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    Protocol protocol;
    /**
     * Specifies whether the TLS handshake is using one-way ({@code SERVER}) or mutual ({@code MUTUAL}) authentication.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TlsAuthentication {
        Server("SERVER"),
        Mutual("MUTUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TlsAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (TlsAuthentication v : TlsAuthentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TlsAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TlsAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TlsAuthentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the TLS handshake is using one-way ({@code SERVER}) or mutual ({@code MUTUAL}) authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsAuthentication")
    TlsAuthentication tlsAuthentication;
    /**
     * Host format used in connection string.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum HostFormat {
        Fqdn("FQDN"),
        Ip("IP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, HostFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (HostFormat v : HostFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HostFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HostFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HostFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Host format used in connection string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostFormat")
    HostFormat hostFormat;
    /**
     * Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use {@code DIRECT} for direct hand-offs. Use {@code REDIRECT} to redirect the session.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SessionMode {
        Direct("DIRECT"),
        Redirect("REDIRECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SessionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionMode v : SessionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SessionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SessionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SessionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use {@code DIRECT} for direct hand-offs. Use {@code REDIRECT} to redirect the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
    SessionMode sessionMode;
    /**
     * Specifies whether the connection string is using the long ({@code LONG}), Easy Connect ({@code EZCONNECT}), or Easy Connect Plus ({@code EZCONNECTPLUS}) format.
     * Autonomous Databases on shared Exadata infrastructure always use the long format.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SyntaxFormat {
        Long("LONG"),
        Ezconnect("EZCONNECT"),
        Ezconnectplus("EZCONNECTPLUS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SyntaxFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (SyntaxFormat v : SyntaxFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyntaxFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyntaxFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyntaxFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the connection string is using the long ({@code LONG}), Easy Connect ({@code EZCONNECT}), or Easy Connect Plus ({@code EZCONNECTPLUS}) format.
     * Autonomous Databases on shared Exadata infrastructure always use the long format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntaxFormat")
    SyntaxFormat syntaxFormat;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
