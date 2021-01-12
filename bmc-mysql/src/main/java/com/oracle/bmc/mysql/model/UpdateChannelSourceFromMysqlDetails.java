/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Parameters detailing how to provision the source endpoint that is a MySQL Server.
 * Typically a MySQL Server that is not managed by the MySQL Database Service.
 *
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
    builder = UpdateChannelSourceFromMysqlDetails.Builder.class
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
public class UpdateChannelSourceFromMysqlDetails extends UpdateChannelSourceDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private ChannelSourceMysql.SslMode sslMode;

        public Builder sslMode(ChannelSourceMysql.SslMode sslMode) {
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

        public UpdateChannelSourceFromMysqlDetails build() {
            UpdateChannelSourceFromMysqlDetails __instance__ =
                    new UpdateChannelSourceFromMysqlDetails(
                            hostname, port, username, password, sslMode, sslCaCertificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateChannelSourceFromMysqlDetails o) {
            Builder copiedBuilder =
                    hostname(o.getHostname())
                            .port(o.getPort())
                            .username(o.getUsername())
                            .password(o.getPassword())
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
    public UpdateChannelSourceFromMysqlDetails(
            String hostname,
            Integer port,
            String username,
            String password,
            ChannelSourceMysql.SslMode sslMode,
            CaCertificate sslCaCertificate) {
        super();
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
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
     * The password for the replication user. The password must be
     * between 8 and 32 characters long, and must contain at least 1
     * numeric character, 1 lowercase character, 1 uppercase character,
     * and 1 special (nonalphanumeric) character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    /**
     * The SSL mode of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    ChannelSourceMysql.SslMode sslMode;

    @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
    CaCertificate sslCaCertificate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
