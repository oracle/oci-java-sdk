/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * A NormalizedVertex is a cartesian coordinate that represents a corner between two segments of a polygon.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NormalizedVertex.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NormalizedVertex {
    @Deprecated
    @java.beans.ConstructorProperties({"x", "y"})
    public NormalizedVertex(Float x, Float y) {
        super();
        this.x = x;
        this.y = y;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The X axis coordinate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("x")
        private Float x;

        /**
         * The X axis coordinate.
         * @param x the value to set
         * @return this builder
         **/
        public Builder x(Float x) {
            this.x = x;
            this.__explicitlySet__.add("x");
            return this;
        }
        /**
         * The Y axis coordinate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("y")
        private Float y;

        /**
         * The Y axis coordinate.
         * @param y the value to set
         * @return this builder
         **/
        public Builder y(Float y) {
            this.y = y;
            this.__explicitlySet__.add("y");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NormalizedVertex build() {
            NormalizedVertex __instance__ = new NormalizedVertex(x, y);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NormalizedVertex o) {
            Builder copiedBuilder = x(o.getX()).y(o.getY());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The X axis coordinate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("x")
    private final Float x;

    /**
     * The X axis coordinate.
     * @return the value
     **/
    public Float getX() {
        return x;
    }

    /**
     * The Y axis coordinate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("y")
    private final Float y;

    /**
     * The Y axis coordinate.
     * @return the value
     **/
    public Float getY() {
        return y;
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
        sb.append("NormalizedVertex(");
        sb.append("x=").append(String.valueOf(this.x));
        sb.append(", y=").append(String.valueOf(this.y));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NormalizedVertex)) {
            return false;
        }

        NormalizedVertex other = (NormalizedVertex) o;
        return java.util.Objects.equals(this.x, other.x)
                && java.util.Objects.equals(this.y, other.y)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.x == null ? 43 : this.x.hashCode());
        result = (result * PRIME) + (this.y == null ? 43 : this.y.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
