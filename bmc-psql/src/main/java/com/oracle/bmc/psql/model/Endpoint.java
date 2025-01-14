/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Information about the database instance node endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Endpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Endpoint extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fqdn", "ipAddress", "port"})
    public Endpoint(String fqdn, String ipAddress, Integer port) {
        super();
        this.fqdn = fqdn;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The FQDN of the endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * The FQDN of the endpoint.
         *
         * @param fqdn the value to set
         * @return this builder
         */
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /** The IP address of the endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the endpoint.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The port address of the endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port address of the endpoint.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Endpoint build() {
            Endpoint model = new Endpoint(this.fqdn, this.ipAddress, this.port);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Endpoint model) {
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
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

    /** The FQDN of the endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * The FQDN of the endpoint.
     *
     * @return the value
     */
    public String getFqdn() {
        return fqdn;
    }

    /** The IP address of the endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the endpoint.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The port address of the endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port address of the endpoint.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
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
        sb.append("Endpoint(");
        sb.append("super=").append(super.toString());
        sb.append("fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Endpoint)) {
            return false;
        }

        Endpoint other = (Endpoint) o;
        return java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
