/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Private Endpoint IP Addresses created in the customer's subnet. GoldenGate service will use these
 * ingress IP addresses to send all specific requests initiated from the service. These are
 * typically used for accessing customer resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IngressIpDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IngressIpDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ingressIp"})
    public IngressIpDetails(String ingressIp) {
        super();
        this.ingressIp = ingressIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A Private Endpoint IPv4 or IPv6 Address created in the customer's subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("ingressIp")
        private String ingressIp;

        /**
         * A Private Endpoint IPv4 or IPv6 Address created in the customer's subnet.
         *
         * @param ingressIp the value to set
         * @return this builder
         */
        public Builder ingressIp(String ingressIp) {
            this.ingressIp = ingressIp;
            this.__explicitlySet__.add("ingressIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressIpDetails build() {
            IngressIpDetails model = new IngressIpDetails(this.ingressIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressIpDetails model) {
            if (model.wasPropertyExplicitlySet("ingressIp")) {
                this.ingressIp(model.getIngressIp());
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

    /** A Private Endpoint IPv4 or IPv6 Address created in the customer's subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressIp")
    private final String ingressIp;

    /**
     * A Private Endpoint IPv4 or IPv6 Address created in the customer's subnet.
     *
     * @return the value
     */
    public String getIngressIp() {
        return ingressIp;
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
        sb.append("IngressIpDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ingressIp=").append(String.valueOf(this.ingressIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressIpDetails)) {
            return false;
        }

        IngressIpDetails other = (IngressIpDetails) o;
        return java.util.Objects.equals(this.ingressIp, other.ingressIp) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ingressIp == null ? 43 : this.ingressIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
