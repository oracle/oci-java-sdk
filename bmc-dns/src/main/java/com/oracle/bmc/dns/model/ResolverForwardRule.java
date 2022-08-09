/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
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
    builder = ResolverForwardRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResolverForwardRule extends ResolverRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("clientAddressConditions")
        private java.util.List<String> clientAddressConditions;

        public Builder clientAddressConditions(java.util.List<String> clientAddressConditions) {
            this.clientAddressConditions = clientAddressConditions;
            this.__explicitlySet__.add("clientAddressConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("qnameCoverConditions")
        private java.util.List<String> qnameCoverConditions;

        public Builder qnameCoverConditions(java.util.List<String> qnameCoverConditions) {
            this.qnameCoverConditions = qnameCoverConditions;
            this.__explicitlySet__.add("qnameCoverConditions");
            return this;
        }
        /**
         * IP addresses to which queries should be forwarded. Currently limited to a single address.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationAddresses")
        private java.util.List<String> destinationAddresses;

        /**
         * IP addresses to which queries should be forwarded. Currently limited to a single address.
         *
         * @param destinationAddresses the value to set
         * @return this builder
         **/
        public Builder destinationAddresses(java.util.List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            this.__explicitlySet__.add("destinationAddresses");
            return this;
        }
        /**
         * Case-insensitive name of an endpoint, that is a sub-resource of the resolver, to use as the forwarding
         * interface. The endpoint must have isForwarding set to true.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpointName")
        private String sourceEndpointName;

        /**
         * Case-insensitive name of an endpoint, that is a sub-resource of the resolver, to use as the forwarding
         * interface. The endpoint must have isForwarding set to true.
         *
         * @param sourceEndpointName the value to set
         * @return this builder
         **/
        public Builder sourceEndpointName(String sourceEndpointName) {
            this.sourceEndpointName = sourceEndpointName;
            this.__explicitlySet__.add("sourceEndpointName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolverForwardRule build() {
            ResolverForwardRule model =
                    new ResolverForwardRule(
                            this.clientAddressConditions,
                            this.qnameCoverConditions,
                            this.destinationAddresses,
                            this.sourceEndpointName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolverForwardRule model) {
            if (model.wasPropertyExplicitlySet("clientAddressConditions")) {
                this.clientAddressConditions(model.getClientAddressConditions());
            }
            if (model.wasPropertyExplicitlySet("qnameCoverConditions")) {
                this.qnameCoverConditions(model.getQnameCoverConditions());
            }
            if (model.wasPropertyExplicitlySet("destinationAddresses")) {
                this.destinationAddresses(model.getDestinationAddresses());
            }
            if (model.wasPropertyExplicitlySet("sourceEndpointName")) {
                this.sourceEndpointName(model.getSourceEndpointName());
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

    @Deprecated
    public ResolverForwardRule(
            java.util.List<String> clientAddressConditions,
            java.util.List<String> qnameCoverConditions,
            java.util.List<String> destinationAddresses,
            String sourceEndpointName) {
        super(clientAddressConditions, qnameCoverConditions);
        this.destinationAddresses = destinationAddresses;
        this.sourceEndpointName = sourceEndpointName;
    }

    /**
     * IP addresses to which queries should be forwarded. Currently limited to a single address.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAddresses")
    private final java.util.List<String> destinationAddresses;

    /**
     * IP addresses to which queries should be forwarded. Currently limited to a single address.
     *
     * @return the value
     **/
    public java.util.List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    /**
     * Case-insensitive name of an endpoint, that is a sub-resource of the resolver, to use as the forwarding
     * interface. The endpoint must have isForwarding set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpointName")
    private final String sourceEndpointName;

    /**
     * Case-insensitive name of an endpoint, that is a sub-resource of the resolver, to use as the forwarding
     * interface. The endpoint must have isForwarding set to true.
     *
     * @return the value
     **/
    public String getSourceEndpointName() {
        return sourceEndpointName;
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
        sb.append("ResolverForwardRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationAddresses=").append(String.valueOf(this.destinationAddresses));
        sb.append(", sourceEndpointName=").append(String.valueOf(this.sourceEndpointName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolverForwardRule)) {
            return false;
        }

        ResolverForwardRule other = (ResolverForwardRule) o;
        return java.util.Objects.equals(this.destinationAddresses, other.destinationAddresses)
                && java.util.Objects.equals(this.sourceEndpointName, other.sourceEndpointName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationAddresses == null
                                ? 43
                                : this.destinationAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEndpointName == null
                                ? 43
                                : this.sourceEndpointName.hashCode());
        return result;
    }
}
