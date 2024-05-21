/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Connect Descriptor details.
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
    builder = ConnectDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectDescriptor extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"host", "port", "databaseServiceName", "connectString"})
    public ConnectDescriptor(
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
         * Host of the connect descriptor.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Host of the connect descriptor.
         *
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * Port of the connect descriptor.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port of the connect descriptor.
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Database service name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
        private String databaseServiceName;

        /**
         * Database service name.
         *
         * @param databaseServiceName the value to set
         * @return this builder
         **/
        public Builder databaseServiceName(String databaseServiceName) {
            this.databaseServiceName = databaseServiceName;
            this.__explicitlySet__.add("databaseServiceName");
            return this;
        }
        /**
         * Connect string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectString")
        private String connectString;

        /**
         * Connect string.
         *
         * @param connectString the value to set
         * @return this builder
         **/
        public Builder connectString(String connectString) {
            this.connectString = connectString;
            this.__explicitlySet__.add("connectString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectDescriptor build() {
            ConnectDescriptor model =
                    new ConnectDescriptor(
                            this.host, this.port, this.databaseServiceName, this.connectString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectDescriptor model) {
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
     * Host of the connect descriptor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Host of the connect descriptor.
     *
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * Port of the connect descriptor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port of the connect descriptor.
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * Database service name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseServiceName")
    private final String databaseServiceName;

    /**
     * Database service name.
     *
     * @return the value
     **/
    public String getDatabaseServiceName() {
        return databaseServiceName;
    }

    /**
     * Connect string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectString")
    private final String connectString;

    /**
     * Connect string.
     *
     * @return the value
     **/
    public String getConnectString() {
        return connectString;
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
        sb.append("ConnectDescriptor(");
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
        if (!(o instanceof ConnectDescriptor)) {
            return false;
        }

        ConnectDescriptor other = (ConnectDescriptor) o;
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
