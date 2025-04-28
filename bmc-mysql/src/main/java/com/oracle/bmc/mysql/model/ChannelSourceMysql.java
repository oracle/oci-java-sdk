/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Core properties of a Mysql Channel source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChannelSourceMysql.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChannelSourceMysql extends ChannelSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The network address of the MySQL instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The network address of the MySQL instance.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The port the source MySQL instance listens on. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port the source MySQL instance listens on.
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
         * The name of the replication user on the source MySQL instance. The username has a maximum
         * length of 96 characters. For more information, please see the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/change-master-to.html)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The name of the replication user on the source MySQL instance. The username has a maximum
         * length of 96 characters. For more information, please see the [MySQL
         * documentation](https://dev.mysql.com/doc/refman/8.0/en/change-master-to.html)
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** The SSL mode of the Channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private SslMode sslMode;

        /**
         * The SSL mode of the Channel.
         *
         * @param sslMode the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonProperty("anonymousTransactionsHandling")
        private AnonymousTransactionsHandling anonymousTransactionsHandling;

        public Builder anonymousTransactionsHandling(
                AnonymousTransactionsHandling anonymousTransactionsHandling) {
            this.anonymousTransactionsHandling = anonymousTransactionsHandling;
            this.__explicitlySet__.add("anonymousTransactionsHandling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChannelSourceMysql build() {
            ChannelSourceMysql model =
                    new ChannelSourceMysql(
                            this.hostname,
                            this.port,
                            this.username,
                            this.sslMode,
                            this.sslCaCertificate,
                            this.anonymousTransactionsHandling);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChannelSourceMysql model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("sslMode")) {
                this.sslMode(model.getSslMode());
            }
            if (model.wasPropertyExplicitlySet("sslCaCertificate")) {
                this.sslCaCertificate(model.getSslCaCertificate());
            }
            if (model.wasPropertyExplicitlySet("anonymousTransactionsHandling")) {
                this.anonymousTransactionsHandling(model.getAnonymousTransactionsHandling());
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

    @Deprecated
    public ChannelSourceMysql(
            String hostname,
            Integer port,
            String username,
            SslMode sslMode,
            CaCertificate sslCaCertificate,
            AnonymousTransactionsHandling anonymousTransactionsHandling) {
        super();
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.sslMode = sslMode;
        this.sslCaCertificate = sslCaCertificate;
        this.anonymousTransactionsHandling = anonymousTransactionsHandling;
    }

    /** The network address of the MySQL instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The network address of the MySQL instance.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The port the source MySQL instance listens on. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port the source MySQL instance listens on.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The name of the replication user on the source MySQL instance. The username has a maximum
     * length of 96 characters. For more information, please see the [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/change-master-to.html)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The name of the replication user on the source MySQL instance. The username has a maximum
     * length of 96 characters. For more information, please see the [MySQL
     * documentation](https://dev.mysql.com/doc/refman/8.0/en/change-master-to.html)
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** The SSL mode of the Channel. */
    public enum SslMode implements com.oracle.bmc.http.internal.BmcEnum {
        VerifyIdentity("VERIFY_IDENTITY"),
        VerifyCa("VERIFY_CA"),
        Required("REQUIRED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SslMode.class);

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
    /** The SSL mode of the Channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    private final SslMode sslMode;

    /**
     * The SSL mode of the Channel.
     *
     * @return the value
     */
    public SslMode getSslMode() {
        return sslMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
    private final CaCertificate sslCaCertificate;

    public CaCertificate getSslCaCertificate() {
        return sslCaCertificate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("anonymousTransactionsHandling")
    private final AnonymousTransactionsHandling anonymousTransactionsHandling;

    public AnonymousTransactionsHandling getAnonymousTransactionsHandling() {
        return anonymousTransactionsHandling;
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
        sb.append("ChannelSourceMysql(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", sslMode=").append(String.valueOf(this.sslMode));
        sb.append(", sslCaCertificate=").append(String.valueOf(this.sslCaCertificate));
        sb.append(", anonymousTransactionsHandling=")
                .append(String.valueOf(this.anonymousTransactionsHandling));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChannelSourceMysql)) {
            return false;
        }

        ChannelSourceMysql other = (ChannelSourceMysql) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.sslMode, other.sslMode)
                && java.util.Objects.equals(this.sslCaCertificate, other.sslCaCertificate)
                && java.util.Objects.equals(
                        this.anonymousTransactionsHandling, other.anonymousTransactionsHandling)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.sslMode == null ? 43 : this.sslMode.hashCode());
        result =
                (result * PRIME)
                        + (this.sslCaCertificate == null ? 43 : this.sslCaCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.anonymousTransactionsHandling == null
                                ? 43
                                : this.anonymousTransactionsHandling.hashCode());
        return result;
    }
}
