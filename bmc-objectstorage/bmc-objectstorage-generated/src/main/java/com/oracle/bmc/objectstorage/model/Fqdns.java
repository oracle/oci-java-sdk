/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The object representing FQDN details formed using prefix and additionalPrefixes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Fqdns.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Fqdns extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"prefixFqdns", "additionalPrefixesFqdns"})
    public Fqdns(
            PrefixFqdns prefixFqdns, java.util.Map<String, PrefixFqdns> additionalPrefixesFqdns) {
        super();
        this.prefixFqdns = prefixFqdns;
        this.additionalPrefixesFqdns = additionalPrefixesFqdns;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("prefixFqdns")
        private PrefixFqdns prefixFqdns;

        public Builder prefixFqdns(PrefixFqdns prefixFqdns) {
            this.prefixFqdns = prefixFqdns;
            this.__explicitlySet__.add("prefixFqdns");
            return this;
        }
        /**
         * An object containing FQDNs formed using additionalPrefixes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixesFqdns")
        private java.util.Map<String, PrefixFqdns> additionalPrefixesFqdns;

        /**
         * An object containing FQDNs formed using additionalPrefixes.
         *
         * @param additionalPrefixesFqdns the value to set
         * @return this builder
         **/
        public Builder additionalPrefixesFqdns(
                java.util.Map<String, PrefixFqdns> additionalPrefixesFqdns) {
            this.additionalPrefixesFqdns = additionalPrefixesFqdns;
            this.__explicitlySet__.add("additionalPrefixesFqdns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Fqdns build() {
            Fqdns model = new Fqdns(this.prefixFqdns, this.additionalPrefixesFqdns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Fqdns model) {
            if (model.wasPropertyExplicitlySet("prefixFqdns")) {
                this.prefixFqdns(model.getPrefixFqdns());
            }
            if (model.wasPropertyExplicitlySet("additionalPrefixesFqdns")) {
                this.additionalPrefixesFqdns(model.getAdditionalPrefixesFqdns());
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

    @com.fasterxml.jackson.annotation.JsonProperty("prefixFqdns")
    private final PrefixFqdns prefixFqdns;

    public PrefixFqdns getPrefixFqdns() {
        return prefixFqdns;
    }

    /**
     * An object containing FQDNs formed using additionalPrefixes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixesFqdns")
    private final java.util.Map<String, PrefixFqdns> additionalPrefixesFqdns;

    /**
     * An object containing FQDNs formed using additionalPrefixes.
     *
     * @return the value
     **/
    public java.util.Map<String, PrefixFqdns> getAdditionalPrefixesFqdns() {
        return additionalPrefixesFqdns;
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
        sb.append("Fqdns(");
        sb.append("super=").append(super.toString());
        sb.append("prefixFqdns=").append(String.valueOf(this.prefixFqdns));
        sb.append(", additionalPrefixesFqdns=")
                .append(String.valueOf(this.additionalPrefixesFqdns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Fqdns)) {
            return false;
        }

        Fqdns other = (Fqdns) o;
        return java.util.Objects.equals(this.prefixFqdns, other.prefixFqdns)
                && java.util.Objects.equals(
                        this.additionalPrefixesFqdns, other.additionalPrefixesFqdns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.prefixFqdns == null ? 43 : this.prefixFqdns.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalPrefixesFqdns == null
                                ? 43
                                : this.additionalPrefixesFqdns.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
