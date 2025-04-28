/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An external master name server used as the source of zone data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalMaster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalMaster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"address", "port", "tsigKeyId"})
    public ExternalMaster(String address, Integer port, String tsigKeyId) {
        super();
        this.address = address;
        this.port = port;
        this.tsigKeyId = tsigKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The server's IP address (IPv4 or IPv6). */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The server's IP address (IPv4 or IPv6).
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** The server's port. Port value must be a value of 53, otherwise omit the port value. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The server's port. Port value must be a value of 53, otherwise omit the port value.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The OCID of the TSIG key. */
        @com.fasterxml.jackson.annotation.JsonProperty("tsigKeyId")
        private String tsigKeyId;

        /**
         * The OCID of the TSIG key.
         *
         * @param tsigKeyId the value to set
         * @return this builder
         */
        public Builder tsigKeyId(String tsigKeyId) {
            this.tsigKeyId = tsigKeyId;
            this.__explicitlySet__.add("tsigKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalMaster build() {
            ExternalMaster model = new ExternalMaster(this.address, this.port, this.tsigKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalMaster model) {
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The server's IP address (IPv4 or IPv6). */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The server's IP address (IPv4 or IPv6).
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** The server's port. Port value must be a value of 53, otherwise omit the port value. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The server's port. Port value must be a value of 53, otherwise omit the port value.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** The OCID of the TSIG key. */
    @com.fasterxml.jackson.annotation.JsonProperty("tsigKeyId")
    private final String tsigKeyId;

    /**
     * The OCID of the TSIG key.
     *
     * @return the value
     */
    public String getTsigKeyId() {
        return tsigKeyId;
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
        sb.append("ExternalMaster(");
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
        if (!(o instanceof ExternalMaster)) {
            return false;
        }

        ExternalMaster other = (ExternalMaster) o;
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
