/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Reverse connection endpoint has details of endpoint in customer VCN
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReverseConnectionEndpoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReverseConnectionEndpoint
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customerIp", "natIp"})
    public ReverseConnectionEndpoint(String customerIp, String natIp) {
        super();
        this.customerIp = customerIp;
        this.natIp = natIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP addresses of the endpoint in customer VCN
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerIp")
        private String customerIp;

        /**
         * The IP addresses of the endpoint in customer VCN
         * @param customerIp the value to set
         * @return this builder
         **/
        public Builder customerIp(String customerIp) {
            this.customerIp = customerIp;
            this.__explicitlySet__.add("customerIp");
            return this;
        }
        /**
         * The NAT IP addresses of the endpoint in service VCN
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("natIp")
        private String natIp;

        /**
         * The NAT IP addresses of the endpoint in service VCN
         * @param natIp the value to set
         * @return this builder
         **/
        public Builder natIp(String natIp) {
            this.natIp = natIp;
            this.__explicitlySet__.add("natIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReverseConnectionEndpoint build() {
            ReverseConnectionEndpoint model =
                    new ReverseConnectionEndpoint(this.customerIp, this.natIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReverseConnectionEndpoint model) {
            if (model.wasPropertyExplicitlySet("customerIp")) {
                this.customerIp(model.getCustomerIp());
            }
            if (model.wasPropertyExplicitlySet("natIp")) {
                this.natIp(model.getNatIp());
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
     * The IP addresses of the endpoint in customer VCN
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerIp")
    private final String customerIp;

    /**
     * The IP addresses of the endpoint in customer VCN
     * @return the value
     **/
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     * The NAT IP addresses of the endpoint in service VCN
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("natIp")
    private final String natIp;

    /**
     * The NAT IP addresses of the endpoint in service VCN
     * @return the value
     **/
    public String getNatIp() {
        return natIp;
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
        sb.append("ReverseConnectionEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("customerIp=").append(String.valueOf(this.customerIp));
        sb.append(", natIp=").append(String.valueOf(this.natIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReverseConnectionEndpoint)) {
            return false;
        }

        ReverseConnectionEndpoint other = (ReverseConnectionEndpoint) o;
        return java.util.Objects.equals(this.customerIp, other.customerIp)
                && java.util.Objects.equals(this.natIp, other.natIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.customerIp == null ? 43 : this.customerIp.hashCode());
        result = (result * PRIME) + (this.natIp == null ? 43 : this.natIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
