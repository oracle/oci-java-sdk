/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Match criteria used in NAT Rule used on the firewall policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NatRuleMatchCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NatRuleMatchCriteria
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceAddress", "destinationAddress", "service"})
    public NatRuleMatchCriteria(
            java.util.List<String> sourceAddress,
            java.util.List<String> destinationAddress,
            String service) {
        super();
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.service = service;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of IP address list names to be evaluated against the traffic source address. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceAddress")
        private java.util.List<String> sourceAddress;

        /**
         * An array of IP address list names to be evaluated against the traffic source address.
         *
         * @param sourceAddress the value to set
         * @return this builder
         */
        public Builder sourceAddress(java.util.List<String> sourceAddress) {
            this.sourceAddress = sourceAddress;
            this.__explicitlySet__.add("sourceAddress");
            return this;
        }
        /**
         * An array of IP address list names to be evaluated against the traffic destination
         * address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationAddress")
        private java.util.List<String> destinationAddress;

        /**
         * An array of IP address list names to be evaluated against the traffic destination
         * address.
         *
         * @param destinationAddress the value to set
         * @return this builder
         */
        public Builder destinationAddress(java.util.List<String> destinationAddress) {
            this.destinationAddress = destinationAddress;
            this.__explicitlySet__.add("destinationAddress");
            return this;
        }
        /**
         * A Service name to be evaluated against the traffic protocol and protocol-specific
         * parameters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * A Service name to be evaluated against the traffic protocol and protocol-specific
         * parameters.
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NatRuleMatchCriteria build() {
            NatRuleMatchCriteria model =
                    new NatRuleMatchCriteria(
                            this.sourceAddress, this.destinationAddress, this.service);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NatRuleMatchCriteria model) {
            if (model.wasPropertyExplicitlySet("sourceAddress")) {
                this.sourceAddress(model.getSourceAddress());
            }
            if (model.wasPropertyExplicitlySet("destinationAddress")) {
                this.destinationAddress(model.getDestinationAddress());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
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

    /** An array of IP address list names to be evaluated against the traffic source address. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAddress")
    private final java.util.List<String> sourceAddress;

    /**
     * An array of IP address list names to be evaluated against the traffic source address.
     *
     * @return the value
     */
    public java.util.List<String> getSourceAddress() {
        return sourceAddress;
    }

    /**
     * An array of IP address list names to be evaluated against the traffic destination address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAddress")
    private final java.util.List<String> destinationAddress;

    /**
     * An array of IP address list names to be evaluated against the traffic destination address.
     *
     * @return the value
     */
    public java.util.List<String> getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * A Service name to be evaluated against the traffic protocol and protocol-specific parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * A Service name to be evaluated against the traffic protocol and protocol-specific parameters.
     *
     * @return the value
     */
    public String getService() {
        return service;
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
        sb.append("NatRuleMatchCriteria(");
        sb.append("super=").append(super.toString());
        sb.append("sourceAddress=").append(String.valueOf(this.sourceAddress));
        sb.append(", destinationAddress=").append(String.valueOf(this.destinationAddress));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NatRuleMatchCriteria)) {
            return false;
        }

        NatRuleMatchCriteria other = (NatRuleMatchCriteria) o;
        return java.util.Objects.equals(this.sourceAddress, other.sourceAddress)
                && java.util.Objects.equals(this.destinationAddress, other.destinationAddress)
                && java.util.Objects.equals(this.service, other.service)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceAddress == null ? 43 : this.sourceAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationAddress == null
                                ? 43
                                : this.destinationAddress.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
