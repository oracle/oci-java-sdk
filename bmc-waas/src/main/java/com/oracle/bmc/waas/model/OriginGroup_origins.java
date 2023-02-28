/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OriginGroup_origins.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OriginGroup_origins
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"origin", "weight"})
    public OriginGroup_origins(String origin, Integer weight) {
        super();
        this.origin = origin;
        this.weight = weight;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The IP address or CIDR notation of the origin server. */
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private String origin;

        /**
         * The IP address or CIDR notation of the origin server.
         *
         * @param origin the value to set
         * @return this builder
         */
        public Builder origin(String origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }
        /**
         * The weight of the origin used in load balancing. Origins with higher weights will receive
         * larger proportions of client requests.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * The weight of the origin used in load balancing. Origins with higher weights will receive
         * larger proportions of client requests.
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OriginGroup_origins build() {
            OriginGroup_origins model = new OriginGroup_origins(this.origin, this.weight);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OriginGroup_origins model) {
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
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

    /** The IP address or CIDR notation of the origin server. */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final String origin;

    /**
     * The IP address or CIDR notation of the origin server.
     *
     * @return the value
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * The weight of the origin used in load balancing. Origins with higher weights will receive
     * larger proportions of client requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * The weight of the origin used in load balancing. Origins with higher weights will receive
     * larger proportions of client requests.
     *
     * @return the value
     */
    public Integer getWeight() {
        return weight;
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
        sb.append("OriginGroup_origins(");
        sb.append("super=").append(super.toString());
        sb.append("origin=").append(String.valueOf(this.origin));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OriginGroup_origins)) {
            return false;
        }

        OriginGroup_origins other = (OriginGroup_origins) o;
        return java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.weight, other.weight)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
