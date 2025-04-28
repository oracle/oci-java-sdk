/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The UI properties of the object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UIProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UIProperties extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"coordinateX", "coordinateY"})
    public UIProperties(java.math.BigDecimal coordinateX, java.math.BigDecimal coordinateY) {
        super();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The X coordinate of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinateX")
        private java.math.BigDecimal coordinateX;

        /**
         * The X coordinate of the object.
         *
         * @param coordinateX the value to set
         * @return this builder
         */
        public Builder coordinateX(java.math.BigDecimal coordinateX) {
            this.coordinateX = coordinateX;
            this.__explicitlySet__.add("coordinateX");
            return this;
        }
        /** The Y coordinate of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinateY")
        private java.math.BigDecimal coordinateY;

        /**
         * The Y coordinate of the object.
         *
         * @param coordinateY the value to set
         * @return this builder
         */
        public Builder coordinateY(java.math.BigDecimal coordinateY) {
            this.coordinateY = coordinateY;
            this.__explicitlySet__.add("coordinateY");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UIProperties build() {
            UIProperties model = new UIProperties(this.coordinateX, this.coordinateY);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UIProperties model) {
            if (model.wasPropertyExplicitlySet("coordinateX")) {
                this.coordinateX(model.getCoordinateX());
            }
            if (model.wasPropertyExplicitlySet("coordinateY")) {
                this.coordinateY(model.getCoordinateY());
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

    /** The X coordinate of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateX")
    private final java.math.BigDecimal coordinateX;

    /**
     * The X coordinate of the object.
     *
     * @return the value
     */
    public java.math.BigDecimal getCoordinateX() {
        return coordinateX;
    }

    /** The Y coordinate of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateY")
    private final java.math.BigDecimal coordinateY;

    /**
     * The Y coordinate of the object.
     *
     * @return the value
     */
    public java.math.BigDecimal getCoordinateY() {
        return coordinateY;
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
        sb.append("UIProperties(");
        sb.append("super=").append(super.toString());
        sb.append("coordinateX=").append(String.valueOf(this.coordinateX));
        sb.append(", coordinateY=").append(String.valueOf(this.coordinateY));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UIProperties)) {
            return false;
        }

        UIProperties other = (UIProperties) o;
        return java.util.Objects.equals(this.coordinateX, other.coordinateX)
                && java.util.Objects.equals(this.coordinateY, other.coordinateY)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.coordinateX == null ? 43 : this.coordinateX.hashCode());
        result = (result * PRIME) + (this.coordinateY == null ? 43 : this.coordinateY.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
