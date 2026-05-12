/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Replaces the entire value of the selected VCN IPv6 CIDR field with the specified final state. For
 * CIDR list selections (for example, {@code ipv6PrivateCidrBlocks}, {@code byoipv6CidrDetails}),
 * the supplied array is treated as the authoritative set of CIDRs for that field: * CIDRs present
 * in both the existing list and the new list remain unchanged. * CIDRs present in the existing list
 * but not in the new list are removed. * CIDRs present in the new list but not in the existing list
 * are added. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchVcnReplaceInstruction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchVcnReplaceInstruction extends PatchVcnInstruction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("selection")
        private String selection;

        public Builder selection(String selection) {
            this.selection = selection;
            this.__explicitlySet__.add("selection");
            return this;
        }
        /**
         * The desired final IPv6 CIDR value(s) to apply to the selected field. This field must
         * always be a JSON object. For fields that take a single CIDR (for example, {@code
         * ipv6CidrBlock}), specify the CIDR. For fields that take multiple CIDRs (for example,
         * {@code ipv6PrivateCidrBlocks},{@code byoipv6CidrDetails}), specify the full desired list.
         * Examples: - { "operation": "REPLACE", "selection": "ipv6PrivateCidrBlocks", "value": {
         * "cidrs": [ "fd00:1000:0:1::/64", "fd00:1000:0:2::/64" ] } } - { "operation": "REPLACE",
         * "selection": "ipv6CidrBlock", "value": { "cidr": "2001:db8:1234:1111::/64" } }
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Object value;

        /**
         * The desired final IPv6 CIDR value(s) to apply to the selected field. This field must
         * always be a JSON object. For fields that take a single CIDR (for example, {@code
         * ipv6CidrBlock}), specify the CIDR. For fields that take multiple CIDRs (for example,
         * {@code ipv6PrivateCidrBlocks},{@code byoipv6CidrDetails}), specify the full desired list.
         * Examples: - { "operation": "REPLACE", "selection": "ipv6PrivateCidrBlocks", "value": {
         * "cidrs": [ "fd00:1000:0:1::/64", "fd00:1000:0:2::/64" ] } } - { "operation": "REPLACE",
         * "selection": "ipv6CidrBlock", "value": { "cidr": "2001:db8:1234:1111::/64" } }
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Object value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchVcnReplaceInstruction build() {
            PatchVcnReplaceInstruction model =
                    new PatchVcnReplaceInstruction(this.selection, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchVcnReplaceInstruction model) {
            if (model.wasPropertyExplicitlySet("selection")) {
                this.selection(model.getSelection());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
    public PatchVcnReplaceInstruction(String selection, Object value) {
        super(selection);
        this.value = value;
    }

    /**
     * The desired final IPv6 CIDR value(s) to apply to the selected field. This field must always
     * be a JSON object. For fields that take a single CIDR (for example, {@code ipv6CidrBlock}),
     * specify the CIDR. For fields that take multiple CIDRs (for example, {@code
     * ipv6PrivateCidrBlocks},{@code byoipv6CidrDetails}), specify the full desired list. Examples:
     * - { "operation": "REPLACE", "selection": "ipv6PrivateCidrBlocks", "value": { "cidrs": [
     * "fd00:1000:0:1::/64", "fd00:1000:0:2::/64" ] } } - { "operation": "REPLACE", "selection":
     * "ipv6CidrBlock", "value": { "cidr": "2001:db8:1234:1111::/64" } }
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Object value;

    /**
     * The desired final IPv6 CIDR value(s) to apply to the selected field. This field must always
     * be a JSON object. For fields that take a single CIDR (for example, {@code ipv6CidrBlock}),
     * specify the CIDR. For fields that take multiple CIDRs (for example, {@code
     * ipv6PrivateCidrBlocks},{@code byoipv6CidrDetails}), specify the full desired list. Examples:
     * - { "operation": "REPLACE", "selection": "ipv6PrivateCidrBlocks", "value": { "cidrs": [
     * "fd00:1000:0:1::/64", "fd00:1000:0:2::/64" ] } } - { "operation": "REPLACE", "selection":
     * "ipv6CidrBlock", "value": { "cidr": "2001:db8:1234:1111::/64" } }
     *
     * @return the value
     */
    public Object getValue() {
        return value;
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
        sb.append("PatchVcnReplaceInstruction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchVcnReplaceInstruction)) {
            return false;
        }

        PatchVcnReplaceInstruction other = (PatchVcnReplaceInstruction) o;
        return java.util.Objects.equals(this.value, other.value) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
