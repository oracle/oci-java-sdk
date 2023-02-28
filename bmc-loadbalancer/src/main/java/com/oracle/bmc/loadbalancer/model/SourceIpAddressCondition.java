/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A rule condition that checks client source IP against specified IP address or address range. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SourceIpAddressCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attributeName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SourceIpAddressCondition extends RuleCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An IPv4 or IPv6 address range that the source IP address of an incoming packet must
         * match.
         *
         * <p>The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y or
         * x:x::x/y) strings.
         *
         * <p>Specify 0.0.0.0/0 or ::/0 to match all incoming traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
        private String attributeValue;

        /**
         * An IPv4 or IPv6 address range that the source IP address of an incoming packet must
         * match.
         *
         * <p>The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y or
         * x:x::x/y) strings.
         *
         * <p>Specify 0.0.0.0/0 or ::/0 to match all incoming traffic.
         *
         * @param attributeValue the value to set
         * @return this builder
         */
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            this.__explicitlySet__.add("attributeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceIpAddressCondition build() {
            SourceIpAddressCondition model = new SourceIpAddressCondition(this.attributeValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceIpAddressCondition model) {
            if (model.wasPropertyExplicitlySet("attributeValue")) {
                this.attributeValue(model.getAttributeValue());
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

    @Deprecated
    public SourceIpAddressCondition(String attributeValue) {
        super();
        this.attributeValue = attributeValue;
    }

    /**
     * An IPv4 or IPv6 address range that the source IP address of an incoming packet must match.
     *
     * <p>The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y or
     * x:x::x/y) strings.
     *
     * <p>Specify 0.0.0.0/0 or ::/0 to match all incoming traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
    private final String attributeValue;

    /**
     * An IPv4 or IPv6 address range that the source IP address of an incoming packet must match.
     *
     * <p>The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y or
     * x:x::x/y) strings.
     *
     * <p>Specify 0.0.0.0/0 or ::/0 to match all incoming traffic.
     *
     * @return the value
     */
    public String getAttributeValue() {
        return attributeValue;
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
        sb.append("SourceIpAddressCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", attributeValue=").append(String.valueOf(this.attributeValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceIpAddressCondition)) {
            return false;
        }

        SourceIpAddressCondition other = (SourceIpAddressCondition) o;
        return java.util.Objects.equals(this.attributeValue, other.attributeValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.attributeValue == null ? 43 : this.attributeValue.hashCode());
        return result;
    }
}
