/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An IPAM refers to a group of VCNs, subnets, IP resources
 *  and its related properties.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Ipam.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Ipam extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"placeholder"})
    public Ipam(String placeholder) {
        super();
        this.placeholder = placeholder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Placeholder for description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
        private String placeholder;

        /**
         * Placeholder for description
         * @param placeholder the value to set
         * @return this builder
         **/
        public Builder placeholder(String placeholder) {
            this.placeholder = placeholder;
            this.__explicitlySet__.add("placeholder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ipam build() {
            Ipam model = new Ipam(this.placeholder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ipam model) {
            if (model.wasPropertyExplicitlySet("placeholder")) {
                this.placeholder(model.getPlaceholder());
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
     * Placeholder for description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
    private final String placeholder;

    /**
     * Placeholder for description
     * @return the value
     **/
    public String getPlaceholder() {
        return placeholder;
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
        sb.append("Ipam(");
        sb.append("super=").append(super.toString());
        sb.append("placeholder=").append(String.valueOf(this.placeholder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ipam)) {
            return false;
        }

        Ipam other = (Ipam) o;
        return java.util.Objects.equals(this.placeholder, other.placeholder) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.placeholder == null ? 43 : this.placeholder.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
