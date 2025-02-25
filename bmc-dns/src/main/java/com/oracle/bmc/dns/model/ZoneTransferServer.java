/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI nameserver that transfers zone data with external nameservers.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ZoneTransferServer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ZoneTransferServer extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "port",
        "isTransferSource",
        "isTransferDestination"
    })
    public ZoneTransferServer(
            String address, Integer port, Boolean isTransferSource, Boolean isTransferDestination) {
        super();
        this.address = address;
        this.port = port;
        this.isTransferSource = isTransferSource;
        this.isTransferDestination = isTransferDestination;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The server's IP address (IPv4 or IPv6).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The server's IP address (IPv4 or IPv6).
         * @param address the value to set
         * @return this builder
         **/
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * The server's port.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The server's port.
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
         * A Boolean flag indicating whether or not the server is a zone data transfer source.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTransferSource")
        private Boolean isTransferSource;

        /**
         * A Boolean flag indicating whether or not the server is a zone data transfer source.
         *
         * @param isTransferSource the value to set
         * @return this builder
         **/
        public Builder isTransferSource(Boolean isTransferSource) {
            this.isTransferSource = isTransferSource;
            this.__explicitlySet__.add("isTransferSource");
            return this;
        }
        /**
         * A Boolean flag indicating whether or not the server is a zone data transfer destination.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTransferDestination")
        private Boolean isTransferDestination;

        /**
         * A Boolean flag indicating whether or not the server is a zone data transfer destination.
         *
         * @param isTransferDestination the value to set
         * @return this builder
         **/
        public Builder isTransferDestination(Boolean isTransferDestination) {
            this.isTransferDestination = isTransferDestination;
            this.__explicitlySet__.add("isTransferDestination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZoneTransferServer build() {
            ZoneTransferServer model =
                    new ZoneTransferServer(
                            this.address,
                            this.port,
                            this.isTransferSource,
                            this.isTransferDestination);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZoneTransferServer model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("isTransferSource")) {
                this.isTransferSource(model.getIsTransferSource());
            }
            if (model.wasPropertyExplicitlySet("isTransferDestination")) {
                this.isTransferDestination(model.getIsTransferDestination());
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
     * The server's IP address (IPv4 or IPv6).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The server's IP address (IPv4 or IPv6).
     * @return the value
     **/
    public String getAddress() {
        return address;
    }

    /**
     * The server's port.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The server's port.
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTransferSource")
    private final Boolean isTransferSource;

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer source.
     *
     * @return the value
     **/
    public Boolean getIsTransferSource() {
        return isTransferSource;
    }

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer destination.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTransferDestination")
    private final Boolean isTransferDestination;

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer destination.
     *
     * @return the value
     **/
    public Boolean getIsTransferDestination() {
        return isTransferDestination;
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
        sb.append("ZoneTransferServer(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", isTransferSource=").append(String.valueOf(this.isTransferSource));
        sb.append(", isTransferDestination=").append(String.valueOf(this.isTransferDestination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZoneTransferServer)) {
            return false;
        }

        ZoneTransferServer other = (ZoneTransferServer) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.isTransferSource, other.isTransferSource)
                && java.util.Objects.equals(this.isTransferDestination, other.isTransferDestination)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.isTransferSource == null ? 43 : this.isTransferSource.hashCode());
        result =
                (result * PRIME)
                        + (this.isTransferDestination == null
                                ? 43
                                : this.isTransferDestination.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
