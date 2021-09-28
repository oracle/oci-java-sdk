/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Note: Deprecated. Use the new resource model APIs instead.
 * Connect Descriptor details. If a Private Endpoint was specified in the Connection, the host entry should be a valid IP address.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConnectDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateConnectDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public UpdateConnectDescriptor build() {
            UpdateConnectDescriptor __instance__ =
                    new UpdateConnectDescriptor(host, port, databaseServiceName, connectString);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectDescriptor o) {
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

    /**
     * Host or IP address of the connect descriptor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Port of the connect descriptor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * Database service name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
    String databaseServiceName;

    /**
     * Connect String. If specified, this will override the stored connect descriptor details.
     * If a Private Endpoint was specified in the Connection, the host entry should be a valid IP address.
     * Supported formats:
     * Easy connect: <host>:<port>/<db_service_name>
     * Long format: (description= (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectString")
    String connectString;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
