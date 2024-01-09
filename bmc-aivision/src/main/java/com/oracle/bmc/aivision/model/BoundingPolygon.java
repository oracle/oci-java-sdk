/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The object-bounding polygon box. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BoundingPolygon.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BoundingPolygon
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"normalizedVertices"})
    public BoundingPolygon(java.util.List<NormalizedVertex> normalizedVertices) {
        super();
        this.normalizedVertices = normalizedVertices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of normalized points defining the polygon's perimeter, with an implicit segment
         * between subsequent points and between the first and last point. Rectangles are defined
         * with four points. For example, {@code [{"x": 0, "y": 0}, {"x": 1, "y": 0}, {"x": 1, "y":
         * 0.5}, {"x": 0, "y": 0.5}]} represents the top half of an image.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("normalizedVertices")
        private java.util.List<NormalizedVertex> normalizedVertices;

        /**
         * An array of normalized points defining the polygon's perimeter, with an implicit segment
         * between subsequent points and between the first and last point. Rectangles are defined
         * with four points. For example, {@code [{"x": 0, "y": 0}, {"x": 1, "y": 0}, {"x": 1, "y":
         * 0.5}, {"x": 0, "y": 0.5}]} represents the top half of an image.
         *
         * @param normalizedVertices the value to set
         * @return this builder
         */
        public Builder normalizedVertices(java.util.List<NormalizedVertex> normalizedVertices) {
            this.normalizedVertices = normalizedVertices;
            this.__explicitlySet__.add("normalizedVertices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BoundingPolygon build() {
            BoundingPolygon model = new BoundingPolygon(this.normalizedVertices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BoundingPolygon model) {
            if (model.wasPropertyExplicitlySet("normalizedVertices")) {
                this.normalizedVertices(model.getNormalizedVertices());
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
     * An array of normalized points defining the polygon's perimeter, with an implicit segment
     * between subsequent points and between the first and last point. Rectangles are defined with
     * four points. For example, {@code [{"x": 0, "y": 0}, {"x": 1, "y": 0}, {"x": 1, "y": 0.5},
     * {"x": 0, "y": 0.5}]} represents the top half of an image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("normalizedVertices")
    private final java.util.List<NormalizedVertex> normalizedVertices;

    /**
     * An array of normalized points defining the polygon's perimeter, with an implicit segment
     * between subsequent points and between the first and last point. Rectangles are defined with
     * four points. For example, {@code [{"x": 0, "y": 0}, {"x": 1, "y": 0}, {"x": 1, "y": 0.5},
     * {"x": 0, "y": 0.5}]} represents the top half of an image.
     *
     * @return the value
     */
    public java.util.List<NormalizedVertex> getNormalizedVertices() {
        return normalizedVertices;
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
        sb.append("BoundingPolygon(");
        sb.append("super=").append(super.toString());
        sb.append("normalizedVertices=").append(String.valueOf(this.normalizedVertices));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
