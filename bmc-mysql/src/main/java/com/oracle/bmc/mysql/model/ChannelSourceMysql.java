/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Core properties of a Mysql Channel source.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChannelSourceMysql.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ChannelSourceMysql extends ChannelSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private SslMode sslMode;

        public Builder sslMode(SslMode sslMode) {
            this.sslMode = sslMode;
            this.__explicitlySet__.add("sslMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
        private CaCertificate sslCaCertificate;

        public Builder sslCaCertificate(CaCertificate sslCaCertificate) {
            this.sslCaCertificate = sslCaCertificate;
            this.__explicitlySet__.add("sslCaCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChannelSourceMysql build() {
            ChannelSourceMysql __instance__ =
                    new ChannelSourceMysql(hostname, port, username, sslMode, sslCaCertificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChannelSourceMysql o) {
            Builder copiedBuilder =
                    hostname(o.getHostname())
                            .port(o.getPort())
                            .username(o.getUsername())
                            .sslMode(o.getSslMode())
                            .sslCaCertificate(o.getSslCaCertificate());

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

    @Deprecated
    public ChannelSourceMysql(
            String hostname,
            Integer port,
            String username,
            SslMode sslMode,
            CaCertificate sslCaCertificate) {
        super();
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.sslMode = sslMode;
        this.sslCaCertificate = sslCaCertificate;
    }

    /**
     * The network address of the MySQL instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The port the source MySQL instance listens on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The name of the replication user on the source MySQL instance.
     * The username has a maximum length of 96 characters. For more information,
     * please see the [MySQL documentation](https://dev.mysql.com/doc/refman/8.0/en/change-master-to.html)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    String username;
    /**
     * The SSL mode of the Channel.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SslMode {
        VerifyIdentity("VERIFY_IDENTITY"),
        VerifyCa("VERIFY_CA"),
        Required("REQUIRED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SslMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SslMode v : SslMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SslMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SslMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SslMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The SSL mode of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    SslMode sslMode;

    @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
    CaCertificate sslCaCertificate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
