/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The customer IP and the corresponding fully qualified domain name that the pipeline will connect to.
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
    builder = OpensearchPipelineReverseConnectionEndpoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpensearchPipelineReverseConnectionEndpoint
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customerFqdn", "customerIp"})
    public OpensearchPipelineReverseConnectionEndpoint(String customerFqdn, String customerIp) {
        super();
        this.customerFqdn = customerFqdn;
        this.customerIp = customerIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fully qualified domain name of the customerIp in the customer VCN
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerFqdn")
        private String customerFqdn;

        /**
         * The fully qualified domain name of the customerIp in the customer VCN
         * @param customerFqdn the value to set
         * @return this builder
         **/
        public Builder customerFqdn(String customerFqdn) {
            this.customerFqdn = customerFqdn;
            this.__explicitlySet__.add("customerFqdn");
            return this;
        }
        /**
         * The IPv4 address in the customer VCN
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerIp")
        private String customerIp;

        /**
         * The IPv4 address in the customer VCN
         * @param customerIp the value to set
         * @return this builder
         **/
        public Builder customerIp(String customerIp) {
            this.customerIp = customerIp;
            this.__explicitlySet__.add("customerIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchPipelineReverseConnectionEndpoint build() {
            OpensearchPipelineReverseConnectionEndpoint model =
                    new OpensearchPipelineReverseConnectionEndpoint(
                            this.customerFqdn, this.customerIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchPipelineReverseConnectionEndpoint model) {
            if (model.wasPropertyExplicitlySet("customerFqdn")) {
                this.customerFqdn(model.getCustomerFqdn());
            }
            if (model.wasPropertyExplicitlySet("customerIp")) {
                this.customerIp(model.getCustomerIp());
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
     * The fully qualified domain name of the customerIp in the customer VCN
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerFqdn")
    private final String customerFqdn;

    /**
     * The fully qualified domain name of the customerIp in the customer VCN
     * @return the value
     **/
    public String getCustomerFqdn() {
        return customerFqdn;
    }

    /**
     * The IPv4 address in the customer VCN
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerIp")
    private final String customerIp;

    /**
     * The IPv4 address in the customer VCN
     * @return the value
     **/
    public String getCustomerIp() {
        return customerIp;
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
        sb.append("OpensearchPipelineReverseConnectionEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("customerFqdn=").append(String.valueOf(this.customerFqdn));
        sb.append(", customerIp=").append(String.valueOf(this.customerIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpensearchPipelineReverseConnectionEndpoint)) {
            return false;
        }

        OpensearchPipelineReverseConnectionEndpoint other =
                (OpensearchPipelineReverseConnectionEndpoint) o;
        return java.util.Objects.equals(this.customerFqdn, other.customerFqdn)
                && java.util.Objects.equals(this.customerIp, other.customerIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.customerFqdn == null ? 43 : this.customerFqdn.hashCode());
        result = (result * PRIME) + (this.customerIp == null ? 43 : this.customerIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
