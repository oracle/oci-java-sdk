/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * External downstream nameserver for the zone.
 * This field is currently not supported when {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
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
    builder = ExternalDownstream.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalDownstream extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"address", "port", "tsigKeyId"})
    public ExternalDownstream(String address, Integer port, String tsigKeyId) {
        super();
        this.address = address;
        this.port = port;
        this.tsigKeyId = tsigKeyId;
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
         * The server's port. Port value must be a value of 53, otherwise omit
         * the port value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The server's port. Port value must be a value of 53, otherwise omit
         * the port value.
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
         * The OCID of the TSIG key.
         * A TSIG key is used to secure DNS messages (in this case, zone transfers) between two systems that both have the (shared) secret.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tsigKeyId")
        private String tsigKeyId;

        /**
         * The OCID of the TSIG key.
         * A TSIG key is used to secure DNS messages (in this case, zone transfers) between two systems that both have the (shared) secret.
         *
         * @param tsigKeyId the value to set
         * @return this builder
         **/
        public Builder tsigKeyId(String tsigKeyId) {
            this.tsigKeyId = tsigKeyId;
            this.__explicitlySet__.add("tsigKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalDownstream build() {
            ExternalDownstream model =
                    new ExternalDownstream(this.address, this.port, this.tsigKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalDownstream model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("tsigKeyId")) {
                this.tsigKeyId(model.getTsigKeyId());
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
     * The server's port. Port value must be a value of 53, otherwise omit
     * the port value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The server's port. Port value must be a value of 53, otherwise omit
     * the port value.
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The OCID of the TSIG key.
     * A TSIG key is used to secure DNS messages (in this case, zone transfers) between two systems that both have the (shared) secret.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tsigKeyId")
    private final String tsigKeyId;

    /**
     * The OCID of the TSIG key.
     * A TSIG key is used to secure DNS messages (in this case, zone transfers) between two systems that both have the (shared) secret.
     *
     * @return the value
     **/
    public String getTsigKeyId() {
        return tsigKeyId;
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
        sb.append("ExternalDownstream(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", tsigKeyId=").append(String.valueOf(this.tsigKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDownstream)) {
            return false;
        }

        ExternalDownstream other = (ExternalDownstream) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.tsigKeyId, other.tsigKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.tsigKeyId == null ? 43 : this.tsigKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
