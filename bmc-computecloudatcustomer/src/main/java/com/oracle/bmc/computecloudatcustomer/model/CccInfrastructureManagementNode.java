/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Information about an individual management node in a Compute Cloud@Customer infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CccInfrastructureManagementNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccInfrastructureManagementNode
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ip", "hostname"})
    public CccInfrastructureManagementNode(String ip, String hostname) {
        super();
        this.ip = ip;
        this.hostname = hostname;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Address of the management node. */
        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private String ip;

        /**
         * Address of the management node.
         *
         * @param ip the value to set
         * @return this builder
         */
        public Builder ip(String ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }
        /** Hostname for interface to the management node. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * Hostname for interface to the management node.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureManagementNode build() {
            CccInfrastructureManagementNode model =
                    new CccInfrastructureManagementNode(this.ip, this.hostname);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureManagementNode model) {
            if (model.wasPropertyExplicitlySet("ip")) {
                this.ip(model.getIp());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
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

    /** Address of the management node. */
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    private final String ip;

    /**
     * Address of the management node.
     *
     * @return the value
     */
    public String getIp() {
        return ip;
    }

    /** Hostname for interface to the management node. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * Hostname for interface to the management node.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
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
        sb.append("CccInfrastructureManagementNode(");
        sb.append("super=").append(super.toString());
        sb.append("ip=").append(String.valueOf(this.ip));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureManagementNode)) {
            return false;
        }

        CccInfrastructureManagementNode other = (CccInfrastructureManagementNode) o;
        return java.util.Objects.equals(this.ip, other.ip)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ip == null ? 43 : this.ip.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
