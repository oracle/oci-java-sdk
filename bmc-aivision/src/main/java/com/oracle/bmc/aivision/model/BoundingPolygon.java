/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The object-bounding polygon box.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BoundingPolygon.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BoundingPolygon {
    @Deprecated
    @java.beans.ConstructorProperties({"normalizedVertices"})
    public BoundingPolygon(java.util.List<NormalizedVertex> normalizedVertices) {
        super();
        this.normalizedVertices = normalizedVertices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("normalizedVertices")
        private java.util.List<NormalizedVertex> normalizedVertices;

        public Builder normalizedVertices(java.util.List<NormalizedVertex> normalizedVertices) {
            this.normalizedVertices = normalizedVertices;
            this.__explicitlySet__.add("normalizedVertices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BoundingPolygon build() {
            BoundingPolygon __instance__ = new BoundingPolygon(normalizedVertices);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BoundingPolygon o) {
            Builder copiedBuilder = normalizedVertices(o.getNormalizedVertices());

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
     * An array of normalized points defining the polygon's perimeter, with an implicit segment between subsequent points and between the first and last point.
     * Rectangles are defined with four points. For example, {@code [{"x": 0, "y": 0}, {"x": 1, "y": 0}, {"x": 1, "y": 0.5}, {"x": 0, "y": 0.5}]} represents the top half of an image.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("normalizedVertices")
    private final java.util.List<NormalizedVertex> normalizedVertices;

    public java.util.List<NormalizedVertex> getNormalizedVertices() {
        return normalizedVertices;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BoundingPolygon(");
        sb.append("normalizedVertices=").append(String.valueOf(this.normalizedVertices));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BoundingPolygon)) {
            return false;
        }

        BoundingPolygon other = (BoundingPolygon) o;
        return java.util.Objects.equals(this.normalizedVertices, other.normalizedVertices)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.normalizedVertices == null
                                ? 43
                                : this.normalizedVertices.hashCode());
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
