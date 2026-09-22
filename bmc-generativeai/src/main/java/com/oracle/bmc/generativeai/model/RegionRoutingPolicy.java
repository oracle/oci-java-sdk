/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The cross-region routing policy for the routing profile. If this policy is not specified, only
 * the local region is allowed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RegionRoutingPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegionRoutingPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedRegions"})
    public RegionRoutingPolicy(java.util.List<String> allowedRegions) {
        super();
        this.allowedRegions = allowedRegions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ordered list of regions that routing is allowed to reach. Each entry is a region
         * identifier (for example, {@code us-chicago-1}).
         *
         * <p>The order of entries is preserved. Duplicate entries are not allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedRegions")
        private java.util.List<String> allowedRegions;

        /**
         * The ordered list of regions that routing is allowed to reach. Each entry is a region
         * identifier (for example, {@code us-chicago-1}).
         *
         * <p>The order of entries is preserved. Duplicate entries are not allowed.
         *
         * @param allowedRegions the value to set
         * @return this builder
         */
        public Builder allowedRegions(java.util.List<String> allowedRegions) {
            this.allowedRegions = allowedRegions;
            this.__explicitlySet__.add("allowedRegions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegionRoutingPolicy build() {
            RegionRoutingPolicy model = new RegionRoutingPolicy(this.allowedRegions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegionRoutingPolicy model) {
            if (model.wasPropertyExplicitlySet("allowedRegions")) {
                this.allowedRegions(model.getAllowedRegions());
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

    /**
     * The ordered list of regions that routing is allowed to reach. Each entry is a region
     * identifier (for example, {@code us-chicago-1}).
     *
     * <p>The order of entries is preserved. Duplicate entries are not allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRegions")
    private final java.util.List<String> allowedRegions;

    /**
     * The ordered list of regions that routing is allowed to reach. Each entry is a region
     * identifier (for example, {@code us-chicago-1}).
     *
     * <p>The order of entries is preserved. Duplicate entries are not allowed.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedRegions() {
        return allowedRegions;
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
        sb.append("RegionRoutingPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("allowedRegions=").append(String.valueOf(this.allowedRegions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegionRoutingPolicy)) {
            return false;
        }

        RegionRoutingPolicy other = (RegionRoutingPolicy) o;
        return java.util.Objects.equals(this.allowedRegions, other.allowedRegions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedRegions == null ? 43 : this.allowedRegions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
