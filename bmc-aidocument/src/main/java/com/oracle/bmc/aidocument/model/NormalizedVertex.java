/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * An (x, y) coordinate in the image with dimensions normalized from zero to one. The origin is at
 * top left, with the positive x-axis pointing right and the positive y-axis pointing down. The
 * bottom right corner is at (1, 1). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NormalizedVertex.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NormalizedVertex
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"x", "y"})
    public NormalizedVertex(Double x, Double y) {
        super();
        this.x = x;
        this.y = y;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The X-axis normalized coordinate. */
        @com.fasterxml.jackson.annotation.JsonProperty("x")
        private Double x;

        /**
         * The X-axis normalized coordinate.
         *
         * @param x the value to set
         * @return this builder
         */
        public Builder x(Double x) {
            this.x = x;
            this.__explicitlySet__.add("x");
            return this;
        }
        /** The Y-axis normalized coordinate. */
        @com.fasterxml.jackson.annotation.JsonProperty("y")
        private Double y;

        /**
         * The Y-axis normalized coordinate.
         *
         * @param y the value to set
         * @return this builder
         */
        public Builder y(Double y) {
            this.y = y;
            this.__explicitlySet__.add("y");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NormalizedVertex build() {
            NormalizedVertex model = new NormalizedVertex(this.x, this.y);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NormalizedVertex model) {
            if (model.wasPropertyExplicitlySet("x")) {
                this.x(model.getX());
            }
            if (model.wasPropertyExplicitlySet("y")) {
                this.y(model.getY());
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

    /** The X-axis normalized coordinate. */
    @com.fasterxml.jackson.annotation.JsonProperty("x")
    private final Double x;

    /**
     * The X-axis normalized coordinate.
     *
     * @return the value
     */
    public Double getX() {
        return x;
    }

    /** The Y-axis normalized coordinate. */
    @com.fasterxml.jackson.annotation.JsonProperty("y")
    private final Double y;

    /**
     * The Y-axis normalized coordinate.
     *
     * @return the value
     */
    public Double getY() {
        return y;
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
        sb.append("NormalizedVertex(");
        sb.append("super=").append(super.toString());
        sb.append("x=").append(String.valueOf(this.x));
        sb.append(", y=").append(String.valueOf(this.y));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.x == null ? 43 : this.x.hashCode());
        result = (result * PRIME) + (this.y == null ? 43 : this.y.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
