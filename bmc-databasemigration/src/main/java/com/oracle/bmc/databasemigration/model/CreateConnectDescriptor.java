/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Connect Descriptor details. Required for Manual and UserManagerOci connection types. If a Private
 * Endpoint was specified for the Connection, the host should contain a valid IP address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateConnectDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateConnectDescriptor
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * Host or IP address of the connect descriptor. Required if no connectString was specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Host or IP address of the connect descriptor. Required if no connectString was specified.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** Port of the connect descriptor. Required if no connectString was specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port of the connect descriptor. Required if no connectString was specified.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Database service name. Required if no connectString was specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
        private String databaseServiceName;

        /**
         * Database service name. Required if no connectString was specified.
         *
         * @param databaseServiceName the value to set
         * @return this builder
         */
        public Builder databaseServiceName(String databaseServiceName) {
            this.databaseServiceName = databaseServiceName;
            this.__explicitlySet__.add("databaseServiceName");
            return this;
        }
        /**
         * Connect String. Required if no host, port nor databaseServiceName were specified. If a
         * Private Endpoint was specified in the Connection, the host entry should be a valid IP
         * address. Supported formats: Easy connect: <host>:<port>/<db_service_name> Long format:
         * (description=
         * (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectString")
        private String connectString;

        /**
         * Connect String. Required if no host, port nor databaseServiceName were specified. If a
         * Private Endpoint was specified in the Connection, the host entry should be a valid IP
         * address. Supported formats: Easy connect: <host>:<port>/<db_service_name> Long format:
         * (description=
         * (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
         *
         * @param connectString the value to set
         * @return this builder
         */
        public Builder connectString(String connectString) {
            this.connectString = connectString;
            this.__explicitlySet__.add("connectString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectDescriptor build() {
            CreateConnectDescriptor model =
                    new CreateConnectDescriptor(
                            this.host, this.port, this.databaseServiceName, this.connectString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConnectDescriptor model) {
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("databaseServiceName")) {
                this.databaseServiceName(model.getDatabaseServiceName());
            }
            if (model.wasPropertyExplicitlySet("connectString")) {
                this.connectString(model.getConnectString());
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

    /** Host or IP address of the connect descriptor. Required if no connectString was specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Host or IP address of the connect descriptor. Required if no connectString was specified.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** Port of the connect descriptor. Required if no connectString was specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port of the connect descriptor. Required if no connectString was specified.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Database service name. Required if no connectString was specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
    private final String databaseServiceName;

    /**
     * Database service name. Required if no connectString was specified.
     *
     * @return the value
     */
    public String getDatabaseServiceName() {
        return databaseServiceName;
    }

    /**
     * Connect String. Required if no host, port nor databaseServiceName were specified. If a
     * Private Endpoint was specified in the Connection, the host entry should be a valid IP
     * address. Supported formats: Easy connect: <host>:<port>/<db_service_name> Long format:
     * (description=
     * (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectString")
    private final String connectString;

    /**
     * Connect String. Required if no host, port nor databaseServiceName were specified. If a
     * Private Endpoint was specified in the Connection, the host entry should be a valid IP
     * address. Supported formats: Easy connect: <host>:<port>/<db_service_name> Long format:
     * (description=
     * (address=(port=<port>)(host=<host>))(connect_data=(service_name=<db_service_name>)))
     *
     * @return the value
     */
    public String getConnectString() {
        return connectString;
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
        sb.append("CreateConnectDescriptor(");
        sb.append("super=").append(super.toString());
        sb.append("host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", databaseServiceName=").append(String.valueOf(this.databaseServiceName));
        sb.append(", connectString=").append(String.valueOf(this.connectString));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
