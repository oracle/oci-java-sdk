/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Connect Descriptor details. Required for Manual and UserManagerOci connection types.
 * If a Private Endpoint was specified for the Connection, the host should contain a valid IP address.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateConnectDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateConnectDescriptor {
    @Deprecated
    @java.beans.ConstructorProperties({"host", "port", "databaseServiceName", "connectString"})
    public CreateConnectDescriptor(
            String host, Integer port, String databaseServiceName, String connectString) {
        super();
        this.host = host;
        this.port = port;
        this.databaseServiceName = databaseServiceName;
        this.connectString = connectString;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
        private String databaseServiceName;

        public Builder databaseServiceName(String databaseServiceName) {
            this.databaseServiceName = databaseServiceName;
            this.__explicitlySet__.add("databaseServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectString")
        private String connectString;

        public Builder connectString(String connectString) {
            this.connectString = connectString;
            this.__explicitlySet__.add("connectString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectDescriptor build() {
            CreateConnectDescriptor __instance__ =
                    new CreateConnectDescriptor(host, port, databaseServiceName, connectString);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConnectDescriptor o) {
            Builder copiedBuilder =
                    host(o.getHost())
                            .port(o.getPort())
                            .databaseServiceName(o.getDatabaseServiceName())
                            .connectString(o.getConnectString());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Host or IP address of the connect descriptor. Required if no connectString was specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    public String getHost() {
        return host;
    }

    /**
     * Port of the connect descriptor. Required if no connectString was specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    public Integer getPort() {
        return port;
    }

    /**
     * Database service name. Required if no connectString was specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
    private final String databaseServiceName;

    public String getDatabaseServiceName() {
        return databaseServiceName;
    }

    /**
     * Connect String. Required if no host, port nor databaseServiceName were specified.
     * If a Private Endpoint was specified in the Connection, the host entry should be a valid IP address.
     * Supported formats:
     * Easy connect: <host>:<port>/<db_service_name>
     * Long format: (description= (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectString")
    private final String connectString;

    public String getConnectString() {
        return connectString;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateConnectDescriptor(");
        sb.append("host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", databaseServiceName=").append(String.valueOf(this.databaseServiceName));
        sb.append(", connectString=").append(String.valueOf(this.connectString));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectDescriptor)) {
            return false;
        }

        CreateConnectDescriptor other = (CreateConnectDescriptor) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.databaseServiceName, other.databaseServiceName)
                && java.util.Objects.equals(this.connectString, other.connectString)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseServiceName == null
                                ? 43
                                : this.databaseServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.connectString == null ? 43 : this.connectString.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
