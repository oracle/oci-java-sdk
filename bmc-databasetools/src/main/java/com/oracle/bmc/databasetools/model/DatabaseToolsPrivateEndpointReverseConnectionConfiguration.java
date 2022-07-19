/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Reverse connection configuration details of the private endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsPrivateEndpointReverseConnectionConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsPrivateEndpointReverseConnectionConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({"reverseConnectionsSourceIps"})
    public DatabaseToolsPrivateEndpointReverseConnectionConfiguration(
            java.util.List<DatabaseToolsPrivateEndpointReverseConnectionsSourceIp>
                    reverseConnectionsSourceIps) {
        super();
        this.reverseConnectionsSourceIps = reverseConnectionsSourceIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of IP addresses in the customer VCN to be used as the source IPs for reverse connection packets
         * traveling from the service's VCN to the customer's VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionsSourceIps")
        private java.util.List<DatabaseToolsPrivateEndpointReverseConnectionsSourceIp>
                reverseConnectionsSourceIps;

        /**
         * A list of IP addresses in the customer VCN to be used as the source IPs for reverse connection packets
         * traveling from the service's VCN to the customer's VCN.
         *
         * @param reverseConnectionsSourceIps the value to set
         * @return this builder
         **/
        public Builder reverseConnectionsSourceIps(
                java.util.List<DatabaseToolsPrivateEndpointReverseConnectionsSourceIp>
                        reverseConnectionsSourceIps) {
            this.reverseConnectionsSourceIps = reverseConnectionsSourceIps;
            this.__explicitlySet__.add("reverseConnectionsSourceIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsPrivateEndpointReverseConnectionConfiguration build() {
            DatabaseToolsPrivateEndpointReverseConnectionConfiguration __instance__ =
                    new DatabaseToolsPrivateEndpointReverseConnectionConfiguration(
                            reverseConnectionsSourceIps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsPrivateEndpointReverseConnectionConfiguration o) {
            Builder copiedBuilder = reverseConnectionsSourceIps(o.getReverseConnectionsSourceIps());

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
     * A list of IP addresses in the customer VCN to be used as the source IPs for reverse connection packets
     * traveling from the service's VCN to the customer's VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionsSourceIps")
    private final java.util.List<DatabaseToolsPrivateEndpointReverseConnectionsSourceIp>
            reverseConnectionsSourceIps;

    /**
     * A list of IP addresses in the customer VCN to be used as the source IPs for reverse connection packets
     * traveling from the service's VCN to the customer's VCN.
     *
     * @return the value
     **/
    public java.util.List<DatabaseToolsPrivateEndpointReverseConnectionsSourceIp>
            getReverseConnectionsSourceIps() {
        return reverseConnectionsSourceIps;
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
        sb.append("DatabaseToolsPrivateEndpointReverseConnectionConfiguration(");
        sb.append("reverseConnectionsSourceIps=")
                .append(String.valueOf(this.reverseConnectionsSourceIps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsPrivateEndpointReverseConnectionConfiguration)) {
            return false;
        }

        DatabaseToolsPrivateEndpointReverseConnectionConfiguration other =
                (DatabaseToolsPrivateEndpointReverseConnectionConfiguration) o;
        return java.util.Objects.equals(
                        this.reverseConnectionsSourceIps, other.reverseConnectionsSourceIps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reverseConnectionsSourceIps == null
                                ? 43
                                : this.reverseConnectionsSourceIps.hashCode());
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
