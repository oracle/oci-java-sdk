/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Source IP information for reverse connection configuration.
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
    builder = DatabaseToolsPrivateEndpointReverseConnectionsSourceIp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsPrivateEndpointReverseConnectionsSourceIp {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceIp"})
    public DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(String sourceIp) {
        super();
        this.sourceIp = sourceIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP address in the customer's VCN to be used as the source IP for reverse connection packets
         * traveling from the customer's VCN to the service's VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceIp")
        private String sourceIp;

        /**
         * The IP address in the customer's VCN to be used as the source IP for reverse connection packets
         * traveling from the customer's VCN to the service's VCN.
         *
         * @param sourceIp the value to set
         * @return this builder
         **/
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            this.__explicitlySet__.add("sourceIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsPrivateEndpointReverseConnectionsSourceIp build() {
            DatabaseToolsPrivateEndpointReverseConnectionsSourceIp __instance__ =
                    new DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(sourceIp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsPrivateEndpointReverseConnectionsSourceIp o) {
            Builder copiedBuilder = sourceIp(o.getSourceIp());

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
     * The IP address in the customer's VCN to be used as the source IP for reverse connection packets
     * traveling from the customer's VCN to the service's VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIp")
    private final String sourceIp;

    /**
     * The IP address in the customer's VCN to be used as the source IP for reverse connection packets
     * traveling from the customer's VCN to the service's VCN.
     *
     * @return the value
     **/
    public String getSourceIp() {
        return sourceIp;
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
        sb.append("DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(");
        sb.append("sourceIp=").append(String.valueOf(this.sourceIp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsPrivateEndpointReverseConnectionsSourceIp)) {
            return false;
        }

        DatabaseToolsPrivateEndpointReverseConnectionsSourceIp other =
                (DatabaseToolsPrivateEndpointReverseConnectionsSourceIp) o;
        return java.util.Objects.equals(this.sourceIp, other.sourceIp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceIp == null ? 43 : this.sourceIp.hashCode());
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
