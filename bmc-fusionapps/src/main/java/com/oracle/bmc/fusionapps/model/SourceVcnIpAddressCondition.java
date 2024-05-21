/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * An access control rule condition that requires a match on the specified source VCN and IP address range.
 * This condition must be used only in conjunction with {@code SourceVcnIdCondition}.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SourceVcnIpAddressCondition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attributeName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SourceVcnIpAddressCondition extends RuleCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An IPv4 address range that the original client IP address (in the context of the specified VCN) of an
         * incoming packet must match.
         * The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y) strings.
         * Specify 0.0.0.0/0 to match all incoming traffic in the customer VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
        private String attributeValue;

        /**
         * An IPv4 address range that the original client IP address (in the context of the specified VCN) of an
         * incoming packet must match.
         * The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y) strings.
         * Specify 0.0.0.0/0 to match all incoming traffic in the customer VCN.
         *
         * @param attributeValue the value to set
         * @return this builder
         **/
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            this.__explicitlySet__.add("attributeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceVcnIpAddressCondition build() {
            SourceVcnIpAddressCondition model =
                    new SourceVcnIpAddressCondition(this.attributeValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceVcnIpAddressCondition model) {
            if (model.wasPropertyExplicitlySet("attributeValue")) {
                this.attributeValue(model.getAttributeValue());
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
    public SourceVcnIpAddressCondition(String attributeValue) {
        super();
        this.attributeValue = attributeValue;
    }

    /**
     * An IPv4 address range that the original client IP address (in the context of the specified VCN) of an
     * incoming packet must match.
     * The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y) strings.
     * Specify 0.0.0.0/0 to match all incoming traffic in the customer VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
    private final String attributeValue;

    /**
     * An IPv4 address range that the original client IP address (in the context of the specified VCN) of an
     * incoming packet must match.
     * The service accepts only classless inter-domain routing (CIDR) format (x.x.x.x/y) strings.
     * Specify 0.0.0.0/0 to match all incoming traffic in the customer VCN.
     *
     * @return the value
     **/
    public String getAttributeValue() {
        return attributeValue;
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
        sb.append("SourceVcnIpAddressCondition(");
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
        if (!(o instanceof SourceVcnIpAddressCondition)) {
            return false;
        }

        SourceVcnIpAddressCondition other = (SourceVcnIpAddressCondition) o;
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
